/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.azc.pvoe.operaciones;
import java.util.LinkedList;
import uam.azc.pvoe.modelos.Administrador;
/**
 * Metodo que genera una lista ligada de tipo Administrador
 * @author Julio Cesar Haro Capetillo 2202000415
 */
public class ListaAdmin {
    
    private LinkedList<Administrador> administradores = new LinkedList();
    /**
     * Metodo que genera a los 5 administradores con sus contraseñas y correos
     * @return una lista ligada de tipo Administrador con sus propiedades
     */
    public LinkedList<Administrador> llenaAdmin(){
        for(int i =1; i<=5; i++){
            Administrador adm = new Administrador();
            String nombre = "Admin"+i;
            adm.setNombre(nombre);
            String email = "admin"+i+"@libreria.com";
            adm.setEmail(email);
            String pass = "admin"+i;
            adm.setPsw(pass);
            boolean admin = true;
            adm.isAdmin();
            
           administradores.add(adm);
            System.out.println(administradores.get(i-1));
        }
        
        return administradores;
    }
    
    
}
