/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.dao;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.biblioteca.modelo.Autor;

/**
 *
 * @author Admin
 */
@Local
public interface AutorDaoLocal {

    void crear(Autor autor);

    void editar(Autor autor);

    void eliminar(Autor autor);

    Autor buscar(Object id);

    List<Autor> buscarTodo();

    List<Autor> buscarRango(int[] range);

    int count();
    
}
