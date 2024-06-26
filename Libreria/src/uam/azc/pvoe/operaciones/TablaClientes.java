/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.azc.pvoe.operaciones;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.Vector;
import uam.azc.pvoe.modelos.Cliente;

/**
 *
 * @author Julio Cesar Haro Capetillo 2202000415
 */
public class TablaClientes {
    
    /**
     * Método que le da el título a las tablas
     * 
     */
    public Vector<String> tituloColumnas(){
        Vector<String>listaTitulos = new Vector();
        
        
        UsuarioLogeado cargar = new UsuarioLogeado();
        ListaCliente listacli = new ListaCliente();
        LinkedList<Cliente> listaCliente = new LinkedList();
        /**
         * Cliente{
         * nombre= Cliente1, 
         * email= cliente1@libreria.com 
         * contrasena = cliente1 
         * curp= CN1WNU9KG5YDYGJSCU, 
         * genero= Femenino, 
         * direccion= la Direccion del cliente: cliente1, 
         * telefono= 15125506150, 
         * favoritos= [Ciencia Ficcion, Clasicos, Terror y Misterio], 
         * administrador = false 
         * Adeuda = false
         * Fecha de Registro =Fri Feb 21 02:18:33 CST 2003}
2017-09-05
         */
        //listaCliente = cargar.archivoClientes("clientes.txt", listaCliente);
    
        String nombre = "Nombre";
        listaTitulos.add(0, nombre);
        String email = "E-Mail";
        listaTitulos.add(1,email);
        String curp = "CURP";
        listaTitulos.add(2, curp);
        String genero = "Genero";
        listaTitulos.add(3, genero);
        String direccion = "Direccion";
        listaTitulos.add(4,direccion);
        String telefono = "Telefono";
        listaTitulos.add(5, telefono);
        String favoritos = "Generos Favoritos";
        listaTitulos.add(6,favoritos);
        String deudor= "Es Deudor?";
        listaTitulos.add(7, deudor);
        String fecha = "Fecha de Registro";
        listaTitulos.add(8, fecha);
        
       
        return listaTitulos;
    }
    
    public Vector elementosCelda() throws ParseException{
            Vector filas = new Vector();
            Vector<Object>fila;
            LeerUsuarioLog cargar = new LeerUsuarioLog();
            
            LinkedList<Cliente> listaTodos = new LinkedList();
    
            int nClientes;
            listaTodos = cargar.leerClientes("clientes.txt");
            nClientes = listaTodos.size();
            
            for(int i = 0; i< nClientes; i++){
                fila = new Vector();
                Cliente cliente = listaTodos.get(i);
                
                
                String nivel ="";
                String division ="";
                int contadorAux = 0;
                
                
                for(int j=contadorAux;j<listaTodos.size();j++){
                    Cliente clienteBase = listaTodos.get(j);
                    
                    if(cliente.getNombre().compareTo(clienteBase.getNombre())==0){
                        Cliente clienteAux = new Cliente();
                        clienteAux.setNombre(clienteBase.getNombre());
                        clienteAux.setEmail(clienteBase.getEmail());
                        clienteAux.setCurp(clienteBase.getCurp());
                        clienteAux.setDireccion(cliente.getDireccion());
                        clienteAux.setGenero(clienteBase.getGenero());
                        //String deudor = String.parseString(clienteBase.isDeudor());
                        clienteAux.setDeudor(clienteBase.isDeudor());
                        clienteAux.setTelefono(clienteBase.getTelefono());
                        clienteAux.setFechaRegistro(clienteBase.getFechaRegistro());
                        clienteAux.setFavoritos(clienteBase.getFavoritos());
                     contadorAux += 1;
                       /**
         * Cliente{
         * nombre= Cliente1, 
         * email= cliente1@libreria.com 
         * contrasena = cliente1 
         * curp= CN1WNU9KG5YDYGJSCU, 
         * genero= Femenino, 
         * direccion= la Direccion del cliente: cliente1, 
         * telefono= 15125506150, 
         * favoritos= [Ciencia Ficcion, Clasicos, Terror y Misterio], 
         * administrador = false 
         * Adeuda = false
         * Fecha de Registro =Fri Feb 21 02:18:33 CST 2003}
2017-09-05
         */
                     
                        fila.add(clienteAux.getNombre());
                        fila.add(clienteAux.getEmail());
                        fila.add(clienteAux.getCurp());
                        fila.add(clienteAux.getGenero());
                        fila.add(clienteAux.getDireccion());
                        fila.add(clienteAux.getTelefono());
                        fila.add(clienteAux.getFavoritos());
                        fila.add(clienteAux.isDeudor());
                        fila.add(clienteAux.getFechaRegistro());
                        fila.add(nivel);
                        fila.add(division);
                    }
                    clienteBase = new Cliente();
                }
                
                filas.add(fila);
            }
        return filas;
    }
    
