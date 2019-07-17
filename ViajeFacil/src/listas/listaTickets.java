/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import Arreglo.ArregloTicket;
import clases.Ticket;
import interfaces.iMantenedor;
import java.util.List;

/**
 *
 * @author FRANK
 */
public class listaTickets implements iMantenedor<Ticket>{
    ArregloTicket obj=new ArregloTicket();
    private List<Ticket> ticket=obj.getTicket();
    
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
