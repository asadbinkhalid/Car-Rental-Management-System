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
public class DriverCustomerBookingsListModel {
    String vehicle;
    String status;
    Date dateOut;
    Date dateIn;

    public DriverCustomerBookingsListModel(Booking booking) {
        this.vehicle = booking.getRental().getVehicle().getRegNum();
        this.status = booking.getRental().getRentalstatus();
        this.dateOut = booking.getRental().getDateOut();
        this.dateIn = booking.getRental().getDateIn();
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    @Override
    public String toString() {
        return vehicle + "         " + dateOut + "              " + dateIn + "               " + status;
    }
    
    
    
    
    
}
