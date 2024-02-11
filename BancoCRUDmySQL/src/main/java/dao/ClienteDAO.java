package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelos.Cliente;

public class ClienteDAO implements IClienteDAO
{
    private IConexionBD conexion;

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
            Connection connection = this.conexion.crearConexion();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM clientes");

            while (resultSet.next()) 
            {
                Cliente cliente = new Cliente();
                cliente.setClienteID(resultSet.getInt("cliente_id"));
                cliente.setNombre(resultSet.getString("nombre"));
                cliente.setDomicilio(resultSet.getString("domicilio"));
                cliente.setFechaNacimiento(resultSet.getTimestamp("fecha_nacimiento"));
                cliente.setEdad(resultSet.getInt("edad"));
                cliente.setIsDeleted(resultSet.getBoolean("is_deleted"));
                
                clientes.add(cliente);
            }

            resultSet.close();
            statement.close();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return clientes;
    }
    @Override
    public void addCliente(Cliente cliente) 
    {
        try {
            Connection connection = this.conexion.crearConexion();
            PreparedStatement preparedStatement = connection.prepareStatement(
                "INSERT INTO clientes (nombre, domicilio, fecha_nacimiento, edad) VALUES (?, ?, ?, ?)"
            );
            preparedStatement.setString(1, cliente.getNombre());
            preparedStatement.setString(2, cliente.getDomicilio());
            preparedStatement.setTimestamp(3, cliente.getFechaNacimiento());
            preparedStatement.setInt(4, cliente.getEdad());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void updateCliente(Cliente cliente) 
    {
        try
        {
            Connection connection = this.conexion.crearConexion();
            PreparedStatement statement = connection.prepareStatement("UPDATE clientes SET nombre = ?, domicilio = ?, fecha_nacimiento = ?, edad = ? WHERE cliente_id = ?");
            statement.setString(1, cliente.getNombre());
            statement.setString(2, cliente.getDomicilio());
            statement.setTimestamp(3, cliente.getFechaNacimiento());
            statement.setInt(4, cliente.getEdad());
            statement.setInt(5, cliente.getClienteID());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void deleteCliente(int clienteID) 
    {
        try
        {
            Connection connection = this.conexion.crearConexion();
            PreparedStatement statement = connection.prepareStatement("UPDATE clientes SET isDeleted = ? WHERE cliente_id = ?");
            statement.setBoolean(1, true);
            statement.setInt(2, clienteID);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
