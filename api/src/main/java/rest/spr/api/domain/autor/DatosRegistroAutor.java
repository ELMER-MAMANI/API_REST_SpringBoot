package rest.spr.api.domain.autor;
/**CREATED BY Elmer Mamani
 * Backend Developer*/
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroAutor(
               Long id,
               @NotNull
               String nombre,
               @NotNull
               @Email
               String email,
               @NotNull
               String contrasena) {
}
