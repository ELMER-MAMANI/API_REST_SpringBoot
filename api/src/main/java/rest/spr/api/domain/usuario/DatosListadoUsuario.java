package rest.spr.api.domain.usuario;
/**CREATED BY Elmer Mamani
 * Backend Developer*/
public record DatosListadoUsuario(Long id, String nombre, String email) {

    public DatosListadoUsuario(Usuario usuario){
        this(usuario.getId(),usuario.getNombre(), usuario.getEmail());
    }
}
