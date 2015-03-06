/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.BL;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.biblioteca.modelo.Autor;

/**
 *
 * @author Admin
 */
@Local
public interface AutorBLLocal {

    boolean registrar(Autor autor);

    boolean eleminar(Autor autor);

    boolean modifacar(Autor autor);

    List<Autor> getListar();

    Autor getPorId(int id);
    
}
