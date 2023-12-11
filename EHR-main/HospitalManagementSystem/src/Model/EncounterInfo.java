
package Model;

import SQLConnection.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class EncounterInfo {
    private ArrayList<Encounter> EncounterInfo;
    
    public EncounterInfo() {
        this.EncounterInfo = new ArrayList<Encounter>();
    }
    
    public ArrayList<Encounter> getEncounterInfoFromDb() {
        ArrayList<Encounter> EncounterInfoList = new ArrayList();
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
                 EncounterInfoList.add(encounter);
           
             }
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
        return EncounterInfoList;
    }
    public ArrayList<Encounter> getEncounterInfoFromDbForPatient(String patUsername, String type) {
        ArrayList<Encounter> EncounterInfoList = new ArrayList();
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
                 EncounterInfoList.add(p);
           
             }
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
        return EncounterInfoList;
    }
    
    public ArrayList<Encounter> getEncounterInfoFromDbForDoctor(String docUsername, String type) {
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
    
    public ArrayList<Encounter> getEncounterInfo() {
        return EncounterInfo;
    }
    
    public void setEncounterInfo(ArrayList<Encounter> EncounterInfo) {
        this.EncounterInfo = EncounterInfo;
    }
    
    public Encounter addNewEncounter(){
        Encounter newEncounter = new Encounter();
        EncounterInfo.add(newEncounter);
        return newEncounter;
    }
    
    public void delEncounter(Encounter encounter){
        try {
            String userName= encounter.getPatientUsername();
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="DELETE FROM EncounterData WHERE username = '"+userName+"'";
            stmt.executeUpdate(qry);
            EncounterInfo.remove(encounter);
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }  
    }
    
    public void createEncounInDb(Encounter encounter){
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
