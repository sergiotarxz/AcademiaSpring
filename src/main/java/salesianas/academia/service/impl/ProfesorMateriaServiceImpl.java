package salesianas.academia.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import salesianas.academia.entity.ProfesorMateria;
import salesianas.academia.repository.ProfesorMateriaJpaRepository;
import salesianas.academia.service.ProfesorMateriaService;

@Service("ProfesorMateriaService")
public class ProfesorMateriaServiceImpl implements ProfesorMateriaService {
@Autowired
@Qualifier("ProfesorMateriaJpaRepository")
private ProfesorMateriaJpaRepository profesorMateriaJpaRepository;

	@Override
	public ProfesorMateria addProfesorMateria(ProfesorMateria profesorMateria) {
		
		return profesorMateriaJpaRepository.save(profesorMateria);
	}

	@Override
	public List<ProfesorMateria> listAllProfesorMateria() {
		
		return profesorMateriaJpaRepository.findAll();
	}

	@Override
	public void RemoveProfesorMateriaById(Long id) {
		profesorMateriaJpaRepository.deleteById(id);
		
	}

	@Override
	public ProfesorMateria updateProfesorMateria(ProfesorMateria profesorMateria) {
		
		return profesorMateriaJpaRepository.save(profesorMateria);
	}

}
