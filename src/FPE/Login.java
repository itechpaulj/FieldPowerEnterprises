/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author ROBLES
 */
public class Login extends javax.swing.JFrame {

    public static String admin_name = Class_Login.admin_name;
    public static String admin_id = Class_Login.admin_id;
    
    public Login() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Cancel_btn = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Login_Btn = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(2, 51, 74));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Admin.png"))); // NOI18N
        jLabel1.setText(" Username");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 130, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Password.png"))); // NOI18N
        jLabel2.setText(" Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 130, 40));

        username.setBackground(new java.awt.Color(230, 230, 230));
        username.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        username.setForeground(new java.awt.Color(2, 71, 94));
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 240, 40));

        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 43, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 34)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Logo/Logo.png"))); // NOI18N
        jLabel5.setText(" Field Power Enterprises");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 590, 110));

        jPanel2.setBackground(new java.awt.Color(255, 179, 128));

        Cancel_btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Cancel_btn.setForeground(new java.awt.Color(255, 255, 255));
        Cancel_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cancel_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Cancel.png"))); // NOI18N
        Cancel_btn.setText(" CANCEL");
        Cancel_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cancel_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Cancel_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Cancel_btnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cancel_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cancel_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 180, 50));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        Login_Btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Login_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Login_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Login_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Key.png"))); // NOI18N
        Login_Btn.setText(" LOGIN  ");
        Login_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Login_BtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Login_BtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Login_BtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 180, 50));

        password.setBackground(new java.awt.Color(230, 230, 230));
        password.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 240, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Cancel_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cancel_btnMouseExited
        // Cancel_btn.setForeground(new Color(0,51,51));
        jPanel2.setBackground(new Color(255, 179, 128));
    }//GEN-LAST:event_Cancel_btnMouseExited

    private void Cancel_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cancel_btnMouseEntered
        // Cancel_btn.setForeground(new Color(0,51,51));
        jPanel2.setBackground(new Color(255, 199, 148));
    }//GEN-LAST:event_Cancel_btnMouseEntered

    private void Cancel_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cancel_btnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_Cancel_btnMouseClicked

    private void Login_BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_BtnMouseExited
        // Login_Btn.setForeground(new Color(0,51,51));
        jPanel3.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_Login_BtnMouseExited

    private void Login_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_BtnMouseEntered
        // Login_Btn.setBackground(new Color(0,137,148));
        jPanel3.setBackground(new Color(0,173,173));
    }//GEN-LAST:event_Login_BtnMouseEntered

    private void Login_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_BtnMouseClicked
        String user = username.getText();
        String pass = password.getText();

        if(!Class_Login.LoginAdmin(user, pass))
        {
            if(Class_Login.admin_name.equals(user) && Class_Login.password.equals(pass)){
                JOptionPane.showMessageDialog(null, "WELCOME "+Class_Login.admin_name+"","",JOptionPane.INFORMATION_MESSAGE);
                //            Mainpage m = new Mainpage();
                //            m.setVisible(true);
                //            Mainpage.admin_id = Class_Login.admin_id;
                dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD","",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_Login_BtnMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cancel_btn;
    private javax.swing.JLabel Login_Btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
