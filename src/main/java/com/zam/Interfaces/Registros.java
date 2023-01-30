/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.zam.Interfaces;

import com.zam.logica.Auto;
import com.zam.logica.AutoDB;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Registros extends javax.swing.JFrame {
    
    //Creamos un objeto de tipo AutoDB y lo inicializamos con nulo
    AutoDB auto_db = null;
    
    //El constructor comienza con los componentes ya creados
    public Registros() {
        auto_db = new AutoDB();
        initComponents();
        cmbFiltro.addItem("-");
        cmbFiltro.addItem("Motor a gas");
        cmbFiltro.addItem("Motor a petroleo");
        cmbFiltro.addItem("Motor a dersel");       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Cuadro_Tabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbFiltro = new javax.swing.JComboBox<>();
        btnRegresar = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registros");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        Cuadro_Tabla.setBackground(new java.awt.Color(51, 204, 255));
        Cuadro_Tabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTabla);

        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_E_Autos\\src\\main\\java\\com\\zam\\pictures\\delete_icon.png")); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_E_Autos\\src\\main\\java\\com\\zam\\pictures\\edit_icon.png")); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_E_Autos\\src\\main\\java\\com\\zam\\pictures\\refresh_icon.png")); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        jLabel2.setText("Filtro: ");

        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        jLabel3.setText("Datos: ");

        cmbFiltro.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N

        javax.swing.GroupLayout Cuadro_TablaLayout = new javax.swing.GroupLayout(Cuadro_Tabla);
        Cuadro_Tabla.setLayout(Cuadro_TablaLayout);
        Cuadro_TablaLayout.setHorizontalGroup(
            Cuadro_TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cuadro_TablaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(Cuadro_TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Cuadro_TablaLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(431, 431, 431)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                    .addGroup(Cuadro_TablaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(Cuadro_TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbFiltro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(Cuadro_TablaLayout.createSequentialGroup()
                                .addGroup(Cuadro_TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Cuadro_TablaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        Cuadro_TablaLayout.setVerticalGroup(
            Cuadro_TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Cuadro_TablaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Cuadro_TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(Cuadro_TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Cuadro_TablaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(Cuadro_TablaLayout.createSequentialGroup()
                        .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizar)
                        .addContainerGap())))
        );

        jPanel1.add(Cuadro_Tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 670, 420));

        btnRegresar.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_E_Autos\\src\\main\\java\\com\\zam\\pictures\\come_back_icon.png")); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        Background.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_E_Autos\\src\\main\\java\\com\\zam\\pictures\\background.png")); // NOI18N
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 560));

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
    
    /* Funcionalidad para poder editar un automovil */
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        if (tblTabla.getRowCount() > 0) {
            if (tblTabla.getSelectedRow() != -1) {
                int id_auto = Integer.parseInt(String.valueOf(tblTabla.getValueAt(tblTabla.getSelectedRow(), 0)));
                Editar editar = new Editar(id_auto);
                editar.setVisible(true);
                editar.setLocationRelativeTo(null);
                this.dispose();
            } else {
                this.mostrarMensaje("No ha seleccionado una columna", "Error", "Columna no seleccionada");
            }
        } else {
            this.mostrarMensaje("No hay aun registros!!", "Error", "Tabla vacia");
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed
    
    /* Funcionalidad para poder eliminar un automovil */
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tblTabla.getRowCount() > 0) {
            if (tblTabla.getSelectedRow() != -1) {
                int seleccion = JOptionPane.showOptionDialog(
                null, //Componenete
                "Esta seguro que desea eliminar el registro seleccionado?", //Mensaje
                "Intento de eliminacion", //Titulo
                JOptionPane.YES_NO_CANCEL_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null, //Icono... al poner null el icono sera por defecto
                new Object[] {"Si","No"}, 
                "Si");
                if (seleccion == 0) {
                    int id_auto = Integer.parseInt(String.valueOf(tblTabla.getValueAt(tblTabla.getSelectedRow(), 0)));
                    boolean error = auto_db.eliminar_auto(id_auto);
                    if (error) {
                        this.mostrarMensaje("Hubo un error al momento de intentar eliminar", "Error", "Eliminacion sin exito");
                    } else { 
                        this.mostrarMensaje("Auto eliminado con exito!!", "Info", "Eliminacion exitoso");
                        List<Auto> listaAutos;
                        listaAutos = auto_db.list_cars();
                        this.cargarTabla(listaAutos);
                    }
                }              
            } else {
                this.mostrarMensaje("No ha seleccionado una columna", "Error", "Columna no seleccionada");
            }
        } else {
            this.mostrarMensaje("No hay aun registros!!", "Error", "Tabla vacia");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    /* Funcionalidad para poder regresar a la venta de inicio */
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Inicio beg = new Inicio();
        beg.setVisible(true);
        beg.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed
    
    /* Funcionalidad de ventana abierta, apenas la interfaz de inicie esta funcionalidad comenzara */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        List<Auto> listaAutos;
        listaAutos = auto_db.list_cars();
        this.cargarTabla(listaAutos);
    }//GEN-LAST:event_formWindowOpened
    
    /* Funcionalidad para poder actualizar la tabla de datos */
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        List<Auto> lista_Autos;
        lista_Autos = auto_db.list_cars();
        switch (String.valueOf(cmbFiltro.getSelectedItem())) {
            case "-": {
                this.cargarTabla(lista_Autos);
            } break;

            case "Motor a gas": {
                List<Auto> nueva_lista = lista_Autos.stream().filter(auto -> auto.getEngine().equals("a gas"))
                        .collect(Collectors.toList());
                this.cargarTabla(nueva_lista);
            } break;
            
            case "Motor a petroleo": {
                List<Auto> nueva_lista = lista_Autos.stream().filter(auto -> auto.getEngine().equals("a petroleo"))
                        .collect(Collectors.toList());
                this.cargarTabla(nueva_lista);
            } break; 
            
            case "Motor a dersel": {
                List<Auto> nueva_lista = lista_Autos.stream().filter(auto -> auto.getEngine().equals("a dersel"))
                        .collect(Collectors.toList());
                this.cargarTabla(nueva_lista);
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel Cuadro_Tabla;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabla;
    // End of variables declaration//GEN-END:variables
    
    /* funcionalidad para pdoer cargar la tabla con los datos de los automoviles */
    private void cargarTabla(List<Auto> listaAutos) {
        DefaultTableModel tabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        String titulos[] = {"Id","Marca", "Modelo", "Motor", "Color", "Placa", "N° Puertas"};
        tabla.setColumnIdentifiers(titulos);
        
        if (listaAutos != null) {
            for (int i=0; i<listaAutos.size(); i++) {
                Object[] objecto = {listaAutos.get(i).getId_auto(), listaAutos.get(i).getBrand(), listaAutos.get(i).getModel(), 
                listaAutos.get(i).getEngine(), listaAutos.get(i).getColor(), listaAutos.get(i).getLicense_plate(), 
                listaAutos.get(i).getCar_door()};
                tabla.addRow(objecto);
            }
            tblTabla.setModel(tabla);
        }
    }
    
    /* Funcionalidad para poder mostrar un mensaje de acuerdo al tipo de situacion */
    private void mostrarMensaje(String mensaje, String tipo, String titulo) {
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
