
package postgresql_conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Postgresql_conexion {
    Connection con;
    public Connection conectar(){
    try{
    Class.forName("org.postgresql.Driver");
    con = (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/","postgres","percas");
        System.out.println("conexion exitosa");
         
        
    }catch(Exception e){
        System.out.println("conexion fallida");
    }
    return con;
    }

    public static void main(String[] args) {
        try {
            datos();
        } catch (Exception e) {
        }
        Postgresql_conexion pc = new Postgresql_conexion();
       pc.conectar();
      
       
    }
    public static void datos(){
        Postgresql_conexion s = new Postgresql_conexion();
        Connection c = s.conectar();
        
        try {
            Statement st = c.createStatement();
            String sql="Select * from mitabla";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
            
            String id= rs.getString("id");
            String nombre = rs.getString("nombre");
                System.out.println("ID: "+id+" NOMBRE: "+nombre);
            }
            rs.close();
            st.close();
            c.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Postgresql_conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        
    }
    
    
}
