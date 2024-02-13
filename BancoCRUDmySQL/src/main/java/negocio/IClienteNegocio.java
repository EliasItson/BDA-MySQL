package negocio;

import java.util.List;
import modelos.Cliente;

public interface IClienteNegocio 
{
    public List<Cliente> getAllClientes() throws NegocioException;
    public Cliente getClienteByUser(String user) throws NegocioException;
    public void addCliente(Cliente cliente) throws NegocioException;
}
