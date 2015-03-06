/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.biblioteca.modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "libro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Libro.findAll", query = "SELECT l FROM Libro l"),
    @NamedQuery(name = "Libro.findById", query = "SELECT l FROM Libro l WHERE l.id = :id"),
    @NamedQuery(name = "Libro.findByTitulo", query = "SELECT l FROM Libro l WHERE l.titulo = :titulo"),
    @NamedQuery(name = "Libro.findByEstado", query = "SELECT l FROM Libro l WHERE l.estado = :estado"),
    @NamedQuery(name = "Libro.findByNumeroPagina", query = "SELECT l FROM Libro l WHERE l.numeroPagina = :numeroPagina"),
    @NamedQuery(name = "Libro.findByIsbn", query = "SELECT l FROM Libro l WHERE l.isbn = :isbn")})
public class Libro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "titulo")
    private String titulo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private int estado;
    @Column(name = "numeroPagina")
    private Integer numeroPagina;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "isbn")
    private String isbn;
    @Lob
    @Size(max = 65535)
    @Column(name = "abstracto")
    private String abstracto;
    @Lob
    @Column(name = "imagen")
    private byte[] imagen;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "libroId")
    private Collection<Librocategoria> librocategoriaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "libroId")
    private Collection<Autorlibro> autorlibroCollection;

    public Libro() {
    }

    public Libro(Integer id) {
        this.id = id;
    }

    public Libro(Integer id, String titulo, int estado, String isbn) {
        this.id = id;
        this.titulo = titulo;
        this.estado = estado;
        this.isbn = isbn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Integer getNumeroPagina() {
        return numeroPagina;
    }

    public void setNumeroPagina(Integer numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAbstracto() {
        return abstracto;
    }

    public void setAbstracto(String abstracto) {
        this.abstracto = abstracto;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    @XmlTransient
    public Collection<Librocategoria> getLibrocategoriaCollection() {
        return librocategoriaCollection;
    }

    public void setLibrocategoriaCollection(Collection<Librocategoria> librocategoriaCollection) {
        this.librocategoriaCollection = librocategoriaCollection;
    }

    @XmlTransient
    public Collection<Autorlibro> getAutorlibroCollection() {
        return autorlibroCollection;
    }

    public void setAutorlibroCollection(Collection<Autorlibro> autorlibroCollection) {
        this.autorlibroCollection = autorlibroCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Libro)) {
            return false;
        }
        Libro other = (Libro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.itschapala.biblioteca.modelo.Libro[ id=" + id + " ]";
    }
    
}
