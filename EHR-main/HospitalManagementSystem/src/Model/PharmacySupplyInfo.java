
package Model;

import SQLConnection.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class PharmacySupplyInfo {
    private ArrayList<PharmacySupply> PharmacySupplyInfo;

    public ArrayList<PharmacySupply> getPharmacySupplyInfo() {
        return PharmacySupplyInfo;
    }

    public void setPharmacySupplyInfo(ArrayList<PharmacySupply> pharmacySupplyData) {
        this.PharmacySupplyInfo = pharmacySupplyData;
    }
    
    public ArrayList<PharmacySupply> getPharmacySupplyInfoFromDb() {
        ArrayList<PharmacySupply> PharmacySupplyInfo = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from PharmacySupply";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet res=ps.executeQuery();
            
             while(res.next())
             {
                 PharmacySupply supply = new PharmacySupply();
                 
                 supply .setPharmacyId(res.getString("pharmacyid"));
                 supply .setItem(res.getString("item"));
                 supply .setQuantity(res.getString("quantity"));
                 supply .setPrice(res.getString("price"));
                 
                
                 PharmacySupplyInfo.add(supply );
           
             }
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
        return PharmacySupplyInfo;
    }
    
    public ArrayList<PharmacySupply> getPharmacySupplyInfoFromDb(String username) {
        ArrayList<PharmacySupply> PharmacySupplyData1 = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from PharmacySupply where pharmacyid = '"+username+"'";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet res =ps.executeQuery();
            
             while(res .next())
             {
                 PharmacySupply supply =new PharmacySupply();
                 
                 supply .setPharmacyId(res .getString("pharmacyid"));
                 supply .setItem(res .getString("item"));
                 supply .setQuantity(res .getString("quantity"));
                 supply .setPrice(res .getString("price"));
                 
                
                 PharmacySupplyData1.add(supply );
           
             }
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
        return PharmacySupplyData1;
    }
    
        public PharmacySupply addNewPharmacySupply(){
        PharmacySupply newPharmacySupply = new PharmacySupply();
        PharmacySupplyInfo.add(newPharmacySupply);
        return newPharmacySupply;
    }
        public void delPharmacySupply(PharmacySupply pharmacySupply){
        try {
            String userName= pharmacySupply.getPharmacyId();
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="DELETE FROM PharmacySupply WHERE username = '"+userName+"'";
            stmt.executeUpdate(qry);
            PharmacySupplyInfo.remove(pharmacySupply);
             
        } catch (SQLException ex) {
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

            stmt.executeUpdate(qry);
             
        } catch (SQLException ex) {


            System.out.print(ex.getMessage());
        }
        
    }  
}
