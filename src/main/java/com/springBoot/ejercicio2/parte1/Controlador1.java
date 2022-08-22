package com.springBoot.ejercicio2.parte1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/personas")
public class Controlador1 {

   @Autowired
    PersonaService personaService;

    @GetMapping
    public Persona create(@RequestHeader("nombre") String nombre, @RequestHeader("poblacion") String poblacion, @RequestHeader("edad") int edad) {
        personaService.getPersona().setNombre(nombre);
        personaService.getPersona().setPoblacion(poblacion);
        personaService.getPersona().setEdad(edad);
        return personaService.getPersona();
    }


   @PutMapping
    public Persona getPersona(){
        return personaService.getPersona();
   }


}
