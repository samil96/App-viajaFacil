/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglo;

import clases.Servicio;
import clases.Tour;
import interfaces.iMantenedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nuria
 */
public class ArregloTour implements iMantenedor{
    private List<Tour> tour;

    public ArregloTour(List<Tour> tour) {
        tour=new ArrayList();
        tour.add(new Tour("28/07/19", "30/07/19", tour, "Tour del Sol"));
        tour.add(new Tour("27/08/19", "31/08/19", tour, "Tour de Santa Rosa Lima"));
        tour.add(new Tour("25/09/19", "30/09/19", tour, "Camino Inca"));
        
    }

    @Override
    public void agregar(Servicio s) {
        
    }

    @Override
    public void actualizar() {
        
    }

    @Override
    public void eliminar() {
        
    }

    @Override
    public Servicio buscar(int codigo) {
        return null;
    }
    
    
    
}
