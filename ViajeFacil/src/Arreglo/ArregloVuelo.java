package Arreglo;

import clases.Vuelo;
import interfaces.iMantenedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lesly
 */
public class ArregloVuelo {

    private List<Vuelo> vuelo;

    public ArregloVuelo() {
        vuelo = new ArrayList();
        vuelo.add(new Vuelo("Latam", "Lima", "Tacna", "10/10/19", 20, 30, "viaje"));
        vuelo.add(new Vuelo("Latam", "Lima", "Cuzco", "10/10/19", 20, 30, "viaje"));
        vuelo.add(new Vuelo("Latam", "Lima", "Tarapoto", "10/10/19", 20, 30, "viaje"));
        vuelo.add(new Vuelo("Latam", "Lima", "Tacna", "10/10/19", 20, 30, "viaje"));
    }

    public List<Vuelo> getVuelo() {
        return vuelo;
    }

    public void setVuelo(List<Vuelo> vuelo) {
        this.vuelo = vuelo;
    }

}
