package clases;


public class Cliente extends User{
    private int idCliente;
    private String direccion;
    private String curp;
    private String rfc;

    public Cliente(int idCliente, String direccion, String curp, String rfc, String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, String genero, String correo, String contrasena, String usuario) {
        super(nombre, apellidoPaterno, apellidoMaterno, telefono, genero, correo, contrasena, usuario);
        this.idCliente = idCliente;
        this.direccion = direccion;
        this.curp = curp;
        this.rfc = rfc;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    
    
}
