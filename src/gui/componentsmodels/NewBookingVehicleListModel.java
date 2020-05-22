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
    String model;
    int rate;
    float avg;

    public NewBookingVehicleListModel(Vehicle vehicle) {
        this.model = vehicle.getModel();
        this.rate = vehicle.getRatePerDay();
        this.avg = vehicle.getAvgFuelEco();;
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
        return model + "\t\t" + rate + "\t\t" + avg;
    }
    
    
    
}
