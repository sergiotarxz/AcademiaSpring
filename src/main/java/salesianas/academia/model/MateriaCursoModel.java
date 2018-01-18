package salesianas.academia.model;

import salesianas.academia.entity.Curso;
import salesianas.academia.entity.Materia;

public class MateriaCursoModel {
    Long id;
    Materia materia;
    Curso curso;

    public MateriaCursoModel() {

    }

    public MateriaCursoModel(Long id, Materia materia, Curso curso) {
        this.id = id;
        this.materia = materia;
        this.curso = curso;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Materia getMateria() {
        return this.materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
