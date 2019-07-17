/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglo;

import clases.Ticket;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FRANK
 */
public class ArregloTicket{
    private List<Ticket> ticket;

    public ArregloTicket() {
        ticket = new ArrayList();
        ticket.add(new Ticket(1001, 1002, "Cusco", "03/07/2019", 12, 2450.00));
        ticket.add(new Ticket(1004, 1001, "Tacna", "30/06/2019", 3, 1500.00));
        ticket.add(new Ticket(1003, 1003, "Cusco", "14/03/2019", 6, 1954.90));
    }

    public List<Ticket> getTicket() {
        return ticket;
    }

    public void setTicket(List<Ticket> ticket) {
        this.ticket = ticket;
    }
    
}
