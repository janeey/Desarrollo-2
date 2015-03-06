/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.BL;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.biblioteca.modelo.Libro;

/**
 *
 * @author Admin
 */
@Local
public interface LibroBLLocal {

    boolean registrar(Libro libro);

    boolean eliminar(Libro libro);

    boolean modificar(Libro libro);

    List<Libro> getListar();

    Libro getPorId(int id);

  
    
}
