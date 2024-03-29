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
    
    List<Manager> managersList;
    List<Customer> customersList;
    List<Booking> bookingsList;
    List<Vehicle> vehiclesList;
    List<Driver> driversList;
    
    Manager session;
    Customer cSession;
    
        
    private Company() {
        this.managersList = new ArrayList<>();
        this.customersList = new ArrayList<>();
        this.bookingsList = new ArrayList<>();
        this.vehiclesList = new ArrayList<>();
        this.driversList = new ArrayList<>();
        session = null;
        cSession = null;
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

    public Manager getSession() {
        return session;
    }

    public void setSession(Manager session) {
        this.session = session;
    }

    public Customer getcSession() {
        return cSession;
    }

    public void setcSession(Customer cSession) {
        this.cSession = cSession;
    }
    
    
    public Manager getManager(String username) {
        for(int i=0; i < getManagersList().size(); i++){
            if(username.equals(getManagersList().get(i).getUsername())){
                
                return getManagersList().get(i);
            }
        }
        return null;
    }
    
    public Manager getManager(int id) {
        for(int i=0; i < getManagersList().size(); i++){
            if(id == getManagersList().get(i).getId()){
                
                return getManagersList().get(i);
            }
        }
        return null;
    }

    public Driver getDriver(int id) {
        for(int i=0; i < getDriversList().size(); i++){
            if(id == getDriversList().get(i).getId()){
                
                return getDriversList().get(i);
            }
        }
        return null;
    }
    
    public Vehicle getVehicle(int id) {
        for(int i=0; i < getVehiclesList().size(); i++){
            if(id == getVehiclesList().get(i).getId()){
                
                return getVehiclesList().get(i);
            }
        }
        return null;
    }
    
    public Customer getCustomer(String username) {
        for(int i=0; i < getCustomersList().size(); i++){
            if(username.equals(getCustomersList().get(i).getUsername())){
                
                return getCustomersList().get(i);
            }
        }
        return null;
    }
    
    public Booking getBooking(int id) {
        for(int i=0; i < getBookingsList().size(); i++){
            if(id == getBookingsList().get(i).getId()){
                
                return getBookingsList().get(i);
            }
        }
        return null;
    }
}
