/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import Datos.OperacionBD;
import Modelo.Hospital;

/**
 * Clase principal con el método Main utilizada para hacer las pruebas de los métodos de las otras clases
 * @author Julio Cesar Haro Capetillo
 */
public class Principal {
    
     public static void main(String[] args) {
        // TODO code application logic here
    
        OperacionBD op = new OperacionBD();
    
        op.conectar();
        Hospital ho = new Hospital();
    
        System.out.println("Empleados: \n "+op.mostrarEmpleados());
        
        System.out.println("Medicamentos: \n" + op.mostrarMedicamentos());
         System.out.println("Medicamentos por presentacion: \n" + op.ordenarMedicamentos());
        System.out.println("Pacientes: \n "+ op.mostrarPacientes());
        //ho.padecimientoVocal();
       
         //ArrayList<Paciente> padecimientoVocal = ho.padecimientoVocal();
         System.out.println("padecimientos vocal:" + ho.padecimientoVocal());
        
        System.out.println("Empleados por género sexual \n: "+ ho.empleadoSex());
        
        System.out.println(ho.empleadoEdadesProm());
        
         System.out.println("empleados sueldo: \n");
         ho.salarioMenoryMayor();
        
        op.desconectar();
    
     }
}
