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
        btnEliminaTour = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txCodTourActividad = new javax.swing.JTextField();
        txCodActividad = new javax.swing.JTextField();
        txHoraInActividad = new javax.swing.JTextField();
        txHoraFinActividad = new javax.swing.JTextField();
        txDescripActividad = new javax.swing.JTextField();
        btnBuscaActividad = new javax.swing.JButton();
        BTNAGREGAACTIVIDAD = new javax.swing.JButton();
        btnUpdateActi = new javax.swing.JButton();
        btnDeleteActi = new javax.swing.JButton();
        btnListaActiv = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblActividades = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(null);

        btnListaActividadesTour.setBackground(new java.awt.Color(204, 255, 204));
        btnListaActividadesTour.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnListaActividadesTour.setForeground(new java.awt.Color(0, 51, 153));
        btnListaActividadesTour.setText("LISTAR ACTIVIDADES");
        btnListaActividadesTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActividadesTourActionPerformed(evt);
            }
        });
        getContentPane().add(btnListaActividadesTour);
        btnListaActividadesTour.setBounds(280, 280, 153, 50);

        BTNBUSCATOUR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/buscar.png"))); // NOI18N
        BTNBUSCATOUR.setText("BUSCAR");
        BTNBUSCATOUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBUSCATOURActionPerformed(evt);
            }
        });
        getContentPane().add(BTNBUSCATOUR);
        BTNBUSCATOUR.setBounds(490, 80, 150, 50);

        BTNAGREGATOUR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/agregar.png"))); // NOI18N
        BTNAGREGATOUR.setText("AGREGAR");
        BTNAGREGATOUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAGREGATOURActionPerformed(evt);
            }
        });
        getContentPane().add(BTNAGREGATOUR);
        BTNAGREGATOUR.setBounds(490, 130, 150, 50);

        BTNACTUALIZATOUR.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        BTNACTUALIZATOUR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/actualizar.png"))); // NOI18N
        BTNACTUALIZATOUR.setText("ACTUALIZAR");
        BTNACTUALIZATOUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNACTUALIZATOURActionPerformed(evt);
            }
        });
        getContentPane().add(BTNACTUALIZATOUR);
        BTNACTUALIZATOUR.setBounds(490, 230, 150, 50);

        BTNLISTATOUR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/listar.png"))); // NOI18N
        BTNLISTATOUR.setText("LISTAR");
        BTNLISTATOUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLISTATOURActionPerformed(evt);
            }
        });
        getContentPane().add(BTNLISTATOUR);
        BTNLISTATOUR.setBounds(90, 280, 130, 50);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 30)); // NOI18N
        jLabel1.setText("TOURS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 10, 106, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("CÓDIGO:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 110, 64, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("NOMBRE:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 150, 68, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("DESTINO:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 190, 71, 17);

        txCodTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCodTourActionPerformed(evt);
            }
        });
        getContentPane().add(txCodTour);
        txCodTour.setBounds(320, 110, 116, 30);
        getContentPane().add(txNombreTour);
        txNombreTour.setBounds(210, 150, 223, 30);
        getContentPane().add(txDestinoTour);
        txDestinoTour.setBounds(290, 190, 141, 30);

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

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(90, 370, 470, 250);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("N° ACTIVIDADES:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(90, 230, 128, 17);
        getContentPane().add(txNumActividades);
        txNumActividades.setBounds(330, 230, 103, 30);

        btnEliminaTour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/delete.png"))); // NOI18N
        btnEliminaTour.setText("ELIMINAR");
        btnEliminaTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaTourActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminaTour);
        btnEliminaTour.setBounds(490, 180, 150, 50);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 62, 1270, 10);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/fonttour.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 720, 700);

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei", 1, 30)); // NOI18N
        jLabel14.setText("ACTIVIDADES");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(760, 80, 209, 40);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("CODIGO ACTIVIDAD");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 0, 146, 17);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("CODIGO TOUR:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 0, 108, 17);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("HORA INICIO:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(0, 0, 104, 17);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("HORA FIN:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(0, 0, 77, 17);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("DESCRIPCIÓN:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(0, 0, 108, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("CODIGO ACTIVIDAD");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(760, 170, 146, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("CODIGO TOUR:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(760, 210, 108, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("HORA INICIO:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(760, 250, 104, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("HORA FIN:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(760, 290, 77, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("DESCRIPCIÓN:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(760, 330, 108, 17);
        getContentPane().add(txCodTourActividad);
        txCodTourActividad.setBounds(980, 200, 112, 30);
        getContentPane().add(txCodActividad);
        txCodActividad.setBounds(980, 160, 112, 30);

        txHoraInActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txHoraInActividadActionPerformed(evt);
            }
        });
        getContentPane().add(txHoraInActividad);
        txHoraInActividad.setBounds(980, 250, 112, 30);
        getContentPane().add(txHoraFinActividad);
        txHoraFinActividad.setBounds(980, 290, 112, 30);
        getContentPane().add(txDescripActividad);
        txDescripActividad.setBounds(980, 330, 112, 30);

        btnBuscaActividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/buscar.png"))); // NOI18N
        btnBuscaActividad.setText("BUSCAR");
        btnBuscaActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActividadActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscaActividad);
        btnBuscaActividad.setBounds(1150, 150, 140, 59);

        BTNAGREGAACTIVIDAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/agregar.png"))); // NOI18N
        BTNAGREGAACTIVIDAD.setText("AGREGAR");
        BTNAGREGAACTIVIDAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAGREGAACTIVIDADActionPerformed(evt);
            }
        });
        getContentPane().add(BTNAGREGAACTIVIDAD);
        BTNAGREGAACTIVIDAD.setBounds(1150, 210, 140, 59);

        btnUpdateActi.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnUpdateActi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/actualizar.png"))); // NOI18N
        btnUpdateActi.setText("ACTUALIZAR");
        btnUpdateActi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActiActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdateActi);
        btnUpdateActi.setBounds(1150, 330, 150, 70);

        btnDeleteActi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/delete.png"))); // NOI18N
        btnDeleteActi.setText("ELIMINAR");
        btnDeleteActi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActiActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteActi);
        btnDeleteActi.setBounds(1150, 270, 140, 59);

        btnListaActiv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/listar.png"))); // NOI18N
        btnListaActiv.setText("LISTAR");
        btnListaActiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActivActionPerformed(evt);
            }
        });
        getContentPane().add(btnListaActiv);
        btnListaActiv.setBounds(800, 370, 121, 50);

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

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(800, 450, 520, 228);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/fontactividad.png"))); // NOI18N
        jLabel20.setText("jLabel20");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(720, 0, 640, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNLISTATOURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLISTATOURActionPerformed
        listarTour();
    }//GEN-LAST:event_BTNLISTATOURActionPerformed

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
        txNumActividades.setText(""+x.getNum_Actividades());
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

    private void btnEliminaTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaTourActionPerformed
        int pos=tours.obtenerPosicion(Integer.parseInt(txCodTour.getText()));
        tours.eliminar(pos);
        listarTour();
        limpiarCamposTour();
    }//GEN-LAST:event_btnEliminaTourActionPerformed

    private void btnListaActivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActivActionPerformed
        listarActividad();
    }//GEN-LAST:event_btnListaActivActionPerformed

    private void btnDeleteActiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActiActionPerformed
        int pos=activity.obtenerPosicion(Integer.parseInt(txCodActividad.getText()));
        activity.eliminar(pos);
        listarActividad();
        limpiarCamposActividad();
    }//GEN-LAST:event_btnDeleteActiActionPerformed

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

    private void btnBuscaActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActividadActionPerformed
        int cod=Integer.parseInt(txCodActividad.getText());
        Actividades x=activity.buscar(activity.obtenerPosicion(cod));
        txCodTourActividad.setText(""+x.getCod_tour());
        txHoraInActividad.setText(""+x.getHora_inicio());
        txHoraFinActividad.setText(""+x.getHora_fin());
        txDescripActividad.setText(x.getDetalle());
    }//GEN-LAST:event_btnBuscaActividadActionPerformed

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

    private void txHoraInActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txHoraInActividadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txHoraInActividadActionPerformed
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
    private javax.swing.JButton btnEliminaTour;
    private javax.swing.JButton btnListaActiv;
    private javax.swing.JButton btnListaActividadesTour;
    private javax.swing.JButton btnUpdateActi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
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
