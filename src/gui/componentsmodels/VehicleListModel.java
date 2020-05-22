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
public class VehicleListModel {
    String company;
    String model;
    String regNum;
    int rate;
    String color;

    public VehicleListModel(Vehicle vehicle) {
        this.company = vehicle.getCompany();
        this.model = vehicle.getModel();
        this.regNum = vehicle.getRegNum();
        this.rate = vehicle.getRatePerDay();
        this.color = vehicle.getColor();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return company + "\t\t" + model + "\t\t" + regNum + "\t\t" + rate + "\t\t" + color;
    }
    
    
    
}
