/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import SQLConnection.SQLConnection;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
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
public class UserData {
        private ArrayList<User> UserData;

    public UserData() {
        this.UserData = new ArrayList<User>();
    }

    public ArrayList<User> getUserDataFromDb() {
        ArrayList<User> UserData1 = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from UserData";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery();
            
             while(st.next())
             {
                 User p=new User();
                 
                 p.setUsername(st.getString("username"));
                 p.setPassword(st.getString("password"));
                 p.setName(st.getString("name"));
                 p.setRole(st.getString("role"));
                 p.setOrg(st.getString("org"));
                 p.setOrgName(st.getString("orgName"));
//                 p.setResidence(st.getString("Residence"));
//                 p.setDoctor(st.getString("Doctor"));
//                 p.setPhNo(st.getInt("PhoneNumber"));
                
                 UserData1.add(p);
           
             }
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
        return UserData1;
    }

    public ArrayList<User> getUserData() {
        return UserData;
    }
 
    public void setUserData(ArrayList<User> UserData) {
        this.UserData = UserData;
    }
    public User addNewUser(){
        User newUser = new User();
        UserData.add(newUser);
        return newUser;
    }
    public void deleteUser(User user){
        try {
            // userName
            String userName= user.getUsername();
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="DELETE FROM UserData WHERE username = '"+userName+"'";
            //PreparedStatement ps=con.prepareStatement(qry);
            stmt.executeUpdate(qry);
            //ResultSet st=ps.executeQuery();
            UserData.remove(user);
             
        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }
        
        
    }
    public boolean createUserInDb(User user){
        try {

          
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
//            String qry = "USE test";
//            stmt.executeUpdate(qry);
            String qry="INSERT INTO UserData(username, password, name, role, org, orgName) VALUES ('"+user.getUsername()+"','"+user.getPassword()+"','"+user.getName()+"','"+user.getRole()+"','"+user.getOrg()+"','"+user.getOrgName()+"')";

            //PreparedStatement ps=con.prepareStatement(qry);
            stmt.executeUpdate(qry);
            return true;
             
        } catch (SQLException ex) {

            //Logger.getLogger(UserData.class.getName()).log(Level.SEVERE, null, ex);

            System.out.print(ex.getMessage());
        }
            return false;
        
    }
    public String searchOrgNameInDb(String text){
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
    public String searchNameInDb(String text){
        try{
            Connection con=SQLConnection.dbconnector();
            String sql="select * from UserData where username = '"+text+"'";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery();
            
             while(st.next()){
                 String op = st.getString("name");
                 return op;
             }
            
        }catch (SQLException ex) {

            //Logger.getLogger(UserData.class.getName()).log(Level.SEVERE, null, ex);

            System.out.print(ex.getMessage());
        }
        return "";
    }
    public String searchUNameInDb(String text){
        try{
            Connection con=SQLConnection.dbconnector();
            String sql="select * from UserData where name = '"+text+"'";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet st=ps.executeQuery();
            
             while(st.next()){
                 String op = st.getString("username");
                 return op;
             }
            
        }catch (SQLException ex) {

            //Logger.getLogger(UserData.class.getName()).log(Level.SEVERE, null, ex);

            System.out.print(ex.getMessage());
        }
        return "";
    }
    
    public ArrayList<User> getEmployeesFromDb() {
        ArrayList<User> userData1 = new ArrayList();
        try {
            Connection con = SQLConnection.dbconnector();
            String sql = "select * from userdata where role= \"Employee\"";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet st = ps.executeQuery();

            while (st.next()) {
                User us = new User();
                us.setName(st.getString("name"));
                us.setRole(st.getString("role"));
                us.setOrg(st.getString("org"));
                us.setOrgName(st.getString("orgName"));
                us.setPassword(st.getString("password"));
                us.setUsername(st.getString("username"));
//                 p.setCommunity(st.getString("Community"));
//                 p.setResidence(st.getString("Residence"));
//                 p.setDoctor(st.getString("Doctor"));
//                 p.setPhNo(st.getInt("PhoneNumber"));

                userData1.add(us);

            }

        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }

        return userData1;
    }

    
}
