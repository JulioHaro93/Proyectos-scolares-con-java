/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.pvoe.archivos.principal;

import uam.pvoe.archivos.clases.Alumno;
import uam.pvoe.archivos.operaciones.Escritura;
import uam.pvoe.archivos.operaciones.Lectura;

/**
 *
 * @author Profesor
 */
public class Principal {
    
    public static void main(String [] args){
        //escribir("alumnos.txt");
        leer("alumnos.txt");
    }
    
    public static void escribir(String na){
        Alumno alumno =
                new Alumno(5,"Nombre alumno 5",
                "Computacion");
        Escritura escritura = new Escritura();
        escritura.escribir(na, alumno);
    }
    
    public static void leer(String na){
        Lectura lectura = new Lectura();
        lectura.leer(na);
    }
    
}
