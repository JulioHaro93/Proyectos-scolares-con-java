/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01pvoe;

/**
 * @desciption Esta clase Terreno tiene todos los atributos de un objeto terreno, 
 * @author Haro Capetillo Julio Cesar, 2202000415, Programa1
 */
public class Monticulo {
    
    private String flor;
    private int noSemillas;
    
    private Monticulo[][] terreno1 = new Monticulo[10][8];
    
    /**
     * Metodo constructor1
     * @param flor String que expresa el tipo de la flor
     * @param noSemillas int que expresa el numero de semillas
   
     */
    public Monticulo(String flor, int noSemillas) {
        this.flor = flor;
        this.noSemillas = noSemillas;
        
    }
   
    
    
    /**
     * Metodo constructor por defecto.
     */
    public Monticulo() {
    }
    
    
    /**
     * Metodo getter del tipo de flor
     * @return un String con el tipo de Flor
     */
    public String getFlor() {
        return flor;
    }
    /**
     * metodo setter que establece el valor del string del tipo de flor
     * @param flor recibe un String de tipo Flor y lo establece
     */
    public void setFlor(String flor) {
        this.flor = flor;
    }
    /**
     * metodo getter del numero de semillas
     * @return regresa el numero de semillas
     */
    public int getNoSemillas() {
        return noSemillas;
    }
    /**
     * metodo que establece el numero de semillas
     * @param noSemillas recibe un entero con el numero de semillas
     */
    public void setNoSemillas(int noSemillas) {
        this.noSemillas = noSemillas;
    }
    /**
     * metodo getter del array bidimiensional de tipo Monticulo
     * @return regresa un array llamado terreno1
     */

    public Monticulo[][] getTerreno1() {
        return terreno1;
    }
    /**
     * le da un valor a un array detipo Monticulo
     * @param terreno1 recibe un arraybidimensional de tipo Monticulo
     */
    public void setTerreno1(Monticulo[][] terreno1) {
        this.terreno1 = terreno1;
    }

    /**
     * Este metodo genera aleatoriamente un terreno con objetos de tipo Terreno.
     */
    public void rellenaTerrenos(){
        
        for(int i = 0; i<terreno1.length; i++){
            for(int j=0; j<8; j++){
                int num = (int) (Math.random()*3+1);
                int num2 = (int) (Math.random()*(4-11+1)+11);
                if(num==1){
                   
                    terreno1[i][j] = new Monticulo("ROSA", num2);
                    
                } else if(num == 2){
                    terreno1[i][j] = new Monticulo("CLAVEL", num2);
                    
                    
                } else{
                    terreno1[i][j] = new Monticulo("VIOLETA", num2);
                    
                }
                
            }
            
            }
    }
    /**
     * Este metodo imprime todo el array bidimensional, lo recorre con dos ciclos for anidados
     */
    public void imprimeTerrenos(){
           
           for(int i =0; i < terreno1.length;i++){
               for(int j=0; j<8; j++){
                   
                       
                       System.out.print(terreno1[i][j]+ "\t");
                       
                   }
               System.out.println("\n");
               
           }
           System.out.println("__________________________");
    }
    /**
     * Este metodo calcula las ganancias ya sea por tipo de flor y también el total.
     */
    public void calGanPorTipo(){
        int gananciasRosas =0;
        int gananciasClavel= 0;
        int gananciasVioleta=0;
        
        for(int i =0; i < terreno1.length;i++){
                for(int j=0; j<8; j++){
                   
                    if(terreno1[i][j].getFlor().equals("ROSA")){
                            gananciasRosas += 5;
                        } else if(terreno1[i][j].getFlor().equals("CLAVEL")){
                            gananciasClavel +=7;
                        } else{
                            gananciasVioleta +=8;
                        }
                   }
               
               
           }
        int total = gananciasRosas+ gananciasClavel + gananciasVioleta;
        
        System.out.println("Las ganancias por rosas son: $"+gananciasRosas+"\n");
        System.out.println("Las ganancias por la venta de violetas son: $"+gananciasClavel+"\n");
        System.out.println("Las ganancias por la venta de Violetas son: $"+gananciasVioleta+"\n");
        System.out.println("Las ganancias Totales son: $" + total);
        System.out.println("______________________________________________");
    }
    /**
     * Cuenta en numero de flores sembradas en el terreno, también nos cuenta cuantas son de cada una y cuantas son en total
     */
    public void cuentaFlores(){
        int gananciasRosas =0;
        int gananciasClavel= 0;
        int gananciasVioleta=0;
        
        for(int i =0; i < terreno1.length;i++){
                for(int j=0; j<8; j++){
                   
                    if(terreno1[i][j].getFlor().equals("ROSA")){
                            gananciasRosas ++;
                        } else if(terreno1[i][j].getFlor().equals("CLAVEL")){
                            gananciasClavel ++;
                        } else{
                            gananciasVioleta ++;
                        }
                   }
               
               
           }
        int total = gananciasRosas+ gananciasClavel + gananciasVioleta;
        
        System.out.println("Las rosas son: "+gananciasRosas+"\n");
        System.out.println("Los claveles son: "+gananciasClavel+"\n");
        System.out.println("Las Violetas son: "+gananciasVioleta+"\n");
        System.out.println("Las flores totales son: " + total+"\n");
        System.out.println("________________________________________________");
    }
    
    
    
    @Override
    public String toString() {
        return "Terreno{" + "flor=" + flor + ", noSemillas=" + noSemillas +  '}';
    }
    
}
