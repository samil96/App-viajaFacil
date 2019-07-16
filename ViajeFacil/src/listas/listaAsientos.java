
package listas;

import Arreglo.ArregloAsiento;
import clases.Asiento;
import interfaces.iMantenedor;
import java.util.List;

/**
 *
 * @author Lesly
 */
public class listaAsientos implements iMantenedor<Asiento>{
    ArregloAsiento objA = new ArregloAsiento();
    private List<Asiento> asiento= objA.getAsiento();
    
    public List<Asiento> data(){
        return asiento;
    }
    
    public int obtenerPosicion(String codigo){
        int pos=-1;
        for (int i = 0; i < tamanio(); i++) {
            if(asiento.get(i).getCod().compareTo(codigo)==0){
                pos=i; break;
            }
        }
        return pos;
    }
    
    public int tamanio(){
        return asiento.size();
    }
    @Override
    public void agregar(Asiento t) {
        asiento.add(t);
    }

    @Override
    public void actualizar(int pos, Asiento t) {
        asiento.set(pos, t);
    }

    @Override
    public void eliminar(int pos) {
         asiento.remove(pos);
    }

    @Override
    public Asiento buscar(int pos) {
        return asiento.get(pos);
    }

    public void setAsiento(List<Asiento> asiento) {
        this.asiento = asiento;
    }
}
