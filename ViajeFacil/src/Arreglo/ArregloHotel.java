package Arreglo;
import clases.*;
import java.util.*;

public class ArregloHotel{
    private List<Hotel> hot;
    
    public ArregloHotel(){
        hot=new ArrayList();
        List a = new ArrayList();
        a.add(new Habitacion(701, "Libre"));
        a.add(new Habitacion(605, "Libre"));
        hot.add(new Hotel("El Lago Estelar",4, "Tacna", a,"hotel"));
        List b = new ArrayList();
        b.add(new Habitacion(707, "Libre"));
        b.add(new Habitacion(607, "Libre"));
        hot.add(new Hotel("QP Hotels Arequipa",5, "Arequipa", b, "hotel"));
        List c = new ArrayList();
        c.add(new Habitacion(706, "Libre"));
        c.add(new Habitacion(601, "Libre"));
        hot.add(new Hotel("Mint Hotel",5, "Tarapoto", c,"hotel" ));
        List d = new ArrayList();
        d.add(new Habitacion(705, "Libre"));
        d.add(new Habitacion(602, "Libre"));
        hot.add(new Hotel("Casa Andina Select",4, "Cusco", d,"hotel" ));
        List f = new ArrayList();
        f.add(new Habitacion(704, "Libre"));
        f.add(new Habitacion(603, "Libre"));
        hot.add(new Hotel("Sonesta Hotel Arequipa",5, "Arequipa", f,"hotel"));
        List g = new ArrayList();
        g.add(new Habitacion(703, "Libre"));
        g.add(new Habitacion(604, "Libre"));
        hot.add(new Hotel("Costa del Sol Wyndham",5, "Tacna", g,"hotel"));
        List h = new ArrayList();
        h.add(new Habitacion(702, "Libre"));
        h.add(new Habitacion(606, "Libre"));
        hot.add(new Hotel("Casa Andina Premium",4, "Arequipa", h,"hotel"));
    }
    public List<Hotel> getHot() {
        return hot;
    }

    public void setHot(List<Hotel> hot) {
        this.hot = hot;
    }
    
}
