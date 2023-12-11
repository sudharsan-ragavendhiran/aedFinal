
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

public class UserInfo {
        private ArrayList<User> UserInfo;

    public UserInfo() {
        this.UserInfo = new ArrayList<User>();
    }

    public ArrayList<User> getUserInfoFromDb() {
        ArrayList<User> UserData1 = new ArrayList();
        try {
            Connection con=SQLConnection.dbconnector();
            String sql="select * from UserData";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet res=ps.executeQuery();
            
             while(res.next())
             {
                 User us=new User();
                 
                 us.setUsername(res.getString("username"));
                 us.setPassword(res.getString("password"));
                 us.setName(res.getString("name"));
                 us.setRole(res.getString("role"));
                 us.setOrg(res.getString("org"));
                 us.setOrgName(res.getString("orgName"));

                
                 UserData1.add(us);
           
             }
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
        return UserData1;
    }

    public ArrayList<User> getUserInfo() {
        return UserInfo;
    }
 
    public void setUserInfo(ArrayList<User> UserInfo) {
        this.UserInfo = UserInfo;
    }
    public User addNewUser(){
        User newUser = new User();
        UserInfo.add(newUser);
        return newUser;
    }
    public void delUser(User user){
        try {
            String userName= user.getUsername();
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry = "USE test";
            stmt.executeUpdate(qry);
            qry="DELETE FROM UserData WHERE username = '"+userName+"'";
            stmt.executeUpdate(qry);
            UserInfo.remove(user);
             
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        
        
    }
    public boolean createUserInDb(User user){
        try {

          
            Connection con=SQLConnection.dbconnector();
            Statement stmt=con.createStatement();
            String qry="INSERT INTO UserData(username, password, name, role, org, orgName) VALUES ('"+user.getUsername()+"','"+user.getPassword()+"','"+user.getName()+"','"+user.getRole()+"','"+user.getOrg()+"','"+user.getOrgName()+"')";

            stmt.executeUpdate(qry);
            return true;
             
        } catch (SQLException ex) {


            System.out.print(ex.getMessage());
        }
            return false;
        
    }
    public String searchOrgNameInDb(String text){
        try{
            Connection con=SQLConnection.dbconnector();
            String sql="select * from UserData where username = '"+text+"'";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet res=ps.executeQuery();
            
             while(res.next()){
                 String org = res.getString("orgName");
                 return org;
             }
            
        }catch (SQLException ex) {


            System.out.print(ex.getMessage());
        }
        return "";
    }
    public String searchNameInDb(String text){
        try{
            Connection con=SQLConnection.dbconnector();
            String sql="select * from UserData where username = '"+text+"'";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet res=ps.executeQuery();
            
             while(res.next()){
                 String name = res.getString("name");
                 return name;
             }
            
        }catch (SQLException ex) {


            System.out.print(ex.getMessage());
        }
        return "";
    }
    public String searchUNameInDb(String text){
        try{
            Connection con=SQLConnection.dbconnector();
            String sql="select * from UserData where name = '"+text+"'";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet res=ps.executeQuery();
            
             while(res.next()){
                 String uname = res.getString("username");
                 return uname;
             }
            
        }catch (SQLException ex) {


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
            ResultSet res = ps.executeQuery();

            while (res.next()) {
                User us = new User();
                us.setName(res.getString("name"));
                us.setRole(res.getString("role"));
                us.setOrg(res.getString("org"));
                us.setOrgName(res.getString("orgName"));
                us.setPassword(res.getString("password"));
                us.setUsername(res.getString("username"));


                userData1.add(us);

            }

        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }

        return userData1;
    }

    
}
