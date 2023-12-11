
package Model;

import SQLConnection.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class SupplierInfo {
    private ArrayList<Supplier> SupplierInfo;
    
    public SupplierInfo() {
        this.SupplierInfo = new ArrayList<Supplier>();
    }
    
    public ArrayList<Supplier> getSupplierInfoFromDb() {
        ArrayList<Supplier> SupplierInfo = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from SupplierData";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet res=ps.executeQuery();
            
             while(res.next())
             {
                 Supplier supplier=new Supplier();               
                 supplier.setId(res.getString("id"));                
                 supplier.setCity(res.getString("city"));
                 supplier.setAddress(res.getString("address"));
                 supplier.setName(res.getString("name"));
                 supplier.setState(res.getString("state"));
                 supplier.setAreacode(res.getString("areacode"));

                
                 SupplierInfo.add(supplier);
           
             }
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
        return SupplierInfo;
    }
    
    public ArrayList<Supplier> getSupplierInfo() {
        return SupplierInfo;
    }
    
    public void setSupplierInfo(ArrayList<Supplier> SupplierInfo) {
        this.SupplierInfo = SupplierInfo;
    }
    
    public Supplier addNewSupplier(){
        Supplier newSupplier = new Supplier();
        SupplierInfo.add(newSupplier);
        return newSupplier;
    }
    
    public void delSupplier(Supplier supplier){
        try {
            String userName= supplier.getId();
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="DELETE FROM SupplierData WHERE username = '"+userName+"'";
            stmt.executeUpdate(qry);
            SupplierInfo.remove(supplier);
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }  
    }
    
    public void createSupplierInDb(Supplier supplier){
        try {

          
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="INSERT INTO SupplierData(id, name, address, city, state, areacode) VALUES ('"+supplier.getId()+"','"+supplier.getName()+"','"+supplier.getAddress()+"','"+supplier.getCity()+"','"+supplier.getState()+"','"+supplier.getAreacode()+"')";
            stmt.executeUpdate(qry);
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
    }
    
    public ArrayList<String> getSupInDb(){
        try {
            Connection con=SQLConnection.dbconnector();
            String sql= "SELECT * FROM supplierdata;";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet res=ps.executeQuery();
            ArrayList<String> ar = new ArrayList<String>();
             while(res.next())
             {
             
                   String a= res.getString("name");  
                   ar.add(a);
             }
             return ar;
             
        } 
             catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        return null;
        
    }
}
