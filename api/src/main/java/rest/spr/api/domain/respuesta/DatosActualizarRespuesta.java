package rest.spr.api.domain.respuesta;
/**CREATED BY Elmer Mamani
 * Backend Developer*/
import jakarta.validation.constraints.NotNull;

public record DatosActualizarRespuesta(@NotNull Long id,String mendje,Boolean solucion) {
}
