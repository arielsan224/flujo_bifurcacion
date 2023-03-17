package com.prueba.prueba.web;


import com.prueba.prueba.servicio.RobertoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roberto")
public class RobertoControlador {
    private RobertoService robertoService = new RobertoService();
    @GetMapping("/{nombre}")
    public String obtenerPorId(@PathVariable String nombre){
        return robertoService.servicioRoberto(nombre);
    }
}
