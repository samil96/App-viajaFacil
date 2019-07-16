
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
        acti.add(new Actividades(1001, 8, 18, "visita al templo del sol"));
        acti.add(new Actividades(1001, 8, 18, "Visita museo x"));
        acti.add(new Actividades(1002, 8, 18, "caminata a Ollantaytambo"));
        acti.add(new Actividades(1002, 8, 18, "caminata a Pacaymayo"));
        acti.add(new Actividades(1003, 8, 18, "visita museo de lima"));
        acti.add(new Actividades(1003, 8, 18, "Visita plaza de armas"));
    }

    public List<Actividades> getActi() {
        return acti;
    }

    public void setActi(List<Actividades> acti) {
        this.acti = acti;
    }
    
}
