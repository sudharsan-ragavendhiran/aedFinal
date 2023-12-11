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
 * @author sudharsan
 */
public class pharmacyData {
    private ArrayList<pharmacy> pharmacyData;

    public ArrayList<pharmacy> getPharmacyData() {
        return pharmacyData;
    }

    public void setPharmacyData(ArrayList<pharmacy> pharmacyData) {
        this.pharmacyData = pharmacyData;
    }
    
    public ArrayList<pharmacy> getPharmacyDataFromDb() {
        ArrayList<pharmacy> pharmacyData1 = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from PharmacyData";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery();
            
             while(st.next())
             {
                 pharmacy p=new pharmacy();
                 
                 p.setId(st.getString("id"));
                 p.setCity(st.getString("city"));
                 p.setName(st.getString("name"));
                 p.setAddress(st.getString("address"));
                 p.setAreacode(st.getString("areacode"));
                 p.setState(st.getString("state"));
                
                 pharmacyData1.add(p);
           
             }
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
        return pharmacyData1;
    }
        public pharmacy addNewPharmacy(){
        pharmacy newPharmacy = new pharmacy();
        pharmacyData.add(newPharmacy);
        return newPharmacy;
    }
        public void deletePharmacy(pharmacy pharmacy){
        try {
            // userName
            String userName= pharmacy.getId();
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="DELETE FROM PharmacyData WHERE username = '"+userName+"'";
            //PreparedStatement ps=con.prepareStatement(qry);
            stmt.executeUpdate(qry);
            //ResultSet st=ps.executeQuery();
            pharmacyData.remove(pharmacy);
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
        
    }  
    public void createPharmacyInDb(pharmacy pharmacy){
        try {

          
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="INSERT INTO PharmacyData(id, name, city, address, areacode, state) VALUES ('"+pharmacy.getId()+"','"+pharmacy.getName()+"','"+pharmacy.getCity()+"', '"+pharmacy.getAddress()+"', '"+pharmacy.getAreacode()+"', '"+pharmacy.getState()+"')";

            //PreparedStatement ps=con.prepareStatement(qry);
            stmt.executeUpdate(qry);
             
        } catch (SQLException ex) {

            //Logger.getLogger(UserData.class.getName()).log(Level.SEVERE, null, ex);

            System.out.print(ex.getMessage());
        }
        
    }   
    
    public ArrayList<String> getPharInDb(){
        try {
            Connection con=SQLConnection.dbconnector();
            String sql= "SELECT * FROM pharmacydata;";
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
