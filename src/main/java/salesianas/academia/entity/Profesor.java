package salesianas.academia.entity;

import salesianas.academia.entity.ProfesorCurso;
import salesianas.academia.entity.ProfesorMateria;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


import java.util.Set;

@Entity
@Table(name = "profesores", uniqueConstraints = @UniqueConstraint( columnNames = { "id" } ))
public class Profesor {
    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 20)
    private String nombre;

    @Column(name = "apellidos", nullable = false, length = 41)
    private String apellidos;

    @Column(name = "telefono", nullable = false, length = 15)
    private String telefono;

    @Column(name = "email", nullable = false, length = 30)
    private String email;

    @Column(name = "dni", unique = true, nullable = false, length = 9)
    private String dni;

    @OneToMany(mappedBy="profesor")
    private Set<ProfesorMateria> profesorMaterias;
    
    @OneToOne(mappedBy="userEntity")
    private Usuario usuario;

    public Profesor(Long id, String nombre, String apellidos, String telefono, String email, String dni, Set<ProfesorMateria> profesorMaterias) {
	    this.id = id;
	    this.nombre = nombre;
	    this.apellidos = apellidos;
    	this.telefono = telefono;
    	this.email = email;
        this.dni = dni;
        this.profesorMaterias = profesorMaterias;
    }

    public Profesor() {
    }

    public boolean esProfesor() {
        return true;
    }

    public void setProfesorMaterias(Set<ProfesorMateria> profesorMateria) {
    	this.profesorMaterias = profesorMaterias;
    }

    public Set<ProfesorMateria> getProfesorMaterias(){
	    return this.profesorMaterias;
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

    public String getApellidos() {
	    return this.apellidos;
    }

    public void setApellidos(String apellidos) {
    	this.apellidos = apellidos;
    }

    public String getTelefono() {
	    return this.telefono;
    }

    public void setTelefono(String telefono) {
	    this.telefono = telefono;
    }

    public String getEmail() {
	    return this.email;
    }

    public void setEmail() {
	    this.email = email;
    }

    public String getDni() {
	    return this.dni;
    }

    public void setDni() {
	    this.dni = dni;
    }
}
