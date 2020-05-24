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
import javax.swing.DefaultListModel;

/**
 *
 * @author asadb
 */

public class BookingListModel {
    int id;
    String customer;
    String vehicle;
    Date dateOut;
    Date dateIn;

    public BookingListModel(Booking booking) {
        this.id = booking.getId();
        this.customer = booking.getRental().getCustomer().getUsername();
        this.vehicle = booking.getRental().getVehicle().getRegNum();
        this.dateOut = booking.getRental().getDateOut();
        this.dateIn = booking.getRental().getDateIn();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
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
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        String strDateOut = dateFormat.format(dateOut);
        String strDateIn = dateFormat.format(dateIn);
        return customer + "                                 " + vehicle + "                                   " + strDateOut + "                             " + strDateIn;
    }
}
