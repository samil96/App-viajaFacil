
package interfaces;

import clases.Servicio;
import java.util.List;

/**
 *
 * @author FRANK
 */
public interface iMantenedor<T> {
    public void agregar(T t);
    public void actualizar(int pos, T t);
    public void eliminar(int pos);
    public T buscar(int pos);
}
