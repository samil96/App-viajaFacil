/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import clases.Actividades;
import clases.Tour;
import javax.swing.table.DefaultTableModel;
import listas.listaActividades;
import listas.listaTour;

/**
 *
 * @author FRANK
 */
public class FormTour extends javax.swing.JInternalFrame {

    listaTour tours=new listaTour();
    listaActividades activity=new listaActividades();
    public FormTour() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txHoraInActividad = new javax.swing.JTextField();
        txHoraFinActividad = new javax.swing.JTextField();
        txDescripActividad = new javax.swing.JTextField();
        BTNAGREGAACTIVIDAD = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblActividades = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txCodTourActividad = new javax.swing.JTextField();
        btnBuscaActividad = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txCodActividad = new javax.swing.JTextField();
        btnUpdateActi = new javax.swing.JButton();
        btnDeleteActi = new javax.swing.JButton();
        btnListaActiv = new javax.swing.JButton();
        btnListaActividadesTour = new javax.swing.JButton();
        BTNBUSCATOUR = new javax.swing.JButton();
        BTNAGREGATOUR = new javax.swing.JButton();
        BTNACTUALIZATOUR = new javax.swing.JButton();
        BTNLISTATOUR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txCodTour = new javax.swing.JTextField();
        txNombreTour = new javax.swing.JTextField();
        txDestinoTour = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTours = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txNumActividades = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("ACTIVIDADES");

        jLabel8.setText("HORA INICIO:");

        jLabel9.setText("HORA FIN:");

        jLabel10.setText("DESCRIPCIÓN:");

