/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.table.DefaultTableModel;
import listas.listaTickets;
import clases.*;
import listas.listaViajeros;

/**
 *
 * @author FRANK
 */
public class FormTicket extends javax.swing.JInternalFrame {

    listaTickets tickets=new listaTickets();
    listaViajeros viajeros=new listaViajeros();
    public FormTicket() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txPrecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txCodTicket = new javax.swing.JTextField();
        txCodCliente = new javax.swing.JTextField();
        txCodPaquete = new javax.swing.JTextField();
        txDestino = new javax.swing.JTextField();
        txFecha = new javax.swing.JTextField();
        txHora = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnActualiza = new javax.swing.JButton();
        btnElimina = new javax.swing.JButton();
        btnLista = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO", "CLIENTE", "PAQUETE", "PRECIO"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel8.setText("PRECIO:");

        jLabel7.setText("HORA:");

        jLabel6.setText("FECHA:");

        jLabel5.setText("DESTINO:");

        jLabel4.setText("CODIGO PAQUETE:");

        jLabel3.setText("CODIGO CLIENTE:");

        jLabel2.setText("CODIGO:");

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualiza.setText("ACTUALIZAR");
        btnActualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizaActionPerformed(evt);
            }
        });

        btnElimina.setText("ELIMINAR");
        btnElimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaActionPerformed(evt);
            }
        });

        btnLista.setText("LISTAR");
        btnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("TICKETS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txPrecio)
                            .addComponent(txHora)
                            .addComponent(txFecha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txDestino, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txCodPaquete, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txCodCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txCodTicket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar)
                            .addComponent(btnAgregar)
                            .addComponent(btnActualiza)
                            .addComponent(btnElimina)
                            .addComponent(btnLista))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txCodTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txCodPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualiza))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElimina))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLista))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int cod_Ticket=Integer.parseInt(txCodTicket.getText());
        Ticket t=tickets.buscar(tickets.obtenerPosicion(cod_Ticket));
        txCodCliente.setText(""+t.getCod_cliente());
        txCodPaquete.setText(""+t.getCod_Paquete());
        txDestino.setText(t.getDestino());
        txFecha.setText(t.getFecha());txHora.setText(""+t.getHora());
        txPrecio.setText(""+t.getPrecio());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int cod_cliente=Integer.parseInt(txCodCliente.getText());
        int cod_paquete=Integer.parseInt(txCodPaquete.getText());
        String destino=txDestino.getText();
        String fecha=txFecha.getText();
        int hora=Integer.parseInt(txHora.getText());
        double precio=Double.parseDouble(txPrecio.getText());
        Ticket t=new Ticket(cod_cliente, cod_paquete, destino, fecha, hora, precio);
        tickets.agregar(t);
        limpiarCampos();
        listarTickets();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizaActionPerformed
        int pos=tickets.obtenerPosicion(Integer.parseInt(txCodTicket.getText()));
        int cod_cliente=Integer.parseInt(txCodCliente.getText());
        int cod_paquete=Integer.parseInt(txCodPaquete.getText());
        String destino=txDestino.getText();
        String fecha=txFecha.getText();
        int hora=Integer.parseInt(txHora.getText());
        double precio=Double.parseDouble(txPrecio.getText());
        Ticket t=tickets.buscar(pos);
        t.setCod_Paquete(cod_paquete);
        t.setCod_cliente(cod_cliente);
        t.setDestino(destino);
        t.setFecha(fecha);
        t.setHora(hora);
        t.setPrecio(precio);
        tickets.actualizar(pos, t);
        limpiarCampos();
        listarTickets();
    }//GEN-LAST:event_btnActualizaActionPerformed

    private void btnEliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaActionPerformed
        int pos=tickets.obtenerPosicion(Integer.parseInt(txCodTicket.getText()));
        tickets.eliminar(pos);
        limpiarCampos();
        listarTickets();
    }//GEN-LAST:event_btnEliminaActionPerformed

    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
        listarTickets();
    }//GEN-LAST:event_btnListaActionPerformed
    
    void listarTickets(){
        DefaultTableModel dt=(DefaultTableModel)jTable1.getModel();
        dt.setRowCount(0);
        for(Ticket t: tickets.data()){
            Object v[]={t.getCod_Ticket(), viajeros.buscar(viajeros.obtenerPosicion(t.getCod_cliente())).getNombre(), t.getCod_Paquete(), t.getPrecio()};
            dt.addRow(v);
        }
    }
    void limpiarCampos(){
        txCodTicket.setText("");
        txCodCliente.setText("");
        txCodPaquete.setText("");
        txDestino.setText("");
        txFecha.setText("");
        txHora.setText("");
        txPrecio.setText("");
        txCodCliente.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualiza;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnElimina;
    private javax.swing.JButton btnLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txCodCliente;
    private javax.swing.JTextField txCodPaquete;
    private javax.swing.JTextField txCodTicket;
    private javax.swing.JTextField txDestino;
    private javax.swing.JTextField txFecha;
    private javax.swing.JTextField txHora;
    private javax.swing.JTextField txPrecio;
    // End of variables declaration//GEN-END:variables
}
