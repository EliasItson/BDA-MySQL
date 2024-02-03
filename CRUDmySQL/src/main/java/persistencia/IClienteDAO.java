package persistencia;

import entidades.Cliente;
import java.util.List;

/**
 *
 * @author Ryzen 5
 */
public interface IClienteDAO 
{
    public List<Cliente> getAllClientes();
    public void addCliente(Cliente cliente);
    public void updateCliente(Cliente cliente);
    public void deleteCliente(int clienteID);
//    public List<ClienteTablaDTO> buscarClientesTabla(int limit, int offset) throws PersistenciaException;
//
//    public ClienteEntidad buscarPorIdEmpleado(int id) throws PersistenciaException;
//
//    public ClienteEntidad guardar(ClienteEntidad empleado) throws PersistenciaException;
//
//    public ClienteEntidad editar(ClienteEntidad empleado) throws PersistenciaException;
//
//    public ClienteEntidad eliminar(ClienteEntidad empleado) throws PersistenciaException;
}
