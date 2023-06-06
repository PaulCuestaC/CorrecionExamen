/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Producto;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class VistaProducto {

    Scanner scanner = new Scanner(System.in);

    public Producto ingresoProducto() {
        System.out.println("Ingrese los datos del producto");
        String codigo = scanner.next();
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = scanner.next();
        System.out.println("Ingrese la descripcion del prodcuto: ");
        String descripcion = scanner.next();
        System.out.println("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        Producto producto = new Producto(codigo, nombre, descripcion, precio);
        return producto;
    }

    public String buscar() {
        System.out.println("Ingrese la cantidad de productos a buscar: ");
        int i= scanner.nextInt();
        for (int j = 0; j < i; j++) {
        System.out.println("Ingrese el codigo del producto a buscar: ");
        return scanner.next();
        }
        return null;
    }
}
