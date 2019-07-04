/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglo;

import java.util.ArrayList;
import java.util.List;
import clases.Actividades;
import interfaces.iMantenedor;

/**
 *
 * @author FRANK
 */
public class ArregloActividades implements iMantenedor<Actividades>{

    private List<Actividades> lista;

    public ArregloActividades() {
        lista = new ArrayList();
    }

    public int obtenerPosicion(int codigo){
        int pos=-1;
        for (int i = 0; i < tamanio(); i++) {
            if(lista.get(i).getCodActividad()==codigo){
                pos=i; break;
            }
        }
        return pos;
    }
    public List<Actividades> data(){
        return lista;
    }
    public int tamanio(){
        return lista.size();
    }
    @Override
    public void agregar(Actividades t) {
        lista.add(t);
    }

    @Override
    public void actualizar(int pos, Actividades t) {
        lista.set(pos, t);
    }

    @Override
    public void eliminar(int pos) {
        lista.remove(pos);
    }

    @Override
    public Actividades buscar(int pos) {
        return lista.get(pos);
    }

    public void setLista(List<Actividades> lista) {
        this.lista = lista;
    }

}
