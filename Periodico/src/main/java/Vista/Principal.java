/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import datos.OperacionBD;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Principal {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacionBD op = new OperacionBD();

        op.conectar();
        

    }
}
