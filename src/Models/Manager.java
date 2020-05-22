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
public class Manager extends Employee{
    
    String username;
    String password;

    public Manager(int id, String name, String phone, String address, String cnic, String gender, int salary, int bonusPercentage, String username, String password) {
        super(id, name, phone, address, cnic, gender, salary, bonusPercentage);
        this.username = username;
        this.password = password;
    }
    
    public Manager(String name, String phone, String address, String cnic, String gender, int salary, int bonusPercentage, String username, String password) {
        super(name, phone, address, cnic, gender, salary, bonusPercentage);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
