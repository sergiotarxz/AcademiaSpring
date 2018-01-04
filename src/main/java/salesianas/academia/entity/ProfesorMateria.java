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

@Entity
@Table(name = "profesores_materias", uniqueConstraints = @UniqueConstraint( columnNames = { "id" } ))
public class ProfesorMateria {
    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_materia")
    private Materia materia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_profesor")
    private Profesor profesor;

    public Long getId() {
	return this.id;
    }

    public void setId(Long id) {
	this.id = id;
    }
    
    public Profesor getProfesor() {
	return this.profesor;
    }

    public void setProfesor(Profesor profesor) {
	this.profesor = profesor;
    }

    public Materia getMateria() {
	return this.materia;
    }

    public void setMateria(Materia materia) {
	this.materia = materia;
    }
}
