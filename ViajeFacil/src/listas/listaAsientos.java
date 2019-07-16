
package listas;

import Arreglo.ArregloAsiento;
import clases.Asiento;
import interfaces.iMantenedor;
import java.util.ArrayList;
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
    public String cambiarEstado(String codigo){
        String nEstado="Disponible";
        for (int i = 0; i < tamanio(); i++) {
            if(asiento.get(i).getCod().compareTo(codigo)==0){
                if(asiento.get(i).getEstado().compareTo("Disponible")==0){
                    nEstado="Ocupado";
                }
            }
        }
        return nEstado;
    }
    public List<Asiento> dat(int cod_vuelo){
        List<Asiento> lista=new ArrayList<>();
        for (int i = 0; i < tamanio(); i++) {
            if(asiento.get(i).getCod_vuelo()==cod_vuelo){
                lista.add(asiento.get(i));
            }
        }
        return lista;
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
