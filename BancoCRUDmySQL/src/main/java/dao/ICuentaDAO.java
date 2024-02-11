package dao;

import java.util.List;
import modelos.Cuenta;

public interface ICuentaDAO 
{
    public List<Cuenta> getAllCuentas();
    public void addCuenta(Cuenta cuenta);
    public void updateCuenta(Cuenta cuenta);
    public void deleteCuenta(int cuentaID);
}
