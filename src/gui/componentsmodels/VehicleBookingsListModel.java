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
public class VehicleBookingsListModel {
    String customer;
    Date dateIn;
    Date dateOut;
    String status;

    public VehicleBookingsListModel(Booking booking) {
        this.customer = booking.getRental().getCustomer().getUsername();
        this.dateIn = booking.getRental().getDateIn();
        this.dateOut = booking.getRental().getDateOut();
        this.status = booking.getRental().getRentalstatus();
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return customer + "\t\t" + dateOut + "\t\t" + dateIn + "\t\t" + status;
    }
    
}
