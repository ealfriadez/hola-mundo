package pe.edu.unfv.holamundo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HolaController {

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping("/hola-mundo/{numero}")
    String saludar(@RequestParam(required = false, defaultValue = "mundo") String nombre,
                   @RequestBody Persona persona,
                   @PathVariable Integer numero){
        return "Hola " + nombre + " desde todo-tic";
    }
}
