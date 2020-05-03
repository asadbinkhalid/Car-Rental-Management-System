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
public class VIP extends Vehicle{

    public VIP(int id, String regNum, String company, String model, String color, int ratePerDay, long mileage, float avgFuelEco, boolean available) {
        super(id, regNum, company, model, color, ratePerDay, mileage, avgFuelEco, available);
    }
    
    
    
}
