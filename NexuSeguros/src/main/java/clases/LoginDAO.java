package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {

    // Variable estática para guardar el usuario validado
    public static Usuario usuarioLogueado = null;

    public static boolean validarLogin(String usuario, String contrasena) {
        String sql = "SELECT * FROM usuarios WHERE usuario = ? AND contrasena = ?";
        
        try (Connection con = ConexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, usuario);
            ps.setString(2, contrasena);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) { 
                // Si encontró el usuario, creamos el objeto Usuario con sus datos
                usuarioLogueado = new Usuario();
                usuarioLogueado.setId(rs.getInt("id"));
                usuarioLogueado.setUsuario(rs.getString("usuario"));
                usuarioLogueado.setNombre(rs.getString("nombre"));
                usuarioLogueado.setTelefono(rs.getString("telefono"));
                usuarioLogueado.setCorreo(rs.getString("correo"));
                usuarioLogueado.setTipo(rs.getString("tipo"));
                usuarioLogueado.setSucursal(rs.getString("sucursal"));
                return true;
            } else {
                usuarioLogueado = null; // No encontrado, limpiar usuarioLogueado
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            usuarioLogueado = null;
            return false;
        }
    }
}