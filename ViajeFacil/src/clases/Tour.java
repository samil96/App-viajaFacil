
package clases;

/**
 *
 * @author FRANK
 */
public class Tour extends Servicio {
    private int codigo;
    private String destino;
    private int num_Actividades;
    static int cuenta=1001;

    public Tour(String destino, int num_Actividades, String nombre) {
        super(nombre);
        this.codigo = cuenta++;
        this.destino = destino;
        this.num_Actividades = num_Actividades;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public double calcularCostoServicio() {
        double costo=0;
        if (destino.compareToIgnoreCase("cusco")==0) {
            costo=num_Actividades*150;
        } else {
            if (destino.compareToIgnoreCase("arequipa")==0) {
                costo=num_Actividades*100;
            } else {
                if (destino.compareToIgnoreCase("tacna")==0) {
                    costo=num_Actividades*95.5;
                } else {
                    costo=num_Actividades*79.9;
                }
            }
        }
        return costo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNum_Actividades() {
        return num_Actividades;
    }

    public void setNum_Actividades(int num_Actividades) {
        this.num_Actividades = num_Actividades;
    }
    
}
