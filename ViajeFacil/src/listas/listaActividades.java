
package listas;

import Arreglo.ArregloActividades;
import clases.Actividades;
import java.util.List;
import interfaces.iMantenedor;
import java.util.ArrayList;

/**
 *
 * @author Lesly
 */
public class listaActividades implements iMantenedor<Actividades>{
    ArregloActividades obja = new ArregloActividades();
    private List<Actividades> activ = obja.getActi();
    
    public List<Actividades> data(){
        return activ;
    }

    public int obtenerPosicion(int codigo){
        int pos=-1;
        for (int i = 0; i < tamanio(); i++) {
            if(activ.get(i).getCodActividad()==codigo){
                pos=i; break;
            }
        }
        return pos;
    }
    public List<Actividades> datosporTour(int cod_tour){
        List<Actividades> lista=new ArrayList<>();
        for (int i = 0; i < tamanio(); i++) {
            if(activ.get(i).getCod_tour()==cod_tour){
                Actividades x=activ.get(i);
                lista.add(x);
            }
        }
        return lista;
    }
 
    public int tamanio(){
        return activ.size();
    }
    @Override
    public void agregar(Actividades t) {
        activ.add(t);
    }

    @Override
    public void actualizar(int pos, Actividades t) {
        activ.set(pos, t);
    }

    @Override
    public void eliminar(int pos) {
        activ.remove(pos);
    }

    @Override
    public Actividades buscar(int pos) {
        return activ.get(pos);
    }
}
