package salesianas.academia.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import salesianas.academia.entity.Alumno;
import salesianas.academia.repository.AlumnoJpaRepository;
import salesianas.academia.service.AlumnoService;

@Service("AlumnoService")
public class AlumnoServiceImpl implements AlumnoService {
	
	@Autowired
	@Qualifier("AlumnoJpaRepository")
	private AlumnoJpaRepository alumnoJpaRepository;

	@Override
	public Alumno addAlumno(Alumno alumno) {
		
		return alumnoJpaRepository.save(alumno);
	}

	@Override
	public List<Alumno> listAllAlumno() {
		
		return alumnoJpaRepository.findAll();
	}

	@Override
	public void removeAlumno(Long id) {
		alumnoJpaRepository.deleteById(id);
	}

	@Override
	public Alumno updateAlumno(Alumno alumno) {
		
		return alumnoJpaRepository.save(alumno);
	}
	

}
