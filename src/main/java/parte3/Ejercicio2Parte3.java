package parte3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import parte2.BeanCiudad;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Ejercicio2Parte3 {

    public static void main(String[] args) {
        SpringApplication.run(Ejercicio2Parte3.class, args);
    }


    @Bean("Bean1")
    public void addPersona1(){
        Persona persona1 = new Persona();

    }

    @Bean("Bean2")
    public void addPersona2(){
        Persona persona2 = new Persona();

    }

    @Bean("Bean3")
    public void addPersona3(){
        Persona persona3 = new Persona();

    }


    }

