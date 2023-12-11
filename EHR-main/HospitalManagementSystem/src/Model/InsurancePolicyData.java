
package Model;

import SQLConnection.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
            ResultSet res=ps.executeQuery();
            
             while(res.next())
             {
                 InsurancePolicy policy=new InsurancePolicy();               
                 policy.setId(res.getInt("id"));                
                 policy.setPatientUsername(res.getString("patientusername"));
                 policy.setInsuranceAgencyId(res.getString("insuranceagencyid"));

                
                 InsurancePolicyData1.add(policy);
           
             }
             
        } catch (SQLException ex) {
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
            ResultSet res=ps.executeQuery();
            
             while(res.next())
             {
                 InsurancePolicy policy = new InsurancePolicy();               
                 policy .setId(res.getInt("id"));                
                 policy .setPatientUsername(res.getString("patientusername"));
                 policy .setInsuranceAgencyId(res.getString("insuranceagencyid"));

                
                 InsurancePolicyData1.add(policy );
           
             }
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
        return InsurancePolicyData1;
    }
    public int getPolicyIdFromDb(String un) {
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from InsurancePolicyData where patientusername ='"+un+"';";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet res=ps.executeQuery();
            
             while(res.next())
             {
                 int op = res.getInt("id");
                 return op;

           
             }
             
        } catch (SQLException ex) {
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
            int userName= insurancePolicy.getId();
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="DELETE FROM InsurancePolicyData WHERE id = '"+userName+"'";
            stmt.executeUpdate(qry);
            InsurancePolicyData.remove(insurancePolicy);
             
        } catch (SQLException ex) {
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
            stmt.executeUpdate(qry);
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
    }
}
