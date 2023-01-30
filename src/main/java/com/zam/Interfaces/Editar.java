/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.zam.Interfaces;

import com.zam.logica.Auto;
import com.zam.logica.AutoDB;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Editar extends javax.swing.JFrame {
  
    int id;
    Auto auto;
    AutoDB auto_db = null;
    
    //El constructor inicia con los componentes ya creados 
    public Editar(int id) {
        auto_db = new AutoDB();
        auto = new Auto();
        this.id = id;   
        initComponents();
        cmbMotor.addItem("-");
        cmbMotor.addItem("a gas");
        cmbMotor.addItem("a dersel");
        cmbMotor.addItem("a petroleo");
        cmbPuertas.addItem("-");
        cmbPuertas.addItem("2");
        cmbPuertas.addItem("4");
        this.cargarDatos(this.id);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        cmbMotor = new javax.swing.JComboBox<>();
        cmbPuertas = new javax.swing.JComboBox<>();
        Img1 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Editar automóvil");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 290, -1));

        jLabel2.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Marca: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modelo: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Motor: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Color: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Placa: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        jLabel7.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("N° puertas: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        btnGuardar.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_E_Autos\\src\\main\\java\\com\\zam\\pictures\\save_icon.png")); // NOI18N
        btnGuardar.setText(" Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 160, -1));

        btnRegresar.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_E_Autos\\src\\main\\java\\com\\zam\\pictures\\come_back_icon.png")); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        btnMenu.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_E_Autos\\src\\main\\java\\com\\zam\\pictures\\car_menu_icon.png")); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 50, 40));

        txtMarca.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 90, -1));

        txtModelo.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jPanel1.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 90, -1));

        txtColor.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jPanel1.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 90, -1));

        txtPlaca.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jPanel1.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 90, -1));

        cmbMotor.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jPanel1.add(cmbMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 110, -1));

        cmbPuertas.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jPanel1.add(cmbPuertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 80, -1));

        Img1.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_E_Autos\\src\\main\\java\\com\\zam\\pictures\\carro.png")); // NOI18N
        jPanel1.add(Img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 360, 200));

        btnActualizar.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_E_Autos\\src\\main\\java\\com\\zam\\pictures\\refresh_icon.png")); // NOI18N
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 50, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_E_Autos\\src\\main\\java\\com\\zam\\pictures\\background.png")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 530));

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
    
    /* Funcinalidad para poder regresar a la ventana de registros */
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Registros reg  =  new Registros();
        reg.setVisible(true);
        reg.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    /* Funcionalidad para poder regresar a la ventana de inicio */
    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Inicio beg = new Inicio();
        beg.setVisible(true);
        beg.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    /* Funcionalidad para poder guardar los cambios hechos del automovil escogido */
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        String color = txtColor.getText();
        String placa = txtPlaca.getText();
        String motor = (String)cmbMotor.getSelectedItem();
        String puertas = (String)cmbPuertas.getSelectedItem();
        
        auto_db.editar_auto(id, modelo, marca, motor, color, placa, puertas);
        
        this.mostrarMensaje("Los datos han sido modificados exitosamente!!", "Info", "Edicion correcta");
        
        Registros reg = new Registros();
        reg.setVisible(true);
        reg.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Img1;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbMotor;
    private javax.swing.JComboBox<String> cmbPuertas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
    
    /* Funcionalidad para poder cargar los datos del automovil escodigo */
    private void cargarDatos(int id) {
        this.auto = auto_db.traer_auto(id);
        txtMarca.setText(auto.getBrand());
        txtModelo.setText(auto.getModel());
        txtColor.setText(auto.getColor());
        txtPlaca.setText(auto.getLicense_plate());
        if (auto.getEngine().equals("-")) {
            cmbMotor.setSelectedIndex(0);
        } else if (auto.getEngine().equals("a gas")) {
            cmbMotor.setSelectedIndex(1);
        } else if (auto.getEngine().equals("a dersel")) {
            cmbMotor.setSelectedIndex(2);
        } else if (auto.getEngine().equals("a petroleo")) {
            cmbMotor.setSelectedIndex(3);
        }
        
        if (auto.getCar_door().equals("-")) {
            cmbPuertas.setSelectedIndex(0);
        } else if (auto.getCar_door().equals("2")) {
            cmbPuertas.setSelectedIndex(1);
        } else if (auto.getCar_door().equals("4")) {
            cmbPuertas.setSelectedIndex(2);
        }
        
    }
    
    /* Funcionalidad para poder mostrar un mensaje de acuerdo al tipo de situacion */
    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        } else if (tipo.equals("Confir")) {
            optionPane.setMessageType(JOptionPane.YES_NO_CANCEL_OPTION);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
}
