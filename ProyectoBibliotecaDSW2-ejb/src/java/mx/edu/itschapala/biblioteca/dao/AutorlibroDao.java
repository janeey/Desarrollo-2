/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mx.edu.itschapala.biblioteca.modelo.Autorlibro;

/**
 *
 * @author Admin
 */
@Stateless
public class AutorlibroDao extends AbstractDao<Autorlibro> implements AutorlibroDaoLocal {
    @PersistenceContext(unitName = "ProyectoBibliotecaDSW2-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AutorlibroDao() {
        super(Autorlibro.class);
    }

    @Override
    public void crear(Autorlibro autorlibro) {
       
    }

    @Override
    public void editar(Autorlibro autorlibro) {
        
    }

    @Override
    public void eliminar(Autorlibro autorlibro) {
        
    }

    @Override
    public Autorlibro buscar(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Autorlibro> buacrTodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Autorlibro> buscarRango(int[] range) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
