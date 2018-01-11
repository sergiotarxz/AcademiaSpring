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
@Table(name = "usuarios", uniqueConstraints = @UniqueConstraint( columnNames = { "id" } ))
public class Usuario {
    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    
    @Column(name = "passwd", length = 65)
    private String passwd;

    @OneToOne(mappedBy="usuario")
    private Profesor profesor;
    
    @OneToOne(mappedBy="usuario")
    private Alumno alumno;

    public Usuario() {
    }

    public Usuario(Long id, String username, String passwd, Profesor profesor) {
        this.id = id;
        this.username = username;
        this.passwd = passwd;
        this.profesor = profesor;
    }

    public Usuario(Long id, String username, String passwd, Alumno alumno) {
        this.id = id;
        this.username = username;
        this.passwd = passwd;
        this.alumno = alumno;
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
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Alumno getAlumno() {
        return this.alumno;
    }

    public void setAlumno(Alumno alumno) {
        if (profesor =! null) {
            this.profesor = null;
            System.out.println("Warning: Un profesor ha sido convertido en alumno, esto no deberia hacerse a la ligera...");
        }
        this.alumno = alumno;

    }
}
