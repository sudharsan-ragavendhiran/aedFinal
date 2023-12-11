/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQLConnection;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Iterator;
import javax.swing.JOptionPane;
import org.json.simple.parser.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

//import org.json.JSONTokener

        

/**
 *
 * @author sudharsan
 */
public class SQLConnection {
    Connection con=null;
    public static Connection dbconnector()
    {
        
          
        try
        {
            JSONParser parser = new JSONParser();
            Object obj = new JSONParser().parse(new FileReader("./src/SQLConnection/dbConfig.json"));
            
            JSONObject jObj = (JSONObject) obj;
            JSONObject jObj2 = (JSONObject) jObj.get("sqlConnection");
            System.out.print(jObj2.toJSONString());
            String url= jObj2.get("url").toString();
            String userName= jObj2.get("username").toString();
            String pwd= jObj2.get("password").toString();
            System.out.print("2");
            System.out.println(url+","+userName+","+pwd);
           // Class.forName("org.sqlite.JDBC");
            //Connection con=DriverManager.getConnection("jdbc:sqlite://Users//sudharsan//Desktop//testDB.db");
            Connection con=DriverManager.getConnection(url,userName, pwd);
            System.out.print("Connection Sucessfull");
            Statement stmt=con.createStatement();
            String qry = "USE test;";
            stmt.executeUpdate(qry);
            return con;
            
        }
        catch(Exception e)
                {
                    System.out.print(e.getMessage());
                    return null;
                }
        
    }
    
}
