package salesianas.academia.model;

import salesianas.academia.entity.Profesor;
import salesianas.academia.entity.Materia;

public class ProfesorMateriaModel {
    
    Long id;
    Materia materia;
    Profesor profesor;

    public ProfesorMateriaModel() {
    }

    public ProfesorMateriaModel(Long id, Materia materia, Profesor profesor) {
        this.id = id;
        this.materia = materia;
        this.profesor = profesor;
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

    public Profesor getProfesor() {
        return this.profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
