/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;


public class conexion0 {
    Connection con;
  
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","");
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
        }
        
    return con;
    }
    
}
