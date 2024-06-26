/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.azc.pvoe.modelos;

import java.util.Date;
import java.util.LinkedList;
import uam.azc.pvoe.operaciones.Fecha;

/**
 *
 * @author Julio Cesar Haro Capetillo 2202000415
 */
public class Cliente extends Usuario{
    
    private String curp;
    private String genero;
    private String direccion;
    private String telefono;
    private LinkedList<String> favoritos = new LinkedList();
    private boolean deudor;
    private String fechaRegistro;
    
    public Cliente() {
    }

    public Cliente(String curp, String genero, String direccion, String telefono, boolean deudor, String nombre, String email, String psw, boolean admin, LinkedList<String> favoritos, String fechaRegistro) {
        super(nombre, email, psw, admin=false);
        this.curp = curp;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
        this.deudor = deudor;
        this.favoritos= favoritos;
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isDeudor() {
        return deudor;
    }

    public void setDeudor(boolean deudor) {
        this.deudor = deudor;
    }
    
    @Override
    public String getPsw() {
        return psw;
    }

    @Override
    public void setPsw(String psw) {
        this.psw = psw;
    }
    
    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LinkedList<String> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(LinkedList<String> favoritos) {
        this.favoritos = favoritos;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean isAdmin() {
        return admin=false;
    }

    @Override
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }
    
    @Override
    public String toString() {
        return "Cliente{" +"nombre= "+nombre +", email= "+email+ " contrasena = "+ psw +" curp= "  + curp + ", genero= " + genero + ", direccion= " + direccion + ", telefono= " + telefono + ", favoritos= " + favoritos + ", administrador = "+admin+" Adeuda = " + deudor+ "Fecha de Registro ="+fechaRegistro+'}';
    }
}
