/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.modelo;

import java.util.Objects;

/**
 *
 * @author ESTUDIANTE
 */
public class Cliente {

    private String cedula;
    private String nombre;
    private String apellido;
    private String dirección;
    private String teléfono;

    public Cliente() {
    }

    public Cliente(String cedula, String nombre, String apellido, String dirección, String teléfono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dirección = dirección;
        this.teléfono = teléfono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", nombres=" + nombre + ", apellidos=" + apellido + ", direcci\u00f3n=" + dirección + ", tel\u00e9fono=" + teléfono + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.cedula);
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
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.cedula, other.cedula);
    }

}
