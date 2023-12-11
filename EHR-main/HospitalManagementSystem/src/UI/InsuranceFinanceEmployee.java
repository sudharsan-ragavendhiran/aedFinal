/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.awt.Color;
import javax.swing.SwingUtilities;

/**
 *
 * @author lokeshbalamurugan
 */
public class InsuranceFinanceEmployee extends javax.swing.JPanel {

    /**
     * Creates new form InsuranceFinanceEmployee
     */
    Color MouseEnterColor = new Color(255,102,102);
    Color MouseExitColor = new Color(153,204,255);
    String username;
    public InsuranceFinanceEmployee(String username) {
        initComponents();
        this.username = username;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel5 = new javax.swing.JPanel();
        CreateUserJPanel = new javax.swing.JPanel();
        lblUserCreate = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));

        CreateUserJPanel.setBackground(new java.awt.Color(255, 0, 0));
        CreateUserJPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateUserJPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CreateUserJPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CreateUserJPanelMouseExited(evt);
            }
        });

        lblUserCreate.setBackground(new java.awt.Color(255, 255, 255));
        lblUserCreate.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        lblUserCreate.setForeground(new java.awt.Color(255, 255, 255));
        lblUserCreate.setText("INSURANCE CLAIM FORWARDS");
        lblUserCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUserCreateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblUserCreateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblUserCreateMouseExited(evt);
            }
        });

        javax.swing.GroupLayout CreateUserJPanelLayout = new javax.swing.GroupLayout(CreateUserJPanel);
        CreateUserJPanel.setLayout(CreateUserJPanelLayout);
        CreateUserJPanelLayout.setHorizontalGroup(
            CreateUserJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateUserJPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(lblUserCreate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CreateUserJPanelLayout.setVerticalGroup(
            CreateUserJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateUserJPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblUserCreate)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Menlo", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 204, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ICONS/Logout-icon-2.png"))); // NOI18N
        jLabel12.setText("Logout");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CreateUserJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(CreateUserJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 506, Short.MAX_VALUE)
                .addComponent(jLabel12))
        );

        jSplitPane1.setLeftComponent(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel9)
                .addContainerGap(1027, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel9)
                .addContainerGap(398, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel6);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 67));

        jLabel3.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("HOSPITAL");

        jLabel5.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MANAGEMENT");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ICONS/Arrows-Forward-icon-2.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INSURANCE FIRM NAME");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ICONS/Arrows-Forward-icon-2.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("FINANCE");

        jLabel1.setFont(new java.awt.Font("Papyrus", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome Employee");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(1, 1, 1))))))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1571, Short.MAX_VALUE)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblUserCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserCreateMouseClicked
        // TODO add your handling code here:
        InsruanceListFinance ilf = new InsruanceListFinance(username);
        jSplitPane1.setRightComponent(ilf);
    }//GEN-LAST:event_lblUserCreateMouseClicked

    private void lblUserCreateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserCreateMouseEntered
        // TODO add your handling code here:
        lblUserCreate.setBackground(MouseEnterColor);
    }//GEN-LAST:event_lblUserCreateMouseEntered

    private void lblUserCreateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserCreateMouseExited
        // TODO add your handling code here:
        lblUserCreate.setBackground(MouseExitColor);
    }//GEN-LAST:event_lblUserCreateMouseExited

    private void CreateUserJPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateUserJPanelMouseClicked
        // TODO add your handling code here:
        InsruanceListFinance ilf = new InsruanceListFinance(username);
        jSplitPane1.setRightComponent(ilf);
    }//GEN-LAST:event_CreateUserJPanelMouseClicked

    private void CreateUserJPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateUserJPanelMouseEntered
        // TODO add your handling code here:
        CreateUserJPanel.setBackground(MouseEnterColor);
    }//GEN-LAST:event_CreateUserJPanelMouseEntered

    private void CreateUserJPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateUserJPanelMouseExited
        // TODO add your handling code here:
        CreateUserJPanel.setBackground(MouseExitColor);
    }//GEN-LAST:event_CreateUserJPanelMouseExited

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        Login login1 = new Login();
        Login login = (Login) SwingUtilities.getRoot(this);
        login1.setVisible(true);
        login.setVisible(false);
    }//GEN-LAST:event_jLabel12MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CreateUserJPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblUserCreate;
    // End of variables declaration//GEN-END:variables
}
