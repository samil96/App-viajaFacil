/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import clases.Servicio;
import java.util.List;

/**
 *
 * @author FRANK
 */
public interface iMantenedor {
    public void agregar();
    public void actualizar();
    public void eliminar();
    public Servicio buscar(int codigo);
}
