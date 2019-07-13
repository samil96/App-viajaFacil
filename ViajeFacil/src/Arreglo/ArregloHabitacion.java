/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglo;

import clases.Habitacion;
import interfaces.iMantenedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FRANK
 */
public class ArregloHabitacion implements iMantenedor<Habitacion>{
    private List<Habitacion> habi;

    public ArregloHabitacion() {
        habi = new ArrayList();
        habi.add(new Habitacion(701, "Libre"));
        habi.add(new Habitacion(605, "Libre"));
        habi.add(new Habitacion(707, "Libre"));
        habi.add(new Habitacion(607, "Libre"));
        habi.add(new Habitacion(706, "Libre"));
        habi.add(new Habitacion(601, "Libre"));
        habi.add(new Habitacion(705, "Libre"));
        habi.add(new Habitacion(602, "Libre"));
        habi.add(new Habitacion(704, "Libre"));
        habi.add(new Habitacion(603, "Libre"));
        habi.add(new Habitacion(703, "Libre"));
        habi.add(new Habitacion(604, "Libre"));
        habi.add(new Habitacion(702, "Libre"));
        habi.add(new Habitacion(606, "Libre"));
    }
    public int obtenerPosicion(int codigo){
        int pos=-1;
        for (int i = 0; i < tamanio(); i++) {
            if(habi.get(i).getCod_habi()==codigo){
                pos=i; break;
            }
        }
        return pos;
    }
    public List<Habitacion> data(){
        return habi;
    }
    public int tamanio(){
        return habi.size();
    }

    @Override
    public void agregar(Habitacion t) {
        habi.add(t);
    }

    @Override
    public void actualizar(int pos, Habitacion t) {
        habi.set(pos, t);
    }

    @Override
    public void eliminar(int pos) {
        habi.remove(pos);
    }

    @Override
    public Habitacion buscar(int pos) {
        return habi.get(pos);
    }

    public void setHabi(List<Habitacion> habi) {
        this.habi = habi;
    }
    
}
