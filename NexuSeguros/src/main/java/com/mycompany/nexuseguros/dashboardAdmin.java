package com.mycompany.nexuseguros;

import clases.Usuario;
import com.login.login;
import com.mycompany.views.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JPanel;


public class dashboardAdmin extends javax.swing.JFrame {
    private Usuario usuario;
    
    public dashboardAdmin(Usuario usuario) {
        this.usuario = usuario; 
        initComponents();
        initStyles();
        setDate();
        initContent();
        mostrarDatosUsuario();
    }
    private void mostrarDatosUsuario() {
        if (usuario != null) {
            jLabel1.setText("Bienvenido, Gerente" + usuario.getNombre());
           
        }
    }
    private void initStyles(){
        /*nombreSistema.putClientProperty( "FlatLaf.style", "font: 20 $light.font" );
        nombreSistema.setForeground(Color.black);*/
    }
    private void setDate(){
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        dateText.setText(dia + " de " + meses[month - 1] + " de " + year);
    }
    
    private void initContent(){
        ShowJPanel(new inicioAgente());
        
    }
    private void ShowJPanel(JPanel c){
        c.setSize(730, 508);
        c.setLocation(0,0);
        
        contentAdmin.removeAll();
        contentAdmin.add(c, BorderLayout.CENTER);
        contentAdmin.revalidate();
        contentAdmin.repaint();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        botonInicioC = new javax.swing.JButton();
        botonPerfilC = new javax.swing.JButton();
        botonSesionC = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        botonRegistro = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        dateText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        contentAdmin = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        fondo.setBackground(new java.awt.Color(255, 255, 255));

        menu.setBackground(new java.awt.Color(34, 34, 34));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo.png"))); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        botonInicioC.setBackground(new java.awt.Color(34, 34, 34));
        botonInicioC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonInicioC.setForeground(new java.awt.Color(255, 255, 255));
        botonInicioC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inicio.png"))); // NOI18N
        botonInicioC.setText("Inicio");
        botonInicioC.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        botonInicioC.setBorderPainted(false);
        botonInicioC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonInicioC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonInicioC.setIconTextGap(10);
        botonInicioC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonInicioCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonInicioCMouseExited(evt);
            }
        });
        botonInicioC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioCActionPerformed(evt);
            }
        });

        botonPerfilC.setBackground(new java.awt.Color(34, 34, 34));
        botonPerfilC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonPerfilC.setForeground(new java.awt.Color(255, 255, 255));
        botonPerfilC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perfil.png"))); // NOI18N
        botonPerfilC.setText("Perfil");
        botonPerfilC.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        botonPerfilC.setBorderPainted(false);
        botonPerfilC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonPerfilC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonPerfilC.setIconTextGap(10);
        botonPerfilC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonPerfilCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonPerfilCMouseExited(evt);
            }
        });
        botonPerfilC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPerfilCActionPerformed(evt);
            }
        });

        botonSesionC.setBackground(new java.awt.Color(34, 34, 34));
        botonSesionC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonSesionC.setForeground(new java.awt.Color(255, 255, 255));
        botonSesionC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salir.png"))); // NOI18N
        botonSesionC.setText("Cerrar Sesion");
        botonSesionC.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        botonSesionC.setBorderPainted(false);
        botonSesionC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSesionC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonSesionC.setIconTextGap(10);
        botonSesionC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonSesionCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSesionCMouseExited(evt);
            }
        });
        botonSesionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSesionCActionPerformed(evt);
            }
        });

        botonActualizar.setBackground(new java.awt.Color(34, 34, 34));
        botonActualizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        botonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/actualizar.png"))); // NOI18N
        botonActualizar.setText("Actualizar");
        botonActualizar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        botonActualizar.setBorderPainted(false);
        botonActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonActualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonActualizar.setIconTextGap(10);
        botonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonActualizarMouseExited(evt);
            }
        });
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });

        botonBuscar.setBackground(new java.awt.Color(34, 34, 34));
        botonBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leer.png"))); // NOI18N
        botonBuscar.setText("Buscar/Leer");
        botonBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        botonBuscar.setBorderPainted(false);
        botonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBuscar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonBuscar.setIconTextGap(10);
        botonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonBuscarMouseExited(evt);
            }
        });
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        botonRegistro.setBackground(new java.awt.Color(34, 34, 34));
        botonRegistro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonRegistro.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registro.png"))); // NOI18N
        botonRegistro.setText("Registro de agentes");
        botonRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        botonRegistro.setBorderPainted(false);
        botonRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegistro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonRegistro.setIconTextGap(10);
        botonRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRegistroMouseExited(evt);
            }
        });
        botonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroActionPerformed(evt);
            }
        });

        botonBorrar.setBackground(new java.awt.Color(34, 34, 34));
        botonBorrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonBorrar.setForeground(new java.awt.Color(255, 255, 255));
        botonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eliminar.png"))); // NOI18N
        botonBorrar.setText("Borrar");
        botonBorrar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        botonBorrar.setBorderPainted(false);
        botonBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBorrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        botonBorrar.setIconTextGap(10);
        botonBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonBorrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonBorrarMouseExited(evt);
            }
        });
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonInicioC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonSesionC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonPerfilC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addComponent(botonActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(botonInicioC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonPerfilC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(botonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(botonSesionC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        header.setBackground(new java.awt.Color(97, 192, 191));
        header.setForeground(new java.awt.Color(255, 255, 255));

        dateText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dateText.setForeground(new java.awt.Color(255, 255, 255));
        dateText.setText("{dayname} {day} de {month} del {year}");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(326, Short.MAX_VALUE)
                .addComponent(dateText)
                .addGap(117, 117, 117))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dateText)
                .addContainerGap())
        );

        contentAdmin.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentAdminLayout = new javax.swing.GroupLayout(contentAdmin);
        contentAdmin.setLayout(contentAdminLayout);
        contentAdminLayout.setHorizontalGroup(
            contentAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentAdminLayout.setVerticalGroup(
            contentAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contentAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInicioCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInicioCMouseEntered
        botonInicioC.setBackground(new Color(64,64,64));
    }//GEN-LAST:event_botonInicioCMouseEntered

    private void botonInicioCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInicioCMouseExited
        botonInicioC.setBackground(new Color(34,34,34));
    }//GEN-LAST:event_botonInicioCMouseExited

    private void botonInicioCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioCActionPerformed
        ShowJPanel(new inicioAgente());
    }//GEN-LAST:event_botonInicioCActionPerformed

    private void botonPerfilCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPerfilCMouseEntered
        botonPerfilC.setBackground(new Color(64,64,64));
    }//GEN-LAST:event_botonPerfilCMouseEntered

    private void botonPerfilCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPerfilCMouseExited
        botonPerfilC.setBackground(new Color(34,34,34));
    }//GEN-LAST:event_botonPerfilCMouseExited

    private void botonPerfilCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPerfilCActionPerformed
        ShowJPanel(new perfilAgente());
    }//GEN-LAST:event_botonPerfilCActionPerformed

    private void botonBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseEntered
        botonBuscar.setBackground(new Color(64,64,64));
    }//GEN-LAST:event_botonBuscarMouseEntered

    private void botonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseExited
        botonBuscar.setBackground(new Color(34,34,34));
    }//GEN-LAST:event_botonBuscarMouseExited

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        ShowJPanel(new leerAgente());
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonSesionCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSesionCMouseEntered
        botonSesionC.setBackground(new Color(64,64,64));
    }//GEN-LAST:event_botonSesionCMouseEntered

    private void botonSesionCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSesionCMouseExited
        botonSesionC.setBackground(new Color(34,34,34));
    }//GEN-LAST:event_botonSesionCMouseExited

    private void botonSesionCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSesionCActionPerformed
        login b1 = new login();
        b1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonSesionCActionPerformed

    private void botonActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarMouseEntered
        botonActualizar.setBackground(new Color(64,64,64));
    }//GEN-LAST:event_botonActualizarMouseEntered

    private void botonActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarMouseExited
        botonActualizar.setBackground(new Color(34,34,34));
    }//GEN-LAST:event_botonActualizarMouseExited

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        ShowJPanel(new actualizarCliente());
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void botonRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistroMouseEntered
        botonRegistro.setBackground(new Color(64,64,64));
    }//GEN-LAST:event_botonRegistroMouseEntered

    private void botonRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistroMouseExited
        botonRegistro.setBackground(new Color(34,34,34));
    }//GEN-LAST:event_botonRegistroMouseExited

    private void botonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroActionPerformed
        ShowJPanel(new registroAgente());
    }//GEN-LAST:event_botonRegistroActionPerformed

    private void botonBorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBorrarMouseEntered
        botonBorrar.setBackground(new Color(64,64,64));
    }//GEN-LAST:event_botonBorrarMouseEntered

    private void botonBorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBorrarMouseExited
        botonBorrar.setBackground(new Color(34,34,34));
    }//GEN-LAST:event_botonBorrarMouseExited

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        ShowJPanel(new borrarAgenClien());
    }//GEN-LAST:event_botonBorrarActionPerformed

    
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Usuario usuarioLogueado = null;
                dashboardAdmin admin = new dashboardAdmin(usuarioLogueado);
                admin.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonInicioC;
    private javax.swing.JButton botonPerfilC;
    private javax.swing.JButton botonRegistro;
    private javax.swing.JButton botonSesionC;
    private javax.swing.JPanel contentAdmin;
    private javax.swing.JLabel dateText;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}
