package clases;

import java.util.List;

/**
 *
 * @author FRANK
 */
public class Hotel extends Servicio {

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

}
