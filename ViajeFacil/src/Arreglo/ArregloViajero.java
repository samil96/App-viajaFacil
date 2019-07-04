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
 * @author FRANK
 */
public class ArregloViajero implements iMantenedor<Viajero>{
    private List<Viajero> viajero;

    public ArregloViajero() {
        viajero=new ArrayList();
        viajero.add(new Viajero("Frank", "Torres Contreras", 11223344, "987654321"));
        viajero.add(new Viajero("Nuria", "Granda", 12345678, "963852741"));
        viajero.add(new Viajero("Lesly", "Samaritano", 98765432, "951236478"));
        viajero.add(new Viajero("Valia", "Vicuña", 11112222, "987412365"));
    }
    public List<Viajero> data(){
        return viajero;
    }
    
    public int obtenerPosicion(int dni){
        int pos=-1;
        for (int i = 0; i < tamanio(); i++) {
            if(viajero.get(i).getDni()==dni){
                pos=i; break;
            }
        }
        return pos;
    }

    public int tamanio(){
        return viajero.size();
    }

    @Override
    public void agregar(Viajero t) {
        viajero.add(t);
    }

    @Override
    public void actualizar(int pos, Viajero t) {
        viajero.set(pos, t);
    }

    @Override
    public void eliminar(int pos) {
        viajero.remove(pos);
    }

    @Override
    public Viajero buscar(int pos) {
        return viajero.get(pos);
    }
}
