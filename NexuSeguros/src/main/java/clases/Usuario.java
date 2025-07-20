
package clases;


public class Usuario {
    private int id;
    private String usuario;
    private String contrasena;
    private String tipo;
    private String nombre;
    private String telefono;
    private String correo;
    private String sucursal;

    public Usuario(int id, String usuario, String contrasena, String tipo, String nombre, String telefono, String correo, String sucursal) {
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.tipo = tipo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.sucursal = sucursal;
    }

    public int getId() { return id; }
    public String getUsuario() { return usuario; }
    public String getContrasena() { return contrasena; }
    public String getTipo() { return tipo; }
    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
    public String getCorreo() { return correo; }
    public String getSucursal() { return sucursal; }
}
