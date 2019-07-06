
package listas;
import clases.Paquete;
import interfaces.iMantenedor;
import java.util.List;
/**
 *
 * @author Lesly
 */
public class listaPaquete implements iMantenedor<Paquete> {
    private List<Paquete> paq;
    
    public List<Paquete> data(){
        return paq;
    }
    
    public int obtenerPosicion(int codigo){
        int pos=-1;
        for (int i = 0; i < tamanio(); i++) {
            if(paq.get(i).getCod_Paquete()==codigo){
                pos=i; break;
            }
        }
        return pos;
    }

    public int tamanio(){
        return paq.size();
    }

    @Override
    public void agregar(Paquete t) {
        paq.add(t);
    }

    @Override
    public void actualizar(int pos, Paquete t) {
        paq.set(pos, t);
    }

    @Override
    public void eliminar(int pos) {
        paq.remove(pos);
    }

    @Override
    public Paquete buscar(int pos) {
        return paq.get(pos);
    }
}
