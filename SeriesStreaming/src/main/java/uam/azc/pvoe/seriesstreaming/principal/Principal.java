/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package uam.azc.pvoe.seriesstreaming.principal;

import uam.azc.pvoe.seriesstreaming.operaciones.Lectura;

/**
 * Clase principal.
 * @author Haro Capetillo Julio Cesar 2202000415
 */
public class Principal {

    public static void main(String[] args) {
        Lectura le = new Lectura();
        System.out.println("Todas las series:\n");
        le.leer("streaming.dat");
        System.out.println("_______________________");
        le.seriesAmazon();
        le.seriesDisney();
        le.seriesMasDeQuince();
        le.seriesNetflix();
        le.seriesHBO();
        
    }
}
