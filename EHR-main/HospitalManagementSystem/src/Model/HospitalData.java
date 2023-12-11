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
public class HospitalData {
    private ArrayList<Hospital> HospitalData;
    
    public HospitalData() {
        this.HospitalData = new ArrayList<Hospital>();
    }
    
    public ArrayList<Hospital> getHospitalDataFromDb() {
        ArrayList<Hospital> HospitalData1 = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from HospitalData";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery();
            
             while(st.next())
             {
                 Hospital p=new Hospital();               
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
                
                 HospitalData1.add(p);
           
             }
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
        return HospitalData1;
    }

    public ArrayList<Hospital> getHospitalData() {
        return HospitalData;
    }
    
    public void setHospitalData(ArrayList<Hospital> HospitalData) {
        this.HospitalData = HospitalData;
    }
    
    public Hospital addNewHospital(){
        Hospital newHospital = new Hospital();
        HospitalData.add(newHospital);
        return newHospital;
    }
    
    public void deleteHospital(Hospital hospital){
        try {
            // userName
            String userName= hospital.getId();
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test;";
            stmt.executeUpdate(qry);
            qry="DELETE FROM HospitalData WHERE id = '"+userName+"'";
            //PreparedStatement ps=con.prepareStatement(qry);
            stmt.executeUpdate(qry);
            //ResultSet st=ps.executeQuery();
            HospitalData.remove(hospital);
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }  
    }
    
    public void createHospitalInDb(Hospital hospital){
        try {

          
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test;";
            stmt.executeUpdate(qry);
            qry="INSERT INTO HospitalData(id, name, city, address, state, areacode) VALUES ('"+hospital.getId()+"','"+hospital.getName()+"','"+hospital.getCity()+"','"+hospital.getAddress()+"','"+hospital.getState()+"','"+hospital.getAreacode()+"')";
            //PreparedStatement ps=con.prepareStatement(qry);
            stmt.executeUpdate(qry);
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
    }
    public ArrayList<String> getHospitalsInDb(){
        try {
            Connection con=SQLConnection.dbconnector();
            String sql= "SELECT * FROM hospitalData;";
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
