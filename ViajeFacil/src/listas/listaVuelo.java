
package listas;

import clases.Vuelo;
import java.util.ArrayList;
import java.util.List;
import interfaces.iMantenedor;

/**
 *
 * @author Lesly
 */
public class listaVuelo  implements iMantenedor<Vuelo>{
    private List<Vuelo> vuelo;
    
    public listaVuelo(){
        vuelo = new ArrayList();    
    }
    
    /* PARA LISTAR LOS VUELOS */
    public List<Vuelo> data() {
        return vuelo;
    }

    public int obtenerPosicion(int codigo) {
        int pos = -1;
        for (int i = 0; i < tamanio(); i++) {
            if (vuelo.get(i).getCodigo() == codigo) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public int tamanio() {
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
