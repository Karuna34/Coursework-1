/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
/**
 *
 * @author HP
 */

public class HomePage extends javax.swing.JFrame {
// List to store residents
    private ArrayList<Newresident> residents = new ArrayList<>();

    /**
     * Creates new form HomePage
     */
    public HomePage() {
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

        Backgroundcolor = new javax.swing.JPanel();
        NewResistant = new javax.swing.JButton();
        ManageRooms = new javax.swing.JButton();
        NewStaff = new javax.swing.JButton();
        StaffPayment = new javax.swing.JButton();
        logoutbutton = new javax.swing.JButton();
        EmergencyContactdetails = new javax.swing.JButton();
        welcomemessage = new javax.swing.JLabel();
        Backgroundimage = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Backgroundcolor.setBackground(new java.awt.Color(153, 204, 255));
        Backgroundcolor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NewResistant.setBackground(new java.awt.Color(255, 102, 102));
        NewResistant.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NewResistant.setText("New Resident");
        NewResistant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewResistantActionPerformed(evt);
            }
        });
        Backgroundcolor.add(NewResistant, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 191, -1));

        ManageRooms.setBackground(new java.awt.Color(255, 102, 102));
        ManageRooms.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ManageRooms.setText("Manage Rooms");
        ManageRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageRoomsActionPerformed(evt);
            }
        });
        Backgroundcolor.add(ManageRooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 191, -1));

        NewStaff.setBackground(new java.awt.Color(255, 102, 102));
        NewStaff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NewStaff.setText("New Staff  ");
        NewStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewStaffActionPerformed(evt);
            }
        });
        Backgroundcolor.add(NewStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 191, -1));

        StaffPayment.setBackground(new java.awt.Color(255, 102, 102));
        StaffPayment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        StaffPayment.setText("Staff Payment");
        Backgroundcolor.add(StaffPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 191, -1));

        logoutbutton.setBackground(new java.awt.Color(255, 102, 102));
        logoutbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_pacakage/Close all jframe.png"))); // NOI18N
        logoutbutton.setText("Logout");
        logoutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbuttonActionPerformed(evt);
            }
        });
        Backgroundcolor.add(logoutbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, 120, -1));

        EmergencyContactdetails.setBackground(new java.awt.Color(255, 102, 102));
        EmergencyContactdetails.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EmergencyContactdetails.setText("Emergency Contact details");
        Backgroundcolor.add(EmergencyContactdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 220, -1));

        welcomemessage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        welcomemessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_pacakage/happy face.png"))); // NOI18N
        welcomemessage.setText("                                                                                                       Welcome to oldage Home Management system");
        welcomemessage.setBorder(new javax.swing.border.MatteBorder(null));
        Backgroundcolor.add(welcomemessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 40));

        Backgroundimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image_pacakage/old-age-home background picture.jpg"))); // NOI18N
        Backgroundcolor.add(Backgroundimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        jButton1.setText("jButton1");
        Backgroundcolor.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Backgroundcolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Backgroundcolor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewResistantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewResistantActionPerformed
         Newresident newResidentPage = new Newresident();
        newResidentPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NewResistantActionPerformed

    private void logoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbuttonActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_logoutbuttonActionPerformed

    private void ManageRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageRoomsActionPerformed
        // TODO add your handling code here:
        ManageRoom manageRoomsPage = new ManageRoom();
        manageRoomsPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ManageRoomsActionPerformed

    private void NewStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewStaffActionPerformed
        // TODO add your handling code here: 
         NewStaff NewStaffPage = new NewStaff();
        NewStaffPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NewStaffActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Backgroundcolor;
    private javax.swing.JLabel Backgroundimage;
    private javax.swing.JButton EmergencyContactdetails;
    private javax.swing.JButton ManageRooms;
    private javax.swing.JButton NewResistant;
    private javax.swing.JButton NewStaff;
    private javax.swing.JButton StaffPayment;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JLabel welcomemessage;
    // End of variables declaration//GEN-END:variables
}
