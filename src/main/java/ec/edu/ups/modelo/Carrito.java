/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.modelo;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author ESTUDIANTE
 */
public class Carrito {

    private Date hora_fecha;
    private String id;
    private double subtotal;
    private double IVA;
    private double total_a_pagar;
    private List<Producto> listaProducto;
    

    public Carrito() {
    }

    public Carrito(Date hora_fecha, String id, double subtotal, double IVA, double total_a_pagar) {
        this.hora_fecha = hora_fecha;
        this.id = id;
        this.subtotal = subtotal;
        this.IVA = IVA;
        this.total_a_pagar = total_a_pagar;
       
     
    }

    
    public Date getHora_fecha() {
        return hora_fecha;
    }

    public void setHora_fecha(Date hora_fecha) {
        this.hora_fecha = hora_fecha;
    }

  

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public double getTotal_a_pagar() {
        return total_a_pagar;
    }

    public void setTotal_a_pagar(double total_a_pagar) {
        this.total_a_pagar = total_a_pagar;
    }

    public List<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(List<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }

   

    @Override
    public String toString() {
        return "Carrito{" + "hora y fecha=" + hora_fecha + ", subtotal=" + subtotal + ", IVA=" + IVA + ", total_a_pagar=" + total_a_pagar + ", listaProducto=" + listaProducto + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.hora_fecha);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carrito other = (Carrito) obj;
        return Objects.equals(this.hora_fecha, other.hora_fecha);
    }

}
