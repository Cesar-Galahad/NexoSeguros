
package clases;


public class Cliente {
    private int idCliente;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String telefono;
    private String direccion;
    private String curp;
    private String rfc;
    private String genero;
    private String correo;
    private String contrasena;

    public Cliente(int idCliente, String nombre, String apellidoPaterno, String apellidoMaterno,
                   String telefono, String direccion, String curp, String rfc, String genero,
                   String correo, String contrasena) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.direccion = direccion;
        this.curp = curp;
        this.rfc = rfc;
        this.genero = genero;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }
    
}
