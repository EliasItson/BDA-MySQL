package main;

import dao.ConexionBD;
import dao.IConexionBD;
import java.sql.SQLException;

public class Main 
{
    public static void main(String[] args) 
    {
        IConexionBD conexion = new ConexionBD();
        try
        {
            conexion.crearConexion();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }   
}
