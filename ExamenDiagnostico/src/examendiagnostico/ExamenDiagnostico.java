/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examendiagnostico;

import java.util.Scanner;
/**
 *
 * @author Julio Cesar Haro Capetillo
 */
public class ExamenDiagnostico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        // TODO code application logic here
        Clientes c = new Clientes();
        int opciones;
        Clientes cliente1 = new Clientes(0, "juan", 1000);
        Clientes cliente2 = new Clientes(0, "Panchita", 5000);
        Clientes cliente3 = new Clientes(0, "Juana", 8000);
        Scanner entrada = new Scanner(System.in);
        while( i !=500){
            int contador = 500-i;
                System.out.println("usted puede realizar "+ contador + " movimientos");
                System.out.println("para realizar un regitro ingrese 1");
                System.out.println("para realizar un deposito ingrese 2");
                System.out.println("para realizar un retiro ingrese 3");
                System.out.println("para realizar una transferencia ingrese 4");
                System.out.println("Si usted quiere conocer a todos los clientes ingrese 5");
                System.out.println("para finalizar el programa, ingrese 6");
                opciones = entrada.nextInt();
            switch(opciones){

                    case 1 -> {
                        Clientes cli = new Clientes();
                        System.out.println("Usted eligió la opcion registrar un usuario, por favor agregue los siguients valores");
                        System.out.println("Ingrese el nombre\n");
                        
                        Scanner s = new Scanner(System.in);
                        cli.setNombre(s.nextLine());
                        
                        if(cli.getNombre() != null){
                        System.out.println("Ingrese el monto inicial de la cuenta");
                        Scanner a = new Scanner(System.in);
                        cli.setSaldo(a.nextInt());
                        }
                        c.registra(cli);
                        System.out.println(cli);
                        
                        i++; break;
                        }
                    case 2->{
                        
                        System.out.println("Usted eligió depositar a una cuenta\n");
                        System.out.println("Por favor agregue el numero de cliente, posteriormente el valor a depositar:");
                        Scanner d1 = new Scanner(System.in);
                        Scanner d = new Scanner(System.in);
                        
                        c.deposita(d1.nextInt(), d.nextInt());
                        i++; break;

                    }
                    case 3->{
                        System.out.println("Usted eligio la opcion de retirar de la cuenta");
                        System.out.println("Por favor ingrese el numero del cliente");
                        Scanner r1 = new Scanner(System.in);
                        System.out.println("Por favor ingrese el monto a retirar");
                        Scanner r = new Scanner(System.in);
                        c.retira(r1.nextInt(), r.nextInt());
                        i++; break;
                    }
                    case 4 ->{
                        System.out.println("Usted eligio la transferencia");
                        System.out.println("Por favor ingrese el numero del primer cliente");
                        Scanner c1 = new Scanner(System.in);
                        System.out.println("Por favor ingrese el numero del cliente a transferir");
                        Scanner c2 = new Scanner(System.in);
                        System.out.println("Por favor ingrese el valor del saldo a transferir");
                        Scanner s = new Scanner(System.in);
                        c.transfiere(c1.nextInt(), c2.nextInt(), s.nextInt()); 
                        i++; break;
                    }
                    case 5 ->{
                        System.out.println("Usted eligio la opcion mostrar a todos los usuarios");
                        c.muestraClientes();
                        
                        i++; break;
                    }
                    case 6->{
                        System.out.println("Usted eligió finalizar los movimientos, tenga un buen dia");
                        i=500; break;
                    }
                    default ->{
                        System.out.println("Ha elegido una opcion incorrecta");
                        }
                }


                
        
        }
    
    
    }
    
}
