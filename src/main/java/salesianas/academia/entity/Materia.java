package salesianas.academia.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

import java.util.Set;

@Entity
@Table(name = "materia", uniqueConstraints = @UniqueConstraint( columnNames = { "id" } ))
public class Materia {

    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 20)
    private String nombre;

    @OneToMany
    @JoinColumn(name = "id_materia")
    private Set<ProfesorMateria> profesoresMateria;
    
    @OneToMany
    @JoinColumn(name = "id_materia")
    private Set<MateriaCurso> materiaCursos;

    public Materia() {
    }

    public Materia(Long id, String nombre, Set<ProfesorMateria> profesoresMateria, Set<MateriaCurso> materiaCursos) {
        this.id = id;
        this.nombre = nombre;
        this.profesoresMateria = profesoresMateria;
        this.materiaCursos = materiaCursos;
    }
    
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Set<ProfesorMateria> getProfesoresMateria() {
        return this.profesoresMateria;
    }

    public void setProfesoresMateria(Set<ProfesorMateria> profesoresMateria) {
        this.profesoresMateria = profesoresMateria;
    }
    
    public Set<MateriaCurso> getMateriaCursos() {
        return this.materiaCursos;
    }

    public void setMateriaCursos(Set<MateriaCurso> materiaCursos) {
        this.materiaCursos = materiaCursos;
    }
}
