/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dao.ITransaccionDAO;

/**
 *
 * @author Ryzen 5
 */
public class TransaccionNegocio implements ITransaccionNegocio
{
    private ITransaccionDAO transaccionDAO;
    
    public TransaccionNegocio(ITransaccionDAO transaccionDAO)
    {
        this.transaccionDAO = transaccionDAO;
    }
}
