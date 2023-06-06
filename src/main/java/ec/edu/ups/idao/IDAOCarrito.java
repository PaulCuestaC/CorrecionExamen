/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Carrito;

/**
 *
 * @author ESTUDIANTE
 */
public interface IDAOCarrito {

    public void create(Carrito carrito);

    public void read(String id);

    public void update(Carrito carrito);

    public void delete(Carrito carrito);
}
