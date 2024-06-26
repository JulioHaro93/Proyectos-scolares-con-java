/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.azc.pvoe.modelos;

/**
 * Método de revista con todos los valores de una revista
 * @author Julio Cesar Haro Capetillo 2202000415
 */
public class Revista {
    
    private Proveedor proveedor = new Proveedor();
    private String isbn;
    private String titulo;
    private String editorial = proveedor.getNombreEditorial();
    private String tipo = "revista";
    private int num;
    private int cantidadDisponible;
    /**
     * método que sobrecarga el método constructor
     */
    public Revista() {
    }
    /**
     * Método constructor por defecto
     * @param isbn isbn que permite que se identifique una revista
     * @param titulo título de la revista
     * @param editorial editorial proveniente de la revista
     * @param tipo tipo revista
     * @param num número de la revista
     */
    public Revista(Proveedor proveedor, String isbn, String titulo, String editorial, String tipo, int num, int cantidadDisponible){
        this.proveedor= proveedor;
        this.isbn = isbn;
        this.titulo = titulo;
        this.num = num;
        this.tipo = tipo;
        this.editorial= editorial;
        this.cantidadDisponible = cantidadDisponible;
    }
    /**
     * método que obtiene el nombre del proveedor
     * @return la editorial de la revista
     */
    public Proveedor getProveedor() {
        return proveedor;
    }
    /**
     * método que establece el valor del proveedor de una revista
     * @param proveedor establece el nombre de la editorial de la revista
     */
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    /**
     * método getter del isbn de una revista
     * @return el isbn con el que se identifica una revista
     */

    public String getIsbn() {
        return isbn;
    }
    /**
     * método setter de la revista
     * @param isbn establece el valor de la revista
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    /**
     * método getter del título
     * @return el título de una revista
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * Método seter del título de una revista
     * @param titulo establece el nombre del título de una revista
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     * método getter de la editorial
     * @return el nombre de la editorial 
     */
    public String getEditorial() {
        return editorial;
    }
    /**
     * método setter de la editorial
     * @param editorial establece el nombre de una editorial
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    /**
     * método getter del tipo
     * @return el valor de revista para el título
     */
    public String getTipo() {
        return tipo="revista";
    }
    /**
     * método setter del tipo
     * @param tipo establece el valor del tipo de la revista
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * método getter del número
     * @return el valor del número de una revista
     */
    public int getNum() {
        return num;
    }
    /**
     * establece el número de revista de una revista
     * @param num número de revista
     */
    public void setNum(int num) {
        this.num = num;
    }

    
    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    /**
     * Método que establece el valor de la cantidad de ejemplares disponibles de una revista
     * @param cantidadDisponible 
     */
    public void setCantidadDisponible(int cantidadDisponible) {    
        this.cantidadDisponible = cantidadDisponible;
    }
    /**
     * Método toString de revista
     * @return una cadena con todos los valores de los atributos de una revista
     */
    @Override
    public String toString() {
        return "Revista{" + "proveedor=" + proveedor + ", isbn=" + isbn + ", titulo=" + titulo + ", editorial=" + editorial + ", tipo=" + tipo + ", num=" + num + ", cantidadDisponible=" + cantidadDisponible + '}';
    }
  
    
}
