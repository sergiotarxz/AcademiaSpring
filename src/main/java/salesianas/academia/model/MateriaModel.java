package salesianas.academia.model;

import salesianas.academia.entity.ProfesorMateria;
import salesianas.academia.entity.MateriaCurso;

import java.util.Set;

public class MateriaModel {

    Long id;
    String nombre;
    Set<ProfesorMateria> profesoresMaterias;
    Set<MateriaCurso> materiaCursos;

    public MateriaModel() {
    }

    public MateriaModel(Long id, String Nombre, Set<ProfesorMateria> profesoresMaterias, Set<MateriaCurso> materiaCursos) {
        this.id = id;
        this.nombre = nombre;
        this.profesoresMaterias = profesoresMaterias;
        this.materiaCursos = materiaCursos;
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

    public Set<ProfesorMateria> getProfesoresMateria() {
        return this.profesoresMaterias;
    }

    public void setProfesoresMateria(Set<ProfesorMateria> profesoresMateria) {
        this.profesoresMaterias = profesoresMaterias;
    }

    public Set<MateriaCurso> getMateriaCursos() {
        return this.materiaCursos;
    }
    
    public void setMateriaCursos(Set<MateriaCurso> materiaCursos) {
       this.materiaCursos = materiaCursos;
    } 
}
        
