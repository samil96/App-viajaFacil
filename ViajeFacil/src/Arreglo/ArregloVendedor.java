package Arreglo;

import clases.Vendedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FRANK
 */
public class ArregloVendedor {
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
}