package com.springBoot.ejercicio2.parte1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador2 {
    @Autowired
    PersonaService personaService;

    @GetMapping
    public Persona ponEdad(@RequestHeader String nombre, @RequestParam String poblacion, @RequestParam int edad) {
        personaService.getPersona().setNombre(nombre);
        personaService.getPersona().setPoblacion(poblacion);
        personaService.getPersona().setEdad(edad*2);

        Persona persona = new Persona(nombre, poblacion, edad);
        return personaService.getPersona();
    }




   /* int getControlador2() {
        personaService.setEdad(personaService.getEdad() * 2);
        return personaService.getEdad();
    }*/


}
