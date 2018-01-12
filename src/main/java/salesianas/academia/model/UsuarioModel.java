package salesianas.academia.model;

import salesianas.academia.entity.Profesor;
import salesianas.academia.entity.Alumno;

public class UsuarioModel {
    
    Long id;
    String username;
    String passwd;
    Profesor profesor;
    Alumno alumno;
    boolean admin;
    
    public UsuarioModel() {
    }

    public UsuarioModel(Long id, String username, String passwd, Alumno alumno, Profesor profesor, boolean admin) {
        this.id = id;
        this.username = username;
        this.passwd = passwd;
        this.profesor = profesor;
        this.alumno = alumno;
        this.admin = admin;
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
    
    public Profesor getProfesor() {
        return this.profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Alumno getAlumno() {
        return this.alumno;
    }
    
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public boolean getAdmin() {
        return admin;
    }
    
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
