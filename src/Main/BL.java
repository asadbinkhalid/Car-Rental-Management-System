/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Models.Customer;

/**
 *
 * @author gng
 */
public class BL {
    private final DB db;
    public BL(){
        db = DB.getDatabaseInstance();
    }
    
    void addCustomer(Customer customer){
        db.insertCustomer(customer);
    }
    
}
