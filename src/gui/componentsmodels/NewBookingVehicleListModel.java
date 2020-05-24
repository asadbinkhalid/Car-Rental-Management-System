/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.componentsmodels;

import Models.Vehicle;

/**
 *
 * @author asadb
 */
public class NewBookingVehicleListModel {
    int id;
    String model;
    int rate;
    float avg;

    public NewBookingVehicleListModel(Vehicle vehicle) {
        this.id = vehicle.getId();
        this.model = vehicle.getModel();
        this.rate = vehicle.getRatePerDay();
        this.avg = vehicle.getAvgFuelEco();;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return model + "                            " + rate + "                            " + avg;
    }
    
    
    
}
