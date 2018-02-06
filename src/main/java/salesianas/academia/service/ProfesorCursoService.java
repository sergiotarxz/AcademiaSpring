package salesianas.academia.service; 

import org.springframework.stereotype.Service;

import java.util.List;

import salesianas.academia.entity.ProfesorCurso;

@Service("ProfesorCursoService")
public interface ProfesorCursoService {
    public abstract ProfesorCurso addProfesorCurso(ProfesorCurso profesorCurso);
    public abstract List<ProfesorCurso> listAllProfesorCurso();
    public abstract void removeProfesorCursoById(Long id);
    public abstract ProfesorCurso updateProfesorCurso(ProfesorCurso profesorCurso);
}
