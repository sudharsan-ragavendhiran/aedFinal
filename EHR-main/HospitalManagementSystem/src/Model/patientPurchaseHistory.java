
package Model;

import SQLConnection.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


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
            ResultSet res=ps.executeQuery();
            
             while(res.next())
             {
                 patientPurchase purchase=new patientPurchase();               
                 purchase.setPatientUsername(res.getString("username"));                
                 purchase.setItem(res.getString("dob"));
                 purchase.setItem(res.getString("name"));
                 purchase.setQty(res.getInt("qty"));
                 purchase.setPrice(res.getInt("price"));
                 purchase.setId(res.getString("id"));
                 purchase.setStatus(res.getString("status"));

                
                 purchaseData1.add(purchase);
           
             }
             
        } catch (SQLException ex) {
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
            ResultSet res=ps.executeQuery();
            
             while(res.next())
             {
                 patientPurchase purchase=new patientPurchase();               
                 purchase.setPatientUsername(res.getString("patientusername"));                
                 purchase.setItem(res.getString("item"));
                 purchase.setQty(res.getInt("quantity"));
                 purchase.setPrice(res.getInt("price"));
                 purchase.setId(res.getString("id"));
                 purchase.setStatus(res.getString("status"));

                 purchaseData1.add(purchase);
           
             }
             
        } catch (SQLException ex) {
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
            stmt.executeUpdate(qry);
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
    }
}
