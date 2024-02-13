package main;

import dao.*;
import java.sql.SQLException;
import negocio.*;
import presentacion.Login;

public class Main 
{
    public static void main(String[] args) 
    {
        IConexionBD conexionBD = new ConexionBD();
        IClienteDAO clienteDAO = new ClienteDAO(conexionBD);
        IClienteNegocio clienteNegocio = new ClienteNegocio(clienteDAO);
        
        Login loginObj = new Login(clienteNegocio);
        loginObj.setVisible(true);
    }   
}
