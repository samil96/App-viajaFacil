

package listas;

import Arreglo.ArregloHotel;
import clases.Hotel;
import java.util.List;
import interfaces.iMantenedor;
import java.util.ArrayList;

/**
 *
 * @author Lesly
 */
public class listaHotel implements iMantenedor<Hotel>{
    ArregloHotel objH = new ArregloHotel();
    private List<Hotel> hotel= objH.getHot();
    
    
    
    public List<Hotel> data(){
        return hotel;
    }
    public int obtenerPosicion(int codigo){
        int pos=-1;
        for (int i = 0; i < tamanio(); i++) {
            if(hotel.get(i).getCodigo()==codigo){
                pos=i; break;
            }
        }
        return pos;
    }
    public List<Hotel> datosporDestino(String destino){
        List<Hotel> lista=new ArrayList<>();
        for (int i = 0; i < tamanio(); i++) {
            if(hotel.get(i).getLugar().compareToIgnoreCase(destino)==0){
                lista.add(hotel.get(i));
            }
        }
        return lista;
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
