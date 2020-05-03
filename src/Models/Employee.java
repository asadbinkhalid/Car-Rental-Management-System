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

public class Employee extends Person{
    
    String gender;
    int salary;
    int bonusPercentage;

    public Employee(int id, String name, String phone, String address, String cnic, String gender, int salary, int bonusPercentage) {
        super(id, name, phone, address, cnic);
        this.gender = gender;
        this.salary = salary;
        this.bonusPercentage = bonusPercentage;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(int bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }
    
    
    
}
