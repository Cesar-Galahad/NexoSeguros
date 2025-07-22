
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

    // Constructor vacío
    public Usuario() {
    }

    // Constructor con todos los parámetros
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

    // Getters
    public int getId() { return id; }
    public String getUsuario() { return usuario; }
    public String getContrasena() { return contrasena; }
    public String getTipo() { return tipo; }
    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
    public String getCorreo() { return correo; }
    public String getSucursal() { return sucursal; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setUsuario(String usuario) { this.usuario = usuario; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public void setCorreo(String correo) { this.correo = correo; }
    public void setSucursal(String sucursal) { this.sucursal = sucursal; }
}
