/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Encounter;
import Model.EncounterData;
import Model.UserData;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lokeshbalamurugan
 */
public class ViewAppointmentsDoctor extends javax.swing.JPanel {

    /**
     * Creates new form ViewAppointmentsDoctor
     */
    UserData userData;
    EncounterData encData;
    String username;
    public ViewAppointmentsDoctor(String username) {
        initComponents();
        this.username = username;
        populateTable();
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
        AppointmentTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));

        AppointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Hospital", "Patient", "BP", "Temperature", "Pulse", "Comments"
            }
        ));
        jScrollPane1.setViewportView(AppointmentTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
private void populateTable() {
        DefaultTableModel model= (DefaultTableModel) AppointmentTable.getModel();
        model.setRowCount(0);
        encData = new EncounterData();
        userData = new UserData();
        for(Encounter obj : encData.getEncounterDataFromDbForDoctor(username,"encounter")){
            Object[] row= new Object[6];
            row[0] = obj;
            row[1] = userData.searchOrgNameInDb(obj.getPatientUsername());
            row[2] = obj.getBp();
            row[3] = obj.getTemp();
            row[4] = obj.getPulse();
            row[5] = obj.getComments();
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AppointmentTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
