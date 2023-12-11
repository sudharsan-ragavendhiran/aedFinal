/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import SQLConnection.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author slaks
 */
public class InsurancePolicyData {
    private ArrayList<InsurancePolicy> InsurancePolicyData;
    
    public InsurancePolicyData() {
        this.InsurancePolicyData = new ArrayList<InsurancePolicy>();
    }
    
    public ArrayList<InsurancePolicy> getInsurancePolicyDataFromDb() {
        ArrayList<InsurancePolicy> InsurancePolicyData1 = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from InsurancePolicyData";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery();
            
             while(st.next())
             {
                 InsurancePolicy p=new InsurancePolicy();               
                 p.setId(st.getInt("id"));                
                 p.setPatientUsername(st.getString("patientusername"));
                 p.setInsuranceAgencyId(st.getString("insuranceagencyid"));
//                 p.setCommunity(st.getString("Community"));
//                 p.setResidence(st.getString("Residence"));
//                 p.setDoctor(st.getString("Doctor"));
//                 p.setPhNo(st.getInt("PhoneNumber"));
                
                 InsurancePolicyData1.add(p);
           
             }
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
        return InsurancePolicyData1;
    }
    
    public ArrayList<InsurancePolicy> getPolicyDataByPatientFromDb(String un) {
        ArrayList<InsurancePolicy> InsurancePolicyData1 = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from InsurancePolicyData where patientusername ='"+un+"';";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery();
            
             while(st.next())
             {
                 InsurancePolicy p=new InsurancePolicy();               
                 p.setId(st.getInt("id"));                
                 p.setPatientUsername(st.getString("patientusername"));
                 p.setInsuranceAgencyId(st.getString("insuranceagencyid"));
//                 p.setCommunity(st.getString("Community"));
//                 p.setResidence(st.getString("Residence"));
//                 p.setDoctor(st.getString("Doctor"));
//                 p.setPhNo(st.getInt("PhoneNumber"));
                
                 InsurancePolicyData1.add(p);
           
             }
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
        return InsurancePolicyData1;
    }
    public int getPolicyIdFromDb(String un) {
        //ArrayList<InsurancePolicy> InsurancePolicyData1 = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from InsurancePolicyData where patientusername ='"+un+"';";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery();
            
             while(st.next())
             {
                 int op = st.getInt("id");
                 return op;
//                 InsurancePolicy p=new InsurancePolicy();               
//                 p.setId(st.getInt("id"));                
//                 p.setPatientUsername(st.getString("patientusername"));
//                 p.setInsuranceAgencyId(st.getString("insuranceagencyid"));
////                 p.setCommunity(st.getString("Community"));
////                 p.setResidence(st.getString("Residence"));
////                 p.setDoctor(st.getString("Doctor"));
////                 p.setPhNo(st.getInt("PhoneNumber"));
//                
//                 InsurancePolicyData1.add(p);
           
             }
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
        return 0;
    }
    
    
    public ArrayList<InsurancePolicy> getInsurancePolicyData() {
        return InsurancePolicyData;
    }
    
    public void setInsurancePolicyData(ArrayList<InsurancePolicy> InsurancePolicyData) {
        this.InsurancePolicyData = InsurancePolicyData;
    }
    
    public InsurancePolicy addNewInsurancePolicy(){
        InsurancePolicy newInsurancePolicy = new InsurancePolicy();
        InsurancePolicyData.add(newInsurancePolicy);
        return newInsurancePolicy;
    }
    
    public void deleteInsurancePolicy(InsurancePolicy insurancePolicy){
        try {
            // userName
            int userName= insurancePolicy.getId();
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="DELETE FROM InsurancePolicyData WHERE id = '"+userName+"'";
            //PreparedStatement ps=con.prepareStatement(qry);
            stmt.executeUpdate(qry);
            //ResultSet st=ps.executeQuery();
            InsurancePolicyData.remove(insurancePolicy);
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }  
    }
    
    public void createInsurancePolicyInDb(InsurancePolicy insurancePolicy){
        try {

          
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="INSERT INTO InsurancePolicyData(id, patientusername, insuranceagencyid) VALUES ('"+insurancePolicy.getId()+"','"+insurancePolicy.getPatientUsername()+"','"+insurancePolicy.getInsuranceAgencyId()+"')";
            //PreparedStatement ps=con.prepareStatement(qry);
            stmt.executeUpdate(qry);
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
    }
}
