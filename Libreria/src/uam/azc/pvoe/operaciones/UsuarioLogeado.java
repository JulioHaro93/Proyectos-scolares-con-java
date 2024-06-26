/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.azc.pvoe.operaciones;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import uam.azc.pvoe.modelos.Administrador;
import uam.azc.pvoe.modelos.Cliente;
import uam.azc.pvoe.modelos.Libro;
import uam.azc.pvoe.modelos.Proveedor;
import uam.azc.pvoe.modelos.Revista;

/**
 * Metodo que crea un archivo con el usuario para mantenerlo loggeado al autenticarse en Principal
 * @author Julio Cesar Haro Capetillo 2202000415
 */
public class UsuarioLogeado {
    /**
     * Metodo que guarda un administrador al ser loggeado
     * @param nombreArchivo nombre del archivo que se va a crear
     * @param admin Administrador que es seleccionado en la clase principal
     */
    public void guardaAdministrador(String nombreArchivo, Administrador admin){
    
        try {
            FileWriter fw = new FileWriter(nombreArchivo);
            BufferedWriter archivoEscritura = new BufferedWriter(fw);
            archivoEscritura.write(admin.getNombre()+","+admin.getEmail()+","+admin.getPsw()+","+admin.isAdmin()+"\n");
            
            archivoEscritura.flush();
            //Recuerda que siempre es importante cuando se cierra el archivo, por si no jala.
            archivoEscritura.close();
            
        } catch (IOException ex) {
            Logger.getLogger(UsuarioLogeado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Recupera al usuario en caso de ser un cliente y crea un archivo con él
     * @param nombreArchivo nombre del archivo que va a crear
     * @param cliente nombre del cliente logeado
     */
    public void guardaCliente(String nombreArchivo, Cliente cliente){
        System.out.println("guardar cliente"+ cliente);
        try {

            FileWriter fw = new FileWriter(nombreArchivo);
            BufferedWriter archivoEscritura = new BufferedWriter(fw);
            //Recordar el orden en el que se están estableciendo aquí los elementos
            //para su posterior lectura, no la vaya yo a regar estableciendo un valor en donde no va
            archivoEscritura.write(cliente.getNombre()+"_"+cliente.getEmail()+"_"
                    +cliente.getPsw()+"_"+cliente.getCurp()+"_"+ cliente.getGenero()+"_"+
                    cliente.getDireccion()+"_"+cliente.getTelefono()+"_"+
                    cliente.getFavoritos()+"_"+cliente.isAdmin()+"_"+cliente.isDeudor()+"_"+cliente.getFechaRegistro()+"\n");
            archivoEscritura.flush();
            //Recuerda que siempre es importante cuando se cierra el archivo, por si no jala.
            archivoEscritura.close();
        } catch (IOException ex) {
            Logger.getLogger(UsuarioLogeado.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public void archivoProveedores(String nombreArchivo, LinkedList<Proveedor> prov){
        
        try {
            FileWriter fw = new FileWriter(nombreArchivo);
            BufferedWriter archivoEscritura = new BufferedWriter(fw);
            /*
            Proveedor{nombreEditorial=Editorial5, 
            rfc=Q8FUFER6B74EV, 
            direccion=Direcci�n de la editorial 5, 
            telefono=53033108154, 
            nombreRepresentante=Representante5 Apellido1, 
            correoElectronico=editorial5@editorial5.com}
            */
            for(int i =0; i<prov.size(); i++){
            archivoEscritura.write(prov.get(i).getNombreEditorial()+","+
                    prov.get(i).getRfc()+","+prov.get(i).getDireccion()+","+
                    prov.get(i).getTelefono()+","+prov.get(i).getNombreRepresentante()+","+
                    prov.get(i).getCorreoElectronico()+"\n");
            
            archivoEscritura.flush();
            //Recuerda que siempre es importante cuando se cierra el archivo, por si no jala.
            
            }
            archivoEscritura.close();
        } catch (IOException ex) {
            Logger.getLogger(UsuarioLogeado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    /**
     * Método que crea un archivo de todos los clientes
     * 
     * @param nombreArchivo
     * @param clientes
     */
    public void archivoClientes(String nombreArchivo, LinkedList<Cliente> clientes){
        
        try {
            FileWriter fw = new FileWriter(nombreArchivo);
            BufferedWriter archivoEscritura = new BufferedWriter(fw);
            /*
            Proveedor{nombreEditorial=Editorial5, 
            rfc=Q8FUFER6B74EV, 
            direccion=Direcci�n de la editorial 5, 
            telefono=53033108154, 
            nombreRepresentante=Representante5 Apellido1, 
            correoElectronico=editorial5@editorial5.com}
            */
            for(int i =0; i<clientes.size();i++){
                    archivoEscritura.write(clientes.get(i).getNombre()+"_"+clientes.get(i).getEmail()+"_"
                    +clientes.get(i).getPsw()+"_"+clientes.get(i).getCurp()+"_"+ clientes.get(i).getGenero()+"_"+
                    clientes.get(i).getDireccion()+"_"+clientes.get(i).getTelefono()+"_"+
                    clientes.get(i).getFavoritos()+"_"+clientes.get(i).isAdmin()+"_"+clientes.get(i).isDeudor()+"_"+clientes.get(i).getFechaRegistro()+"\n");
            archivoEscritura.flush();
            }
            //Recuerda que siempre es importante cuando se cierra el archivo, por si no jala.
            archivoEscritura.close();
        } catch (IOException ex) {
            Logger.getLogger(UsuarioLogeado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Crea un archivo con todos los libros registrados
     * @param nombreArchivo nombre que recibe el archivo
     * @param libros recibe una lista ligada de los libros
     */
        public void archivoLibros(String nombreArchivo, LinkedList<Libro> libros){
        
        try {
            FileWriter fw = new FileWriter(nombreArchivo);
            BufferedWriter archivoEscritura = new BufferedWriter(fw);
            /*
            Libro{proveedor=Proveedor{nombreEditorial=Fondo de Cultura Economica, rfc=96KUTWXLU6Y02, direccion=Direccion de la editorial 5, telefono=19746348495, nombreRepresentante=Representante5 Apellido1, correoElectronico=editorial5@editorial5.com}, 
    isbn=ISBN-DQBHQ9AZUC7, 
    titulo=Titulo20, 
    editorial=Fondo de Cultura Economica, 
    tipo=libro}*/

            for(int i =0; i<libros.size();i++){
                    archivoEscritura.write(libros.get(i).getProveedor()+"_"+libros.get(i).getIsbn()+"_"
                    +libros.get(i).getTitulo()+"_"+libros.get(i).getEditorial()+"_"+ libros.get(i).getTipo()+"\n");
            archivoEscritura.flush();
            }
            //Recuerda que siempre es importante cuando se cierra el archivo, por si no jala.
            archivoEscritura.close();
        } catch (IOException ex) {
            Logger.getLogger(UsuarioLogeado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        /*
                private Proveedor proveedor = new Proveedor();
    private String isbn;
    private String titulo;
    private String editorial = proveedor.getNombreEditorial();
    private String tipo = "revista";
    private int num;
    private int cantidadDisponible;
            
            */
        
        public void archivoRevistas(String nombreArchivo, LinkedList<Revista> revistas){
        
        try {
            FileWriter fw = new FileWriter(nombreArchivo);
            BufferedWriter archivoEscritura = new BufferedWriter(fw);
            /*
            Proveedor{nombreEditorial=Pearson, rfc=50MLTTZI94EDY, direccion=Direccion de la editorial 3, telefono=43641709113, nombreRepresentante=Representante3 Apellido1, correoElectronico=editorial3@editorial3.com}
            _ISBN-5DMI82UPRY7
            _Titulo0
            _Pearson
            _revista
            _29
            _3
proveedor,isbn,titulo,editorial,tipo, num, cantidad
            */

            for(int i =0; i<revistas.size();i++){
                    archivoEscritura.write(revistas.get(i).getProveedor()+"_"+revistas.get(i).getIsbn()+"_"
                    +revistas.get(i).getTitulo()+"_"+revistas.get(i).getEditorial()+"_"+ revistas.get(i).getTipo()+"_"+
                            revistas.get(i).getNum()+"_"+revistas.get(i).getCantidadDisponible()+"\n");
            archivoEscritura.flush();
            }
            //Recuerda que siempre es importante cuando se cierra el archivo, por si no jala.
            archivoEscritura.close();
        } catch (IOException ex) {
            Logger.getLogger(UsuarioLogeado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    /*
        Proveedor{nombreEditorial=Mac Graw Hill, rfc=7AHKT84LY6UXK, direccion=Direccion de la editorial 2, telefono=21917949947, nombreRepresentante=Representante2 Apellido1, correoElectronico=editorial2@editorial2.com}_ISBN-THOIVCWA7V2_Titulo20_Mac Graw Hill_Libro
        */
}