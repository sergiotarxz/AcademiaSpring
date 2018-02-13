package salesianas.academia.service;



import org.springframework.stereotype.Service;

import java.util.List;

import salesianas.academia.entity.ProfesorMateria;

@Service("ProfesorMateriaService")
public interface ProfesorMateriaService {
    public abstract ProfesorMateria addProfesorMateria(ProfesorMateria profesorMateria);
    public abstract List<ProfesorMateria> listAllProfesorMateria();
    public abstract void RemoveProfesorMateriaById(Long id);
    public abstract ProfesorMateria updateProfesorMateria(ProfesorMateria profesorMateria);
}
