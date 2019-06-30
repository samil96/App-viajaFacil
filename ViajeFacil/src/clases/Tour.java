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
public class Tour extends Servicio{
    private int codigo;
    private String fecha_inicio;
    private String fecha_fin;
    private List arrayActividades;
    static int cuenta=1001;

    public Tour(String fecha_inicio, String fecha_fin, List arrayActividades, String nombre) {
        super(nombre);
        this.codigo = cuenta++;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.arrayActividades = arrayActividades;
    }

    @Override
    public double calcularCostoServicio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public List getArrayActividades() {
        return arrayActividades;
    }

    public void setArrayActividades(List arrayActividades) {
        this.arrayActividades = arrayActividades;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
}
