/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class DAOProducto implements ec.edu.ups.idao.IDAOProducto {

    private List<Producto> listaProducto = new ArrayList<>();

    @Override
    public void create(Producto producto) {
        listaProducto.add(producto);

    }

    @Override

    public Producto read(String codigo) {
        for (int i = 0; i < listaProducto.size(); i++) {
            if (listaProducto.get(i).getCódigo().equals(codigo)) {
                 System.out.println(listaProducto.get(i));
                 Producto producto = listaProducto.get(i);
                 return producto;
            }
        }
        return null;

    }

   

    @Override
    public void update(Producto producto) {

    }

    @Override
    public void delete(Producto producto) {
        listaProducto.remove(producto);
    }

}
