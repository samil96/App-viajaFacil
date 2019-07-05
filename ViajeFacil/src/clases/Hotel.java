package clases;

import java.util.List;
import Arreglo.ArregloHotel;
import interfaces.iMantenedor;

/**
 *
 * @author FRANK
 */
public class Hotel extends Servicio implements iMantenedor<Hotel> {

    private int codigo;
    private int categoria;
    private String lugar;
    private List habitaciones;
    static int cuenta = 1001;

    public Hotel(int categoria, String lugar, List habitaciones, String nombre) {
        super(nombre);
        this.codigo = cuenta++;
        this.categoria = categoria;
        this.lugar = lugar;
        this.habitaciones = habitaciones;
    }

    @Override
    public double calcularCostoServicio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List habitaciones) {
        this.habitaciones = habitaciones;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /* metodos */
    /* objHotel es el objeto Hotel para crear el objeto*/
    ArregloHotel objHotel = new ArregloHotel();
    List<Hotel> hotel = objHotel.data();
    
    /* primero se debe obtener la posicion en el cual se encuentra el codigo del Hotel*/
    public int obtenerPosicion(int codigo) {
        int pos = -1;
        for (int i = 0; i < tamanio(); i++) {
            if (hotel.get(i).getCodigo() == codigo) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public List<Hotel> data() {
        return hotel;
    }
    
    /* obtener el tamaño de la lista del arreglo Hotel*/
    public int tamanio() {
        return hotel.size();
    }

    /* METODOS DEL CRUD */
    /*AGREGAR UN HOTEL AL ARREGLO*/
    @Override
    public void agregar(Hotel t) {
        objHotel.agregar(t);
    }
    
    /*ACTUALIZAR EL ARREGLO DEL HOTEL*/
    @Override
    public void actualizar(int pos, Hotel t) {
        objHotel.actualizar(pos, t);
    }

    /*ELIMINAR UN HOTEL DEL ARREGLO*/
    @Override
    public void eliminar(int pos) {
        objHotel.eliminar(pos);
    }
    
    /*BUSCAR UN HOTEL*/
    @Override
    public Hotel buscar(int pos) {
        return objHotel.buscar(pos);
    }

}
