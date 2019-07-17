/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Arreglo.*;
import clases.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import listas.*;

/**
 *
 * @author Valia
 */
public class FormPaquetes extends javax.swing.JInternalFrame {
    listaVuelo objv=new listaVuelo();
    listaHotel objh= new listaHotel();
    listaPaquete obj= new listaPaquete();
    listaTour objt= new listaTour();
    
    public FormPaquetes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txCodPaquete = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txDetalle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txPrecioPaquete = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnBuscarPaquetes = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txServVuelo = new javax.swing.JTextField();
        txServTour = new javax.swing.JTextField();
        txServHotel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnListarPaquetes = new javax.swing.JButton();
        btnAgregaPaquete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnBuscarVuelos = new javax.swing.JButton();
        btnListarVuelos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableVuelo = new javax.swing.JTable();
        txtCodVuelos = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnBuscarHoteles = new javax.swing.JButton();
        btnListarHoteles = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableHotel = new javax.swing.JTable();
        txtCodHoteles = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnBuscarTours = new javax.swing.JButton();
        btnListarTours = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableTour = new javax.swing.JTable();
        txtCodTours = new javax.swing.JTextField();
        btnActualizaPaquete = new javax.swing.JButton();
        btnElininaPaquete = new javax.swing.JButton();
        btnCalculaPrecioPaq = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cbxFiltroDestino = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("VentanaPaquetes");
        setVisible(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("PAQUETES");

        jLabel2.setText("CODIGO:");

        jLabel3.setText("DETALLE");

        jLabel4.setText("PRECIO:");

        btnBuscarPaquetes.setText("BUSCAR");
        btnBuscarPaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPaquetesActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("SERVICIOS:"));

        jLabel8.setText("VUELOS");

        jLabel9.setText("TOURS");

        jLabel10.setText("HOTELES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txServVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(15, 15, 15)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txServTour, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(17, 17, 17)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel10)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txServHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txServHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txServTour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txServVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        btnListarPaquetes.setText("LISTAR");
        btnListarPaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPaquetesActionPerformed(evt);
            }
        });

        btnAgregaPaquete.setText("AGREGAR");
        btnAgregaPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregaPaqueteActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "VUELO", "HOSPEDAJE", "TOUR", "PRECIO"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("VUELOS");

        btnBuscarVuelos.setText("Buscar");
        btnBuscarVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVuelosActionPerformed(evt);
            }
        });

        btnListarVuelos.setText("Listar");
        btnListarVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarVuelosActionPerformed(evt);
            }
        });

        tableVuelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "AREOLINEA", "FECHA", "HORA", "DESTINO", "Nº ASIENTOS"
            }
        ));
        jScrollPane2.setViewportView(tableVuelo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addGap(53, 53, 53)
                .addComponent(btnListarVuelos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCodVuelos, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarVuelos)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnBuscarVuelos)
                    .addComponent(btnListarVuelos)
                    .addComponent(txtCodVuelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("HOTELES");

        btnBuscarHoteles.setText("Buscar");
        btnBuscarHoteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarHotelesActionPerformed(evt);
            }
        });

        btnListarHoteles.setText("Listar");
        btnListarHoteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarHotelesActionPerformed(evt);
            }
        });

        tableHotel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE", "CATEGORIA", "HABITACION"
            }
        ));
        jScrollPane3.setViewportView(tableHotel);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6)
                        .addGap(53, 53, 53)
                        .addComponent(btnListarHoteles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCodHoteles, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarHoteles))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnBuscarHoteles)
                    .addComponent(btnListarHoteles)
                    .addComponent(txtCodHoteles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setText("TOURS");

        btnBuscarTours.setText("Buscar");
        btnBuscarTours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarToursActionPerformed(evt);
            }
        });

        btnListarTours.setText("Listar");
        btnListarTours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarToursActionPerformed(evt);
            }
        });

        tableTour.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE", "DESTINO", "N° ACTIVIDADES"
            }
        ));
        jScrollPane4.setViewportView(tableTour);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel7)
                        .addGap(53, 53, 53)
                        .addComponent(btnListarTours)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCodTours, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarTours))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnBuscarTours)
                    .addComponent(btnListarTours)
                    .addComponent(txtCodTours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnActualizaPaquete.setText("ACTUALIZAR");
        btnActualizaPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizaPaqueteActionPerformed(evt);
            }
        });

        btnElininaPaquete.setText("ELIMINAR");
        btnElininaPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElininaPaqueteActionPerformed(evt);
            }
        });

        btnCalculaPrecioPaq.setText("CALCULAR");
        btnCalculaPrecioPaq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculaPrecioPaqActionPerformed(evt);
            }
        });

        jLabel11.setText("FILTRAR POR DESTINO:");

        cbxFiltroDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ELEGIR", "AREQUIPA", "TACNA", "TARAPOTO", "CUSCO" }));
        cbxFiltroDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFiltroDestinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(27, 27, 27)
                                .addComponent(txPrecioPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCalculaPrecioPaq)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(112, 112, 112)
                                                .addComponent(txCodPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnListarPaquetes, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnActualizaPaquete, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnElininaPaquete, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(btnBuscarPaquetes))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(btnAgregaPaquete)))
                                .addGap(18, 18, 18))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(cbxFiltroDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11)
                    .addComponent(cbxFiltroDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txCodPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarPaquetes))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregaPaquete))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txPrecioPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCalculaPrecioPaq)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnListarPaquetes)
                                .addGap(18, 18, 18)
                                .addComponent(btnActualizaPaquete)
                                .addGap(18, 18, 18)
                                .addComponent(btnElininaPaquete)))
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarVuelosActionPerformed
        listarVuelo(objv.data());
    }//GEN-LAST:event_btnListarVuelosActionPerformed

    private void btnBuscarVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVuelosActionPerformed
        int cod=Integer.parseInt(txtCodVuelos.getText());
        Vuelo vu=objv.buscar(objv.obtenerPosicion(cod));
        limpiaTablaVuelo();
        if(vu.getCodigo()==cod)
        tableVuelo.setValueAt(vu.getCodigo(),0,0);
        tableVuelo.setValueAt(vu.getAerolinea(),0,1);
        tableVuelo.setValueAt(vu.getFecha(),0,2);
        tableVuelo.setValueAt(vu.getHora(),0,3);
        tableVuelo.setValueAt(vu.getDestino(),0,4);
        tableVuelo.setValueAt(vu.getCant_asientos(),0,5);
        
    }//GEN-LAST:event_btnBuscarVuelosActionPerformed

    private void btnBuscarHotelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarHotelesActionPerformed
        
        int cod=Integer.parseInt(txtCodHoteles.getText());
        Hotel h=objh.buscar(objh.obtenerPosicion(cod));
        limpiaTablaHotel();
        if(h.getCodigo()==cod)
        tableHotel.setValueAt(h.getCodigo(), 0, 0);
        tableHotel.setValueAt(h.getNombre(), 0, 1);
        tableHotel.setValueAt(h.getCategoria(), 0, 2);
        tableHotel.setValueAt(h.getHabitaciones(), 0, 3);

    }//GEN-LAST:event_btnBuscarHotelesActionPerformed

    private void btnListarHotelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarHotelesActionPerformed
        listarHotel(objh.data());
    }//GEN-LAST:event_btnListarHotelesActionPerformed

    private void btnBuscarToursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarToursActionPerformed
        int cod=Integer.parseInt(txtCodTours.getText());
        Tour t=objt.buscar(objt.obtenerPosicion(cod));
        limpiaTablaTour();
        if(t.getCodigo()==cod)
        tableTour.setValueAt(t.getCodigo(), 0, 0);
        tableTour.setValueAt(t.getNombre(), 0, 1);
        tableTour.setValueAt(t.getDestino(), 0, 2);
