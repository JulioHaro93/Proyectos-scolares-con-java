/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.azc.pvoe.modelos;

/**
 *
 * @author Julio Cesar Haro Capetillo 2202000415
 */
public class Usuario {
    
    protected String nombre;
    protected String email;
    protected String psw;
    protected boolean admin;

    public Usuario() {
    }

    public Usuario(String nombre, String email,String psw, boolean admin) {
        this.nombre = nombre;
        this.email = email;
        this.psw = psw;
        this.admin = admin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }
    
    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", email=" + email + ", psw=" + psw + ", admin=" + admin + '}';
    }

    
}
