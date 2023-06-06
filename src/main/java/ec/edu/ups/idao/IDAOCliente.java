/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Cliente;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public interface IDAOCliente {
    
    public void create(Cliente cliente);

    public void read(String id);

    public void update(Cliente cliente);

    public void delete(Cliente cliente);
    
    
}
