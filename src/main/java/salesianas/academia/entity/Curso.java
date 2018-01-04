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
@Table(name = "cursos", uniqueConstraints = @UniqueConstraint ( columnNames = { "id" } ))
public class Curso {
    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    
    @Column(name = "nombre", nullable = false, length = 20)
    private String nombre;

    @OneToMany
    @JoinColumn(name = "id_curso")
    private Set<ProfesorCurso> ProfesorCurso;

    @OneToMany
    @JoinColumn(name = "id_curso")
    private Set<ProfesorMateria> profesorMateria;
    
    @OneToMany
    @JoinColumn(name = "id_curso")
    private Set<Alumno> alumnos;
    
    public Curso(Long id, String nombre) {
	this.id = id;
	this.nombre = nombre;
    }

    public Curso() {
    }

    public Long getId() {
	return this.id;
    }

    public void setId() {
	this.id = id;
    }

    public String getNombre() {
	return nombre;
    }
    
}
