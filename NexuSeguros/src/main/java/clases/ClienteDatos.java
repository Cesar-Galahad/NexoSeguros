
package clases;

import java.util.ArrayList;
public class ClienteDatos {
    
    public static ArrayList<Cliente> clientes = new ArrayList<>();


    static {
        clientes.add(new Cliente(1, "Paul", "Hernández", "Garza", "5551234567", "Calle Falsa 123",
                "CURP123456", "RFC123456", "Masculino", "paulhernandez@gmail.com", "1234"));
        clientes.add(new Cliente(2, "Saul", "Gonzalez", "Bautista", "5559876543", "Av. Reforma 45",
                "CURP654321", "RFC654321", "Masculino", "saul@gmail.com", "85654"));
         clientes.add(new Cliente(2, "Oscar", "Rodriguez", "Rangel", "5559876543", "Av. Reforma 45",    
                "CURP6549746", "RFC654321", "Masculino", "oscar@gmail.com", "8412683"));
    }

    public static Cliente buscarCliente(String correo, String contrasena) {
        for (Cliente c : clientes) {
            if (c.getCorreo().equalsIgnoreCase(correo) && c.getContrasena().equals(contrasena)) {
                return c;
            }
        }
        return null;
    }
}
