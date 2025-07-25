package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {

    public static Usuario validarLogin(String usuario, String contrasena) {
        String sqlUsuarios = "SELECT * FROM usuarios WHERE usuario = ? AND contrasena = ?";
        String sqlClientes = "SELECT * FROM Cliente WHERE usuarioCliente = ? AND contrasena = ?";
        String sqlGerente = "SELECT * FROM Gerente WHERE usuarioGerente = ? AND contrasena = ?";

        try (Connection con = ConexionBD.conectar()) {
            
            try (PreparedStatement ps = con.prepareStatement(sqlUsuarios)) {
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
            }

            
            try (PreparedStatement ps2 = con.prepareStatement(sqlClientes)) {
                ps2.setString(1, usuario);
                ps2.setString(2, contrasena);
                ResultSet rs2 = ps2.executeQuery();

                if (rs2.next()) {
                    Usuario clienteLogueado = new Usuario();
                    clienteLogueado.setId(rs2.getInt("id_cliente")); 
                    clienteLogueado.setUsuario(rs2.getString("usuarioCliente"));
                    clienteLogueado.setContrasena(rs2.getString("contrasena"));
                    clienteLogueado.setNombre(rs2.getString("nombre"));
                    clienteLogueado.setTelefono(rs2.getString("telefono"));
                    clienteLogueado.setCorreo(""); 
                    clienteLogueado.setTipo("cliente"); 
                    clienteLogueado.setSucursal(""); 
                    return clienteLogueado;
                }
            }

          
            try (PreparedStatement ps3 = con.prepareStatement(sqlGerente)) {
                ps3.setString(1, usuario);
                ps3.setString(2, contrasena);
                ResultSet rs3 = ps3.executeQuery();

                if (rs3.next()) {
                    Usuario gerenteLogueado = new Usuario();
                    gerenteLogueado.setId(rs3.getInt("id_gerente"));
                    gerenteLogueado.setUsuario(rs3.getString("usuarioGerente"));
                    gerenteLogueado.setContrasena(rs3.getString("contrasena"));
                    gerenteLogueado.setNombre(rs3.getString("nombre"));
                    gerenteLogueado.setTelefono(""); 
                    gerenteLogueado.setCorreo(rs3.getString("correo"));
                    gerenteLogueado.setTipo("admin"); 
                    gerenteLogueado.setSucursal(rs3.getString("id_sucursal"));
                    return gerenteLogueado;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
