/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author asadb
 */
public class Vehicle {
    
    int id;
    String regNum;
    String company;
    String model;
    String color;
    int ratePerDay;
    long mileage;
    float avgFuelEco;
    boolean available;

    public Vehicle(int id, String regNum, String company, String model, String color, int ratePerDay, long mileage, float avgFuelEco, boolean available) {
        this.id = id;
        this.regNum = regNum;
        this.company = company;
        this.model = model;
        this.color = color;
        this.ratePerDay = ratePerDay;
        this.mileage = mileage;
        this.avgFuelEco = avgFuelEco;
        this.available = available;
    }
    
    public Vehicle(String regNum, String company, String model, String color, int ratePerDay, long mileage, float avgFuelEco, boolean available) {
        
        this.regNum = regNum;
        this.company = company;
        this.model = model;
        this.color = color;
        this.ratePerDay = ratePerDay;
        this.mileage = mileage;
        this.avgFuelEco = avgFuelEco;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRatePerDay() {
        return ratePerDay;
    }

    public void setRatePerDay(int ratePerDay) {
        this.ratePerDay = ratePerDay;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

    public float getAvgFuelEco() {
        return avgFuelEco;
    }

    public void setAvgFuelEco(float avgFuelEco) {
        this.avgFuelEco = avgFuelEco;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    
    
}
