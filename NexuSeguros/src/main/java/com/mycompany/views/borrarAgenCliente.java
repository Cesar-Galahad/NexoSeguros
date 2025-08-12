
package com.mycompany.views;

import com.mycompany.nexuseguros.*;
import clases.ConexionBD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class borrarAgenCliente extends javax.swing.JPanel {

    public borrarAgenCliente() {
        initComponents();
        
         botonBorrar1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    });
          
          botonBorrar2.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        //buscarCliente();
    }
});

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

    String sql = "SELECT id_agente, nombre, telefono, genero, correo, id_sucursal FROM agentes WHERE " + columna + " LIKE ?";

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
                rs.getString("genero"),
                rs.getString("correo"),
                rs.getInt("id_sucursal")
            };
            model.addRow(fila);
        }

    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al buscar: " + ex.getMessage());
    }
}
private void buscarCliente() {
    String filtro = (String) jComboBox2.getSelectedItem();
    String valor = jTextField2.getText().trim();

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

String sql = "SELECT * FROM Cliente WHERE " + columnaBD + " LIKE '%" + valor + "%'";
    DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
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
    
  public void borrarCliente() {
    int fila = jTable2.getSelectedRow();

    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona un cliente en la tabla para eliminar.", "Sin selección", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Obtener ID del cliente desde la columna 0
    int idCliente = Integer.parseInt(jTable2.getValueAt(fila, 0).toString());

    int confirmacion = JOptionPane.showConfirmDialog(this,
            "¿Estás seguro de que deseas eliminar este cliente?",
            "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

    if (confirmacion == JOptionPane.YES_OPTION) {
        String sql = "DELETE FROM Cliente WHERE id_cliente = ?";

        try (Connection con = ConexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idCliente);
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(this, "Cliente eliminado correctamente.");
                buscarCliente(); // Actualizar tabla
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar el cliente.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar cliente: " + e.getMessage());
        }
    }
}
    public void borrarAgentes() {
    int fila = jTable1.getSelectedRow();

    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona un agente en la tabla para eliminar.", "Sin selección", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Obtener ID del cliente desde la columna 0
    int idCliente = Integer.parseInt(jTable1.getValueAt(fila, 0).toString());

    int confirmacion = JOptionPane.showConfirmDialog(this,
            "¿Estás seguro de que deseas eliminar este agente?",
            "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

    if (confirmacion == JOptionPane.YES_OPTION) {
        String sql = "DELETE FROM agentes WHERE id_agente = ?";

        try (Connection con = ConexionBD.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idCliente);
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(this, "Agente eliminado correctamente.");
                buscarAgentes(); // Actualizar tabla
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar el agente.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar agente: " + e.getMessage());
        }
    }
}
    





    

    
    



  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        botonBorrar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        botonBorrar2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonbuscar1 = new javax.swing.JButton();
        botonbuscar3 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "ID", "Nombre", "Telefono", "Correo", "Sucursal" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        botonBorrar1.setText("Buscar");
        botonBorrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrar1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Telefono", "Genero", "Correo", "Sucursal"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Agentes");

        jLabel2.setText("Filtro:");

        jLabel3.setText("Inserta dato del filtro:");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido P", "Apelldio M", "Telefono", "Direccion", "Curp", "Rfc", "genero", "Tipo S", "Recepcion", "Vigencia", "Cantidad"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "ID", "Nombre", "Apellido P", "Aprellido M", "Direccion", "Curp", "Rfc", "genero", "Tipo S", "Recepcion", "Vigencia", "Cantidad" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        botonBorrar2.setText("Buscar");
        botonBorrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrar2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Inserta dato del filtro:");

        jLabel5.setText("Clientes");

        botonbuscar1.setText("Borrar");
        botonbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscar1ActionPerformed(evt);
            }
        });

        botonbuscar3.setText("Borrar");
        botonbuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonBorrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(botonBorrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(botonbuscar3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1)
                    .addComponent(botonBorrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2)
                            .addComponent(botonBorrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonbuscar3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void botonBorrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrar1ActionPerformed
        buscarAgentes();
    }//GEN-LAST:event_botonBorrar1ActionPerformed

    private void botonbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscar1ActionPerformed
        borrarAgentes();
    }//GEN-LAST:event_botonbuscar1ActionPerformed

    private void botonbuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscar3ActionPerformed
        borrarCliente();
    }//GEN-LAST:event_botonbuscar3ActionPerformed

    private void botonBorrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrar2ActionPerformed
        String filtro = (String) jComboBox2.getSelectedItem();
    String valor = jTextField2.getText().trim();

    if (filtro.equals("Seleccionar") || valor.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Selecciona un filtro y escribe un valor");
        return;
    }

    String columnaBD = switch (filtro) {
        case "Nombre" -> "nombre";
        case "Apellido P" -> "apellido_paterno";
        case "Apellido M" -> "apellido_materno";
        case "Curp" -> "curp";
        default -> null;
    };

    if (columnaBD == null) return;

    DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
    modelo.setRowCount(0); // Limpiar tabla

    String sql;

    try (Connection con = ConexionBD.conectar()) {
        PreparedStatement ps;

        // Buscar exacto si es CURP, de lo contrario usar LIKE
        if (columnaBD.equals("curp")) {
            sql = "SELECT * FROM Cliente WHERE TRIM(curp) = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, valor);
        } else {
            sql = "SELECT * FROM Cliente WHERE TRIM(" + columnaBD + ") LIKE ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + valor + "%");
        }

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            modelo.addRow(new Object[]{
                rs.getInt("id_cliente"),
                rs.getString("nombre"),
                rs.getString("apellido_paterno"),
                rs.getString("apellido_materno"),
                rs.getString("telefono"),
                rs.getString("direccion"),
                rs.getString("curp"),
                rs.getString("rfc"),
                rs.getString("genero"),
                rs.getString("tipoSeguro"),
                rs.getString("recepcion"),
                rs.getString("vigencia"),
                rs.getString("cantidad")
            });
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al buscar cliente: " + e.getMessage());
    }
    }//GEN-LAST:event_botonBorrar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrar1;
    private javax.swing.JButton botonBorrar2;
    private javax.swing.JButton botonbuscar1;
    private javax.swing.JButton botonbuscar3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
