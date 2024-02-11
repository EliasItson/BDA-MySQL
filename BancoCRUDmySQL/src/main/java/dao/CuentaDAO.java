package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelos.Cuenta;

public class CuentaDAO implements ICuentaDAO
{
    private IConexionBD conexion;

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
                cuenta.setNumeroCuenta(resultSet.getInt("numero_cuenta"));
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
    public void addCuenta(Cuenta cuenta) 
    {
        try 
        {
            Connection connection = this.conexion.crearConexion();
            PreparedStatement preparedStatement = connection.prepareStatement(
                "INSERT INTO cuentas (cliente, numero_cuenta, saldo, fecha_apertura) VALUES (?, ?, ?, ?)"
            );
            preparedStatement.setInt(1, cuenta.getCliente());
            preparedStatement.setInt(2, cuenta.getNumeroCuenta());
            preparedStatement.setDouble(3, cuenta.getSaldo());
            preparedStatement.setTimestamp(4, cuenta.getFechaApertura());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
    
    @Override
    public void updateCuenta(Cuenta cuenta) 
    {
        try
        {
            Connection connection = this.conexion.crearConexion();
            PreparedStatement statement = connection.prepareStatement("UPDATE cuentas SET cliente = ?, numero_cuenta = ?, saldo = ?, fecha_apertura = ? WHERE cuenta_id = ?");
            statement.setInt(1, cuenta.getCliente());
            statement.setInt(2, cuenta.getNumeroCuenta());
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
    
    @Override
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
