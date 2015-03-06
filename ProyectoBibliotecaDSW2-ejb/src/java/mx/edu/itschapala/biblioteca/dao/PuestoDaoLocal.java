/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.dao;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.biblioteca.modelo.Puesto;

/**
 *
 * @author Admin
 */
@Local
public interface PuestoDaoLocal {

    void crear(Puesto puesto);

    void editar(Puesto puesto);

    void eliminar(Puesto puesto);

    Puesto buscar(Object id);

    List<Puesto> buscarTodo();

    List<Puesto> buscarRango(int[] range);

    int count();
    
}
