/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.pvoe.archivos.operaciones;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import uam.pvoe.archivos.clases.Alumno;

/**
 *
 * @author Profesor
 */
public class Escritura {
    
    public void escribir(String nombreArchivo,
                        Alumno alumno){
        try {
            //FileWriter requiere el
            //nombre del archivo físico
            //true - Append
            FileWriter fw = new FileWriter
                        (nombreArchivo,true);
            BufferedWriter archivoEscritura = 
                    new BufferedWriter(fw);
            String almacenar = 
                    alumno.toStringArchivo();
            archivoEscritura.write(almacenar+"\n");
            //Se asegura que se escriba
            archivoEscritura.flush();
            //Cierra/rompe la relación
            archivoEscritura.close();
        } catch (IOException ex) {
           System.err.println("Error al crear");
        }
        
    }
    
}
