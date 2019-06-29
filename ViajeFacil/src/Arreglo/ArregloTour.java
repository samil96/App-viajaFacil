/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglo;

import clases.Tour;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nuria
 */
public class ArregloTour {
    private List<Tour> tour;

    public ArregloTour(List<Tour> tour) {
        tour=new ArrayList();
        tour.add(new Tour("28/07/19", "30/07/19", tour, 20, "Tour del Sol"));
        tour.add(new Tour("27/08/19", "31/08/19", tour, 20, "Tour de Santa Rosa Lima"));
        tour.add(new Tour("25/09/19", "30/09/19", tour, 20, "Camino Inca"));
        
    }
    
    
    
}
