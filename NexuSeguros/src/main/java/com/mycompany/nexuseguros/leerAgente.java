
package com.mycompany.nexuseguros;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class leerAgente extends javax.swing.JPanel {

    public leerAgente() {
        initComponents();
         cargarTodosLosAgentes();
         botonbuscar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            buscarAgentes();
        }
    });
    }
    
    private void cargarTodosLosAgentes() {
    String sql = "SELECT id_agente, nombre, telefono, correo, sucursal FROM usuarios";

    try (Connection con = clases.ConexionBD.conectar();
         PreparedStatement ps = con.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // limpiar tabla

        while (rs.next()) {
            
            System.out.println("Agente: " + rs.getString("nombre"));

            Object[] fila = {
                rs.getInt("id_agente"),
                rs.getString("nombre"),
                rs.getString("telefono"),
                rs.getString("correo"),
                rs.getInt("sucursal")
            };
            model.addRow(fila);
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al cargar agentes: " + e.getMessage());
    }
}
    
    
    
private void buscarAgentes() {
    String filtro = jComboBox1.getSelectedItem().toString();
    String valor = jTextField1.getText().trim();

    if (filtro.equals("Seleccionar") || valor.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Selecciona un filtro y escribe un valor para buscar.");
        return;
    }

    // Mapear filtro a nombre real de columna en base de datos
    String columna = switch (filtro) {
        case "ID" -> "id_agente";
        case "Nombre" -> "nombre";
        case "Telefono" -> "telefono";
        case "Correo" -> "correo";
        case "Sucursal" -> "sucursal";
        default -> "";
    };

    String sql = "SELECT id_agente, nombre, telefono, correo, sucursal FROM usuarios WHERE " + columna + " LIKE ?";

    try (Connection con = clases.ConexionBD.conectar();
         PreparedStatement ps = con.prepareStatement(sql)) {

        if (columna.equals("id_agente") || columna.equals("sucursal")) {
            ps.setString(1, valor); // Números exactos
        } else {
            ps.setString(1, "%" + valor + "%"); // Búsqueda parcial para texto
        }

        ResultSet rs = ps.executeQuery();

        // Limpiar tabla
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        while (rs.next()) {
            Object[] fila = {
                rs.getInt("id_agente"),
                rs.getString("nombre"),
                rs.getString("telefono"),
                rs.getString("correo"),
                rs.getInt("sucursal")
            };
            model.addRow(fila);
        }

    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al buscar: " + ex.getMessage());
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        botonbuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "ID", "Nombre", "Telefono", "Correo", "Sucursal" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        botonbuscar.setText("Buscar");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Telefono", "Correo", "Sucursal"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Agentes");

        jLabel2.setText("Filtro:");

        jLabel3.setText("Inserta dato del filtro:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(72, 72, 72)
                .addComponent(botonbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1)
                    .addComponent(jComboBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonbuscar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
