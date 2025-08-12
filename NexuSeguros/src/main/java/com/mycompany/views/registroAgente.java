
package com.mycompany.views;

import clases.ConexionBD;
import clases.agente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class registroAgente extends javax.swing.JPanel {

    
    
    public registroAgente() {
        initComponents();


    }

 private boolean validarCamposConMensajes() {
    if (nomAgen.getText().isEmpty() ||
        apelliP.getText().isEmpty() ||
        apelliM.getText().isEmpty() ||
        gene.getText().isEmpty() ||
        teleAgen.getText().isEmpty() ||
        correoAgen.getText().isEmpty() ||
        sucurAgen.getText().isEmpty() ||
        userAgen.getText().isEmpty() ||
        contraAgen.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.", "Campos vacíos", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    if (!teleAgen.getText().matches("\\d{10}")) {
        JOptionPane.showMessageDialog(this, "El teléfono debe tener exactamente 10 números.", "Teléfono inválido", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Validación del correo electrónico
    String correo = correoAgen.getText();
    String regexCorreo = "^[\\w\\.-]+@[\\w\\.-]+\\.[a-zA-Z]{2,6}$";
    if (!correo.matches(regexCorreo)) {
        JOptionPane.showMessageDialog(this, "Por favor ingresa un correo electrónico válido.", "Correo inválido", JOptionPane.ERROR_MESSAGE);
        return false;
    }


    return true;
}
  private void registrarAgente() {
    String nombre = nomAgen.getText().trim();
    String apellidoPaterno = apelliP.getText().trim();
    String apellidoMaterno = apelliM.getText().trim();
    String genero = gene.getText().trim();
    String telefono = teleAgen.getText().trim();
    String correo = correoAgen.getText().trim();
    int idSucursal = Integer.parseInt(sucurAgen.getText().trim());
    String usuario = userAgen.getText().trim();
    String contrasena = contraAgen.getText().trim();


   agente a = new agente(nombre, apellidoPaterno, apellidoMaterno, telefono, genero, correo, idSucursal, contrasena, usuario);

// insertar
   boolean ok = ConexionBD.registrarAgente(a);
if (ok) {
    JOptionPane.showMessageDialog(this, "Agente registrado correctamente.");
    limpiarCampos();
} else {
    JOptionPane.showMessageDialog(this, "Error al registrar el agente.");
}

    
}

private void limpiarCampos() {
    nomAgen.setText("");
    apelliP.setText("");
    apelliM.setText("");
    teleAgen.setText("");
    correoAgen.setText("");
    sucurAgen.setText("");
    userAgen.setText("");
    contraAgen.setText("");
    gene.setText("");
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nomAgen = new javax.swing.JTextField();
        teleAgen = new javax.swing.JTextField();
        correoAgen = new javax.swing.JTextField();
        sucurAgen = new javax.swing.JTextField();
        contraAgen = new javax.swing.JTextField();
        userAgen = new javax.swing.JTextField();
        regisAgen = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        apelliP = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        apelliM = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        gene = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(794, 518));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Telefono:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Correo:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Sucursal:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Usuario:");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Contraseña:");

        nomAgen.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        teleAgen.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        correoAgen.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        sucurAgen.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        contraAgen.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        userAgen.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        regisAgen.setText("Registrar ");
        regisAgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisAgenActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Apellido paterno:");

        apelliP.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Apeliido Materno:");

        apelliM.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("Genero:");

        gene.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(458, 458, 458))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addGap(90, 90, 90)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(correoAgen, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(teleAgen, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sucurAgen, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userAgen, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contraAgen, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(apelliP, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomAgen, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apelliM, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gene, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(regisAgen)))
                .addGap(0, 202, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomAgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(apelliP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel11))
                    .addComponent(apelliM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gene, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teleAgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correoAgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sucurAgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(userAgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(contraAgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(regisAgen)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void regisAgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisAgenActionPerformed
        registrarAgente();
    }//GEN-LAST:event_regisAgenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apelliM;
    private javax.swing.JTextField apelliP;
    private javax.swing.JTextField contraAgen;
    private javax.swing.JTextField correoAgen;
    private javax.swing.JTextField gene;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nomAgen;
    private javax.swing.JButton regisAgen;
    private javax.swing.JTextField sucurAgen;
    private javax.swing.JTextField teleAgen;
    private javax.swing.JTextField userAgen;
    // End of variables declaration//GEN-END:variables
}
