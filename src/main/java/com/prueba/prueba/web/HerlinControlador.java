package com.prueba.prueba.web;

import com.prueba.prueba.servicio.HerlinService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/herlin")
public class HerlinControlador {
    private HerlinService herlinService = new HerlinService();
    @GetMapping("/{nombre}")
    public String obtenerPorId(@PathVariable String nombre){
        return herlinService.servicioHerlin(nombre);
    }
}
