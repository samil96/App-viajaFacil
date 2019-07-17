
package vista;

import clases.Asiento;
import clases.Vuelo;
import javax.swing.table.DefaultTableModel;
import listas.listaAsientos;
import listas.listaVuelo;

/**
 *
 * @author Valia
 */
public class FormVuelos extends javax.swing.JInternalFrame {
    
    listaVuelo objv = new listaVuelo();
    listaAsientos objA = new listaAsientos();

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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaasientos = new javax.swing.JTable();
        txtcodasiento = new javax.swing.JTextField();
        txtcodvueas = new javax.swing.JTextField();
        txtestadoasiento = new javax.swing.JTextField();
        btnAgregarAsiento = new javax.swing.JButton();
        btnEliminarAsiento = new javax.swing.JButton();
        btnBuscarAsiento = new javax.swing.JButton();
        btnActualizarAsiento = new javax.swing.JButton();
        btnListarAsiento = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setMaximizable(true);
        setTitle("VentanaVuelos");
        setVisible(true);
        getContentPane().setLayout(null);

        btnActualizarVuelo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnActualizarVuelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/actualizar.png"))); // NOI18N
        btnActualizarVuelo.setText("ACTUALIZAR");
        btnActualizarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarVueloActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizarVuelo);
        btnActualizarVuelo.setBounds(530, 240, 149, 50);

        cmbxDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ELEGIR", "AREQUIPA", "CUSCO", "TACNA", "TARAPOTO", " " }));
        getContentPane().add(cmbxDestino);
        cmbxDestino.setBounds(301, 209, 139, 20);
        getContentPane().add(txtFecha);
        txtFecha.setBounds(301, 250, 139, 20);

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 30)); // NOI18N
        jLabel1.setText("VUELOS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 10, 120, 40);
        getContentPane().add(txtHora);
        txtHora.setBounds(323, 291, 117, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("CÓDIGO:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(103, 93, 64, 17);
        getContentPane().add(txtAsientos);
        txtAsientos.setBounds(301, 331, 139, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("NOMBRE AEROLINEA:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(103, 134, 157, 17);

        btnBuscarVuelos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/buscar.png"))); // NOI18N
        btnBuscarVuelos.setText("BUSCAR");
        btnBuscarVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVuelosActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarVuelos);
        btnBuscarVuelos.setBounds(530, 90, 150, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("DESTINO:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(103, 209, 71, 17);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/agregar.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar);
        btnAgregar.setBounds(530, 140, 150, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("FECHA:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(103, 250, 53, 17);

        btnListarVuelos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/listar.png"))); // NOI18N
        btnListarVuelos.setText("LISTAR");
        btnListarVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarVuelosActionPerformed(evt);
            }
        });
        getContentPane().add(btnListarVuelos);
        btnListarVuelos.setBounds(60, 370, 121, 59);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("HORA:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(103, 291, 47, 17);

        btnEliminarVuelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/delete.png"))); // NOI18N
        btnEliminarVuelo.setText("ELIMINAR");
        btnEliminarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVueloActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarVuelo);
        btnEliminarVuelo.setBounds(530, 190, 150, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("N° ASIENTOS:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(103, 331, 102, 17);

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

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 440, 580, 220);
        getContentPane().add(txtCodVuelo);
        txtCodVuelo.setBounds(346, 93, 94, 20);
        getContentPane().add(txtNombreAreolinea);
        txtNombreAreolinea.setBounds(278, 134, 162, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("ORIGEN:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(103, 170, 63, 17);

        jTextField1.setEditable(false);
        jTextField1.setText("LIMA");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(301, 170, 139, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 64, 1380, 10);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/fontvuelo.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 760, 680);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("CÓDIGO:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(830, 130, 160, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("CÓDIGO VUELO:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(830, 170, 160, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("ESTADO:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(830, 210, 160, 17);

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei", 1, 25)); // NOI18N
        jLabel13.setText("ASIENTOS");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(830, 70, 230, 40);

        tablaasientos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaasientos);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(850, 410, 452, 200);
        getContentPane().add(txtcodasiento);
        txtcodasiento.setBounds(1010, 130, 90, 20);
        getContentPane().add(txtcodvueas);
        txtcodvueas.setBounds(1010, 170, 90, 20);
        getContentPane().add(txtestadoasiento);
        txtestadoasiento.setBounds(1010, 210, 90, 20);

        btnAgregarAsiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/agregar.png"))); // NOI18N
        btnAgregarAsiento.setText("AGREGAR");
        btnAgregarAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAsientoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarAsiento);
        btnAgregarAsiento.setBounds(1210, 130, 150, 50);

        btnEliminarAsiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/delete.png"))); // NOI18N
        btnEliminarAsiento.setText("ELIMINAR");
        btnEliminarAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAsientoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarAsiento);
        btnEliminarAsiento.setBounds(1210, 180, 150, 50);

        btnBuscarAsiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/buscar.png"))); // NOI18N
        btnBuscarAsiento.setText("BUSCAR");
        btnBuscarAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAsientoActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarAsiento);
        btnBuscarAsiento.setBounds(1210, 80, 150, 50);

        btnActualizarAsiento.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnActualizarAsiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/actualizar.png"))); // NOI18N
        btnActualizarAsiento.setText("ACTUALIZAR");
        btnActualizarAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarAsientoActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizarAsiento);
        btnActualizarAsiento.setBounds(1210, 230, 149, 50);

        btnListarAsiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/listar.png"))); // NOI18N
        btnListarAsiento.setText("LISTAR");
        btnListarAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarAsientoActionPerformed(evt);
            }
        });
        getContentPane().add(btnListarAsiento);
        btnListarAsiento.setBounds(850, 310, 121, 59);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/fontasiento.png"))); // NOI18N
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(760, 0, 620, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVuelosActionPerformed
        int cod = Integer.parseInt(txtCodVuelo.getText());
        Vuelo vue = objv.buscar(objv.obtenerPosicion(cod));
        txtNombreAreolinea.setText(vue.getAerolinea());
        cmbxDestino.setSelectedItem("" + vue.getDestino());
        txtFecha.setText("" + vue.getFecha());
        txtHora.setText("" + vue.getHora());
        txtAsientos.setText("" + vue.getCant_asientos());
    }//GEN-LAST:event_btnBuscarVuelosActionPerformed

    private void btnListarVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarVuelosActionPerformed
        listarVuelos();
    }//GEN-LAST:event_btnListarVuelosActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String areolinea = txtNombreAreolinea.getText();
        String destino = (String) cmbxDestino.getSelectedItem();
        String fecha = txtFecha.getText();
        int hora = Integer.parseInt(txtHora.getText());
        int cantAsiento = Integer.parseInt(txtAsientos.getText());
        Vuelo v = new Vuelo(areolinea, "LIMA", destino, fecha, hora, cantAsiento, "VUELO");
        objv.agregar(v);
        limpiarCamposVuelo();
        listarVuelos();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnAgregarAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAsientoActionPerformed
        String codAsiento = txtcodasiento.getText();
        int codVuelo = Integer.parseInt(txtcodvueas.getText());
        String estado = txtestadoasiento.getText();

        Asiento a = new Asiento(codAsiento, codVuelo, estado);
        objA.agregar(a);
        limpiarCamposAsientos();
        listarAsientos();
    }//GEN-LAST:event_btnAgregarAsientoActionPerformed

    private void btnBuscarAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAsientoActionPerformed
        Asiento a = objA.buscar(objA.obtenerPosicion(txtAsientos.getText()));
        txtcodvueas.setText("" + a.getCod_vuelo());
        txtestadoasiento.setText(a.getEstado());
    }//GEN-LAST:event_btnBuscarAsientoActionPerformed

    private void btnListarAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarAsientoActionPerformed
        listarAsientos();
    }//GEN-LAST:event_btnListarAsientoActionPerformed

    private void btnActualizarAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarAsientoActionPerformed
        int pos = objv.obtenerPosicion(Integer.parseInt(txtCodVuelo.getText()));
        String codAsiento = txtcodasiento.getText();
        int codVue = Integer.parseInt(txtcodvueas.getText());
        String estado = txtestadoasiento.getText();
        Asiento a = objA.buscar(pos);
        a.setCod(codAsiento);
        a.setCod_vuelo(codVue);
        a.setEstado(estado);
        objA.actualizar(pos, a);
        limpiarCamposAsientos();
        listarAsientos();
    }//GEN-LAST:event_btnActualizarAsientoActionPerformed

    private void btnEliminarAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAsientoActionPerformed
        String codAsiento = txtcodasiento.getText();
        int pos = objA.obtenerPosicion(codAsiento);
        objA.eliminar(pos);
        listarAsientos();
        limpiarCamposAsientos();
    }//GEN-LAST:event_btnEliminarAsientoActionPerformed

    private void btnEliminarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVueloActionPerformed
        int pos = objv.obtenerPosicion(Integer.parseInt(txtCodVuelo.getText()));
        objv.eliminar(pos);
        listarVuelos();
        limpiarCamposVuelo();
    }//GEN-LAST:event_btnEliminarVueloActionPerformed

    private void btnActualizarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarVueloActionPerformed
        int pos = objv.obtenerPosicion(Integer.parseInt(txtCodVuelo.getText()));
        String areolinea = txtNombreAreolinea.getText();
        String destino = (String) cmbxDestino.getSelectedItem();
        String fecha = txtFecha.getText();
        int hora = Integer.parseInt(txtHora.getText());
        int cantAsiento = Integer.parseInt(txtAsientos.getText());
        Vuelo v = objv.buscar(pos);
        v.setAerolinea(areolinea);
        v.setDestino(destino);
        v.setFecha(fecha);
        v.setHora(hora);
        v.setCant_asientos(cantAsiento);
        objv.actualizar(pos, v);
        limpiarCamposVuelo();
        listarVuelos();
    }//GEN-LAST:event_btnActualizarVueloActionPerformed
    void listarVuelos() {
        DefaultTableModel dt = (DefaultTableModel) tablaVuelos.getModel();
        dt.setRowCount(0);
        for (Vuelo vue : objv.data()) {
            Object v[] = {vue.getCodigo(), vue.getAerolinea(), vue.getDestino(), vue.getFecha(), vue.getHora(), vue.getCant_asientos()};
            dt.addRow(v);
        }
    }

    void listarAsientos() {
        DefaultTableModel dt = (DefaultTableModel) tablaasientos.getModel();
        dt.setRowCount(0);
        for (Asiento a : objA.data()) {
            Object v[] = {a.getCod(), a.getCod_vuelo(), a.getEstado()};
            dt.addRow(v);
        }
    }

    void limpiarCamposVuelo() {
        txtAsientos.setText("");
        txtCodVuelo.requestFocus();
        txtFecha.setText("");
        txtHora.setText("");
        txtNombreAreolinea.setText("");
        cmbxDestino.setSelectedIndex(0);
    }

    void limpiarCamposAsientos() {
        txtestadoasiento.setText("");
        txtcodasiento.requestFocus();
        txtcodvueas.requestFocus();
    }
    /*metodos para limpiar los campos*/
    
    
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
    private javax.swing.JButton btnBuscarAsiento;
    private javax.swing.JButton btnBuscarVuelos;
    private javax.swing.JButton btnEliminarAsiento;
    private javax.swing.JButton btnEliminarVuelo;
    private javax.swing.JButton btnListarAsiento;
    private javax.swing.JButton btnListarVuelos;
    private javax.swing.JComboBox<String> cmbxDestino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tablaVuelos;
    private javax.swing.JTable tablaasientos;
    private javax.swing.JTextField txtAsientos;
    private javax.swing.JTextField txtCodVuelo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtNombreAreolinea;
    private javax.swing.JTextField txtcodasiento;
    private javax.swing.JTextField txtcodvueas;
    private javax.swing.JTextField txtestadoasiento;
    // End of variables declaration//GEN-END:variables
}
