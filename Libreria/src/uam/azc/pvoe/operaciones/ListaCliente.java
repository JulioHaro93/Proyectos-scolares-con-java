/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.azc.pvoe.operaciones;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import uam.azc.pvoe.modelos.Cliente;
import uam.azc.pvoe.operaciones.Fecha;

/**
 * Metodo que genera una lista ligada con los clientes,
 * la curp, el número de teléfono y los gustos se generan aleatoriamente
 * @author Julio Cesar Haro Capetillo 2202000415
 */
public class ListaCliente {
    
    private final LinkedList<Cliente> clientes = new LinkedList();
    private String banco = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private String numeros = "0123456789";
    private String laCurp ="";
    private String tel = "";
    private LinkedList<String> generosFav = new LinkedList();
    private Random numAleatorio = new Random();
    private Random num2 = new Random();
    private String sexo = "";
    
    /**
     * Metodo que genera una lista ligada de tipo cliente
     * Los clientes tienen propiedades generadas al azar
     * incluyendo los gustos por los géneros cuyo tamaño de la lista es dinámica
     * y se generan de manera aleatoria
     * @return una lista ligada con los clientes
     */
    public LinkedList<Cliente> llenaCli(){
        
        String casadoresDeBichos = "Ciencia Ficcion";
        String romeoYjulieta ="Romance";
        String frankestein ="Clasicos";
        String lordOfRings = "Fantasia";
        String lovecraft = "Terror y Misterio";

        for(int i =1; i<=10; i++){
            
            Cliente cli = new Cliente();
            for(int a =0; a<18; a++){
                if(laCurp.length()<=18){
                    int indiceAleatorio = numeroAleatorioEnRango(0, banco.length()-1);
                    char caracterAleatorio = banco.charAt(indiceAleatorio);
                    laCurp += caracterAleatorio;
                }
            }
            boolean moneda = numAleatorio.nextBoolean();
            boolean setso = num2.nextBoolean();
           
            if(setso){
                sexo="Masculino";
            }else{
                sexo="Femenino";
            }
        
            for(int b =0; b<=10; b++){
                
                if(tel.length()<11){
                    int indiceAleatorio = numeroAleatorioEnRango(0, numeros.length()-1);
                    char caracterAleatorio = numeros.charAt(indiceAleatorio);
                    tel += caracterAleatorio;
                }
            }
            
                for(int c = 0; c<5; c++){
                    //while(generosFav.get(0)==null || generosFav.get(1)==null && c<5){
                    int numero = (int)(Math.random()*8+1);
                    System.out.println("&&&&&&&&&Numero aleatorio para literatura"+numero);
                switch (numero) {
                    case 1:
                        generosFav.add(casadoresDeBichos);
                        break;
                    case 2:
                        generosFav.add(romeoYjulieta);
                        break;
                    case 3:
                        generosFav.add(frankestein);
                        break;
                    case 4:
                        generosFav.add(lordOfRings);
                        break;
                    case 5:
                        generosFav.add(lovecraft);
                        break;
                    default:
                        break;
                }
            }
             

            /*
            LinkedList<String> listaDos = generosFav;
            if(generosFav.size()>2){
                for(int d = 0; d<generosFav.size(); d++){
                    for(int e = 0; e<listaDos.size(); e++){
                        if(generosFav.size()>2){
                            if(generosFav.get(d).equals(listaDos.get(e))){
                                generosFav.remove(d);
                                
                            }
                        }
                    }
                }
            }
            
            if(generosFav.get(0)==null){
                generosFav.add(frankestein);
                generosFav.add(lovecraft);
            } else if (generosFav.size()==1) {
                
                generosFav.add(lordOfRings);
            }
            */
            String nombre = "Cliente"+i;
            cli.setNombre(nombre);
            String email = "cliente"+i+"@libreria.com";
            cli.setEmail(email);
            String pass = "cliente"+i;
            cli.setPsw(pass);
            cli.isAdmin();
            cli.setCurp(laCurp);
            String direccion = "la Direccion del cliente: cliente"+i;
            cli.setDireccion(direccion);
            cli.setTelefono(tel);
            cli.setFavoritos(generosFav);
            cli.setDeudor(moneda);
            cli.setGenero(sexo);
            Fecha registro = new Fecha();
            cli.setFechaRegistro(registro.fechaRegistro());
            clientes.add(cli);
            tel = "";
            laCurp="";
            sexo="";
            
            System.out.println(clientes.get(i-1));
        }
        
        return clientes;
    }
    
    /**
     * metodo que genera un numero aleatorio que se utiliza después 
     * tanto para generar el número de teléfono como la curp
     * @param minimo valor mínimo que viene siendo 0 para la primer posición del String curp
     * @param maximo valor máximo que viene siendo el número mayor del sistema alfa numérico
     * @return 
     */
    public static int numeroAleatorioEnRango(int minimo, int maximo){
    return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
}
}
