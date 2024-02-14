package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelos.Transaccion;

public class TransaccionDAO implements ITransaccionDAO
{
    private IConexionBD conexion;

    public TransaccionDAO(IConexionBD conexion) 
    {
        this.conexion = conexion;
    }
    
    @Override
    public List<Transaccion> getAllTransacciones() 
    {
        List<Transaccion> operaciones = new ArrayList<>();
        try 
        {
            Connection connection = this.conexion.crearConexion();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM operaciones");

            while (resultSet.next()) 
            {
                Transaccion operacion = new Transaccion();
                operacion.setTransaccionID(resultSet.getInt("operacion_id"));
                operacion.setCliente(resultSet.getInt("cliente"));
                operacion.setTipTransaccion(resultSet.getString("tipo_operacion"));
                operacion.setFechaTransaccion(resultSet.getTimestamp("fecha_operacion"));
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
    public void addTransaccion(Transaccion operacion) 
    {
        try 
        {
            Connection connection = this.conexion.crearConexion();
            PreparedStatement preparedStatement = connection.prepareStatement(
                "INSERT INTO operacion (cliente, tipo_operacion, fecha_operacion) VALUES (?, ?, ?)"
            );
            preparedStatement.setInt(1, operacion.getCliente());
            preparedStatement.setString(2, operacion.getTipTransaccion());
            preparedStatement.setTimestamp(3, operacion.getFechaTransaccion());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
    
    @Override
    public void updateTransaccion(Transaccion operacion) 
    {
        try
        {
            Connection connection = this.conexion.crearConexion();
            PreparedStatement statement = connection.prepareStatement("UPDATE operaciones SET cliente = ?, tipo_operacion = ?, fecha_operacion = ? WHERE operacion_id = ?");
            statement.setInt(1, operacion.getCliente());
            statement.setString(2, operacion.getTipTransaccion());
            statement.setTimestamp(3, operacion.getFechaTransaccion());
            statement.setInt(5, operacion.getTransaccionID());
            statement.executeUpdate();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
    
    @Override
    public void deleteTransaccion(int operacionID) 
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
