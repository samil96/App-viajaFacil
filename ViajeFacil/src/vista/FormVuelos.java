
package vista;

import clases.Vuelo;
import javax.swing.table.DefaultTableModel;
import listas.listaVuelo;

/**
 *
 * @author Valia
 */
public class FormVuelos extends javax.swing.JInternalFrame {
    
    listaVuelo objv = new listaVuelo();

    /**
     * Creates new form FormVuelos
     */
    public FormVuelos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnActualizarVuelo = new javax.swing.JButton();
        cmbxDestino = new javax.swing.JComboBox<>();
        txtFecha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAsientos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnBuscarVuelos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnListarVuelos = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnEliminarVuelo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVuelos = new javax.swing.JTable();
        txtCodVuelo = new javax.swing.JTextField();
        txtNombreAreolinea = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        btnAgregarAsiento = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAsientos = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txCodVuelo = new javax.swing.JTextField();
        btnBuscaAsiento = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txCodAsiento = new javax.swing.JTextField();
        btnActualizarAsiento = new javax.swing.JButton();
        btnDeleteAsiento = new javax.swing.JButton();
        btnListaAsiento = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("VentanaVuelos");
        setVisible(true);

        btnActualizarVuelo.setText("ACTUALIZAR");
        btnActualizarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarVueloActionPerformed(evt);
            }
        });

        cmbxDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ELEGIR", "AREQUIPA", "CUSCO", "TACNA", "TARAPOTO", " " }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("VUELOS");

        jLabel2.setText("CÓDIGO:");

        jLabel3.setText("NOMBRE AEROLINEA:");

        btnBuscarVuelos.setText("BUSCAR");
        btnBuscarVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVuelosActionPerformed(evt);
            }
        });

        jLabel4.setText("DESTINO:");

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel5.setText("FECHA:");

        btnListarVuelos.setText("LISTAR");
        btnListarVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarVuelosActionPerformed(evt);
            }
        });

        jLabel6.setText("HORA:");

        btnEliminarVuelo.setText("ELIMINAR");
        btnEliminarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVueloActionPerformed(evt);
            }
        });

        jLabel7.setText("N° ASIENTOS:");

        tablaVuelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "COD", "AEROLINEA", "DESTINO", "FECHA", "HORA", "N° ASIENTOS"
            }
        ));
        jScrollPane1.setViewportView(tablaVuelos);

        jLabel8.setText("ORIGEN:");

        jTextField1.setEditable(false);
        jTextField1.setText("LIMA");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("ASIENTO");

        jLabel10.setText("ESTADO:");

        btnAgregarAsiento.setText("AGREGAR");
        btnAgregarAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAsientoActionPerformed(evt);
            }
        });

        tablaAsientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CODIGO", "CODIGO VUELO", "ESTADO"
            }
        ));
        jScrollPane2.setViewportView(tablaAsientos);

        jLabel13.setText("CODIGO VUELO:");

        btnBuscaAsiento.setText("BUSCAR");
        btnBuscaAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaAsientoActionPerformed(evt);
            }
        });

        jLabel14.setText("CODIGO ASIENTO:");

        btnActualizarAsiento.setText("ACTUALIZAR");
        btnActualizarAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarAsientoActionPerformed(evt);
            }
        });

        btnDeleteAsiento.setText("ELIMINAR");
        btnDeleteAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAsientoActionPerformed(evt);
            }
        });

        btnListaAsiento.setText("LISTAR");
        btnListaAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaAsientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(230, 230, 230))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAgregarAsiento)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(txCodVuelo)
                                    .addComponent(txCodAsiento))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnActualizarAsiento)
                                    .addComponent(btnBuscaAsiento, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnDeleteAsiento, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnListaAsiento, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txCodAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscaAsiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txCodVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarAsiento))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarAsiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeleteAsiento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListaAsiento)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(99, 99, 99)
                                            .addComponent(cmbxDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel7))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtHora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtAsientos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(36, 36, 36)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnListarVuelos)
                                        .addComponent(btnEliminarVuelo)
                                        .addComponent(btnActualizarVuelo)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtCodVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addGap(18, 18, 18))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel8)
                                                    .addGap(81, 81, 81)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtNombreAreolinea, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(50, 50, 50)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnBuscarVuelos)
                                        .addComponent(btnAgregar))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarVuelos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreAreolinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbxDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarVuelos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarVuelo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarVuelo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVuelosActionPerformed
        int cod=Integer.parseInt(txtCodVuelo.getText());
        Vuelo vue=objv.buscar(objv.obtenerPosicion(cod));
        txtNombreAreolinea.setText(vue.getAerolinea());
        cmbxDestino.setSelectedItem(""+ vue.getDestino());
        txtFecha.setText(""+ vue.getFecha());
        txtHora.setText(""+ vue.getHora());
        txtAsientos.setText(""+ vue.getCant_asientos());
    }//GEN-LAST:event_btnBuscarVuelosActionPerformed

    private void btnListarVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarVuelosActionPerformed
        listarVuelos();
    }//GEN-LAST:event_btnListarVuelosActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String areolinea=txtNombreAreolinea.getText();
        String destino= (String) cmbxDestino.getSelectedItem();
        String fecha = txtFecha.getText();
        String hora = txtHora.getText();
        int cantAsiento=Integer.parseInt(txtAsientos.getText());
        Vuelo v = new Vuelo(areolinea, hora, destino, fecha, ABORT, cantAsiento, hora);      
        objv.agregar(v);
        limpiarCamposVuelo();
        listarVuelos();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnAgregarAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAsientoActionPerformed
        
    }//GEN-LAST:event_btnAgregarAsientoActionPerformed

    private void btnBuscaAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaAsientoActionPerformed
        
    }//GEN-LAST:event_btnBuscaAsientoActionPerformed

    private void btnActualizarAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarAsientoActionPerformed
        
    }//GEN-LAST:event_btnActualizarAsientoActionPerformed

    private void btnDeleteAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAsientoActionPerformed
        
    }//GEN-LAST:event_btnDeleteAsientoActionPerformed

    private void btnListaAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaAsientoActionPerformed
        
    }//GEN-LAST:event_btnListaAsientoActionPerformed

    private void btnEliminarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVueloActionPerformed
        int pos=objv.obtenerPosicion(Integer.parseInt(txtCodVuelo.getText()));
        objv.eliminar(pos);
        listarVuelos();
        limpiarCamposVuelo();
    }//GEN-LAST:event_btnEliminarVueloActionPerformed

    private void btnActualizarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarVueloActionPerformed
        int pos=objv.obtenerPosicion(Integer.parseInt(txtCodVuelo.getText()));
        String areolinea=txtNombreAreolinea.getText();
        String destino= (String) cmbxDestino.getSelectedItem();
        String fecha = txtFecha.getText();
        int hora = Integer.parseInt(txtHora.getText());
        int cantAsiento=Integer.parseInt(txtAsientos.getText());
        Vuelo v =objv.buscar(pos);
        v.setAerolinea(areolinea);
        v.setDestino(destino);
        v.setFecha(fecha);
        v.setHora(hora);
        v.setCant_asientos(cantAsiento);
        objv.actualizar(pos, v);
        limpiarCamposVuelo();
        listarVuelos();
    }//GEN-LAST:event_btnActualizarVueloActionPerformed
    
    /*metodos para limpiar los campos*/
    void listarVuelos(){
        DefaultTableModel dt=(DefaultTableModel)tablaVuelos.getModel();
        dt.setRowCount(0);
        for(Vuelo vue: objv.data()){
            Object v[]={vue.getCodigo(), vue.getAerolinea(), vue.getDestino(), vue.getFecha(), vue.getHora(), vue.getCant_asientos() };
            dt.addRow(v);
        }
    }
    
    void limpiarCamposVuelo(){
        txtAsientos.setText("");
        txtCodVuelo.requestFocus();
        txtFecha.setText("");
        txtHora.setText("");
        txtNombreAreolinea.setText("");
        cmbxDestino.setSelectedIndex(0);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(FormVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>{

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormVuelos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarAsiento;
    private javax.swing.JButton btnActualizarVuelo;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarAsiento;
    private javax.swing.JButton btnBuscaAsiento;
    private javax.swing.JButton btnBuscarVuelos;
    private javax.swing.JButton btnDeleteAsiento;
    private javax.swing.JButton btnEliminarVuelo;
    private javax.swing.JButton btnListaAsiento;
    private javax.swing.JButton btnListarVuelos;
    private javax.swing.JComboBox<String> cmbxDestino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tablaAsientos;
    private javax.swing.JTable tablaVuelos;
    private javax.swing.JTextField txCodAsiento;
    private javax.swing.JTextField txCodVuelo;
    private javax.swing.JTextField txtAsientos;
    private javax.swing.JTextField txtCodVuelo;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtNombreAreolinea;
    // End of variables declaration//GEN-END:variables
}
