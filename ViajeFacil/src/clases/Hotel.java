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
public class Hotel extends Servicio{
    private String categoria;
    private int num_hab;

    public Hotel(String categoria, int num_hab, int cod_Servicio, String nombre) {
        super(cod_Servicio, nombre);
        this.categoria = categoria;
        this.num_hab = num_hab;
    }

    @Override
    public double calcularCostoServicio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNum_hab() {
        return num_hab;
    }

    public void setNum_hab(int num_hab) {
        this.num_hab = num_hab;
    }
    
    
}
