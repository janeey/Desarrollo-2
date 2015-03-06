/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.dao;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.biblioteca.modelo.Autorlibro;

/**
 *
 * @author Admin
 */
@Local
public interface AutorlibroDaoLocal {

    void crear(Autorlibro autorlibro);

    void editar(Autorlibro autorlibro);

    void eliminar(Autorlibro autorlibro);

    Autorlibro buscar(Object id);

    List<Autorlibro> buacrTodo();

    List<Autorlibro> buscarRango(int[] range);

    int count();
    
}
