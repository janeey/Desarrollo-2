/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.BL;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.biblioteca.dao.PuestoDaoLocal;
import mx.edu.itschapala.biblioteca.modelo.Puesto;

/**
 *
 * @author Admin
 */
@Stateless
public class PuestoBL implements PuestoBLLocal {
    @EJB
    private PuestoDaoLocal puestoDao;
   
    @Override
    public boolean registrar(Puesto puesto) {
        puestoDao.crear(puesto);
        return true;
    }

    @Override
    public boolean eliminar(Puesto puesto) {
        puestoDao.eliminar(puesto);
        return true;
    }

    @Override
    public boolean modificar(Puesto puesto) {
        puestoDao.editar(puesto);
        return true;
    }

    @Override
    public List<Puesto> getListar() {
        return puestoDao.buscarTodo();
    }

    @Override
    public Puesto getPorId(int id) {
        return puestoDao.buscar(id);
    }
}
