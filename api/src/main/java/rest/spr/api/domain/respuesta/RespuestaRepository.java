package rest.spr.api.domain.respuesta;
/**CREATED BY Elmer Mamani
 * Backend Developer*/
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rest.spr.api.domain.topicos.StatusTopico;

@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta,Long> {

}
