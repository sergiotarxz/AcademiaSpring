package salesianas.academia.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import salesianas.academia.entity.Curso;
import salesianas.academia.repository.CursoJpaRepository;
import salesianas.academia.service.CursoService;

@Service("CursoService")
public class CursoServiceImpl implements CursoService {

	@Autowired
	@Qualifier("CursoJpaRepository")
	private CursoJpaRepository cursoJpaRepository;

	@Override
	public Curso addCurso(Curso curso) {
		return cursoJpaRepository.save(curso);
	}

	@Override
	public List<Curso> listAllCurso() {
		return cursoJpaRepository.findAll();
	}

	@Override
	public void removeCurso(Long id) {
		cursoJpaRepository.deleteById(id);
	}

	@Override
	public Curso updateCurso(Curso curso) {
		return cursoJpaRepository.save(curso);
	}

}
