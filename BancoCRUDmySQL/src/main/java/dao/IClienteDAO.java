package dao;

import java.util.List;
import modelos.Cliente;

public interface IClienteDAO 
{
    public List<Cliente> getAllClientes();
    public void addCliente(Cliente cliente);
    public void updateCliente(Cliente cliente);
    public void deleteCliente(int clienteID);
}
