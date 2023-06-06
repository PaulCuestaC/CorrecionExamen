/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Carrito;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class DAOCarrito implements ec.edu.ups.idao.IDAOCarrito{
    
    private List<Carrito> listaCarritos = new ArrayList<>();

    @Override
    public void create(Carrito carrito) {
        listaCarritos.add(carrito);
    }

        public void read(String id) {
        for (int i = 0; i < listaCarritos.size(); i++) {
           if (listaCarritos.get(i).getId().equals(id)){
               System.out.println(listaCarritos.get(i));
           }
        }
     
    }
    

    @Override
    public void update(Carrito carrito) {

    }

    @Override
    public void delete(Carrito carrito) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
