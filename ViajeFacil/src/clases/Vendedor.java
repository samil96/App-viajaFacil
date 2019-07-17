package clases;


/**
 *
 * @author FRANK
 */
public class Vendedor extends Persona{
    private int codigo;
    private String usuario;
    private String password;
    static int cuenta=1001;
    
    public Vendedor(String nombre, String apellidos, String usuario, String password) {
        super(nombre, apellidos);
        this.codigo = cuenta++;
        this.usuario = usuario;
        this.password = password;
    }

    public Vendedor() {
        super(null, null);
    }
    
    public String generaUsuario(String nombre, String apellido){
        int num=(int)(Math.random()*100)+1;
        String Usuario=nombre.substring(0, 3)+apellido.substring(0, 4)+num;
        return Usuario;
    }
    
    public String generaClave(String nombre, String apellido){
        int num=(int)(Math.random()*999)+1;
        String Usuario=nombre.substring(0, 2)+apellido.substring(2, 5)+num;
        return Usuario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
