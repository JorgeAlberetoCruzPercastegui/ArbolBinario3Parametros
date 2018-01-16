/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varias_sentencias;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PERCASTEGUI
 */
public class conexion {
   
    Connection c;
    
    public Connection conexion0() throws ClassNotFoundException, SQLException{
        try{
        Class.forName("com.mysql.jdbc.Driver");
        c= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/funciones_java","root","");
        System.out.println("Conexion exitosa");
        }catch(Exception e){
        e.printStackTrace();
        }
    return c;
    }
}
