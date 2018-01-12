package salesianas.academia.repository;

import salesianas.academia.entity.Curso;
import java.io.Serializable;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("CursoJpaRepository")
public interface CursoJpaRepository extends JpaRepository<Curso, Serializable> {
    
} 
