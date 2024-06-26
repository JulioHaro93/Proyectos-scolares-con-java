/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.azc.pvoe.operaciones;

import java.util.LinkedList;
import java.util.Random;
import uam.azc.pvoe.modelos.Proveedor;
import uam.azc.pvoe.modelos.Revista;
import static uam.azc.pvoe.operaciones.ListaProveedores.numeroAleatorioEnRango;

/**
 * Esta Clase crea una lista de revistas con sus atributos
 * @author Julio Cesar Haro Capetillo 2202000415
 */
public class ListaReviistas {
    
    
    private LinkedList<Revista> revistas = new LinkedList();
    private String banco = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private String numeros = "0123456789";
    private String laIsbn ="";
    private Random numAleatorio = new Random();
    private Random num2 = new Random();
    private String sexo = "";
    private ListaProveedores proveedores = new ListaProveedores();
    private LinkedList<Proveedor> provedor = proveedores.llenaProveedor();
    /**
     * Llena todos los libros
     * @return Los libros con sus atributos
     */
    public LinkedList<Revista> llenaRev(){
        
        for(int i =0; i<21;i++){
            Revista revista = new Revista();
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
            
            switch (numero) {
                case 1:
                    revista.setEditorial(mcGraw);
                    break;
                case 2:
                    revista.setEditorial(pearson);
                    break;
                case 3:
                    revista.setEditorial(uam);
                    break;
                case 4:
                    revista.setEditorial(fdce);
                    break;
                default:
                    revista.setEditorial(porrua);
                    break;
            }
            
            revista.setIsbn("ISBN-"+laIsbn);
            revista.setTitulo("Titulo"+i);
           
            for(int a=0; a<provedor.size();a++){
                System.out.println("provedor de editorial blah blah"+provedor.get(a));
            if(provedor.get(a).getNombreEditorial().
                    compareTo(revista.getEditorial())==0){
                revista.setProveedor(provedor.get(a));break;
                }
            }
            int numero2 = (int)(Math.random()*100+1);
            revista.setNum(numero2);
            int numero3 = (int)(Math.random()*10+1);
            revista.setCantidadDisponible(numero3);
            revista.setTipo("revista");
            
            System.out.println("El libro es: "+revista);
            revistas.add(revista);
            laIsbn = "";
        }
    return revistas;
    }
    
    
    
}
