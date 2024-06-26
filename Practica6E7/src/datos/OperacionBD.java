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
 * Clase llamada Operacion BD hace la conexion a la base de datos tiene las operacione CRUD y cierra la conexion.
 * @author Haro Capetillo Julio Cesar
 * @version 10/09/2022
 */
public class OperacionBD {
    
    private static final String USUARIO = "root";
    private static final String PSWD = "sasa";
    private static final String BD = "empresas";
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private Connection conexion;

    /**
     * Metodo contructor por defecto
     */
    public OperacionBD() {
    }
    
    /**
     * Metodo encargado de conectarse a la base de datos a traves de DriverManager y su metodo getConnection.
     * la conexion o hubo algun error
     * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/sql/DriverManager.html">Class DriverManager</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Connection.html">Interface Conecction</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     */
    public void conectar(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion= DriverManager.getConnection(URL+BD,USUARIO, PSWD);
       
                if(conexion != null)
                    System.out.println("Conectado");
 
        } catch (ClassNotFoundException ex) {
            System.out.println("Error 1 " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error 2 "+ ex.getMessage());
        }
        
    }
    
    /**
     * Metodo encargado de agregar un objeto cuenta a la Base de Datos
     * @param cuenta : es el objeto que se recibe.
     * @return Un booleano llamado estado que confirma o niega que se haya agregado el objeto a la base de datos.
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     */
    public boolean agregarCuenta(Cuenta cuenta){
         boolean estado = false;
         
         Statement consultaSQL;
         
         String q = "Insert INTO sucursales VALUES('" + cuenta.getNumCuenta() + "','" + cuenta.getNombreCuentahabiente() + "',"
                 + cuenta.getSaldo() + ",'" + cuenta.getSucursalApertura() + "')"; 
         
        try {
            consultaSQL = conexion.createStatement();
            consultaSQL.execute(q);
            estado = true;
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
         
         return estado;
     }
    
    /**
     * Metodo Delete que elimina un objeto de la cuenta seelccionand por el numero de cuenta
     * @param numCuenta : es el numero de cuenta que funciona como filtro para el metodo DELETE
     * @return estado que confirma si se ha eliminado o no el objeto de la base de datos.
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     */
    public boolean borrarCuentas(String numCuenta){
        boolean estado= false;
        
        Statement consultaSQL;
        
        String q = "DELETE FROM sucursales WHERE numCuenta=" + "'" + numCuenta + "'";
        
        try {
            consultaSQL = conexion.createStatement();
            consultaSQL.execute(q);
            
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        
        return estado;
    }
    
    /**
     * Metodo READ que permite obtener los datos ordenados de la base de datos.
     * @return Un arreglo de cuenta con sus atributos inicializados
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
     * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">Class ArrayList</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/ResultSet.html">Interface ResultSet</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     */
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
    
    /**
     * Metodo UPDATE encardado de actualizar la sucursal de un cliente
     * @param cuenta : parametro que recibe de tipo String
     * @param sucursal : parametro que recive que sirve como filtro para el update
     * @return un booleano que confirma o niega el que se haya actualizado el documento.
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     */
    public boolean actualizarSucursalCuenta(String cuenta, String sucursal){
     boolean estado = false;
     
     Statement consultaSQL;
     
     String q = "UPDATE sucursales SET sucursalApertura= " + "'" + sucursal + "'" +
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
     * Metodo READ que permite acceder a la base de datos completa
     * @return Un ArrayList con la base de datos completa.
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
     * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">Class ArrayList</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/ResultSet.html">Interface ResultSet</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     */
    public ArrayList<Cuenta> mostrarCuentas(){
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        
        Statement st;
        try {
        st = conexion.createStatement();
    
        String query="SELECT * FROM cuentas";
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){
            cuentas.add(new Cuenta (rs.getString("numCuenta"), rs.getString("nombreCuentahabiente"), rs.getDouble("saldo"), rs.getString("sucursalApertura")));
            
            /*Cuenta c = new Cuenta();
            c.setNumCuenta(rs.getString("numCuenta"));
            c.setNombreCuentahabiente(rs.getString("nombreCuentahabiente"));
            c.setSaldo(rs.getDouble("saldo"));
            c.setSucursalApertura(rs.getString("sucursalApertura"));
            
            cuentas.add(c);*/
        }
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        
        return cuentas;
    }
    
    /**
     * Metodo cierra la conexion con la base de datos
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     */
    public void desconectar(){
        
        try {
            conexion.close();
            System.out.println("Desconectado");
        } catch (SQLException ex) {
           System.out.println("Error 1 "+ ex.getMessage());
        }
    }     
}
