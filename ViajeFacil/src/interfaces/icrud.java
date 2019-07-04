
package interfaces;

/**
 *
 * @author FRANK
 */
public interface icrud {
    public interface iMantenedor<T> {
    public void agregar(T t);
    public void actualizar(int pos, T t);
    public void eliminar(int pos);
    public T buscar(int pos);
}
}
