/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Cuenta;

/**
 *
 * @author Alumno
 */
public class OperacionBD {
    
    private static final String USUARIO="root";
    private static final String CONTRA="sasa";
    private static final String BD="empresas";
    private static final String URL="jdbc:mysql://localhost:3306/";
    private Connection conexion;
    
    public boolean conectar(){
        boolean estado=false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=DriverManager.getConnection(URL+BD, USUARIO, CONTRA);
            if(conexion!=null)
                estado=true;
        } catch (ClassNotFoundException ex) {
            System.out.println("Error 1"+ex.getMessage());
        } catch (SQLException ex) {
           System.out.println("Error 2"+ex.getMessage());
        }
        return estado;
   
    }
    
        public void desconectar(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error 1"+ex.getMessage());
        }
    }
        
            public ArrayList<Cuenta> agregarCuentas() {
        
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        
        Statement st;
        try {
        st = conexion.createStatement();
        
        
        String b = "order by saldo desc";
        String query = "SELECT * FROM sucursales " + b;
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){
            Cuenta c = new Cuenta();
            c.setNumCuenta(rs.getString("numCuenta"));
            c.setNombreCuentahabiente(rs.getString("nombreCuentahabiente"));
            c.setSaldo(rs.getDouble("saldo"));
            c.setSucursalApertura(rs.getString("sucursalApertura"));
            
            cuentas.add(c);
        }
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        return cuentas;
    }

        
        public ArrayList<Cuenta> listaAzcSuc() throws SQLException {
        ArrayList<Cuenta> cuentas= new ArrayList<>(); 
        String query="SELECT saldo FROM sucursales WHERE sucursalApertura = 'AZC'";
        Statement sentencia= conexion.prepareStatement(query);
        try{
            //PreparedStatement sentencia= conexion.prepareStatement(query);
            ResultSet rs;
            rs=sentencia.executeQuery(query);
            while(rs.next()){
                Cuenta cn= new Cuenta();
                cn.setSaldo(rs.getDouble("saldo"));
                //cn.setSucursalApertura(rs.getString("sucursalApertura"));
                cuentas.add(cn);
                
            }         
        }   catch(SQLException ex){
                System.out.println("Error 1" + ex.getMessage());
                }
        return cuentas;
    }
        public boolean agregarCuentas(Cuenta cuenta){
            boolean estado = false;

            Statement consultaSQL;

            String q = "Insert INTO sucursales VALUES('" + cuenta.getNumCuenta() + "','" + cuenta.getNombreCuentahabiente() + "',"
                    + cuenta.getSaldo() + ",'" + cuenta.getSucursalApertura() + "')"; 

            try {
                consultaSQL = conexion.createStatement();
                consultaSQL.execute(q);
                estado = true;
            }catch (SQLException ex) {
                   System.out.println("Error: "+ex.getMessage());
               }
         
         return estado;
        }
        
        public boolean actualizarSucursalCuenta(String cuenta, String sucursal){
            boolean estado = false;

            Statement consultaSQL;

            String q = "UPDATE cuentas SET sucursalApertura= " + "'" + sucursal + "'" +
                    "WHERE numcuenta= " + "'" + cuenta + "'";

               try {
                   consultaSQL = conexion.createStatement();
                   int r = consultaSQL.executeUpdate(q);

                   if(r != 0)
                       estado = true;
               } catch (SQLException ex) {
                   System.out.println("Error: "+ex.getMessage());
               }

            return estado;
           }
    /**
     * 
     * @return 
     */
    public ArrayList<Cuenta> mostrarCuentas(){
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        
        Statement st;
        try {
        st = conexion.createStatement();
    
        String query="SELECT * FROM cuentas";
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){
            cuentas.add(new Cuenta (rs.getString("numCuenta"), 
                    rs.getString("nombreCuentahabiente"), (int) rs.getDouble("saldo"), 
                    rs.getString("sucursalApertura")));
            
            
        }
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        
        return cuentas;
    }
    
    
}
    
    


