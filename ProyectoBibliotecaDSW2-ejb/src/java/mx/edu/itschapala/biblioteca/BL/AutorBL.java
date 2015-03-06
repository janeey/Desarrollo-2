/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.BL;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.biblioteca.dao.AutorDaoLocal;
import mx.edu.itschapala.biblioteca.modelo.Autor;

/**
 *
 * @author Admin
 */
@Stateless
public class AutorBL implements AutorBLLocal {
    @EJB
    private AutorDaoLocal autorDao;

    @Override
    public boolean registrar(Autor autor) {
       autorDao.crear(autor);
        return true;
 }  

    @Override
    public boolean eleminar(Autor autor) {
         autorDao.crear(autor);
        return true;
    }

    @Override
    public boolean modifacar(Autor autor) {
        autorDao.crear(autor);
        return true;
    }

    @Override
    public List<Autor> getListar() {
       return autorDao.buscarTodo();
        
    }

    @Override
    public Autor getPorId(int id) {
        return autorDao.buscar(id);
    }
    
        
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")


