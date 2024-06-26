/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.azc.pvoe.operaciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.String.format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import uam.azc.pvoe.modelos.Administrador;
import uam.azc.pvoe.modelos.Cliente;
import uam.azc.pvoe.modelos.Libro;
import uam.azc.pvoe.modelos.Proveedor;
import uam.azc.pvoe.modelos.Revista;


/**
 * Metodo que lee el usuario logeado
 * @author Julio Cesar Haro Capetillo 2202000415
 */
public class LeerUsuarioLog {
    
    public Administrador leerAdministrador(String na){
        Administrador administrador = new Administrador();
        FileReader fr;
        String cadenaLeida="";
        
        try {
            fr = new FileReader(na);
            BufferedReader archivoLectura = 
                    new BufferedReader(fr);
           cadenaLeida=archivoLectura.readLine();
           
           while(cadenaLeida!=null){
               StringTokenizer st = 
                       new StringTokenizer(cadenaLeida,
                       ",");
               
               String nombre= st.nextToken();
               String email = st.nextToken();
               String psw = st.nextToken();
               boolean admin = Boolean.parseBoolean(st.nextToken());
               
               Administrador admon = 
                       new Administrador(nombre,email,psw,admin);
               
               System.out.println(admon.toString());
               administrador = admon;
               cadenaLeida=archivoLectura.readLine();
               System.out.println("#######"+administrador);
           }
           archivoLectura.close();
           
            
            
        } catch (FileNotFoundException ex) {
            System.err.println("No se encuentra");
        } catch (IOException ex) {
            Logger.getLogger(LeerUsuarioLog.class.getName()).log(Level.SEVERE, null, ex);
        }
        return administrador;
    }
    
