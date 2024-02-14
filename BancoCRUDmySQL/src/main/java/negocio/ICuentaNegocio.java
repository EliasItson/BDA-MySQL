package negocio;

import java.util.List;
import modelos.Cuenta;

public interface ICuentaNegocio 
{
    public List<Cuenta> getAllCuentas() throws NegocioException;
    public Cuenta getCuentasByClienteID(int clienteID) throws NegocioException;
    public void addCuenta(Cuenta cuenta) throws NegocioException;
}
