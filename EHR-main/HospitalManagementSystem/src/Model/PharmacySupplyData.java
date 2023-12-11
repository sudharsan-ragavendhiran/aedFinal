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
public class PharmacySupplyData {
    private ArrayList<PharmacySupply> PharmacySupplyData;

    public ArrayList<PharmacySupply> getPharmacySupplyData() {
        return PharmacySupplyData;
    }

    public void setPharmacySupplyData(ArrayList<PharmacySupply> pharmacySupplyData) {
        this.PharmacySupplyData = pharmacySupplyData;
    }
    
    public ArrayList<PharmacySupply> getPharmacySupplyDataFromDb() {
        ArrayList<PharmacySupply> PharmacySupplyData1 = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from PharmacySupply";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery();
            
             while(st.next())
             {
                 PharmacySupply p=new PharmacySupply();
                 
                 p.setPharmacyId(st.getString("pharmacyid"));
                 p.setItem(st.getString("item"));
                 p.setQuantity(st.getString("quantity"));
                 p.setPrice(st.getString("price"));
                 
                
                 PharmacySupplyData1.add(p);
           
             }
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
        return PharmacySupplyData1;
    }
    
    public ArrayList<PharmacySupply> getPharmacySupplyDataFromDb(String username) {
        ArrayList<PharmacySupply> PharmacySupplyData1 = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from PharmacySupply where pharmacyid = '"+username+"'";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery();
            
             while(st.next())
             {
                 PharmacySupply p=new PharmacySupply();
                 
                 p.setPharmacyId(st.getString("pharmacyid"));
                 p.setItem(st.getString("item"));
                 p.setQuantity(st.getString("quantity"));
                 p.setPrice(st.getString("price"));
                 
                
                 PharmacySupplyData1.add(p);
           
             }
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
        return PharmacySupplyData1;
    }
    
        public PharmacySupply addNewPharmacySupply(){
        PharmacySupply newPharmacySupply = new PharmacySupply();
        PharmacySupplyData.add(newPharmacySupply);
        return newPharmacySupply;
    }
        public void deletePharmacySupply(PharmacySupply pharmacySupply){
        try {
            // userName
            String userName= pharmacySupply.getPharmacyId();
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="DELETE FROM PharmacySupply WHERE username = '"+userName+"'";
            //PreparedStatement ps=con.prepareStatement(qry);
            stmt.executeUpdate(qry);
            //ResultSet st=ps.executeQuery();
            PharmacySupplyData.remove(pharmacySupply);
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
        
    }  
    public void createPharmacySupplyInDb(PharmacySupply pharmacySupply){
        try {

          
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="INSERT INTO PharmacySupply(pharmacyid, item, quantity, price) VALUES ('"+pharmacySupply.getPharmacyId()+"','"+pharmacySupply.getItem()+"','"+pharmacySupply.getQuantity()+"','"+pharmacySupply.getPrice()+"')";

            //PreparedStatement ps=con.prepareStatement(qry);
            stmt.executeUpdate(qry);
             
        } catch (SQLException ex) {

            //Logger.getLogger(UserData.class.getName()).log(Level.SEVERE, null, ex);

            System.out.print(ex.getMessage());
        }
        
    }  
}
