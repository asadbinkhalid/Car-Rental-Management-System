/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asadb
 */
public class Company {
    private static Company instance = null;
    
    private List<Manager> managersList;
    private List<Customer> customersList;
    private List<Booking> bookingsList;
    private List<Vehicle> vehiclesList;
    private List<Driver> driversList;
        
    private Company() {
        this.managersList = new ArrayList<>();
        this.customersList = new ArrayList<>();
        this.bookingsList = new ArrayList<>();
        this.vehiclesList = new ArrayList<>();
        this.driversList = new ArrayList<>();
    }
    
    public static Company getInstance(){
        if(instance == null) {
            instance = new Company();
        }
        return instance;
    }

    public List<Manager> getManagersList() {
        return managersList;
    }

    public void setManagersList(List<Manager> managersList) {
        this.managersList = managersList;
    }

    public List<Customer> getCustomersList() {
        return customersList;
    }

    public void setCustomersList(List<Customer> customersList) {
        this.customersList = customersList;
    }

    public List<Booking> getBookingsList() {
        return bookingsList;
    }

    public void setBookingsList(List<Booking> bookingsList) {
        this.bookingsList = bookingsList;
    }

    public List<Vehicle> getVehiclesList() {
        return vehiclesList;
    }

    public void setVehiclesList(List<Vehicle> vehiclesList) {
        this.vehiclesList = vehiclesList;
    }

    public List<Driver> getDriversList() {
        return driversList;
    }

    public void setDriversList(List<Driver> driversList) {
        this.driversList = driversList;
    }    
}
