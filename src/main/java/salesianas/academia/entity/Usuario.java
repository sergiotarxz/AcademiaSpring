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
import javax.persistence.JoinColumn;

import java.util.Set;

@Entity
@Table(name = "usuarios", uniqueConstraints = @UniqueConstraint( columnNames = { "id" } ))
public class Usuario {
    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    
    @Column(name = "username", length = 25)
    private String username;

    @Column(name = "passwd", length = 65)
    private String passwd;

    @OneToOne(mappedBy="usuario")
    @JoinColumn(name="profesor_id")
    private Profesor profesor;
    
    @OneToOne(mappedBy="usuario")
    @JoinColumn(name="alumno_id")
    private Alumno alumno;

    private boolean admin;

    public Usuario() {
    }

    public Usuario(Long id, String username, String passwd, Profesor profesor, boolean admin) {
        this.id = id;
        this.username = username;
        this.passwd = passwd;
        this.profesor = profesor;
        this.admin = admin;
    }

    public Usuario(Long id, String username, String passwd, Alumno alumno) {
        this.id = id;
        this.username = username;
        this.passwd = passwd;
        this.alumno = alumno;
        this.admin = false;
    }

    public boolean esProfesor() {
        if (alumno == null) {
            return true;
        } else {
            return false;
        }
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return this.passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
    public boolean getAdmin() {
        return admin;
    }
    
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public Alumno getAlumno() {
        return this.alumno;
    }
    
    public void setAlumno(Alumno alumno) {
        if (profesor != null) {
            System.out.println("Intento de asignar alumno a profesor detectado, debe tratarse de un error");
        }
        this.alumno = alumno;
    }
    
    public Profesor getProfesor() {
    	return this.profesor;
    }

    public void setProfesor(Profesor profesor) {
        if (alumno != null) {
            System.out.println("Intento de asignar profesor a alumno detectado, debe tratarse de un error");
        }
        this.profesor = profesor;
    }
}
