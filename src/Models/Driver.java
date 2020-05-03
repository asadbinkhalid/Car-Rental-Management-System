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
public class Driver extends Employee{
    
    String licenceType;
    String licenceNum;

    public Driver(int id, String name, String phone, String address, String cnic, String gender, int salary, int bonusPercentage, String licenceType, String licenceNum) {
        super(id, name, phone, address, cnic, gender, salary, bonusPercentage);
        this.licenceType = licenceType;
        this.licenceNum = licenceNum;
    }

    public String getLicenceType() {
        return licenceType;
    }

    public void setLicenceType(String licenceType) {
        this.licenceType = licenceType;
    }

    public String getLicenceNum() {
        return licenceNum;
    }

    public void setLicenceNum(String licenceNum) {
        this.licenceNum = licenceNum;
    }
    
    
    
}
