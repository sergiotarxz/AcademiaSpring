package salesianas.academia.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import salesianas.academia.entity.Profesor;
import salesianas.academia.repository.ProfesorJpaRepository;
import salesianas.academia.service.ProfesorService;

@Service("ProfesorService")
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
    public void removeProfesorById(Long id) {
        profesorJpaRepository.deleteById(id);
    }

    @Override
    public Profesor updateProfesor(Profesor profesor) {
        return profesorJpaRepository.save(profesor);
    }
}
