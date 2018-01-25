package salesianas.academia.service;

import org.springframework.stereotype.Service;

import java.util.List;

import salesianas.academia.entity.Profesor;

@Service("ProfesorService")
public interface ProfesorService {
    public abstract Profesor addProfesor(Profesor profesor);
    public abstract List<Profesor> listAllProfesor();
    public abstract void removeProfesorById(Long id);
    public abstract Profesor updateProfesor(Profesor profesor);
	
}
