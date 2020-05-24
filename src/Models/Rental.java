/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;

/**
 *
 * @author asadb
 */
public class Rental {
    
    int id;
    Vehicle vehicle;
    Driver driver;
    Manager manager;
    Customer customer;
    String usageDetails;
    Date dateIn;
    Date dateOut;
    int discountPercentage;
    int tollTaxes;
    int kmUsed;
    int extraCharges;
    String rentalstatus;

    public Rental(){
        
    }
    
    public Rental(int id, Vehicle vehicle, Driver driver, Manager manager, Customer customer, String usageDetails, Date dateIn, Date dateOut, int discountPercentage, int tollTaxes, int kmUsed, int extraCharges, String rentalStatus) {
        this.id = id;
        this.vehicle = vehicle;
        this.driver = driver;
        this.manager = manager;
        this.customer = customer;
        this.usageDetails = usageDetails;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.discountPercentage = discountPercentage;
        this.tollTaxes = tollTaxes;
        this.kmUsed = kmUsed;
        this.extraCharges = extraCharges;
        this.rentalstatus = rentalStatus;
    }
    
    public Rental(Vehicle vehicle, Driver driver, Manager manager, Customer customer, String usageDetails, Date dateIn, Date dateOut, int discountPercentage, int tollTaxes, int kmUsed, int extraCharges) {
        this.vehicle = vehicle;
        this.driver = driver;
        this.manager = manager;
        this.customer = customer;
        this.usageDetails = usageDetails;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.discountPercentage = discountPercentage;
        this.tollTaxes = tollTaxes;
        this.kmUsed = kmUsed;
        this.extraCharges = extraCharges;
        this.rentalstatus = "pending";
    }
    
    public Rental(Vehicle vehicle, Manager manager, Customer customer, String usageDetails, Date dateIn, Date dateOut, int discountPercentage, int tollTaxes, int kmUsed, int extraCharges) {
        this.vehicle = vehicle;
        this.driver = null;
        this.manager = manager;
        this.customer = customer;
        this.usageDetails = usageDetails;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.discountPercentage = discountPercentage;
        this.tollTaxes = tollTaxes;
        this.kmUsed = kmUsed;
        this.extraCharges = extraCharges;
        this.rentalstatus = "pending";
    }
    
    public Rental(int id, String usageDetails, Date dateIn, Date dateOut, int discountPercentage, int tollTaxes, int kmUsed, int extraCharges, String rentalstatus) {
        this.vehicle = null;
        this.driver = null;
        this.manager = null;
        this.customer = null;
        this.id = id;
        this.usageDetails = usageDetails;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.discountPercentage = discountPercentage;
        this.tollTaxes = tollTaxes;
        this.kmUsed = kmUsed;
        this.extraCharges = extraCharges;
        this.rentalstatus = rentalstatus;
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getUsageDetails() {
        return usageDetails;
    }

    public void setUsageDetails(String usageDetails) {
        this.usageDetails = usageDetails;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public int getTollTaxes() {
        return tollTaxes;
    }

    public void setTollTaxes(int tollTaxes) {
        this.tollTaxes = tollTaxes;
    }

    public int getKmUsed() {
        return kmUsed;
    }

    public void setKmUsed(int kmUsed) {
        this.kmUsed = kmUsed;
    }

    public int getExtraCharges() {
        return extraCharges;
    }

    public void setExtraCharges(int extraCharges) {
        this.extraCharges = extraCharges;
    }

    public String getRentalstatus() {
        return rentalstatus;
    }

    public void setRentalstatus(String rentalstatus) {
        this.rentalstatus = rentalstatus;
    }

    @Override
    public String toString() {
        return "Rental{" + "id=" + id + ", vehicle=" + vehicle + ", driver=" + driver + ", manager=" + manager + ", customer=" + customer + ", usageDetails=" + usageDetails + ", dateIn=" + dateIn + ", dateOut=" + dateOut + ", discountPercentage=" + discountPercentage + ", tollTaxes=" + tollTaxes + ", kmUsed=" + kmUsed + ", extraCharges=" + extraCharges + ", rentalstatus=" + rentalstatus + '}';
    }
    
    
}
