package salesianas.academia.model;

import salesianas.academia.entity.Profesor;
import salesianas.academia.entity.Curso;

public class ProfesorCursoModel {

    Long id;
    Profesor profesor;
    Curso curso;

    public ProfesorCursoModel() {
    }

    public ProfesorCursoModel(Long id, Curso curso, Profesor profesor) {
        this.id = id;
        this.curso = curso;
        this.profesor = profesor;
    }

    public Curso getCurso() {
        return this.curso;
    }
    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Profesor getProfesor() {
        return this.profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}

