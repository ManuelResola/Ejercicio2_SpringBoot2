package parte3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanPersona {
    @Autowired
    Persona persona1;

    @GetMapping("controladorPersona/bean1")
    @Qualifier("Bean1")
    public Persona persona1(){
        persona1.setNombre("Manuel");
        persona1.setPoblacion("Jaén");
        persona1.setEdad(28);

        return persona1;
    }

    @Autowired
    Persona persona2;

    @GetMapping("controladorPersona/bean2")
    @Qualifier("Bean2")
    public Persona persona2(){
        persona2.setNombre("Maria Belen");
        persona2.setPoblacion("Málaga");
        persona2.setEdad(30);

        return persona2;
    }

    @Autowired
    Persona persona3;

    @GetMapping("controladorPersona/bean3")
    @Qualifier("Bean3")
    public Persona persona3(){
        persona3.setNombre("Marcos");
        persona3.setPoblacion("Logroño");
        persona3.setEdad(18);

        return persona3;
    }

}
