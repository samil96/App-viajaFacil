/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglo;

import java.util.ArrayList;
import java.util.List;
import clases.Asiento;

/**
 *
 * @author FRANK
 */
public class ArregloAsiento {
    private List<Asiento> asiento;

    public ArregloAsiento() {
        asiento = new ArrayList();
        asiento.add(new Asiento("A201", 1001, "Disponible"));
        asiento.add(new Asiento("F504", 1001, "Disponible"));
        asiento.add(new Asiento("A205", 1002, "Disponible"));
    }

    public List<Asiento> getAsiento() {
        return asiento;
    }

    public void setAsiento(List<Asiento> asiento) {
        this.asiento = asiento;
    }

}
