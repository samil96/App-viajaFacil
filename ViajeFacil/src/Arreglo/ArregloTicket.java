/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglo;

import clases.Ticket;
import interfaces.iMantenedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FRANK
 */
public class ArregloTicket implements iMantenedor<Ticket>{
    private List<Ticket> ticket;

    public ArregloTicket() {
        ticket = new ArrayList();
        ticket.add(new Ticket(1001, 1002, "Cusco", "03/07/2019", 12, 2450.00));
        ticket.add(new Ticket(1004, 1001, "Tacna", "30/06/2019", 3, 1500.00));
        ticket.add(new Ticket(1003, 1003, "Cusco", "14/03/2019", 6, 1954.90));
    }
    public List<Ticket> data(){
        return ticket;
    }
    
    public int obtenerPosicion(int codigo){
        int pos=-1;
        for (int i = 0; i < tamanio(); i++) {
            if(ticket.get(i).getCod_Ticket()==codigo){
                pos=i; break;
            }
        }
        return pos;
    }

    public int tamanio(){
        return ticket.size();
    }

    @Override
    public void agregar(Ticket t) {
        ticket.add(t);
    }

    @Override
    public void actualizar(int pos, Ticket t) {
        ticket.set(pos, t);
    }

    @Override
    public void eliminar(int pos) {
        ticket.remove(pos);
    }

    @Override
    public Ticket buscar(int pos) {
        return ticket.get(pos);
    }
}
