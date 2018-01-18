package salesianas.academia.repository;

import salesianas.academia.entity.ProfesorMateria;
import salesianas.academia.entity.Profesor;
import salesianas.academia.entity.Materia;

import java.util.List;
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ProfesorMateriaJpaRepository")
public interface ProfesorMateriaJpaRepository extends JpaRepository<ProfesorMateria, Serializable> {
    public abstract ProfesorMateria findById(Long id);
    public abstract List<ProfesorMateria> findByProfesor(Profesor profesor);
    public abstract List<ProfesorMateria> findByMateria(Materia materia);

    public abstract ProfesorMateria deleteById(Long id);
}
