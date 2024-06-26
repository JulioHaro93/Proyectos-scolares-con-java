/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.pvoe.sw.tablas.operaciones;

import java.util.Vector;

/**
 *
 * @author ALUMNO11
 */
public class OperacionesTabla {
    
    public Vector generaColumnas(int nC){
     Vector columnas = new Vector();
     for(int i=0; i<nC; i++){
         columnas.add("Columna_"+(i+1));
     }
     return columnas;       
    }
    
    public Vector generaFilas(int nF, int nC){
    Vector todasLasFilas = new Vector();
    Vector fila = new Vector();
    for(int i=0; i<nF; i++){
        for(int j=0;j<nC;j++){
            fila.add((i+1)+"_"+(j+1));
        }
         
     todasLasFilas.add(fila);
     fila = new Vector();
     }
    return todasLasFilas;
   }
    
}
