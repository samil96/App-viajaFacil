/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import Arreglo.ArregloHabitacion;
import clases.Actividades;
import clases.Habitacion;
import interfaces.iMantenedor;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Valia
 */
public class listaHabitacion implements iMantenedor<Habitacion>{
    ArregloHabitacion objhab = new ArregloHabitacion();
    private List<Habitacion> habitacion =objhab.getHabi();
    
    public int obtenerPosicion(int codigo){
        int pos=-1;
        for (int i = 0; i < tamanio(); i++) {
            if(habitacion.get(i).getCod_habi()==codigo){
                pos=i; break;
            }
        }
        return pos;
    }
    public List<Habitacion> datosporHotel(int cod_hotel){
        List<Habitacion> lista=new ArrayList<>();
        for (int i = 0; i < tamanio(); i++) {
            if(habitacion.get(i).getCod_hotel()==cod_hotel){
                Habitacion x=habitacion.get(i);
                lista.add(x);
            }
        }
        return lista;
    }
            
        public List<Habitacion> data() {
        return habitacion;
        }
        
        public int tamanio(){
        return habitacion.size();
    }
    @Override
    public void agregar(Habitacion t) {
        habitacion.add(t);
    }

    @Override
    public void actualizar(int pos, Habitacion t) {
        habitacion.set(pos, t);
    }

    @Override
    public void eliminar(int pos) {
        habitacion.remove(pos);
    }

    @Override
    public Habitacion buscar(int pos) {
        return habitacion.get(pos);
    }
    
}
