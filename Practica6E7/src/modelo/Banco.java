/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 * Clase llamada Banco tiene todas las reglas de negocio para la interaccion con la Base de datos.
 * @author Haro Capetillo Julio Cesar
 * @version 10/09/2022
 */
public class Banco {
    
    private ArrayList<Cuenta> cuentas;
    
    /**
     * Metodo constructor que solo tiene como parametro un ArrayList
     * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">Class ArrayList</a>
     */
    /**
     * 
     */
    public Banco() {
        this.cuentas = new ArrayList<>();
    }

    /**
     * Metodo constructor que contiene un ArrayList de la clase cuenta
     * @param cuentas : inicializa el ArrayList dinamico de cuentas
     * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">Class ArratList</a>
     */
    public Banco(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
    /**
     * Metodo que calcula el saldo promedio por sucursal, suma todas las cuentas de la misma sucursal y las divide entre el total de cuentas
     * @param sucursal : recive un String sucursal, el cual sirve como filtro para el array
     * @return Un doble con el saldo promedio por sucursal sucursal
     * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">Class Equals</a>
     */
    public double calcularSaldoProm(String sucursal){
        double saldoProm = 0;
        double saldt = 0;
        int i = 0;
            for (Cuenta cuenta : cuentas) {
                if(cuenta.getSucursalApertura().equals(sucursal)){
                    i++;
                    saldt += cuenta.getSaldo();
                    saldoProm = saldt/i;
            }
        }
        return saldoProm;
    }
    
    /**
     * Metodo que define cual sucursal tiene mayor numero de cuentas
     * @return Un String con la sucursal que contiene mayor numero de cuentas
     * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">Class Equals</a>
     */
    public String mayorNumCuentas(){
        
        int azcapo = 0;
        int cuaji = 0;
        int xochi = 0;
        String r;
        
        for (Cuenta cuenta : cuentas) {
            if(cuenta.getSucursalApertura().equals("AZC")){
                azcapo++;
            }else if(cuenta.getSucursalApertura().equals("CUA")){
                cuaji++;
            }else{
                xochi++;
            }
        }
        
        if(azcapo>cuaji && azcapo>xochi){
            r = "AZC";
        }else if (cuaji>azcapo && cuaji>xochi){
            r = "CUA";
        }else
            r = "XOC";
        
        return r;
    }
    
    /**
     * Metodo que calcula que sucursal contiene el la cuenta con menor saldo
     * @return Una cadena de caracteres que contiene a la sucursal con la cuenta de menor saldo
     * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">Class Equals</a>
     */
    public String calcularCuentaMenorSaldo(){
        
        String r;
        
        double azcapo = 0;
        double cuaji = 0; 
        double xochi = 0;
        
        for (Cuenta cuenta : cuentas) {
            
             if(cuenta.getSucursalApertura().equals("AZC")){
                azcapo += cuenta.getSaldo();
                
            }else if(cuenta.getSucursalApertura().equals("CUA")){
                cuaji += cuenta.getSaldo();
                
            }else{
                xochi += cuenta.getSaldo();
            }
        }
        if(azcapo<cuaji && azcapo<xochi){
            r = "AZC";
        }else if(cuaji<azcapo && cuaji<xochi){
            r = "CUA";
        }else{
            r = "XOC";
        }
        
        return r;
    }

    /**
     * Metodo que mostrara al cliente con mayor y menor saldo en su cuenta, al igual que la sucursal a la que pertenece
     * @return un String, el primer valor es el cliente con mayor saldo, y la 2da con el menor saldo
     */
    public String obtenerClienteMayorMenorSaldo(){
        
        String mayor = cuentas.get(0).getNombreCuentahabiente() + "(" + cuentas.get(0).getSucursalApertura() + ")";
        String menor = cuentas.get(cuentas.size()-1).getNombreCuentahabiente() + "(" +cuentas.get(cuentas.size()-1).getSucursalApertura() + ")";
           
        return "Mayor saldo: " + mayor + "\n" + "Menor saldo: " + menor;
    }
}
