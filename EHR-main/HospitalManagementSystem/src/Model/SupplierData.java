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
public class SupplierData {
    private ArrayList<Supplier> SupplierData;
    
    public SupplierData() {
        this.SupplierData = new ArrayList<Supplier>();
    }
    
    public ArrayList<Supplier> getSupplierDataFromDb() {
        ArrayList<Supplier> SupplierData1 = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from SupplierData";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery();
            
             while(st.next())
             {
                 Supplier p=new Supplier();               
                 p.setId(st.getString("id"));                
                 p.setCity(st.getString("city"));
                 p.setAddress(st.getString("address"));
                 p.setName(st.getString("name"));
                 p.setState(st.getString("state"));
                 p.setAreacode(st.getString("areacode"));
//                 p.setCommunity(st.getString("Community"));
//                 p.setResidence(st.getString("Residence"));
//                 p.setDoctor(st.getString("Doctor"));
//                 p.setPhNo(st.getInt("PhoneNumber"));
                
                 SupplierData1.add(p);
           
             }
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
        return SupplierData1;
    }
    
    public ArrayList<Supplier> getSupplierData() {
        return SupplierData;
    }
    
    public void setSupplierData(ArrayList<Supplier> SupplierData) {
        this.SupplierData = SupplierData;
    }
    
    public Supplier addNewSupplier(){
        Supplier newSupplier = new Supplier();
        SupplierData.add(newSupplier);
        return newSupplier;
    }
    
    public void deleteSupplier(Supplier supplier){
        try {
            // userName
            String userName= supplier.getId();
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="DELETE FROM SupplierData WHERE username = '"+userName+"'";
            //PreparedStatement ps=con.prepareStatement(qry);
            stmt.executeUpdate(qry);
            //ResultSet st=ps.executeQuery();
            SupplierData.remove(supplier);
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
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
            //PreparedStatement ps=con.prepareStatement(qry);
            stmt.executeUpdate(qry);
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
    }
    
    public ArrayList<String> getSupInDb(){
        try {
            Connection con=SQLConnection.dbconnector();
            String sql= "SELECT * FROM supplierdata;";
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
