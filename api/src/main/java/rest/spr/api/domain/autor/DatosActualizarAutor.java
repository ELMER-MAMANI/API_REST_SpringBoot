package rest.spr.api.domain.autor;
/**CREATED BY Elmer Mamani
 * Backend Developer*/
import jakarta.validation.constraints.NotNull;

public record DatosActualizarAutor(@NotNull Long id, String nombre, String email, String contrasena) {

}
