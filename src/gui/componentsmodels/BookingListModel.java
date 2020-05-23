/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.componentsmodels;

import Models.Booking;
import java.util.Date;
import javax.swing.DefaultListModel;

/**
 *
 * @author asadb
 */

public class BookingListModel {
    String customer;
    String vehicle;
    Date dateOut;
    Date dateIn;

    public BookingListModel(Booking booking) {
        this.customer = booking.getRental().getCustomer().getUsername();
        this.vehicle = booking.getRental().getVehicle().getRegNum();
        this.dateOut = booking.getRental().getDateOut();
        this.dateIn = booking.getRental().getDateIn();
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
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
        return customer + "                                 " + vehicle + "                                   " + dateOut + "                             " + dateIn;
    }
}
