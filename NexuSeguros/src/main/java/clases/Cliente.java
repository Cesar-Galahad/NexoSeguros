package clases;

public class Cliente extends User {
    private String folio;
    private String tipoSeguro;
    private String cantidad;
    private String vigencia;
    private String resepcion;

    public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, String genero, String correo, String contrasena, String usuario,
                   String curp, String folio, String tipoSeguro, String cantidad, String vigencia, String resepcion) {
        super(nombre, apellidoPaterno, apellidoMaterno, telefono, genero, correo, contrasena, usuario);
        this.curp = curp;
        this.folio = folio;
        this.tipoSeguro = tipoSeguro;
        this.cantidad = cantidad;
        this.vigencia = vigencia;
        this.resepcion = resepcion;
    }

    private String curp;

    // Getters
    public String getCurp() {
        return curp;
    }

    public String getFolio() {
        return folio;
    }

    public String getTipoSeguro() {
        return tipoSeguro;
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getVigencia() {
        return vigencia;
    }

    public String getRecepcion() {
    return resepcion;
}

}
