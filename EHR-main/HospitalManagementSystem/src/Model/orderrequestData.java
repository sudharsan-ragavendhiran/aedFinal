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
 * @author lokeshbalamurugan
 */
public class orderrequestData {

    private ArrayList<orderrequest> orderData;

    public orderrequestData() {
        this.orderData = new ArrayList<orderrequest>();
    }

    public ArrayList<orderrequest> getOrderRequestDataFromDb() {
        ArrayList<orderrequest> orderData1 = new ArrayList();
        try {
            Connection con = SQLConnection.dbconnector();
            String sql = "select * from supplierrequest";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet st = ps.executeQuery();

            while (st.next()) {
                orderrequest or = new orderrequest();
                or.setPharmacyID(st.getString("pharmacyid"));
                or.setSupplierID(st.getString("supplierid"));
                or.setItem(st.getString("item"));
                or.setStatus(st.getString("status"));
                or.setPrice(st.getInt("price"));
                or.setQuantity(st.getInt("quantity"));
                or.setOldquantity(st.getInt("oldquantity"));
//                 p.setCommunity(st.getString("Community"));
//                 p.setResidence(st.getString("Residence"));
//                 p.setDoctor(st.getString("Doctor"));
//                 p.setPhNo(st.getInt("PhoneNumber"));

                orderData1.add(or);

            }

        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }

        return orderData1;
    }

    public ArrayList<orderrequest> getOrderData() {
        return orderData;
    }

    public void setOrderData(ArrayList<orderrequest> orderData) {
        this.orderData = orderData;
    }

    public void createorderrequestInDb(orderrequest or) {
        try {

            Connection con = SQLConnection.dbconnector();
            Statement stmt = con.createStatement();
            String qry = "USE test;";
            stmt.executeUpdate(qry);
            qry = "INSERT INTO supplierrequest(pharmacyid, supplierid, item, quantity, price, status) VALUES ('" + or.getPharmacyID() + "','" + or.getSupplierID() + "','" + or.getItem() + "','" + or.getQuantity() + "','" + or.getPrice() + "','" + or.getStatus() + "')";
            //PreparedStatement ps=con.prepareStatement(qry);
            stmt.executeUpdate(qry);

        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }

    }
    
    public ArrayList<orderrequest> getAcceptedOrderRequestDataFromDb() {
        ArrayList<orderrequest> orderData1 = new ArrayList();
        try {
            Connection con = SQLConnection.dbconnector();
            String sql = "select * from supplierrequest where status= \"ACCEPTED\"";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet st = ps.executeQuery();

            while (st.next()) {
                orderrequest or = new orderrequest();
                or.setPharmacyID(st.getString("pharmacyid"));
                or.setSupplierID(st.getString("supplierid"));
                or.setItem(st.getString("item"));
                or.setStatus(st.getString("status"));
                or.setPrice(st.getInt("price"));
                or.setQuantity(st.getInt("quantity"));
                or.setOldquantity(st.getInt("oldquantity"));
//                 p.setCommunity(st.getString("Community"));
//                 p.setResidence(st.getString("Residence"));
//                 p.setDoctor(st.getString("Doctor"));
//                 p.setPhNo(st.getInt("PhoneNumber"));

                orderData1.add(or);

            }

        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }

        return orderData1;
    }
    
    public ArrayList<orderrequest> getPlacedOrderRequestDataFromDb() {
        ArrayList<orderrequest> orderData1 = new ArrayList();
        try {
            Connection con = SQLConnection.dbconnector();
            String sql = "select * from supplierrequest where status= \"PLACED\"";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet st = ps.executeQuery();

            while (st.next()) {
                orderrequest or = new orderrequest();
                or.setPharmacyID(st.getString("pharmacyid"));
                or.setSupplierID(st.getString("supplierid"));
                or.setItem(st.getString("item"));
                or.setStatus(st.getString("status"));
                or.setPrice(st.getInt("price"));
                or.setQuantity(st.getInt("quantity"));
                or.setOldquantity(st.getInt("oldquantity"));
//                 p.setCommunity(st.getString("Community"));
//                 p.setResidence(st.getString("Residence"));
//                 p.setDoctor(st.getString("Doctor"));
//                 p.setPhNo(st.getInt("PhoneNumber"));

                orderData1.add(or);

            }

        } catch (SQLException ex) {
            //Logger.getLogger(DoctorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
        }

        return orderData1;
    }

}
