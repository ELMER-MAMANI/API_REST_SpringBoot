package rest.spr.api.domain.usuario;
/**CREATED BY Elmer Mamani
 * Backend Developer*/
import jakarta.validation.constraints.NotNull;

public record DatosActualizarUsuario(@NotNull Long id, String nombre,String email,String contrasena) {
}
