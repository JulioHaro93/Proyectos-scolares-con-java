/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.OperacionBD;
import java.util.ArrayList;
import modelo.Cuenta;
import modelo.Banco;

/**
 * Clase Principal o Main encargada de las instancias y llamada a metodos.
 * @author Haro Capetillo
 * @version 10/09/2022
 */
public class Principal {
    /**
     * @param args the command line arguments
     * @see <a href = "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html">Class ArrayList</a>
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        OperacionBD op = new OperacionBD();
        
        op.conectar();
        
        Banco b = new Banco(op.agregarCuentas());
        
        Cuenta c = new Cuenta("1228","Hugo Solis", 600, "XOC");
        
        System.out.println("SE ha agregado a:  "+ op.agregarCuenta(c));
        //op.borrarCuentas("1228");
        ArrayList<Cuenta> cuentas = op.mostrarCuentas();
            for (Cuenta cuenta : cuentas) {
                System.out.println(cuenta);
        }
        System.out.println("Saldo promedio de las sucursales: \n"+"AZC: " + b.calcularSaldoProm("AZC"));
        System.out.println("CUA: " + b.calcularSaldoProm("CUA"));
        System.out.println("XOC: "+ b.calcularSaldoProm("XOC"));
        
        System.out.println("Sucursal mayor numero de cuentas abiertas\n" + b.mayorNumCuentas());
        
        System.out.println("Sucursal menor saldo total\n" + b.calcularCuentaMenorSaldo());
        
        System.out.println("Cuentahabientes con mayor y menor saldo y sucursal de aperturo\n" + b.obtenerClienteMayorMenorSaldo());
        
        op.actualizarSucursalCuenta("1228", "CUA");
        op.desconectar();
        
    }
    
}
