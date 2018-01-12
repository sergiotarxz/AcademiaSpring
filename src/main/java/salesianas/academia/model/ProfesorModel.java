package salesianas.academia.model;

import salesianas.academia.entity.ProfesorMateria;
import salesianas.academia.entity.ProfesorCurso;

import java.util.Set;

public class ProfesorModel {
    
    Long id;
    String nombre;
    String apellidos;
    String telefono;
    String email;
    String dni;
    Set<ProfesorMateria> profesorMaterias;
    Set<ProfesorCurso> profesorCursos;

    public ProfesorModel() {
           
    }
    
    public ProfesorModel(Long id, String nombre, String apellidos, String telefono, String email, String dni, Set<ProfesorMateria> profesorMateria, Set<ProfesorCurso> profesorCursos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.dni = dni;
        this.profesorMaterias = profesorMaterias;
        this.profesorCursos = profesorCursos;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(long id) {
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

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getDni() {
        return this.dni;
    }    
    
    public void setDni(String dni) {
        this.dni = dni;
    }

    public Set<ProfesorMateria> getProfesorMaterias() {
        return this.profesorMaterias;
    }
    
    public void setProfesorMaterias(Set<ProfesorMateria> profesorMaterias) {
        this.profesorMaterias = profesorMaterias;
    }
}

