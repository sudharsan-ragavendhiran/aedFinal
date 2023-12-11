
package Model;

import SQLConnection.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class InsuranceAgencyInfo {
    private ArrayList<InsuranceAgency> InsuranceAgencyInfo;
    
    public InsuranceAgencyInfo() {
        this.InsuranceAgencyInfo = new ArrayList<InsuranceAgency>();
    }
    
    public ArrayList<InsuranceAgency> getInsuranceAgencyInfoFromDb() {
        ArrayList<InsuranceAgency> InsuranceAgencyData1 = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from InsuranceAgencyData";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet res=ps.executeQuery();
            
             while(res.next())
             {
                 InsuranceAgency insAgency=new InsuranceAgency();               
                 insAgency.setId(res.getString("id"));                
                 insAgency.setCity(res.getString("city"));
                 insAgency.setName(res.getString("name"));
                 insAgency.setAddress(res.getString("address"));
                 insAgency.setState(res.getString("state"));
                 insAgency.setAreacode(res.getString("areacode"));                
                 InsuranceAgencyData1.add(insAgency);
           
             }
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
        return InsuranceAgencyData1;
    }
    
    public ArrayList<InsuranceAgency> getInsuranceAgencyInfo() {
        return InsuranceAgencyInfo;
    }
    
    public void setInsuranceAgencyInfo(ArrayList<InsuranceAgency> InsuranceAgencyInfo) {
        this.InsuranceAgencyInfo = InsuranceAgencyInfo;
    }
    
    public InsuranceAgency addNewInsAgency(){
        InsuranceAgency newInsuranceAgency = new InsuranceAgency();
        InsuranceAgencyInfo.add(newInsuranceAgency);
        return newInsuranceAgency;
    }
    
    public void deleteInsAgency(InsuranceAgency insuranceAgency){
        try {
            String userName= insuranceAgency.getId();
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="DELETE FROM InsuranceAgencyData WHERE username = '"+userName+"'";
            stmt.executeUpdate(qry);
            InsuranceAgencyInfo.remove(insuranceAgency);
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }  
    }
    
    public void createInsAgencyinDb(InsuranceAgency insuranceAgency){
        try {

          
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="INSERT INTO InsuranceAgencyData(id, name, city, address, state, areacode) VALUES ('"+insuranceAgency.getId()+"','"+insuranceAgency.getName()+"','"+insuranceAgency.getCity()+"', '"+insuranceAgency.getAddress()+"', '"+insuranceAgency.getState()+"', '"+insuranceAgency.getAreacode()+"')";
            stmt.executeUpdate(qry);
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
    }
    
    public ArrayList<String> getInsInDb(){
        try {
            Connection con=SQLConnection.dbconnector();
            String sql= "SELECT * FROM insuranceagencydata;";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet res=ps.executeQuery();
            ArrayList<String> al = new ArrayList<String>();
             while(res.next())
             {
                   String stn= res.getString("name");  
                   al.add(stn);
             }
             return al;            
        } 
             catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        return null;
        
    }
}
