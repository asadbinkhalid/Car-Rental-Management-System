/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.componentsmodels;

import Models.Booking;
import java.util.Date;

/**
 *
 * @author asadb
 */
public class BookingRequestListModel {
    String customer;
    Date dateOut;
    int vehicle;
    int driver;

    public BookingRequestListModel(Booking booking) {
        this.customer = booking.getRental().getCustomer().getUsername();
        this.dateOut = booking.getRental().getDateOut();
        this.vehicle = booking.getRental().getVehicle().getId();
        if(booking.getRental().getDriver() != null)
            this.driver = booking.getRental().getDriver().getId();
        else
            this.driver = -1;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    public int getVehicle() {
        return vehicle;
    }

    public void setVehicle(int vehicle) {
        this.vehicle = vehicle;
    }

    public int getDriver() {
        return driver;
    }

    public void setDriver(int driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        String str = customer + "\t\t" + dateOut + "\t\t" + vehicle + "\t\t";
        if(driver != -1)
            str = str + driver;
        else
            str = str + "-";
        return str;
    }
    
    
}
