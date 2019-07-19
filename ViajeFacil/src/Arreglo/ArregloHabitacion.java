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
public class ArregloHabitacion{
    private List<Habitacion> habitacion;

    public ArregloHabitacion() {
        habitacion = new ArrayList();
        habitacion.add(new Habitacion(1008, "Libre"));
        habitacion.add(new Habitacion(1008, "Ocupado"));
        habitacion.add(new Habitacion(1009, "Libre"));
        habitacion.add(new Habitacion(1002, "Libre"));
        habitacion.add(new Habitacion(1003, "Libre"));
        habitacion.add(new Habitacion(1003, "Libre"));
        habitacion.add(new Habitacion(1004, "Ocupado"));
        habitacion.add(new Habitacion(1004, "Libre"));
        habitacion.add(new Habitacion(1005, "Libre"));
        habitacion.add(new Habitacion(1015, "Libre"));
        habitacion.add(new Habitacion(1006, "Ocupado"));
        habitacion.add(new Habitacion(1020, "Libre"));
        habitacion.add(new Habitacion(1007, "Ocupado"));
        habitacion.add(new Habitacion(1007, "Libre"));
    }

    public List<Habitacion> getHabi() {
        return habitacion;
    }

    public void setHabi(List<Habitacion> habi) {
        this.habitacion = habi;
    }
    
    
    
}
