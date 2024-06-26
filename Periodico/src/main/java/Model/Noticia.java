/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 * Descripcion: Es el modelo de la clase Noticia con los atributos para poder instanciarlos
 * con los valores de la base de datos y poder modificarlos de MySQL a java.
 * @author Julio Cesar Haro Capetillo 2202000415
 */
public class Noticia {
    private int idNoticia;
    private String titulo;
    private String descripcion;
    private String fecha;
    /**
     * Descripcion: Metodo constructor por defecto (sobre carga de métodos)
     */
    public Noticia(){}
    /**
     * Metodo constructor que permite la instanciacion de valores
     * @param idNoticia es el id que es el unique key para poder identificarlo.
     * @param titulo titulo de la noticia
     * @param descripcion descripcion de la noticia
     * @param fecha fecha en la que fue publicada la noticia
     */
    public Noticia(int idNoticia, String titulo, String descripcion, String fecha) {
        this.idNoticia = idNoticia;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }
    /**
     * metodo getter para idNotivia
     * @return idNoticia
     */
    public int getIdNoticia() {
        return idNoticia;
    }
    /**
     * metodo setter de idNotivia
     * @param idNoticia recibe un entero que se utiliza como id para la noticia
     */
    public void setIdNoticia(int idNoticia) {
        this.idNoticia = idNoticia;
    }
    /**
     * metodo getter del título
     * @return un string con el titulo de la noticia
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * metodo setter del titulo
     * @param titulo recibe un string con el titulo de una noticia
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     * metodo getter de la descripcion de una noticia
     * @return un String con la descripcion de la noticia
     */
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * metodo setter de la descripcion
     * @param descripcion recibe un String con la descripcion de la noticia
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * metodo getter de la Feca
     * @return un String con la fecha de la publicación de una noticia
     */
    public String getFecha() {
        return fecha;
    }
    /**
     * metodo setter de la fecha
     * @param fecha recibe un String de una fecha publicada
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    /**
     * metodo toString
     * @return regresa un string con todos los valores de los atributos de la clase.
     */
    @Override
    public String toString() {
        return "Noticia{" + "idNoticia=" + idNoticia + ", titulo=" + titulo + ", descripcion=" + descripcion + ", fecha=" + fecha + '}';
    }
    
    
    
}
