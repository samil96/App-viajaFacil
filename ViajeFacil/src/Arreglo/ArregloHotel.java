package Arreglo;
import clases.*;
import java.util.*;

public class ArregloHotel {
    private List<Hotel> hot;
    
    public ArregloHotel(){
        hot=new ArrayList();
        hot.add(new Hotel("4 estrellas",5 ,"El Lago Estelar"));
        hot.add(new Hotel("5 estrellas", 8, "QP Hotels Arequipa"));
        hot.add(new Hotel("5 estrellas", 14, "Mint Hotel"));
        hot.add(new Hotel("4 estrellas", 9, "Casa Andina Select"));
        hot.add(new Hotel("5 estrellas", 3, "Sonesta Hotel Arequipa"));
        hot.add(new Hotel("5 estrellas", 18, "Costa del Sol Wyndham"));
        hot.add(new Hotel("4 estrellas", 20, "Casa Andina Premium"));
    }
    public void Adiciona(Hotel h){
        hot.add(h);
    }
    public List<Hotel> data(){
        return hot;
    }
    public int tamanio(){
        return hot.size();
    }
    public void Eliminar(int pos){
        hot.remove(pos);
    }
    public Hotel Obtener(int pos){
        return hot.get(pos);
    }
}
