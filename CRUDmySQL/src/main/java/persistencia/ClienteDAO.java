package persistencia;

import entidades.Cliente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements IClienteDAO
{
    private IConexion conexion;

    public ClienteDAO(IConexion conexion) 
    {
        this.conexion = conexion;
    }
    @Override
    public List<Cliente> getAllClientes() 
    {
        List<Cliente> clientes = new ArrayList<>();
        try {
            Connection connection = this.conexion.crearConexion();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM clientes");

            while (resultSet.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(resultSet.getInt("idCliente"));
                cliente.setNombre(resultSet.getString("nombre"));
                cliente.setApellidoPaterno(resultSet.getString("apellidoPaterno"));
                cliente.setApellidoMaterno(resultSet.getString("apellidoMaterno"));
                cliente.setIsDeleted(resultSet.getBoolean("isDeleted"));
                cliente.setFechaHoraRegistro(resultSet.getTimestamp("fechaHoraRegistro"));
                
                clientes.add(cliente);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
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
                "INSERT INTO clientes (nombre, apellidoPaterno, apellidoMaterno, fechaHoraRegistro) VALUES (?, ?, ?, ?)"
            );
            preparedStatement.setString(1, cliente.getNombre());
            preparedStatement.setString(2, cliente.getApellidoPaterno());
            preparedStatement.setString(3, cliente.getApellidoMaterno());
            preparedStatement.setTimestamp(4, cliente.getFechaHoraRegistro());
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
            PreparedStatement statement = connection.prepareStatement("UPDATE clientes SET nombre = ?, apellidoPaterno = ?, apellidoMaterno = ? WHERE idCliente = ?");
            statement.setString(1, cliente.getNombre());
            statement.setString(2, cliente.getApellidoPaterno());
            statement.setString(3, cliente.getApellidoMaterno());
            statement.setInt(4, cliente.getIdCliente());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void deleteCliente(int idCliente) 
    {
        try
        {
            Connection connection = this.conexion.crearConexion();
            PreparedStatement statement = connection.prepareStatement("UPDATE clientes SET isDeleted = ? WHERE idCliente = ?");
            statement.setBoolean(1, true);
            statement.setInt(2, idCliente);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Implement update and delete methods similarly
}
