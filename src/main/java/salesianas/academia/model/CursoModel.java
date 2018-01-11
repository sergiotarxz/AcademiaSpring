package salesianas.academia.model;

import salesianas.academia.entity.Alumno;
import salesianas.academia.entity.ProfesorCurso;
import salesianas.academia.entity.MateriaCurso;

import java.util.Set;

public class CursoModel {

    Long id;
    String nombre;
    Set<Alumno> alumnos;
    Set<ProfesorCurso> profesoresCurso;
    Set<MateriaCurso> materiasCurso;

    public CursoModel() {
    }

    public CursoModel(Long id, String nombre, Set<Alumno> alumnos, Set<ProfesorCurso> profesoresCurso, Set<MateriaCurso> materiasCurso) {
        this.id = id;
        this.nombre = nombre;
        this.alumnos = alumnos;
        this.profesoresCurso = profesoresCurso;
        this.materiasCurso = materiasCurso;
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

    public Set<Alumno> getAlumnos() {
        return this.alumnos;
    }

    public void setAlumnos(Set<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public Set<ProfesorCurso> getProfesoresCurso() {
        return this.profesoresCurso;
    }

    public void setProfesoresCurso(Set<ProfesorCurso> profesoresCurso) { 
        this.profesoresCurso = profesoresCurso;
    }

    public Set<MateriaCurso> getMateriasCurso() {
        return this.materiasCurso;
    }
    
    public void setMateriasCurso(Set<MateriaCurso> materiasCurso) {
        this.materiasCurso = materiasCurso;
    }
}

