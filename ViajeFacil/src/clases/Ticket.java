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
public class Ticket {
    private int cod_Ticket;
    private int cod_cliente;
    private int cod_Paquete;
    private String destino;
    private String fecha;
    private int hora;
    private double precio;

    public Ticket(int cod_Ticket, int cod_cliente, int cod_Paquete, String destino, String fecha, int hora, double precio) {
        this.cod_Ticket = cod_Ticket;
        this.cod_cliente = cod_cliente;
        this.cod_Paquete = cod_Paquete;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.precio = precio;
    }
    public int CalcularHora(){
        return 0;
    }
    public String calcularFecha(){
        return "";
    }

    public int getCod_Ticket() {
        return cod_Ticket;
    }

    public void setCod_Ticket(int cod_Ticket) {
        this.cod_Ticket = cod_Ticket;
    }

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public int getCod_Paquete() {
        return cod_Paquete;
    }

    public void setCod_Paquete(int cod_Paquete) {
        this.cod_Paquete = cod_Paquete;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
