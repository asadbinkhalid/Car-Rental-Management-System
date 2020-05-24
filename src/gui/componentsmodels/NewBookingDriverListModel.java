/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.componentsmodels;

import Models.Driver;

/**
 *
 * @author asadb
 */
public class NewBookingDriverListModel {
    int id;
    String name;
    String gender;
    String phone;

    public NewBookingDriverListModel(Driver driver) {
        this.id = driver.getId();
        this.name = driver.getName();
        this.gender = driver.getGender();
        this.phone = driver.getPhone();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + "                           " + gender + "                               " + phone;
    }   
}
