/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.componentsmodels;

import Models.Customer;

/**
 *
 * @author asadb
 */
public class CustomerListModel {
    String username;
    String name;
    String phone;

    public CustomerListModel(Customer customer) {
        this.username = customer.getUsername();
        this.name = customer.getName();
        this.phone = customer.getPhone();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return username + "\t\t\t\t" + name + "\t\t\t\t" + phone;
    }
    
    
    
}
