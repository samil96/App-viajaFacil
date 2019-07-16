
package Arreglo;

import java.util.ArrayList;
import java.util.List;
import clases.Actividades;


/**
 *
 * @author Lesly
 */
public class ArregloActividades{

    private List<Actividades> acti;

    public ArregloActividades() {
        acti = new ArrayList();
        acti.add(new Actividades(8, 18, "visita al templo del sol"));
        acti.add(new Actividades(8, 18, "caminata a Pacaymayo"));
        acti.add(new Actividades(8, 18, "Visita plaza de armas"));
    }

    public List<Actividades> getActi() {
        return acti;
    }

    public void setActi(List<Actividades> acti) {
        this.acti = acti;
    }
    
}
