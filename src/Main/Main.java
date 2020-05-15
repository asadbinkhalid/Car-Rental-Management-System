/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import gui.admin.AdminLogin;
import gui.client.ClientLogin;

/**
 *
 * @author asadb
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
       
        
//        AdminLogin admin = new AdminLogin();
//        admin.start();
        
        ClientLogin client = new ClientLogin();
        client.start();
       
    }
    
}
