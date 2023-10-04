package rest.spr.api.domain.curso;
/**CREATED BY Elmer Mamani
 * Backend Developer*/
import jakarta.validation.constraints.NotNull;

public record DatosRegistroCurso(
        Long id,
        @NotNull
        Nombre nombre,
        @NotNull
        Categoria categoria) {
}
