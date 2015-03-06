/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.BL;

import java.util.List;
import javax.ejb.Local;
import javax.persistence.Id;
import mx.edu.itschapala.biblioteca.modelo.Categoria;

/**
 *
 * @author Admin
 */
@Local
public interface CategoriaBLLocal {

    boolean registrar(Categoria categoria);

    boolean eliminar(Categoria categoria);

    boolean modificar(Categoria categoria);

    List<Categoria> getListar();

    Categoria getPorId(int Id);

  



 

    
}
