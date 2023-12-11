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
public class patientPurchaseHistory {
    private ArrayList<patientPurchase> purchaseData;
    
    public patientPurchaseHistory() {
        this.purchaseData = new ArrayList<patientPurchase>();
    }
    
    public patientPurchase addNewPurchase(){
        patientPurchase newEncounter = new patientPurchase();
        purchaseData.add(newEncounter);
        return newEncounter;
    }
    
    public ArrayList<patientPurchase> getPatientPurchaseFromDb() {
        ArrayList<patientPurchase> purchaseData1 = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from patientpurchasehistory";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery();
            
             while(st.next())
             {
                 patientPurchase p=new patientPurchase();               
                 p.setPatientUsername(st.getString("username"));                
                 p.setItem(st.getString("dob"));
                 p.setItem(st.getString("name"));
                 p.setQty(st.getInt("qty"));
                 p.setPrice(st.getInt("price"));
                 p.setId(st.getString("id"));
                 p.setStatus(st.getString("status"));
//                 p.setHospitalName(st.getString("hospital"));
//                 p.setResidence(st.getString("Residence"));
//                 p.setDoctor(st.getString("Doctor"));
//                 p.setPhNo(st.getInt("PhoneNumber"));
                
                 purchaseData1.add(p);
           
             }
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
        return purchaseData1;
    }
    
    public ArrayList<patientPurchase> getPatientPurchaseBypatientFromDb(String un, String type) {
        ArrayList<patientPurchase> purchaseData1 = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from patientpurchasehistory where patientusername ='"+un+"' and status ='"+type+"';";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery();
            
             while(st.next())
             {
                 patientPurchase p=new patientPurchase();               
                 p.setPatientUsername(st.getString("patientusername"));                
                 p.setItem(st.getString("item"));
                 //p.setItem(st.getString("name"));
                 p.setQty(st.getInt("quantity"));
                 p.setPrice(st.getInt("price"));
                 p.setId(st.getString("id"));
                 p.setStatus(st.getString("status"));
//                 p.setHospitalName(st.getString("hospital"));
//                 p.setResidence(st.getString("Residence"));
//                 p.setDoctor(st.getString("Doctor"));
//                 p.setPhNo(st.getInt("PhoneNumber"));
                
                 purchaseData1.add(p);
           
             }
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
        return purchaseData1;
    }
    
    
    
    public void createPurchaseInDb(patientPurchase p){
        try {

          
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test;";
            stmt.executeUpdate(qry);
            qry="INSERT INTO patientpurchasehistory(patientusername, item, quantity, price, status) VALUES ('"+p.getPatientUsername()+"','"+p.getItem()+"','"+p.getQty()+"','"+p.getPrice()+"','"+p.getStatus()+"')";
            //PreparedStatement ps=con.prepareStatement(qry);
            stmt.executeUpdate(qry);
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
    }
}
