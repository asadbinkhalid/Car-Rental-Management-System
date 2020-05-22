/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Models.Customer;
import gui.admin.AdminLogin;
import gui.client.ClientLogin;
import javax.management.modelmbean.ModelMBeanNotificationBroadcaster;

/**
 *
 * @author asadb
 */
public class Main {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        BL bl = new BL();
        bl.addCustomer(new Customer("Asad", "03330432959", "ERS-22", "35202", "asadbk", "123456"));
        
        
//        AdminLogin admin = new AdminLogin();
//        admin.start();
        
//        ClientLogin client = new ClientLogin();
//        client.start();
       
    }
    
}
