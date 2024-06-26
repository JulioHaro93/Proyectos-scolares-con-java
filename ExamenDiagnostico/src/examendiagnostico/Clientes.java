/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examendiagnostico;

import java.util.ArrayList;

/**
 *
 * @author Julio Cear Haro Capetillo
 */
public class Clientes {
    private int numCuenta=1;
    private String nombre;
    private int saldo;
    
    public ArrayList<Clientes> clientes = new ArrayList();
    
    public void registra(Clientes cliente){
        cliente.numCuenta = numCuenta;
        clientes.add(cliente);
        numCuenta++;
        
    
    }
    /**
     * Método constructor por defecto
     * @param numCuenta
     * @param nombre
     * @param saldo 
     */
    public Clientes(int numCuenta, String nombre, int saldo) {
        this.numCuenta = numCuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    /**
     * Sobrecarga de métodos
     */
    public Clientes() {
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    /**
     * metodo que agrega saldo a una cuenta
     * @param i numero de cuenta del cliente
     * @param saldo valor que se aumentará a la cuenta
     */
    public void deposita(int i, int saldo){
        
        for(int j =0; j<clientes.size(); j++){
            Clientes c = clientes.get(j);
            if(c.getNumCuenta() == i){
                
                int nuevoSaldo = c.getSaldo()+ saldo;
                c.setSaldo(nuevoSaldo);
                
                System.out.println("El saldo actual del cliente: " + c.getNombre()+ " es $" + c.getSaldo());
            } else{
                System.out.println("El numero de cuenta no existe");
            }
        
        }
    }
    /**
     * método para retirar
     * @param i numero de cuenta
     * @param saldoNegativo saldo que se reducirá a la cuenta
     */
    public void retira(int i, int saldoNegativo){
        
        for(int j =0; j<clientes.size(); j++){
            if(clientes.get(j).getNumCuenta() == i && clientes.get(j).getSaldo()>saldoNegativo){
                
                
                clientes.get(j).setSaldo( clientes.get(j).getSaldo()- saldoNegativo);
                
                System.out.println("El saldo actual del cliente: " + clientes.get(j).getNombre().toUpperCase() + " es: $"+ clientes.get(j).getSaldo() );
            } else{
                System.out.println("Por favor revise si su numero de cuenta existe o si el saldo es negativo");
            }
        }
    }
    /**
     * 
     * @param i numero de cuenta del depositante
     * @param j numero de cuenta del que recibe el dinero
     * @param m cantidad de dinero a transferir
     */
    public void transfiere(int i, int j, int m){
        for(int a =0; a<clientes.size(); a++){
        if(clientes.get(a).getNumCuenta() == i  && clientes.get(a).getSaldo() > m){
                    clientes.get(a).setSaldo(clientes.get(a).getSaldo()-m);
                    
                    
                    System.out.println("El cliente: "+ clientes.get(a).getNombre() +" ahora tiene un saldo de: "
                    + clientes.get(a).getSaldo());
                    
                }
        }
        for(int a =0; a<clientes.size(); a++){
        if(j == clientes.get(a).getNumCuenta() && clientes.get(i).getSaldo() > m){
                    clientes.get(a).setSaldo(clientes.get(a).getSaldo()+m);
                    
                    if(j == clientes.get(a).getNumCuenta()){
                    System.out.println("El cliente: "+ clientes.get(a).getNombre() +" ahora tiene un saldo de: "
                    + clientes.get(a).getSaldo());
                    }
        
                }
        }
    }
    
    public void muestraClientes(){
        
        for(int i = 0; i < clientes.size(); i++){
        
            System.out.println("Numero de cuenta: 00"+clientes.get(i).getNumCuenta()+" Nombre: " + clientes.get(i).getNombre().toUpperCase()+ " Saldo: $" + clientes.get(i).getSaldo());
        }
    
    }


    @Override
    public String toString() {
        return "Clientes{" + "numCuenta=" + numCuenta + ", nombre=" + nombre + ", saldo=" + saldo + '}';
    }
    
    
}
