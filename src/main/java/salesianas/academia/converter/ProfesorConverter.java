package salesianas.academia.converter;

import org.springframework.stereotype.Component;

import salesianas.academia.entity.Profesor;
import salesianas.academia.model.ProfesorModel;

@Component("profesorConverter")
public class ProfesorConverter {
	
	// Entity-->Model
	
	public ProfesorModel entity2model (Profesor profesor) {
	
        ProfesorModel profesorModel = new ProfesorModel();
        profesorModel.setNombre(profesor.getNombre());
        profesorModel.setApellidos(profesor.getApellidos());
        profesorModel.setDni(profesor.getDni());
        profesorModel.setEmail(profesor.getEmail());
        profesorModel.setTelefono(profesor.getTelefono());
        profesorModel.setId(profesor.getId());
        profesorModel.setProfesorMaterias(profesor.getProfesorMaterias());
        return profesorModel;
	}
	
	// 	Model-->Entity
	
	public Profesor entity2model (ProfesorModel profesorModel) {
		
		Profesor profesor = new Profesor();
		
		profesor.setNombre(profesor.getNombre());
		profesor.setApellidos(profesor.getApellidos());
		profesor.setDni(profesor.getDni());
		profesor.setEmail(profesor.getEmail());
		profesor.setTelefono(profesor.getTelefono());
		profesor.setId(profesor.getId());
		profesor.setProfesorMaterias(profesor.getProfesorMaterias());
        return profesor;
    }

}
