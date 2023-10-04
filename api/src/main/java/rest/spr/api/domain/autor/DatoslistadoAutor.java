package rest.spr.api.domain.autor;
/**CREATED BY Elmer Mamani
 * Backend Developer*/

public record DatoslistadoAutor(Long id,String nombre,String email) {

    public DatoslistadoAutor(Autor autor){
        this(autor.getId(), autor.getNombre(),autor.getEmail());
    }
}
