/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uam.azc.pvoe.seriesstreaming.clases;

/**
 * Clase Serie, esta contiene las propiedades de un objeto serie, incluyendo tambien los metodos que convierten
 * sus atributos en cadenas
 * @author Haro Capetillo Julio Cesar
 */
public class Serie {
    
    private String serie;
    private String plataforma;
    private int capitulos;
    /**
     * Metodo constructor
     * @param serie String con el nombre de la serie
     * @param plataforma String con el nombre de la plataforma
     * @param capitulos numero de capitulos que tiene la serie
     */
    public Serie(String serie, String plataforma, int capitulos) {
        this.serie = serie;
        this.plataforma = plataforma;
        this.capitulos = capitulos;
    }
    /**
     * Metodo constructor por defecto
     */
    public Serie() {
    }
    /**
     * metodo getter del nombre de la serie
     * @return nombre de la serie
     */
    public String getSerie() {
        return serie;
    }
    /**
     * Metodo que establece el valor del nombre de una serie
     * @param serie recibe el nombre de una serie y establece su valor
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }
    /**
     * metodo getter del nombre de la plataforma
     * @return regresa el nombre de la plataforma
     */
    public String getPlataforma() {
        return plataforma;
    }
    /**
     * Metodo que establece el nombre de la plataforma
     * @param plataforma nombre de la plataforma
     */
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    /**
     * metodo getter del numero de capitulos
     * @return el numero de capitulos
     */
    public int getCapitulos() {
        return capitulos;
    }
    /**
     * Metodo que establece el numero de capitulos
     * @param capitulos numero de capitulos de una serie
     */
    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }
    /**
     *  Metodo que convierte en cadenas los valores de un objeto serie al momento de crear un archivo
     * @return una cadena con los atributos de las series
     */
    public String toStringArchivo(){
      String cadena="";
      cadena = serie+","+plataforma+","+
              capitulos;
      return cadena;
    }
    /**
     *  Metodo que convierte en cadenas los valores de un objeto serie al momento de leer un archivo
     * @return una cadena con los atributos de las series
     */
    public String toStringConsola(){
        String cadena="";
      cadena = serie+","+plataforma+","+
              capitulos;
      return cadena;
    }
    /**
     * Metodo toString de la clase Serie
     * @return una cadena con todos los atributos de la serie
     */
    @Override
    public String toString() {
        return "Serie{" + "nomSerie=" + serie + ", plataforma=" + plataforma + ", numCapitulos=" + capitulos + '}';
    }
    
}
