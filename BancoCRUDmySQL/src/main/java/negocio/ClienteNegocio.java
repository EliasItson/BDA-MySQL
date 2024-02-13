package negocio;

import dao.DAOException;
import dao.IClienteDAO;
import java.util.List;
import modelos.Cliente;
import java.time.LocalDate;


public class ClienteNegocio implements IClienteNegocio 
{
    private IClienteDAO clienteDAO;

    public ClienteNegocio(IClienteDAO clienteDAO) 
    {
        this.clienteDAO = clienteDAO;
    }
    
    @Override
    public List<Cliente> getAllClientes() throws NegocioException
    {
        try 
        {
            List<Cliente> clientes = this.clienteDAO.getAllClientes();
            if (clientes == null) 
            {
                throw new NegocioException("No existen clientes registrados");
            }

            return clientes;
        } 
        catch (DAOException ex) 
        {
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }
    
    @Override
    public Cliente getClienteByUser(String user) throws NegocioException
    {
        try 
        {
            if (user == null)
            {
                throw new NegocioException("El campo usuario no puede estar vacio.");
            }
            
            Cliente cliente = clienteDAO.getClienteByUser(user);
            return cliente;
        } 
        catch (DAOException ex) 
        {
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }
    
    @Override
    public void addCliente(Cliente cliente) throws NegocioException
    {
        try 
        {
            if (cliente == null) 
            {
                throw new NegocioException("No se proporciono un cliente valido");
            }
            
            cliente.setEdad(LocalDate.now().getYear() - cliente.getFechaNacimiento().getYear());
            
            clienteDAO.addCliente(cliente);
            

        } 
        catch (DAOException ex) 
        {
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }
}
