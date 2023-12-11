
package Model;

import SQLConnection.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


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
            stmt.executeUpdate(qry);
            patientData.remove(patient);
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }
    
    public ArrayList<patient> getPatientDataFromDb() {
        ArrayList<patient> patientData1 = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from PatientData";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet res=ps.executeQuery();
            
             while(res.next())
             {
                 patient p1 = new patient();
                 
     
                 p1.setUsername(res.getString("username"));
                 p1.setName(res.getString("name"));
                 p1.setGender(res.getString("gender"));
                 p1.setEmail(res.getString("email"));
                 p1.setPhoneNumber(res.getString("phonenumber"));
                 p1.setDob(res.getString("dob"));

                
                 patientData1.add(p1);
           
             }
             
        } catch (SQLException ex) {
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
            stmt.executeUpdate(qry);
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
    }
        
    
}

