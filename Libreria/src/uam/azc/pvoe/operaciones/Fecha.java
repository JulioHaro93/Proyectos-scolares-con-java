/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.azc.pvoe.operaciones;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import uam.azc.pvoe.modelos.Cliente;

/**
 * 
 * @author Julio Cesar Haro Capetillo 2202000415
 */
public class Fecha {
    private Random rand = new Random();
    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    private Calendar cal = Calendar.getInstance();
    private Cliente cliente = new Cliente();
    /**
     * Genera una fecha aleatoria que se puede usar en un Cliente como
     * registro
     * @return 
     */
    public String fechaRegistro(){
        cal.set(2000,0,1);
        long start = cal.getTimeInMillis();
        cal.set(2022, 10,1);
        long end = cal.getTimeInMillis();
        Date d = new Date(start +(long)(rand.nextDouble()*(end-start)));
        
        System.out.println(format.format(d));
        return d.toString();
    }
    /**
     * Genera una fecha aleatoria que se puede usar en un cliente como
     * préstamo
     * @return 
     */
    public Date fechaPrestamo(){
        cal.set(2000,0,1);
        long start = cal.getTimeInMillis();
        cal.set(2022, 10,1);
        long end = cal.getTimeInMillis();
        Date d = new Date(start +(long)(rand.nextDouble()*(end-start)));
        
        System.out.println(format.format(d));
        return d;
        
    }
}
