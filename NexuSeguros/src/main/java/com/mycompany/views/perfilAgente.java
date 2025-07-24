
package com.mycompany.views;

import clases.Usuario;




public class perfilAgente extends javax.swing.JPanel {

  
    public perfilAgente() {
        initComponents();
        
    }

  public perfilAgente(Usuario usuario) {
        initComponents();
        if(usuario != null) {
            nomAgente.setText(usuario.getNombre());
            teleonoAgente.setText(usuario.getTelefono());
            usuAgente.setText(usuario.getUsuario());
            correoAgente.setText(usuario.getCorreo());
            idAgente.setText(String.valueOf(usuario.getId()));
            Sucursal.setText(usuario.getSucursal());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        fondoagente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        teleonoAgente = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        nomAgente = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        usuAgente = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        correoAgente = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        idAgente = new javax.swing.JTextArea();
        sucursalAgente = new javax.swing.JScrollPane();
        Sucursal = new javax.swing.JTextArea();

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        fondoagente.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario-piloto.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Telefono:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Usuario:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Correo:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("ID:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Sucursal:");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        teleonoAgente.setEditable(false);
        teleonoAgente.setBackground(new java.awt.Color(204, 204, 204));
        teleonoAgente.setColumns(20);
        teleonoAgente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        teleonoAgente.setRows(5);
        teleonoAgente.setBorder(null);
        jScrollPane1.setViewportView(teleonoAgente);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        nomAgente.setEditable(false);
        nomAgente.setBackground(new java.awt.Color(204, 204, 204));
        nomAgente.setColumns(20);
        nomAgente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomAgente.setRows(5);
        nomAgente.setBorder(null);
        jScrollPane2.setViewportView(nomAgente);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        usuAgente.setEditable(false);
        usuAgente.setBackground(new java.awt.Color(204, 204, 204));
        usuAgente.setColumns(20);
        usuAgente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usuAgente.setRows(5);
        usuAgente.setBorder(null);
        jScrollPane3.setViewportView(usuAgente);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        correoAgente.setEditable(false);
        correoAgente.setBackground(new java.awt.Color(204, 204, 204));
        correoAgente.setColumns(20);
        correoAgente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        correoAgente.setRows(5);
        correoAgente.setBorder(null);
        jScrollPane4.setViewportView(correoAgente);

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        idAgente.setEditable(false);
        idAgente.setBackground(new java.awt.Color(204, 204, 204));
        idAgente.setColumns(20);
        idAgente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idAgente.setRows(5);
        idAgente.setBorder(null);
        jScrollPane6.setViewportView(idAgente);

        sucursalAgente.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        sucursalAgente.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Sucursal.setEditable(false);
        Sucursal.setBackground(new java.awt.Color(204, 204, 204));
        Sucursal.setColumns(20);
        Sucursal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Sucursal.setRows(5);
        Sucursal.setBorder(null);
        sucursalAgente.setViewportView(Sucursal);

        javax.swing.GroupLayout fondoagenteLayout = new javax.swing.GroupLayout(fondoagente);
        fondoagente.setLayout(fondoagenteLayout);
        fondoagenteLayout.setHorizontalGroup(
            fondoagenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoagenteLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addGroup(fondoagenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(fondoagenteLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sucursalAgente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoagenteLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoagenteLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoagenteLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoagenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(fondoagenteLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(30, 30, 30)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(fondoagenteLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(32, 32, 32)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        fondoagenteLayout.setVerticalGroup(
            fondoagenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoagenteLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(fondoagenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fondoagenteLayout.createSequentialGroup()
                        .addGroup(fondoagenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoagenteLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel2))
                            .addGroup(fondoagenteLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(fondoagenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(fondoagenteLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fondoagenteLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel6))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fondoagenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(sucursalAgente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 151, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoagente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoagente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Sucursal;
    private javax.swing.JTextArea correoAgente;
    private javax.swing.JPanel fondoagente;
    private javax.swing.JTextArea idAgente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea nomAgente;
    private javax.swing.JScrollPane sucursalAgente;
    private javax.swing.JTextArea teleonoAgente;
    private javax.swing.JTextArea usuAgente;
    // End of variables declaration//GEN-END:variables
}
