/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.pvoe.frm.operaciones;

import java.util.LinkedList;

/**
 *
 * @author Alumno 31
 */
public class LlenadoListas {
    private LinkedList<String> llenarListaSencilla;
    private LinkedList<String> llenarListaBase;
    private LinkedList<String> llenarListaDependiente;
    
    public LinkedList<String> llenarlista(){
        llenarListaSencilla= new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            llenarListaSencilla.add("Opcion seleccionada "+(i+1));           
        }
    return llenarListaSencilla;
    }
    
    public LinkedList<String> llenarBase(){
        llenarListaBase= new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            llenarListaBase.add("Base "+(i+1));
            
        }
    return llenarListaBase;
    }
    
    public LinkedList<String> llenarDependiente(String base){
        llenarListaDependiente = new LinkedList<>();
        for (int i = 0; i < 7; i++) {
            llenarListaDependiente.add(base+"::: Dependencia: "+(i+1));          
        }
    return llenarListaDependiente;
    }
    
}
