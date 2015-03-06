/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.BL;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.biblioteca.modelo.Puesto;

/**
 *
 * @author Admin
 */
@Local
public interface PuestoBLLocal {

    boolean registrar(Puesto puesto);

    boolean eliminar(Puesto puesto);

    boolean modificar(Puesto puesto);

    List<Puesto> getListar();

    Puesto getPorId(int id);
    
     
}
