/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.aguzman.java.jdbc;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class Java_jdbc {

    public static void main(String[] args) {
        
        String url = "jdbc:mysquel://localhojst:3306/java_curso?serverTimezone=UTC";
        String username = "root";
        String password  ="sasa";
        Connection conn = null;
        Statement stmt = null;
        ResultSet resultado = null;
        try{
            
           conn = new DriverManager.getConnection(url, username, password);
           stmt = conn.createStatement();
           resultado = stmt.executeQuery("Select * FROM productos");
           
           while(resultado.next()){
           System.out.println(resultado.getString("nombre"));
           
           }
        } catch(SQLException e){
            
            e.printStackTrace();
            
        } finally{
            
            try{
               resultado.close();
               stmt.close();
               conn.close();

            } catch(SQLException throwables){

                    throwables.printStackTrace();
            }
        }
    }
}