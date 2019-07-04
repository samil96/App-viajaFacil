/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.List;

/**
 *
 * @author FRANK
 */
public class Paquete {
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

    
}
