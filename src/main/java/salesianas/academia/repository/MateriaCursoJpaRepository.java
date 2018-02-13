package salesianas.academia.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import salesianas.academia.entity.Curso;
import salesianas.academia.entity.Materia;
import salesianas.academia.entity.MateriaCurso;


@Repository("MateriaCursoJpaRepository")
public interface MateriaCursoJpaRepository extends JpaRepository<MateriaCurso, Serializable>{
	
	public abstract List<MateriaCurso> findByMateria(Materia materia);
	public abstract List<MateriaCurso> findByCurso(Curso curso);
	
	public abstract MateriaCurso deleteById(Long id);

}
