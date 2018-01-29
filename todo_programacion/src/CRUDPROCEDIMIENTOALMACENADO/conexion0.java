/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUDPROCEDIMIENTOALMACENADO;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion0 {
    Connection con;
    
    public Connection conexion(){
        try{
    Class.forName("com.mysql.jdbc.Driver");
    con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","");
            System.out.println("Conexion exitosa");
        }catch(Exception e){
            System.out.println("Conexion fallida");
        }
        return con;
    }
    
    public static void main(String[] args) {
        conexion0 con = new conexion0();
        con.conexion();
    }
    
    
    
    
    
}
