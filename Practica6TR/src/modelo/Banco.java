/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import datos.OperacionBD;
import java.util.ArrayList;
/**
 *
 * @author Alumno
 */
public class Banco extends OperacionBD {
    
    private ArrayList<Cuenta> cuentas;
    
    public Banco() {
        
    }

    public Banco(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
    /**
     *
     * @param sucursalApertura
     * @return
     */
    public double calcularPromedio(String sucursalApertura){
        
        double promedio = 0;
        double saldt = 0;
        int i = 0;
            for (Cuenta cuenta : cuentas) {
                if(cuenta.getSucursalApertura().equals(sucursalApertura)){
                    i++;
                    saldt += cuenta.getSaldo();
                    promedio = saldt/i;
            }
        }
        return promedio;
}    
     
    public String mayorCuentas(){
        
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
    
    public String obtenerClienteMayorMenorSaldo(){
        
        String mayor = cuentas.get(0).getNombreCuentahabiente() + "(" + cuentas.get(0).getSucursalApertura() + ")";
        String menor = cuentas.get(cuentas.size()-1).getNombreCuentahabiente() + "(" +cuentas.get(cuentas.size()-1).getSucursalApertura() + ")";
           
        return "Cuenta con mayor saldo: " + mayor + "\n" + "Cuenta con menor saldo: " + menor;
    }
}
