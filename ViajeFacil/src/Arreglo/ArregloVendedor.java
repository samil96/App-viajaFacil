/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglo;

import clases.Vendedor;
import interfaces.iMantenedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FRANK
 */
public class ArregloVendedor implements iMantenedor<Vendedor>{
    private List<Vendedor> vende;

    public ArregloVendedor() {
        vende = new ArrayList();
        vende.add(new Vendedor("Frank", "Torres Contreras", "Frank123", "123456"));
        vende.add(new Vendedor("Lesly", "Samaritano", "Lesly9", "123456"));
        vende.add(new Vendedor("Nuria", "Granda", "Nuria7", "123456"));
        vende.add(new Vendedor("Valia", "Vicuña", "Valia10", "123456"));
    }
    public List<Vendedor> data(){
        return vende;
    }
    
    public int obtenerPosicion(int codigo){
        int pos=-1;
        for (int i = 0; i < tamanio(); i++) {
            if(vende.get(i).getCodigo()==codigo){
                pos=i; break;
            }
        }
        return pos;
    }

    public int tamanio(){
        return vende.size();
    }
    
    @Override
    public void agregar(Vendedor t) {
        vende.add(t);
    }

    @Override
    public void actualizar(int pos, Vendedor t) {
        vende.set(pos, t);
    }

    @Override
    public void eliminar(int pos) {
        vende.remove(pos);
    }

    @Override
    public Vendedor buscar(int pos) {
        return vende.get(pos);
    }
    
}
