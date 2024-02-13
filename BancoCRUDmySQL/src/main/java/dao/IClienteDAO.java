package dao;

import java.util.List;
import modelos.Cliente;

public interface IClienteDAO 
{
    public List<Cliente> getAllClientes() throws DAOException;
    public void addCliente(Cliente cliente) throws DAOException;
    public void updateCliente(Cliente cliente) throws DAOException;
    public void deleteCliente(int clienteID) throws DAOException;
}
