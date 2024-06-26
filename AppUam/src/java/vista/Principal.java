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

/**
 *
 * @author Profesor
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacionBD op = new OperacionBD();

        op.conectar();
        op.desconectar();
    }

}

