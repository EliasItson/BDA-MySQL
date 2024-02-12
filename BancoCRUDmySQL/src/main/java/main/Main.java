package main;

import dao.ConexionBD;
import dao.IConexionBD;
import java.sql.SQLException;
import presentacion.Login;

public class Main 
{
    public static void main(String[] args) 
    {
        IConexionBD conexion = new ConexionBD();
        try
        {
            conexion.crearConexion();
            System.out.println("Conexion completada");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        Login loginObj = new Login();
        loginObj.setVisible(true);
    }   
}
