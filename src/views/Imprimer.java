/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Client;

import models.Location;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;
import pfe.UtilConnexion;

/**
 *
 * @author saad
 */
public class Imprimer extends javax.swing.JInternalFrame {

    /**
     * Creates new form Imprimer
     */
    Connection con;
    int pos=0;
    ArrayList<Client> le = new ArrayList<Client>();

    public Imprimer() {
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

        btnimprimer1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        btnimprimer1.setBackground(new java.awt.Color(204, 255, 204));
        btnimprimer1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnimprimer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_print_26px.png"))); // NOI18N
        btnimprimer1.setText("Imprimer");
        btnimprimer1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnimprimer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimprimer1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Selectionner un Location:");

        combo.setForeground(new java.awt.Color(204, 204, 255));
        combo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 117, 128));
        jLabel4.setText("Imprimer Les clients d'un Adresse Specifier");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnimprimer1)
                .addGap(609, 609, 609))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(404, 404, 404)
                        .addComponent(jLabel3)
                        .addGap(48, 48, 48)
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(337, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel4)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addComponent(btnimprimer1)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            // TODO add your handling code here:
            Connection con = UtilConnexion.seConnecter();
            Statement s = con.createStatement();

            ResultSet r = s.executeQuery("select * from location");
            while (r.next()) {

                combo.addItem(new Location(r.getInt("ID_LOC"),
                        r.getString("RUE_ADRESSE"), r.getString("VILLE"), r.getInt("CODE_POSTAL")));
            }
            s.close();
            r.close();
          
        } catch (Exception ex) {
            Logger.getLogger(Imprimer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnimprimer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimer1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            JasperDesign jd = JRXmlLoader.load("src\\reporting\\Clients.jrxml");
            JasperReport jr = JasperCompileManager.compileReport(jd);
            Location g = (Location) combo.getSelectedItem();
            Map param = new HashMap();
            param.put("ID_LOC", g.getId_loc());
            JasperPrint jp = JasperFillManager.fillReport(jr, param, UtilConnexion.seConnecter());
            JRViewer view = new JRViewer(jp);
            FrameImpression i = new FrameImpression();
            i.getContentPane().add(view);
            JasperExportManager.exportReportToPdfFile(jp, "src\\reporting\\Clients.jrxml.pdf");
            JasperExportManager.exportReportToPdfFile(jp, "src\\reporting\\Clients.jrxml.pdf");
        } catch (Exception ex) {
            Logger.getLogger(Imprimer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnimprimer1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnimprimer1;
    private javax.swing.JComboBox combo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

   
}
