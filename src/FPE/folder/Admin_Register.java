/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE.folder;

import FPE.FPE_DB;
import FPE.Mainpage;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Robles
 */
public class Admin_Register extends javax.swing.JFrame {

   // String admin_id = Mainpage.admin_id;
    
    public Admin_Register() {
        initComponents();
        fetch();
        Disable();
    }

    public void Enable()
    {
    
        fn.setEnabled(true);
        email.setEnabled(true);
        user.setEnabled(true);
        pass.setEnabled(true); 
    }
        public void Disable()
    {
     
        fn.setEditable(false);
        email.setEditable(false);
        user.setEditable(false);
        pass.setEditable(false); 
    }

        public void fetch(){
             try{
                PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `login` WHERE `ID`="+Mainpage.admin_id+"");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
              
                fn.setText(rs.getString("NAME"));
                email.setText(rs.getString("EMAIL"));
                user.setText(rs.getString("USERNAME"));
                pass.setText(rs.getString("PASSWORD"));
                
                }}catch(Exception e){
                   e.printStackTrace();
                        }
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Add = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        fn = new javax.swing.JTextField();
        pass = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        back_btn = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        Header = new javax.swing.JPanel();
        displays = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Add.setBackground(new java.awt.Color(42, 142, 142));
        Add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Profile.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 51, 74)));
        Add.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 200, 180));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("ADMIN NAME");
        Add.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 130, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("EMAIL");
        Add.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 130, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("USERNAME");
        Add.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 130, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("PASSWORD");
        Add.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 130, 30));

        email.setBackground(new java.awt.Color(42, 142, 142));
        email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Add.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 260, 30));

        fn.setBackground(new java.awt.Color(42, 142, 142));
        fn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Add.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 260, 30));

        pass.setBackground(new java.awt.Color(42, 142, 142));
        pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Add.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 260, 30));

        jPanel5.setBackground(new java.awt.Color(255, 173, 51));

        back_btn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        back_btn.setForeground(new java.awt.Color(255, 255, 255));
        back_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Backss.png"))); // NOI18N
        back_btn.setText("BACK");
        back_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                back_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                back_btnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Add.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 190, 50));

        user.setBackground(new java.awt.Color(42, 142, 142));
        user.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Add.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 260, 30));

        getContentPane().add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 920, 500));

        Header.setBackground(new java.awt.Color(2, 51, 74));
        Header.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        displays.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        displays.setForeground(new java.awt.Color(255, 255, 255));
        displays.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displays.setText("ADMIN PROFILE");
        displays.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                displaysAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Header.add(displays, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 690, 80));

        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void displaysAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_displaysAncestorAdded

    }//GEN-LAST:event_displaysAncestorAdded

    private void back_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_btnMouseClicked
        dispose();
    }//GEN-LAST:event_back_btnMouseClicked

    private void back_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_btnMouseEntered
        jPanel5.setBackground(new Color(255,193,71));
    }//GEN-LAST:event_back_btnMouseEntered

    private void back_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_btnMouseExited
        jPanel5.setBackground(new Color(255,173,51));
    }//GEN-LAST:event_back_btnMouseExited

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
            java.util.logging.Logger.getLogger(Admin_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Add;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel back_btn;
    public static javax.swing.JLabel displays;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JFormattedTextField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
