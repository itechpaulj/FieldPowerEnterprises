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
 * @author ROBLES
 */
public class Add_Admin extends javax.swing.JFrame {

    public static String admin_name = Class_Login.admin_name;
    public static String admin_id = Class_Login.admin_id;
    
    //public static String admin_ids = "";
    public static String name = "";
    public static String level = "";
    public static String user = "";
        
    public static String pass = "";
    public static String cpass = "";
    
    public Add_Admin() {
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
        add_admin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Login_Btn = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Cancel_btn = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        fn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        c_password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        userlevel = new javax.swing.JComboBox<>();
        username = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 71, 94));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add_admin.setFont(new java.awt.Font("Arial", 1, 34)); // NOI18N
        add_admin.setForeground(new java.awt.Color(255, 255, 255));
        add_admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Logo/Logo.png"))); // NOI18N
        add_admin.setText(" Add Member");
        add_admin.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                add_adminAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(add_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 500, 100));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 120));

        jPanel1.setBackground(new java.awt.Color(42, 142, 142));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 163, 204));

        Login_Btn.setBackground(new java.awt.Color(255, 255, 255));
        Login_Btn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Login_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Login_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Login_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Select/save_33px.png"))); // NOI18N
        Login_Btn.setText(" SAVE");
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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 180, 50));

        jPanel2.setBackground(new java.awt.Color(185, 144, 149));

        Cancel_btn.setBackground(new java.awt.Color(255, 255, 255));
        Cancel_btn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Cancel_btn.setForeground(new java.awt.Color(255, 255, 255));
        Cancel_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cancel_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Select/left_35px.png"))); // NOI18N
        Cancel_btn.setText(" BACK");
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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 180, 50));

        password.setBackground(new java.awt.Color(230, 230, 230));
        password.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        password.setForeground(new java.awt.Color(51, 51, 51));
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 290, 40));

        fn.setBackground(new java.awt.Color(230, 230, 230));
        fn.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        fn.setForeground(new java.awt.Color(51, 51, 51));
        fn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 290, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Password.png"))); // NOI18N
        jLabel2.setText(" PASSWORD");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 180, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Admin.png"))); // NOI18N
        jLabel3.setText(" NAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 180, 40));

        c_password.setBackground(new java.awt.Color(230, 230, 230));
        c_password.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        c_password.setForeground(new java.awt.Color(51, 51, 51));
        c_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(c_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 290, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Password.png"))); // NOI18N
        jLabel4.setText(" CONFIRM PASSWORD");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 220, 40));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Select/star_half_empty_25px.png"))); // NOI18N
        jLabel6.setText(" USER LEVEL");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 180, 40));

        userlevel.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        userlevel.setForeground(new java.awt.Color(51, 51, 51));
        userlevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "ADMIN", "STAFF" }));
        jPanel1.add(userlevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 290, 40));

        username.setBackground(new java.awt.Color(230, 230, 230));
        username.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        username.setForeground(new java.awt.Color(51, 51, 51));
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 290, 40));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Admin.png"))); // NOI18N
        jLabel7.setText(" USERNAME");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 180, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 660, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Cancel_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cancel_btnMouseExited
        jPanel2.setBackground(new Color(185,144,149));
         Cancel_btn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Cancel_btnMouseExited

    private void Cancel_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cancel_btnMouseEntered
        jPanel2.setBackground(new Color(163, 235, 177));
        Cancel_btn.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_Cancel_btnMouseEntered

    private void Cancel_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cancel_btnMouseClicked
        dispose();
    }//GEN-LAST:event_Cancel_btnMouseClicked

    private void Login_BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_BtnMouseExited
        jPanel3.setBackground(new Color(0,163,204));
        Login_Btn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Login_BtnMouseExited

    private void Login_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_BtnMouseEntered
        jPanel3.setBackground(new Color(163, 235, 177));
        Login_Btn.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_Login_BtnMouseEntered

    private void Login_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_BtnMouseClicked
         name = fn.getText().toUpperCase();
         level = userlevel.getSelectedItem().toString();
         user = username.getText().toUpperCase();
        
         pass = password.getText().toUpperCase();
         cpass = c_password.getText().toUpperCase();
        
        if(name.isEmpty() || level.equals("SELECT") || user.isEmpty() || pass.isEmpty() || cpass.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "FIELD IS EMPTY !!","",JOptionPane.ERROR_MESSAGE);
        }
        else if(!pass.equals(cpass))
        {
            JOptionPane.showMessageDialog(null, "PASSSWORD DOES NOT MATCH !!","",JOptionPane.ERROR_MESSAGE); 
        }
        else if (Login_Btn.getText().equals(" SAVE"))
        {
            if(!Class_Login.InsertAdmin(name, level, user, pass))
            {
             JOptionPane.showMessageDialog(null, "SUCCESSFULY ADDED !"); 
             dispose(); Webpage.ct.Admin();            
            }
        }
        else if (Login_Btn.getText().equals(" UPDATE "))
        {
            if(!Class_Login.UpadatetAdmin( name, level, user, pass,admin_id))
            {
             JOptionPane.showMessageDialog(null, "SUCCESSFULY UPDATE !"); 
             dispose(); Webpage.ct.Admin();            
            }
        }
 
    }//GEN-LAST:event_Login_BtnMouseClicked

    private void add_adminAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_add_adminAncestorAdded
        String Banner = add_admin.getText();
        String id = Setting.id;
        if(Banner.equals(" UPDATE MEMBER ")){
                try{
                PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT `ID`, `NAME`, `USER LEVEL`, `USERNAME`,`PASSWORD` FROM `login` WHERE  `ID` = '"+id+"' ");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                 admin_id = rs.getString("ID");
                 fn.setText(rs.getString("NAME"));
                 userlevel.setSelectedItem(rs.getString("USER LEVEL"));
                 username.setText(rs.getString("USERNAME"));
                 password.setText(rs.getString("PASSWORD"));
                 c_password.setText(rs.getString("PASSWORD"));
                 Login_Btn.setText(" UPDATE ");
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
       }
    }//GEN-LAST:event_add_adminAncestorAdded

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
            java.util.logging.Logger.getLogger(Add_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cancel_btn;
    private javax.swing.JLabel Login_Btn;
    public static javax.swing.JLabel add_admin;
    private javax.swing.JPasswordField c_password;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> userlevel;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
