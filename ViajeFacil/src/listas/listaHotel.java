

package listas;

import Arreglo.ArregloHotel;
import clases.Hotel;
import java.util.List;
import interfaces.iMantenedor;

/**
 *
 * @author Lesly
 */
public class listaHotel implements iMantenedor<Hotel>{
    ArregloHotel objv = new ArregloHotel();
    private List<Hotel> hotel= objv.getHot();
    
    public int obtenerPosicion(int codigo){
        int pos=-1;
        for (int i = 0; i < tamanio(); i++) {
            if(hotel.get(i).getCodigo()==codigo){
                pos=i; break;
            }
        }
        return pos;
    }
    
    public List<Hotel> data(){
        return hotel;
    }
    public int tamanio(){
        return hotel.size();
    }

    @Override
    public void agregar(Hotel t) {
        hotel.add(t);
    }

    @Override
    public void actualizar(int pos, Hotel t) {
        hotel.set(pos, t);
    }

    @Override
    public void eliminar(int pos) {
        hotel.remove(pos);
    }

    @Override
    public Hotel buscar(int pos) {
        return hotel.get(pos);
    }
}
