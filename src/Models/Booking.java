/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author asadb
 */
public class Booking implements Billing{
    
    int id;
    Rental rental;
    int totalFare;

    public Booking(int id, Rental rental, int totalFare) {
        this.id = id;
        this.rental = rental;
        this.totalFare = totalFare;
    }
    
    public Booking(Rental rental) {
        this.rental = rental;
        this.totalFare = 0;
    }

    public Booking(int id, int totalFare) {
        this.id = id;
        this.totalFare = totalFare;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Rental getRental() {
        return rental;
    }

    public void setRental(Rental rental) {
        this.rental = rental;
    }

    public int getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(int totalFare) {
        this.totalFare = totalFare;
    }

    @Override
    public int calculateFare() {
        int total = 0;
        
        DateFormat df = new SimpleDateFormat("dd MM yyyy");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
        String in = df.format(getRental().getDateIn());
        String out = df.format(getRental().getDateOut());
        
        LocalDateTime lin = LocalDate.parse(in, dtf).atStartOfDay();
        LocalDateTime lout = LocalDate.parse(out, dtf).atStartOfDay();
        
        long d = Duration.between(lout, lin).toDays();
        Long days =  new Long(d);
        total = (rental.getVehicle().getRatePerDay() * days.intValue()) + rental.getTollTaxes() + rental.getExtraCharges();
        total = total - (total*rental.discountPercentage/100);
        
        return total;
    }

    @Override
    public String toString() {
        return "Booking{" + "id=" + id + ", rental=" + rental + ", totalFare=" + totalFare + '}';
    }

    
    
    
}
