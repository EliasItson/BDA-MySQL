package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelos.Cliente;

public class ClienteDAO implements IClienteDAO
{
    private IConexionBD conexion;
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;

    public ClienteDAO(IConexionBD conexion) 
    {
        this.conexion = conexion;
    }
    
    @Override
    public List<Cliente> getAllClientes() 
    {
        List<Cliente> clientes = new ArrayList<>();
        try 
        {
            String sqlQuery = "SELECT * FROM clientes";
            connection = this.conexion.crearConexion();
            preparedStatement = connection.prepareStatement(sqlQuery);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) 
            {
                Cliente cliente = new Cliente();
                cliente.setClienteID(resultSet.getInt("cliente_id"));
                cliente.setNombre(resultSet.getString("nombre"));
                cliente.setDomicilio(resultSet.getString("domicilio"));
                cliente.setFechaNacimiento(resultSet.getDate("fecha_nacimiento").toLocalDate());
                cliente.setEdad(resultSet.getInt("edad"));
                cliente.setIsDeleted(resultSet.getBoolean("is_deleted"));
                
                clientes.add(cliente);
            }

            resultSet.close();
            preparedStatement.close();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return clientes;
    }
    
    @Override
    public Cliente getClienteByUser(String user) throws DAOException
    {
        Cliente c = new Cliente();
        try 
        {
            connection = this.conexion.crearConexion();
            // SQL query to retrieve user by username
            String sqlQuery = "SELECT * FROM clientes WHERE user = ?";
            preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setString(1, user);

            // Execute the query
            resultSet = preparedStatement.executeQuery();
            
            Cliente cliente = new Cliente();
            
            // Process the result set
            while (resultSet.next()) 
            {
                // Retrieve values from the result set
                cliente.setClienteID(resultSet.getInt("cliente_id"));
                cliente.setNombre(resultSet.getString("nombre"));
                cliente.setDomicilio(resultSet.getString("domicilio"));
                cliente.setFechaNacimiento(resultSet.getDate("fecha_nacimiento").toLocalDate());
                cliente.setEdad(resultSet.getInt("edad"));
                cliente.setUser(resultSet.getString("user"));
                cliente.setPassword(resultSet.getString("password"));
                cliente.setSalt(resultSet.getString("salt"));
                cliente.setIsDeleted(resultSet.getBoolean("is_deleted"));
            }
            return cliente;
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
    public void addCliente(Cliente cliente) 
    {
        try(Connection connection = this.conexion.crearConexion()) 
        {
            PreparedStatement preparedStatement = connection.prepareStatement(
                "INSERT INTO clientes (nombre, domicilio, fecha_nacimiento, edad, user, password, salt) VALUES (?, ?, ?, ?, ?, ?, ?)"
            );
            preparedStatement.setString(1, cliente.getNombre());
            preparedStatement.setString(2, cliente.getDomicilio());
            preparedStatement.setDate(3, Date.valueOf(cliente.getFechaNacimiento()));
            preparedStatement.setInt(4, cliente.getEdad());
            preparedStatement.setString(5, cliente.getUser());
            preparedStatement.setString(6, cliente.getPassword());
            preparedStatement.setString(7, cliente.getSalt());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
    
    @Override
    public void updateCliente(Cliente cliente) 
    {
        try
        {
            Connection connection = this.conexion.crearConexion();
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE clientes SET nombre = ?, domicilio = ?, fecha_nacimiento = ?, edad = ? WHERE cliente_id = ?");
            preparedStatement.setString(1, cliente.getNombre());
            preparedStatement.setString(2, cliente.getDomicilio());
            preparedStatement.setDate(3, Date.valueOf(cliente.getFechaNacimiento()));
            preparedStatement.setInt(4, cliente.getEdad());
            preparedStatement.setInt(5, cliente.getClienteID());
            preparedStatement.executeUpdate();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
    
    @Override
    public void deleteCliente(int clienteID) 
    {
        try
        {
            Connection connection = this.conexion.crearConexion();
            PreparedStatement statement = connection.prepareStatement("UPDATE clientes SET is_deleted = ? WHERE cliente_id = ?");
            statement.setBoolean(1, true);
            statement.setInt(2, clienteID);
            statement.executeUpdate();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
}
