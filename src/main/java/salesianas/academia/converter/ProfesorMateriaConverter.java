package salesianas.academia.converter;

import salesianas.academia.entity.ProfesorMateria;
import salesianas.academia.model.ProfesorMateriaModel;

public class ProfesorMateriaConverter {
    
    public ProfesorMateriaModel entity2model(ProfesorMateria profesorMateria) {
        ProfesorMateriaModel profesorMateriaModel = new ProfesorMateriaModel();
        profesorMateriaModel.setId(profesorMateria.getId());
        profesorMateriaModel.setMateria(profesorMateria.getMateria());
        profesorMateriaModel.setProfesor(profesorMateria.getProfesor());
        return profesorMateriaModel;
    }

    public ProfesorMateria model2entity(ProfesorMateriaModel profesorMateriaModel) {
        ProfesorMateria profesorMateria = new ProfesorMateria();
        profesorMateria.setId(profesorMateriaModel.getId());
        profesorMateria.setMateria(profesorMateriaModel.getMateria());
        profesorMateria.setProfesor(profesorMateriaModel.getProfesor());
        return profesorMateria;
    }
}
