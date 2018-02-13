package salesianas.academia.repository;

import salesianas.academia.entity.Profesor;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ProfesorJpaRepository")
public interface ProfesorJpaRepository extends JpaRepository<Profesor, Serializable> {

    public abstract Profesor findById(Long id);
    public abstract List<Profesor> findByNombre(String nombre);
	public abstract List<Profesor> findByApellidos(String apellidos);
	public abstract List<Profesor> findByTelefono(String Telefono);
	public abstract List<Profesor> findByEmail(String email);
	public abstract List<Profesor> findByDni(String dni);

    public abstract void deleteById(Long id);
}
