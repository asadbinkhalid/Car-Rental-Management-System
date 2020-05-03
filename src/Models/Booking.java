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
    boolean fulfilled;

    public Booking(int id, Rental rental, boolean fulfilled) {
        this.id = id;
        this.rental = rental;
        this.fulfilled = fulfilled;
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

    public boolean isFulfilled() {
        return fulfilled;
    }

    public void setFulfilled(boolean fulfilled) {
        this.fulfilled = fulfilled;
    }

    @Override
    public int calculateFare() {
        return 0;
    }

    @Override
    public void changeFulfilledStatus() {   }
    
    
    
}
