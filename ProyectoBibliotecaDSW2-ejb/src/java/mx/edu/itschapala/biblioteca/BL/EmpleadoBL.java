/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.BL;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.biblioteca.dao.EmpleadoDaoLocal;
import mx.edu.itschapala.biblioteca.modelo.Empleado;

/**
 *
 * @author Admin
 */
@Stateless
public class EmpleadoBL implements EmpleadoBLLocal {
    @EJB
    private EmpleadoDaoLocal empleadoDao;
    
     @Override
    public boolean registro(Empleado empleado) {
        empleadoDao.crear(empleado);
        return true;
    }

    @Override
    public boolean eliminar(Empleado empleado) {
        empleadoDao.eliminar(empleado);
        return true;
    }

    @Override
    public boolean modificar(Empleado empleado) {
        empleadoDao.editar(empleado);
        return true;
    }

    @Override
    public List<Empleado> getListar() {
        return empleadoDao.buscarTodo();
    }

    @Override
    public Empleado getPorId(int id) {
        return null;
    }
}
