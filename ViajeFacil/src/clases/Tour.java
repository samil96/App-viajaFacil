
package clases;

import java.util.List;
import Arreglo.ArregloTour;
import interfaces.iMantenedor;
/**
 *
 * @author FRANK
 */
public class Tour extends Servicio implements iMantenedor<Tour>{
    private int codigo;
    private String destino;
    private List<Actividades> arrayActividades;
    static int cuenta=1001;

    public Tour(String destino, List arrayActividades, String nombre) {
        super(nombre);
        this.codigo = cuenta++;
        this.destino = destino;
        this.arrayActividades = arrayActividades;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public double calcularCostoServicio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    /* metodos */
    /* objTour es el objeto que se crea */
    ArregloTour objTour = new ArregloTour();
    List<Tour> tour = objTour.data();

    /* PARA LISTAR LOS VUELOS */
    public List<Tour> data() {
        return tour;
    }
    /*metodo obtener la posicion por medio del codigo d evuelo*/
    public int obtenerPosicion(int codigo) {
        int pos = -1;
        for (int i = 0; i < tamanio(); i++) {
            if (tour.get(i).getCodigo() == codigo) {
                pos = i;
                break;
            }
        }
        return pos;
    }
    /* obtener el tamaño de la lista*/
    public int tamanio() {
        return tour.size();
    }
    
    /*METODOS DEL CRUD*/
    /* PARA AGREGAR UN NUEVO TOURS */
        @Override
    public void agregar(Tour t) {
        objTour.agregar(t);
    }

    /* PARA ACTUALIZAR LOS TOURS */
        @Override
    public void actualizar(int pos, Tour t) {
        objTour.actualizar(pos, t);
    }
    
    /*ELIMINAR TOUR*/
    @Override
    public void eliminar(int codigo) {
        objTour.eliminar(objTour.obtenerPosicion(codigo));
    }
    
    /*BUSCAR UN TOUR*/
    @Override
    public Tour buscar(int pos) {
        return objTour.buscar(pos);
    }

}
