package salesianas.academia.service;

import java.util.List;

import salesianas.academia.entity.Alumno;

public interface AlumnoService {
	
	public abstract Alumno addAlumno(Alumno alumno);
	public abstract List<Alumno> listAllAlumno();
	public abstract void removeAlumno(Long id);
	public abstract Alumno updateAlumno(Alumno alumno);
	

}
