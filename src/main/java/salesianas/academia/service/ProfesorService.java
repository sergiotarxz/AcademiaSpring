package salesianas.academia.service;

import java.util.List;


import salesianas.academia.entity.Profesor;

public interface ProfesorService {
	
	public abstract Profesor addProfesor(Profesor profesor) ;
    public abstract List<Profesor> listAllProfesor();
    public abstract int removeProfesor(int id);
    public abstract Profesor updateProfesor(Profesor profesor);
	
}