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
    int vehicle;
    String status;
    Date dateOut;
    Date dateIn;

    public DriverCustomerBookingsListModel(Booking booking) {
        this.vehicle = booking.getRental().getVehicle().getId();
        this.status = booking.getRental().getRentalstatus();
        this.dateOut = booking.getRental().getDateOut();
        this.dateIn = booking.getRental().getDateIn();
    }

    public int getVehicle() {
        return vehicle;
    }

    public void setVehicle(int vehicle) {
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
        return vehicle + "" + dateOut + "" + dateIn + "" + status;
    }
    
    
    
    
    
}
