package salesianas.academia.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import salesianas.academia.entity.Materia;
import salesianas.academia.repository.MateriaJpaRepository;
import salesianas.academia.service.MateriaService;

@Service("MateriaService")
public class MateriaServiceImpl implements MateriaService {

    @Autowired
    @Qualifier("MateriaJpaRepository")
    private MateriaJpaRepository materiaJpaRepository;

    @Override
    public Materia addMateria(Materia materia) {
        return materiaJpaRepository.save(materia);
    }

    @Override
    public List<Materia> listAllMateria() {
        return materiaJpaRepository.findAll();
    }

    @Override
    public void removeMateria(Long id) {
        materiaJpaRepository.deleteById(id);
    }

    @Override
    public Materia updateMateria(Materia materia) {
        return materiaJpaRepository.save(materia);
    } 
}
