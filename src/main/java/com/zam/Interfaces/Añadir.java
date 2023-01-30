/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.zam.Interfaces;

import com.zam.logica.Auto;
import com.zam.logica.AutoDB;

public class Añadir extends javax.swing.JFrame {
    
    //El constructor inicia con los componentes de tipo comboBox ya registrados para poder visualizarlo en la interfaza grafica
    public Añadir() {
        initComponents();
        cmbEngine.addItem("-");
        cmbEngine.addItem("a gas");
        cmbEngine.addItem("a dersel");
        cmbEngine.addItem("a petroleo");
        cmbN_car_door.addItem("-");
        cmbN_car_door.addItem("2");
        cmbN_car_door.addItem("4");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Img1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        cmbEngine = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbN_car_door = new javax.swing.JComboBox<>();
        txtLicense_plate = new javax.swing.JTextField();
        btnAñadir_auto = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Img1.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_E_Autos\\src\\main\\java\\com\\zam\\pictures\\carro.png")); // NOI18N
        jPanel1.add(Img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 350, 200));

        jLabel2.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Añadir automovil");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 300, -1));

        jLabel3.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Marca:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        txtBrand.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jPanel1.add(txtBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 110, -1));

        jLabel4.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Modelo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 60, -1));

        txtModel.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jPanel1.add(txtModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 110, -1));

        jLabel5.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Motor:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Color: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        txtColor.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jPanel1.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 110, -1));

        cmbEngine.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jPanel1.add(cmbEngine, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 110, -1));

        jLabel7.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Placa:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("N° puertas: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        cmbN_car_door.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jPanel1.add(cmbN_car_door, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 80, -1));

        txtLicense_plate.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jPanel1.add(txtLicense_plate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 110, -1));

        btnAñadir_auto.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        btnAñadir_auto.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_E_Autos\\src\\main\\java\\com\\zam\\pictures\\car_icon.png")); // NOI18N
        btnAñadir_auto.setText(" Añadir");
        btnAñadir_auto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadir_autoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAñadir_auto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 150, -1));

        btnActualizar.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_E_Autos\\src\\main\\java\\com\\zam\\pictures\\refresh_icon.png")); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 50, 40));

        btnRegresar.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_E_Autos\\src\\main\\java\\com\\zam\\pictures\\come_back_icon.png")); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        background.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_E_Autos\\src\\main\\java\\com\\zam\\pictures\\background.png")); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /* Esta funcionalidad es para poder resetear los datos de los casilleros */
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        txtBrand.setText("");
        txtModel.setText("");
        txtColor.setText("");
        txtLicense_plate.setText("");
        cmbEngine.setSelectedIndex(0);
        cmbN_car_door.setSelectedIndex(0);
    }//GEN-LAST:event_btnActualizarActionPerformed

    /* Esta funcionalidad es para poder volver a la ventana de Inicio */
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        //Metodo para poder volver a la ventana de inicio
        Inicio beg = new Inicio();
        beg.setVisible(true);
        beg.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    /* Esta funcionalidad es para poder añadir un nuevo automovil y guardarlo en la base de datos */
    private void btnAñadir_autoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadir_autoActionPerformed
        //Creamos un objeto de tipo auto_db
        AutoDB auto_db = new AutoDB();
        
        //Llenamos las variables con datos que recibimos del front end
        String marca = txtBrand.getText();
        String modelo = txtModel.getText();
        String color = txtColor.getText();
        String placa = txtLicense_plate.getText();
        String motor = String.valueOf(cmbEngine.getSelectedItem());
        String puertas = String.valueOf(cmbN_car_door.getSelectedItem());
        
        //Creamos un objeto de tipo auto y lo inicializamos con su constructor
        Auto auto = new Auto(marca, modelo, motor, color, placa, puertas);
        
        /*Hacemos uso del metodo save_car() y enviamos como para parametro un objeto de tipo auto 
        para poder guardarlo en la base de datos*/
        auto_db.save_car(auto);
        
        //Metodo para poder volver a la ventana de Inicio
        Inicio beg = new Inicio();
        beg.setVisible(true);
        beg.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAñadir_autoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Img1;
    private javax.swing.JLabel background;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAñadir_auto;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbEngine;
    private javax.swing.JComboBox<String> cmbN_car_door;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtLicense_plate;
    private javax.swing.JTextField txtModel;
    // End of variables declaration//GEN-END:variables
}
