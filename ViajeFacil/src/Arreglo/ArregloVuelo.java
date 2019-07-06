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
        vuelo.add(new Vuelo(2001, "Latam", "Lima", "Tacna", "10/10/19", 20, 30, "viaje"));
        vuelo.add(new Vuelo(2001, "Latam", "Lima", "Cuzco", "10/10/19", 20, 30, "viaje"));
        vuelo.add(new Vuelo(2001, "Latam", "Lima", "Tarapoto", "10/10/19", 20, 30, "viaje"));
        vuelo.add(new Vuelo(2001, "Latam", "Lima", "Tacna", "10/10/19", 20, 30, "viaje"));
    }
    
}
