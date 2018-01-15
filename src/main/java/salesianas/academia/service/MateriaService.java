package salesianas.academia.service;

import java.util.List;

import salesianas.academia.entity.Materia;

public interface MateriaService {
    public abstract Materia addMateria(Materia materia);
    public abstract Materia updateMateria(Materia materia);
    public abstract List<Materia> listAllMateria();
    public abstract void removeMateria(Long id);
}
