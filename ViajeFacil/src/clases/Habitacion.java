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
public class Habitacion {
        private int cod_habi;
    private int cod_hotel;
    private String estado;
    static int cuenta=1001;

    public Habitacion(int cod_hotel,String estado) {
        this.cod_habi = cuenta++;
        this.cod_hotel = cod_hotel;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCod_habi() {
        return cod_habi;
    }

    public void setCod_habi(int cod_habi) {
        this.cod_habi = cod_habi;
    }

   

    public int getCod_hotel() {
        return cod_hotel;
    }

    public void setCod_hotel(int cod_hotel) {
        this.cod_hotel = cod_hotel;
    }

}
