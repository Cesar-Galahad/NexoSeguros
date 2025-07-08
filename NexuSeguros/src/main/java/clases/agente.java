package clases;

public class agente extends User{
    private int idAgente;
    private double comisionBase;
    private int idSucursal;

    public agente(int idAgente, double comisionBase, int idSucursal, String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, String genero, String correo, String contrasena, String usuario) {
        super(nombre, apellidoPaterno, apellidoMaterno, telefono, genero, correo, contrasena, usuario);
        this.idAgente = idAgente;
        this.comisionBase = comisionBase;
        this.idSucursal = idSucursal;
    }

    public int getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(int idAgente) {
        this.idAgente = idAgente;
    }

    public double getComisionBase() {
        return comisionBase;
    }

    public void setComisionBase(double comisionBase) {
        this.comisionBase = comisionBase;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }


}
