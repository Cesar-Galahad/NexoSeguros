package com.mycompany.views;
import clases.Cliente;
import clases.ConexionBD;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

public class registrodeCliente extends javax.swing.JPanel {
  
   
    private boolean mensajeMostrado = false;
    
    public registrodeCliente() {
        initComponents();
        aplicarFiltroSoloLetrasConAlerta(nombreIN);
        aplicarFiltroSoloLetrasConAlerta(apellidoPIN);
        aplicarFiltroSoloLetrasConAlerta(apellidoMIN);
        aplicarFiltroSoloLetrasConAlerta(generoIN);
        aplicarFiltroTelefono(telefonoIN);
        aplicarFiltroFecha(jTextField1);
        aplicarFiltroFecha(jTextField9);
        aplicarFiltroNumerosYComas(jTextField8);
        
    }
    
    private void aplicarFiltroSoloLetrasConAlerta(javax.swing.JTextField campo) {
        campo.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
                    evt.consume();
                    if (!mensajeMostrado) {
                        JOptionPane.showMessageDialog(null, "Solo se permiten letras");
                        mensajeMostrado = true;
                    }
                } else {
                    mensajeMostrado = false;
                }
            }
        });
    }

        private void aplicarFiltroTelefono(javax.swing.JTextField campo) {
    campo.addKeyListener(new java.awt.event.KeyAdapter() {
        @Override
        public void keyTyped(java.awt.event.KeyEvent evt) {
            char c = evt.getKeyChar();

            // Solo permitir números
            if (!Character.isDigit(c)) {
                evt.consume();
                return;
            }

            // Limitar a 10 caracteres
            if (campo.getText().length() >= 10) {
                evt.consume();
            }
        }
    });
}

    private void aplicarFiltroFecha(javax.swing.JTextField campo) {
    campo.addKeyListener(new java.awt.event.KeyAdapter() {
        @Override
        public void keyTyped(java.awt.event.KeyEvent evt) {
            char c = evt.getKeyChar();
            String texto = campo.getText();

          
            if (!Character.isDigit(c) && c != '/') {
                evt.consume();
                return;
            }

           
            if (texto.length() >= 10) {
                evt.consume();
            }
        }
    });
}

  private void aplicarFiltroNumerosYComas(javax.swing.JTextField campo) {
    campo.addKeyListener(new java.awt.event.KeyAdapter() {
        @Override
        public void keyTyped(java.awt.event.KeyEvent evt) {
            char c = evt.getKeyChar();

            // Permitir sólo dígitos y coma
            if (!Character.isDigit(c) && c != ',') {
                evt.consume();  // Ignorar el carácter
            }
        }
    });
}


