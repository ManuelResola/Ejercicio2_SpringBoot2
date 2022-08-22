package parte2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControladorCiudad1 {
    @Autowired
    List<BeanCiudad> ciudad;

    @PostMapping("controladorCiudad/Ciudad") //POST
    public void addCiudad(){
        BeanCiudad ciudad1 = new BeanCiudad("Malaga", 571000);
        BeanCiudad ciudad2 = new BeanCiudad("Madrid", 3200000);
        BeanCiudad ciudad3 = new BeanCiudad("Alicante", 331500);

        ciudad.add(ciudad1);
        ciudad.add(ciudad2);
        ciudad.add(ciudad3);
    }

}
