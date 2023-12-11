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
public class EncounterData {
    private ArrayList<Encounter> EncounterData;
    
    public EncounterData() {
        this.EncounterData = new ArrayList<Encounter>();
    }
    
    public ArrayList<Encounter> getEncounterDataFromDb() {
        ArrayList<Encounter> EncounterData1 = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from EncounterData";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery();
            
             while(st.next())
             {
                 Encounter p=new Encounter();               
                 p.setPatientUsername(st.getString("patientusername"));                
                 p.setDoctorUsername(st.getString("doctorusername"));
                 p.setType(st.getString("type"));
                 p.setTemp(st.getString("temp"));
                 p.setPulse(st.getString("pulse"));
                 p.setBp(st.getString("bp"));
                 p.setComments(st.getString("comments"));
                 p.setDoctorName(st.getString("doctorname"));
                 p.setHospital(st.getString("hospital"));
//                 p.setDoctor(st.getString("Doctor"));
//                 p.setPhNo(st.getInt("PhoneNumber"));
                
                 EncounterData1.add(p);
           
             }
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
        return EncounterData1;
    }
    public ArrayList<Encounter> getEncounterDataFromDbForPatient(String patUsername, String type) {
        ArrayList<Encounter> EncounterData1 = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from EncounterData where patientusername ='"+patUsername+"' AND type = '"+type+"';";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery();
            
             while(st.next())
             {
                 Encounter p=new Encounter();               
                 p.setPatientUsername(st.getString("patientusername"));                
                 p.setDoctorUsername(st.getString("doctorusername"));
                 p.setType(st.getString("type"));
                 p.setTemp(st.getString("temp"));
                 p.setPulse(st.getString("pulse"));
                 p.setBp(st.getString("bp"));
                 p.setComments(st.getString("comments"));
                 p.setDoctorName(st.getString("doctorname"));
                 p.setHospital(st.getString("hospital"));
//                 p.setDoctor(st.getString("Doctor"));
//                 p.setPhNo(st.getInt("PhoneNumber"));
                
                 EncounterData1.add(p);
                 //break;
           
             }
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
        return EncounterData1;
    }
    
    public ArrayList<Encounter> getEncounterDataFromDbForDoctor(String docUsername, String type) {
        ArrayList<Encounter> EncounterData1 = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from EncounterData where doctorusername ='"+docUsername+"' AND type = '"+type+"';";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery();
            
             while(st.next())
             {
                 Encounter p=new Encounter();               
                 p.setPatientUsername(st.getString("patientusername"));                
                 p.setDoctorUsername(st.getString("doctorusername"));
                 p.setType(st.getString("type"));
                 p.setTemp(st.getString("temp"));
                 p.setPulse(st.getString("pulse"));
                 p.setBp(st.getString("bp"));
                 p.setComments(st.getString("comments"));
                 p.setDoctorName(st.getString("doctorname"));
                 p.setHospital(st.getString("hospital"));
//                 p.setDoctor(st.getString("Doctor"));
//                 p.setPhNo(st.getInt("PhoneNumber"));
                
                 EncounterData1.add(p);
                 //break;
           
             }
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
        return EncounterData1;
    }
    
    public ArrayList<Encounter> getEncounterData() {
        return EncounterData;
    }
    
    public void setEncounterData(ArrayList<Encounter> EncounterData) {
        this.EncounterData = EncounterData;
    }
    
    public Encounter addNewEncounter(){
        Encounter newEncounter = new Encounter();
        EncounterData.add(newEncounter);
        return newEncounter;
    }
    
    public void deleteEncounter(Encounter encounter){
        try {
            // userName
            String userName= encounter.getPatientUsername();
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="DELETE FROM EncounterData WHERE username = '"+userName+"'";
            //PreparedStatement ps=con.prepareStatement(qry);
            stmt.executeUpdate(qry);
            //ResultSet st=ps.executeQuery();
            EncounterData.remove(encounter);
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }  
    }
    
    public void createEncounterInDb(Encounter encounter){
        try {

          
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="INSERT INTO EncounterData(patientusername, doctorusername, type, temp, pulse, bp, comments, hospital, doctorname) VALUES ('"+encounter.getPatientUsername()+"','"+encounter.getDoctorUsername()+"','"+encounter.getType()+"','"+encounter.getTemp()+"','"+encounter.getPulse()+"','"+encounter.getBp()+"','"+encounter.getComments()+"','"+encounter.getHospital()+"','"+encounter.getDoctorName()+"')";
            //PreparedStatement ps=con.prepareStatement(qry);
            stmt.executeUpdate(qry);
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
    }
    
}
