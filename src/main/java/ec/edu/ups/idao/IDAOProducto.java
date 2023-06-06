/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Producto;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public interface IDAOProducto {

    public void create(Producto producto);

    public Producto read(String codigo);

    public void update(Producto producto);

    public void delete(Producto producto);
    
}
