/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Alumno
 */
public class Cuenta {
    
        
     private String numCuenta;
     private String nombreCuentahabiente;
     private double saldo;
     private String sucursalApertura;

    public Cuenta() {
    }

    public Cuenta(String numCuenta, String nombreCuentahabiente, int saldo, String sucursalApertura) {
        this.numCuenta = numCuenta;
        this.nombreCuentahabiente = nombreCuentahabiente;
        this.saldo = saldo;
        this.sucursalApertura = sucursalApertura;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public String getNombreCuentahabiente() {
        return nombreCuentahabiente;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getSucursalApertura() {
        return sucursalApertura;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setNombreCuentahabiente(String nombreCuentahabiente) {
        this.nombreCuentahabiente = nombreCuentahabiente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setSucursalApertura(String sucursalApertura) {
        this.sucursalApertura = sucursalApertura;
    }

    @Override
    public String toString() {
        return "Banco{" + "numCuenta=" + numCuenta + ", nombreCuentahabiente=" 
                + nombreCuentahabiente + ", saldo=" + saldo + ", sucursalApertura=" + sucursalApertura + '}';
    }
     

    
}
