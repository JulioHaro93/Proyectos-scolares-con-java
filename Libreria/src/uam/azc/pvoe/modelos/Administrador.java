/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.azc.pvoe.modelos;

/**
 *
 * @author Julio Cesar Haro Capetillo 2202000415
 */
public class Administrador extends Usuario{
    
    
    public Administrador() {
    }
    public Administrador(String nombre, String email, String psw, boolean admin) {
        super(nombre, email, psw, admin=true);
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

    /**
     *
     * @param email
     */
    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPsw() {
        return psw;
    }

    @Override
    public void setPsw(String psw) {
        this.psw = psw;
    }

    @Override
    public boolean isAdmin() {
        return admin=true;
    }

    @Override
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }


    
}
