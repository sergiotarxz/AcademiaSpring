package salesianas.academia.converter;

import org.springframework.stereotype.Component;

import salesianas.academia.entity.Alumno;
import salesianas.academia.model.AlumnoModel;

@Component("alumnoConveter")
public class AlumnoConverter {
	
	// Entity-->Model
	
	public AlumnoModel entity2model (Alumno alumno) {
		AlumnoModel alumnoModel = new AlumnoModel();
		alumnoModel.setNombre(alumno.getNombre());
		alumnoModel.setApellidos(alumno.getApellidos());
		alumnoModel.setFechaNacimiento(alumno.getFechaNacimiento());
		alumnoModel.setEmail(alumno.getEmail());
		alumnoModel.setTelefono(alumno.getTelefono());
		alumnoModel.setId(alumno.getId());
		alumnoModel.setCurso(alumno.getCurso());
		return alumnoModel;
		
	}
	
	// Model-->Entity
	
	public Alumno model2entity (AlumnoModel alumnoModel) {
		Alumno alumno = new Alumno();
		alumno.setNombre(alumno.getNombre());
		alumno.setApellidos(alumno.getApellidos());
		alumno.setFechaNacimiento(alumno.getFechaNacimiento());
		alumno.setEmail(alumno.getEmail());
		alumno.setTelefono(alumno.getTelefono());
		alumno.setId(alumno.getId());
		alumno.setCurso(alumno.getCurso());
		return alumno;
		
	}
	
	

}