private boolean validarCamposConMensajes() {
    if (nombreIN.getText().isEmpty() ||
        apellidoPIN.getText().isEmpty() ||
        apellidoMIN.getText().isEmpty() ||
        direccionIN.getText().isEmpty() ||
        generoIN.getText().isEmpty() ||
        usuarioIN.getText().isEmpty() ||
        contraIN.getText().isEmpty() ||
        correoIN1.getText().isEmpty() ||
        jComboBox1.getSelectedIndex() == -1 ||
        jTextField8.getText().isEmpty() ||
        jTextField9.getText().isEmpty() ||
        jTextField1.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.", "Campos vacíos", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    if (!telefonoIN.getText().matches("\\d{10}")) {
        JOptionPane.showMessageDialog(this, "El teléfono debe tener exactamente 10 números.", "Teléfono inválido", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    if (curpIN.getText().length() != 18) {
        JOptionPane.showMessageDialog(this, "La CURP debe tener exactamente 18 caracteres.", "CURP inválida", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    if (rfcIN.getText().length() != 13) {
        JOptionPane.showMessageDialog(this, "El RFC debe tener exactamente 13 caracteres.", "RFC inválido", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Validación del correo electrónico
    String correo = correoIN1.getText();
    String regexCorreo = "^[\\w\\.-]+@[\\w\\.-]+\\.[a-zA-Z]{2,6}$";
    if (!correo.matches(regexCorreo)) {
        JOptionPane.showMessageDialog(this, "Por favor ingresa un correo electrónico válido.", "Correo inválido", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    // Validación formato fecha dd/MM/yy para jTextField1 (Recepción) y jTextField9 (Vigencia)
    String fechaRegex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";

    if (!jTextField1.getText().matches(fechaRegex)) {
        JOptionPane.showMessageDialog(this, "El campo Recepción debe tener formato dd/MM/aaaa (ejemplo: 29/07/25).", "Fecha inválida", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    if (!jTextField9.getText().matches(fechaRegex)) {
        JOptionPane.showMessageDialog(this, "El campo Vigencia debe tener formato dd/MM/aaaa (ejemplo: 29/07/25).", "Fecha inválida", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    String valorCampo8 = jTextField8.getText();
if (!valorCampo8.matches("^[0-9,]+$")) {
    JOptionPane.showMessageDialog(this, "El campo debe contener solo números y comas (ejemplo: 123,456,789).", "Valor inválido", JOptionPane.ERROR_MESSAGE);
    return false;
}

    return true;
}


    
private void limpiarCampos() {
    nombreIN.setText("");
    apellidoPIN.setText("");
    apellidoMIN.setText("");
    telefonoIN.setText("");
    direccionIN.setText("");
    curpIN.setText("");
    rfcIN.setText("");
    generoIN.setText("");
    usuarioIN.setText("");
    contraIN.setText("");
    correoIN1.setText("");
    jComboBox1.setSelectedIndex(0);
    jTextField8.setText("");
    jTextField9.setText("");
    jTextField1.setText("");
}    
    
    public void registrarClienteConValidacion() {
    Cliente cliente = registrarCliente();

    if (ConexionBD.curpExiste(cliente.getCurp())) {
        // Mostrar mensaje que ya existe la CURP
        javax.swing.JOptionPane.showMessageDialog(this, 
            "La CURP ya está registrada. No se puede guardar el cliente.",
            "Error",
            javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

 
    ConexionBD.guardar(cliente);

    javax.swing.JOptionPane.showMessageDialog(this, 
        "Cliente guardado correctamente.",
        "Éxito",
        javax.swing.JOptionPane.INFORMATION_MESSAGE);


}
    
   public Cliente registrarCliente() {
    String nombre = nombreIN.getText();
    String apellidoPaterno = apellidoPIN.getText();
    String apellidoMaterno = apellidoMIN.getText();
    String telefono = telefonoIN.getText();
    String direccion = direccionIN.getText();
    String curp = curpIN.getText();
    String rfc = rfcIN.getText();
    String genero = generoIN.getText();
    String usuarioCliente = usuarioIN.getText();
    String contrasena = contraIN.getText();
    String correo = correoIN1.getText();
    String tipoSeguro = (String) jComboBox1.getSelectedItem();
    String cantidad = jTextField8.getText();
    String vigencia = jTextField9.getText();
    String recepcion = jTextField1.getText();

    Cliente cliente = new Cliente(
        nombre, apellidoPaterno, apellidoMaterno, telefono, direccion, curp, rfc, genero,
        usuarioCliente, contrasena, correo, tipoSeguro, recepcion, vigencia, cantidad
    );
    return cliente;
}
   
   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField7 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nombreIN = new javax.swing.JTextField();
        apellidoPIN = new javax.swing.JTextField();
        apellidoMIN = new javax.swing.JTextField();
        curpIN = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        usuarioIN = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        telefonoIN = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        generoIN = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        rfcIN = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        contraIN = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        direccionIN = new javax.swing.JTextField();
        correoIN1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Recepcion:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Apellido Paterno:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Vigencia:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("CURP:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Tipo de seguro:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Contraseña:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Apellido Materno:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Usuario:");

        nombreIN.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        nombreIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreINActionPerformed(evt);
            }
        });

        apellidoPIN.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        apellidoMIN.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        apellidoMIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoMINActionPerformed(evt);
            }
        });

        curpIN.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jTextField8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        usuarioIN.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Registro cliente");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar ", "Vida", "Robo ", "Auto", "Incendio" }));
        jComboBox1.setBorder(new javax.swing.border.MatteBorder(null));
        jComboBox1.setOpaque(false);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Telefono:");

        telefonoIN.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Correo:");

        generoIN.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Genero:");

        rfcIN.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("RFC:");

        contraIN.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Direccion:");

        direccionIN.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        correoIN1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        correoIN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoIN1ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel17.setText("Cantidad:");

        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(62, 62, 62)
                        .addComponent(direccionIN, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(68, 68, 68)
                        .addComponent(nombreIN, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefonoIN, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidoMIN, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidoPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(correoIN1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(94, 94, 94)
                                .addComponent(rfcIN, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(73, 73, 73)
                                .addComponent(generoIN, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(curpIN, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel17)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contraIN, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usuarioIN, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreIN, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(apellidoPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoMIN, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(telefonoIN, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(direccionIN, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(usuarioIN, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(generoIN, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(contraIN, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(correoIN1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(curpIN, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rfcIN, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addGap(81, 81, 81))
        );

        jComboBox1.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void correoIN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoIN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoIN1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (!validarCamposConMensajes()) {
        return; // Detiene si hay campos inválidos
    }

        registrarClienteConValidacion();
        limpiarCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void apellidoMINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoMINActionPerformed

    }//GEN-LAST:event_apellidoMINActionPerformed

    private void nombreINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreINActionPerformed

    }//GEN-LAST:event_nombreINActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoMIN;
    private javax.swing.JTextField apellidoPIN;
    private javax.swing.JTextField contraIN;
    private javax.swing.JTextField correoIN1;
    private javax.swing.JTextField curpIN;
    private javax.swing.JTextField direccionIN;
    private javax.swing.JTextField generoIN;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField nombreIN;
    private javax.swing.JTextField rfcIN;
    private javax.swing.JTextField telefonoIN;
    private javax.swing.JTextField usuarioIN;
    // End of variables declaration//GEN-END:variables
}
