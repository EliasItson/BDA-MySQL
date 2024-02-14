package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelos.Cliente;
import modelos.Cuenta;
import negocio.NegocioException;

public class CuentaDAO implements ICuentaDAO
{
    private IConexionBD conexion;
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;

    public CuentaDAO(IConexionBD conexion) 
    {
        this.conexion = conexion;
    }
    
    @Override
    public List<Cuenta> getAllCuentas() 
    {
        List<Cuenta> cuentas = new ArrayList<>();
        try 
        {
            Connection connection = this.conexion.crearConexion();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM cuentas");

            while (resultSet.next()) 
            {
                Cuenta cuenta = new Cuenta();
                cuenta.setCuentaID(resultSet.getInt("cuenta_id"));
                cuenta.setCliente(resultSet.getInt("cliente"));
                cuenta.setNumeroCuenta(resultSet.getString("numero_cuenta"));
                cuenta.setSaldo(resultSet.getDouble("saldo"));
                cuenta.setFechaApertura(resultSet.getTimestamp("fecha_apertura"));
                cuenta.setIsDeleted(resultSet.getBoolean("is_deleted"));
                    
                cuentas.add(cuenta);
            }
            resultSet.close();
            statement.close();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return cuentas;
    }
    
    @Override
    public Cuenta getCuentasByClienteID(int clienteID) throws DAOException
    {
        Cuenta c = new Cuenta();
        try 
        {
            connection = this.conexion.crearConexion();
            // SQL query to retrieve user by username
            String sqlQuery = "SELECT * FROM cuentas WHERE cliente = ?";
            preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1, clienteID);

            // Execute the query
            resultSet = preparedStatement.executeQuery();
            
            Cuenta cuenta = new Cuenta();
            
            // Process the result set
            while (resultSet.next()) 
            {
                // Retrieve values from the result set
                cuenta.setCuentaID(resultSet.getInt("cuenta_id"));
                cuenta.setCliente(resultSet.getInt("cliente"));
                cuenta.setNumeroCuenta(resultSet.getString("numero_cuenta"));
                cuenta.setSaldo(resultSet.getDouble("saldo"));
                cuenta.setFechaApertura(resultSet.getTimestamp("fecha_apertura"));
                cuenta.setIsDeleted(resultSet.getBoolean("is_deleted"));
            }
            return cuenta;
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            throw new DAOException("Ocurrió un error al leer la base de datos, inténtelo de nuevo y si el error persiste comuníquese con el encargado del sistema.");
        } 
        finally 
        {
            // Close resources in the reverse order of their creation
            try 
            {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } 
            catch (SQLException ex) 
            {
                ex.printStackTrace();
                throw new DAOException("Ocurrió un error al cerrar los recursos de JDBC.");
            }
        }
    }
    
    @Override
    public void addCuenta(Cuenta cuenta) throws DAOException
    {
        try 
        {
            connection = this.conexion.crearConexion();
            preparedStatement = connection.prepareStatement(
                "INSERT INTO cuentas (cliente, numero_cuenta) VALUES (?, ?)"
            );
            preparedStatement.setInt(1, cuenta.getCliente());
            preparedStatement.setString(2, cuenta.getNumeroCuenta());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
    

    public void updateCuenta(Cuenta cuenta) 
    {
        try
        {
            Connection connection = this.conexion.crearConexion();
            PreparedStatement statement = connection.prepareStatement("UPDATE cuentas SET cliente = ?, numero_cuenta = ?, saldo = ?, fecha_apertura = ? WHERE cuenta_id = ?");
            statement.setInt(1, cuenta.getCliente());
            statement.setString(2, cuenta.getNumeroCuenta());
            statement.setDouble(3, cuenta.getSaldo());
            statement.setTimestamp(4, cuenta.getFechaApertura());
            statement.setInt(5, cuenta.getCuentaID());
            statement.executeUpdate();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }

    public void deleteCuenta(int cuentaID) 
    {
        try
        {
            Connection connection = this.conexion.crearConexion();
            PreparedStatement statement = connection.prepareStatement("UPDATE cuentas SET is_deleted = ? WHERE cliente_id = ?");
            statement.setBoolean(1, true);
            statement.setInt(2, cuentaID);
            statement.executeUpdate();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
}
