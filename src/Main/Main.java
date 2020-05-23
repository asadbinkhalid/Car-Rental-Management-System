/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Models.Customer;
import Models.Manager;
import gui.admin.AdminBookings;
import gui.admin.AdminCustomers;
import gui.admin.AdminDrivers;
import gui.admin.AdminLogin;
import gui.admin.AdminReceipts;
import gui.admin.AdminVehicles;
import gui.client.ClientLogin;
import javax.management.modelmbean.ModelMBeanNotificationBroadcaster;

/**
 *
 * @author asadb
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here

        BL bl = BL.getBllInstance();

        
        
        
//        AdminLogin admin = new AdminLogin();
//        admin.start();
        AdminBookings page = new AdminBookings();
        page.start();
        

//        ClientLogin client = new ClientLogin();
//        client.start();
    }

}
