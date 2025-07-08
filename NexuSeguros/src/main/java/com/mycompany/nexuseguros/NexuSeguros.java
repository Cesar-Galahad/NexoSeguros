package com.mycompany.nexuseguros;
import com.login.bienvenidaAC;


/**
 *
 * @author Uroboros
 */
public class NexuSeguros {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        javax.swing.SwingUtilities.invokeLater(() -> {
            // Reemplaza NombreDeTuJFrame por el nombre real del JFrame Form
            new bienvenidaAC().setVisible(true);
            //new login().setVisible(true); 
            //new dashboardAgente().setVisible(true);
            //new dashboardCliente().setVisible(true);
            
        });
    }
}
