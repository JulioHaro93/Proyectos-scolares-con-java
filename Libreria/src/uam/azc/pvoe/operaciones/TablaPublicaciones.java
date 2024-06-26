/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.azc.pvoe.operaciones;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.Vector;
import uam.azc.pvoe.modelos.Cliente;
import uam.azc.pvoe.modelos.Libro;
import uam.azc.pvoe.modelos.Revista;

/**
 *
 * @author Julio Cesar Haro Capetillo 2202000415
 */
public class TablaPublicaciones {
    
        /**
     * Método que le da el título a las tablas
     * 
     */
    public Vector<String> tituloColumnasLibro(){
        
        Vector<String>listaTitulos = new Vector();
        UsuarioLogeado cargar = new UsuarioLogeado();
        ListaLibro listalib = new ListaLibro();
        LinkedList<Libro> listaLibro = new LinkedList();
    
        String nombre = "ISBN";
        listaTitulos.add(0, nombre);
        String isbn = "Titulo";
        listaTitulos.add(1,isbn);
        String titulo = "Editorial";
        listaTitulos.add(2, titulo);
        String editorial = "Es libro";
        listaTitulos.add(3, editorial);
        
       
        return listaTitulos;
    }
    /**
     * Metodo que genera los elementos de las celdas
     * @return un Vector con los elementos de una celsa
     * @throws ParseException En caso de que no exista el archivo libros.txt
     */
    public Vector elementosCeldaLibro() throws ParseException{
            Vector filas = new Vector();
            Vector<Object>fila;
            LeerUsuarioLog cargar = new LeerUsuarioLog();
            
            LinkedList<Libro> listaLibros = new LinkedList();
    
            int nLibros;
            listaLibros= cargar.leerLibros("libros.txt");
            nLibros= listaLibros.size();
            
            for(int i = 0; i< nLibros; i++){
                fila = new Vector();
                Libro libro = listaLibros.get(i);
                
                
                String nivel ="";
                String division ="";
                int contadorAux = 0;
                
                
                for(int j=contadorAux;j<listaLibros.size();j++){
                    Libro libroBase = listaLibros.get(j);
                    
                    if(libro.getTitulo().compareTo(libroBase.getTitulo())==0){
                        Libro libroAux = new Libro();
                        libroAux = libroBase;
                        
                        libro.setProveedor(libroAux.getProveedor());
                        libro.setIsbn(libroAux.getIsbn());
                        libro.setEditorial(libroAux.getEditorial());
                        libro.setTitulo(libroAux.getTitulo());
                        libro.setTipo("Libro");
                        
                     contadorAux += 1;
                        fila.add(libro.getIsbn());
                        fila.add(libro.getTitulo());
                        fila.add(libro.getEditorial());
                        fila.add(libro.getTipo());

                    }
                    libroBase = new Libro();
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
    
    /*
    Proveedor{nombreEditorial=Mac Graw Hill, 
    rfc=JNA2DWOGKTNM8, 
    direccion=Direccion de la editorial 2, 
    telefono=13657268151, 
    nombreRepresentante=Representante2 Apellido1, correoElectronico=editorial2@editorial2.com}_
    ISBN-MEHZMTVB1O0_
    Titulo9_
    Mac Graw Hill_
    revista91_4
    */
        
        /**
     * Método que le da el título a las tablas
     * 
     */
    public Vector<String> tituloColumnasRevista(){
        
        Vector<String>listaTitulos = new Vector();
        UsuarioLogeado cargar = new UsuarioLogeado();
        ListaLibro listalib = new ListaLibro();
        LinkedList<Libro> listaLibro = new LinkedList();
    
        String nombre = "ISBN";
        listaTitulos.add(0, nombre);
        String isbn = "Titulo";
        listaTitulos.add(1,isbn);
        String titulo = "Editorial";
        listaTitulos.add(2, titulo);
        String editorial = "Es Revista";
        listaTitulos.add(3, editorial);
        String numero = "Numero de revista";
        listaTitulos.add(3,numero);
        String disponibles ="Disponibilidad";
        listaTitulos.add(4, disponibles);
        
       
        return listaTitulos;
    }
    
        /**
     * Metodo que genera los elementos de las celdas
     * @return un Vector con los elementos de una celsa
     * @throws ParseException En caso de que no exista el archivo libros.txt
     */
    public Vector elementosCeldaRevista() throws ParseException{
            Vector filas = new Vector();
            Vector<Object>fila;
            LeerUsuarioLog cargar = new LeerUsuarioLog();
            
            LinkedList<Revista> listaRevistas = new LinkedList();
    
            int nLibros;
            listaRevistas= cargar.leerRevistas("revistas.txt");
            nLibros= listaRevistas.size();
            
            for(int i = 0; i< nLibros; i++){
                fila = new Vector();
                Revista revista = listaRevistas.get(i);
                
                
                String nivel ="";
                String division ="";
                int contadorAux = 0;
                
                
                for(int j=contadorAux;j<listaRevistas.size();j++){
                    Revista revistaBase = listaRevistas.get(j);
                    
                    if(revista.getTitulo().compareTo(revistaBase.getTitulo())==0){
                        Revista revistaAux = new Revista();
            
                        
                        revistaAux.setProveedor(revistaBase.getProveedor());
                        revistaAux.setIsbn(revistaBase.getIsbn());
                        revistaAux.setEditorial(revistaBase.getEditorial());
                        revistaAux.setTitulo(revistaBase.getTitulo());
                        revistaAux.setTipo("Revista");
                        revistaAux.setNum(revistaBase.getNum());
                        revistaAux.setCantidadDisponible(revistaBase.getCantidadDisponible());
                        
                     contadorAux += 1;
                     
                        fila.add(revistaAux.getIsbn());
                        fila.add(revistaAux.getTitulo());
                        fila.add(revistaAux.getEditorial());
                        fila.add(revistaAux.getTipo());
                        fila.add(String.valueOf(revistaAux.getNum()));
                        fila.add(String.valueOf(revistaAux.getCantidadDisponible()));

                    }
                    revistaBase = new Revista();
                }
                
                filas.add(fila);
            }
        return filas;
    }
    
    public Vector elementosCeldaRevistaPorrua() throws ParseException{
            Vector filas = new Vector();
            Vector<Object>fila;
            LeerUsuarioLog cargar = new LeerUsuarioLog();
            
            LinkedList<Revista> listaRevistas = new LinkedList();
    
            int nLibros;
            listaRevistas= cargar.leerRevistas("revistas.txt");
            nLibros= listaRevistas.size();
            
            for(int i = 0; i< nLibros; i++){
                fila = new Vector();
                
                
                Revista revista = listaRevistas.get(i);
                
                
                String nivel ="";
                String division ="";
                int contadorAux = 0;
                
                
                for(int j=contadorAux;j<listaRevistas.size();j++){
                    if(listaRevistas.get(i).getEditorial().compareTo("Porrua")==0){
                    Revista revistaBase = listaRevistas.get(j);
                    
                    if(revista.getTitulo().compareTo(revistaBase.getTitulo())==0){
                        
                        Revista revistaAux = new Revista();
            
                        
                        revistaAux.setProveedor(revistaBase.getProveedor());
                        revistaAux.setIsbn(revistaBase.getIsbn());
                        revistaAux.setEditorial(revistaBase.getEditorial());
                        revistaAux.setTitulo(revistaBase.getTitulo());
                        revistaAux.setTipo("Revista");
                        revistaAux.setNum(revistaBase.getNum());
                        revistaAux.setCantidadDisponible(revistaBase.getCantidadDisponible());
                        
                     contadorAux += 1;
                     
                        fila.add(revistaAux.getIsbn());
                        fila.add(revistaAux.getTitulo());
                        fila.add(revistaAux.getEditorial());
                        fila.add(revistaAux.getTipo());
                        fila.add(String.valueOf(revistaAux.getNum()));
                        fila.add(String.valueOf(revistaAux.getCantidadDisponible()));

                    }
                    revistaBase = new Revista();
                }
                
                filas.add(fila);
            }
            }
        return filas;
    }
    
}
