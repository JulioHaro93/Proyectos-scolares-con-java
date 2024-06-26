/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Modelo.Empleado;
import Modelo.Medicamento;
import Modelo.Paciente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class OperacionBD {
    
     private static final String USUARIO = "root";
    private static final String PSWD = "sasa";
    private static final String BD = "hospital";
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private Connection conexion;
        
        public OperacionBD(){}
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
        
        
        public ArrayList<Empleado> mostrarEmpleados(){
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        Statement st;
        try {
        st = conexion.createStatement();
    
        String query="SELECT * FROM empleados";
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){
            empleados.add(new Empleado (rs.getString("empleadoNum"), 
                    rs.getString("nombre"), rs.getInt("edad"), rs.getString("sexo"), rs.getDouble("salario")));
            
            Empleado e = new Empleado();
            e.setEmpleadoNum(rs.getString("empleadoNum"));
            e.setNombre(rs.getString("nombre"));
            e.setEdad(rs.getInt("edad"));
            e.setSexo(rs.getString("sexo"));
            e.setSalario(rs.getDouble("salario"));
            
            empleados.add(e);
            
        }
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        
        return empleados;
        }
        public ArrayList<Medicamento> mostrarMedicamentos(){
        ArrayList<Medicamento> medicamentos = new ArrayList<>();
        
        Statement st;
        try {
        st = conexion.createStatement();
    
        String query="SELECT * FROM medicamentos";
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){
            medicamentos.add(new Medicamento (rs.getString("clave"), 
                    rs.getString("nombreCom"), rs.getString("principioAct"), rs.getString("presentacion"), rs.getString("toma")));
            
            Medicamento m = new Medicamento();
            m.setClave(rs.getString("clave"));
            m.setNombreCom(rs.getString("nombreCom"));
            m.setPrincipioAct(rs.getString("principioAct"));
            m.setPresentacion(rs.getString("presentacion"));
            m.setToma(rs.getString("toma"));
            
            medicamentos.add(m);
            
        }
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        
        return medicamentos;
        }
        public ArrayList<Paciente> mostrarPacientes(){
        ArrayList<Paciente> pacientes = new ArrayList<>();
        
        Statement st;
        try {
        st = conexion.createStatement();
    
        String query="SELECT * FROM pacientes";
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){
            pacientes.add(new Paciente (rs.getString("nss"), rs.getString("nombre"), rs.getString("padecimiento")));
            
            Paciente p = new Paciente();
            p.setNss(rs.getString("nss"));
            p.setNombre(rs.getString("nombre"));
            p.setPadecimiento(rs.getString("padecimiento"));
            
            
            pacientes.add(p);
            
        }
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        
        return pacientes;
        }
        public void desconectar(){
        
        try {
            conexion.close();
            System.out.println("Desconectado");
        } catch (SQLException ex) {
           System.out.println("Error 1 "+ ex.getMessage());
        }
    }
        
    public ArrayList<Paciente> ordenarPaciente() {
        
        ArrayList<Paciente> pacientes = new ArrayList<>();
        
        Statement st;
        try {
        st = conexion.createStatement();
        
        
        String b = "order by nss";
        String query = "SELECT * FROM pacientes " + b;
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){
            Paciente pa = new  Paciente();
            pa.setNss(rs.getString("nss"));
            pa.setNombre(rs.getString("nombre"));
            pa.setPadecimiento(rs.getString("padecimiento"));
            
            pacientes.add(pa);
        }
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        return pacientes;     
    }
    
    public ArrayList<Medicamento> ordenarMedicamentos() {
        
        ArrayList<Medicamento> medicamentos = new ArrayList<>();
        
        Statement st;
        try {
        st = conexion.createStatement();
        
        
        String b = "order by presentacion";
        String query = "SELECT * FROM medicamentos " + b;
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){
            Medicamento medi = new  Medicamento();
            medi.setClave(rs.getString("clave"));
            medi.setNombreCom(rs.getString("nombreCom"));
            medi.setPrincipioAct(rs.getString("principioAct"));
            medi.setPresentacion(rs.getString("presentacion"));
            medi.setToma(rs.getString("toma"));
        
            
            medicamentos.add(medi);
        }
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        return medicamentos;     
    }
    
    public ArrayList<Empleado> ordenarEmpleados() {
        
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        Statement st;
        try {
        st = conexion.createStatement();
        
        
        String b = "order by empleadoNum";
        String query = "SELECT * FROM pacientes " + b;
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){
            Empleado emp = new  Empleado();
            emp.setEmpleadoNum(rs.getString("empleadoNum"));
            emp.setNombre(rs.getString("nombre"));
            emp.setSexo(rs.getString("sexo"));
            emp.setEdad(rs.getInt("edad"));
            emp.setSalario(rs.getDouble("salario"));
            
            
            empleados.add(emp);
        }
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        return empleados;
    }
    public ArrayList<Empleado> ordenarEmpleadosPorSalario() {
        
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        Statement st;
        try {
        st = conexion.createStatement();
        
        
        String b = "order by salario";
        String query = "SELECT * FROM empleados " + b;
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){
            Empleado emp = new  Empleado();
            emp.setEmpleadoNum(rs.getString("empleadoNum"));
            emp.setNombre(rs.getString("nombre"));
            emp.setSexo(rs.getString("sexo"));
            emp.setEdad(rs.getInt("edad"));
            emp.setSalario(rs.getDouble("salario"));
            
            
            empleados.add(emp);
        }
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        return empleados;
    }
    public int extraerEdades(){
        int sumador =0;
        int a =0;
        
        ArrayList<Integer> emp = new ArrayList<>();
        
        Statement st;
        
        try{
            st = conexion.createStatement();
            String query = "SELECT edad FROM empleados ";
            ResultSet rs = st.executeQuery(query);
                while(rs.next()){
                    
                    a =rs.getInt("edad");
                    emp.add(a);
                }
        }catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage());
        }
        for(int i = 0; i < emp.size(); i++){
            sumador += emp.get(i);
            
        }
        System.out.println("sumador: "+ sumador);
        System.out.println("array emp: "+ emp);
        return sumador;
    }
    public boolean eliminarEmpleado(String empleadoNum){
        boolean estado= false;
        
        Statement consultaSQL;
        
        String q = "DELETE FROM empleados WHERE empleadoNum=" + "'" + empleadoNum + "'";
        
        try {
            consultaSQL = conexion.createStatement();
            consultaSQL.execute(q);
            
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        
        return estado;
    }
    public boolean eliminarPaciente(String nss){
        boolean estado= false;
        
        Statement consultaSQL;
        
        String q = "DELETE FROM pacientes WHERE mss=" + "'" + nss + "'";
        
        try {
            consultaSQL = conexion.createStatement();
            consultaSQL.execute(q);
            
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        
        return estado;
    }
    
    public boolean eliminarMedicamento(String clave){
        boolean estado= false;
        
        Statement consultaSQL;
        
        String q = "DELETE FROM medicamentos WHERE clave =" + "'" + clave + "'";
        
        try {
            consultaSQL = conexion.createStatement();
            consultaSQL.execute(q);
            
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        
        return estado;
    }
    
    //Falta agregar empleado, agregar medicamento y agregar paciente
    public boolean agregarEmpleado(Empleado empleado){
         boolean estado = false;
         
         Statement consultaSQL;
         
         String q = "Insert INTO empleados VALUES('" + empleado.getEmpleadoNum() + "','" + empleado.getNombre() + "',"
                 + empleado.getEdad() + ",'" + empleado.getSexo()+ "','"+ empleado.getSalario() + "')"; 
         
        try {
            consultaSQL = conexion.createStatement();
            consultaSQL.execute(q);
            estado = true;
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
         
         return estado;
     }
    
    public boolean agregarMedicamento(Medicamento medicamento){
         boolean estado = false;
         
         Statement consultaSQL;
         
         String q = "Insert INTO medicamentos VALUES('" + medicamento.getClave() + "','" + medicamento.getNombreCom() + "',"
                 + medicamento.getPrincipioAct() + ",'" + medicamento.getPresentacion() + "','"+ medicamento.getToma() + "')"; 
         
        try {
            consultaSQL = conexion.createStatement();
            consultaSQL.execute(q);
            estado = true;
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
         
         return estado;
     }
    
    public boolean agregarPaciente(Paciente paciente){
         boolean estado = false;
         
         Statement consultaSQL;
         
         String q = "Insert INTO pacientes VALUES('" + paciente.getNss() + "','" + paciente.getNombre() + "',"
                 + paciente.getPadecimiento() + ",'" + "')"; 
         
        try {
            consultaSQL = conexion.createStatement();
            consultaSQL.execute(q);
            estado = true;
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
         
         return estado;
     }
}
