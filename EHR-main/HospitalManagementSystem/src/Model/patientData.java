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
public class patientData {
    private ArrayList<patient> patientData;
    
    public patientData() {
        this.patientData = new ArrayList<patient>();
    }

    /**
     *
     * @return
     */
    public ArrayList<patient> getPatientData() {
        return patientData;
    }

    public void setPatientData(ArrayList<patient> patientData) {
        this.patientData = patientData;
    }
    public patient addNewPatient(){
        patient newPatient = new patient();
        patientData.add(newPatient);
        return newPatient;
    }
    
    public void deletePatient(patient patient){
        try {
            
            String userName= patient.getUsername();
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="DELETE FROM PatientData WHERE username = '"+userName+"'";
            //PreparedStatement ps=con.prepareStatement(qry);
            stmt.executeUpdate(qry);
            //ResultSet st=ps.executeQuery();
            patientData.remove(patient);
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
    }
    
    public ArrayList<patient> getPatientDataFromDb() {
        ArrayList<patient> patientData1 = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from PatientData";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery();
            
             while(st.next())
             {
                 patient p = new patient();
//                 String username, name, gender, email, phoneNumber, dob;
//     int age;
                 
     //username, name_, gender, email, phoneNumber, dob, age
     
                 p.setUsername(st.getString("username"));
                 p.setName(st.getString("name"));
                 p.setGender(st.getString("gender"));
                 p.setEmail(st.getString("email"));
                 p.setPhoneNumber(st.getString("phonenumber"));
                 p.setDob(st.getString("dob"));
//                 p.setResidence(st.getString("Residence"));
//                 p.setDoctor(st.getString("Doctor"));
                
                 patientData1.add(p);
           
             }
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
        return patientData1;
    }
    
    public void createPatientInDb(patient patient){
        try {

          
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="INSERT INTO PatientData(username, name, gender, email, phonenumber, dob) VALUES ('"+patient.getUsername()+"','"+patient.getName()+"','"+patient.getGender()+"','"+patient.getEmail()+"','"+patient.getPhoneNumber()+"','"+patient.getDob()+"')";
            //PreparedStatement ps=con.prepareStatement(qry);
            stmt.executeUpdate(qry);
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
    }
        
    
}

