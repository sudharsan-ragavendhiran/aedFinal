
package Model;

import SQLConnection.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class InsuranceAgencyData {
    private ArrayList<InsuranceAgency> InsuranceAgencyData;
    
    public InsuranceAgencyData() {
        this.InsuranceAgencyData = new ArrayList<InsuranceAgency>();
    }
    
    public ArrayList<InsuranceAgency> getInsuranceAgencyDataFromDb() {
        ArrayList<InsuranceAgency> InsuranceAgencyData1 = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from InsuranceAgencyData";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet res=ps.executeQuery();
            
             while(res.next())
             {
                 InsuranceAgency p=new InsuranceAgency();               
                 p.setId(res.getString("id"));                
                 p.setCity(res.getString("city"));
                 p.setName(res.getString("name"));
                 p.setAddress(res.getString("address"));
                 p.setState(res.getString("state"));
                 p.setAreacode(res.getString("areacode"));                
                 InsuranceAgencyData1.add(p);
           
             }
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
        return InsuranceAgencyData1;
    }
    
    public ArrayList<InsuranceAgency> getInsuranceAgencyData() {
        return InsuranceAgencyData;
    }
    
    public void setInsuranceAgencyData(ArrayList<InsuranceAgency> InsuranceAgencyData) {
        this.InsuranceAgencyData = InsuranceAgencyData;
    }
    
    public InsuranceAgency addNewInsuranceAgency(){
        InsuranceAgency newInsuranceAgency = new InsuranceAgency();
        InsuranceAgencyData.add(newInsuranceAgency);
        return newInsuranceAgency;
    }
    
    public void deleteInsuranceAgency(InsuranceAgency insuranceAgency){
        try {
            String userName= insuranceAgency.getId();
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="DELETE FROM InsuranceAgencyData WHERE username = '"+userName+"'";
            stmt.executeUpdate(qry);
            InsuranceAgencyData.remove(insuranceAgency);
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }  
    }
    
    public void createInsuranceAgencyInDb(InsuranceAgency insuranceAgency){
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
