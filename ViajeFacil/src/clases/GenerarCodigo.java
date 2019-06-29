package clases;

/**
 *
 * @author Lesly
 */
public class GenerarCodigo {
    private int dato;
    private final int cont = 1;
    private String num = "";
    
    public void generar(int d){
        dato = d;
        
        if((dato >= 1000) || (dato < 1000)){
            int can = cont + dato;
            num = "" + can;
        }
        
        if((dato >= 100) || (dato < 100)){
            int can = cont + dato;
            num = "0" + can;
        }
        
        if((dato >= 9) || (dato < 100)){
            int can = cont + dato;
            num = "00" + can;
        }
    }
    
}
