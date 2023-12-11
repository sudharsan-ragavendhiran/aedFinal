
package Model;

import SQLConnection.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class pharmacyInfo {
    private ArrayList<pharmacy> pharmacyInfo;

    public ArrayList<pharmacy> getPharmacyInfo() {
        return pharmacyInfo;
    }

    public void setPharmacyInfo(ArrayList<pharmacy> pharmacyInfo) {
        this.pharmacyInfo = pharmacyInfo;
    }
    
    public ArrayList<pharmacy> getPharmacyInfoFromDb() {
        ArrayList<pharmacy> pharmacyData1 = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from PharmacyData";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet res=ps.executeQuery();
            
             while(res.next())
             {
                 pharmacy ph=new pharmacy();
                 
                 ph.setId(res.getString("id"));
                 ph.setCity(res.getString("city"));
                 ph.setName(res.getString("name"));
                 ph.setAddress(res.getString("address"));
                 ph.setAreacode(res.getString("areacode"));
                 ph.setState(res.getString("state"));
                
                 pharmacyData1.add(ph);
           
             }
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
        return pharmacyData1;
    }
        public pharmacy addNewPharmacy(){
        pharmacy newPharmacy = new pharmacy();
        pharmacyInfo.add(newPharmacy);
        return newPharmacy;
    }
        public void delPharmacy(pharmacy pharmacy){
        try {
            String userName= pharmacy.getId();
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="DELETE FROM PharmacyData WHERE username = '"+userName+"'";
            stmt.executeUpdate(qry);
            pharmacyInfo.remove(pharmacy);
             
        } catch (SQLException ex) {
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

            stmt.executeUpdate(qry);
             
        } catch (SQLException ex) {


            System.out.print(ex.getMessage());
        }
        
    }   
    
    public ArrayList<String> getPharInDb(){
        try {
            Connection con=SQLConnection.dbconnector();
            String sql= "SELECT * FROM pharmacydata;";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet res=ps.executeQuery();
            ArrayList<String> al = new ArrayList<String>();
             while(res.next())
             {
             
                   String pharData= res.getString("name");  
                   al.add(pharData);
             }
             return al;
             
        } 
             catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        return null;
        
    }
}
