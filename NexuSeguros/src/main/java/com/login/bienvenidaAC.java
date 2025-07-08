
package com.login;


import java.awt.Color;

public class bienvenidaAC extends javax.swing.JFrame {

    
    public bienvenidaAC() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonLoginCliente = new javax.swing.JButton();
        botonLoginAgente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(34, 34, 34));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo modificado.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 200, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo_Bienvenida.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bienvenido, soy...");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 66, -1, -1));

        botonLoginCliente.setBackground(new java.awt.Color(34, 34, 34));
        botonLoginCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonLoginCliente.setForeground(new java.awt.Color(255, 255, 255));
        botonLoginCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perfil.png"))); // NOI18N
        botonLoginCliente.setText("Soy cliente");
        botonLoginCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        botonLoginCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLoginCliente.setIconTextGap(10);
        botonLoginCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonLoginClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonLoginClienteMouseExited(evt);
            }
        });
        botonLoginCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLoginClienteActionPerformed(evt);
            }
        });
        jPanel1.add(botonLoginCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 353, 54));

        botonLoginAgente.setBackground(new java.awt.Color(34, 34, 34));
        botonLoginAgente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonLoginAgente.setForeground(new java.awt.Color(255, 255, 255));
        botonLoginAgente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agente.png"))); // NOI18N
        botonLoginAgente.setText("Soy Agente");
        botonLoginAgente.setToolTipText("");
        botonLoginAgente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        botonLoginAgente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLoginAgente.setIconTextGap(10);
        botonLoginAgente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonLoginAgenteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonLoginAgenteMouseExited(evt);
            }
        });
        botonLoginAgente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLoginAgenteActionPerformed(evt);
            }
        });
        jPanel1.add(botonLoginAgente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 353, 54));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonLoginAgenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLoginAgenteActionPerformed
      login lA = new login("agente");
    lA.setVisible(true);
    this.dispose();

    }//GEN-LAST:event_botonLoginAgenteActionPerformed

    private void botonLoginClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLoginClienteActionPerformed
        login lC = new login("cliente");
    lC.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_botonLoginClienteActionPerformed

    private void botonLoginAgenteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLoginAgenteMouseEntered
        botonLoginAgente.setBackground(new Color(64,64,64));
    }//GEN-LAST:event_botonLoginAgenteMouseEntered

    private void botonLoginClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLoginClienteMouseEntered
        botonLoginCliente.setBackground(new Color(64,64,64));
    }//GEN-LAST:event_botonLoginClienteMouseEntered

    private void botonLoginAgenteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLoginAgenteMouseExited
        botonLoginAgente.setBackground(new Color(34,34,34));
    }//GEN-LAST:event_botonLoginAgenteMouseExited

    private void botonLoginClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLoginClienteMouseExited
        botonLoginCliente.setBackground(new Color(34,34,34));
    }//GEN-LAST:event_botonLoginClienteMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bienvenidaAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bienvenidaAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bienvenidaAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bienvenidaAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bienvenidaAC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonLoginAgente;
    private javax.swing.JButton botonLoginCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
