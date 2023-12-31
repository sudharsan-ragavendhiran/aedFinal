
package Model;

import SQLConnection.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class DoctorInfo {
    private ArrayList<Doctor> DoctorInfo;
    
    public DoctorInfo() {
        this.DoctorInfo = new ArrayList<Doctor>();
    }
    
    public ArrayList<Doctor> getDoctorInfoFromDb() {
        ArrayList<Doctor> DoctorList = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from DoctorData";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet res=ps.executeQuery();
            
             while(res.next())
             {
                 Doctor doc=new Doctor();               
                 doc.setUsername(res.getString("username"));                
                 doc.setDob(res.getString("dob"));
                 doc.setName(res.getString("name"));
                 doc.setGender(res.getString("gender"));
                 doc.setEmail(res.getString("email"));
                 doc.setPhoneNumber(res.getString("phonenumber"));
                 doc.setSpecialisation(res.getString("specialisation"));
                 doc.setHospitalName(res.getString("hospital"));
                 DoctorList.add(doc);
           
             }
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
        return DoctorList;
    }

    public ArrayList<Doctor> getDoctorInfo() {
        return DoctorInfo;
    }
    
    public void setDoctorInfo(ArrayList<Doctor> DoctorInfo) {
        this.DoctorInfo = DoctorInfo;
    }
    
    public Doctor addNewDoctor(){
        Doctor newDoctor = new Doctor();
        DoctorInfo.add(newDoctor);
        return newDoctor;
    }
    
    public void deleteDoctor(Doctor doctor){
        try {
            String userName= doctor.getUsername();
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="DELETE FROM DoctorData WHERE username = '"+userName+"'";
            stmt.executeUpdate(qry);
            DoctorInfo.remove(doctor);
             
        } catch (SQLException ex) {
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
            stmt.executeUpdate(qry);
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
    }
    
    public String searchHospNameInDb(String text){
        try{
            Connection con=SQLConnection.dbconnector();
            String sql="select * from UserData where username = '"+text+"'";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet res=ps.executeQuery();
            
             while(res.next()){
                 String op = res.getString("orgName");
                 return op;
             }
            
        }catch (SQLException ex) {


            System.out.print(ex.getMessage());
        }
        return "";
    }
}
