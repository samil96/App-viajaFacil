package listas;

import Arreglo.ArregloViajero;
import clases.Viajero;
import interfaces.iMantenedor;
import java.util.List;

public class listaViajeros implements iMantenedor<Viajero>{
    ArregloViajero objV=new ArregloViajero();
    private List<Viajero> viajero=objV.getViajero();
    
    public List<Viajero> data(){
        return viajero;
    }
    
    public int obtenerPosicion(int dni){
        int pos=-1;
        for (int i = 0; i < tamanio(); i++) {
            if(viajero.get(i).getDni()==dni || viajero.get(i).getCodigo()==dni){
                pos=i; break;
            }
        }
        return pos;
    }

    public int tamanio(){
        return viajero.size();
    }

    @Override
    public void agregar(Viajero t) {
        viajero.add(t);
    }

    @Override
    public void actualizar(int pos, Viajero t) {
        viajero.set(pos, t);
    }

    @Override
    public void eliminar(int pos) {
        viajero.remove(pos);
    }

    @Override
    public Viajero buscar(int pos) {
        return viajero.get(pos);
    }
}
