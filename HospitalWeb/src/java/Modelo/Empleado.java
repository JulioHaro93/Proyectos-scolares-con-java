/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *Clase Empleado con sus atributos: empleadoNum, nombre, edad,sexo y salario
 * @author Julio Cesar Haro Capetillo
 */
public class Empleado {
    
    private String empleadoNum;
    private String nombre;
    private int edad;
    private String sexo;
    private double salario;
    /**
     * metodo constructor por defecto para la sobrecarga de métodos
     */
    public Empleado() {
    }
    /**
     * método constructor con parámetros
     * @param empleadoNum numero de empleado
     * @param nombre nombre del empelado
     * @param edad edad del empleado
     * @param sexo sexo del empelado
     * @param salario salario del empleado
     */
    public Empleado(String empleadoNum, String nombre, int edad, String sexo, double salario) {
        this.empleadoNum = empleadoNum;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.salario = salario;
    }
    /**
     * metodo getter del numero del empelado
     * @return un String con el numero del empleado
     */
    public String getEmpleadoNum() {
        return empleadoNum;
    }
    /**
     * metodo setter del numero del empelado
     * @param empleadoNum recibe un String con el numero del empleado
     */
    public void setEmpleadoNum(String empleadoNum) {
        this.empleadoNum = empleadoNum;
    }
    /**
     * metodo getter del numero del empleado
     * @return un String con el nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * metodo setter del nombre del empelado
     * @param nombre nombre del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * metodo getter de la edad
     * @return un entero con la edad del empleado
     */
    public int getEdad() {
        return edad;
    }
    /**
     * metodo setter de la edad
     * @param edad recibe un entero
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * metodo getter del sexo del empleado
     * @return un String con el sexo del empelado
     */
    public String getSexo() {
        return sexo;
    }
    /**
     * metodo setter del sexo
     * @param sexo establece un valor para el sexo del empleado
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    /**
     * metodo getter del salario
     * @return un double con el salario del empleado
     */
    public double getSalario() {
        return salario;
    }
    /**
     * metodo setter del salario
     * @param salario recibe un double con el salario de un empelado
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    /**
     * metodo toString
     * @return un string con todos los valores del empleado
     */
    @Override
    public String toString() {
        return "Empleado{" + "empleadoNum=" + empleadoNum + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", salario=" + salario + '}';
    }
    
    
}
