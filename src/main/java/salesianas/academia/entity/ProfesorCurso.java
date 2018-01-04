package salesianas.academia.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "profesores_cursos", uniqueConstraints = @UniqueConstraint( columnNames = { "id" } ))

public class ProfesorCurso {
    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_curso")
    private Curso curso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_profesor")
    private Profesor profesor;

    public Profesor getProfesor() {
	return this.profesor;
    }

    public void setProfesor(Profesor profesor) {
	this.profesor = profesor;
    }
    
    public Curso getCurso() {
	return curso;
    }

    public void setCurso(Curso curso) {
	this.curso = curso;
    }
}
