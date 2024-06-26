/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.azc.pvoe.operaciones;

import java.util.LinkedList;
import java.util.Random;
import uam.azc.pvoe.modelos.Libro;
import uam.azc.pvoe.modelos.Proveedor;
import static uam.azc.pvoe.operaciones.ListaProveedores.numeroAleatorioEnRango;

/**
 *
 * @author Julio Cesar Haro Capetillo 2202000415
 */
public class ListaLibro {
    
    private LinkedList<Libro> libros = new LinkedList();
    private String banco = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private String numeros = "0123456789";
    private String laIsbn ="";
    private LinkedList<String> generosFav = new LinkedList();
    private Random numAleatorio = new Random();
    private Random num2 = new Random();
    private String sexo = "";
    private ListaProveedores proveedores = new ListaProveedores();
    private LinkedList<Proveedor> provedor = proveedores.llenaProveedor();
    /**
     * Llena todos los libros
     * @return Los libros con sus atributos
     */
    public LinkedList<Libro> llenaLib(){
        
        for(int i =0; i<21;i++){
            Libro libro = new Libro();
            String porrua = "Porrua";
            String mcGraw = "Mac Graw Hill";
            String pearson ="Pearson";
            String uam ="Editorial Uam";
            String fdce = "Fondo de Cultura Economica";
            for(int a=0; a<13;a++){
                if(laIsbn.length()<=10){
                    int indiceAleatorio = numeroAleatorioEnRango(0, banco.length()-1);
                    char caracterAleatorio = banco.charAt(indiceAleatorio);
                    laIsbn += caracterAleatorio;
                }
            }
            int numero = (int)(Math.random()*5+1);
            
            if(numero==1){
                libro.setEditorial(mcGraw);
                
            }else if(numero==2){
                libro.setEditorial(pearson);
            }else if(numero==3){
                libro.setEditorial(uam);
            }else if(numero==4){
                libro.setEditorial(fdce);
            }else{
                libro.setEditorial(porrua);
                }
            
            libro.setIsbn("ISBN-"+laIsbn);
            libro.setTitulo("Titulo"+i);
            
            for(int a=0; a<provedor.size();a++){
                System.out.println("provedor de editorial blah blah"+provedor.get(a));
            if(provedor.get(a).getNombreEditorial().
                    compareTo(libro.getEditorial())==0){
                libro.setProveedor(provedor.get(a));break;
                }
            }
            laIsbn ="";
            /*
            private Proveedor proveedor = new Proveedor();
    private String isbn;
    private String titulo;
    private String editorial = proveedor.getNombreEditorial();
    private String tipo = "libro";
            */
            System.out.println("El libro es: "+libro);
            libros.add(libro);
        }
    return libros;
    }
    
    
}
