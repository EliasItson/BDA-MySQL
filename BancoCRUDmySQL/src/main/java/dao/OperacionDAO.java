package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelos.Operacion;

public class OperacionDAO implements IOperacionDAO
{
    private IConexionBD conexion;

    public OperacionDAO(IConexionBD conexion) 
    {
        this.conexion = conexion;
    }
    
    @Override
    public List<Operacion> getAllOperaciones() 
    {
        List<Operacion> operaciones = new ArrayList<>();
        try 
        {
            Connection connection = this.conexion.crearConexion();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM operaciones");

            while (resultSet.next()) 
            {
                Operacion operacion = new Operacion();
                operacion.setOperacionID(resultSet.getInt("operacion_id"));
                operacion.setCliente(resultSet.getInt("cliente"));
                operacion.setTipoOperacion(resultSet.getString("tipo_operacion"));
                operacion.setFechaOperacion(resultSet.getTimestamp("fecha_operacion"));
                operacion.setIsDeleted(resultSet.getBoolean("is_deleted"));
                
                operaciones.add(operacion);
            }

            resultSet.close();
            statement.close();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return operaciones;
    }
    
    @Override
    public void addOperacion(Operacion operacion) 
    {
        try 
        {
            Connection connection = this.conexion.crearConexion();
            PreparedStatement preparedStatement = connection.prepareStatement(
                "INSERT INTO operacion (cliente, tipo_operacion, fecha_operacion) VALUES (?, ?, ?)"
            );
            preparedStatement.setInt(1, operacion.getCliente());
            preparedStatement.setString(2, operacion.getTipoOperacion());
            preparedStatement.setTimestamp(3, operacion.getFechaOperacion());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
    
    @Override
    public void updateOperacion(Operacion operacion) 
    {
        try
        {
            Connection connection = this.conexion.crearConexion();
            PreparedStatement statement = connection.prepareStatement("UPDATE operaciones SET cliente = ?, tipo_operacion = ?, fecha_operacion = ? WHERE operacion_id = ?");
            statement.setInt(1, operacion.getCliente());
            statement.setString(2, operacion.getTipoOperacion());
            statement.setTimestamp(3, operacion.getFechaOperacion());
            statement.setInt(5, operacion.getOperacionID());
            statement.executeUpdate();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
    
    @Override
    public void deleteOperacion(int operacionID) 
    {
        try
        {
            Connection connection = this.conexion.crearConexion();
            PreparedStatement statement = connection.prepareStatement("UPDATE operacion SET is_deleted = ? WHERE operacion_id = ?");
            statement.setBoolean(1, true);
            statement.setInt(2, operacionID);
            statement.executeUpdate();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
}
