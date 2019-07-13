package clases;

import java.util.List;

/**
 *
 * @author FRANK
 */
public class Hotel extends Servicio {

    private int codigo;
    private String nomHotel;
    private int categoria;
    private String lugar;
    private List habitaciones;
    static int cuenta = 1001;

    public Hotel(String nomHotel,int categoria, String lugar, List habitaciones, String nombre) {
        super(nombre);
        this.codigo = cuenta++;
        this.nomHotel = nomHotel;
        this.categoria = categoria;
        this.lugar = lugar;
        this.habitaciones = habitaciones;
    }

    @Override
    public double calcularCostoServicio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getNomHotel() {
        return nomHotel;
    }

    public void setNomHotel(String nomHotel) {
        this.nomHotel = nomHotel;
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

}
