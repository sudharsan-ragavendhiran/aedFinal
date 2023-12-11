
package Model;

import SQLConnection.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class HospitalInfo {
    private ArrayList<Hospital> HospitalInfo;
    
    public HospitalInfo() {
        this.HospitalInfo = new ArrayList<Hospital>();
    }
    
    public ArrayList<Hospital> getHospitalInfoFromDb() {
        ArrayList<Hospital> HospitalData1 = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from HospitalData";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet res=ps.executeQuery();
            
             while(res.next())
             {
                 Hospital p=new Hospital();               
                 p.setId(res.getString("id"));                
                 p.setCity(res.getString("city"));
                 p.setName(res.getString("name"));
                 p.setAddress(res.getString("address"));
                 p.setState(res.getString("state"));
                 p.setAreacode(res.getString("areacode"));                
                 HospitalData1.add(p);
           
             }
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
        return HospitalData1;
    }

    public ArrayList<Hospital> getHospitalInfo() {
        return HospitalInfo;
    }
    
    public void setHospitalInfo(ArrayList<Hospital> HospitalInfo) {
        this.HospitalInfo = HospitalInfo;
    }
    
    public Hospital addNewHosp(){
        Hospital newHospital = new Hospital();
        HospitalInfo.add(newHospital);
        return newHospital;
    }
    
    public void delHosp(Hospital hospital){
        try {
            String userName= hospital.getId();
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test;";
            stmt.executeUpdate(qry);
            qry="DELETE FROM HospitalData WHERE id = '"+userName+"'";
            stmt.executeUpdate(qry);
            HospitalInfo.remove(hospital);
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }  
    }
    
    public void createHospInDb(Hospital hospital){
        try {

          
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test;";
            stmt.executeUpdate(qry);
            qry="INSERT INTO HospitalData(id, name, city, address, state, areacode) VALUES ('"+hospital.getId()+"','"+hospital.getName()+"','"+hospital.getCity()+"','"+hospital.getAddress()+"','"+hospital.getState()+"','"+hospital.getAreacode()+"')";
            stmt.executeUpdate(qry);
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
    }
    public ArrayList<String> getHospInDb(){
        try {
            Connection con=SQLConnection.dbconnector();
            String sql= "SELECT * FROM hospitalData;";
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
