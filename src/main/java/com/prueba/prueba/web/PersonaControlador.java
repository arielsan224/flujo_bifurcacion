package com.prueba.prueba.web;

import com.prueba.prueba.servicio.PersonaServicio;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
public class PersonaControlador {

    private PersonaServicio personaServicio;

}
