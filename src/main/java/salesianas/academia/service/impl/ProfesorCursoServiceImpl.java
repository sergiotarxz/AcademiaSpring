package salesianas.academia.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

import salesianas.academia.service.ProfesorCursoService;
import salesianas.academia.entity.ProfesorCurso;
import salesianas.academia.repository.ProfesorCursoJpaRepository;

@Service("ProfesorCursoService")
public class ProfesorCursoServiceImpl implements ProfesorCursoService {
    
    @Autowired
    @Qualifier("ProfesorCursoJpaRepository")
    private ProfesorCursoJpaRepository profesorCursoJpaRepository;

    @Override
    public ProfesorCurso addProfesorCurso(ProfesorCurso profesorCurso) {
        return profesorCursoJpaRepository.save(profesorCurso);
    }

    @Override
    public List<ProfesorCurso> listAllProfesorCurso() {
        return profesorCursoJpaRepository.findAll();
    }

    @Override
    public void removeProfesorCursoById(Long id) {
        profesorCursoJpaRepository.deleteById(id);
    }

    @Override
    public ProfesorCurso updateProfesorCurso(ProfesorCurso profesorCurso) {
        return profesorCursoJpaRepository.save(profesorCurso);
    }
}
