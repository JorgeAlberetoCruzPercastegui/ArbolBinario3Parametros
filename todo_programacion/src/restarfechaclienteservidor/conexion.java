
package restarfechaclienteservidor;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PERCASTEGUI
 */
public class conexion {
    
    Connection c;
    
    public Connection con(){
        try {
             Class.forName("com.mysql.jdbc.Driver").newInstance();
             c= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","");
             System.out.println("Conexion exitosa");
        } catch (Exception e) {
        }
    return c;
    
    }
    public static void main(String[] args) {
        conexion cc = new conexion();
        cc.con();
    }
}
