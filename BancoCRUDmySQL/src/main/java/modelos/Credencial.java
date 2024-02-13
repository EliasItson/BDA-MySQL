package modelos;



public class Credencial 
{
    private int credencialID;
    private int cliente;
    private String usuario;
    private char[] contrasena;
    private String salt;

    public Credencial() 
    {
        
    }

    public Credencial(int cliente, String usuario, char[] contrasena, String salt) 
    {
        this.cliente = cliente;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.salt = salt;
    }

    public int getCredencialID() {
        return credencialID;
    }

    public void setCredencialID(int credencialID) {
        this.credencialID = credencialID;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public char[] getContrasena()  {
        return contrasena;
    }

    public void setContrasena(char[] contrasena)  {
        this.contrasena = contrasena;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
    
    
    
}
