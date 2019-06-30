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
public class Viajero extends Persona{
    private int codigo;
    private int dni;
    private int telefono;
    private int cod_ticket;
    static int cuenta=1001;

    public Viajero(int dni, int telefono, int cod_ticket, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.codigo = cuenta++;
        this.dni = dni;
        this.telefono = telefono;
        this.cod_ticket = cod_ticket;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCod_ticket() {
        return cod_ticket;
    }

    public void setCod_ticket(int cod_ticket) {
        this.cod_ticket = cod_ticket;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