//        tableTour.setValueAt(t.getArrayActividades().size(), 0, 3);
    }//GEN-LAST:event_btnBuscarToursActionPerformed

    private void btnListarToursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarToursActionPerformed
        listarTour(objt.data());
    }//GEN-LAST:event_btnListarToursActionPerformed

    private void btnListarPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPaquetesActionPerformed
        listarPaquete();
    }//GEN-LAST:event_btnListarPaquetesActionPerformed

    private void btnBuscarPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPaquetesActionPerformed
        int cod=Integer.parseInt(txCodPaquete.getText());
        Paquete p=obj.buscar(obj.obtenerPosicion(cod));
        txDetalle.setText(p.getDetalle());
        txServVuelo.setText(""+p.getCod_vuelo());
        txServTour.setText(""+p.getCod_tour());
        txServHotel.setText(""+p.getCod_hotel());
        txPrecioPaquete.setText(""+p.getPrecio());
        
    }//GEN-LAST:event_btnBuscarPaquetesActionPerformed

    private void cbxFiltroDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFiltroDestinoActionPerformed
        String destino=(String)cbxFiltroDestino.getSelectedItem();
        listarVuelo(objv.datosporDestino(destino));
        listarHotel(objh.datosporDestino(destino));
        listarTour(objt.datosporDestino(destino));
    }//GEN-LAST:event_cbxFiltroDestinoActionPerformed

    private void btnAgregaPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregaPaqueteActionPerformed
        String detalle=txDetalle.getText();
        int codVuelo=Integer.parseInt(txServVuelo.getText());
        int codHotel=Integer.parseInt(txServHotel.getText());
        int codTour=Integer.parseInt(txServTour.getText());
        double precio=Double.parseDouble(txPrecioPaquete.getText());
        Paquete p=new Paquete(precio, codVuelo, codHotel, codTour, detalle);
        obj.agregar(p);
        listarPaquete();
        limpiarCamposPaquete();
    }//GEN-LAST:event_btnAgregaPaqueteActionPerformed

    private void btnActualizaPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizaPaqueteActionPerformed
        int pos=obj.obtenerPosicion(Integer.parseInt(txCodPaquete.getText()));
        Paquete p=obj.buscar(pos);
        String detalle=txDetalle.getText();
        int codVuelo=Integer.parseInt(txServVuelo.getText());
        int codHotel=Integer.parseInt(txServHotel.getText());
        int codTour=Integer.parseInt(txServTour.getText());
        double precio=Double.parseDouble(txPrecioPaquete.getText());
        p.setDetalle(detalle);p.setCod_hotel(codHotel);
        p.setCod_tour(codTour);p.setCod_vuelo(codVuelo);
        p.setPrecio(precio);
        obj.actualizar(pos, p);
        listarPaquete();
        limpiarCamposPaquete();
    }//GEN-LAST:event_btnActualizaPaqueteActionPerformed

    private void btnElininaPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElininaPaqueteActionPerformed
        int pos=obj.obtenerPosicion(Integer.parseInt(txCodPaquete.getText()));
        obj.eliminar(pos);
        listarPaquete();
        limpiarCamposPaquete();
    }//GEN-LAST:event_btnElininaPaqueteActionPerformed

    private void btnCalculaPrecioPaqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculaPrecioPaqActionPerformed
        
    }//GEN-LAST:event_btnCalculaPrecioPaqActionPerformed
    
    /*metodos */
    private void limpiaTablaHotel(){
        for(int i=0;i<tableHotel.getRowCount();i++){
            for(int c=0;c<tableHotel.getColumnCount();c++){
                tableHotel.setValueAt("", i, c);
            }
        }
    }
    private void limpiaTablaVuelo(){
        for(int i=0;i<tableVuelo.getRowCount();i++){
            for(int c=0;c<tableVuelo.getColumnCount();c++){
                tableVuelo.setValueAt("", i, c);
            }
        }
    }
    private void limpiaTablaTour(){
        for(int i=0;i<tableTour.getRowCount();i++){
            for(int c=0;c<tableTour.getColumnCount();c++){
                tableTour.setValueAt("", i, c);
            }
        }
    }
    void listarHotel(List<Hotel> x){
        DefaultTableModel dt=(DefaultTableModel)tableHotel.getModel();
        dt.setRowCount(0);
        for(Hotel h: x){
            Object v[]={h.getCodigo(),h.getNombre(),h.getCategoria(),h.getHabitaciones().size()};
            dt.addRow(v);
        }
    }
    void listarVuelo(List<Vuelo> x){
        DefaultTableModel dt=(DefaultTableModel)tableVuelo.getModel();
        dt.setRowCount(0);
        for(Vuelo vu: x){
            Object v[]={vu.getCodigo(),vu.getAerolinea(),vu.getFecha(), vu.getHora(),vu.getDestino(), vu.getCant_asientos()};
            dt.addRow(v);
        }
    }
    void listarTour(List<Tour> x){
        DefaultTableModel dt=(DefaultTableModel)tableTour.getModel();
        dt.setRowCount(0);
        for(Tour t: x){
            Object v[]={t.getCodigo(), t.getNombre(), t.getDestino(), t.getNum_Actividades()};
            dt.addRow(v);
        }
    }
    void listarPaquete(){
        DefaultTableModel dt=(DefaultTableModel)jTable1.getModel();
        dt.setRowCount(0);
        for(Paquete p: obj.data()){
            Object v[]={p.getCod_Paquete(), p.getCod_vuelo(), p.getCod_tour(), p.getCod_hotel(), p.getPrecio()};
            dt.addRow(v);
        }
    }
    void limpiarCamposPaquete(){
        txCodPaquete.setText("");txDetalle.setText("");
        txPrecioPaquete.setText("");txServHotel.setText("");
        txServTour.setText("");txServVuelo.setText("");
        txDetalle.requestFocus();
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
            java.util.logging.Logger.getLogger(FormPaquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPaquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPaquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPaquetes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPaquetes().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizaPaquete;
    private javax.swing.JButton btnAgregaPaquete;
    private javax.swing.JButton btnBuscarHoteles;
    private javax.swing.JButton btnBuscarPaquetes;
    private javax.swing.JButton btnBuscarTours;
    private javax.swing.JButton btnBuscarVuelos;
    private javax.swing.JButton btnCalculaPrecioPaq;
    private javax.swing.JButton btnElininaPaquete;
    private javax.swing.JButton btnListarHoteles;
    private javax.swing.JButton btnListarPaquetes;
    private javax.swing.JButton btnListarTours;
    private javax.swing.JButton btnListarVuelos;
    private javax.swing.JComboBox<String> cbxFiltroDestino;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tableHotel;
    private javax.swing.JTable tableTour;
    private javax.swing.JTable tableVuelo;
    private javax.swing.JTextField txCodPaquete;
    private javax.swing.JTextField txDetalle;
    private javax.swing.JTextField txPrecioPaquete;
    private javax.swing.JTextField txServHotel;
    private javax.swing.JTextField txServTour;
    private javax.swing.JTextField txServVuelo;
    private javax.swing.JTextField txtCodHoteles;
    private javax.swing.JTextField txtCodTours;
    private javax.swing.JTextField txtCodVuelos;
    // End of variables declaration//GEN-END:variables
}
