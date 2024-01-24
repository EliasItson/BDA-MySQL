package com.mycompany.crudmysql;

import java.sql.Connection;
import java.sql.DriverManager;
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
        catch (Exception e)
        {
            System.out.println("Error al conectar" + e.toString());
        }
        return conexion;
    }
}
