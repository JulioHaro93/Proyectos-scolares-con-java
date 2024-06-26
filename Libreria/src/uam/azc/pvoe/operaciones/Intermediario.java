/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.azc.pvoe.operaciones;


import java.util.LinkedList;
import uam.azc.pvoe.modelos.Administrador;
import uam.azc.pvoe.modelos.Cliente;

/**
 * Método que evita que el objeto Usuario muera durante la ejecución del programa
 * @author Julio Cesar Haro Capetillo 220200415
 */
public class Intermediario {
        public Administrador obj = new Administrador();
        public Cliente cli = new Cliente();
        public LinkedList<Administrador> ad = new LinkedList();
        public LinkedList<Cliente> c = new LinkedList();
    /**
    * Este método atrapa al usuario y lo guarda para que no muera durante 
    * la ejecución del programa
     * @param adm
    */
        public void intermediarioAdministrador(Administrador adm){
            ad.add(adm);
            
        }
        /**
         * 
         * @param cl 
         */
        public void intermediarioCliente(Cliente cl){
            c.add(cl);
        }
}
