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
public class CustomerBookingsUpcomingPreviousListModel {
    String manager;
    int vehicle;
    Date dateOut;
    Date dateIn;

    public CustomerBookingsUpcomingPreviousListModel(Booking booking) {
        this.manager = booking.getRental().getManager().getUsername();
        this.vehicle = booking.getRental().getVehicle().getId();
        this.dateOut = booking.getRental().getDateOut();
        this.dateIn = booking.getRental().getDateIn();
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
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

    public Date getDayeIn() {
        return dateIn;
    }

    public void setDayeIn(Date dayeIn) {
        this.dateIn = dayeIn;
    }

    @Override
    public String toString() {
        return manager + "\t\t" + vehicle + "\t\t\t" + dateOut + "\t\t" + dateIn;
    }
    
    
    
}
