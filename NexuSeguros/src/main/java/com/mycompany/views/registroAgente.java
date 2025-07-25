
package com.mycompany.views;

import clases.ConexionBD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class registroAgente extends javax.swing.JPanel {

    
    
    public registroAgente() {
        initComponents();

        regisAgen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                registrarAgente();
            }
        });
   

    }

 
  private void registrarAgente() {
    

    String tipo = jComboBox1.getSelectedItem().toString();
    String nombre = nomAgen.getText().trim();
    String telefono = teleAgen.getText().trim();
    String correo = correoAgen.getText().trim();
    String sucursalStr = sucurAgen.getText().trim();
    String usuario = userAgen.getText().trim();
    String contrasena = contraAgen.getText().trim();

    if (tipo.equals("Seleccionar ") || nombre.isEmpty() || telefono.isEmpty() ||
        correo.isEmpty() || sucursalStr.isEmpty() || usuario.isEmpty() || contrasena.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor completa todos los campos.");
        return;
    }

    // Validar que la sucursal sea número
    int sucursal;
    try {
        sucursal = Integer.parseInt(sucursalStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Sucursal debe ser un número entero.");
        return;
    }

    // Verificar usuario y correo duplicados
    if (ConexionBD.usuarioExiste(usuario)) {
        JOptionPane.showMessageDialog(this, "El usuario ya existe. Elige otro nombre de usuario.");
        return;
    }

    if (ConexionBD.correoExiste(correo)) {
        JOptionPane.showMessageDialog(this, "El correo ya está registrado. Usa uno diferente.");
        return;
    }

    // Insertar nuevo agente
String sql = "INSERT INTO usuarios (usuario, contrasena, tipo, nombre, telefono, correo, sucursal) VALUES (?, ?, ?, ?, ?, ?, ?)";

    try (Connection con = ConexionBD.conectar();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setString(1, usuario);
        ps.setString(2, contrasena);
        ps.setString(3, tipo.toLowerCase());
        ps.setString(4, nombre);
        ps.setString(5, telefono);
        ps.setString(6, correo);
        ps.setInt(7, sucursal);

        int rows = ps.executeUpdate();
        if (rows > 0) {
            JOptionPane.showMessageDialog(this, "Agente registrado exitosamente.");
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo registrar al agente.");
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al registrar: " + e.getMessage());
    }

  }
  private void limpiarCampos() {
    nomAgen.setText("");
    teleAgen.setText("");
    correoAgen.setText("");
    sucurAgen.setText("");
    userAgen.setText("");
    contraAgen.setText("");
    jComboBox1.setSelectedIndex(0); // Volver a "Seleccionar"
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
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(794, 518));

        jLabel3.setText("Nombre");

        jLabel4.setText("Telefono");

        jLabel5.setText("Correo");

        jLabel6.setText("Sucursal");

        jLabel7.setText("Usuario");

        jLabel8.setText("Contraseña");

        regisAgen.setText("Registrar ");

        jLabel9.setText("Tipo");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar ", "Agente" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nomAgen, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(teleAgen, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(correoAgen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(sucurAgen, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(contraAgen, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(userAgen, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(regisAgen)
                .addGap(279, 279, 279))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nomAgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(teleAgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(correoAgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sucurAgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(userAgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(contraAgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(regisAgen)
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contraAgen;
    private javax.swing.JTextField correoAgen;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nomAgen;
    private javax.swing.JButton regisAgen;
    private javax.swing.JTextField sucurAgen;
    private javax.swing.JTextField teleAgen;
    private javax.swing.JTextField userAgen;
    // End of variables declaration//GEN-END:variables
}
