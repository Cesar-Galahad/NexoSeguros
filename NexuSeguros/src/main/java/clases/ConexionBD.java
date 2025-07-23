package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {
    
    private static final String URL = "jdbc:mysql://localhost:3306/nexoseguros";
    private static final String USER = "root";
    private static final String PASSWORD = ""; 
    static Statement sentencia;
    public static Connection conectar() {
        
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos.");
            sentencia = con.createStatement();
            return con;
        } catch (SQLException e) {
            
            return null;
        }
    }
  public static void guardar(Cliente c) {
    String sql = "INSERT INTO Cliente(nombre, apellido_paterno, apellido_materno, telefono, direccion, curp, rfc, genero, usuarioCliente, contrasena, tipoSeguro, recepcion, vigencia, cantidad) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try (Connection con = conectar();
         PreparedStatement ps = con.prepareStatement(sql)) {

       ps.setString(1, c.getNombre());
ps.setString(2, c.getApellidoPaterno());
ps.setString(3, c.getApellidoMaterno());
ps.setString(4, c.getTelefono());
ps.setString(5, c.getDireccion());
ps.setString(6, c.getCurp());
ps.setString(7, c.getRfc());
ps.setString(8, c.getGenero());
ps.setString(9, c.getUsuarioCliente());
ps.setString(10, c.getContrasena());
ps.setString(11, c.getTipoSeguro());
ps.setString(12, c.getRecepcion());
ps.setString(13, c.getVigencia());
ps.setString(14, c.getCantidad());


        ps.executeUpdate();
        System.out.println("Datos guardados correctamente");

    } catch (SQLException e) {
        System.out.println("Error al guardar: " + e.getMessage());
    }
}
  public static boolean curpExiste(String curp) {
    String sql = "SELECT COUNT(*) FROM Cliente WHERE curp = ?";
    try (Connection con = conectar();
         PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setString(1, curp);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0; 
            }
        }
    } catch (SQLException e) {
        System.out.println("Error al verificar CURP: " + e.getMessage());
    }
    return false; 
}

  
}