package salesianas.academia.repository;

import salesianas.academia.entity.Materia;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("MateriaJpaRepository")
public interface MateriaJpaRepository extends JpaRepository<Materia, Serializable> {
    public abstract Materia findById(Long id);
    public List<Materia> findByNombre(String nombre);
}
