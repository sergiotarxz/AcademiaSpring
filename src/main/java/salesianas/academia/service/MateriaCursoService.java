package salesianas.academia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import salesianas.academia.entity.MateriaCurso;

@Service("MateriaCurso")
public interface MateriaCursoService {
	public abstract MateriaCurso addMateriaCurso(MateriaCurso materiaCurso);
	public abstract List<MateriaCurso> listAllMateriaCurso();
	public abstract void removeMateriaCursoById(Long id);
	public abstract MateriaCurso updateMateriaCurso (MateriaCurso materiaCurso);
	
	

}
