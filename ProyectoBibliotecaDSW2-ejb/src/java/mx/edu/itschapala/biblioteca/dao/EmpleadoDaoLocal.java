/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.dao;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.biblioteca.modelo.Empleado;

/**
 *
 * @author Admin
 */
@Local
public interface EmpleadoDaoLocal {

    void crear(Empleado empleado);

    void editar(Empleado empleado);

    void eliminar(Empleado empleado);

    Empleado buscar(Object id);

    List<Empleado> buscarTodo();

    List<Empleado> buscarRango(int[] range);

    int count();
    
}
