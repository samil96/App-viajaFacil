
package clases;

import java.util.List;
import Arreglo.ArregloPaquetes;
import interfaces.iMantenedor;
/**
 *
 * @author FRANK Y LESLY
 */
public class Paquete implements iMantenedor<Paquete>{
    private int cod_Paquete;
    private double precio;
    private String detalle;
    private int cod_vuelo;
    private int cod_hotel;
    private int cod_tour;
    static int cuenta=1001;

    public Paquete(double precio, int cod_vuelo, int cod_hotel, int cod_tour, String detalle) {
        this.cod_Paquete = cuenta++;
        this.precio = precio;
        this.cod_vuelo = cod_vuelo;
        this.cod_hotel = cod_hotel;
        this.cod_tour = cod_tour;
        this.detalle = detalle;
    }

    
    public double costoH(){
        return 0;
    }
    public double CostoT(){
        return 0;
    }

    public int getCod_Paquete() {
        return cod_Paquete;
    }

    public void setCod_Paquete(int cod_Paquete) {
        this.cod_Paquete = cod_Paquete;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCod_vuelo() {
        return cod_vuelo;
    }

    public void setCod_vuelo(int cod_vuelo) {
        this.cod_vuelo = cod_vuelo;
    }

    public int getCod_hotel() {
        return cod_hotel;
    }

    public void setCod_hotel(int cod_hotel) {
        this.cod_hotel = cod_hotel;
    }

    public int getCod_tour() {
        return cod_tour;
    }

    public void setCod_tour(int cod_tour) {
        this.cod_tour = cod_tour;
    }

    /* METODOS PARA LISTAR */
    /* objPack es el objeto que se crea */
    ArregloPaquetes objPack = new ArregloPaquetes();
    List<Paquete> pack = objPack.data();

    /* PARA LISTAR LOS VUELOS */
    public List<Paquete> data() {
        return pack;
    }
    /*metodo obtener la posicion por medio del codigo d evuelo*/
    public int obtenerPosicion(int codigo) {
        int pos = -1;
        for (int i = 0; i < tamanio(); i++) {
            if (pack.get(i).getCod_Paquete() == codigo) {
                pos = i;
                break;
            }
        }
        return pos;
    }
    /* obtener el tamaño de la lista*/
    public int tamanio() {
        return pack.size();
    }
    
    /*METODOS DEL CRUD*/
    /*AGREGAR UN PAQUETE AL ARREGLO*/
    @Override
    public void agregar(Paquete t) {
        objPack.agregar(t);
    }
    
    /*ACTULIZAR EL ARREGLO*/
    @Override
    public void actualizar(int pos, Paquete t) {
        objPack.actualizar(pos, t);
    }
    
    /*ELIMINAR UN PAQUETE DEL ARREGLO*/
    @Override
    public void eliminar(int pos) {
        objPack.eliminar(pos);
    }
    
    /*BUSCAR UN PAQUETE DEL ARREGLO*/
    @Override
    public Paquete buscar(int pos) {
        return objPack.buscar(pos);
    }
    
    
}
