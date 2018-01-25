package salesianas.academia.service;

import java.util.List;

import salesianas.academia.entity.Curso;

public interface CursoService {
    public abstract Curso addCurso(Curso curso) ;
    public abstract List<Curso> listAllCurso();
    public abstract void removeCurso(Long id);
    public abstract Curso updateCurso(Curso curso);
}
