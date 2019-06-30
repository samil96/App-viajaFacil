/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglo;

import java.util.ArrayList;
import java.util.List;
import clases.Actividades;
import clases.Servicio;
import interfaces.iMantenedor;

/**
 *
 * @author FRANK
 */
public class ArregloActividades implements iMantenedor{

    private List<Actividades> lista;

    public ArregloActividades() {
        lista = new ArrayList();
        lista.add(new Actividades(1001, 8, 18, "Visita Machu Picchu"));
        lista.add(new Actividades(1001, 8, 18, "Visita Huayna Picchu"));
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
