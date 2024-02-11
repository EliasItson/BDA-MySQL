package dao;

import java.util.List;
import modelos.Operacion;

public interface IOperacionDAO 
{
    public List<Operacion> getAllOperaciones();
    public void addOperacion(Operacion operacion);
    public void updateOperacion(Operacion operacion);
    public void deleteOperacion(int operacionID);
}
