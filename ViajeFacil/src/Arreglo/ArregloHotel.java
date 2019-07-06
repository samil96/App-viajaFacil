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
    
}
