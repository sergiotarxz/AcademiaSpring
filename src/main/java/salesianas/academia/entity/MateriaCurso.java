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

import java.util.Set;
import java.util.Date;

@Entity
@Table(name = "materias_cursos", uniqueConstraints = @UniqueConstraint( columnNames = { "id" } ))
public class MateriaCurso {
    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "dia_semana")
    private int diaSemana;

    @Column(name = "duracion")
    private Date duracion;

    @Column(name = "hora_inicio")
    private Date horaInicio;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_materia")
    private Materia materia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_curso")
    private Curso curso;
    
    public Long getId() {
	return this.id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public Materia getMateria() {
	return this.materia;
    }

    public void setMateria(Materia materia) {
	this.materia = materia;
    }

    public Curso getCurso() {
	return this.curso;
    }

    public void setCurso() {
	this.curso = curso;
    }
}
