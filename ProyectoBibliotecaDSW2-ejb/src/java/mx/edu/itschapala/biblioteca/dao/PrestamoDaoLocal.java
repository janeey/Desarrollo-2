/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.dao;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.biblioteca.modelo.Prestamo;

/**
 *
 * @author Admin
 */
@Local
public interface PrestamoDaoLocal {

    void create(Prestamo prestamo);

    void editar(Prestamo prestamo);

    void eliminar(Prestamo prestamo);

    Prestamo buscar(Object id);

    List<Prestamo> buscarTodo();

    List<Prestamo> buscarRango(int[] range);

    int count();
    
}
