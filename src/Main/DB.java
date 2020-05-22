/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Models.Customer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author gng
 */

public class DB {

    private static DB instance = null;
    private Connection con;
    private Statement stmt;

    private DB() {
        try {
            String s = "jdbc:sqlserver://localhost:1433;databaseName=car_rental_db";
            con = DriverManager.getConnection(s, "sa", "12345678");
            stmt = con.createStatement();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static DB getDatabaseInstance() {
        if (instance == null) {
            instance = new DB();
        }
        return instance;
    }
    
    void insertCustomer (Customer customer) {
        try {
            //id auto increment in table
            int rs = stmt.executeUpdate("Insert into Customer values ('" + customer.getName() + "','" + customer.getPhone() + "','" + customer.getAddress() + "','" + customer.getCnic() + "','" + customer.getUsername() + "','" + customer.getPassword() + "')");

            System.out.println("\nInserted into Assessor: rows affected + " + rs);
        } catch (SQLException e) {
            System.out.println("\nSql Exception Insert Assesor: " + e);
        }

    }
}