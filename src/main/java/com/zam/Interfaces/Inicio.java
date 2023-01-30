/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.zam.Interfaces;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAñadir = new javax.swing.JButton();
        btnRegistros = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        Img1 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema de automoviles");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 420, 50));

        btnAñadir.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        btnAñadir.setText("Añadir nuevo auto");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        jPanel1.add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 180, -1));

        btnRegistros.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        btnRegistros.setText("Registros");
        btnRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrosActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 180, -1));

        btnSalir.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 180, -1));

        Img1.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_E_Autos\\src\\main\\java\\com\\zam\\pictures\\logo_auto.png")); // NOI18N
        jPanel1.add(Img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 340, 240));

        Background.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_E_Autos\\src\\main\\java\\com\\zam\\pictures\\background.png")); // NOI18N
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /* Este funcionalidad es para poder salir de la aplicacion (cerrar la aplicacion) */
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
    /* Esta funcionalidad es para poder abrir la ventana añadir */
    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        Añadir add = new Añadir();
        add.setVisible(true);
        add.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAñadirActionPerformed
    
    /* Esta funcionalidad es para poder abrir la venta de registros */
    private void btnRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrosActionPerformed
        Registros reg = new Registros();
        reg.setVisible(true);
        reg.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnRegistrosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Img1;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnRegistros;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
