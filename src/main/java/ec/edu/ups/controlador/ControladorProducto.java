/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.controlador;

import ec.edu.ups.dao.DAOProducto;
import ec.edu.ups.modelo.Producto;
import ec.edu.ups.vista.VistaProducto;

/**
 *
 * @author ESTUDIANTE
 */
public class ControladorProducto {

    VistaProducto vistaProducto= new VistaProducto();
    DAOProducto daoProducto= new DAOProducto();

    public void ControladorProducto(VistaProducto vistaProducto, DAOProducto daoProducto) {
        this.daoProducto = daoProducto;
        this.vistaProducto = vistaProducto;

    }

    public void nuevoProducto() {
        daoProducto.create(vistaProducto.ingresoProducto());
    }

    public void buscarProducto() {
        daoProducto.read(vistaProducto.buscar());
    }

    public Producto buscarProductoPepa() {
        
        return daoProducto.read(vistaProducto.buscar());
    }
}
