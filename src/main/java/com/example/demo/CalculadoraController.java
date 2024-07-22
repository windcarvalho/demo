package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @GetMapping("/operation/soma/{param1}/{param2}")
    public CalculadoraResponse soma(@PathVariable double param1, @PathVariable double param2) {
        double result = param1 + param2;
        return new CalculadoraResponse(result);
    }

}
