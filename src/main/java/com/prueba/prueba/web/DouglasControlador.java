package com.prueba.prueba.web;

import com.prueba.prueba.servicio.DouglasService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/douglas")
public class DouglasControlador {


    private DouglasService douglasService = new DouglasService();

    /**
     * RETORNA NOMBRE
     * @param nombre
     * @return
     */
    @GetMapping("/{nombre}")
    public String obtenerPorId(@PathVariable String nombre){
        return douglasService.servicioDouglas(nombre);
    }
}
