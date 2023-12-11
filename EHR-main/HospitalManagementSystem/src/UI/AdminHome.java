/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.UserData;
import UI.Login;
import UI.ManageHospital;
import UI.UserCreation;
import UI.UserManagement;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import Model.Hospital;
import Model.HospitalData;
import Model.pharmacy;
import Model.pharmacyData;
import Model.User;
import Model.UserData;
import Model.InsuranceAgency;
import Model.InsuranceAgencyData;
import Model.Supplier;
import Model.SupplierData;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author lokeshbalamurugan
 */
public class AdminHome extends javax.swing.JPanel {

    /**
     * Creates new form AdminHome
     */
    
    //HospitalData hosData = new HospitalData();
    //pharmacyData pharmData = new pharmacyData();
    InsuranceAgencyData insuranceData = new InsuranceAgencyData();
    //SupplierData suppData = new SupplierData();
    
    HospitalData hosData;
    UserData userData;
    pharmacyData pharmData;
    SupplierData suppData;
    Color MouseEnterColor = new Color(255,102,102);
    Color MouseExitColor = new Color(153,204,255);
    public AdminHome(UserData userData, HospitalData hosData, pharmacyData pharmData, SupplierData suppData) {
        initComponents();
        this.hosData = hosData;
        this.userData = userData;
        this.pharmData = pharmData;
        this.suppData = suppData;
        
        populateHospitalTable();
        populatePharmacyTable();
        populateUserTable();
        populateInsuranceTable();
        populateSupplierTable();
    }
    
    private void populateHospitalTable() {
        DefaultTableModel model = (DefaultTableModel) HospitalTable.getModel();
        model.setRowCount(0);

        for (Hospital hospital : hosData.getHospitalDataFromDb()) {
            Object[] row = {hospital.getName(), hospital.getCity(), hospital.getAddress()};
//            row[0] = hospital.getName();
//            row[1] = hospital.getCity();
//            row[2] = hospital.getAddress();

            model.addRow(row);
        }
    }
    
    private void populateSupplierTable() {
        DefaultTableModel model = (DefaultTableModel) SupplierTable.getModel();
        model.setRowCount(0);

        for (Supplier supp : suppData.getSupplierDataFromDb()) {
            Object[] row = {supp.getName(), supp.getCity()};
//            row[0] = supp.getName();
//            row[1] = supp.getCity();
//            row[2] = supp.getPharmacy();

            model.addRow(row);

//            for (int i = 0; i < supp.size(); i++){
//                int position = originalLeagueList.get(i).getPosition();
//                String name = originalLeagueList.get(i).getName();
//                int points = originalLeagueList.get(i).getPoinst();
//                int wins = originalLeagueList.get(i).getWins();
//                int defeats = originalLeagueList.get(i).getDefeats();
//                int draws = originalLeagueList.get(i).getDraws();
//                int totalMatches = originalLeagueList.get(i).getTotalMathces();
//                int goalF = originalLeagueList.get(i).getGoalF();
//                int goalA = originalLeagueList.get(i).getGoalA();
//                int tgoalD = originalLeagueList.get(i).getTtgoalD();
//
//                Object[] data = {position, name, points, wins, defeats, draws, totalMatches, goalF, goalA, ttgoalD};
//
//                model.add(data);
//
//            }
        }

        
    }
    
    private void populatePharmacyTable() {
        DefaultTableModel model = (DefaultTableModel) PharmacyTable.getModel();
        model.setRowCount(0);

        for (pharmacy pharm : pharmData.getPharmacyDataFromDb()) {
            Object[] row = {pharm.getName(), pharm.getCity()};
//            row[0] = pharm.getName();
//            row[1] = pharm.getCity();
//            row[2] = pharm.getHospital();

            model.addRow(row);
        }
    }
    
    private void populateUserTable() {
        DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
        model.setRowCount(0);

        for (User us : this.userData.getUserDataFromDb()) {
            Object[] row = {us.getName(), us.getOrg(), us.getRole()};
//            row[0] = us.getName();
//            row[1] = us.getOrgName();
//            row[2] = us.getRole();
//            row[3] = us.getDob();

            model.addRow(row);
        }
    }
    
