/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author DELL
 */
public class Medicamento {
    
    private String clave;
    private String nombreCom;
    private String principioAct;
    private String presentacion;
    private String toma;

    public Medicamento() {
    }

    public Medicamento(String clave, String nombreCom, String principioAct, String presentacion, String toma) {
        this.clave = clave;
        this.nombreCom = nombreCom;
        this.principioAct = principioAct;
        this.presentacion = presentacion;
        this.toma = toma;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombreCom() {
        return nombreCom;
    }

    public void setNombreCom(String nombreCom) {
        this.nombreCom = nombreCom;
    }

    public String getPrincipioAct() {
        return principioAct;
    }

    public void setPrincipioAct(String principioAct) {
        this.principioAct = principioAct;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getToma() {
        return toma;
    }

    public void setToma(String toma) {
        this.toma = toma;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "clave=" + clave + ", nombreCom=" + nombreCom + ", principioAct=" + principioAct + ", presentacion=" + presentacion + ", toma=" + toma + '}';
    }
    
    
    
}
