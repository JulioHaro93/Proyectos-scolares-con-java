/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.azc.pvoe.operaciones;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.Vector;
import uam.azc.pvoe.modelos.Cliente;
import uam.azc.pvoe.modelos.Proveedor;

/**
 *
 * @author Julio Cesar Haro Capetillo 2202000415
 */
public class TablaProveedores {

    
    /**
     * Método que le da el título a las tablas
     * 
     */
    public Vector<String> tituloColumnas(){
        Vector<String>listaTitulos = new Vector();
        
        
        UsuarioLogeado cargar = new UsuarioLogeado();
        ListaProveedores listacli = new ListaProveedores();
        LinkedList<Proveedor> listaProveedor = new LinkedList();
        /**
         *El libro es: Revista{
         * proveedor=Proveedor{nombreEditorial=Editorial Uam, 
         * rfc=IP7OUC4Y0CT98, 
         * direccion=Direccion de la editorial 4, 
         * telefono=21075324961, 
         * nombreRepresentante=Representante4 Apellido1, 
         * correoElectronico=editorial4@editorial4.com}
         */
    
        String editorial = "Editorial";
        listaTitulos.add(0, editorial);
        String rfc = "RFC";
        listaTitulos.add(1,rfc);
        String direccion = "Direccion";
        listaTitulos.add(2, direccion);
        String telefono = "Telefono";
        listaTitulos.add(3, telefono);
        String representante = "Representante";
        listaTitulos.add(4,representante);
        String email = "e-mail";
        listaTitulos.add(5, email);
        
       
        return listaTitulos;
    }
    
    public Vector elementosCelda() throws ParseException{
            Vector filas = new Vector();
            Vector<Object>fila;
            LeerUsuarioLog cargar = new LeerUsuarioLog();
            
            LinkedList<Proveedor> listaTodos = new LinkedList();
    
            int nClientes;
            listaTodos = cargar.leerProveedores("proveedores.txt");
            nClientes = listaTodos.size();
            
            for(int i = 0; i< nClientes; i++){
                fila = new Vector();
                Proveedor proveedor= listaTodos.get(i);
                
                
                String nivel ="";
                String division ="";
                int contadorAux = 0;
                
                
                for(int j=contadorAux;j<listaTodos.size();j++){
                    Proveedor proveedorBase = listaTodos.get(j);
                    
                    if(proveedor.getNombreEditorial().compareTo(proveedorBase.getNombreEditorial())==0){
                        Proveedor proveedorAux = new Proveedor();
                        proveedorAux.setNombreEditorial(proveedorBase.getNombreEditorial());
                        proveedorAux.setCorreoElectronico(proveedorBase.getCorreoElectronico());
                        proveedorAux.setRfc(proveedorBase.getRfc());
                        proveedorAux.setDireccion(proveedorBase.getDireccion());
                        proveedorAux.setTelefono(proveedorBase.getTelefono());
                        //proveedorAux.setTelefono(proveedorBase.getTelefono());
                        proveedorAux.setNombreRepresentante(proveedorBase.getNombreRepresentante());

                     contadorAux += 1;

                     
                        fila.add(proveedorAux.getNombreEditorial());
                        fila.add(proveedorAux.getRfc());
                        fila.add(proveedorAux.getDireccion());
                        fila.add(proveedorAux.getTelefono());;
                        fila.add(proveedorAux.getNombreRepresentante());
                        fila.add(proveedorAux.getCorreoElectronico());

                    }
                    proveedorBase = new Proveedor();
                }
                
                filas.add(fila);
            }
        return filas;
    }
    
   
    
    
}
