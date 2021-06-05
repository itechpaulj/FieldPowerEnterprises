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
 * @author Robles
 */
public class Admin_Register extends javax.swing.JFrame {

    String admin_id = Mainpage.admin_id;
    
    public Admin_Register() {
        initComponents();
        fetch();
    }

    public void Enable()
    {
        em_id.setEnabled(true);
        fn.setEnabled(true);
        email.setEnabled(true);
        user.setEnabled(true);
        pass.setEnabled(true); 
    }
        public void Disable()
    {
        em_id.setEnabled(false);
        fn.setEnabled(false);
        email.setEnabled(false);
        user.setEnabled(false);
        pass.setEnabled(false); 
    }
        public void Clear()
    {
       em_id.setText(null);
        fn.setText(null);
        email.setText(null);
        user.setText(null);
        pass.setText(null); 
    }
        public void fetch(){
             try{
                PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `login` WHERE `ID`="+Mainpage.admin_id+"");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                em_id.setText(rs.getString("EMPLOYER ID"));
                fn.setText(rs.getString("FULNAME"));
                email.setText(rs.getString("CONTACT NO"));
                user.setText(rs.getString("USERNAME"));
                pass.setText(rs.getString("PASSWORD"));
                
                }}catch(Exception e){
                   e.printStackTrace();
                        }
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        displays = new javax.swing.JLabel();
        Add = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        fn = new javax.swing.JTextField();
        em_id = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        ok_btn = new javax.swing.JLabel();
        pass = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        back_btn = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        view_btn = new javax.swing.JLabel();
        user = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 100));

        Add.setBackground(new java.awt.Color(42, 142, 142));
        Add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("EMPLOYER ID");
        Add.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 130, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("FULLNAME ");
        Add.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 130, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("EMAIL");
        Add.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 130, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("USERNAME");
        Add.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 130, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("PASSWORD");
        Add.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 130, 30));

        email.setBackground(new java.awt.Color(42, 142, 142));
        email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Add.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 260, 30));

        fn.setBackground(new java.awt.Color(42, 142, 142));
        fn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Add.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 260, 30));

        em_id.setBackground(new java.awt.Color(42, 142, 142));
        em_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        em_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        em_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        em_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                em_idActionPerformed(evt);
            }
        });
        Add.add(em_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 260, 30));

        ok_btn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ok_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ok_btn.setText("ADD ADMIN");
        ok_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ok_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ok_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ok_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Add.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 170, 50));

        pass.setBackground(new java.awt.Color(42, 142, 142));
        pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Add.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 260, 30));

        back_btn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        back_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back_btn.setText("BACK");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Add.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 170, 50));

        view_btn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        view_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        view_btn.setText("ADMIN LIST");
        view_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(view_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(view_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Add.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 170, 50));

        user.setBackground(new java.awt.Color(42, 142, 142));
        user.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Add.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 260, 30));

        getContentPane().add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 950, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ok_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ok_btnMouseClicked
       String em_id1 = em_id.getText();
       String fn1 = fn.getText();
       String email1 = email.getText();
       String user1 = user.getText();
       String pass1 = pass.getText();
       
       String ok = ok_btn.getText();
       if(ok.equals("ADD ADMIN")){
            
            em_id.setBackground(new Color(255,255,255));
            fn.setBackground(new Color(255,255,255));
            email.setBackground(new Color(255,255,255));
            user.setBackground(new Color(255,255,255));
            pass.setBackground(new Color(255,255,255));
            Enable();
            Clear();
            ok_btn.setText("SAVE");
            view_btn.setText("CANCEL");
         
       }else if(ok.equals("SAVE")){
           Class_Login.InsertAdmin(em_id1, fn1, email1, user1, pass1);
            JOptionPane.showMessageDialog(null, " SUCCESSFULLY ADD ","",JOptionPane.INFORMATION_MESSAGE);
            em_id.setBackground(new Color(42,142,142));
            fn.setBackground(new Color(42,142,142));
            email.setBackground(new Color(42,142,142));
            user.setBackground(new Color(42,142,142));
            pass.setBackground(new Color(42,142,142));
            Disable();
            ok_btn.setText("ADD ADMIN");
            view_btn.setText("ADMIN LIST");
    
       }
        
    }//GEN-LAST:event_ok_btnMouseClicked

    private void view_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_btnMouseClicked
        
        String view = view_btn.getText();
        if(view.equals("CANCEL"))
        {
            Clear();
            Disable();
            fetch();
        }else if (view.equals("ADMIN LIST"))
        {
            
        }
    }//GEN-LAST:event_view_btnMouseClicked

    private void displaysAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_displaysAncestorAdded

    }//GEN-LAST:event_displaysAncestorAdded

    private void em_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_em_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_em_idActionPerformed

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
    private javax.swing.JTextField em_id;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel ok_btn;
    private javax.swing.JFormattedTextField pass;
    private javax.swing.JTextField user;
    private javax.swing.JLabel view_btn;
    // End of variables declaration//GEN-END:variables
}
