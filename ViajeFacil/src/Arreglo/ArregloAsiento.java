/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglo;

import interfaces.iMantenedor;
import java.util.ArrayList;
import java.util.List;
import clases.Asiento;

/**
 *
 * @author FRANK
 */
public class ArregloAsiento implements iMantenedor<Asiento>{
    private List<Asiento> asiento;

    public ArregloAsiento() {
        asiento = new ArrayList();
        asiento.add(new Asiento("A201", 1001, "Disponible"));
        asiento.add(new Asiento("F504", 1001, "Disponible"));
    }

    public int obtenerPosicion(String codigo){
        int pos=-1;
        for (int i = 0; i < tamanio(); i++) {
            if(asiento.get(i).getCod().compareTo(codigo)==0){
                pos=i; break;
            }
        }
        return pos;
    }
    public List<Asiento> data(){
        return asiento;
    }
    public int tamanio(){
        return asiento.size();
    }
    @Override
    public void agregar(Asiento t) {
        asiento.add(t);
    }

    @Override
    public void actualizar(int pos, Asiento t) {
        asiento.set(pos, t);
    }

    @Override
    public void eliminar(int pos) {
         asiento.remove(pos);
    }

    @Override
    public Asiento buscar(int pos) {
        return asiento.get(pos);
    }

    public void setAsiento(List<Asiento> asiento) {
        this.asiento = asiento;
    }
    
}
