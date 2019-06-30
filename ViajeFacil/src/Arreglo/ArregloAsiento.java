/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglo;

import clases.Servicio;
import interfaces.iMantenedor;
import java.util.ArrayList;
import java.util.List;
import clases.Asiento;

/**
 *
 * @author FRANK
 */
public class ArregloAsiento implements iMantenedor{
    private List<Asiento> asiento;

    public ArregloAsiento() {
        asiento = new ArrayList();
        asiento.add(new Asiento("A201", 1001, "Disponible"));
        asiento.add(new Asiento("F504", 1001, "Disponible"));
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
