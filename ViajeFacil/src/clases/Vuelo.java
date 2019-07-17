package clases;
import java.util.List;

/**
 *
 * @author Lesly
 */
public class Vuelo extends Servicio{

    private int codigo;
    private String aerolinea;
    private String origen;
    private String destino;
    private String fecha;
    private int hora;
    private int cant_asientos;
    static int cuenta = 1001;

    public Vuelo(int codigo, String aerolinea, String origen, String destino, String fecha, int hora, int cant_asientos, String nombre) {
        super(nombre);
        this.codigo = cuenta++;
        this.aerolinea = aerolinea;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.cant_asientos =cant_asientos;
    }

    @Override
    public double calcularCostoServicio() {
        double costo=0;
        if (destino.compareToIgnoreCase("cusco")==0) {
            costo=180;
        } else {
            if (destino.compareToIgnoreCase("arequipa")==0) {
                costo=100;
            } else {
                if (destino.compareToIgnoreCase("tacna")==0) {
                    costo=95.5;
                } else {
                    costo=79.9;
                }
            }
        }
        return costo;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getCant_asientos() {
        return cant_asientos;
    }

    public void setCant_asientos(int cant_asientos) {
        this.cant_asientos = cant_asientos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

   
    
}
