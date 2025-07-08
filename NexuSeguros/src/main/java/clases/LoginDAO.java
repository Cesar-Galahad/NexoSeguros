package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {

    public static boolean validarLogin(String usuario, String contrasena) {
        String sql = "SELECT * FROM usuarios WHERE usuario = ? AND contrasena = ?";
        
        try (Connection con = ConexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, usuario);
            ps.setString(2, contrasena);

            ResultSet rs = ps.executeQuery();
            return rs.next(); // Si encuentra un resultado, es válido
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
