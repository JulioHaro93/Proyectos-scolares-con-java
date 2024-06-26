/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * Clase llamada cuenta que contiene los datos de los clientes
 * @author Haro Capetillo Julio Cesar
 * @version 10/09/2022
 */
public class Cuenta {
    
    private String numCuenta;
    private String nombreCuentahabiente;
    private double saldo;
    private String sucursalApertura;

    /**
     * Constructor por defecto
     */
    public Cuenta() {
    }

    /**
     * Constructor con parametros
     * @param numCuenta : inicializa el numero de cuenta
     * @param nombreCuentahabiente : inicializa el nombre del cuenta habiente
     * @param saldo : inicializa el saldo
     * @param sucursalApertura : inicializa la sucursal de apertura
     */
    public Cuenta(String numCuenta, String nombreCuentahabiente, double saldo, String sucursalApertura) {
        this.numCuenta = numCuenta;
        this.nombreCuentahabiente = nombreCuentahabiente;
        this.saldo = saldo;
        this.sucursalApertura = sucursalApertura;
    }

    /**
     * Metodo de acceso getter del atributo numCuenta
     * @return El valor del numero de cuenta
     */
    public String getNumCuenta() {
        return numCuenta;
    }

    /**
     * Metodo de acceso setter del atributo numCuent
     * @param numCuenta : establece el numero de cuenta
     */
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
     * Metodo de acceso getter del atributo nombreCuentahabiente
     * @return El nombre del cuenta habiente de la clase cuenta
     */
    public String getNombreCuentahabiente() {
        return nombreCuentahabiente;
    }

    /**
     * Metodo de acceso setter del atributo nombreCuentahabiente
     * @param nombreCuentahabiente : establece el nombre cuenta habiente
     */
    public void setNombreCuentahabiente(String nombreCuentahabiente) {
        this.nombreCuentahabiente = nombreCuentahabiente;
    }

    /**
     * Metodo de acceso getter del atributo saldo
     * @return El saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Metodo de acceso setter del atributo saldo
     * @param saldo : establece el valor de saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Metodo de acceso getter del atributo sucursal apertura
     * @return La sucursal de apertura
     */
    public String getSucursalApertura() {
        return sucursalApertura;
    }

    /**
     * Metodo de acceso setter del atributo sucural apertura
     * @param sucursalApertura : Establece la sucursal de apertura
     */
    public void setSucursalApertura(String sucursalApertura) {
        this.sucursalApertura = sucursalApertura;
    }

    /**
     * Sobreescribe el metodo toString de la clase Object
     * @return Cadena con la respresentacion de un objeto de tipo cuenta.
     * @see <a href = "https://docs.oracle.com/javase/10/docs/api/java/lang/Object.html">Clase Object</a>
     */
    @Override
    public String toString() {
        return "Numero de cuenta: " + numCuenta + ", Nombre Cuentahabiente: " + nombreCuentahabiente 
                + ", saldo: " + saldo + ", Sucursal de apertura: " + sucursalApertura;
    }
}