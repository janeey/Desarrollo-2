/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.dao;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.biblioteca.modelo.Librocategoria;

/**
 *
 * @author Admin
 */
@Local
public interface LibrocategoriaDaoLocal {

    void crear(Librocategoria librocategoria);

    void editar(Librocategoria librocategoria);

    void eliminar(Librocategoria librocategoria);

    Librocategoria buscar(Object id);

    List<Librocategoria> buscarTodo();

    List<Librocategoria> buscarRango(int[] range);

    int count();
    
}
