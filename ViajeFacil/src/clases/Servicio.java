
package clases;


/**
 *
 * @author FRANK
 */
public abstract class Servicio {
    private String nombre;

    public Servicio(String nombre) {
        this.nombre = nombre;
    }
    public abstract double calcularCostoServicio();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
