package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {

    public static Usuario validarLogin(String usuario, String contrasena) {
    String sql = "SELECT * FROM usuarios WHERE usuario = ? AND contrasena = ?";
    
    try (Connection con = ConexionBD.conectar();
         PreparedStatement ps = con.prepareStatement(sql)) {
        
        ps.setString(1, usuario);
        ps.setString(2, contrasena);

        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            Usuario usuarioLogueado = new Usuario();
            usuarioLogueado.setId(rs.getInt("id_Agente"));
            usuarioLogueado.setUsuario(rs.getString("usuario"));
            usuarioLogueado.setContrasena(rs.getString("contrasena"));
            usuarioLogueado.setNombre(rs.getString("nombre"));
            usuarioLogueado.setTelefono(rs.getString("telefono"));
            usuarioLogueado.setCorreo(rs.getString("correo"));
            usuarioLogueado.setTipo(rs.getString("tipo"));
            usuarioLogueado.setSucursal(rs.getString("sucursal"));
            return usuarioLogueado;
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    return null;
}

}
