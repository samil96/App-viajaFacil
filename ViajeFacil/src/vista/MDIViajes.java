/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Valia
 */
public class MDIViajes extends javax.swing.JFrame {

    /**
     * Creates new form MDIViajes
     */
    public MDIViajes() {
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

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        Iclientes = new javax.swing.JMenuItem();
        Ivendedor = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        Ipaquetes = new javax.swing.JMenuItem();
        Ivuelos = new javax.swing.JMenuItem();
        Ihoteles = new javax.swing.JMenuItem();
        Itours = new javax.swing.JMenuItem();
        editMenu1 = new javax.swing.JMenu();
        cutMenuItem1 = new javax.swing.JMenuItem();
        copyMenuItem1 = new javax.swing.JMenuItem();
        pasteMenuItem1 = new javax.swing.JMenuItem();
        deleteMenuItem1 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(204, 204, 204));

        fileMenu.setMnemonic('f');
        fileMenu.setText("Menú");

        Iclientes.setMnemonic('o');
        Iclientes.setText("Cliente");
        Iclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IclientesActionPerformed(evt);
            }
        });
        fileMenu.add(Iclientes);

        Ivendedor.setMnemonic('a');
        Ivendedor.setText("Vendedor");
        Ivendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IvendedorActionPerformed(evt);
            }
        });
        fileMenu.add(Ivendedor);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Servicios");

        Ipaquetes.setMnemonic('t');
        Ipaquetes.setText("Paquetes");
        Ipaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IpaquetesActionPerformed(evt);
            }
        });
        editMenu.add(Ipaquetes);

        Ivuelos.setMnemonic('y');
        Ivuelos.setText("Vuelos");
        Ivuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IvuelosActionPerformed(evt);
            }
        });
        editMenu.add(Ivuelos);

        Ihoteles.setMnemonic('p');
        Ihoteles.setText("Hoteles");
        Ihoteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IhotelesActionPerformed(evt);
            }
        });
        editMenu.add(Ihoteles);

        Itours.setMnemonic('d');
        Itours.setText("Tours");
        editMenu.add(Itours);

        menuBar.add(editMenu);

        editMenu1.setMnemonic('e');
        editMenu1.setText("Reporte");

        cutMenuItem1.setMnemonic('t');
        cutMenuItem1.setText("Cut");
        editMenu1.add(cutMenuItem1);

        copyMenuItem1.setMnemonic('y');
        copyMenuItem1.setText("Copy");
        editMenu1.add(copyMenuItem1);

        pasteMenuItem1.setMnemonic('p');
        pasteMenuItem1.setText("Paste");
        editMenu1.add(pasteMenuItem1);

        deleteMenuItem1.setMnemonic('d');
        deleteMenuItem1.setText("Delete");
        editMenu1.add(deleteMenuItem1);

        menuBar.add(editMenu1);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void IclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IclientesActionPerformed
        FormClientes verFormClientes = new FormClientes();
        verFormClientes.setVisible(true);
        desktopPane.add(verFormClientes);
    }//GEN-LAST:event_IclientesActionPerformed

    private void IvendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IvendedorActionPerformed
        FormVendedor verFormVendedor = new FormVendedor();
        verFormVendedor.setVisible(true);
        desktopPane.add(verFormVendedor);
    }//GEN-LAST:event_IvendedorActionPerformed

    private void IpaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IpaquetesActionPerformed
        FormPaquetes verFormPaquetes = new FormPaquetes();
        verFormPaquetes.setVisible(true);
        desktopPane.add(verFormPaquetes);

    }//GEN-LAST:event_IpaquetesActionPerformed

    private void IvuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IvuelosActionPerformed
        FormVuelos verFormVuelos = new FormVuelos();
        verFormVuelos.setVisible(true);
        desktopPane.add(verFormVuelos);
    }//GEN-LAST:event_IvuelosActionPerformed

    private void IhotelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IhotelesActionPerformed
        FormHoteles verFormHoteles = new FormHoteles();
        verFormHoteles.setVisible(true);
        desktopPane.add(verFormHoteles);
    }//GEN-LAST:event_IhotelesActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MDIViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDIViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDIViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIViajes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDIViajes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Iclientes;
    private javax.swing.JMenuItem Ihoteles;
    private javax.swing.JMenuItem Ipaquetes;
    private javax.swing.JMenuItem Itours;
    private javax.swing.JMenuItem Ivendedor;
    private javax.swing.JMenuItem Ivuelos;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem1;
    private javax.swing.JMenuItem cutMenuItem1;
    private javax.swing.JMenuItem deleteMenuItem1;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu editMenu1;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem pasteMenuItem1;
    // End of variables declaration//GEN-END:variables

}