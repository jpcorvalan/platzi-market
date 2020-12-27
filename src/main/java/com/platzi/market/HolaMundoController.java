package com.platzi.market;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")     // Esta clase responderá en el navegador bajo este "path"
                                // es decir, se ejecutará cuando escribamos el nombre de la página
                                // seguido de /saludar. Por ejemplo:
                                // mipagina.com/saludar


public class HolaMundoController {

    @GetMapping("/test")        // Este método se ejecutará bajo una petición get, y en el navegador funcionará
                                // de la misma manera que RequestMapping. Ej: mipag.com/saludar/test
    public String saludar(){
        return "Class and method for testing - Nunca pares de aprender";
    }

}
