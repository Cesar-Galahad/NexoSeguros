
package clases;

import java.util.ArrayList;


public class AgenteDatos {
    
     public static ArrayList<agente> agentes = new ArrayList<>();

    static {
        agentes.add(new agente(1, "Edwin Abraham", "edwinlunamartinez@gmail.com", "1234", 5.5, 101));
        agentes.add(new agente(2, "Secar", "secar@gmail.com", "1526", 6.0, 102));
        
    }

    public static agente buscarAgente(String correo, String contrasena) {
        for (agente a : agentes) {
            if (a.getCorreo().equalsIgnoreCase(correo) && a.getContrasena().equals(contrasena)) {
                return a;
            }
        }
        return null;
    }
    
}
