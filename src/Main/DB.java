/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Models.Booking;
import Models.Company;
import Models.Customer;
import Models.Driver;
import Models.Manager;
import Models.Rental;
import Models.Vehicle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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

    List<Customer> readCustomersList() {
        List<Customer> list = new ArrayList<>();
        try {
            Customer cc;

            ResultSet rs = stmt.executeQuery("SELECT * FROM customer");
            while (rs.next()) {
                cc = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                list.add(cc);
            }
            System.out.println("\nCustomers Table Retrieved\n" + rs);

        } catch (SQLException e) {
            System.out.println("\nSql Exception: " + e);
        }
        return list;
    }
    
    List<Rental> readRentalList(Company company) {
        List<Rental> list = new ArrayList<>();
        try{
            Rental rental = null;
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM rental");
            while(rs.next()) {
                rental = new Rental(rs.getInt(1), rs.getString(6), rs.getDate(7), rs.getDate(8), rs.getInt(9), rs.getInt(10), rs.getInt(11), rs.getInt(12), rs.getString(13));
                
                for(int i=0; i<company.getCustomersList().size(); i++) { //get customer from customersList
                    if(company.getCustomersList().get(i).getId() == rs.getInt(5)){
                        rental.setCustomer(company.getCustomersList().get(i));
                    }
                }
                for(int i=0; i<company.getVehiclesList().size(); i++) { //get Vehicle from vehiclesList
                    if(company.getVehiclesList().get(i).getId() == rs.getInt(2)){
                        rental.setVehicle(company.getVehiclesList().get(i));
                    }
                }
                for(int i=0; i<company.getDriversList().size(); i++) { //get driver from driversList
                    if(company.getDriversList().get(i).getId() == rs.getInt(3)){
                        rental.setDriver(company.getDriversList().get(i));
                    }
                }
                for(int i=0; i<company.getManagersList().size(); i++) { //get manager from managersList
                    if(company.getManagersList().get(i).getId() == rs.getInt(5)){
                        rental.setManager(company.getManagersList().get(i));
                    }
                }
                
                list.add(rental);
            }
        } catch(SQLException e){
            System.out.println("\nSql Exception: " + e);
        }
        return list;
    }
    
    List<Booking> readBookingList(List<Rental> rentalList) {
        List<Booking> list = new ArrayList<>();
        try{
            Booking booking = null;
            ResultSet rs = stmt.executeQuery("SELECT * FROM booking");
            while(rs.next()){
                booking = new Booking(rs.getInt(1), rs.getInt(3));
                
                for(int i=0; i < rentalList.size(); i++) {
                    if(rentalList.get(i).getId() == rs.getInt(2)) {
                        booking.setRental(rentalList.get(i));
                    }
                }
                list.add(booking);
            }
            
            
            
        } catch (SQLException e) {
            System.out.println("\nSql Exception: " + e);
        }
        
        return list;
    }

    List<Driver> readDriversList() {
        List<Driver> list = new ArrayList<>();
        try {
            Driver dd;
            ResultSet rs = stmt.executeQuery("SELECT * FROM driver");
            while (rs.next()) {
                dd = new Driver(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getString(9), rs.getString(10), rs.getString(11));
                list.add(dd);
            }
            System.out.println("\nDrivers Table Retrieved\n" + rs);

        } catch (SQLException e) {
            System.out.println("\nSql Exception: " + e);
        }
        return list;
    }

    List<Vehicle> readVehiclesList() {
        List<Vehicle> list = new ArrayList<>();
        try {
            Vehicle vv;
            ResultSet rs = stmt.executeQuery("SELECT * FROM vehicle");
            while (rs.next()) {
                vv = new Vehicle(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getLong(7), rs.getFloat(8), rs.getString(9), rs.getString(10));
                list.add(vv);
            }
            System.out.println("\nVehicles Table Retrieved\n" + rs);

        } catch (SQLException e) {
            System.out.println("\nSql Exception: " + e);
        }
        return list;
    }

    List<Manager> readManagersList() {
        List<Manager> list = new ArrayList<>();
        try {
            Manager mg;
            ResultSet rs = stmt.executeQuery("SELECT * FROM manager");
            while (rs.next()) {
                mg = new Manager(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getString(9), rs.getString(10));
                list.add(mg);
            }
            System.out.println("\nManagers Table Retrieved\n" + rs);

        } catch (SQLException e) {
            System.out.println("\nSql Exception: " + e);
        }
        return list;
    }

    Customer readCustomerById(int id) {
        Customer cc = null;
        try {

            ResultSet rs = stmt.executeQuery("SELECT * FROM client where id = " + id);
            while (rs.next()) {
                cc = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
            }
        } catch (SQLException e) {
            System.out.println("\nSql Exception readCustomerById: " + e);
        }
        return cc;
    }

    Driver readDriverById(int id) {
        Driver dd = null;
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM driver where id = " + id);
            while (rs.next()) {
                dd = new Driver(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getString(9), rs.getString(10), rs.getString(11));
            }
        } catch (SQLException e) {
            System.out.println("\nSql Exception readDriverById: " + e);
        }
        return dd;
    }

    Manager readManagerById(int id) {
        Manager mm = null;
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM manager where id = " + id);
            while (rs.next()) {
                mm = new Manager(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getString(9), rs.getString(10));
            }
        } catch (SQLException e) {
            System.out.println("\nSql Exception readManagerById: " + e);
        }
        return mm;
    }

    Vehicle readVehicleById(int id) {
        Vehicle vv = null;
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM vehicle where id = " + id);
            while (rs.next()) {
                vv = new Vehicle(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getLong(7), rs.getFloat(8), rs.getString(9), rs.getString(10));
            }
        } catch (SQLException e) {
            System.out.println("\nSql Exception readVehicleById: " + e);
        }
        return vv;
    }

    Manager insertManager(Manager manager) {
        try {
            //id auto increment in table
            int rs = stmt.executeUpdate("INSERT INTO manager (name,phone,address,cnic,gender,salary,bonuspercentage,username,password)" + " VALUES ('" + manager.getName() + "','" + manager.getPhone() + "','" + manager.getAddress() + "','" + manager.getCnic() + "','" + manager.getGender() + "'," + manager.getSalary() + "," + manager.getBonusPercentage() + ",'" + manager.getUsername() + "','" + manager.getPassword() + "')");
            System.out.println("\nInserted into Manager: rows affected + " + rs);
            ResultSet rs2 = stmt.executeQuery("select id from manager where username = '" + manager.getUsername() + "' ");
            while (rs2.next()) {
                manager.setId(rs2.getInt(1));
            }
            return manager;
        } catch (SQLException e) {
            System.out.println("\nSql Exception Insert Manager: " + e);
            return null;
        }
    }

    Customer insertCustomer(Customer customer) {
        try {
            //id auto increment in table
            int rs = stmt.executeUpdate("Insert into Customer values ('" + customer.getName() + "','" + customer.getPhone() + "','" +
                    customer.getAddress() + "','" + customer.getCnic() + "','" + customer.getUsername() + "','" + customer.getPassword() + "')");
            System.out.println("\nInserted into Customer: rows affected + " + rs);

            ResultSet rs2 = stmt.executeQuery("select id from customer where username = '" + customer.getUsername() + "'");
            while (rs2.next()) {
                customer.setId(rs2.getInt(1));
            }
            return customer;
        } catch (SQLException e) {
            System.out.println("\nSql Exception Insert Customer: " + e);
            return null;
        }
    }

    Driver insertDriver(Driver driver) {
        try {
            //id auto increment in table
            int rs = stmt.executeUpdate("INSERT INTO driver (name,phone,address,cnic,gender,salary,bonuspercentage,licencenum,licencetype,driverstatus)" + " VALUES ('" + driver.getName() + "','" + driver.getPhone() + "','" + driver.getAddress() + "','" + driver.getCnic() + "','" + driver.getGender() + "'," + driver.getSalary() + "," + driver.getBonusPercentage() + ",'" + driver.getLicenceNum() + "','" + driver.getLicenceType() + "','" + driver.getDriverStatus() + "')");
            System.out.println("\nInserted into Driver: rows affected + " + rs);
            ResultSet rs2 = stmt.executeQuery("select id from driver where cnic = '" + driver.getCnic() + "' ");
            while (rs2.next()) {
                driver.setId(rs2.getInt(1));
            }
            return driver;

        } catch (SQLException e) {
            System.out.println("\nSql Exception Insert Driver: " + e);
            return null;
        }
    }

    Vehicle insertVehicle(Vehicle vehicle) {
        try {
            //id auto increment in table
            int rs = stmt.executeUpdate("INSERT INTO vehicle VALUES ('" + vehicle.getRegNum() + "','" + vehicle.getCompany() + "','" +
                    vehicle.getModel() + "','" + vehicle.getColor() + "'," + vehicle.getRatePerDay() + "," + vehicle.getMileage() + "," +
                    vehicle.getAvgFuelEco() + ",'" + vehicle.getVehicleType() + "','" + vehicle.getVehicleStatus() + "')");
            System.out.println("\nInserted into Vehicle: rows affected + " + rs);

            ResultSet rs2 = stmt.executeQuery("select id from vehicle where regnum = '" + vehicle.getRegNum() + "' ");
            while (rs2.next()) {
                vehicle.setId(rs2.getInt(1));
            }
            return vehicle;

        } catch (SQLException e) {
            System.out.println("\nSql Exception Insert Vehicle: " + e);
            return null;
        }
    }
    
    Rental insertRental(Rental rental) {
        try{
            //id auto increment in table
            int rs = stmt.executeUpdate("INSERT INTO rental VALUES (" + rental.getVehicle().getId() + "," + rental.getDriver().getId() + "," +
                    rental.getManager().getId() + "," + rental.getCustomer().getId() + ",'" + rental.getUsageDetails() + "','" + rental.getDateIn() +
                    "','" + rental.getDateOut() + "'," + rental.getDiscountPercentage() + "," + rental.getTollTaxes() + "," + rental.getKmUsed() + "," +
                    rental.getExtraCharges() + ",'" + rental.getRentalstatus() + "')");
            System.out.println("\nInserted into Rental: rows affected + " + rs);
            
            ResultSet rs2 = stmt.executeQuery("select MAX(id) from rental");
            while(rs2.next()) {
                rental.setId(rs2.getInt(1));
            }
            return rental;
            
        } catch (SQLException e) {
            System.out.println("\nSql Exception Insert Rental: " + e);
            return null;
        }
    }
    
    Booking insertBooking(Booking booking) {
        try{
            //id auto increment in table
            
            int rs = stmt.executeUpdate("INSERT INTO booking VALUES (" + booking.getRental().getId() + ")");
            System.out.println("\nInserted into Booking: rows affected + " + rs);
            
            ResultSet rs2 = stmt.executeQuery("select MAX(id) from booking");
            while(rs2.next()) {
                booking.setId(rs2.getInt(1));
            }
            return booking;
            
        } catch (SQLException e) {
            System.out.println("\nSql Exception Insert Booking: " + e);
            return null;
        }
    }
    
    void deleteDriverById(int id){
        try{
            int rs = stmt.executeUpdate("Delete from driver where id = " + id);
            System.out.println("\nDeleted driver with id=" + id +":\nRows Affected:\t" + rs);
        } catch(SQLException e){
            System.out.println("\nSql Exception Delete Driver: " + e);
        }
        
    }
    
    void deleteCustomerById(int id){
        try{
            int rs = stmt.executeUpdate("Delete from customer where id = " + id);
            System.out.println("\nDeleted Customer with id=" + id +":\nRows Affected:\t" + rs);
        } catch(SQLException e){
            System.out.println("\nSql Exception Delete Customer: " + e);
        }
        
    }
    
//    void deleteManagerById(int id){
//        try{
//            int rs = stmt.executeUpdate("Delete from manager where id = " + id);
//            System.out.println("\nDeleted manager with id=" + id +":\nRows Affected:\t" + rs);
//        } catch(SQLException e){
//            System.out.println("\nSql Exception Delete Manager: " + e);
//        }
//        
//    }
    
    void deleteVehicleById(int id){
        try{
            int rs = stmt.executeUpdate("Delete from vehicle where id = " + id);
            System.out.println("\nDeleted Vehicle with id=" + id +":\nRows Affected:\t" + rs);
        } catch(SQLException e){
            System.out.println("\nSql Exception Delete Vehicle: " + e);
        }
        
    }
    
    
//    boolean updateManager(Manager manager) {
//        try{
//            
//            
//            
//            return true;
//        } catch(SQLException e) {
//            System.out.println("\nSql Exception Update Manager: " + e);
//            return false;
//        }
//    }

}
