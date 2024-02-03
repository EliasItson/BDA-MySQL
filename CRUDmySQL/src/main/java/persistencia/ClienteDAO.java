/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

/**
 *
 * @author Ryzen 5
 */
import entidades.Cliente;
import java.sql.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    private Conexion conexion = new Conexion();
    private Connection connection;

    public ClienteDAO() {
        // Initialize the database connection
        connection = conexion.conectar();
    }

    public List<Cliente> getAllClientes() {
        List<Cliente> clientes = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

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

    public void addCliente(Cliente cliente) {
        try {
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

    // Implement update and delete methods similarly
}
