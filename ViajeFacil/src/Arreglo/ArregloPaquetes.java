/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglo;

import clases.Paquete;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FRANK
 */
public class ArregloPaquetes{
    private List<Paquete> paq;

    public ArregloPaquetes() {
        paq = new ArrayList();
        paq.add(new Paquete(1500.00, 1002, 1001, 1003, "No incluye movilidad al aeropuerto"));
        paq.add(new Paquete(2450.00, 1001, 1004, 1001, "No incluye alimentos"));
        paq.add(new Paquete(1954.90, 1001, 1004, 1002, "incluye comidas y bebidas en los campamentos"));
        
    }
 
}
