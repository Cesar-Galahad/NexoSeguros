
package com.mycompany.views;

import clases.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class borrarCliente extends javax.swing.JPanel {

   
    public borrarCliente() {
        initComponents();
        
    }
    
    private void buscarCliente() {
    String filtro = (String) jComboBox1.getSelectedItem();
    String valor = jTextField1.getText().trim();

    if (filtro.equals("Seleccionar") || valor.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Selecciona un filtro y escribe un valor.");
        return;
    }

    String columnaBD = switch (filtro) {
        case "Nombre" -> "nombre";
        case "Apellido P" -> "apellidoPaterno";
        case "Apellido M" -> "apellidoMaterno";
        case "Curp" -> "curp";
        default -> null;
    };

    if (columnaBD == null) return;

    String sql = "SELECT * FROM clientes WHERE " + columnaBD + " LIKE '%" + valor + "%'";
    DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
    modelo.setRowCount(0);

    try (Connection con = ConexionBD.conectar();
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {

        while (rs.next()) {
            modelo.addRow(new Object[]{
                rs.getString("nombre"),
                rs.getString("apellidoPaterno"),
                rs.getString("apellidoMaterno"),
                rs.getString("curp"),
                rs.getString("folio"),
                rs.getString("tipoSeguro"),
                rs.getString("cantidad"),
                rs.getString("vigencia"),
                rs.getString("resepcion")
            });
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al buscar: " + e.getMessage());
    }
}
    
   private void borrarCliente() {
    int fila = jTable1.getSelectedRow(); 

    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona un cliente en la tabla para borrar.");
        return;
    }

    
    String nombre = jTable1.getValueAt(fila, 0).toString();
    String apellidoP = jTable1.getValueAt(fila, 1).toString();
    String apellidoM = jTable1.getValueAt(fila, 2).toString();
    String curp = jTable1.getValueAt(fila, 3).toString(); 

    int confirmar = JOptionPane.showConfirmDialog(this,
        "¿Deseas borrar al cliente:\n" +
        nombre + " " + apellidoP + " " + apellidoM + "\nCURP: " + curp + "?",
        "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

    if (confirmar == JOptionPane.YES_OPTION) {
        String sql = "DELETE FROM clientes WHERE curp = ?";

        try (Connection con = ConexionBD.conectar();
             java.sql.PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, curp);
            int eliminado = ps.executeUpdate();

            if (eliminado > 0) {
                JOptionPane.showMessageDialog(this, "Cliente borrado correctamente.");
                buscarCliente(); 
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró cliente para borrar.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al borrar: " + e.getMessage());
        }
    }
}

    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        ButtonBuscar = new javax.swing.JButton();
        ButtonBorrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("borrar");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido P", "Apellido M", "Telefono", "Direccion", "Curp", "Rfc", "genero", "Tipo S", "Recepcion", "Vigencia", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Nombre", "Apellido P", "Apellido M", "Curp", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        ButtonBuscar.setText("Buscar");
        ButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarActionPerformed(evt);
            }
        });

        ButtonBorrar.setText("Borrar");
        ButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBorrarActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingresa Dato");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(ButtonBuscar)
                        .addGap(75, 75, 75)
                        .addComponent(ButtonBorrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(jLabel1))
                    .addComponent(jLabel2))
                .addContainerGap(74, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBuscar)
                    .addComponent(ButtonBorrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBorrarActionPerformed
      borrarCliente();
    }//GEN-LAST:event_ButtonBorrarActionPerformed

    private void ButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarActionPerformed
buscarCliente();

        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonBuscarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBorrar;
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
