
package Model;

import SQLConnection.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


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
            ResultSet res = ps.executeQuery();

            while (res.next()) {
                orderrequest req = new orderrequest();
                req.setPharmacyID(res.getString("pharmacyid"));
                req.setSupplierID(res.getString("supplierid"));
                req.setItem(res.getString("item"));
                req.setStatus(res.getString("status"));
                req.setPrice(res.getInt("price"));
                req.setQuantity(res.getInt("quantity"));
                req.setOldquantity(res.getInt("oldquantity"));


                orderData1.add(req);

            }

        } catch (SQLException ex) {
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
            stmt.executeUpdate(qry);

        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }

    }
    
    public ArrayList<orderrequest> getAcceptedOrderRequestDataFromDb() {
        ArrayList<orderrequest> orderData1 = new ArrayList();
        try {
            Connection con = SQLConnection.dbconnector();
            String sql = "select * from supplierrequest where status= \"ACCEPTED\"";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet res = ps.executeQuery();

            while (res.next()) {
                orderrequest req = new orderrequest();
                req.setPharmacyID(res.getString("pharmacyid"));
                req.setSupplierID(res.getString("supplierid"));
                req.setItem(res.getString("item"));
                req.setStatus(res.getString("status"));
                req.setPrice(res.getInt("price"));
                req.setQuantity(res.getInt("quantity"));
                req.setOldquantity(res.getInt("oldquantity"));

                orderData1.add(req);

            }

        } catch (SQLException ex) {
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
            ResultSet res = ps.executeQuery();

            while (res.next()) {
                orderrequest req = new orderrequest();
                req.setPharmacyID(res.getString("pharmacyid"));
                req.setSupplierID(res.getString("supplierid"));
                req.setItem(res.getString("item"));
                req.setStatus(res.getString("status"));
                req.setPrice(res.getInt("price"));
                req.setQuantity(res.getInt("quantity"));
                req.setOldquantity(res.getInt("oldquantity"));


                orderData1.add(req);

            }

        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }

        return orderData1;
    }

}
