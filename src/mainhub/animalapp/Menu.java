/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainhub.animalapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Menu extends javax.swing.JFrame {
     private AnimalUI animalUI;

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        animalUI = new AnimalUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        selectAnimalBTN = new javax.swing.JButton();
        exitBTN = new javax.swing.JButton();
        addBTN = new javax.swing.JButton();
        galleryBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhub/animalapp/animalapplogo2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 0, 360, 80));

        selectAnimalBTN.setBackground(new java.awt.Color(0, 0, 0));
        selectAnimalBTN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        selectAnimalBTN.setForeground(new java.awt.Color(255, 255, 255));
        selectAnimalBTN.setText("Select Animals");
        selectAnimalBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAnimalBTNActionPerformed(evt);
            }
        });
        getContentPane().add(selectAnimalBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 150, 30));

        exitBTN.setBackground(new java.awt.Color(0, 0, 0));
        exitBTN.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        exitBTN.setForeground(new java.awt.Color(255, 255, 255));
        exitBTN.setText("Exit");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });
        getContentPane().add(exitBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 80, 30));

        addBTN.setBackground(new java.awt.Color(0, 0, 0));
        addBTN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addBTN.setForeground(new java.awt.Color(255, 255, 255));
        addBTN.setText("Add in your own animal!");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });
        getContentPane().add(addBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 230, -1));

        galleryBTN.setBackground(new java.awt.Color(0, 0, 0));
        galleryBTN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        galleryBTN.setForeground(new java.awt.Color(255, 255, 255));
        galleryBTN.setText("Gallery");
        galleryBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                galleryBTNActionPerformed(evt);
            }
        });
        getContentPane().add(galleryBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainhub/animalapp/animalss (1).jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectAnimalBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAnimalBTNActionPerformed
        // opens UI
      animalUI.menu();
    }//GEN-LAST:event_selectAnimalBTNActionPerformed

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed

        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
    if (dialogResult == JOptionPane.YES_OPTION) {
        this.setVisible(false);
    }
    }//GEN-LAST:event_exitBTNActionPerformed

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        // TODO add your handling code here:
       Add add = new Add();
       add.setVisible(true);
    }//GEN-LAST:event_addBTNActionPerformed

    private void galleryBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_galleryBTNActionPerformed
        // TODO add your handling code here:
        Gallery gallery = new Gallery();
        gallery.setVisible(true);
    }//GEN-LAST:event_galleryBTNActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JButton exitBTN;
    private javax.swing.JButton galleryBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton selectAnimalBTN;
    // End of variables declaration//GEN-END:variables
}
