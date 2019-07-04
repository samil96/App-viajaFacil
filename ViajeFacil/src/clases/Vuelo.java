package clases;
import Arreglo.ArregloVuelo;
import interfaces.iMantenedor;
import java.util.List;
/**
 *
 * @author FRANK
 */
public class Vuelo extends Servicio implements iMantenedor<Vuelo>{
    private int codigo;
    private String aerolinea;
    private String destino;
    private String fecha;
    private int hora;
    private int cant_asientos;
    static int cuenta=1001;

    public Vuelo(String aerolinea, String destino, String fecha, int hora, int cant_asientos, String nombre) {
        super(nombre);
        this.codigo = cuenta++;
        this.aerolinea = aerolinea;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.cant_asientos = cant_asientos;
    }

    @Override
    public double calcularCostoServicio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
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
    
    
    ArregloVuelo obj=new ArregloVuelo();
    List<Vuelo> vuelo=obj.data();
    /* PARA LISTAR LOS VUELOS */
    public List<Vuelo> data(){
        return vuelo;
    }

    public int obtenerPosicion(int codigo){
        int pos=-1;
        for (int i = 0; i < tamanio(); i++) {
            if(vuelo.get(i).getCodigo()==codigo){
                pos=i; break;
            }
        }
        return pos;
    }

    public int tamanio(){
        return vuelo.size();
    }

    /* PARA AGRAGR UN NUEVO VUELO - vue es la variable cuando se añado se guardara ahi */
    @Override
    public void agregar(Vuelo t) {
        obj.agregar(t);
    }

    /* PARA ACTUALIZAR LOS VUELOS */
    @Override
    public void actualizar(int pos, Vuelo t) {
        obj.actualizar(pos, t);
    }

    @Override
    public void eliminar(int codigo) {
        obj.eliminar(obj.obtenerPosicion(codigo));
    }

    @Override
    public Vuelo buscar(int pos) {
        return obj.buscar(pos);
    }
}
