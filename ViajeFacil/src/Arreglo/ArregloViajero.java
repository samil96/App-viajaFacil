/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglo;

import clases.Viajero;
import interfaces.iMantenedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lesly
 */
public class ArregloViajero{
    private List<Viajero> viajero;

    public ArregloViajero() {
        viajero=new ArrayList();
        viajero.add(new Viajero("Frank", "Torres Contreras", 11223344, "987654321"));
        viajero.add(new Viajero("Nuria", "Granda", 12345678, "963852741"));
        viajero.add(new Viajero("Lesly", "Samaritano", 98765432, "951236478"));
        viajero.add(new Viajero("Valia", "Vicuña", 11112222, "987412365"));
    }

    public List<Viajero> getViajero() {
        return viajero;
    }

    public void setViajero(List<Viajero> viajero) {
        this.viajero = viajero;
    }
    
}
