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
            ResultSet st=ps.executeQuery();
            
             while(st.next())
             {
                 InsuranceAgency p=new InsuranceAgency();               
                 p.setId(st.getString("id"));                
                 p.setCity(st.getString("city"));
                 p.setName(st.getString("name"));
                 p.setAddress(st.getString("address"));
                 p.setState(st.getString("state"));
                 p.setAreacode(st.getString("areacode"));
//                 p.setCommunity(st.getString("Community"));
//                 p.setResidence(st.getString("Residence"));
//                 p.setDoctor(st.getString("Doctor"));
//                 p.setPhNo(st.getInt("PhoneNumber"));
                
                 InsuranceAgencyData1.add(p);
           
             }
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
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
            // userName
            String userName= insuranceAgency.getId();
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="DELETE FROM InsuranceAgencyData WHERE username = '"+userName+"'";
            //PreparedStatement ps=con.prepareStatement(qry);
            stmt.executeUpdate(qry);
            //ResultSet st=ps.executeQuery();
            InsuranceAgencyData.remove(insuranceAgency);
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
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
            //PreparedStatement ps=con.prepareStatement(qry);
            stmt.executeUpdate(qry);
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
    }
    
    public ArrayList<String> getInsInDb(){
        try {
            Connection con=SQLConnection.dbconnector();
            String sql= "SELECT * FROM insuranceagencydata;";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery();
            ArrayList<String> ar = new ArrayList<String>();
             while(st.next())
             {
             
                   String a= st.getString("name");  
                   ar.add(a);
             }
             return ar;
             
        } 
             catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        return null;
        
    }
}
