package parte2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ControladorCiudad2 {
    @Autowired
    List<BeanCiudad> ciudad;

    @GetMapping("controladorCiudad/Ciudad") //GET
    public List<BeanCiudad> getCiudades(){
        return ciudad;
    }

}
