/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.pvoe.archivos.operaciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import uam.pvoe.archivos.clases.Alumno;

/**
 *
 * @author Profesor
 */
public class Lectura {
    
    public void leer(String na){
        FileReader fr;
        String cadenaLeida="";
        
        try {
            fr = new FileReader("datosAlumnos/"+na);
            BufferedReader archivoLectura = 
                    new BufferedReader(fr);
           cadenaLeida=archivoLectura.readLine();
           
           while(cadenaLeida!=null){
               StringTokenizer st = 
                       new StringTokenizer(cadenaLeida,
                       ",");
               
               int id = Integer.parseInt(st.nextToken());
               String nombre = st.nextToken();
               String lic = st.nextToken();
               
               Alumno alumno = 
                       new Alumno(id,nombre,lic);
               
               System.out.println
        (alumno.toStringConsola());
               
               cadenaLeida=archivoLectura.readLine();
               
           }
            
           archivoLectura.close();
           
            
            
        } catch (FileNotFoundException ex) {
            System.err.println("No se encuentra");
        } catch (IOException ex) {
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
