/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.azc.pvoe.seriesstreaming.operaciones;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import uam.azc.pvoe.seriesstreaming.clases.Serie;


/**
 * Clase lectura, esta nos permite leer un archivo tanto .txt como .dat
 * asi mismo esta clase contiene todas las reglas de negocios
 * Se agrega un ArrayList de tipo Serie, este ArrayList nos permite interactuar con ellos emulando una base de datos
 * con el cual se hacen las reglas de negocios.
 * 
 * @author Julio Cesar Haro Capetillo
 */
public class Lectura {
    public ArrayList<Serie> series = new ArrayList();
    private int i=0;
    /**
     * Metodo que permite leer un archivo y al mismo tiempo agrega objetos de tipo Serie al ArrayList
     * @param na Nombre del archivo
     */
    public void leer(String na){
        FileReader fr;
        String cadenaLeida="";
        
        try {
            fr = new FileReader(na);
            BufferedReader archivoLectura = 
                    new BufferedReader(fr);
           cadenaLeida=archivoLectura.readLine();
           
           while(cadenaLeida!=null){
               
               StringTokenizer st = 
                       new StringTokenizer(cadenaLeida,
                       ",");
               
                
               String serie = st.nextToken();
               String plataforma = st.nextToken();
               //int capitulos = Integer.parseInt(st.nextToken());
               String cap = st.nextToken();
               int capitulos = Integer.valueOf(cap);
               Serie ser = 
                       new Serie(serie,plataforma,capitulos);
               
               System.out.println
        (ser.toStringConsola());
               
               cadenaLeida=archivoLectura.readLine();
               
               series.add(ser);
               
               i++;
               
           }
            
           archivoLectura.close();
           
            
            
        } catch (FileNotFoundException ex) {
            System.err.println("No se encuentra");
        } catch (IOException ex) {
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         
    }
    /**
     * Metodo que recorre el arrayList y selecciona los capitulos cuyo valor sea mayor a 15
     */
    public void seriesMasDeQuince(){
        System.out.println("Series con mas de 15 captulos\n");
        for(int a = 0; a<series.size(); a++){
            if(series.get(a).getCapitulos()>15){
            
                System.out.println(series.get(a));
            }
        
        }
        System.out.println("____________________________________\n");
    
    }
    /**
     * Metodo que recorre el arrayList y selecciona los objetos cuya plataforma sea HBO
     */
    public void seriesHBO(){
        System.out.println("Series de HBO:\n");
        
        for(int a = 0; a<series.size(); a++){
            if(series.get(a).getPlataforma().compareTo("HBO")==0){
            
                System.out.println(series.get(a));
            }
        
        }
        System.out.println("____________________________________\n");
    
    }
    /**
     * Metodo que recorre el ArrayList y selecciona los objetos de tipo Serie que tienen entre 10 y 15 capitulos 
     */
    public void seriesNetflix(){
    
        System.out.println("Series de Netflix entre 10 y 15 capitulos\n___________________________\n");
        
        for(int a = 0; a<series.size(); a++){
            if(series.get(a).getPlataforma().compareTo("NETFLIX")==0 && series.get(a).getCapitulos()>=10 
                    && series.get(a).getCapitulos()<=15){
            
                System.out.println(series.get(a));
            }
        
        }
        System.out.println("____________________________________\n");
    
    }
    /**
     * Metodo que recorre el ArrayList y selecciona los objetos de tipo Serie cuya plataforma es amazon
     */
    public void seriesAmazon(){
        System.out.println("Series de Amazon:\n");
        
        for(int a = 0; a<series.size(); a++){
            if(series.get(a).getPlataforma().compareTo("AMAZON")==0){
            
                System.out.println(series.get(a));
            }
        
        }
        System.out.println("____________________________________\n");
    }
    /**
     * Metodo que recorre el ArrayList y selecciona aquellos que son de la plataforma Disney
     * y que a su vez contienen exactamente 10 capitulos
     */
    public void seriesDisney(){
    
        System.out.println("Series de Disney que contienen exactmente 10 capitulos\n___________________________\n");
        
        for(int a = 0; a<series.size(); a++){
            if(series.get(a).getPlataforma().compareTo("DISNEY")==0 && series.get(a).getCapitulos()==10){
            
                System.out.println(series.get(a));
            }
        
        }
        System.out.println("____________________________________\n");
    
    }
    
}