    private void populateInsuranceTable() {
        DefaultTableModel model = (DefaultTableModel) InsuranceTable.getModel();
        model.setRowCount(0);

        for (InsuranceAgency insurance : insuranceData.getInsuranceAgencyDataFromDb()) {
            Object[] row = {insurance.getName(), insurance.getCity()};
//            row[0] = insurance.getName();
//            row[1] = insurance.getCity();

            model.addRow(row);
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ManageUserJPanel = new javax.swing.JPanel();
        lblCreateUser = new javax.swing.JLabel();
        ManageHospitalJPanel = new javax.swing.JPanel();
        lblRegHospital = new javax.swing.JLabel();
        ManagePharmacyJPanel = new javax.swing.JPanel();
        lblRegPharmacy = new javax.swing.JLabel();
        ManageInsuranceJPanel = new javax.swing.JPanel();
        lblRegisterIns = new javax.swing.JLabel();
        ManageSupplierJPanel = new javax.swing.JPanel();
        lblRegSupplier = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        PharmacyTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        InsuranceTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        SupplierTable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        HospitalTable = new javax.swing.JTable();
        lblPT = new javax.swing.JLabel();
        lblUT = new javax.swing.JLabel();
        lblHosT = new javax.swing.JLabel();
        lblIT = new javax.swing.JLabel();
        lblST = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ICONS/Very-Basic-Menu-icon.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Menlo", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ICONS/Users-icon.png"))); // NOI18N
        jLabel2.setText(" Welcome Admin!");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("l");

        jLabel3.setFont(new java.awt.Font("Menlo", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("HOSPITAL");

        jLabel5.setFont(new java.awt.Font("Menlo", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MANAGEMENT");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ICONS/User-Interface-Menu-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        ManageUserJPanel.setBackground(new java.awt.Color(153, 204, 255));
        ManageUserJPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageUserJPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManageUserJPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManageUserJPanelMouseExited(evt);
            }
        });

        lblCreateUser.setFont(new java.awt.Font("Menlo", 1, 13)); // NOI18N
        lblCreateUser.setForeground(new java.awt.Color(255, 255, 255));
        lblCreateUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateUser.setText("MANAGE USER");
        lblCreateUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCreateUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCreateUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCreateUserMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ManageUserJPanelLayout = new javax.swing.GroupLayout(ManageUserJPanel);
        ManageUserJPanel.setLayout(ManageUserJPanelLayout);
        ManageUserJPanelLayout.setHorizontalGroup(
            ManageUserJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageUserJPanelLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(lblCreateUser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ManageUserJPanelLayout.setVerticalGroup(
            ManageUserJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageUserJPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblCreateUser)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ManageHospitalJPanel.setBackground(new java.awt.Color(153, 204, 255));
        ManageHospitalJPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageHospitalJPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManageHospitalJPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManageHospitalJPanelMouseExited(evt);
            }
        });

        lblRegHospital.setFont(new java.awt.Font("Menlo", 1, 13)); // NOI18N
        lblRegHospital.setForeground(new java.awt.Color(255, 255, 255));
        lblRegHospital.setText("MANAGE HOSPITAL");

        javax.swing.GroupLayout ManageHospitalJPanelLayout = new javax.swing.GroupLayout(ManageHospitalJPanel);
        ManageHospitalJPanel.setLayout(ManageHospitalJPanelLayout);
        ManageHospitalJPanelLayout.setHorizontalGroup(
            ManageHospitalJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageHospitalJPanelLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(lblRegHospital)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ManageHospitalJPanelLayout.setVerticalGroup(
            ManageHospitalJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageHospitalJPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblRegHospital)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        ManagePharmacyJPanel.setBackground(new java.awt.Color(153, 204, 255));
        ManagePharmacyJPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManagePharmacyJPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManagePharmacyJPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManagePharmacyJPanelMouseExited(evt);
            }
        });

        lblRegPharmacy.setFont(new java.awt.Font("Menlo", 1, 13)); // NOI18N
        lblRegPharmacy.setForeground(new java.awt.Color(255, 255, 255));
        lblRegPharmacy.setText("MANAGE PHARMACY");
        lblRegPharmacy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegPharmacyMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ManagePharmacyJPanelLayout = new javax.swing.GroupLayout(ManagePharmacyJPanel);
        ManagePharmacyJPanel.setLayout(ManagePharmacyJPanelLayout);
        ManagePharmacyJPanelLayout.setHorizontalGroup(
            ManagePharmacyJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManagePharmacyJPanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(lblRegPharmacy)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ManagePharmacyJPanelLayout.setVerticalGroup(
            ManagePharmacyJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManagePharmacyJPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblRegPharmacy)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        ManageInsuranceJPanel.setBackground(new java.awt.Color(153, 204, 255));
        ManageInsuranceJPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageInsuranceJPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManageInsuranceJPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManageInsuranceJPanelMouseExited(evt);
            }
        });

        lblRegisterIns.setFont(new java.awt.Font("Menlo", 1, 13)); // NOI18N
        lblRegisterIns.setForeground(new java.awt.Color(255, 255, 255));
        lblRegisterIns.setText("MANAGE INSURANCE FIRM");
        lblRegisterIns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisterInsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ManageInsuranceJPanelLayout = new javax.swing.GroupLayout(ManageInsuranceJPanel);
        ManageInsuranceJPanel.setLayout(ManageInsuranceJPanelLayout);
        ManageInsuranceJPanelLayout.setHorizontalGroup(
            ManageInsuranceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageInsuranceJPanelLayout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(lblRegisterIns)
                .addGap(88, 88, 88))
        );
        ManageInsuranceJPanelLayout.setVerticalGroup(
            ManageInsuranceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageInsuranceJPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblRegisterIns)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        ManageSupplierJPanel.setBackground(new java.awt.Color(153, 204, 255));
        ManageSupplierJPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageSupplierJPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManageSupplierJPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManageSupplierJPanelMouseExited(evt);
            }
        });

        lblRegSupplier.setFont(new java.awt.Font("Menlo", 1, 13)); // NOI18N
        lblRegSupplier.setForeground(new java.awt.Color(255, 255, 255));
        lblRegSupplier.setText("MANAGE SUPPLIER");
        lblRegSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegSupplierMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ManageSupplierJPanelLayout = new javax.swing.GroupLayout(ManageSupplierJPanel);
        ManageSupplierJPanel.setLayout(ManageSupplierJPanelLayout);
        ManageSupplierJPanelLayout.setHorizontalGroup(
            ManageSupplierJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageSupplierJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRegSupplier)
                .addGap(112, 112, 112))
        );
        ManageSupplierJPanelLayout.setVerticalGroup(
            ManageSupplierJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageSupplierJPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblRegSupplier)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ManageUserJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ManageHospitalJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ManagePharmacyJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ManageInsuranceJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ManageSupplierJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(ManageUserJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ManageHospitalJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ManagePharmacyJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ManageInsuranceJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ManageSupplierJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(287, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(153, 204, 255));

        jLabel12.setFont(new java.awt.Font("Menlo", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/ICONS/Logout-icon-2.png"))); // NOI18N
        jLabel12.setText("Logout");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        UserTable.setFont(new java.awt.Font("Menlo", 1, 13)); // NOI18N
        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Organisation", "Role"
            }
        ));
        jScrollPane1.setViewportView(UserTable);

        PharmacyTable.setFont(new java.awt.Font("Menlo", 1, 13)); // NOI18N
        PharmacyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "City"
            }
        ));
        jScrollPane2.setViewportView(PharmacyTable);

        InsuranceTable.setFont(new java.awt.Font("Menlo", 1, 13)); // NOI18N
        InsuranceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "City"
            }
        ));
        jScrollPane3.setViewportView(InsuranceTable);

        SupplierTable.setFont(new java.awt.Font("Menlo", 1, 13)); // NOI18N
        SupplierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "City"
            }
        ));
        jScrollPane4.setViewportView(SupplierTable);

        HospitalTable.setFont(new java.awt.Font("Menlo", 1, 13)); // NOI18N
        HospitalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "City", "Address"
            }
        ));
        jScrollPane5.setViewportView(HospitalTable);

        lblPT.setFont(new java.awt.Font("Menlo", 1, 13)); // NOI18N
        lblPT.setForeground(new java.awt.Color(255, 255, 255));
        lblPT.setText("Pharmacy");

        lblUT.setFont(new java.awt.Font("Menlo", 1, 13)); // NOI18N
        lblUT.setForeground(new java.awt.Color(255, 255, 255));
        lblUT.setText("User");

        lblHosT.setFont(new java.awt.Font("Menlo", 1, 13)); // NOI18N
        lblHosT.setForeground(new java.awt.Color(255, 255, 255));
        lblHosT.setText("Hospital");

        lblIT.setFont(new java.awt.Font("Menlo", 1, 13)); // NOI18N
        lblIT.setForeground(new java.awt.Color(255, 255, 255));
        lblIT.setText("Insurance");

        lblST.setFont(new java.awt.Font("Menlo", 1, 13)); // NOI18N
        lblST.setForeground(new java.awt.Color(255, 255, 255));
        lblST.setText("Supplier");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(lblHosT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPT)
                .addGap(256, 256, 256))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(lblIT)
                .addGap(75, 75, 75)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(lblST)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 91, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblUT)
                                .addGap(83, 83, 83)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(216, 216, 216)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(148, 148, 148))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPT, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHosT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUT)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIT)
                    .addComponent(lblST))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblCreateUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateUserMouseClicked
        // TODO add your handling code here:
        UserManagement  um = new UserManagement(userData, hosData, pharmData, suppData);
        Login login = (Login) SwingUtilities.getRoot(this);
        login.setContentPane(um);
        login.invalidate();
        login.validate();
    }//GEN-LAST:event_lblCreateUserMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        Login login1 = new Login();
        Login login = (Login) SwingUtilities.getRoot(this);
        login1.setVisible(true);
        login.setVisible(false);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void ManageUserJPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageUserJPanelMouseEntered
        // TODO add your handling code here:
        ManageUserJPanel.setBackground(MouseEnterColor);
    }//GEN-LAST:event_ManageUserJPanelMouseEntered

    private void ManageUserJPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageUserJPanelMouseExited
        // TODO add your handling code here:
        ManageUserJPanel.setBackground(MouseExitColor);
    }//GEN-LAST:event_ManageUserJPanelMouseExited

    private void ManageUserJPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageUserJPanelMouseClicked
        // TODO add your handling code here:
        UserManagement  um = new UserManagement(userData, hosData, pharmData, suppData);
        Login login = (Login) SwingUtilities.getRoot(this);
        login.setContentPane(um);
        login.invalidate();
        login.validate();
    }//GEN-LAST:event_ManageUserJPanelMouseClicked

    private void ManageHospitalJPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageHospitalJPanelMouseEntered
        // TODO add your handling code here:
        ManageHospitalJPanel.setBackground(MouseEnterColor);
    }//GEN-LAST:event_ManageHospitalJPanelMouseEntered

    private void ManageHospitalJPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageHospitalJPanelMouseExited
        // TODO add your handling code here:
        ManageHospitalJPanel.setBackground(MouseExitColor);
    }//GEN-LAST:event_ManageHospitalJPanelMouseExited

    private void ManagePharmacyJPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManagePharmacyJPanelMouseEntered
        // TODO add your handling code here:
        ManagePharmacyJPanel.setBackground(MouseEnterColor);
    }//GEN-LAST:event_ManagePharmacyJPanelMouseEntered

    private void ManagePharmacyJPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManagePharmacyJPanelMouseExited
        // TODO add your handling code here:
        ManagePharmacyJPanel.setBackground(MouseExitColor);
    }//GEN-LAST:event_ManagePharmacyJPanelMouseExited

    private void ManageInsuranceJPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageInsuranceJPanelMouseEntered
        // TODO add your handling code here:
        ManageInsuranceJPanel.setBackground(MouseEnterColor);
    }//GEN-LAST:event_ManageInsuranceJPanelMouseEntered

    private void ManageInsuranceJPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageInsuranceJPanelMouseExited
        // TODO add your handling code here:
        ManageInsuranceJPanel.setBackground(MouseExitColor);
    }//GEN-LAST:event_ManageInsuranceJPanelMouseExited

    private void ManageSupplierJPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageSupplierJPanelMouseEntered
        // TODO add your handling code here:
        ManageSupplierJPanel.setBackground(MouseEnterColor);
    }//GEN-LAST:event_ManageSupplierJPanelMouseEntered

    private void ManageSupplierJPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageSupplierJPanelMouseExited
        // TODO add your handling code here:
        ManageSupplierJPanel.setBackground(MouseExitColor);
    }//GEN-LAST:event_ManageSupplierJPanelMouseExited

    private void lblCreateUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateUserMouseEntered
        // TODO add your handling code here:
        lblCreateUser.setBackground(MouseEnterColor);
    }//GEN-LAST:event_lblCreateUserMouseEntered

    private void lblCreateUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateUserMouseExited
        // TODO add your handling code here:
        lblCreateUser.setBackground(MouseExitColor);
    }//GEN-LAST:event_lblCreateUserMouseExited

    private void ManageHospitalJPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageHospitalJPanelMouseClicked
        // TODO add your handling code here:
        ManageHospital  mh = new ManageHospital(userData, hosData, pharmData, suppData);
        Login login = (Login) SwingUtilities.getRoot(this);
        login.setContentPane(mh);
        login.invalidate();
        login.validate();
    }//GEN-LAST:event_ManageHospitalJPanelMouseClicked

    private void ManagePharmacyJPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManagePharmacyJPanelMouseClicked
        // TODO add your handling code here:
        ManagePharmacyAdmin  mpa = new ManagePharmacyAdmin(userData, hosData, suppData, pharmData);
        Login login = (Login) SwingUtilities.getRoot(this);
        login.setContentPane(mpa);
        login.invalidate();
        login.validate();
    }//GEN-LAST:event_ManagePharmacyJPanelMouseClicked

    private void lblRegPharmacyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegPharmacyMouseClicked
        // TODO add your handling code here:
        ManagePharmacyAdmin  mpa = new ManagePharmacyAdmin(userData, hosData, suppData, pharmData);
        Login login = (Login) SwingUtilities.getRoot(this);
        login.setContentPane(mpa);
        login.invalidate();
        login.validate();
    }//GEN-LAST:event_lblRegPharmacyMouseClicked

    private void ManageInsuranceJPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageInsuranceJPanelMouseClicked
        // TODO add your handling code here:
