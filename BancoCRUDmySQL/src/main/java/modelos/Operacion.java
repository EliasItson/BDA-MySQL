package modelos;

import java.sql.Timestamp;

public class Operacion 
{
    private int operacionID;
    private int cliente;
    private String tipoOperacion;
    private Timestamp fechaOperacion;
    private boolean isDeleted;

    public int getOperacionID() {
        return operacionID;
    }

    public void setOperacionID(int operacionID) {
        this.operacionID = operacionID;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
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

    public boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    
}
