
package clases;


public class agente {
    private int idAgente;
    private String nombre;
    private String correo;
    private String contrasena;
    private double comisionBase;
    private int idSucursal;

    public agente(int idAgente, String nombre, String correo, String contrasena, double comisionBase, int idSucursal) {
        this.idAgente = idAgente;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.comisionBase = comisionBase;
        this.idSucursal = idSucursal;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }
    public int getIdAgente() {
    return idAgente;
}

public int getIdSucursal() {
    return idSucursal;
}

public String getNombre() {
    return nombre;
}
}
