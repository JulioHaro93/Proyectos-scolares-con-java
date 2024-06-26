/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.pvoe.botones.formas.models;

/**
 *
 * @author ALUMNO23
 */
public class Alumno {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private boolean genero;
    private boolean residencia;
    private String beca;

    public Alumno() {
    }

    public Alumno(String nombre, String primerApellido, String segundoApellido, boolean genero, boolean residencia, String beca) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.genero = genero;
        this.residencia = residencia;
        this.beca = beca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public boolean isResidencia() {
        return residencia;
    }

    public void setResidencia(boolean residencia) {
        this.residencia = residencia;
    }

    public String getBeca() {
        return beca;
    }

    public void setBeca(String beca) {
        this.beca = beca;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", genero=" + genero + ", residencia=" + residencia + ", beca=" + beca + '}';
    }
    
    
    
}
