/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terrenos;

/**
 *
 * @author ALUMNO09
 */
public class TerrenoUno {
    
    private String vivo = "arbol";
    private String noVivo = "piedra";
    String[][] terreno1 = new String[5][4];
    String[][] terreno2 = new String[5][4];
    
    
    
    
    public TerrenoUno() {
    }
    
    public TerrenoUno(String vivo, String noVivo, String[][] terreno1, String[][] terreno2){
        
        this.vivo=vivo;
        this.noVivo = noVivo;
        this.terreno1 = terreno1;
        this.terreno2 = terreno2;
    }
    
    public void rellenaTerrenos(){
        
        for(int i = 0; i<terreno1.length; i++){
            for(int j=0; j<4; j++){
                int num = (int) (Math.random()*2+1);
                if(num==1){
                   
                    terreno1[i][j] = vivo;
                } else{
                    terreno1[i][j] = noVivo;
                    
                }
                
            }
            
            }
        
        for(int i = 0; i<terreno2.length; i++){
            for(int j=0; j<4; j++){
                int num = (int) (Math.random()*2+1);
                if(num==1){
                    terreno2[i][j] = vivo;
            
                } else{
                    terreno2[i][j] = noVivo;
                    
                }
            }
        }
       
       
    }
     public void imprimeTerrenos(){
           
           for(int i =0; i < terreno1.length;i++){
               for(int j=0; j<4; j++){
                   
                       
                       System.out.print(terreno1[i][j]+ "\t");
                       
                   }
               System.out.println("\n");
               
           }
           System.out.println("__________________________");
           for(int i =0; i < terreno2.length;i++){
               for(int j=0; j<4; j++){
                   
                       
                       System.out.print(terreno2[i][j]+ "\t");
                       
                   }
               System.out.println("\n");
           }
           System.out.println("__________________________");
        }
     
        
            public void cuentaArboles(){
                int a1=0;
                int a2=0;
                int p1=0;
                int p2=0;
            for(int i =0; i < terreno1.length;i++){
                       for(int j=0; j<4; j++){
                           if(terreno1[i][j].equals(noVivo)){
                               p1++;
                           }else{{
                               a1++;
                           }
                           }
                            
                           }

                   }
                   for(int i =0; i < terreno2.length;i++){
                       for(int j=0; j<4; j++){
                           if(terreno1[i][j].equals(noVivo)){
                               p2++;
                           }else{
                               a2++;
                           }
                           }
                       
                   }
             if(a1>a2){
                 System.out.println("El terreno 1 tiene mas arboles");
             }else{
                 System.out.println("El terreno 2 tiene mas arboles");
             }
             if(p1>p2){
                System.out.println("el terreno1 tiene mas piedras");
             
             }else{
                System.out.println("El terreno 2 tiene mas piedras");
             }
            }

}
