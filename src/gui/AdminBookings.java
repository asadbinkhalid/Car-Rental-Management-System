/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author ehtis
 */

public class AdminBookings extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    
    public AdminBookings() {
        initComponents();
        
    }
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        newBookingButton = new javax.swing.JButton();
        bookingRequestsButton = new javax.swing.JButton();
        closeBookingButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        upcomingPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        upcomingBookingsjList = new javax.swing.JList<>();
        bookingDetailsButton = new javax.swing.JButton();
        cancelBookingButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        previousPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        previousBookingsjList = new javax.swing.JList<>();
        bookingDetailsButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(69, 109, 170));
        jPanel4.setPreferredSize(new java.awt.Dimension(820, 560));

        jPanel2.setBackground(new java.awt.Color(177, 190, 224));

        jLabel1.setBackground(new java.awt.Color(105, 132, 207));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Bookings");

        backButton2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focus"));
        backButton2.setText("Back");
        backButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(backButton2)
                .addGap(274, 274, 274)
                .addComponent(jLabel1)
                .addContainerGap(359, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(backButton2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(177, 190, 224));
        jPanel3.setPreferredSize(new java.awt.Dimension(820, 560));

        newBookingButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focus"));
        newBookingButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        newBookingButton.setText("Add New Booking");
        newBookingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newBookingButtonMouseClicked(evt);
            }
        });

        bookingRequestsButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focus"));
        bookingRequestsButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bookingRequestsButton.setText("Booking Requests");
        bookingRequestsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingRequestsButtonMouseClicked(evt);
            }
        });

        closeBookingButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focus"));
        closeBookingButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        closeBookingButton.setText("Close Booking");
        closeBookingButton.setToolTipText("Select a Booking from this list and Close if the customer has returned the vehicle.");
        closeBookingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBookingButtonMouseClicked(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("Select a Booking from the list!");
        jLabel15.setVisible(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bookingRequestsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(newBookingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(closeBookingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(newBookingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(bookingRequestsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(closeBookingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.setBackground(new java.awt.Color(177, 190, 224));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        upcomingPanel.setBackground(new java.awt.Color(177, 190, 224));
        upcomingPanel.setPreferredSize(new java.awt.Dimension(820, 560));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Client Username");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Vehicle");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Day Out");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Expected Return");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        upcomingBookingsjList.setBackground(new java.awt.Color(177, 190, 224));
        upcomingBookingsjList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Dummy 1", "Dummy 2", "Dummy 3" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        upcomingBookingsjList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        upcomingBookingsjList.setFixedCellHeight(20);
        jScrollPane2.setViewportView(upcomingBookingsjList);

        bookingDetailsButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focus"));
        bookingDetailsButton.setText("See Complete Details");
        bookingDetailsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingDetailsButtonMouseClicked(evt);
            }
        });

        cancelBookingButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focus"));
        cancelBookingButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cancelBookingButton.setText("Cancel Booking");
        cancelBookingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBookingButtonMouseClicked(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(0, 102, 0));
        jLabel7.setText("Selected booking deleted!");
        jLabel7.setVisible(false);

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Select a Booking from the list!");
        jLabel8.setVisible(false);

        javax.swing.GroupLayout upcomingPanelLayout = new javax.swing.GroupLayout(upcomingPanel);
        upcomingPanel.setLayout(upcomingPanelLayout);
        upcomingPanelLayout.setHorizontalGroup(
            upcomingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upcomingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(upcomingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(upcomingPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel6))
                    .addGroup(upcomingPanelLayout.createSequentialGroup()
                        .addComponent(bookingDetailsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelBookingButton)))
                .addContainerGap())
        );
        upcomingPanelLayout.setVerticalGroup(
            upcomingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upcomingPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(upcomingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(upcomingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookingDetailsButton)
                    .addComponent(cancelBookingButton)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("Upcoming", upcomingPanel);

        previousPanel.setBackground(new java.awt.Color(177, 190, 224));
        previousPanel.setPreferredSize(new java.awt.Dimension(820, 560));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Client Username");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Vehicle");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Day Out");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Expected Return");

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        previousBookingsjList.setBackground(new java.awt.Color(177, 190, 224));
        previousBookingsjList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Dummy 1", "Dummy 2", "Dummy 3" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        previousBookingsjList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        previousBookingsjList.setFixedCellHeight(20);
        jScrollPane3.setViewportView(previousBookingsjList);

        bookingDetailsButton1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focus"));
        bookingDetailsButton1.setText("See Complete Details");
        bookingDetailsButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingDetailsButton1MouseClicked(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("Select a Booking from the list!");
        jLabel14.setVisible(false);

        javax.swing.GroupLayout previousPanelLayout = new javax.swing.GroupLayout(previousPanel);
        previousPanel.setLayout(previousPanelLayout);
        previousPanelLayout.setHorizontalGroup(
            previousPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(previousPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(previousPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(previousPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel12))
                    .addGroup(previousPanelLayout.createSequentialGroup()
                        .addComponent(bookingDetailsButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(174, 174, 174)))
                .addContainerGap())
        );
        previousPanelLayout.setVerticalGroup(
            previousPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(previousPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(previousPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(previousPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookingDetailsButton1)
                    .addComponent(jLabel14))
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Previous", previousPanel);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBookingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBookingButtonMouseClicked
        // TODO add your handling code here:
        if ((upcomingBookingsjList.getSelectedIndex() >= 0)){
            jLabel7.setVisible(true);
            jLabel8.setVisible(false);
        }
        else{
            jLabel8.setVisible(true);
            jLabel7.setVisible(false);
        }
    }//GEN-LAST:event_cancelBookingButtonMouseClicked

    private void newBookingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newBookingButtonMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        AddNewBooking page = new AddNewBooking();
        page.start();
    }//GEN-LAST:event_newBookingButtonMouseClicked

    private void bookingDetailsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingDetailsButtonMouseClicked
        // TODO add your handling code here:
        if ((upcomingBookingsjList.getSelectedIndex() >= 0)){
            BookingDetails page = new BookingDetails();
            this.setVisible(false);
            page.start();
        }
        else
            jLabel8.setVisible(true);
        
        
    }//GEN-LAST:event_bookingDetailsButtonMouseClicked

    private void backButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButton2MouseClicked
        // TODO add your handling code here:
        AdminHome page = new AdminHome();
        page.start();
        this.setVisible(false);
    }//GEN-LAST:event_backButton2MouseClicked

    private void bookingRequestsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingRequestsButtonMouseClicked
        // TODO add your handling code here:
        BookingRequests page = new BookingRequests();
        page.start();
        this.setVisible(false);
    }//GEN-LAST:event_bookingRequestsButtonMouseClicked

    private void bookingDetailsButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingDetailsButton1MouseClicked
        // TODO add your handling code here:
        if ((previousBookingsjList.getSelectedIndex() >= 0)){
            BookingDetails page = new BookingDetails();
            this.setVisible(false);
            page.start();
        }
        else
            jLabel14.setVisible(true);
    }//GEN-LAST:event_bookingDetailsButton1MouseClicked

    private void closeBookingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBookingButtonMouseClicked
        // TODO add your handling code here:
        if ((upcomingBookingsjList.getSelectedIndex() >= 0)){
            CloseBooking page = new CloseBooking();
            this.setVisible(false);
            page.start();
        }
        else
            jLabel15.setVisible(true);
        
        
    }//GEN-LAST:event_closeBookingButtonMouseClicked

   
    public void start() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminBookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminBookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminBookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminBookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminBookings().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton2;
    private javax.swing.JButton bookingDetailsButton;
    private javax.swing.JButton bookingDetailsButton1;
    private javax.swing.JButton bookingRequestsButton;
    private javax.swing.JButton cancelBookingButton;
    private javax.swing.JButton closeBookingButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton newBookingButton;
    private javax.swing.JList<String> previousBookingsjList;
    private javax.swing.JPanel previousPanel;
    private javax.swing.JList<String> upcomingBookingsjList;
    private javax.swing.JPanel upcomingPanel;
    // End of variables declaration//GEN-END:variables
}
