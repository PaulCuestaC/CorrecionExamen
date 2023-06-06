/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.main;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorProducto;
import ec.edu.ups.dao.DAOCliente;
import ec.edu.ups.vista.VistaCliente;

/**
 *
 * @author ESTUDIANTE
 */
public class PaulCuesta {

    public static void main(String[] args) {
        VistaCliente visCliente = new VistaCliente();
        DAOCliente daoCliente = new DAOCliente();
        ControladorCliente controCliente = new ControladorCliente( );
        ControladorProducto controProducto = new ControladorProducto();
        System.out.println("Ingresar Cliente: ");
        System.out.println("*******");
        controCliente.nuevoCliente();
        controCliente.buscarCliente();
        System.out.println("Ingresar Producto: ");
        System.out.println("*******");
        controProducto.nuevoProducto();
        controProducto.buscarProductoPepa();
    }
}
