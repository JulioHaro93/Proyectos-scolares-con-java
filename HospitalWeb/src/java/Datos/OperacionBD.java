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
 * Clase que conecta con la base de datos y con las operaciones CRUD
 * @author Julio Cesar Haro Capetillo
 */
public class OperacionBD {
    
    private static final String USUARIO = "root";
    private static final String PSWD = "sasa";
    private static final String BD = "hospital";
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private Connection conexion;
        /**
         * Metodo constructor por defecto
         */
        public OperacionBD(){}
        /**
         * método que mediante el DriverManager y su metdo .getConection crea una conexion con la base de datos.
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
         * metodo que hace la peticion Read de las operaciones CRUD
         * @return un ArrayList de tipo Empleado
         * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
         * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
         * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">ArrayList</a>
         */
        
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
        /**
         * Metodo que hace la peticion Read de las operaciones CRUD con la tabla de medicamentos
         * @return un ArrayList de tipo Medicamento
         * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
         * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
         * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">ArrayList</a>
         */
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
        /**
         * metodo que realiza la operacion Read de las peticiones CRUD de la tabla pacientes de la base de datos
         * @return un ArrayList de tipo Paciente
         * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
         * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
         * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">ArrayList</a>
         */
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
        /**
         * metodo que cierra la conexión con la base de datos.
         * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
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
    
    /**
     * metodo que ordena los pacientes de a cuerdo a su numero de seguridad social NSS
     * @return un ArrayListo de tipo Paciente (ordenado por su nss)
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">ArrayList</a>
     */
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
    /**
     * metodo que ordena los medicamentos por tipo de presentación
     * @return ArrayList de tipo medicamento (ordenado por presentacion)
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">ArrayList</a>
     */
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
    /**
     * metodo que ordena los empleados de a cuerdo a su numero de Empleado
     * @return ArrayListo de tipo Empleado ordenado de a cuerdo a su numero de empleado
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">ArrayList</a>
     */
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
    /**
     * método que ordena los empleados de a cuerdo a su salario
     * @return ArrayList de tipo Empleado (ordenado de a cuerdo a su salario de menor a mayor)
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">ArrayList</a>
     */
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
    /**
     * Metodo que regresa las edades de los empleados
     * @return un entero con la suma total de las edades de los empleados
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">ArrayList</a>
     */
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
    
    /**
     * metodo que elimina un empleado de a cuerdo a su numero de Empleado
     * @param empleadoNum numero de empleado
     * @return  booleando que nos dice si se realizó o no la petición
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">ArrayList</a>
     */
    public boolean eliminarEmpleado(String empleadoNum){
        boolean estado= false;
        
        Statement consultaSQL;
        
        String q = "DELETE FROM empleados WHERE empleadoNum=" + "'" + empleadoNum + "'";
        
        try {
            consultaSQL = conexion.createStatement();
            consultaSQL.executeUpdate(q);
            
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        
        return estado;
    }
    /**
     * metodo que elimina un paciente de a cuerdo a su numero de seguridad social
     * @param nss numero de seguridad social
     * @return booleano que nos dice si se realizó o no la petición a la base de datos
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     */
    public boolean eliminarPaciente(String nss){
        boolean estado= false;
        
        Statement consultaSQL;
        
        String q = "DELETE FROM pacientes WHERE nss=" + "'" + nss + "'";
        
        try {
            consultaSQL = conexion.createStatement();
            consultaSQL.executeUpdate(q);
            
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        
        return estado;
    }
    /**
     * metodo que elimina un medicamento de a cuerdo a su clave
     * @param clave clave del medicamento
     * @return booleano que nos dice si se realizó o no la petición a la base de datos
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     */
    public boolean eliminarMedicamento(String clave){
        boolean estado= false;
        
        Statement consultaSQL;
        
        String q = "DELETE FROM medicamentos WHERE clave =" + "'" + clave + "'";
        
        try {
            consultaSQL = conexion.createStatement();
            consultaSQL.executeUpdate(q);
            
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        
        return estado;
    }
    
    /**
     * agrega un empleado a la base de datos
     * @param empleado empleado con sus respectivos valores
     * @return un booleano que nos dice si se realizó o no la petición a la base de datos
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     */
    public boolean agregarEmpleado(Empleado empleado){
         boolean estado = false;      
         Statement consultaSQL;
         String empleadoNum = empleado.getEmpleadoNum();
         String nombre = empleado.getNombre();
         int edad = empleado.getEdad();
         String sexo = empleado.getSexo();
         double salario = empleado.getSalario();
         String q = "INSERT INTO empleados VALUES('" + empleadoNum + "','" + nombre + "','"
                 + edad + "','" + sexo+ "','"+ salario + "')"; 
         
        try {
            consultaSQL = conexion.createStatement();
            consultaSQL.executeUpdate(q);
            estado = true;
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
         
         return estado;
     }
    /**
     * agrega un medicamento a la base de datos
     * @param medicamento medicamento con sus respectivos valores
     * @return un booleano que nos dice si se realizó o no la petición a la base de datos
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     */
    public boolean agregarMedicamento(Medicamento medicamento){
         boolean estado = false;
         
         Statement consultaSQL;
         String clave = medicamento.getClave();
         String nombreCom = medicamento.getNombreCom();
         String principioAct = medicamento.getPrincipioAct();
         String presentacion = medicamento.getPresentacion();
         String toma = medicamento.getToma();
         String q = "Insert INTO medicamentos VALUES('" + clave+ "','" +nombreCom + "','"
                 + principioAct + "','" + presentacion + "','"+ toma + "')"; 
         
        try {
            consultaSQL = conexion.createStatement();
            consultaSQL.executeUpdate(q);
            estado = true;
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
         
         return estado;
     }
    /**
     * agrega un paciente a la base de datos
     * @param paciente paciente con sus respectivos valores
     * @return un booleano que nos dice si se realizó o no la petición a la base de datos
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/Statement.html">Inteface Statement</a>
     * @see <a href = "https://docs.oracle.com/javase/7/docs/api/java/sql/SQLException.html">SQL Exception</a>
     */
    public boolean agregarPaciente(Paciente paciente){
         boolean estado = false;
         System.out.println(paciente);
         Statement consultaSQL;
         String nss = paciente.getNss();
         String nombre = paciente.getNombre();
         String padecimiento = paciente.getPadecimiento();
         String q = "INSERT INTO pacientes VALUES('" +nss+ "','" + nombre+ "','"
                 +padecimiento+"')";
         
        try {
            consultaSQL = conexion.createStatement();
            consultaSQL.executeUpdate(q);
            estado = true;
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
         
         return estado;
     }
    
    public boolean actualizarEmpleado(String empleadoNum, double salario){
     boolean estado = false;
     
     Statement consultaSQL;
     
     String q = "UPDATE empleados SET salario= " + "'" + salario + "'" +
             "WHERE empleadoNum = " + "'" +empleadoNum+ "'";
    
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
 
    public boolean actualizarPaciente(String nss, String padecimiento){
     boolean estado = false;
     
     Statement consultaSQL;
     
     String q = "UPDATE pacientes SET padecimiento= " + "'" + padecimiento + "'" +
             "WHERE nss = " + "'" +nss+ "'";
    
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
    
    public boolean actualizarMedicamento(String clave, String nombreCom){
     boolean estado = false;
     
     Statement consultaSQL;
     
     String q = "UPDATE medicamentos SET nombreCom= " + "'" + nombreCom + "'" +
             "WHERE clave = " + "'" +clave+ "'";
    
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
}
