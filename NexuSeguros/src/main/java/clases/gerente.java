package clases;

public class gerente extends User{
    private int idSucursal;

    public gerente( String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, String genero, String correo, int idSucursal1, String contrasena, String usuario) {
        super(nombre, apellidoPaterno, apellidoMaterno, telefono, genero, correo, contrasena, usuario);
        
        this.idSucursal = idSucursal;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }
}
