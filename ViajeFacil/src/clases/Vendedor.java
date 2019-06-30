/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.List;

/**
 *
 * @author FRANK
 */
public class Vendedor extends Persona{
    private int codigo;
    static int cuenta=1001;
    
    public Vendedor(String nombre, String apellidos) {
        super(nombre, apellidos);
        this.codigo = cuenta++;
    }
    
    public boolean registrarCliente(){
        return false;
    }
    public Viajero buscarCliente(int cod){
        return null;
    }
    public Paquete buscarPaquete(int cod){
        return null;
    }
    public List<Viajero> listarCliente(){
        return null;
    }
}
