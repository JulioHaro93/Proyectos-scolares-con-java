/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 * Clase Medicamento con todos los atributos de un medicamento: Clave, nombre Comercial, principio Activo, presentación y tipo de administración.
 * @author Julio Cesar Haro Capetillo
 */
public class Medicamento {
    
    private String clave;
    private String nombreCom;
    private String principioAct;
    private String presentacion;
    private String toma;
    /**
     * Método constructor por defecto
     */
    public Medicamento() {
    }
    /**
     * Método constructor con parámetros
     * @param clave clave del medicamento
     * @param nombreCom nombre comercial
     * @param principioAct principio activo
     * @param presentacion presentación
     * @param toma tipo de administracion
     */
    public Medicamento(String clave, String nombreCom, String principioAct, String presentacion, String toma) {
        this.clave = clave;
        this.nombreCom = nombreCom;
        this.principioAct = principioAct;
        this.presentacion = presentacion;
        this.toma = toma;
    }
    /**
     * metodo getter de la clave
     * @return un Strin con la clave de un medicamento
     */
    public String getClave() {
        return clave;
    }
    /**
     * Metodo setter de la clave
     * @param clave recibe un string con la clave de un medicamento
     */
    public void setClave(String clave) {
        this.clave = clave;
    }
    /**
     * metodo getter del nombre comercial
     * @return un string con el nombre comercial de un medicamento
     */
    public String getNombreCom() {
        return nombreCom;
    }
    /**
     * metodo setter de nombre comercial
     * @param nombreCom recibe un string con el nombre comercial de un medicamento
     */
    public void setNombreCom(String nombreCom) {
        this.nombreCom = nombreCom;
    }
    /**
     * metodo getter del principio activo
     * @return un String con el valor del principio activo de un medicamento
     */
    public String getPrincipioAct() {
        return principioAct;
    }
    /**
     * metodo setter del principio activo
     * @param principioAct recibe un string con el valor del principio activo de un medicamento
     */
    public void setPrincipioAct(String principioAct) {
        this.principioAct = principioAct;
    }
    /**
     * metodo getter de la presentación de un medicamento
     * @return un string con el tipo de presentación de un medicamento
     */
    public String getPresentacion() {
        return presentacion;
    }
    /**
     * metodo setter de la presentacion
     * @param presentacion recibe un string con el valor de la presentación de un medicamento
     */
    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }
    /**
     * metodo getter del tipo de toma de un medicamento
     * @return un String con el tipo de ingesta o administración de un medicamento
     */
    public String getToma() {
        return toma;
    }
    /**
     * metodo setter de la toma de un medicamento
     * @param toma un String con la toma de un medicamento
     */
    public void setToma(String toma) {
        this.toma = toma;
    }
    /**
     * metodo toString de la clase
     * @return un String con todos los valores de un medicamento
     */
    @Override
    public String toString() {
        return "Medicamento{" + "clave=" + clave + ", nombreCom=" + nombreCom + ", principioAct=" + principioAct + ", presentacion=" + presentacion + ", toma=" + toma + '}';
    }
    
    
    
}
