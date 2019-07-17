package Arreglo;
import clases.*;
import java.util.*;

public class ArregloHotel{
    private List<Hotel> hot;
    
    public ArregloHotel(){
        hot=new ArrayList();
        hot.add(new Hotel("El Lago Estelar","4", "Tacna", 2,450,"hotel"));
        hot.add(new Hotel("QP Hotels Arequipa","5", "Arequipa", 2,650, "hotel"));
        hot.add(new Hotel("Mint Hotel","5", "Tarapoto", 2,600,"hotel" ));
        hot.add(new Hotel("Casa Andina Select","4", "Cusco", 2,400,"hotel" ));
        hot.add(new Hotel("Sonesta Hotel Arequipa","5", "Arequipa", 2,630,"hotel"));
        hot.add(new Hotel("Costa del Sol Wyndham","5", "Tacna", 2,720,"hotel"));
        hot.add(new Hotel("Casa Andina Premium","4", "Arequipa",2,520,"hotel"));
    }
    public List<Hotel> getHot() {
        return hot;
    }

    public void setHot(List<Hotel> hot) {
        this.hot = hot;
    }
    
}
