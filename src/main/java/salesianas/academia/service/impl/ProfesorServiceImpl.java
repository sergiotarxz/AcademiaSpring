package salesianas.academia.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import salesianas.academia.entity.Profesor;
import salesianas.academia.repository.ProfesorJpaRepository;
import salesianas.academia.service.ProfesorService;

public class ProfesorServiceImpl implements ProfesorService {

    @Autowired
    @Qualifier("ProfesorJpaRepository")
    private ProfesorJpaRepository profesorJpaRepository;

    @Override
    public Profesor addProfesor(Profesor profesor) {
        return profesorJpaRepository.save(profesor);
    }

    @Override
    public List<Profesor> listAllProfesor() {
        return profesorJpaRepository.findAll();
    }

    @Override
    public void removeProfesor(Long id) {
        profesorJpaRepository.deleteById(id);
    }

    @Override
    public Profesor updateProfesor(Profesor profesor) {
        return profesorJpaRepository.save(profesor);
    }
}
