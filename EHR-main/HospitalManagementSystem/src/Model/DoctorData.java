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
public class DoctorData {
    private ArrayList<Doctor> DoctorData;
    
    public DoctorData() {
        this.DoctorData = new ArrayList<Doctor>();
    }
    
    public ArrayList<Doctor> getDoctorDataFromDb() {
        ArrayList<Doctor> DoctorData1 = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from DoctorData";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery();
            
             while(st.next())
             {
                 Doctor p=new Doctor();               
                 p.setUsername(st.getString("username"));                
                 p.setDob(st.getString("dob"));
                 p.setName(st.getString("name"));
                 p.setGender(st.getString("gender"));
                 p.setEmail(st.getString("email"));
                 p.setPhoneNumber(st.getString("phonenumber"));
                 p.setSpecialisation(st.getString("specialisation"));
                 p.setHospitalName(st.getString("hospital"));
//                 p.setResidence(st.getString("Residence"));
//                 p.setDoctor(st.getString("Doctor"));
//                 p.setPhNo(st.getInt("PhoneNumber"));
                
                 DoctorData1.add(p);
           
             }
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
        return DoctorData1;
    }

    public ArrayList<Doctor> getDoctorData() {
        return DoctorData;
    }
    
    public void setDoctorData(ArrayList<Doctor> DoctorData) {
        this.DoctorData = DoctorData;
    }
    
    public Doctor addNewDoctor(){
        Doctor newDoctor = new Doctor();
        DoctorData.add(newDoctor);
        return newDoctor;
    }
    
    public void deleteDoctor(Doctor doctor){
        try {
            // userName
            String userName= doctor.getUsername();
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="DELETE FROM DoctorData WHERE username = '"+userName+"'";
            //PreparedStatement ps=con.prepareStatement(qry);
            stmt.executeUpdate(qry);
            //ResultSet st=ps.executeQuery();
            DoctorData.remove(doctor);
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }  
    }
    
    public void createDoctorInDb(Doctor doctor){
        try {

          
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test;";
            stmt.executeUpdate(qry);
            qry="INSERT INTO DoctorData(username, name, dob, gender, email, phonenumber, specialisation, hospital) VALUES ('"+doctor.getUsername()+"','"+doctor.getName()+"','"+doctor.getDob()+"','"+doctor.getGender()+"','"+doctor.getEmail()+"','"+doctor.getPhoneNumber()+"','"+doctor.getSpecialisation()+"','"+doctor.getHospitalName()+"')";
            //PreparedStatement ps=con.prepareStatement(qry);
            stmt.executeUpdate(qry);
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
    }
    
    public String searchHospitalNameInDb(String text){
        try{
            Connection con=SQLConnection.dbconnector();
            String sql="select * from UserData where username = '"+text+"'";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery();
            
             while(st.next()){
                 String op = st.getString("orgName");
                 return op;
             }
            
        }catch (SQLException ex) {

            //Logger.getLogger(UserData.class.getName()).log(Level.SEVERE, null, ex);

            System.out.print(ex.getMessage());
        }
        return "";
    }
}
