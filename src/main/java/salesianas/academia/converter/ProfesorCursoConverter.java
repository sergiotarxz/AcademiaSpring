package salesianas.academia.converter;

import salesianas.academia.entity.ProfesorCurso;
import salesianas.academia.model.ProfesorCursoModel;

public class ProfesorCursoConverter {
    public ProfesorCursoModel entity2model(ProfesorCurso profesorCurso) {
        ProfesorCursoModel profesorCursoModel = new ProfesorCursoModel();
        profesorCursoModel.setId(profesorCurso.getId());
        profesorCursoModel.setCurso(profesorCurso.getCurso());
        profesorCursoModel.setProfesor(profesorCurso.getProfesor());
        return profesorCursoModel;
    }

    public ProfesorCurso model2entity(ProfesorCursoModel profesorCursoModel) {
        ProfesorCurso profesorCurso = new ProfesorCurso();
        profesorCurso.setId(profesorCursoModel.getId());
        profesorCurso.setCurso(profesorCursoModel.getCurso());
        profesorCurso.setProfesor(profesorCursoModel.getProfesor());
        return profesorCurso;
    }
}
