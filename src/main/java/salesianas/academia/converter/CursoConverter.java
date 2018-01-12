package salesianas.academia.converter;

import org.springframework.stereotype.Component;

import salesianas.academia.entity.Curso;
import salesianas.academia.model.CursoModel;

@Component("cursoConverter")
public class CursoConverter {
	
	// Entity-->Model
	
	public CursoModel entity2model (Curso curso) {
		CursoModel cursoModel = new CursoModel();
		cursoModel.setNombre(curso.getNombre());
		cursoModel.setId(curso.getId());
		cursoModel.setMateriasCurso(curso.getMateriasCurso());
		cursoModel.setProfesoresCurso(curso.getProfesoresCurso());
		cursoModel.setAlumnos(curso.getAlumnos());
		return cursoModel;
	}
	
	//Model-->Entity
	
	public Curso model2entity (CursoModel cursoModel) {
		Curso curso = new Curso();
		curso.setNombre(curso.getNombre());
		curso.setId(curso.getId());
		curso.setMateriasCurso(curso.getMateriasCurso());
		curso.setProfesoresCurso(curso.getProfesoresCurso());
		curso.setAlumnos(curso.getAlumnos());
		return curso;
	}

}
