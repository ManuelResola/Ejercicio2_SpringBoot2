package parte2;

import java.io.Serializable;

public class BeanCiudad implements Serializable {

    private String nombre;
    private int numHabitantes;

    public BeanCiudad() {

    }
    public BeanCiudad( String nombre, int numHabitantes) {
    super();
    this.nombre = nombre;
    this.numHabitantes = numHabitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumHabitantes() {
        return numHabitantes;
    }

    public void setNumHabitantes(int numHabitantes) {
        this.numHabitantes = numHabitantes;
    }
}
