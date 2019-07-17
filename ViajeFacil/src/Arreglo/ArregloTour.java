/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglo;

import clases.Actividades;
import clases.Tour;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Frank y Lesly
 */
public class ArregloTour{
    private List<Tour> tour;

    public ArregloTour() {
        tour=new ArrayList();
        tour.add(new Tour("Cusco",2, "Tour del Sol"));
        tour.add(new Tour("Cusco",2, "Camino Inca"));
        tour.add(new Tour("Tacna",2, "Tour de Santa Rosa Lima"));
    }

    public List<Tour> getTour() {
        return tour;
    }

    public void setTour(List<Tour> tour) {
        this.tour = tour;
    }
 
}
