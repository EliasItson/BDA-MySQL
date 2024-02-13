package modelos;

import java.time.LocalDate;

public class Cliente 
{
    private int clienteID;
    private String nombre;
    private String domicilio;
    private LocalDate fechaNacimiento;
    private int edad;
    private String user;
    private String password;
    private String salt;
    private boolean isDeleted;
    
    public Cliente() 
    {

    }

    public Cliente(String nombre, String domicilio, LocalDate fechaNacimiento, String user, String password, String salt) 
    {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.fechaNacimiento = fechaNacimiento;
        this.user = user;
        this.password = password;
        this.salt = salt;
    }
    
    public int getClienteID() {
        return clienteID;
    }

    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }

    public String getNombre()  {
        return nombre;
    }

    public void setNombre(String nombre)  {
        this.nombre = nombre;
    }

    public String getDomicilio()  {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
    
    
}
