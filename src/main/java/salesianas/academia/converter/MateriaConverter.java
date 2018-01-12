package salesianas.academia.converter;

import salesianas.academia.entity.Materia;
import salesianas.academia.model.MateriaModel;

import org.springframework.stereotype.Component;

@Component("materiaConverter")
public class MateriaConverter {
	
	// Entity-->Model
	
	public MateriaModel entity2model (Materia materia) {
        MateriaModel materiaModel = new MateriaModel(); 
        materiaModel.setId(materia.getId());
        materiaModel.setNombre(materia.getNombre());
        materiaModel.setProfesoresMateria(materia.getProfesoresMateria());
        materiaModel.setMateriaCursos(materia.getMateriaCursos());
        return materiaModel;
	}

    public Materia model2entity (MateriaModel materiaModel) {
        Materia materia = new Materia();
        materia.setId(materiaModel.getId());
        materia.setNombre(materiaModel.getNombre());
        materia.setProfesoresMateria(materiaModel.getProfesoresMateria());
        materia.setMateriaCursos(materiaModel.getMateriaCursos());
        return materia;
    }

}
