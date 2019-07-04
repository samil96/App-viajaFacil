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
    private String usuario;
    private String password;
    static int cuenta=1001;
    
    public Vendedor(String nombre, String apellidos, String usuario, String password) {
        super(nombre, apellidos);
        this.codigo = cuenta++;
        this.usuario = usuario;
        this.password = password;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
