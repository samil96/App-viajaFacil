
package Arreglo;

import clases.Vuelo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lesly
 */
public class ArregloVuelo {
    private List<Vuelo> vuelo;
    
    public ArregloVuelo(List<Vuelo> vuelo) {
        vuelo=new ArrayList();
        vuelo.add(new Vuelo("Latam", "Cuzco", "10/10/19", 20, 30, 1009, "viaje"));
        vuelo.add(new Vuelo("Latam", "Tacna", "10/10/19", 20, 30, 1009, "viaje"));
        vuelo.add(new Vuelo("Latam", "Tarapoto", "10/10/19", 20, 30, 1009, "viaje"));   
    }
    
    /* PARA AGRAGR UN NUEVO VUELO - vue es la variable cuando se añado se guardara ahi */
       public void Adicionar(Vuelo vue){
        vuelo.add(vue);
    }
       
    /* PARA LISTAR LOS VUELOS */
    public List<Vuelo> data(){
        return vuelo;
    }
    
    /* PARA ACTUALIZAR LOS VUELOS */
    public void Actualizar(){
        
    }
    
    /* PARA ELIMINAR LOS VUELOS SE REALIZA POR LA POSICION */
    public void Eliminar(int pos){
        vuelo.remove(pos);
    }
    public Vuelo Obtener(int pos){
        return vuelo.get(pos);
    }
    
        public int tamanio(){
        return vuelo.size();
    }
    
}
