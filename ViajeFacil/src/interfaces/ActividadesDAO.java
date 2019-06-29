/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import java.util.List;
import clases.Actividades;
import clases.Servicio;

/**
 *
 * @author FRANK
 */
public class ActividadesDAO implements iMantenedor{

    private List lista;

    public ActividadesDAO() {
        lista = new ArrayList();
        lista.add(new Actividades(00001, 8, 18, "Visita Machu Picchu"));
    }

    @Override
    public void agregar() {
    }

    @Override
    public void actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Servicio buscar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
