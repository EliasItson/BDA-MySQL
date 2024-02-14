package negocio;

import dao.DAOException;
import dao.ICuentaDAO;
import java.time.LocalDate;
import java.util.List;
import modelos.Cuenta;

public class CuentaNegocio implements ICuentaNegocio 
{
    private ICuentaDAO cuentaDAO;

    public CuentaNegocio(ICuentaDAO cuentaDAO) 
    {
        this.cuentaDAO = cuentaDAO;
    }
    
    @Override
    public List<Cuenta> getAllCuentas() throws NegocioException
    {
        try 
        {
            List<Cuenta> cuentas = this.cuentaDAO.getAllCuentas();
            if (cuentas == null) 
            {
                throw new NegocioException("No existen clientes registrados");
            }

            return cuentas;
        } 
        catch (DAOException ex) 
        {
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }
    
    @Override
    public Cuenta getCuentasByClienteID(int clienteID) throws NegocioException
    {
        try 
        {
            if (clienteID == 0)
            {
                throw new NegocioException("El campo usuario no puede estar vacio.");
            }
            
            Cuenta cuenta = cuentaDAO.getCuentasByClienteID(clienteID);
            return cuenta;
        } 
        catch (DAOException ex) 
        {
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }
    
    @Override
    public void addCuenta(Cuenta cuenta) throws NegocioException
    {
        try 
        {
            if (cuenta == null) 
            {
                throw new NegocioException("No se proporciono una cuenta valida");
            }

            cuentaDAO.addCuenta(cuenta);

        } 
        catch (DAOException ex) 
        {
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }
}
