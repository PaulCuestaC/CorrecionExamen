/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.DAOCliente;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.vista.VistaCliente;

/**
 *
 * @author ESTUDIANTE
 */
public class ControladorCliente {
    VistaCliente vistaCliente = new VistaCliente();
    DAOCliente daoCliente= new DAOCliente();
    
    public void ControladorCliente(VistaCliente vistaCliente, DAOCliente daoCliente){
       this.daoCliente = daoCliente;
       this.vistaCliente = vistaCliente;
               
    }
    public void nuevoCliente(){
        Cliente cliente = vistaCliente.ingresoCliente();
        daoCliente.create(cliente);
        daoCliente.read(cliente.getCedula());
    }
    public void buscarCliente(){
        daoCliente.read(vistaCliente.buscar());
    }
    
}
