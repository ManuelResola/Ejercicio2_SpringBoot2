package com.springBoot.ejercicio2.parte1;

import org.springframework.stereotype.Component;

@Component
public class Persona {
    String nombre;
    String poblacion;
    int edad ;

    public Persona(String nombre, String poblacion, int edad) {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad ;
    }
}
