package salesianas.academia.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;

import java.util.Date;

@Entity
@Table(name = "alumnos", uniqueConstraints = @UniqueConstraint( columnNames = { "id" } ))
public class Alumno {
    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_curso")
    private Curso curso;

    @Column(name = "nombre", unique = false, nullable = false, length = 20)
    private String nombre;

    @Column(name = "apellidos", unique = false, nullable = false, length = 41)
    private String apellidos;

    @Column(name = "telefono", unique = false, nullable = false, length = 15)
    private String telefono;

    @Column(name = "fecha_nacimiento", unique = false, nullable = true)
    private Date fechaNacimiento;

    @Column(name = "email", unique = false, nullable = false, length = 30)
    private String email;
    
    public Alumno(Long id, String nombre, String apellidos, String telefono, Date fechaNacimiento, String email, Curso curso) {
    	this.id = id;
    	this.nombre = nombre;
    	this.apellidos = apellidos;
    	this.telefono = telefono;
	    this.fechaNacimiento = fechaNacimiento;
	    this.email = email;
        this.curso = curso;
    }
    public Alumno() {
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

    public Date getFechaNacimiento() {
	    return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
	    this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
    	return this.email;
    }

    public void setEmail(String email) {
	    this.email = email;
    }
    
    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }    
}
