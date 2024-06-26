/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.azc.pvoe.modelos;

/**
 *
 * @author Julio Cesar Haro Capetillo 2202000415
 */
public class Proveedor {
    private String nombreEditorial;
    private String rfc;
    private String direccion;
    private String telefono;
    private String nombreRepresentante;
    private String correoElectronico;
    /**
     * metodo que sobre carga el método constructor
     */
    public Proveedor() {
    }
    
    /**
     * método constructor por defecto
     * @param nombreEditorial nombre de la editorial
     * @param rfc RFC de la editorial
     * @param direccion Dirección en donde se encuentran las oficinas de la editorial
     * @param telefono Número de teléfono de contacto de la editorial
     * @param nombreRepresentante Nombre del respresentante legal de la editorial
     * @param correoElectronico Correo electrónico de la editorial
     */
    public Proveedor(String nombreEditorial, String rfc, String direccion, String telefono, String nombreRepresentante, String correoElectronico) {
        this.nombreEditorial = nombreEditorial;
        this.rfc = rfc;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nombreRepresentante = nombreRepresentante;
        this.correoElectronico = correoElectronico;
    }
    /**
     * Método getter del nombre de la editorial
     * @return un string con el nombre de la editorial
     */
    public String getNombreEditorial() {
        return nombreEditorial;
    }
    /**
     * metodo setter de la editorial
     * @param nombreEditorial establece el nombre de una editorial
     */
    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }
    /**
     * metodo getter del rfc
     * @return el valor del RFC de una editorial
     */
    public String getRfc() {
        return rfc;
    }
    /**
     * metodo setter de un rfc
     * @param rfc establece el valor del RFC de una editorial
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    /**
     * metodo getter de la dirección
     * @return la dirección de una editorial
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * metodo setter de la dereccíon
     * @param direccion establece la dirección de una editorial
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * método getter del teléfono
     * @return el valor del teléfono de una editorial
     */
    public String getTelefono() {
        return telefono;
    }
    /**
     * método setter del teléfono
     * @param telefono establece el valor del teléfono de una editorial
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    /**
     * obtiene el nombre del representante de una editorial
     * @return el nombre del representante de una editorial
     */
    public String getNombreRepresentante() {
        return nombreRepresentante;
    }
    /**
     * método setter del nombre del representante de una editorial
     * @param nombreRepresentante establece el nombre de un representante de una editorial
     */
    public void setNombreRepresentante(String nombreRepresentante) {
        this.nombreRepresentante = nombreRepresentante;
    }
    /**
     * Método getter del correo de la editorial
     * @return el correo de la editorial
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    /**
     * método setter del correo de la editorial
     * @param correoElectronico establece el correo de la editorial
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    /**
     * método to string
     * @return regresa los valores de la editorial
     */
    @Override
    public String toString() {
        return "Proveedor{" + "nombreEditorial=" + nombreEditorial + ", rfc=" + rfc + ", direccion=" + direccion + ", telefono=" + telefono + ", nombreRepresentante=" + nombreRepresentante + ", correoElectronico=" + correoElectronico + '}';
    }
    
}
