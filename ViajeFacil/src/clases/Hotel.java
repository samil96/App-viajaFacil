package clases;

import java.util.List;

/**
 *
 * @author FRANK
 */
public class Hotel extends Servicio {

    private int codigo;
    private String nomHotel;
    private String categoria;
    private String lugar;
    private int habitaciones;
    private int costohotel;
    static int cuenta = 1001;

    public Hotel(String nomHotel,String categoria, String lugar, int habitaciones,int costohotel, String nombre) {
        super(nombre);
        this.codigo = cuenta++;
        this.nomHotel = nomHotel;
        this.categoria = categoria;
        this.lugar = lugar;
        this.habitaciones = habitaciones;
        this.costohotel = costohotel;
    }

    @Override
    public double calcularCostoServicio() {
        double costo=0;
        if (categoria=="1") costo=80;
        if (categoria=="2") costo=90;
        if (categoria=="3") costo=100;
        if (categoria=="4") costo=150;
        if (categoria=="5") costo=180;
        return costo;
    
    }
    public String getNomHotel() {
        return nomHotel;
    }

    public void setNomHotel(String nomHotel) {
        this.nomHotel = nomHotel;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
   

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getCostohotel() {
        return costohotel;
    }

    public void setCostohotel(int costohotel) {
        this.costohotel = costohotel;
    }
    

}
