/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.componentsmodels;

import Models.Booking;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author asadb
 */
public class BookingRequestListModel {
    int id;
    String customer;
    Date dateOut;
    String vehicle;
    int driver;

    public BookingRequestListModel(Booking booking) {
        this.id = booking.getId();
        this.customer = booking.getRental().getCustomer().getUsername();
        this.dateOut = booking.getRental().getDateOut();
        this.vehicle = booking.getRental().getVehicle().getRegNum();
        if(booking.getRental().getDriver() != null)
            this.driver = booking.getRental().getDriver().getId();
        else
            this.driver = -1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
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
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String strDateOut = dateFormat.format(dateOut);
        String str = customer + "                                               " + strDateOut + "                                      " + vehicle +
                "                                                      ";
        if(driver != -1)
            str = str + driver;
        else
            str = str + "-";
        return str;
    }
    
    
}
