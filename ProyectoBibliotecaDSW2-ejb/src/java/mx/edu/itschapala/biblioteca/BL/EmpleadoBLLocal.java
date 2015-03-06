/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.BL;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.biblioteca.modelo.Empleado;

/**
 *
 * @author Admin
 */
@Local
public interface EmpleadoBLLocal {

    boolean registro(Empleado empleado);

    boolean eliminar(Empleado empleado);

    boolean modificar(Empleado empleado);

    List<Empleado> getListar();

    Empleado getPorId(int id);
    
}
