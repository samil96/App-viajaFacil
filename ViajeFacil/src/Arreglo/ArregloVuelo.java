
package Arreglo;

import clases.Vuelo;
import interfaces.iMantenedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lesly
 */
public class ArregloVuelo implements iMantenedor<Vuelo>{
    private List<Vuelo> vuelo;
    
    public ArregloVuelo() {
        vuelo=new ArrayList();
        vuelo.add(new Vuelo("Latam", "Cuzco", "10/10/19", 20, 30, "viaje"));
        vuelo.add(new Vuelo("Latam", "Tacna", "10/10/19", 20, 30, "viaje"));
        vuelo.add(new Vuelo("Latam", "Tarapoto", "10/10/19", 20, 30, "viaje"));   
    }
    
    /* PARA LISTAR LOS VUELOS */
    public List<Vuelo> data(){
        return vuelo;
    }

    public int obtenerPosicion(int codigo){
        int pos=-1;
        for (int i = 0; i < tamanio(); i++) {
            if(vuelo.get(i).getCodigo()==codigo){
                pos=i; break;
            }
        }
        return pos;
    }

    public int tamanio(){
        return vuelo.size();
    }

    /* PARA AGRAGR UN NUEVO VUELO - vue es la variable cuando se añado se guardara ahi */
    @Override
    public void agregar(Vuelo t) {
        vuelo.add(t);
    }

    /* PARA ACTUALIZAR LOS VUELOS */
    @Override
    public void actualizar(int pos, Vuelo t) {
        vuelo.set(pos, t);
    }

    @Override
    public void eliminar(int pos) {
        vuelo.remove(pos);
    }

    @Override
    public Vuelo buscar(int pos) {
        return vuelo.get(pos);
    }
    
}
