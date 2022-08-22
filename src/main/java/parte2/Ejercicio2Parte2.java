package parte2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Ejercicio2Parte2 {

    public static void main(String[] args) {
        SpringApplication.run(Ejercicio2Parte2.class, args);
    }

    @Bean
    public List<BeanCiudad> registrarCiudad(){
        List<BeanCiudad> ciudades = new ArrayList<BeanCiudad>();

        return ciudades;
    }



    }

