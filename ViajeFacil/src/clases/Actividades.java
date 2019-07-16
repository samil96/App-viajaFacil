
package clases;

/**
 *
 * @author FRANK
 */
public class Actividades {
    private int codActividad;
    private int cod_tour;
    private int hora_inicio;
    private int hora_fin;
    private String detalle;
    static int cuenta=1001;

    public Actividades(int cod_tour, int hora_inicio, int hora_fin, String detalle) {
        this.codActividad = cuenta++;
        this.cod_tour = cod_tour;
        this.hora_inicio = hora_inicio;
        this.hora_fin = hora_fin;
        this.detalle = detalle;
    }

    public int getCodActividad() {
        return codActividad;
    }

    public void setCodActividad(int codActividad) {
        this.codActividad = codActividad;
    }

    public int getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(int hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public int getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(int hora_fin) {
        this.hora_fin = hora_fin;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCod_tour() {
        return cod_tour;
    }

    public void setCod_tour(int cod_tour) {
        this.cod_tour = cod_tour;
    }
    
}
