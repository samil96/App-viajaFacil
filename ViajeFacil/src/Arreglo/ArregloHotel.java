package Arreglo;
import clases.*;
import interfaces.iMantenedor;
import java.util.*;

public class ArregloHotel implements iMantenedor<Hotel>{
    private List<Hotel> hot;
    
    public ArregloHotel(){
        hot=new ArrayList();
        List a = new ArrayList();
        a.add(new Habitacion(701, "Libre"));
        a.add(new Habitacion(605, "Libre"));
        hot.add(new Hotel(4, "Tacna", a,"El Lago Estelar"));
        List b = new ArrayList();
        b.add(new Habitacion(707, "Libre"));
        b.add(new Habitacion(607, "Libre"));
        hot.add(new Hotel(5, "Arequipa", b, "QP Hotels Arequipa"));
        List c = new ArrayList();
        c.add(new Habitacion(706, "Libre"));
        c.add(new Habitacion(601, "Libre"));
        hot.add(new Hotel(5, "Tarapoto", c, "Mint Hotel"));
        List d = new ArrayList();
        d.add(new Habitacion(705, "Libre"));
        d.add(new Habitacion(602, "Libre"));
        hot.add(new Hotel(4, "Cusco", d, "Casa Andina Select"));
        List f = new ArrayList();
        f.add(new Habitacion(704, "Libre"));
        f.add(new Habitacion(603, "Libre"));
        hot.add(new Hotel(5, "Arequipa", f, "Sonesta Hotel Arequipa"));
        List g = new ArrayList();
        g.add(new Habitacion(703, "Libre"));
        g.add(new Habitacion(604, "Libre"));
        hot.add(new Hotel(5, "Tacna", g, "Costa del Sol Wyndham"));
        List h = new ArrayList();
        h.add(new Habitacion(702, "Libre"));
        h.add(new Habitacion(606, "Libre"));
        hot.add(new Hotel(4, "Arequipa", h, "Casa Andina Premium"));
    }
    
    public int obtenerPosicion(int codigo){
        int pos=-1;
        for (int i = 0; i < tamanio(); i++) {
            if(hot.get(i).getCodigo()==codigo){
                pos=i; break;
            }
        }
        return pos;
    }
    public List<Hotel> data(){
        return hot;
    }
    public int tamanio(){
        return hot.size();
    }

    @Override
    public void agregar(Hotel t) {
        hot.add(t);
    }

    @Override
    public void actualizar(int pos, Hotel t) {
        hot.set(pos, t);
    }

    @Override
    public void eliminar(int pos) {
        hot.remove(pos);
    }

    @Override
    public Hotel buscar(int pos) {
        return hot.get(pos);
    }
    
}
