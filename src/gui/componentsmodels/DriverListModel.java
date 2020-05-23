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
public class DriverListModel {
    int id;
    String name;
    String phone;
    String license;
    String type;
    int salary;

    public DriverListModel(Driver driver) {
        this.id = driver.getId();
        this.name = driver.getName();
        this.phone = driver.getPhone();
        this.license = driver.getLicenceNum();
        this.type = driver.getLicenceType();
        this.salary = driver.getSalary();
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + "                             " + name + "                                " + phone + "                              " + license + "                                     " + type + "                                  " + salary;
    }
    
}
