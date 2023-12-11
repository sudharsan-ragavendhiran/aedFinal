
package Model;

import SQLConnection.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


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
            ResultSet res=ps.executeQuery();
            
             while(res.next())
             {
                 InsuranceClaims claims = new InsuranceClaims();               
                 claims .setId(res.getInt("id"));                
                 claims .setPatientUsername(res.getString("patientusername"));
                 claims .setInsuranceAgencyId(res.getString("insuranceagencyid"));
                 claims .setAmount(res.getString("amount"));
                 claims .setApproval1(res.getString("approval1"));
                 claims .setApproval2(res.getString("approval2"));
                 claims .setPid(res.getInt("purchaseid"));

                
                 InsuranceClaimsData1.add(claims );
           
             }
             
        } catch (SQLException ex) {
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
            int id= insuranceClaims.getId();
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="DELETE FROM InsuranceClaimsData WHERE id = '"+id+"'";
            stmt.executeUpdate(qry);
            InsuranceClaimsData.remove(insuranceClaims);
             
        } catch (SQLException ex) {
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
            stmt.executeUpdate(qry);
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
    }
    
    public String searchPatientGenderInDb(String text){
        try{
            Connection con=SQLConnection.dbconnector();
            String sql="select * from PatientData where username = '"+text+"'";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet res=ps.executeQuery();
            
             while(res.next()){
                 String gen = res.getString("gender");
                 return gen;
             }
            
        }catch (SQLException ex) {


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
            ResultSet res = ps.executeQuery();

            while (res.next()) {
                InsuranceClaims claims = new InsuranceClaims();
                claims.setPatientUsername(res.getString("patientusername"));
                claims.setInsuranceAgencyId(res.getString("insuranceagencyid"));
                claims.setId(res.getInt("id"));
                claims.setAmount(res.getString("amount"));
                claims.setApproval1(res.getString("approval1"));
                claims.setApproval2(res.getString("approval2"));
                claims.setPid(res.getInt("purchaseid"));


                insuranceData1.add(claims);

            }

        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }

        return insuranceData1;
    }
}
