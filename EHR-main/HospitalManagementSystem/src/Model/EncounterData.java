
package Model;

import SQLConnection.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


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
            ResultSet res=ps.executeQuery();
            
             while(res.next())
             {
                 Encounter encounter=new Encounter();               
                 encounter.setPatientUsername(res.getString("patientusername"));                
                 encounter.setDoctorUsername(res.getString("doctorusername"));
                 encounter.setType(res.getString("type"));
                 encounter.setTemp(res.getString("temp"));
                 encounter.setPulse(res.getString("pulse"));
                 encounter.setBp(res.getString("bp"));
                 encounter.setComments(res.getString("comments"));
                 encounter.setDoctorName(res.getString("doctorname"));
                 encounter.setHospital(res.getString("hospital"));                
                 EncounterData1.add(encounter);
           
             }
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
        return EncounterData1;
    }
    public ArrayList<Encounter> getEncounterDataFromDbForPatient(String patUsername, String type) {
        ArrayList<Encounter> EncounterList = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from EncounterData where patientusername ='"+patUsername+"' AND type = '"+type+"';";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet res=ps.executeQuery();
            
             while(res.next())
             {
                 Encounter p=new Encounter();               
                 p.setPatientUsername(res.getString("patientusername"));                
                 p.setDoctorUsername(res.getString("doctorusername"));
                 p.setType(res.getString("type"));
                 p.setTemp(res.getString("temp"));
                 p.setPulse(res.getString("pulse"));
                 p.setBp(res.getString("bp"));
                 p.setComments(res.getString("comments"));
                 p.setDoctorName(res.getString("doctorname"));
                 p.setHospital(res.getString("hospital"));                
                 EncounterList.add(p);
           
             }
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
        return EncounterList;
    }
    
    public ArrayList<Encounter> getEncounterDataFromDbForDoctor(String docUsername, String type) {
        ArrayList<Encounter> EncounterList = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from EncounterData where doctorusername ='"+docUsername+"' AND type = '"+type+"';";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet res=ps.executeQuery();
            
             while(res.next())
             {
                 Encounter p=new Encounter();               
                 p.setPatientUsername(res.getString("patientusername"));                
                 p.setDoctorUsername(res.getString("doctorusername"));
                 p.setType(res.getString("type"));
                 p.setTemp(res.getString("temp"));
                 p.setPulse(res.getString("pulse"));
                 p.setBp(res.getString("bp"));
                 p.setComments(res.getString("comments"));
                 p.setDoctorName(res.getString("doctorname"));
                 p.setHospital(res.getString("hospital"));                
                 EncounterList.add(p);
           
             }
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
        return EncounterList;
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
            String userName= encounter.getPatientUsername();
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="DELETE FROM EncounterData WHERE username = '"+userName+"'";
            stmt.executeUpdate(qry);
            EncounterData.remove(encounter);
             
        } catch (SQLException ex) {
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
            stmt.executeUpdate(qry);
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
    }
    
}
