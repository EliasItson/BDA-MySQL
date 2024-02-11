package modelos;

import java.sql.Timestamp;

public class Operacion 
{
    private int operacionID;
    private Cliente cliente;
    private String tipoOperacion;
    private Timestamp fechaOperacion;
    private boolean isDeleted;

    public int getOperacionID() {
        return operacionID;
    }

    public void setOperacionID(int operacionID) {
        this.operacionID = operacionID;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public Timestamp getFechaOperacion() {
        return fechaOperacion;
    }

    public void setFechaOperacion(Timestamp fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    public boolean isIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    
}
