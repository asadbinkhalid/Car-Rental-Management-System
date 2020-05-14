/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Models.Booking;
import java.util.Date;


/**
 *
 * @author gng
 */
public class UpcomingBookingsListCell {
    String client;
    int vehicle;
    Date out;
    Date in;
    
    public UpcomingBookingsListCell(Booking booking){
        client = booking.getRental().getCustomer().getUsername();
        vehicle = booking.getRental().getVehicle().getId();
        out = booking.getRental().getDateOut();
        in = booking.getRental().getDateIn();
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public int getVehicle() {
        return vehicle;
    }

    public void setVehicle(int vehicle) {
        this.vehicle = vehicle;
    }

    public Date getOut() {
        return out;
    }

    public void setOut(Date out) {
        this.out = out;
    }

    public Date getIn() {
        return in;
    }

    public void setIn(Date in) {
        this.in = in;
    }

    @Override
    public String toString() {
        return client + "                                     " + vehicle + "                                 " + out + "                               " + in;
    }
    
    
    
    
}
