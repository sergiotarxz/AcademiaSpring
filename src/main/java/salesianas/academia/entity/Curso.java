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
    private Set<ProfesorCurso> profesoresCurso;

    @OneToMany
    @JoinColumn(name = "id_curso")
    private Set<MateriaCurso> materiasCurso;

    @OneToMany
    @JoinColumn(name = "id_curso")
    private Set<Alumno> alumnos;
    
    public Curso(Long id, String nombre, Set<Alumno> alumnos, Set<ProfesorCurso> profesoresCurso, Set<MateriaCurso> materiasCurso) {
    	this.id = id;
	    this.nombre = nombre;
        this.alumnos = alumnos;
        this.profesoresCurso = profesoresCurso;
        this.materiasCurso = materiasCurso;
    }

    public Curso() {
    }

    public Long getId() {
	    return this.id;
    }

    public void setId(Long id) {
	    this.id = id;
    }

    public String getNombre() {
	    return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Alumno> getAlumnos() {
        return this.alumnos;
    }    

    public void setAlumnos(Set<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public Set<ProfesorCurso> getProfesoresCurso() {
        return this.profesoresCurso;
    } 
    
    public void setProfesoresCurso(Set<ProfesorCurso> profesoresCurso) { 
        this.profesoresCurso = profesoresCurso;
    }

    public Set<MateriaCurso> getMateriasCurso() {
        return materiasCurso; 
    }

    public void setMateriasCurso(Set<MateriaCurso> materiasCurso) {
        this.materiasCurso = materiasCurso;
    }
}
