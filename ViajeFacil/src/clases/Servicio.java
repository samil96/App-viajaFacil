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
public abstract class Servicio {
    private int cod_Servicio;
    private String nombre;

    public Servicio(int cod_Servicio, String nombre) {
        this.cod_Servicio = cod_Servicio;
        this.nombre = nombre;
    }
    public abstract double calcularCostoServicio();

    public int getCod_Servicio() {
        return cod_Servicio;
    }

    public void setCod_Servicio(int cod_Servicio) {
        this.cod_Servicio = cod_Servicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
