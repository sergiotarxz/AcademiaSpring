package salesianas.academia.repository;

import salesianas.academia.entity.Alumno;

import java.io.Serializable;
import java.util.List;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("AlumnoJpaRepository")
public interface AlumnoJpaRepository extends JpaRepository<Alumno, Serializable> {

    public abstract Alumno findById(Long id);
    public abstract List<Alumno> findByNombre(String nombre);
    public abstract List<Alumno> findByApellidos(String apellidos);
    public abstract List<Alumno> findByTelefono(String telefono);
    public abstract List<Alumno> findByFechaNacimiento(Date fechaNacimiento);
    public abstract List<Alumno> findByEmail(String email);
}
