/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.azc.pvoe.modelos;

/**
 * Método libro que establece los valores de un libro
 * @author Julio Cesar Haro Capetillo 2202000415
 */
public class Libro {
    private Proveedor proveedor = new Proveedor();
    private String isbn;
    private String titulo;
    private String editorial = proveedor.getNombreEditorial();
    private String tipo = "libro";
    /**
     * sobre carga de metodo constructor
     */
    public Libro() {
    }
    /**
     * metodo constructor por defecto
     * @param isbn serial que identifica un libro
     * @param titulo titulo del libro
     * @param editorial editorial proveniente del libro
     */
    public Libro(Proveedor proveedor, String isbn, String titulo, String editorial,String tipo) {
        this.proveedor=proveedor;
        this.isbn = isbn;
        this.titulo = titulo;
        this.editorial = editorial;
        this.tipo = tipo;
    }

    /**
     * metodo getter del isbn
     * @return el valor del isbn de un libro
     */
    public String getIsbn() {
        return isbn;
    }
    /**
     * metodo setter dle isbn
     * @param isbn establece el valor del isbn de un libro
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    /**
     * metodo getter del titulo
     * @return titulo de un libro
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * metodo setter del título
     * @param titulo establece el título de un libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     * método getter de la editorial
     * @return el nombre de la editorial de un libro
     */
    public String getEditorial() {
        return editorial;
    }
    /**
     * método setter de la editorial
     * @param editorial establece el nombre de la editorial de un libro
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public String getTipo() {
        return tipo ="Libro";
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Libro{" + "proveedor=" + proveedor + ", isbn=" + isbn + ", titulo=" + titulo + ", editorial=" + editorial + ", tipo=" + tipo + '}';
    }
    
    /**
     * metodo tostring
     * @return regresa un string con todos los atributos de un libro
     */
    
    
}
