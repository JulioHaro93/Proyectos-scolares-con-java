/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.pvoe.archivos.clases;

/**
 *
 * @author Profesor
 */
public class Alumno {
    private int idAlumno;
    private String nombre;
    private String licenciatura;

    public Alumno(int id, String no, String li){
        idAlumno = id;
        nombre = no;
        licenciatura = li;
    }
    
    
    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLicenciatura() {
        return licenciatura;
    }

    public void setLicenciatura(String licenciatura) {
        this.licenciatura = licenciatura;
    }
    
    public String toStringArchivo(){
      String cadena="";
      cadena = idAlumno+","+nombre+","+
              licenciatura;
      return cadena;
    }
    
    public String toStringConsola(){
        String cadena="";
      cadena = idAlumno+":::"+nombre+":::"+
              licenciatura;
      return cadena;
    }
}
