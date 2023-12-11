/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.InsuranceClaimsData;
import Model.InsurancePolicyData;
import Model.UserData;
import java.awt.Color;
import javax.swing.SwingUtilities;

/**
 *
 * @author lokeshbalamurugan
 */
public class HeadManageInsurance extends javax.swing.JPanel {

    /**
     * Creates new form HeadManageInsurance
     */
    String username;
    UserData userData; 
    InsuranceClaimsData icD;
    InsurancePolicyData ipD;
    Color MouseEnterColor = new Color(255,102,102);
    Color MouseExitColor = new Color(153,204,255);
    public HeadManageInsurance(String username,     UserData userData, InsuranceClaimsData icD, InsurancePolicyData ipD) {
        initComponents();
        this.username=username;
        this.userData = userData;
        this.icD = icD;
        this.ipD = ipD;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel5 = new javax.swing.JPanel();
        CreateUserJPanel = new javax.swing.JPanel();
        lblUserCreate = new javax.swing.JLabel();
        ViewUserJPanel = new javax.swing.JPanel();
        UserViewlbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 67));

        jLabel3.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INSURANCE");

        jLabel5.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FIRM MANAGEMENT");

        jLabel2.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INSURANCE MANAGEMENT");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Papyrus", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

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
        lblUserCreate.setText("INSURANCE CLAIMS");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateUserJPanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lblUserCreate)
                .addGap(89, 89, 89))
        );
        CreateUserJPanelLayout.setVerticalGroup(
            CreateUserJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateUserJPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblUserCreate)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        ViewUserJPanel.setBackground(new java.awt.Color(255, 0, 0));
        ViewUserJPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewUserJPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ViewUserJPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ViewUserJPanelMouseExited(evt);
            }
        });

        UserViewlbl.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        UserViewlbl.setForeground(new java.awt.Color(255, 255, 255));
        UserViewlbl.setText("MANAGE POLICIES");
        UserViewlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserViewlblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UserViewlblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserViewlblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ViewUserJPanelLayout = new javax.swing.GroupLayout(ViewUserJPanel);
        ViewUserJPanel.setLayout(ViewUserJPanelLayout);
        ViewUserJPanelLayout.setHorizontalGroup(
            ViewUserJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewUserJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UserViewlbl)
                .addGap(94, 94, 94))
        );
        ViewUserJPanelLayout.setVerticalGroup(
            ViewUserJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewUserJPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(UserViewlbl)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Menlo", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 204, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ICONS/back-icon.png"))); // NOI18N
        jLabel8.setText("GO BACK");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CreateUserJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ViewUserJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(CreateUserJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(ViewUserJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 398, Short.MAX_VALUE)
                .addComponent(jLabel8))
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
                .addContainerGap(977, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel9)
                .addContainerGap(392, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1479, Short.MAX_VALUE)
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
        HeadInsuranceClaims hic = new HeadInsuranceClaims(username, icD);
        jSplitPane1.setRightComponent(hic);
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
        HeadInsuranceClaims hic = new HeadInsuranceClaims(username, icD);
        jSplitPane1.setRightComponent(hic);
    }//GEN-LAST:event_CreateUserJPanelMouseClicked

    private void CreateUserJPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateUserJPanelMouseEntered
        // TODO add your handling code here:
        CreateUserJPanel.setBackground(MouseEnterColor);
    }//GEN-LAST:event_CreateUserJPanelMouseEntered

    private void CreateUserJPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateUserJPanelMouseExited
        // TODO add your handling code here:
        CreateUserJPanel.setBackground(MouseExitColor);
    }//GEN-LAST:event_CreateUserJPanelMouseExited

    private void UserViewlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserViewlblMouseClicked
        // TODO add your handling code here:
        HeadManagePolicy hmp = new HeadManagePolicy(username, ipD);
        jSplitPane1.setRightComponent(hmp);
    }//GEN-LAST:event_UserViewlblMouseClicked

    private void UserViewlblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserViewlblMouseEntered
        // TODO add your handling code here:
        UserViewlbl.setBackground(MouseEnterColor);
    }//GEN-LAST:event_UserViewlblMouseEntered

    private void UserViewlblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserViewlblMouseExited
        // TODO add your handling code here:
        UserViewlbl.setBackground(MouseExitColor);
    }//GEN-LAST:event_UserViewlblMouseExited

    private void ViewUserJPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewUserJPanelMouseClicked
        // TODO add your handling code here:
        HeadManagePolicy hmp = new HeadManagePolicy(username, ipD);
        jSplitPane1.setRightComponent(hmp);
    }//GEN-LAST:event_ViewUserJPanelMouseClicked

    private void ViewUserJPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewUserJPanelMouseEntered
        // TODO add your handling code here:
        ViewUserJPanel.setBackground(MouseEnterColor);
    }//GEN-LAST:event_ViewUserJPanelMouseEntered

    private void ViewUserJPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewUserJPanelMouseExited
        // TODO add your handling code here:
        ViewUserJPanel.setBackground(MouseExitColor);
    }//GEN-LAST:event_ViewUserJPanelMouseExited

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        InsuranceHeadHome  ihh = new InsuranceHeadHome(username, userData, icD, ipD);
        Login login = (Login) SwingUtilities.getRoot(this);
        login.setContentPane(ihh);
        login.invalidate();
        login.validate();
    }//GEN-LAST:event_jLabel8MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CreateUserJPanel;
    private javax.swing.JLabel UserViewlbl;
    private javax.swing.JPanel ViewUserJPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblUserCreate;
    // End of variables declaration//GEN-END:variables
}