    public Cliente leerCliente(String na) throws ParseException{
        Cliente cliente = new Cliente();
        FileReader fr;
        String cadenaLeida="";
        LinkedList<String> list = new LinkedList();
        try {
            fr = new FileReader(na);
            BufferedReader archivoLectura = 
                    new BufferedReader(fr);
           cadenaLeida=archivoLectura.readLine();
           
           while(cadenaLeida!=null){
               StringTokenizer st = 
                       new StringTokenizer(cadenaLeida,
                       "_");
            /*
               nombre=Cliente1
Exception in thread "AWT-EventQueue-0" java.util.NoSuchElementException
,email=cliente1@libreria.com
,pass=cliente1
, curp=M7WKAP1BQON19XHYRJ
, genero=Masculino
, direccion=la Direccion del cliente
, tel= cliente1
, favoritos:=13556417234
13556417234
               */
               String nombre= st.nextToken();
               System.out.println("nombre="+nombre);
               String email = st.nextToken();
               System.out.println(",email="+email);
               String psw = st.nextToken();
               System.out.println(",pass="+psw);
               String curp = st.nextToken();
               System.out.println(", curp="+curp);
               String genero = st.nextToken();
               System.out.println(", genero="+genero);
               String direccion = st.nextToken();
               System.out.println(", direccion="+direccion);
               String tel = st.nextToken();
               System.out.println(", tel="+tel);
               String fav = st.nextToken();
               System.out.println(", favoritos:="+fav);
               list = favoritos(fav);
               //SimpleDateFormat formato = new SimpleDateFormat(st.nextToken());
               //String fecha = st.nextToken();
               
               String fecha = st.nextToken();
               System.out.println(fecha);
               // public Cliente(String curp, String genero, String direccion, String telefono, boolean deudor, String nombre, String email, String psw, boolean admin) {
               boolean admin = Boolean.parseBoolean(st.nextToken());
               System.out.println(admin);
               boolean deudor = Boolean.parseBoolean(st.nextToken());
               System.out.println(deudor);
               Cliente cli =  new Cliente(curp, genero, direccion, tel, deudor, nombre, email, psw,admin, list, fecha);
               
               System.out.println(cli.toString());
               cliente = cli;
               cadenaLeida=archivoLectura.readLine();
               System.out.println("#######"+cli);
           }
           archivoLectura.close();
           
            
            
        } catch (FileNotFoundException ex) {
            System.err.println("No se encuentra");
        } catch (IOException ex) {
            Logger.getLogger(LeerUsuarioLog.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }
    
    /**
     * Metodo que limpia un string para poderlo agrega
     * a la lista de favoritos
     * @param st string que recibe
     * @return Lista con los strings separados
     * 
     */
    public LinkedList<String> favoritos(String st){
        String cadena = st;
        LinkedList<String> list = new LinkedList();
        //cadena = cadena.replaceAll("[^a-zA-Z]","[]");
        System.out.println(cadena);
        
            StringTokenizer token = new StringTokenizer(cadena, ",");
            while(token.hasMoreTokens()){
                
                list.add(token.nextToken());
                //System.out.println(token.nextToken());
                
            }
        return list;
    }
    
    public LinkedList<Cliente> leerClientes(String na) throws ParseException{
        Cliente cliente = new Cliente();
        FileReader fr;
        String cadenaLeida="";
        LinkedList<Cliente> listaClientes = new LinkedList();
        LinkedList<String> list = new LinkedList();
       
        try {
            fr = new FileReader(na);
            BufferedReader archivoLectura = 
                    new BufferedReader(fr);
           cadenaLeida=archivoLectura.readLine();
           
           while(cadenaLeida!=null){
               StringTokenizer st = 
                       new StringTokenizer(cadenaLeida,
                       "_");
               String nombre= st.nextToken();
               System.out.println("nombre="+nombre);
               String email = st.nextToken();
               System.out.println(",email="+email);
               String psw = st.nextToken();
               System.out.println(",pass="+psw);
               String curp = st.nextToken();
               System.out.println(", curp="+curp);
               String genero = st.nextToken();
               System.out.println(", genero="+genero);
               String direccion = st.nextToken();
               System.out.println(", direccion="+direccion);
               String tel = st.nextToken();
               System.out.println(", tel="+tel);
               String fav = st.nextToken();
               System.out.println(", favoritos:="+fav);
               list = favoritos(fav);
               // public Cliente(String curp, String genero, String direccion, String telefono, boolean deudor, String nombre, String email, String psw, boolean admin) {
               
               
               boolean admin = Boolean.parseBoolean(st.nextToken());
               System.out.println(admin);
               boolean deudor = Boolean.parseBoolean(st.nextToken());
               System.out.println(deudor);
               String fecha = st.nextToken();
               Cliente cli =  new Cliente(curp, genero, direccion, tel, deudor, nombre, email, psw,admin, list, fecha);
               
               System.out.println(cli.toString());
               cliente = cli;
               cadenaLeida=archivoLectura.readLine();
               System.out.println("#######"+cli);
               listaClientes.add(cli);
           }
           archivoLectura.close();
           
            
            
        } catch (FileNotFoundException ex) {
            System.err.println("No se encuentra");
        } catch (IOException ex) {
            Logger.getLogger(LeerUsuarioLog.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaClientes;
    }
    /**
     * Método que lee los libros registrados en el archivo libros.txt
     * @param librostxt
     * @return 
     * @throws java.text.ParseException 
     */
    LinkedList<Libro> leerLibros(String na) throws ParseException{
        int a =0;
        Libro libro = new Libro();
        FileReader fr;
        String cadenaLeida="";
        LinkedList<Libro> listaLibros = new LinkedList();
        LinkedList<String> list = new LinkedList();
       
        try {
            fr = new FileReader(na);
            BufferedReader archivoLectura = 
                    new BufferedReader(fr);
           cadenaLeida=archivoLectura.readLine();
           
           while(cadenaLeida!=null){
               StringTokenizer st = 
                       new StringTokenizer(cadenaLeida,
                       "_");
               
                       /**
         * El libro es: Libro{proveedor=Proveedor{nombre Editorial=Editorial Uam, rfc=F3IB2FCI9WJ5V, direccion=Direccion de la editorial 4, telefono=40888617055, nombreRepresentante=Representante4 Apellido1, correoElectronico=editorial4@editorial4.com}, 
         * isbn=ISBN-FVSRA3ATVOK, 
         * titulo=Titulo18, 
         * editorial=Editorial Uam, 
         * tipo=libro}
         * proveedor=Proveedor{nombreEditorial=Editorial Uam, rfc=543DC1NA5LUXW, direccion=Direccion de la editorial 4, telefono=50667979024, nombreRepresentante=Representante4 Apellido1, correoElectronico=editorial4@editorial4.com}, isbn=ISBN-S1XPW5MD1VE, titulo=Titulo20, editorial=Editorial Uam, tipo=revista, num=48, cantidadDisponible=9}
         */
               ListaProveedores listaProv = new ListaProveedores();
               LinkedList<Proveedor> proveedores = listaProv.llenaProveedor();
               Proveedor proveedor = new Proveedor();
               String nombre= st.nextToken();
               for(int i = 0; i<proveedores.size();i++){
                   if(proveedores.get(i).getNombreEditorial().compareTo(nombre)==0){
                       proveedor = proveedores.get(i);
                   }
               }
               
               System.out.println("LecturaProveedor="+nombre);
               String isbn = st.nextToken();
               System.out.println("isbn="+isbn);
               String titulo = st.nextToken();
               String editorial = st.nextToken();
               System.out.println("Editorial"+editorial);
               String tipo = st.nextToken();
               System.out.println("tipo"+tipo);
               /*
               Libro(String isbn, String titulo, String editorial,String tipo) 
               */
               
               Libro lib = new Libro(proveedor,isbn,titulo,editorial,tipo);
               
               System.out.println(lib.toString());
               libro = lib;
               cadenaLeida=archivoLectura.readLine();
               System.out.println("#######"+lib);
               listaLibros.add(lib);
               
               System.out.println("leerusuariolog"+listaLibros.get(a));
           }
           archivoLectura.close();
           
            
            
        } catch (FileNotFoundException ex) {
            System.err.println("No se encuentra");
        } catch (IOException ex) {
            Logger.getLogger(LeerUsuarioLog.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaLibros;
    }
    /**
     * Método que lee los libros registrados en el archivo revistas.txt
     * @param na archivo revistas.txt
     * @return una lista de libros
     */
    public LinkedList<Revista> leerRevistas(String na) throws ParseException{
        Revista revista = new Revista();
        FileReader fr;
        String cadenaLeida="";
        LinkedList<Revista> listaRevistas = new LinkedList();
        
        ListaReviistas listaRevistas1 = new ListaReviistas();
        listaRevistas = listaRevistas1.llenaRev();
        LinkedList<String> list = new LinkedList();
       
        try {
            fr = new FileReader(na);
            BufferedReader archivoLectura = 
                    new BufferedReader(fr);
           cadenaLeida=archivoLectura.readLine();
           
           while(cadenaLeida!=null){
               StringTokenizer st = 
                       new StringTokenizer(cadenaLeida,
                       "_");

               ListaProveedores listaProv = new ListaProveedores();
               LinkedList<Proveedor> proveedores = listaProv.llenaProveedor();
               Proveedor proveedor = new Proveedor();
               String nombre= st.nextToken();
               for(int i = 0; i<proveedores.size();i++){
                   if(proveedores.get(i).getNombreEditorial().compareTo(nombre)==0){
                       proveedor = proveedores.get(i);
                   }
               }
        /*
        * Proveedor{nombreEditorial=Pearson, rfc=HUMMIFFV1JYSN, direccion=Direccion de la editorial 3, telefono=51861071477, nombreRepresentante=Representante3 Apellido1, correoElectronico=editorial3@editorial3.com}
               _ISBN-8LH1O5SZF3O
               _Titulo1
               _Pearson
               _revista
               _6
               _6

        */
               System.out.println("LecturaProveedor="+nombre);
               String isbn = st.nextToken();
               System.out.println("isbn="+isbn);
               String titulo = st.nextToken();
               String editorial = st.nextToken();
               System.out.println("Editorial"+editorial);
               String tipo = st.nextToken();
               System.out.println("tipo"+tipo);
               int num = Integer.parseInt(st.nextToken());
               System.out.println(num);
               int cantidad = Integer.parseInt(st.nextToken());
               System.out.println(cantidad);
 
               Revista lib = new Revista(proveedor,isbn,titulo,editorial,tipo, num, cantidad);
               
               System.out.println(lib.toString());
               revista = lib;
               cadenaLeida=archivoLectura.readLine();
               System.out.println("#######"+lib);
               listaRevistas.add(lib);
           }
           archivoLectura.close();
           
            
            
        } catch (FileNotFoundException ex) {
            System.err.println("No se encuentra");
        } catch (IOException ex) {
            Logger.getLogger(LeerUsuarioLog.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaRevistas;
    }

        public LinkedList<Proveedor> leerProveedores(String na) throws ParseException{
        Proveedor proveedor = new Proveedor();
        FileReader fr;
        String cadenaLeida="";
        LinkedList<Proveedor> listaProveedores = new LinkedList();
        LinkedList<String> list = new LinkedList();
       
        try {
            fr = new FileReader(na);
            BufferedReader archivoLectura = 
                    new BufferedReader(fr);
           cadenaLeida=archivoLectura.readLine();
           
           while(cadenaLeida!=null){
               StringTokenizer st = 
                       new StringTokenizer(cadenaLeida,
                       ",");
               
               /*
               Pearson,O8KZDZ0IEMFZN,
               Direccion de la editorial 3,
               43605619321,R
               epresentante3 
               Apellido1editorial3@editorial3.com
               */
               
               String editorial= st.nextToken();
               System.out.println("nombre="+editorial);
               String rfc = st.nextToken();
               System.out.println(",email="+rfc);
               String direccion = st.nextToken();
               System.out.println(",pass="+direccion);
               String telefono = st.nextToken();
               String representante = st.nextToken();
               System.out.println(", curp="+representante);
               String email = st.nextToken();
               System.out.println(", genero="+email);
               
               
     
              Proveedor prov = new Proveedor(editorial,rfc,direccion,telefono,representante,email);
               
               System.out.println(prov.toString());
               proveedor = prov;
               cadenaLeida=archivoLectura.readLine();
               System.out.println("#######"+prov);
               listaProveedores.add(prov);
           }
           archivoLectura.close();
           
            
            
        } catch (FileNotFoundException ex) {
            System.err.println("No se encuentra");
        } catch (IOException ex) {
            Logger.getLogger(LeerUsuarioLog.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaProveedores;
    }
    
}
