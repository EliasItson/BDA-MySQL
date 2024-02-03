package com.mycompany.crudmysql;

import persistencia.Conexion;
import persistencia.IConexion;
import java.sql.SQLException;

public class Main 
{
    
    public static void main(String[] args) 
    {
        IConexion conexion = new Conexion();
        try
        {
            conexion.crearConexion();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }   
}
