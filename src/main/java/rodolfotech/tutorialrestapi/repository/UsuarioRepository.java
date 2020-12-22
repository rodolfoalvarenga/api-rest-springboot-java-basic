package rodolfotech.tutorialrestapi.repository;

import org.springframework.data.repository.CrudRepository;
import rodolfotech.tutorialrestapi.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}
