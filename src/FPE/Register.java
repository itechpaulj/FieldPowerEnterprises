/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Reymundo Robles
 */
public class Register extends javax.swing.JFrame {

    Class_Login a = new Class_Login();
    
        String fn;
        String userlevel ;
        String user;
        String pass ;
        String C_pass ;
        String users;
        
    public Register() {
        initComponents();
        String register_user = a.register_user;
        System.out.print(register_user);
        
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        confirm_password = new javax.swing.JPasswordField();
        fullname = new javax.swing.JTextField();
        level = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Cancel_btn = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Login_Btn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(2, 51, 74));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 34)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Logo/Logo.png"))); // NOI18N
        jLabel5.setText(" Field Power Enterprises");
        jLabel5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel5AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 600, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 120));

        jPanel4.setBackground(new java.awt.Color(42, 142, 142));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setToolTipText("");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 43, -1, -1));

        username.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        username.setForeground(new java.awt.Color(2, 51, 74));
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 300, 35));

        password.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        password.setForeground(new java.awt.Color(2, 51, 74));
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 300, 35));

        confirm_password.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        confirm_password.setForeground(new java.awt.Color(2, 51, 74));
        confirm_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(confirm_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 300, 35));

        fullname.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        fullname.setForeground(new java.awt.Color(2, 51, 74));
        fullname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 300, 35));

        level.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        level.setForeground(new java.awt.Color(2, 51, 74));
        level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "ADMIN", "STAFF" }));
        jPanel4.add(level, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 300, 35));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Password.png"))); // NOI18N
        jLabel2.setText(" PASSWORD");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 230, 35));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Admin.png"))); // NOI18N
        jLabel1.setText(" USERNAME");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 230, 35));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Password.png"))); // NOI18N
        jLabel3.setText(" CONFIRM PASSWORD");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 230, 35));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Admin.png"))); // NOI18N
        jLabel6.setText("TYPE OF USER");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 230, 35));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Admin.png"))); // NOI18N
        jLabel7.setText(" FULLNAME");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 230, 35));

        jPanel2.setBackground(new java.awt.Color(255, 179, 128));

        Cancel_btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Cancel_btn.setForeground(new java.awt.Color(2, 51, 74));
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
            .addComponent(Cancel_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 180, 50));

        jPanel3.setBackground(new java.awt.Color(24, 165, 88));

        Login_Btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Login_Btn.setForeground(new java.awt.Color(2, 51, 74));
        Login_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Login_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Key.png"))); // NOI18N
        Login_Btn.setText(" LOGIN    ");
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

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 180, 50));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 660, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Cancel_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cancel_btnMouseClicked
        dispose();
    }//GEN-LAST:event_Cancel_btnMouseClicked

    private void Cancel_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cancel_btnMouseEntered
        // Cancel_btn.setForeground(new Color(0,51,51));
        jPanel2.setBackground(new Color(255, 199, 148));
    }//GEN-LAST:event_Cancel_btnMouseEntered

    private void Cancel_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cancel_btnMouseExited
        // Cancel_btn.setForeground(new Color(0,51,51));
        jPanel2.setBackground(new Color(255, 179, 128));
    }//GEN-LAST:event_Cancel_btnMouseExited

    private void Login_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_BtnMouseClicked
         fn = fullname.getText();
         userlevel = level.getSelectedItem().toString();
         user = username.getText();
         pass = password.getText();
         C_pass = confirm_password.getText();
        
        if(fn.isEmpty() || userlevel.equals("SELECT") || user.isEmpty() || pass.isEmpty() || C_pass.isEmpty()){
            JOptionPane.showMessageDialog(null, "FILL SOME BLANK","",JOptionPane.ERROR_MESSAGE);
        }
        else if(!pass.equals(C_pass)){
            JOptionPane.showMessageDialog(null, "PASSWORD DOES NOT MATCH!!","",JOptionPane.ERROR_MESSAGE);
        }
        
        else if(user.equals(Class_Login.register_user)){
            
            JOptionPane.showMessageDialog(null, "TRY ANOTHER USERNAME !!","",JOptionPane.ERROR_MESSAGE);
            
        }
        else if(!Class_Login.Register(fn, userlevel, user, pass, C_pass)){
            JOptionPane.showMessageDialog(null, "SUCCESSFULY CREATED");
            
        }
        
    }//GEN-LAST:event_Login_BtnMouseClicked

    private void Login_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_BtnMouseEntered
        // Login_Btn.setBackground(new Color(0,137,148));
        jPanel3.setBackground(new Color(0,173,173));
    }//GEN-LAST:event_Login_BtnMouseEntered

    private void Login_BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_BtnMouseExited
        // Login_Btn.setForeground(new Color(0,51,51));
        jPanel3.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_Login_BtnMouseExited

    private void jLabel5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel5AncestorAdded
//        String ban = jLabel5.getText();
//        if(ban.equals(" Field Power Enterprises")){
//            
//        }
//        try{
//            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT ``USERNAME` FROM `login` WHERE `USERNAME`=? ");
//            users = ps.setString(1,user); 
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//          
//            look = rs.getString("USERNAME");
//            
//            System.out.println(look);
//          
//            
//            }
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_jLabel5AncestorAdded

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cancel_btn;
    private javax.swing.JLabel Login_Btn;
    private javax.swing.JPasswordField confirm_password;
    private javax.swing.JTextField fullname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> level;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
