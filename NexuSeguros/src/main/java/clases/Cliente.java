package clases;

public class Cliente {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String telefono;
    private String direccion;
    private String curp;
    private String rfc;
    private String genero;
    private String usuarioCliente;
    private String contrasena;
    private String correo;
    private String tipoSeguro;
    private String recepcion;
    private String vigencia;
    private String cantidad;

  
    public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, String direccion,
                   String curp, String rfc, String genero, String usuarioCliente, String contrasena, String correo,
                   String tipoSeguro, String recepcion, String vigencia, String cantidad) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.direccion = direccion;
        this.curp = curp;
        this.rfc = rfc;
        this.genero = genero;
        this.usuarioCliente = usuarioCliente;
        this.contrasena = contrasena;
        this.correo = correo;
        this.tipoSeguro = tipoSeguro;
        this.recepcion = recepcion;
        this.vigencia = vigencia;
        this.cantidad = cantidad;
    }

  
    public String getNombre() { return nombre; }
    public String getApellidoPaterno() { return apellidoPaterno; }
    public String getApellidoMaterno() { return apellidoMaterno; }
    public String getTelefono() { return telefono; }
    public String getDireccion() { return direccion; }
    public String getCurp() { return curp; }
    public String getRfc() { return rfc; }
    public String getGenero() { return genero; }
    public String getUsuarioCliente() { return usuarioCliente; }
    public String getContrasena() { return contrasena; }
    public String getCorreo() { return correo; }
    public String getTipoSeguro() { return tipoSeguro; }
    public String getRecepcion() { return recepcion; }
    public String getVigencia() { return vigencia; }
    public String getCantidad() { return cantidad; }
}
