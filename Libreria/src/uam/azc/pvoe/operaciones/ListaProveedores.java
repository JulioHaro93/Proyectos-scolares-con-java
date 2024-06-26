/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.azc.pvoe.operaciones;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import uam.azc.pvoe.modelos.Proveedor;

/**
 *
 * @author Julio Cesar Haro Capetillo 2202000415
 */
public class ListaProveedores {
    private LinkedList<Proveedor> proveedores = new LinkedList();
    /*
    private String nombreEditorial;
    private String rfc;
    private String direccion;
    private String telefono;
    private String nombreRepresentante;
    private String correoElectronico;
    */
    private String banco = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private String numeros = "0123456789";
    private String laRfc ="";
    private String tel = "";
    private Random numAleatorio = new Random();
    /**
     * Llena los proveedores
     * @return un linkedList con los proveedores
     */
    public LinkedList<Proveedor> llenaProveedor(){
        /*
        for(int a =0; a<18; a++){
                if(laCurp.length()<=18){
                    int indiceAleatorio = numeroAleatorioEnRango(0, banco.length()-1);
                    char caracterAleatorio = banco.charAt(indiceAleatorio);
                    laCurp += caracterAleatorio;
                }
        */
        for(int i =1; i<=5; i++){
            
            String porrua = "Porrua";
            String mcGraw = "Mac Graw Hill";
            String pearson ="Pearson";
            String uam ="Editorial Uam";
            String fdce = "Fondo de Cultura Economica";
            
            Proveedor prov = new Proveedor();
            for(int a=0; a<13;a++){
                if(laRfc.length()<=13){
                    int indiceAleatorio = numeroAleatorioEnRango(0, banco.length()-1);
                    char caracterAleatorio = banco.charAt(indiceAleatorio);
                    laRfc += caracterAleatorio;
                }
            }
            for(int b =0; b<=10; b++){
                if(tel.length()<11){
                    int indiceAleatorio = numeroAleatorioEnRango(0, numeros.length()-1);
                    char caracterAleatorio = numeros.charAt(indiceAleatorio);
                    tel += caracterAleatorio;
                }
            }
            
            if(i==1){
                prov.setNombreEditorial(porrua);
            }else if(i==2){
                prov.setNombreEditorial(mcGraw);
            }else if(i==3){
                prov.setNombreEditorial(pearson);
            }else if(i==4){
                prov.setNombreEditorial(uam);
            }else if(i==5){
                prov.setNombreEditorial(fdce);
            }
            //String nombre = "Editorial"+i;
            //prov.setNombreEditorial(nombre);
            String email = "editorial"+i+"@editorial"+i+".com";
            prov.setCorreoElectronico(email);
            prov.setRfc(laRfc);
            prov.setTelefono(tel);
            prov.setNombreRepresentante("Representante"+i+" "+"Apellido"+1);
            prov.setDireccion("Direccion de la editorial "+i);
            
            proveedores.add(prov);
            tel="";
            laRfc="";
            

        }
        
        return proveedores;
    }
    
    public static int numeroAleatorioEnRango(int minimo, int maximo){
    return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
}
}
