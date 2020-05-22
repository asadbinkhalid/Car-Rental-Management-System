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
public class Person {
    
    private int id;
    private String name;
    private String phone;
    private String address;
    private String cnic;

    public Person(int id, String name, String phone, String address, String cnic) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.cnic = cnic;
    }
    
    public Person(String name, String phone, String address, String cnic) {
        
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.cnic = cnic;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }
    
    
    
}
