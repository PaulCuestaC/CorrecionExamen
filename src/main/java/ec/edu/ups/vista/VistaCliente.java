/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Cliente;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class VistaCliente {
    Scanner scanner = new Scanner(System.in);
    
    public Cliente ingresoCliente() {
        System.out.println("Ingrese los datos del cliente");
        System.out.println("Ingrese la cedula: ");
        String cedula = scanner.next();
        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.next();
        System.out.println("Ingrese el apellido: ");
        String apellido = scanner.next();
        System.out.println("Ingrese la dirección: ");
        String direccion = scanner.next();
        System.out.println("Ingrese el numero de Telefono: ");
        String telefono = scanner.next();
        Cliente cliente = new Cliente(cedula, nombre, apellido, direccion, telefono);
        return cliente;
    }
    public String buscar(){
        System.out.println("Ingrese la cedula del cliente a buscar: ");
        return scanner.next();
    }
   
}
