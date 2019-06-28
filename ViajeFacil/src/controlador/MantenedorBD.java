/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;

/**
 *
 * @author FRANK
 */
public interface MantenedorBD {
    public String agregar();
    public String actualizar();
    public String eliminar();
    public List buscar();
}
