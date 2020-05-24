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
public class CustomerBookingsUpcomingPreviousListModel {
    int id;
    String manager;
    String vehicle;
    Date dateOut;
    Date dateIn;

    public CustomerBookingsUpcomingPreviousListModel(Booking booking) {
        this.id = booking.getId();
        this.manager = booking.getRental().getManager().getUsername();
        this.vehicle = booking.getRental().getVehicle().getRegNum();
        this.dateOut = booking.getRental().getDateOut();
        this.dateIn = booking.getRental().getDateIn();
    }

    public String getManager() {
        return manager;
    }
    
    public void setManager(String manager) {
        this.manager = manager;
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

    public Date getDayeIn() {
        return dateIn;
    }

    public void setDayeIn(Date dayeIn) {
        this.dateIn = dayeIn;
    }

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        String strDateOut = dateFormat.format(dateOut);
        String strDateIn = dateFormat.format(dateIn);
        return manager + "                                          " + vehicle + "                                                   "
                + strDateOut + "                                                     " + strDateIn;
    }
    
    
    
}
