/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Models.Customer;
import Models.Driver;
import Models.Manager;
import Models.Vehicle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
    
    
    
    
    
    void deleteAllData() {
        try {
            //Deleting data from tables
            int rs = stmt.executeUpdate("Delete from booking");
            rs += stmt.executeUpdate("Delete from customer");
            rs += stmt.executeUpdate("Delete from driver");
            rs += stmt.executeUpdate("Delete from manager");
            rs += stmt.executeUpdate("Delete from vehicle");
            rs += stmt.executeUpdate("Delete from rental");

            //Reseting auto increment ids to zero
            rs += stmt.executeUpdate("DBCC CHECKIDENT (booking,RESEED, 0)");
            rs += stmt.executeUpdate("DBCC CHECKIDENT (rental,RESEED, 0)");
            rs += stmt.executeUpdate("DBCC CHECKIDENT (customer,RESEED, 0)");
            rs += stmt.executeUpdate("DBCC CHECKIDENT (manager,RESEED, 0)");
            rs += stmt.executeUpdate("DBCC CHECKIDENT (driver,RESEED, 0)");
            rs += stmt.executeUpdate("DBCC CHECKIDENT (vehicle,RESEED, 0)");

            System.out.println("\nDeleted all the database data:\nRows Affected:\t" + rs);
        } catch (SQLException e) {
            System.out.println("\nSql Exception DELETE ALL DATA: " + e);
        }
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

    List<Customer> readCustomersList() {
        List<Customer> list = new ArrayList<>();
        
        return list;
    }

    List<Driver> readDriversList() {
        List<Driver> list = new ArrayList<>();
        
        return list;
    }

    List<Vehicle> readVehiclesList() {
        List<Vehicle> list = new ArrayList<>();
        
        return list;
    }

    List<Manager> readManagersList() {
        List<Manager> list = new ArrayList<>();
        
        return list;
    }
    
    
}