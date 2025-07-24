
package com.mycompany.views;


public class inicioAgente extends javax.swing.JPanel {

    public inicioAgente() {
        initComponents();
    }
    private void mostrarTextoSeguro(String tipo) {
    switch (tipo) {
        case "auto":
            infoSeguros.setText("Seguro de Auto:\n\nDaños a terceros: Cubre daños a otros vehículos o personas en un accidente donde eres responsable.\n" +
                "\n" + "Daños materiales: Protege tu auto en choques, volcaduras o caída de objetos.\n" +
                "\n" + "Robo total o parcial: Cubre robo completo o de partes como espejos o estéreos.\n" +
                "\n" + "Responsabilidad civil: Obligatoria por ley; cubre daños a personas o bienes de terceros.\n" +
                "\n" + "Gastos médicos: Cubre atención médica a ocupantes tras un accidente.");
            break;
        case "robo":
            infoSeguros.setText("Seguro contra Robo:\n\nProtege tus bienes en caso de robo con violencia o allanamiento.\n"+
                "\n" + "Robo total: Indemnización si el auto es robado y no recuperado.\n" +
                "\n" + "Robo parcial: Cubre robo de partes como llantas o estéreos.\n" +
                "\n" + "Daños por intento: Repara daños por intentos de robo, como cristales rotos.\n" +
                "\n" + "Gastos derivados: Cubre traslado o trámites si el vehículo es recuperado.\n" +
                "\n" + "Asistencia legal: Apoyo jurídico para levantar denuncias.");
            break;
        case "vida":
            infoSeguros.setText("Seguro de Vida:\n\nOfrece protección financiera a tus seres queridos en caso de fallecimiento\n"+
                "\n" + "Fallecimiento: Entrega la suma asegurada a los beneficiarios si el titular fallece.\n" +
                "\n" + "Invalidez total: Indemnización si el asegurado queda incapacitado permanentemente.\n" +
                "\n" + "Enfermedades graves: Cubre gastos ante enfermedades como cáncer o infarto.\n" +
                "\n" + "Gastos funerarios: Apoyo económico para cubrir el funeral.\n" +
                "\n" + "Ahorro o inversión: Acumula fondos que puedes usar en el futuro.");
            break;
        case "incendio":
            infoSeguros.setText("Seguro contra Incendio:\n\nCubre daños estructurales y bienes debido a fuego accidental.\n"+
                "\n" + "Daños por fuego: Cubre incendios, explosiones o cortocircuitos.\n" +
                "\n" + "Pérdida del inmueble: Indemniza si se destruye total o parcialmente la propiedad.\n" +
                "\n" + "Contenido: Protege muebles, maquinaria y bienes dentro del inmueble.\n" +
                "\n" + "Demolición y escombros: Cubre limpieza y demolición tras el siniestro.\n" +
                "\n" + "Reconstrucción: Apoya en la reparación o reconstrucción del lugar.");
            break;
        default:
            infoSeguros.setText("Selecciona un tipo de seguro para ver la información.");
            break;
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SEGURO_DE_AUTO = new javax.swing.JButton();
        SEGURO_DE_ROBO = new javax.swing.JButton();
        SEGURO_DE_INCENDIO = new javax.swing.JButton();
        SEGURO_DE_VIDA = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoSeguros = new javax.swing.JTextPane();

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(685, 480));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(685, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SEGURO_DE_AUTO.setBackground(new java.awt.Color(51, 51, 51));
        SEGURO_DE_AUTO.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SEGURO_DE_AUTO.setForeground(new java.awt.Color(255, 255, 255));
        SEGURO_DE_AUTO.setText("SEGURO DE AUTO");
        SEGURO_DE_AUTO.setBorder(new javax.swing.border.MatteBorder(null));
        SEGURO_DE_AUTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEGURO_DE_AUTOActionPerformed(evt);
            }
        });
        jPanel1.add(SEGURO_DE_AUTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 160, 30));

        SEGURO_DE_ROBO.setBackground(new java.awt.Color(51, 51, 51));
        SEGURO_DE_ROBO.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SEGURO_DE_ROBO.setForeground(new java.awt.Color(255, 255, 255));
        SEGURO_DE_ROBO.setText("SEGURO DE ROBO");
        SEGURO_DE_ROBO.setBorder(new javax.swing.border.MatteBorder(null));
        SEGURO_DE_ROBO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEGURO_DE_ROBOActionPerformed(evt);
            }
        });
        jPanel1.add(SEGURO_DE_ROBO, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 160, 30));

        SEGURO_DE_INCENDIO.setBackground(new java.awt.Color(51, 51, 51));
        SEGURO_DE_INCENDIO.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SEGURO_DE_INCENDIO.setForeground(new java.awt.Color(255, 255, 255));
        SEGURO_DE_INCENDIO.setText("SEGURO DE INCENDIO");
        SEGURO_DE_INCENDIO.setBorder(new javax.swing.border.MatteBorder(null));
        SEGURO_DE_INCENDIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEGURO_DE_INCENDIOActionPerformed(evt);
            }
        });
        jPanel1.add(SEGURO_DE_INCENDIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 160, 30));

        SEGURO_DE_VIDA.setBackground(new java.awt.Color(51, 51, 51));
        SEGURO_DE_VIDA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SEGURO_DE_VIDA.setForeground(new java.awt.Color(255, 255, 255));
        SEGURO_DE_VIDA.setText("SEGURO DE VIDA");
        SEGURO_DE_VIDA.setBorder(new javax.swing.border.MatteBorder(null));
        SEGURO_DE_VIDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEGURO_DE_VIDAActionPerformed(evt);
            }
        });
        jPanel1.add(SEGURO_DE_VIDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seguro-incendio.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 110, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seguro-auto.gif"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, 110));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seguro-robo.gif"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 110, 110));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seguro-vida.gif"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, 110));

        infoSeguros.setEditable(false);
        infoSeguros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(infoSeguros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 280, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SEGURO_DE_AUTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEGURO_DE_AUTOActionPerformed
        mostrarTextoSeguro("auto");
  
        // TODO add your handling code here:
    }//GEN-LAST:event_SEGURO_DE_AUTOActionPerformed

    private void SEGURO_DE_ROBOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEGURO_DE_ROBOActionPerformed
        mostrarTextoSeguro("robo");
    }//GEN-LAST:event_SEGURO_DE_ROBOActionPerformed

    private void SEGURO_DE_VIDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEGURO_DE_VIDAActionPerformed
        mostrarTextoSeguro("vida");
    }//GEN-LAST:event_SEGURO_DE_VIDAActionPerformed

    private void SEGURO_DE_INCENDIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEGURO_DE_INCENDIOActionPerformed
        mostrarTextoSeguro("incendio");
    }//GEN-LAST:event_SEGURO_DE_INCENDIOActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SEGURO_DE_AUTO;
    private javax.swing.JButton SEGURO_DE_INCENDIO;
    private javax.swing.JButton SEGURO_DE_ROBO;
    private javax.swing.JButton SEGURO_DE_VIDA;
    private javax.swing.JTextPane infoSeguros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(inicioAgente aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
