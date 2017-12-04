/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exportarjavaexcel;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PERCASTEGUI
 */
public class Conexion {
    
    Connection c;
    public Connection conexion(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        c= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/audiovisual","root","");
            System.out.println("Conexion exitosa");
        }catch(Exception e){}
        
    return c;
    }
 public static void main(String [] args){
 Conexion x = new Conexion();
 x.conexion();
 
 }   
}
