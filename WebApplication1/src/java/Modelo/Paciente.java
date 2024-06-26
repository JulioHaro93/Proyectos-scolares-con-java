/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author DELL
 */
public class Paciente {
    
    private String nss;
    private String nombre;
    private String padecimiento;

    public Paciente() {
    }

    public Paciente(String nss, String nombre, String padecimiento) {
        this.nss = nss;
        this.nombre = nombre;
        this.padecimiento = padecimiento;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPadecimiento() {
        return padecimiento;
    }

    public void setPadecimiento(String padecimiento) {
        this.padecimiento = padecimiento;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nss=" + nss + ", nombre=" + nombre + ", padecimiento=" + padecimiento + '}';
    }
    
    
    
}
