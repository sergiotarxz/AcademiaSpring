package salesianas.academia.model;

public class MateriaModel {

    Long id;
    String nombre;
    Set<ProfesorMateria> profesoresMaterias;
    Set<MateriaCurso> materiaCursos;

    public MateriaModel() {
    }

    public MateriaModel(Long id, String Nombre, Set<ProfesorMateria> profesoresMaterias) {
    }
}
        
