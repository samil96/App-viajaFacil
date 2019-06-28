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
    private List lista;

    public Paquete(int cod_Paquete, double precio, String detalle) {
        this.cod_Paquete = cod_Paquete;
        this.precio = precio;
        this.detalle = detalle;
    }
    public double costoH(){
        return 0;
    }
    public double CostoT(){
        return 0;
    }
    public void AgregarServicio(){
        
    }
    public List<Servicio> ListarServicio(){
        return null;
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
    
}
