package persistencia;

import java.sql.Connection;
import java.sql.SQLException;

public interface IConexion 
{
    public Connection crearConexion() throws SQLException;
}


