
package clases;

import java.util.List;
/**
 *
 * @author FRANK
 */
public class Tour extends Servicio {
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

}