        BTNAGREGAACTIVIDAD.setText("AGREGAR");
        BTNAGREGAACTIVIDAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAGREGAACTIVIDADActionPerformed(evt);
            }
        });

        tblActividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO", "HORA INICIO", "HORA FIN", "DESCRIPCION"
            }
        ));
        jScrollPane2.setViewportView(tblActividades);
        if (tblActividades.getColumnModel().getColumnCount() > 0) {
            tblActividades.getColumnModel().getColumn(0).setMaxWidth(100);
            tblActividades.getColumnModel().getColumn(1).setMinWidth(80);
            tblActividades.getColumnModel().getColumn(1).setMaxWidth(100);
            tblActividades.getColumnModel().getColumn(2).setMinWidth(80);
            tblActividades.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        jLabel5.setText("CODIGO TOUR:");

        btnBuscaActividad.setText("BUSCAR");
        btnBuscaActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActividadActionPerformed(evt);
            }
        });

        jLabel6.setText("CODIGO ACTIVIDAD");

        btnUpdateActi.setText("ACTUALIZAR");
        btnUpdateActi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActiActionPerformed(evt);
            }
        });

        btnDeleteActi.setText("ELIMINAR");
        btnDeleteActi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActiActionPerformed(evt);
            }
        });

        btnListaActiv.setText("LISTAR");
        btnListaActiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActivActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(230, 230, 230))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txHoraInActividad)
                    .addComponent(txHoraFinActividad)
                    .addComponent(txDescripActividad, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(txCodTourActividad)
                    .addComponent(txCodActividad))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTNAGREGAACTIVIDAD)
                    .addComponent(btnBuscaActividad)
                    .addComponent(btnUpdateActi)
                    .addComponent(btnDeleteActi)
                    .addComponent(btnListaActiv))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txCodActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscaActividad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txCodTourActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNAGREGAACTIVIDAD))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txHoraInActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateActi))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txHoraFinActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteActi))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txDescripActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnListaActiv, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnListaActividadesTour.setText("LISTAR ACTIVIDADES");
        btnListaActividadesTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActividadesTourActionPerformed(evt);
            }
        });

        BTNBUSCATOUR.setText("BUSCAR");
        BTNBUSCATOUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBUSCATOURActionPerformed(evt);
            }
        });

        BTNAGREGATOUR.setText("AGREGAR");
        BTNAGREGATOUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAGREGATOURActionPerformed(evt);
            }
        });

        BTNACTUALIZATOUR.setText("ACTUALIZAR");
        BTNACTUALIZATOUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNACTUALIZATOURActionPerformed(evt);
            }
        });

        BTNLISTATOUR.setText("LISTAR");
        BTNLISTATOUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLISTATOURActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("TOURS");

        jLabel2.setText("CÓDIGO:");

        jLabel3.setText("NOMBRE:");

        jLabel4.setText("DESTINO:");

        txCodTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCodTourActionPerformed(evt);
            }
        });

        tblTours.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "COD", "NOMBRE", "DESTINO", "N° ACTIVIDADES"
            }
        ));
        jScrollPane1.setViewportView(tblTours);

        jLabel11.setText("N° ACTIVIDADES:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(76, 76, 76)
                                        .addComponent(txNombreTour))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(126, 126, 126)
                                        .addComponent(txCodTour, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(94, 94, 94)
                                        .addComponent(txDestinoTour))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txNumActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BTNBUSCATOUR, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BTNAGREGATOUR, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BTNACTUALIZATOUR, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BTNLISTATOUR, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnListaActividadesTour)
                                .addGap(48, 48, 48)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txCodTour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNBUSCATOUR))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txNombreTour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNAGREGATOUR))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txDestinoTour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNACTUALIZATOUR))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTNLISTATOUR)
                            .addComponent(jLabel11)
                            .addComponent(txNumActividades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnListaActividadesTour)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNLISTATOURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLISTATOURActionPerformed
        listarTour();
    }//GEN-LAST:event_BTNLISTATOURActionPerformed

    private void BTNAGREGAACTIVIDADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAGREGAACTIVIDADActionPerformed
        int cod_tour=Integer.parseInt(txCodTourActividad.getText());
        int hora_ini=Integer.parseInt(txHoraInActividad.getText());
        int hora_fin=Integer.parseInt(txHoraFinActividad.getText());
        String detalle=txDescripActividad.getText();
        Actividades x=new Actividades(cod_tour, hora_ini, hora_fin, detalle);
        activity.agregar(x);
        listarActividad();
        limpiarCamposActividad();
    }//GEN-LAST:event_BTNAGREGAACTIVIDADActionPerformed

    private void BTNAGREGATOURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAGREGATOURActionPerformed
        String nombre=txNombreTour.getText();
        String destino=txDestinoTour.getText();
        int num_activid=Integer.parseInt(txNumActividades.getText());
        Tour x=new Tour(destino,num_activid, nombre);
        tours.agregar(x);
        limpiarCamposTour();
        listarTour();
    }//GEN-LAST:event_BTNAGREGATOURActionPerformed

    private void btnListaActividadesTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActividadesTourActionPerformed
        int cod=Integer.parseInt(txCodTour.getText());
        DefaultTableModel dt=(DefaultTableModel)tblActividades.getModel();
        dt.setRowCount(0);
        for(Actividades x: activity.datosporTour(cod)){
            Object v[]={x.getCodActividad(), x.getHora_inicio(), x.getHora_fin(), x.getDetalle()};
            dt.addRow(v);
        }
    }//GEN-LAST:event_btnListaActividadesTourActionPerformed

    private void txCodTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCodTourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txCodTourActionPerformed

    private void BTNBUSCATOURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBUSCATOURActionPerformed
        int cod_tour=Integer.parseInt(txCodTour.getText());
        Tour x=tours.buscar(tours.obtenerPosicion(cod_tour));
        txDestinoTour.setText(x.getDestino());
        txNombreTour.setText(x.getNombre());
    }//GEN-LAST:event_BTNBUSCATOURActionPerformed

    private void BTNACTUALIZATOURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNACTUALIZATOURActionPerformed
        int pos=tours.obtenerPosicion(Integer.parseInt(txCodTour.getText()));
        String nombre=txNombreTour.getText();
        String destino=txDestinoTour.getText();
        int num_activid=Integer.parseInt(txNumActividades.getText());
        Tour x=tours.buscar(pos);
        x.setNombre(nombre);
        x.setDestino(destino);
        x.setNum_Actividades(num_activid);
        tours.actualizar(pos, x);
        limpiarCamposTour();
        listarTour();
    }//GEN-LAST:event_BTNACTUALIZATOURActionPerformed

    private void btnBuscaActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActividadActionPerformed
        int cod=Integer.parseInt(txCodActividad.getText());
        Actividades x=activity.buscar(activity.obtenerPosicion(cod));
        txCodTourActividad.setText(""+x.getCod_tour());
        txHoraInActividad.setText(""+x.getHora_inicio());
        txHoraFinActividad.setText(""+x.getHora_fin());
        txDescripActividad.setText(x.getDetalle());
    }//GEN-LAST:event_btnBuscaActividadActionPerformed

    private void btnUpdateActiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActiActionPerformed
        int pos=activity.obtenerPosicion(Integer.parseInt(txCodActividad.getText()));
        int cod_tour=Integer.parseInt(txCodTourActividad.getText());
        int hora_ini=Integer.parseInt(txHoraInActividad.getText());
        int hora_fin=Integer.parseInt(txHoraFinActividad.getText());
        String detalle=txDescripActividad.getText();
        Actividades x=activity.buscar(pos);
        x.setCod_tour(cod_tour);
        x.setHora_fin(hora_fin);
        x.setHora_inicio(hora_ini);
        x.setDetalle(detalle);
        activity.actualizar(pos, x);
        limpiarCamposActividad();
        listarActividad();
    }//GEN-LAST:event_btnUpdateActiActionPerformed

    private void btnDeleteActiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActiActionPerformed
        int pos=activity.obtenerPosicion(Integer.parseInt(txCodActividad.getText()));
        activity.eliminar(pos);
        listarActividad();
    }//GEN-LAST:event_btnDeleteActiActionPerformed

    private void btnListaActivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActivActionPerformed
        listarActividad();
    }//GEN-LAST:event_btnListaActivActionPerformed
    void listarTour(){
        DefaultTableModel dt=(DefaultTableModel)tblTours.getModel();
        dt.setRowCount(0);
        for(Tour x: tours.data()){
            Object v[]={x.getCodigo(), x.getNombre(), x.getDestino(), x.getNum_Actividades()};
            dt.addRow(v);
        }
    }
    void listarActividad(){
        DefaultTableModel dt=(DefaultTableModel)tblActividades.getModel();
        dt.setRowCount(0);
        for(Actividades x: activity.data()){
            Object v[]={x.getCodActividad(), x.getHora_inicio(), x.getHora_fin(), x.getDetalle()};
            dt.addRow(v);
        }
    }
    void limpiarCamposTour(){
        txCodTour.setText("");txCodTour.requestFocus();
        txNombreTour.setText("");txDestinoTour.setText("");
        txNumActividades.setText("");
    }
    void limpiarCamposActividad(){
        txCodActividad.setText("");
        txCodTourActividad.setText("");
        txHoraInActividad.setText("");
        txHoraFinActividad.setText("");
        txDescripActividad.setText("");
        txCodActividad.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNACTUALIZATOUR;
    private javax.swing.JButton BTNAGREGAACTIVIDAD;
    private javax.swing.JButton BTNAGREGATOUR;
    private javax.swing.JButton BTNBUSCATOUR;
    private javax.swing.JButton BTNLISTATOUR;
    private javax.swing.JButton btnBuscaActividad;
    private javax.swing.JButton btnDeleteActi;
    private javax.swing.JButton btnListaActiv;
    private javax.swing.JButton btnListaActividadesTour;
    private javax.swing.JButton btnUpdateActi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTable tblActividades;
    private javax.swing.JTable tblTours;
    private javax.swing.JTextField txCodActividad;
    private javax.swing.JTextField txCodTour;
    private javax.swing.JTextField txCodTourActividad;
    private javax.swing.JTextField txDescripActividad;
    private javax.swing.JTextField txDestinoTour;
    private javax.swing.JTextField txHoraFinActividad;
    private javax.swing.JTextField txHoraInActividad;
    private javax.swing.JTextField txNombreTour;
    private javax.swing.JTextField txNumActividades;
    // End of variables declaration//GEN-END:variables
}
