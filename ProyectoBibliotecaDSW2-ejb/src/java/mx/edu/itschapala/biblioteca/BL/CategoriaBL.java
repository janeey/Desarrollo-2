/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.BL;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.Id;
import mx.edu.itschapala.biblioteca.dao.CategoriaDao;
import mx.edu.itschapala.biblioteca.dao.CategoriaDaoLocal;
import mx.edu.itschapala.biblioteca.modelo.Categoria;

/**
 *
 * @author Admin
 */
@Stateless
public class CategoriaBL implements CategoriaBLLocal {
    @EJB
    private CategoriaDaoLocal categoriaDao;
    
    @Override
    public boolean registrar(Categoria categoria) {
        categoriaDao.crear(categoria);
        return true;   
    }

    @Override
    public boolean eliminar(Categoria categoria) {
        categoriaDao.eliminar(categoria);
        return true;
    }

    @Override
    public boolean modificar(Categoria categoria) {
        categoriaDao.editar(categoria);
        return true;
    }

    @Override
    public List<Categoria> getListar() {
        return categoriaDao.buscarTodo();
    }

    @Override
    public Categoria getPorId(int Id) {
        return categoriaDao.buacar(Id);
    }

}
