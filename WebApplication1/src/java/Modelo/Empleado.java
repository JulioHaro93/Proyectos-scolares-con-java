/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author DELL
 */
public class Empleado {
    
    private String empleadoNum;
    private String nombre;
    private int edad;
    private String sexo;
    private double salario;

    public Empleado() {
    }

    public Empleado(String empleadoNum, String nombre, int edad, String sexo, double salario) {
        this.empleadoNum = empleadoNum;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.salario = salario;
    }

    public String getEmpleadoNum() {
        return empleadoNum;
    }

    public void setEmpleadoNum(String empleadoNum) {
        this.empleadoNum = empleadoNum;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "empleadoNum=" + empleadoNum + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", salario=" + salario + '}';
    }
    
    
}
