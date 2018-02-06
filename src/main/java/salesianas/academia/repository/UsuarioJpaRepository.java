package salesianas.academia.repository;

import salesianas.academia.entity.Usuario;

import java.io.Serializable;
import java.util.List;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("UsuarioJpaRepository")
public interface UsuarioJpaRepository extends JpaRepository<Usuario, Serializable> {
    public abstract Usuario findByUsername(String username);
    public abstract Usuario findById(Long id);
   
    public abstract Usuario deleteById(Long id);
}
