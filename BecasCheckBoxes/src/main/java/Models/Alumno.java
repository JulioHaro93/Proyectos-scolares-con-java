/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author ALUMNA16
 */
public class Alumno {
    
    private String nombre;
    private String matricula;
    private String division;
    private ArrayList<String> beca;
    private String correo;
    private boolean encuesta;

    public Alumno() {
    }

    public Alumno(String nombre, String matricula, String division, ArrayList<String> beca, String correo, boolean encuesta) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.division = division;
        this.beca = beca;
        this.correo = correo;
        this.encuesta = encuesta;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isEncuesta() {
        return encuesta;
    }

    public void setEncuesta(boolean encuesta) {
        this.encuesta = encuesta;
    }
    public ArrayList<String> getBeca() {
        return beca;
    }

    public void setBeca(ArrayList<String> beca) {
        this.beca = beca;
    }
    
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", matricula=" + matricula + ", division=" + division + ", beca=" + beca + ", correo=" + correo + ", encuesta=" + encuesta + '}';
    }

    
    
    
}
