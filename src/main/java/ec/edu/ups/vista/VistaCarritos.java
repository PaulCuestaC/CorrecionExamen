/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorProducto;
import ec.edu.ups.modelo.Carrito;
import ec.edu.ups.modelo.Producto;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class VistaCarritos {

    Scanner scanner = new Scanner(System.in);
    ControladorProducto contro = new ControladorProducto();
    private List<Producto>listaProducto = new ArrayList<>();

    public Carrito ingresoProducto() {
        System.out.println("Ingrese los datos del carrito");
        Date horaFecha = Date.from(Instant.MIN);
        String id = "0";
        
        Producto producto = contro.buscarProductoPepa();
        listaProducto.add(producto);
    }
    public double subtotal(){
        for (int i = 0; i < listaProducto.size(); i++) {
            listaProducto.
            
        }
    }
    public String buscar() {
        System.out.println("Ingrese el codigo del producto a buscar: ");
        return scanner.next();
    }
}
