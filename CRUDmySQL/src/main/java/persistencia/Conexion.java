package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Ryzen 5
 */
public class Conexion 
{
    Connection conexion;

    public Connection conectar()
    {
        try
        {
            
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/netbeans","root" ,"1234");
            System.out.println("Conexion exitosa");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return conexion;
    }
}
