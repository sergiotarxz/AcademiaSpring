package salesianas.academia.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import salesianas.academia.entity.Curso;
import salesianas.academia.entity.Profesor;
import salesianas.academia.entity.ProfesorCurso;





@Repository("ProfesorCursoJpaRepository")
public interface ProfesorCursoJpaRepository extends JpaRepository<ProfesorCurso, Serializable> {
	public abstract ProfesorCurso findById(Long id);
	
	public abstract List<ProfesorCurso> findByProfesor(Profesor profesor);
    public abstract List<ProfesorCurso> findByCurso(Curso curso);
    
    public abstract ProfesorCurso deleteById(Long id);
}
