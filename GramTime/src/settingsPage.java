/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;

/**
 *
 * @author allai
 */
public class settingsPage extends javax.swing.JFrame {

    public static boolean selected = false;
    /**
     * Creates new form settingsPage
     */
    public settingsPage() {
        initComponents();
        
        if (mainPage.firstTime) {
            jComboBox1.setSelectedIndex(0);
        } else {
            jComboBox1.setSelectedIndex(mainPage.index);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        backButton = new javax.swing.JPanel();
        backImage = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setBackground(new java.awt.Color(204, 234, 255));
        jComboBox1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Time", "5 minutes", "10 minutes", "20 minutes", "30 minutes", "45 minutes", "1 hour" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 330, 110));

        backButton.setOpaque(false);
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backButtonLayout = new javax.swing.GroupLayout(backButton);
        backButton.setLayout(backButtonLayout);
        backButtonLayout.setHorizontalGroup(
            backButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );
        backButtonLayout.setVerticalGroup(
            backButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 370, 160));

        backImage.setBackground(new java.awt.Color(255, 255, 255));
        backImage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back arrow gramtime.png"))); // NOI18N
        backImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backImageMouseClicked(evt);
            }
        });
        jPanel1.add(backImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 190, 120));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Save");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 570, 140, 100));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instagram_background_small.jpg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 570, 180, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back words.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/settings question.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 680, 190));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1311, 809));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        if (jComboBox1.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(jPanel1, "Please select a time");
            selected = false;
        } else if (jComboBox1.getSelectedIndex() == 1) {
            mainPage.time = 15;
            mainPage.index = 1;
            mainPage.firstTime = false;
            selected = true;
            JOptionPane.showMessageDialog(jPanel1, "Your answer has been saved!");
        } else if (jComboBox1.getSelectedIndex() == 2) {
            mainPage.time = 600;
            mainPage.index = 2;
            mainPage.firstTime = false;
            selected = true;
            JOptionPane.showMessageDialog(jPanel1, "Your answer has been saved!");
        } else if (jComboBox1.getSelectedIndex() == 3) {
            mainPage.time = 1200;
            mainPage.index = 3;
            mainPage.firstTime = false;
            selected = true;
            JOptionPane.showMessageDialog(jPanel1, "Your answer has been saved!");
        } else if (jComboBox1.getSelectedIndex() == 4) {
            mainPage.time = 1800;
            mainPage.index = 4;
            mainPage.firstTime = false;
            selected = true;
            JOptionPane.showMessageDialog(jPanel1, "Your answer has been saved!");
        } else if (jComboBox1.getSelectedIndex() == 5) {
            mainPage.time = 2700;
            mainPage.index = 5;
            mainPage.firstTime = false;
            selected = true;
            JOptionPane.showMessageDialog(jPanel1, "Your answer has been saved!");
        } else if (jComboBox1.getSelectedIndex() == 6) {
            mainPage.time = 3600;
            mainPage.index = 6;
            mainPage.firstTime = false;
            selected = true;
            JOptionPane.showMessageDialog(jPanel1, "Your answer has been saved!");
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void backImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backImageMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_backImageMouseClicked

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // TODO add your handling code here:
        new mainPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonMouseClicked

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
            java.util.logging.Logger.getLogger(settingsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(settingsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(settingsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(settingsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new settingsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backButton;
    private javax.swing.JLabel backImage;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
