/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.orderrequestData;
import java.awt.Color;
import javax.swing.SwingUtilities;

/**
 *
 * @author lokeshbalamurugan
 */
public class SupplierHome extends javax.swing.JPanel {

    /**
     * Creates new form SupplierHome
     */
    String username;
    orderrequestData orD;
    Color MouseEnterColor = new Color(255,102,102);
    Color MouseExitColor = new Color(153,204,255);
    public SupplierHome(String username, orderrequestData orD) {
        initComponents();
        this.username = username;
        this.orD = orD;
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
        ViewUserJPanel = new javax.swing.JPanel();
        UserViewlbl = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));

        CreateUserJPanel.setBackground(new java.awt.Color(153, 204, 255));
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
        lblUserCreate.setFont(new java.awt.Font("Menlo", 1, 13)); // NOI18N
        lblUserCreate.setForeground(new java.awt.Color(255, 255, 255));
        lblUserCreate.setText("VIEW ORDERS");
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
                .addGap(99, 99, 99)
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

        ViewUserJPanel.setBackground(new java.awt.Color(153, 204, 255));
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

        UserViewlbl.setFont(new java.awt.Font("Menlo", 1, 13)); // NOI18N
        UserViewlbl.setForeground(new java.awt.Color(255, 255, 255));
        UserViewlbl.setText("PROCESS ORDERS");
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
            .addGroup(ViewUserJPanelLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(UserViewlbl)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        ViewUserJPanelLayout.setVerticalGroup(
            ViewUserJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewUserJPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(UserViewlbl)
                .addContainerGap(22, Short.MAX_VALUE))
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
            .addComponent(ViewUserJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(33, 33, 33)
                .addComponent(ViewUserJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 416, Short.MAX_VALUE)
                .addComponent(jLabel12))
        );

        jSplitPane1.setLeftComponent(jPanel5);

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ICONS/Messenger-cuate-2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel9)
                .addGap(113, 113, 113)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel6);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 67));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ICONS/Very-Basic-Menu-icon.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("l");

        jLabel3.setFont(new java.awt.Font("Menlo", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SUPPLIER");

        jLabel5.setFont(new java.awt.Font("Menlo", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Menlo", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Menlo", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ICONS/kindpng_332985-2.png"))); // NOI18N
        jLabel7.setText("Welcome!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1478, Short.MAX_VALUE)
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
        SupplierViewOrders svo = new SupplierViewOrders(username, orD);
        jSplitPane1.setRightComponent(svo);
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
        SupplierViewOrders svo = new SupplierViewOrders(username, orD);
        jSplitPane1.setRightComponent(svo);
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
        SupplierProcessOrders spo = new SupplierProcessOrders(username, orD);
        jSplitPane1.setRightComponent(spo);
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
        SupplierProcessOrders spo = new SupplierProcessOrders(username, orD);
        jSplitPane1.setRightComponent(spo);
    }//GEN-LAST:event_ViewUserJPanelMouseClicked

    private void ViewUserJPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewUserJPanelMouseEntered
        // TODO add your handling code here:
        ViewUserJPanel.setBackground(MouseEnterColor);
    }//GEN-LAST:event_ViewUserJPanelMouseEntered

    private void ViewUserJPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewUserJPanelMouseExited
        // TODO add your handling code here:
        ViewUserJPanel.setBackground(MouseExitColor);
    }//GEN-LAST:event_ViewUserJPanelMouseExited

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        Login login1 = new Login();
        Login login = (Login) SwingUtilities.getRoot(this);
        login1.setVisible(true);
        login.setVisible(false);
    }//GEN-LAST:event_jLabel12MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CreateUserJPanel;
    private javax.swing.JLabel UserViewlbl;
    private javax.swing.JPanel ViewUserJPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblUserCreate;
    // End of variables declaration//GEN-END:variables
}
