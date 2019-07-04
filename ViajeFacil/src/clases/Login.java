/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import Arreglo.ArregloVendedor;

/**
 *
 * @author FRANK
 */
public class Login {
    public int validarCuenta(String user, String clave){
        int num=1;
        ArregloVendedor obj = new ArregloVendedor();
        for (Vendedor x : obj.data()) {
            if(x.getUsuario().compareTo(user)==0 && x.getPassword().compareTo(clave)==0){
                num=2; break;
            }
        }
        return num;
    }
}