    /**
     * Método que genera el vector que regresa los clientes deudores
     * @return Vector con los valores de las celdas
     * @throws ParseException 
     */
    public Vector elementosCeldaDeudores() throws ParseException{
            Vector filas = new Vector();
            Vector<Object>fila;
            LeerUsuarioLog cargar = new LeerUsuarioLog();
            
            LinkedList<Cliente> listaTodos = new LinkedList();
            
            int nClientes;
            listaTodos = cargar.leerClientes("clientes.txt");
            nClientes = listaTodos.size();
            LinkedList<Cliente> listaDeudores = new LinkedList();
            for(int i = 0; i< nClientes; i++){
                fila = new Vector();
                Cliente cliente = listaTodos.get(i);
                
                
                String nivel ="";
                String division ="";
                int contadorAux = 0;
                
                if(listaTodos.get(i).isDeudor()==true){
                for(int j=contadorAux;j<listaTodos.size();j++){
                    Cliente clienteBase = listaTodos.get(j);
                    
                    if(cliente.getNombre().compareTo(clienteBase.getNombre())==0){
                        Cliente clienteAux = new Cliente();
                        clienteAux.setNombre(clienteBase.getNombre());
                        clienteAux.setEmail(clienteBase.getEmail());
                        clienteAux.setCurp(clienteBase.getCurp());
                        clienteAux.setDireccion(cliente.getDireccion());
                        clienteAux.setGenero(clienteBase.getGenero());
                        //String deudor = String.parseString(clienteBase.isDeudor());
                        clienteAux.setDeudor(clienteBase.isDeudor());
                        clienteAux.setTelefono(clienteBase.getTelefono());
                        clienteAux.setFechaRegistro(clienteBase.getFechaRegistro());
                        clienteAux.setFavoritos(clienteBase.getFavoritos());
                     contadorAux += 1;
                       /**
         * Cliente{
         * nombre= Cliente1, 
         * email= cliente1@libreria.com 
         * contrasena = cliente1 
         * curp= CN1WNU9KG5YDYGJSCU, 
         * genero= Femenino, 
         * direccion= la Direccion del cliente: cliente1, 
         * telefono= 15125506150, 
         * favoritos= [Ciencia Ficcion, Clasicos, Terror y Misterio], 
         * administrador = false 
         * Adeuda = false
         * Fecha de Registro =Fri Feb 21 02:18:33 CST 2003}
2017-09-05
         */
                     
                        fila.add(clienteAux.getNombre());
                        fila.add(clienteAux.getEmail());
                        fila.add(clienteAux.getCurp());
                        fila.add(clienteAux.getGenero());
                        fila.add(clienteAux.getDireccion());
                        fila.add(clienteAux.getTelefono());
                        fila.add(clienteAux.getFavoritos());
                        fila.add(clienteAux.isDeudor());
                        fila.add(clienteAux.getFechaRegistro());
                        fila.add(nivel);
                        fila.add(division);
                    }
                    clienteBase = new Cliente();
                }
                }
                filas.add(fila);
            }
        return filas;
    }
    
}
