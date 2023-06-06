/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class DAOCliente implements ec.edu.ups.idao.IDAOCliente {

    private List<Cliente> listaCliente = new ArrayList<>();

    @Override
    public void create(Cliente cliente) {
        listaCliente.add(cliente);
    }

    @Override
    public void read(String id) {
        for (int i = 0; i < listaCliente.size(); i++) {
           if (listaCliente.get(i).getCedula().equals(id)){
               System.out.println(listaCliente.get(i));
           }
        }
     
    }

    @Override
    public void update(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Cliente cliente) {
        listaCliente.remove(cliente);
    }

}
