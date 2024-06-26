/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.OperacionBD;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Banco;
import modelo.Cuenta;

/**
 *
 * @author Alumno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws SQLException {
    OperacionBD op = new OperacionBD();
        
        op.conectar();
        
        Banco b = new Banco(op.agregarCuentas());
        
        Cuenta c = new Cuenta("1228","Hugo Solis", 600, "XOC");
        
        
        ArrayList<Cuenta> cuentas = op.mostrarCuentas();
            for (Cuenta cuenta : cuentas) {
                System.out.println(cuenta);
        }
        System.out.println("Saldo promedio de las sucursales: \n"+"AZC: " + b.calcularSaldoProm("AZC"));
        System.out.println("CUA: " + b.calcularSaldoProm("CUA"));
        System.out.println("XOC: "+ b.calcularSaldoProm("XOC"));
        
        System.out.println("Sucursal mayor numero de cuentas abiertas\n" + b.mayorNumCuentas());
        
        System.out.println("Sucursal menor saldo total\n" + b.calcularCuentaMenorSaldo());
        
        System.out.println("Cuentahabientes con mayor y menor saldo y sucursal de aperturo\n" + b.calcularCuentaMenorSaldo());
        //op.agregarCuenta(c);
        //op.borrarCuentas("1228");
        
        op.desconectar();
        
    }
    
    
}
    
    
