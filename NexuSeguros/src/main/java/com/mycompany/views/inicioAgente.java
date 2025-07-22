
package com.mycompany.views;


public class inicioAgente extends javax.swing.JPanel {

    public inicioAgente() {
        initComponents();
        SeguroDeAuto.setVisible(false);
    SeguroDeRobo.setVisible(false);
    SeguroDeVida.setVisible(false);
    SeguroDeIncendio.setVisible(false);
 
    }
    private void ocultarTodosLosTextArea() {
    SeguroDeAuto.setVisible(false);
    SeguroDeRobo.setVisible(false);
    SeguroDeVida.setVisible(false);
    SeguroDeIncendio.setVisible(false);
}
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        SeguroDeAuto = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        SeguroDeRobo = new javax.swing.JTextArea();
        SEGURO_DE_AUTO = new javax.swing.JButton();
        SEGURO_DE_ROBO = new javax.swing.JButton();
        SEGURO_DE_INCENDIO = new javax.swing.JButton();
        SEGURO_DE_VIDA = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        SeguroDeVida = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        SeguroDeIncendio = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        SeguroDeAuto1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(685, 480));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(685, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SeguroDeAuto.setColumns(20);
        SeguroDeAuto.setRows(5);
        SeguroDeAuto.setText("                                     Seguro de auto\n\n1- Daños a terceros\nCubre los daños materiales y lesiones corporales que \npuedas causar a otras personas o vehículos en un accidente \ndonde tú eres responsable\n\n2- Daños materiales al vehículo asegurado\nProtege tu auto contra daños ocasionados por\naccidentes, volcaduras, choques, caída de objetos, entre otros\n\n3- Robo total o parcial\nCubre el robo del vehículo completo o de partes\n específicas, como espejos, rines o estéreos, \ndependiendo del tipo de cobertura.\n\n4- Responsabilidad civil\nAmpara el pago de daños a terceros por lesiones,\n muerte o afectaciones a sus bienes. Este es obligatorio\n por ley en muchos países\n\n5- Gastos médicos ocupantes\nCubre los gastos médicos de los ocupantes del vehículo\n asegurado en caso de accidente, incluyendo hospitalización,\n medicamentos y atención médica.\n\n");
        SeguroDeAuto.setBorder(null);
        jScrollPane2.setViewportView(SeguroDeAuto);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 340, 460));

        SeguroDeRobo.setColumns(20);
        SeguroDeRobo.setRows(5);
        SeguroDeRobo.setText("                                        Seguro de robo\n\n1- Robo total del vehículo\nCubre el valor del automóvil en caso de que sea sustraído\ny no sea recuperado. La aseguradora indemniza al asegurado\ncon base en el valor comercial o convenido del vehículo.\n\n2- Robo parcial\nAlgunas pólizas incluyen robo de partes o accesorios del\nvehículo,  como llantas, espejos, estéreos, computadoras, \nentre otros.\n\n3- Daños por intento de robo\nSi el vehículo no fue robado, pero sufrió daños por intento \nde robo (como cristales rotos, cerraduras forzadas o cableado\n dañado), el seguro puede cubrir la reparación.\n\n4- Gastos derivados del robo\nAlgunas aseguradoras cubren gastos como el traslado \ndel vehículo si es recuperado o la gestoría para el\n trámite de baja ante autoridades.\n\n5- Asistencia legal y orientación\nEn muchos casos, el seguro también ofrece asesoría\njurídica para levantar la denuncia ante el Ministerio\nPúblico y llevar el proceso legal correspondiente.");
        SeguroDeRobo.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane1.setViewportView(SeguroDeRobo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 340, 460));

        SEGURO_DE_AUTO.setBackground(new java.awt.Color(51, 51, 51));
        SEGURO_DE_AUTO.setForeground(new java.awt.Color(255, 255, 255));
        SEGURO_DE_AUTO.setText("SEGURO DE AUTO");
        SEGURO_DE_AUTO.setBorder(new javax.swing.border.MatteBorder(null));
        SEGURO_DE_AUTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEGURO_DE_AUTOActionPerformed(evt);
            }
        });
        jPanel1.add(SEGURO_DE_AUTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 140, 30));

        SEGURO_DE_ROBO.setBackground(new java.awt.Color(51, 51, 51));
        SEGURO_DE_ROBO.setForeground(new java.awt.Color(255, 255, 255));
        SEGURO_DE_ROBO.setText("SEGURO DE ROBO");
        SEGURO_DE_ROBO.setBorder(new javax.swing.border.MatteBorder(null));
        SEGURO_DE_ROBO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEGURO_DE_ROBOActionPerformed(evt);
            }
        });
        jPanel1.add(SEGURO_DE_ROBO, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 140, 30));

        SEGURO_DE_INCENDIO.setBackground(new java.awt.Color(51, 51, 51));
        SEGURO_DE_INCENDIO.setForeground(new java.awt.Color(255, 255, 255));
        SEGURO_DE_INCENDIO.setText("SEGURO DE INCENDIO");
        SEGURO_DE_INCENDIO.setBorder(new javax.swing.border.MatteBorder(null));
        SEGURO_DE_INCENDIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEGURO_DE_INCENDIOActionPerformed(evt);
            }
        });
        jPanel1.add(SEGURO_DE_INCENDIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 140, 30));

        SEGURO_DE_VIDA.setBackground(new java.awt.Color(51, 51, 51));
        SEGURO_DE_VIDA.setForeground(new java.awt.Color(255, 255, 255));
        SEGURO_DE_VIDA.setText("SEGURO DE VIDA");
        SEGURO_DE_VIDA.setBorder(new javax.swing.border.MatteBorder(null));
        SEGURO_DE_VIDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEGURO_DE_VIDAActionPerformed(evt);
            }
        });
        jPanel1.add(SEGURO_DE_VIDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 140, 30));

        SeguroDeVida.setColumns(20);
        SeguroDeVida.setRows(5);
        SeguroDeVida.setText("                                  Seguro de vida\n\n1- Fallecimiento del asegurado\nEs la cobertura principal. En caso de que el asegurado fallezca,\nla aseguradora paga la suma asegurada a los\nbeneficiarios designados.\n\n2- Invalidez total y permanente\nSi el asegurado sufre una discapacidad que le impida\nseguir trabajando, puede recibir el pago total \no parcial de la suma asegurada.\n\n3- Enfermedades graves\nAlgunas pólizas cubren enfermedades como cáncer, \ninfarto o accidente cerebrovascular, brindando \nun adelanto del capital asegurado para cubrir gastos médicos.\n\n4- Gastos funerarios\nAlgunas aseguradoras ofrecen cobertura para cubrir los costos\n del funeral, ya sea como reembolso o servicio directo.\n\n5- Ahorro o inversión (en seguros de vida con componente\nfinanciero)En pólizas de vida con ahorro, parte de las primas\nse destinan a generar un fondo que el asegurado puede\nretirar en el futuro o usar como complemento para su retiro.\n");
        SeguroDeVida.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane3.setViewportView(SeguroDeVida);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 340, 460));

        SeguroDeIncendio.setColumns(20);
        SeguroDeIncendio.setRows(5);
        SeguroDeIncendio.setText("                                      Seguro de incendio\n\n1- Daños por incendio o explosión\nCubre los daños materiales causados directamente por fuego,\nexplosión de gas, cortocircuitos o combustión accidental.\n\n2- Pérdida total o parcial del inmueble\nEn caso de que el incendio destruya total o parcialmente\nla propiedad asegurada, la aseguradora indemniza\nal propietario según el valor estipulado en la póliza.\n\n3- Contenido del inmueble\nProtege muebles, electrodomésticos, maquinaria, \nmercancías u otros bienes dentro del inmueble \nasegurado al momento del siniestro.\n\n4- Gastos de demolición y remoción de escombros\nCubre los costos necesarios para demoler estructuras\ndañadas y retirar restos del incendio.\n\n5- Gastos de reconstrucción o reparación\nLa aseguradora puede cubrir parcial o totalmente los\ncostos para restaurar la propiedad a su estado original.\n\n");
        SeguroDeIncendio.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane4.setViewportView(SeguroDeIncendio);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 340, 460));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seguro-incendio.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 110, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seguro-auto.gif"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, 110));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seguro-robo.gif"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 110, 110));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seguro-vida.gif"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, 110));

        SeguroDeAuto1.setColumns(20);
        SeguroDeAuto1.setRows(5);
        SeguroDeAuto1.setBorder(null);
        jScrollPane5.setViewportView(SeguroDeAuto1);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 20, 340, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SEGURO_DE_AUTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEGURO_DE_AUTOActionPerformed

        ocultarTodosLosTextArea();
    SeguroDeAuto.setVisible(true);
  
        // TODO add your handling code here:
    }//GEN-LAST:event_SEGURO_DE_AUTOActionPerformed

    private void SEGURO_DE_ROBOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEGURO_DE_ROBOActionPerformed

        ocultarTodosLosTextArea();
    SeguroDeRobo.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_SEGURO_DE_ROBOActionPerformed

    private void SEGURO_DE_VIDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEGURO_DE_VIDAActionPerformed

        ocultarTodosLosTextArea();
SeguroDeVida.setVisible(true);    
        // TODO add your handling code here:
    }//GEN-LAST:event_SEGURO_DE_VIDAActionPerformed

    private void SEGURO_DE_INCENDIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEGURO_DE_INCENDIOActionPerformed

        ocultarTodosLosTextArea();
SeguroDeIncendio.setVisible(true);    
        // TODO add your handling code here:
    }//GEN-LAST:event_SEGURO_DE_INCENDIOActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SEGURO_DE_AUTO;
    private javax.swing.JButton SEGURO_DE_INCENDIO;
    private javax.swing.JButton SEGURO_DE_ROBO;
    private javax.swing.JButton SEGURO_DE_VIDA;
    private javax.swing.JTextArea SeguroDeAuto;
    private javax.swing.JTextArea SeguroDeAuto1;
    private javax.swing.JTextArea SeguroDeIncendio;
    private javax.swing.JTextArea SeguroDeRobo;
    private javax.swing.JTextArea SeguroDeVida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(inicioAgente aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
