/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Robles
 */
public class Add_Drawer_Account extends javax.swing.JFrame {

    ;
    public Add_Drawer_Account() {
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

        add_user_panel = new javax.swing.JPanel();
        add_user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add_user_panel.setBackground(new java.awt.Color(0, 117, 128));
        add_user_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add_user.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        add_user.setForeground(new java.awt.Color(255, 255, 255));
        add_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Add_Supplier_Btn.PNG"))); // NOI18N
        add_user.setText(" MANAGE");
        add_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_userMouseExited(evt);
            }
        });
        add_user_panel.add(add_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 60));

        getContentPane().add(add_user_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 60));

        setBounds(1063, 102, 180, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void add_userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_userMouseExited
        add_user_panel.setBackground(new Color(0,117,128));
        add_user.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_add_userMouseExited

    private void add_userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_userMouseEntered
        add_user_panel.setBackground(new Color(163, 235, 177));
        add_user.setForeground(new Color(33, 21, 34));
    }//GEN-LAST:event_add_userMouseEntered

    private void add_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_userMouseClicked
        Register l = new Register();
        l.setVisible(true);
        add_user_panel.setBackground(new Color(0,117,128));
        dispose();
    }//GEN-LAST:event_add_userMouseClicked

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
            java.util.logging.Logger.getLogger(Add_Drawer_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Drawer_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Drawer_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Drawer_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Drawer_Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add_user;
    private javax.swing.JPanel add_user_panel;
    // End of variables declaration//GEN-END:variables
}
