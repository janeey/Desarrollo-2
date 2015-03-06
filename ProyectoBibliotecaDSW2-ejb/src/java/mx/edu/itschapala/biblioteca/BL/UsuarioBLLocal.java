/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.BL;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.biblioteca.modelo.Usuario;

/**
 *
 * @author Admin
 */
@Local
public interface UsuarioBLLocal {

    boolean registrar(Usuario usuaruio);

    boolean eliminar(Usuario usuario);

    boolean modificar(Usuario ususario);

    List<Usuario> getListar();

    Usuario getPorId(int Id);
    
}
