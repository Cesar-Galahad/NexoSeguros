package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
            
            return null;
        }
    }
   public static void guardar(Cliente c) {
 String sql = "INSERT INTO clientes(nombre, apellidoPaterno, apellidoMaterno, curp, folio, tipoSeguro, cantidad, vigencia, resepcion) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";


    try (Connection con = conectar();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setString(1, c.getNombre());
        ps.setString(2, c.getApellidoPaterno());
        ps.setString(3, c.getApellidoMaterno());
        ps.setString(4, c.getCurp());
        ps.setString(5, c.getFolio());
        ps.setString(6, c.getTipoSeguro());
        ps.setString(7, c.getCantidad());
        ps.setString(8, c.getVigencia());
        ps.setString(9, c.getRecepcion()); 
       

        ps.executeUpdate();
        System.out.println("Datos guardados correctamente");

    } catch (SQLException e) {
        System.out.println("Error al guardar: " + e.getMessage());
    }
}


}
