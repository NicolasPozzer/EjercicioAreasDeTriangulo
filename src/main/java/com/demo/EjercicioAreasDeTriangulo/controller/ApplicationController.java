package com.demo.EjercicioAreasDeTriangulo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @GetMapping("/calcular")
    public String CalcularAreaDeTriangulo(@RequestParam double base,
                                          @RequestParam double altura){

        //Variables locales
        double calcular_triangulo;
        calcular_triangulo = 0.0;

        calcular_triangulo = (base * altura) / 2;

        return "El resultado del area del triangulo es: " + calcular_triangulo;
    }

}
