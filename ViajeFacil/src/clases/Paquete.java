
package clases;

import javax.swing.JOptionPane;
import listas.listaHotel;
import listas.listaTour;
import listas.listaVuelo;

/**
 *
 * @author FRANK Y LESLY
 */
public class Paquete{
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

    public Paquete() {
    }
    
    public double costo(String codVuelo, String codHotel, String codTour){
        listaVuelo objv=new listaVuelo();
        listaHotel objh=new listaHotel();
        listaTour objt=new listaTour();
        double precio=0;
        if (codVuelo.isEmpty() && codHotel.isEmpty() && codTour.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresar codigos de servicios");
        }else{
            if (codVuelo.isEmpty()==false) {
                int codV = Integer.parseInt(codVuelo);
                Vuelo v=objv.buscar(objv.obtenerPosicion(codV));
                precio=precio+v.calcularCostoServicio();
            }
            if (codHotel.isEmpty()==false) {
                int codH = Integer.parseInt(codHotel);
                Hotel h=objh.buscar(objv.obtenerPosicion(codH));
                precio=precio+h.calcularCostoServicio();
            }
            if (codTour.isEmpty()==false) {
                int codT = Integer.parseInt(codTour);
                Tour t=objt.buscar(objv.obtenerPosicion(codT));
                precio=precio+t.calcularCostoServicio();
            }
        }
        return precio*0.9;
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

}
