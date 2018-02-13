package salesianas.academia.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import salesianas.academia.entity.MateriaCurso;
import salesianas.academia.repository.MateriaCursoJpaRepository;
import salesianas.academia.service.MateriaCursoService;

@Service("MateriaCursoService")
public class MateriaCursoServiceImpl implements MateriaCursoService {

	@Autowired
	@Qualifier("MateriaCursoJpaRepository")
	private MateriaCursoJpaRepository materiaCursoJpaRepository;
	
	@Override
	public MateriaCurso addMateriaCurso(MateriaCurso materiaCurso) {
		
		return materiaCursoJpaRepository.save(materiaCurso);
	}

	@Override
	public List<MateriaCurso> listAllMateriaCurso() {
		
		return materiaCursoJpaRepository.findAll();
	}

	@Override
	public void removeMateriaCursoById(Long id) {
		
		materiaCursoJpaRepository.deleteById(id);
		
	}

	@Override
	public MateriaCurso updateMateriaCurso(MateriaCurso materiaCurso) {
		
		return materiaCursoJpaRepository.save(materiaCurso);
	}
	

	

}
