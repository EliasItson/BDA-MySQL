package negocio;

import java.util.List;
import modelos.Cliente;

public interface IClienteNegocio 
{
    public List<Cliente> buscarClientesTabla() throws NegocioException;
    public void addCliente(Cliente cliente) throws NegocioException;
}
