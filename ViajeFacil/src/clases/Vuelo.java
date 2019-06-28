/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


/**
 *
 * @author FRANK
 */
public class Vuelo extends Servicio{
    private String aerolinea;
    private String destino;
    private String fecha;
    private int hora;
    private int cant_asientos;

    public Vuelo(String aerolinea, String destino, String fecha, int hora, int cant_asientos, int cod_Servicio, String nombre) {
        super(cod_Servicio, nombre);
        this.aerolinea = aerolinea;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.cant_asientos = cant_asientos;
    }

    @Override
    public double calcularCostoServicio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getCant_asientos() {
        return cant_asientos;
    }

    public void setCant_asientos(int cant_asientos) {
        this.cant_asientos = cant_asientos;
    }
    
}
