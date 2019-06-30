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
public class Actividades {
    private int codActividad;
    private int codTour;
    private int hora_inicio;
    private int hora_fin;
    private String detalle;
    static int cuenta=1001;

    public Actividades(int codTour, int hora_inicio, int hora_fin, String detalle) {
        this.codActividad = cuenta++;
        this.codTour = codTour;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.detalle = detalle;
    }

    public int getCodActividad() {
        return codActividad;
    }

    public void setCodActividad(int codActividad) {
        this.codActividad = codActividad;
    }

    public int getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(int hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public int getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(int hora_fin) {
        this.hora_fin = hora_fin;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
}
