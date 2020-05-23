/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.componentsmodels;

import Models.Booking;

/**
 *
 * @author asadb
 */
public class ReceiptsListModel {
    
    String manager;
    String customer;
    int vehicle;
    int driver;
    int fare;

    public ReceiptsListModel(Booking booking) {
        this.manager = booking.getRental().getManager().getUsername();
        this.customer = booking.getRental().getCustomer().getUsername();
        this.vehicle = booking.getRental().getVehicle().getId();
        this.fare = booking.getTotalFare();
        if(booking.getRental().getDriver() != null)
            this.driver = booking.getRental().getDriver().getId();
        else
            this.driver = -1;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
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

    public int getDriver() {
        return driver;
    }

    public void setDriver(int driver) {
        this.driver = driver;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    @Override
    public String toString() {
        String str = manager + "                                            " + customer + "                                                         " + vehicle +
                "                                                     ";
        if(driver != -1)
            str = str + driver;
        else
            str = str + "-";
        str = str + "                                                          " + fare;
        return str;
    }
    
}
