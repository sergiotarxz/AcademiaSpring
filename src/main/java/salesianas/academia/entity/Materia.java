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
    private Set<ProfesorMateria> profesorMateria;
}
