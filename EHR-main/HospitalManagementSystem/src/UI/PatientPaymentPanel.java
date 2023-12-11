
package UI;

import Model.Encounter;
import Model.EncounterInfo;
import Model.InsurancePolicyInfo;
import Model.UserInfo;
import Model.patientPurchase;
import Model.patientPurchaseHistory;
import SQLConnection.SQLConnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PatientPaymentPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientPaymentPanel
     */
    patientPurchaseHistory purchaseData;
    String username;
    Color MouseEnterColor = new Color(255,102,102);
    Color MouseExitColor = new Color(255,255,255);
    public PatientPaymentPanel(String username) {
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
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item", "Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Papyrus", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("PAY USING CASH OR CARDS");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Papyrus", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("CLAIM INSURANCE");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel2)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
      
        
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jPanel1MouseExited

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
      
    }//GEN-LAST:event_jPanel2MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        int selectedRowIndex= jTable1.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to view!");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        patientPurchase pd= (patientPurchase) model.getValueAt(selectedRowIndex,0);
        try {
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test;";
            //JOptionPane.showMessageDialog(this,userData.searchUNameInDb(userName));
            stmt.executeUpdate(qry);
            qry="update patientPurchasehistory set status = 'paid' where id = '"+pd.getId()+"';";
            stmt.executeUpdate(qry);
            populateTable();
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        int selectedRowIndex= jTable1.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to view!");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        patientPurchase pd= (patientPurchase) model.getValueAt(selectedRowIndex,0);
        InsurancePolicyInfo policyData = new InsurancePolicyInfo();
        int polId = policyData.getPolicyIdFromDb(username);
        if(polId!=0){
            try {
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test;";
            //JOptionPane.showMessageDialog(this,userData.searchUNameInDb(userName));
            stmt.executeUpdate(qry);
            qry="INSERT INTO InsuranceClaimsData (patientusername, insuranceagencyid, amount, approval1, purchaseid) VALUES ('"+username+"','"+polId+"','"+pd.getPrice()+"', 'pending','"+pd.getId()+"');";
            //JOptionPane.showMessageDialog(this, qry);
            stmt.executeUpdate(qry);
            populateTable();
            JOptionPane.showMessageDialog(this, "claim sent for approval");
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            //JOptionPane.showMessageDialog(this, "hiii");
            System.out.print(ex.getMessage());
        }
            
        }else{
            JOptionPane.showMessageDialog(this, "Unable to claim via policy");
        }
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void populateTable() {
        purchaseData = new patientPurchaseHistory();
                
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        //encData = new EncounterInfo();
        //userData = new UserInfo();
        //JOptionPane.showMessageDialog(this,username);
        for(patientPurchase obj : purchaseData.getPatientPurchaseBypatientFromDb(username, "pending")){
            Object[] row= new Object[3];
            row[0] = obj;
            row[1] = obj.getQty();
            row[2] = obj.getPrice();
//            row[3] = obj.getTemp();
//            row[4] = obj.getPulse();
//            row[4] = obj;
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
