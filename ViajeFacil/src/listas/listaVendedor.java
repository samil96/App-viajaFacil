package listas;

import Arreglo.ArregloVendedor;
import clases.Vendedor;
import interfaces.iMantenedor;
import java.util.List;

/**
 *
 * @author FRANK
 */
public class listaVendedor implements iMantenedor<Vendedor>{
    ArregloVendedor obj=new ArregloVendedor();
    private List<Vendedor> vende=obj.data();
    
    public List<Vendedor> data(){
        return vende;
    }
    
    public int obtenerPosicion(int codigo){
        int pos=-1;
        for (int i = 0; i < tamanio(); i++) {
            if(vende.get(i).getCodigo()==codigo){
                pos=i; break;
            }
        }
        return pos;
    }

    public int tamanio(){
        return vende.size();
    }
    
    @Override
    public void agregar(Vendedor t) {
        vende.add(t);
    }

    @Override
    public void actualizar(int pos, Vendedor t) {
        vende.set(pos, t);
    }

    @Override
    public void eliminar(int pos) {
        vende.remove(pos);
    }

    @Override
    public Vendedor buscar(int pos) {
        return vende.get(pos);
    }
}
