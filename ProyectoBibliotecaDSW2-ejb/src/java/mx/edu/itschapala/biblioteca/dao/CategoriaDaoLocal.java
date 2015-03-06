/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.dao;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.biblioteca.modelo.Categoria;

/**
 *
 * @author Admin
 */
@Local
public interface CategoriaDaoLocal {

    void crear(Categoria categoria);

    void editar(Categoria categoria);

    void eliminar(Categoria categoria);

    Categoria buacar(Object id);

    List<Categoria> buscarTodo();

    List<Categoria> buscarRango(int[] range);

    int count();
    
}
