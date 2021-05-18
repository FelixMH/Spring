package com.example.bootApi.bootApi;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {
    
    @GetMapping("/")
    public String getHolaMundo ( Model model ) {
        var mensaje = "Hola Mundo con Thymeleaf...";
        
        var persona = new Persona ();
        persona.setNombre( "Félix" );
        persona.setApellido( "Martínez" );
        persona.setEmail( "felixmtzh.fm@gmail.com" );
        persona.setTelefono( "5544332211" );
        
        var persona2 = new Persona ();
        persona2.setNombre( "Karen" );
        persona2.setApellido( "Gomez" );
        persona2.setEmail( "kgomez@mail.com" );
        persona2.setTelefono( "5544332211" );
        
        var personas = Arrays.asList( persona, persona2 );
        
        model.addAttribute( "mensaje", mensaje );
        //model.addAttribute( "persona", persona );
        model.addAttribute("personas", personas);
        return "index";
    }
}
