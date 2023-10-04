package rest.spr.api.infra.errores;
/**CREATED BY Elmer Mamani
 * Backend Developer*/
public class ValidacionIntegridad extends RuntimeException {
    public ValidacionIntegridad(String s) {
        super(s);
    }
}
