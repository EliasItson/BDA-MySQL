package dao;

import java.util.List;
import modelos.Cuenta;

public interface ICuentaDAO 
{
    public List<Cuenta> getAllCuentas() throws DAOException;
    public Cuenta getCuentasByClienteID(int clienteID) throws DAOException;
    public void addCuenta(Cuenta cuenta) throws DAOException;
}