//        ManagePharmacyAdmin  mpa = new ManagePharmacyAdmin(userData, hosData, suppData, pharmData);
//        Login login = (Login) SwingUtilities.getRoot(this);
//        login.setContentPane(mpa);
//        login.invalidate();
//        login.validate();
        ManageInsuranceFirm  mif = new ManageInsuranceFirm(userData, hosData, pharmData, suppData);
        Login login = (Login) SwingUtilities.getRoot(this);
        login.setContentPane(mif);
        login.invalidate();
        login.validate();
    }//GEN-LAST:event_ManageInsuranceJPanelMouseClicked

    private void lblRegisterInsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterInsMouseClicked
        // TODO add your handling code here:
//        RegisterInsuranceFirm  rif = new RegisterInsuranceFirm();
//        Login login = (Login) SwingUtilities.getRoot(this);
//        login.setContentPane(rif);
//        login.invalidate();
//        login.validate();
    }//GEN-LAST:event_lblRegisterInsMouseClicked

    private void ManageSupplierJPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageSupplierJPanelMouseClicked
        // TODO add your handling code here:
        ManageSupplier  ms = new ManageSupplier(userData, hosData, pharmData, suppData);
        Login login = (Login) SwingUtilities.getRoot(this);
        login.setContentPane(ms);
        login.invalidate();
        login.validate();
    }//GEN-LAST:event_ManageSupplierJPanelMouseClicked

    private void lblRegSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegSupplierMouseClicked
        // TODO add your handling code here:
        ManageSupplier  ms = new ManageSupplier(userData, hosData, pharmData, suppData);
        Login login = (Login) SwingUtilities.getRoot(this);
        login.setContentPane(ms);
        login.invalidate();
        login.validate();
    }//GEN-LAST:event_lblRegSupplierMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable HospitalTable;
    private javax.swing.JTable InsuranceTable;
    private javax.swing.JPanel ManageHospitalJPanel;
    private javax.swing.JPanel ManageInsuranceJPanel;
    private javax.swing.JPanel ManagePharmacyJPanel;
    private javax.swing.JPanel ManageSupplierJPanel;
    private javax.swing.JPanel ManageUserJPanel;
    private javax.swing.JTable PharmacyTable;
    private javax.swing.JTable SupplierTable;
    private javax.swing.JTable UserTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblCreateUser;
    private javax.swing.JLabel lblHosT;
    private javax.swing.JLabel lblIT;
    private javax.swing.JLabel lblPT;
    private javax.swing.JLabel lblRegHospital;
    private javax.swing.JLabel lblRegPharmacy;
    private javax.swing.JLabel lblRegSupplier;
    private javax.swing.JLabel lblRegisterIns;
    private javax.swing.JLabel lblST;
    private javax.swing.JLabel lblUT;
    // End of variables declaration//GEN-END:variables
}
