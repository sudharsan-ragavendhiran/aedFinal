
package Model;

import SQLConnection.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class orderrequestInfo {

    private ArrayList<orderrequest> orderInfo;

    public orderrequestInfo() {
        this.orderInfo = new ArrayList<orderrequest>();
    }

    public ArrayList<orderrequest> getOrderRequestInfoFromDb() {
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

    public ArrayList<orderrequest> getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(ArrayList<orderrequest> orderInfo) {
        this.orderInfo = orderInfo;
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
    
    public ArrayList<orderrequest> getAcceptedOrderRequestInfoFromDb() {
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
    
    public ArrayList<orderrequest> getPlacedOrderRequestInfoFromDb() {
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
