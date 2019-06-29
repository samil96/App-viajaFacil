
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
