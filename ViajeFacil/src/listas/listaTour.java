
package listas;

import Arreglo.ArregloTour;
import clases.Tour;
import java.util.List;
import interfaces.iMantenedor;
import java.util.ArrayList;

/**
 *
 * @author Lesly
 */
public class listaTour implements iMantenedor<Tour>{
    ArregloTour objT=new ArregloTour();
    private List<Tour> tour=objT.getTour();
     
      public List<Tour> data(){
        return tour;
    }
    
    public int obtenerPosicion(int codigo){
        int pos=-1;
        for (int i = 0; i < tamanio(); i++) {
            if(tour.get(i).getCodigo()==codigo){
                pos=i; break;
            }
        }
        return pos;
    }

    public List<Tour> datosporDestino(String destino){
        List<Tour> lista=new ArrayList<>();
        for (int i = 0; i < tamanio(); i++) {
            if(tour.get(i).getDestino().compareToIgnoreCase(destino)==0){
                lista.add(tour.get(i));
            }
        }
        return lista;
    }

    public int tamanio(){
        return tour.size();
    }
    @Override
    public void agregar(Tour t) {
        tour.add(t);
    }

    @Override
    public void actualizar(int pos, Tour t) {
        tour.set(pos, t);
    }

    @Override
    public void eliminar(int pos) {
        tour.remove(pos);
    }

    @Override
    public Tour buscar(int pos) {
        return tour.get(pos);
    }
}
