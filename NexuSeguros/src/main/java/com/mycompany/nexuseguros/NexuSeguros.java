package com.mycompany.nexuseguros;
//import com.login.bienvenidaAC;
import com.login.login;


/**
 *
 * @author Uroboros
 */
public class NexuSeguros {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            // Reemplaza NombreDeTuJFrame por el nombre real del JFrame Form
            //new bienvenidaAC().setVisible(true);
            new login().setVisible(true); 
            //new dashboardAgente().setVisible(true);
            //new dashboardCliente().setVisible(true);
            
        });
    }
}
