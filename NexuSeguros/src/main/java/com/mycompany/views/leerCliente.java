package com.mycompany.views;

import clases.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class leerCliente extends javax.swing.JPanel {
    
    public leerCliente() {
        initComponents();
        cargarClientesEnTabla();
    }
    
    private void buscarCliente() {
    String filtro = (String) jComboBox1.getSelectedItem();
    String valor = jTextField1.getText().trim();

    if (filtro.equals("Selecciona") || valor.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Selecciona un campo y escribe un valor para buscar.");
        return;
    }

    String columnaBD = switch (filtro) {
        case "Nombre" -> "nombre";
        case "Apellido P" -> "apellidoPaterno";
        case "Apellido M" -> "apellidoMaterno";
        case "Crup" -> "curp";
        case "Folio " -> "folio";
        case "Tipo S" -> "tipoSeguro";
        case "Cantidad" -> "cantidad";
        case "Vigencia" -> "vigencia";
        case "Recpcion" -> "recepcion";
        default -> null;
    };

    if (columnaBD == null) return;

    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellido P");
    modelo.addColumn("Apellido M");
    modelo.addColumn("CURP");
    modelo.addColumn("Tipo de Seguro");
    modelo.addColumn("Cantidad");
    modelo.addColumn("Vigencia");
    modelo.addColumn("Recepción");

    String sql = "SELECT nombre, apellidoPaterno, apellidoMaterno, curp, tipoSeguro, cantidad, vigencia, recepcion FROM clientes WHERE " + columnaBD + " LIKE '%" + valor + "%'";

    try (Connection con = ConexionBD.conectar();
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {

        while (rs.next()) {
            modelo.addRow(new Object[]{
                rs.getString("nombre"),
                rs.getString("apellidoPaterno"),
                rs.getString("apellidoMaterno"),
                rs.getString("curp"),
                rs.getString("tipoSeguro"),
                rs.getString("cantidad"),
                rs.getString("vigencia"),
                rs.getString("recepcion")
            });
        }

        jTable1.setModel(modelo);

    } catch (SQLException e) {
        
    }
}

    
    
    
private void cargarClientesEnTabla() {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellido P");
    modelo.addColumn("Apellido M");
    modelo.addColumn("CURP");
    modelo.addColumn("Tipo de Seguro");
     modelo.addColumn("cantidad");
    modelo.addColumn("Vigencia");
    modelo.addColumn("Recepción");

    try (Connection con = ConexionBD.conectar()) {
       String sql = "SELECT nombre, apellidoPaterno, apellidoMaterno, curp, tipoSeguro, cantidad, vigencia, resepcion FROM clientes";

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            modelo.addRow(new Object[]{
                rs.getString("nombre"),
                rs.getString("apellidoPaterno"),
                rs.getString("apellidoMaterno"),
                rs.getString("curp"),
                rs.getString("tipoSeguro"),
                 rs.getString("cantidad"),
                rs.getString("vigencia"),
                rs.getString("resepcion")
            });
        }

        jTable1.setModel(modelo);

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al cargar los clientes: " + e.getMessage());
    }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setForeground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Filtrar");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Nombre", "Apellido P", "Apellido M", "Crup", "Folio ", "Tipo S", "Cantidad", "Vigencia", "Recpcion" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton1.setText("Buscar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese CURP");

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "", "", "", "", "", null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido P", "Apellido M", "Curp", "Folio", "Tipo S", "Cantidad", "Vigencia", "Recepcion"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel1)))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(jButton1))
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
  buscarCliente();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
