/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglo;

import clases.Actividades;
import clases.Tour;
import interfaces.iMantenedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nuria
 */
public class ArregloTour implements iMantenedor<Tour>{
    private List<Tour> tour;

    public ArregloTour() {
        tour=new ArrayList();
        List a = new ArrayList();
        a.add(new Actividades(8, 18, "visita al templo del sol"));
        a.add(new Actividades(8, 18, "Visita museo x"));
        tour.add(new Tour("Cusco", a, "Tour del Sol"));
        List c = new ArrayList();
        c.add(new Actividades(8, 18, "caminata a Ollantaytambo"));
        c.add(new Actividades(8, 18, "caminata a Pacaymayo"));
        tour.add(new Tour("Cusco", c, "Camino Inca"));
        List b = new ArrayList();
        b.add(new Actividades(8, 18, "visita museo de lima"));
        b.add(new Actividades(8, 18, "Visita plaza de armas"));
        tour.add(new Tour("Tacna", b, "Tour de Santa Rosa Lima"));
    }

    public List<Tour> data(){
        return tour;
    }
    
    public int obtenerPosicion(int codigo){
        int pos=-1;
        for (int i = 0; i < tamanio(); i++) {
            if(tour.get(i).getCodigo()==codigo){
                pos=i; break;
            }
        }
        return pos;
    }

    public int tamanio(){
        return tour.size();
    }
    @Override
    public void agregar(Tour t) {
        tour.add(t);
    }

    @Override
    public void actualizar(int pos, Tour t) {
        tour.set(pos, t);
    }

    @Override
    public void eliminar(int pos) {
        tour.remove(pos);
    }

    @Override
    public Tour buscar(int pos) {
        return tour.get(pos);
    }

    
}
