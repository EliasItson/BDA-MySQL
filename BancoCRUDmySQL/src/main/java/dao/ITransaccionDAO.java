package dao;

import java.util.List;
import modelos.Transaccion;

public interface ITransaccionDAO 
{
    public List<Transaccion> getAllTransacciones();
    public void addTransaccion(Transaccion transaccion);
    public void updateTransaccion(Transaccion transaccion);
    public void deleteTransaccion(int transaccionID);
}
