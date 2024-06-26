/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import modelo.Noticia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Profesor
 */
public class OperacionBD {

    private static final String USUARIO = "root";
    private static final String PSWD = "sasa";
    private static final String BD = "periodico";
    private static final String URL = "jdbc:mysql://localhost:3306/";

    private Connection conexion;

    public void conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL + BD, USUARIO, PSWD);
            if (conexion != null) {
                System.out.println("conectado a la base de datos");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Error " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error 1" + ex.getMessage());
        }

    }

    public void desconectar() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
        }
    }

    public ArrayList<Noticia> consultarNoticias() {
        ArrayList<Noticia> noticia = new ArrayList<>();
        Statement st;
        try {
            st = conexion.createStatement();
            String query = "SELECT * FROM noticia;";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Noticia not = new Noticia();
                not.setIdNoticia(rs.getInt("idNombre"));
                not.setTitulo(rs.getString("titulo"));
                not.setDescripcion(rs.getString("descripcion"));
                not.setFecha(rs.getString("fecha"));
                noticia.add(not);
            }
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
        }

        return noticia;
    }

    public boolean agregarNoticia(Noticia noticia) {
        boolean estado = false;
        Statement consultaSQL;
        String q = "INSERT INTO noticia VALUES(" + "'" + noticia.getIdNoticia() + "',"
                + "'" + noticia.getTitulo() + "'," + noticia.getDescripcion() + "'," + noticia.getFecha() + ")";
        try {
            consultaSQL = conexion.createStatement();
            consultaSQL.execute(q);
            estado = true;
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
        }

        return estado;
    }

}
