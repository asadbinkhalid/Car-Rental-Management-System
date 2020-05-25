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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gng
 */
public class BL {
    private static BL instance = null;
    
    private final DB db;
    private final Company company;
    
    public BL(){
        db = DB.getDatabaseInstance();
        company = Company.getInstance();
        
        company.setCustomersList(db.readCustomersList());
        company.setDriversList(db.readDriversList());
        company.setVehiclesList(db.readVehiclesList());
        company.setManagersList(db.readManagersList());
        
        List<Rental> rentalList = db.readRentalList(company);
        
        company.setBookingsList(db.readBookingList(rentalList));
        

    }
    
    public static BL getBllInstance() {
        if (instance == null) {
            instance = new BL();
        }
        return instance;
    }

    public DB getDb() {
        return db;
    }

    public Company getCompany() {
        return company;
    }
    
    void addCustomer(Customer customer){
        db.insertCustomer(customer);
    }
    
    public boolean verifyManagerUsername(String username) {
        for(int i=0; i < company.getManagersList().size(); i++) {
            if(username.equals(company.getManagersList().get(i).getUsername())){
                return true;
            }
        }
        return false;
    }
    public boolean verifyManagerPassword(String username, String password) {
        for(int i=0; i < company.getManagersList().size(); i++) {
            if(username.equals(company.getManagersList().get(i).getUsername()) && password.equals(company.getManagersList().get(i).getPassword())){
                return true;
            }
        }
        return false;
    }
    
    public boolean verifyCustomerUsername(String username) {
        for(int i=0; i < company.getCustomersList().size(); i++) {
            if(username.equals(company.getCustomersList().get(i).getUsername())){
                return true;
            }
        }
        return false;
    }
    
    public boolean verifyCustomerPassword(String username, String password) {
        for(int i=0; i < company.getCustomersList().size(); i++) {
            if(username.equals(company.getCustomersList().get(i).getUsername()) && password.equals(company.getCustomersList().get(i).getPassword())){
                return true;
            }
        }
        return false;
    }
    
    public Manager getManager(String username){
        return getCompany().getManager(username);
    }
    
    public Manager getManager(int id){
        return getCompany().getManager(id);
    }
    
    public Driver getDriver(int id){
        return company.getDriver(id);
    }
    
    public Customer getCustomer(String username){
        return company.getCustomer(username);
    }
    
    public Vehicle getVehicle(int id){
        return company.getVehicle(id);
    }
    public Booking getBooking(int id){
        return company.getBooking(id);
    }
    
    
    //
    //
    //          ADD
    //
    //
    
    public boolean addDriver(String name, String phone, String address, String cnic, String gender, int salary, int bonus, String licensenum, String type){
        for(int i=0; i<getCompany().getDriversList().size(); i++){
            if(cnic.equals(getCompany().getDriversList().get(i).getCnic())){
                return  false;
            }
        }
        Driver driver = db.insertDriver(new Driver(name, phone, address, cnic, gender, salary, bonus, licensenum, type));
        if(driver != null){
            getCompany().getDriversList().add(driver);
            return true;
        }
        else
            return false;
    }
    
    public boolean addVehicle(String regNum, String company, String model, String color, int rate, long mileage, float avg, String type){
        for(int i=0; i<getCompany().getVehiclesList().size(); i++){
            if(regNum.equals(getCompany().getVehiclesList().get(i).getRegNum())){
                return  false;
            }
        }
        Vehicle vehicle = db.insertVehicle(new Vehicle(regNum, company, model, color, rate, mileage, avg, type));
        if(vehicle != null){
            getCompany().getVehiclesList().add(vehicle);
            return true;
        }
        else
            return false;
    }
    
    public boolean addCustomer(String name, String phone, String address, String cnic, String username, String password){
        for(int i=0; i<getCompany().getCustomersList().size(); i++){
            if(username.equals(getCompany().getCustomersList().get(i).getUsername())){
                return  false;
            }
        }
        Customer customer = db.insertCustomer(new Customer(name, phone, address, cnic, username, password));
        if(customer != null){
            getCompany().getCustomersList().add(customer);
            return true;
        }
        else
            return false;
    }
    
    public void addBooking(Vehicle vehicle, Driver driver, Manager manager, Customer customer, String usageDetails, Date dateIn, Date dateOut, int discount, int tax, int kmUsed, int extra ){
        Rental rental = db.insertRental(new Rental(vehicle, driver, manager, customer, usageDetails, dateIn, dateOut, discount, tax, kmUsed, extra));
        Booking booking = null;
        if(rental != null){
            booking = db.insertBooking(new Booking(rental));
        }
        if(booking != null){
            company.getBookingsList().add(booking);
        }
    }
    
    public void addBooking(Vehicle vehicle, Manager manager, Customer customer, String usageDetails, Date dateIn, Date dateOut, int discount, int tax, int kmUsed, int extra ){
        Rental rental = db.insertRental(new Rental(vehicle, manager, customer, usageDetails, dateIn, dateOut, discount, tax, kmUsed, extra));
        Booking booking = null;
        if(rental != null){
            booking = db.insertBooking(new Booking(rental));
        }
        if(booking != null){
            company.getBookingsList().add(booking);
        }
    }
    
    
    //
    //
    //          DELETE BY ID 
    //
    //
    public void deleteDriverById(int id){
        
        for(int i=0; i < company.getDriversList().size(); i++){
            if(id == company.getDriversList().get(i).getId()){
                company.getDriversList().remove(i);
            }
        }
        db.deleteDriverById(id);
    }
    
    public void deleteCustomerById(int id){
        
        for(int i=0; i < company.getCustomersList().size(); i++){
            if(id == company.getCustomersList().get(i).getId()){
                company.getCustomersList().remove(i);
            }
        }
        db.deleteCustomerById(id);
    }
    
    public void deleteVehicleById(int id){
        
        for(int i=0; i < company.getVehiclesList().size(); i++){
            if(id == company.getVehiclesList().get(i).getId()){
                company.getVehiclesList().remove(i);
            }
        }
        db.deleteVehicleById(id);
    }
    
    public void deleteBookingById(int id){
        for(int i=0; i<company.getBookingsList().size(); i++){
            if(id == company.getBookingsList().get(i).getId()){
                company.getBookingsList().remove(i);
            }
        }
        db.deleteBookingById(id);
    }
    
    //
    //
    //          UPDATE
    //
    //
    public boolean updateManager(Manager manager){
        return db.updateManager(manager);
    }
    
    public boolean updateCustomer(Customer customer) {
        return db.updateCustomer(customer);
    }
    
    public boolean updateVehicle(Vehicle vehicle){
        return db.updateVehicle(vehicle);
    }
    
    public boolean updateDriver(Driver driver) {
        return db.updateDriver(driver);
    }
    
    public boolean updateBooking(Booking booking){
        return db.updateBooking(booking);
    }
}
