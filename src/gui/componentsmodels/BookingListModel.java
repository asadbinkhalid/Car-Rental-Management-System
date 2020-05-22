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
public class BookingListModel {
    String customer;
    int vehicle;
    Date dateOut;
    Date dateIn;

    public BookingListModel(Booking booking) {
        this.customer = booking.getRental().getCustomer().getUsername();
        this.vehicle = booking.getRental().getVehicle().getId();
        this.dateOut = booking.getRental().getDateOut();
        this.dateIn = booking.getRental().getDateIn();
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getVehicle() {
        return vehicle;
    }

    public void setVehicle(int vehicle) {
        this.vehicle = vehicle;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    public Date getDayIn() {
        return dateIn;
    }

    public void setDayIn(Date dayIn) {
        this.dateIn = dayIn;
    }

    @Override
    public String toString() {
        return customer + "\t" + vehicle + "\t\t" + dateOut + "\t" + dateIn;
    }
    
    
    
}
