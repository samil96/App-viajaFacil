/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglo;

import clases.Paquete;
import interfaces.iMantenedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FRANK
 */
public class ArregloPaquetes implements iMantenedor<Paquete>{
    private List<Paquete> paq;

    public ArregloPaquetes() {
        paq = new ArrayList();
        paq.add(new Paquete(1500.00, 1002, 1001, 1003, "No incluye movilidad al aeropuerto"));
        paq.add(new Paquete(2450.00, 1001, 1004, 1001, "No incluye alimentos"));
        paq.add(new Paquete(1954.90, 1001, 1004, 1002, "incluye comidas y bebidas en los campamentos"));
        
    }
    public List<Paquete> data(){
        return paq;
    }
    
    public int obtenerPosicion(int codigo){
        int pos=-1;
        for (int i = 0; i < tamanio(); i++) {
            if(paq.get(i).getCod_Paquete()==codigo){
                pos=i; break;
            }
        }
        return pos;
    }

    public int tamanio(){
        return paq.size();
    }

    @Override
    public void agregar(Paquete t) {
        paq.add(t);
    }

    @Override
    public void actualizar(int pos, Paquete t) {
        paq.set(pos, t);
    }

    @Override
    public void eliminar(int pos) {
        paq.remove(pos);
    }

    @Override
    public Paquete buscar(int pos) {
        return paq.get(pos);
    }
}
