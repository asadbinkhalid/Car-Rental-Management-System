/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Models.Company;
import Models.Customer;

/**
 *
 * @author gng
 */
public class BL {
    private static BL instance = null;
    
    private final DB db;
    private final Company company;
    
    public BL(){
        db = DB.getDatabaseInstance();
        company = Company.getInstance();
        
        company.setCustomersList(db.readCustomersList());
        company.setDriversList(db.readDriversList());
        company.setVehiclesList(db.readVehiclesList());
        company.setManagersList(db.readManagersList());
        
        
    }
    
    public static BL getBllInstance() {
        if (instance == null) {
            instance = new BL();
        }
        return instance;
    }

    public DB getDb() {
        return db;
    }

    public Company getCompany() {
        return company;
    }
    
    
    
    void addCustomer(Customer customer){
        db.insertCustomer(customer);
    }
    
}
