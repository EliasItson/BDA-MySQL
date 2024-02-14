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
        ICuentaDAO cuentaDAO = new CuentaDAO(conexionBD);
        ITransaccionDAO transaccionDAO = new TransaccionDAO(conexionBD);
        IClienteNegocio clienteNegocio = new ClienteNegocio(clienteDAO);
        ICuentaNegocio cuentaNegocio = new CuentaNegocio(cuentaDAO);
        ITransaccionNegocio transaccionNegocio = new TransaccionNegocio(transaccionDAO);
        
        Login loginObj = new Login(clienteNegocio, cuentaNegocio);
        loginObj.setVisible(true);
    }   
}
