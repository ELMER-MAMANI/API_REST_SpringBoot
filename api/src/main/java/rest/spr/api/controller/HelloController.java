package rest.spr.api.controller;
/**CREATED BY Elmer Mamani
 * Backend Developer*/
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ELMER-MAMANI")
public class HelloController {

    @GetMapping
    public String helloWorld(){
        return "¡hola, Elmer Mamani!";
    }
}
