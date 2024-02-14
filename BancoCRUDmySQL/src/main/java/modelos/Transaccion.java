package modelos;

import java.sql.Timestamp;

public class Transaccion 
{
    private int transaccionID;
    private int cliente;
    private String tipTransaccion;
    private Timestamp fechaTransaccion;
    private boolean isDeleted;

    public int getTransaccionID() {
        return transaccionID;
    }

    public void setTransaccionID(int transaccionID) {
        this.transaccionID = transaccionID;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public String getTipTransaccion() {
        return tipTransaccion;
    }

    public void setTipTransaccion(String tipTransaccion) {
        this.tipTransaccion = tipTransaccion;
    }

    public Timestamp getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(Timestamp fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    
}
