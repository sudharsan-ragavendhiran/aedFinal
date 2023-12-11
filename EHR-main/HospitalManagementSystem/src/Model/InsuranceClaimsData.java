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
public class InsuranceClaimsData {
    private ArrayList<InsuranceClaims> InsuranceClaimsData;
    
    public InsuranceClaimsData() {
        this.InsuranceClaimsData = new ArrayList<InsuranceClaims>();
    }
    
    public ArrayList<InsuranceClaims> getInsuranceClaimsDataFromDb() {
        ArrayList<InsuranceClaims> InsuranceClaimsData1 = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from InsuranceClaimsData";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery();
            
             while(st.next())
             {
                 InsuranceClaims p=new InsuranceClaims();               
                 p.setId(st.getInt("id"));                
                 p.setPatientUsername(st.getString("patientusername"));
                 p.setInsuranceAgencyId(st.getString("insuranceagencyid"));
                 p.setAmount(st.getString("amount"));
                 p.setApproval1(st.getString("approval1"));
                 p.setApproval2(st.getString("approval2"));
                 p.setPid(st.getInt("purchaseid"));
//                 p.setResidence(st.getString("Residence"));
//                 p.setDoctor(st.getString("Doctor"));
//                 p.setPhNo(st.getInt("PhoneNumber"));
                
                 InsuranceClaimsData1.add(p);
           
             }
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
        return InsuranceClaimsData1;
    }
    
    public ArrayList<InsuranceClaims> getInsuranceClaimsData() {
        return InsuranceClaimsData;
    }
    
    public void setInsuranceClaimsData(ArrayList<InsuranceClaims> InsuranceClaimsData) {
        this.InsuranceClaimsData = InsuranceClaimsData;
    }
    
    public InsuranceClaims addNewInsuranceClaims(){
        InsuranceClaims newInsuranceClaims = new InsuranceClaims();
        InsuranceClaimsData.add(newInsuranceClaims);
        return newInsuranceClaims;
    }
    
    public void deleteInsuranceClaims(InsuranceClaims insuranceClaims){
        try {
            // userName
            int id= insuranceClaims.getId();
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="DELETE FROM InsuranceClaimsData WHERE id = '"+id+"'";
            //PreparedStatement ps=con.prepareStatement(qry);
            stmt.executeUpdate(qry);
            //ResultSet st=ps.executeQuery();
            InsuranceClaimsData.remove(insuranceClaims);
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }  
    }
    
    public void createInsuranceClaimsInDb(InsuranceClaims insuranceClaims){
        try {

          
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="INSERT INTO InsuranceClaimsData(patientusername, insuranceagencyid, amount, approval1, approval2, purchaseid) VALUES ('"+insuranceClaims.getPatientUsername()+"','"+insuranceClaims.getInsuranceAgencyId()+"','"+insuranceClaims.getAmount()+"','"+insuranceClaims.getApproval1()+"','"+insuranceClaims.getApproval2()+"','"+insuranceClaims.getPid()+"')";
            //PreparedStatement ps=con.prepareStatement(qry);
            stmt.executeUpdate(qry);
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
    }
    
    public String searchPatientGenderInDb(String text){
        try{
            Connection con=SQLConnection.dbconnector();
            String sql="select * from PatientData where username = '"+text+"'";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery();
            
             while(st.next()){
                 String op = st.getString("gender");
                 return op;
             }
            
        }catch (SQLException ex) {

            //Logger.getLogger(UserData.class.getName()).log(Level.SEVERE, null, ex);

            System.out.print(ex.getMessage());
        }
        return "";
    }
    
    public ArrayList<InsuranceClaims> getPlacedInsuranceRequestDataFromDb() {
        ArrayList<InsuranceClaims> insuranceData1 = new ArrayList();
        try {
            Connection con = SQLConnection.dbconnector();
            String sql = "select * from insuranceclaimsdata where approval1= \"pending\"";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet st = ps.executeQuery();

            while (st.next()) {
                InsuranceClaims ic = new InsuranceClaims();
                ic.setPatientUsername(st.getString("patientusername"));
                ic.setInsuranceAgencyId(st.getString("insuranceagencyid"));
                ic.setId(st.getInt("id"));
                ic.setAmount(st.getString("amount"));
                ic.setApproval1(st.getString("approval1"));
                ic.setApproval2(st.getString("approval2"));
                ic.setPid(st.getInt("purchaseid"));
//                 p.setResidence(st.getString("Residence"));
//                 p.setDoctor(st.getString("Doctor"));
//                 p.setPhNo(st.getInt("PhoneNumber"));

                insuranceData1.add(ic);

            }

        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }

        return insuranceData1;
    }
}
