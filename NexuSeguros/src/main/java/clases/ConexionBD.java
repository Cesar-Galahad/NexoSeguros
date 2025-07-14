package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {
    
    private static final String URL = "jdbc:mysql://localhost:3306/nexoseguros";
    private static final String USER = "root";
    private static final String PASSWORD = ""; // vacío por defecto en XAMPP
    static Statement sentencia;
    public static Connection conectar() {
        
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos.");
            sentencia = con.createStatement();
            return con;
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
            return null;
        }
    }
    public static void guardar(Cliente x){
    String q = "INSERT INTO clientes VALUES('" + x.getIdCliente() + "','" + x.getNombre() + "','" + x.getApellidoPaterno() + "','" + x.getApellidoMaterno() + "','" + x.getDireccion() + "','" + x.getTelefono() + "','" + x.getGenero() + "','" + x.getCorreo() + "','" + x.getCurp() + "','" + x.getRfc() + "','" + x.getUsuario() + "','" + x.getContrasena() + "')";

    try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
         Statement stmt = con.createStatement()) {
        stmt.executeUpdate(q);
        System.out.println("Subida completa");
    } catch (SQLException e) {
        System.out.println("Error al guardar: " + e.getMessage());
    }
}

}
