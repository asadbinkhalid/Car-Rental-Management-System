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
        return 0;
    }

    @Override
    public String toString() {
        return "Booking{" + "id=" + id + ", rental=" + rental + ", totalFare=" + totalFare + '}';
    }

    
    
    
}
