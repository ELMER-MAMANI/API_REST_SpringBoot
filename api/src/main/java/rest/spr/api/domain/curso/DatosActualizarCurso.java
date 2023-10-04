package rest.spr.api.domain.curso;
/**CREATED BY Elmer Mamani
 * Backend Developer*/
import jakarta.validation.constraints.NotNull;

public record DatosActualizarCurso(@NotNull Long id, Nombre nombre, Categoria categoria) {
}
