
package FPE;

import FPE.Class_Customers;
import FPE.Class_tables;
import FPE.FPE_DB;
import FPE.Table_Customer;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Insert_Customer extends javax.swing.JFrame {
    
    String ids = null;
    Class_tables ct = new Class_tables();
        
    public Insert_Customer() {
        initComponents();
        ct.Customer();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        Display_Customer = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        Stock_Genset_Back = new javax.swing.JLabel();
        Stock_Genset_Panel_Update = new javax.swing.JPanel();
        Stock_Genset_Update = new javax.swing.JLabel();
        Insert_Customer_name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Insert_Customer_address = new javax.swing.JTextArea();
        Insert_Customer_contact = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 71, 94));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Display_Customer.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Display_Customer.setForeground(new java.awt.Color(255, 255, 255));
        Display_Customer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Display_Customer.setText("ADD NEW CUSTOMER");
        Display_Customer.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Display_CustomerAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(Display_Customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 560, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 120));

        kGradientPanel1.setkEndColor(new java.awt.Color(42, 142, 142));
        kGradientPanel1.setkStartColor(new java.awt.Color(42, 142, 142));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Stock_Genset_Panel_Back.setBackground(new java.awt.Color(185, 144, 149));

        Stock_Genset_Back.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Back.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/arrow_35px.png"))); // NOI18N
        Stock_Genset_Back.setText(" BACK");
        Stock_Genset_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Genset_BackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Genset_BackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Genset_BackMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_BackLayout = new javax.swing.GroupLayout(Stock_Genset_Panel_Back);
        Stock_Genset_Panel_Back.setLayout(Stock_Genset_Panel_BackLayout);
        Stock_Genset_Panel_BackLayout.setHorizontalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_BackLayout.setVerticalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        kGradientPanel1.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 170, -1));

        Stock_Genset_Panel_Update.setBackground(new java.awt.Color(0, 163, 204));

        Stock_Genset_Update.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Update.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Select/save_33px.png"))); // NOI18N
        Stock_Genset_Update.setText(" SAVE");
        Stock_Genset_Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Genset_UpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Genset_UpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Genset_UpdateMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_UpdateLayout = new javax.swing.GroupLayout(Stock_Genset_Panel_Update);
        Stock_Genset_Panel_Update.setLayout(Stock_Genset_Panel_UpdateLayout);
        Stock_Genset_Panel_UpdateLayout.setHorizontalGroup(
            Stock_Genset_Panel_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_UpdateLayout.setVerticalGroup(
            Stock_Genset_Panel_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        kGradientPanel1.add(Stock_Genset_Panel_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 170, -1));

        Insert_Customer_name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Customer_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Customer_name.setBorder(null);
        kGradientPanel1.add(Insert_Customer_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 290, 40));
        Insert_Customer_name.getAccessibleContext().setAccessibleDescription("");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Insert_Customer_address.setColumns(20);
        Insert_Customer_address.setRows(5);
        jScrollPane1.setViewportView(Insert_Customer_address);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 290, 40));

        Insert_Customer_contact.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Customer_contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Customer_contact.setBorder(null);
        kGradientPanel1.add(Insert_Customer_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 290, 40));
        Insert_Customer_contact.getAccessibleContext().setAccessibleDescription("");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Admin.png"))); // NOI18N
        jLabel3.setText(" CUSTOMER NAME");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 200, 40));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/New/marker_25px.png"))); // NOI18N
        jLabel6.setText(" ADDRESS");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 200, 40));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Select/phone_25px.png"))); // NOI18N
        jLabel7.setText(" CONTACT");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 180, 40));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 660, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Display_CustomerAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Display_CustomerAncestorAdded
        String Banner = Display_Customer.getText();
        String id = Table_Customer.cus_id;
        if(Banner.equals("UPDATE CUSTOMER")){
                try{
                PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT `ID`, `NAME`, `ADDRESS`,`CONTACT` FROM `customer_table` WHERE `ID` = '"+id+"' ");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                 ids = rs.getString("ID");
                 Insert_Customer_name.setText(rs.getString("NAME"));
                 Insert_Customer_address.setText(rs.getString("ADDRESS"));
              
                 Insert_Customer_contact.setText(rs.getString("CONTACT"));
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
       }


    }//GEN-LAST:event_Display_CustomerAncestorAdded

    private void Stock_Genset_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseClicked
        dispose();
        ct.Customer();
        Table_Customer.cus_id = "";
    }//GEN-LAST:event_Stock_Genset_BackMouseClicked

    private void Stock_Genset_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseEntered
        
       Stock_Genset_Panel_Back.setBackground(new Color(163, 235, 177));
        Stock_Genset_Back.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_Stock_Genset_BackMouseEntered

    private void Stock_Genset_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseExited
        Stock_Genset_Panel_Back.setBackground(new Color(185,144,149));
         Stock_Genset_Back.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Stock_Genset_BackMouseExited

    private void Stock_Genset_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseClicked
        String Banner = Display_Customer.getText();
        String name = Insert_Customer_name.getText().toUpperCase();
        String address = Insert_Customer_address.getText().toUpperCase();

        String contact = Insert_Customer_contact.getText().toUpperCase();
        
     
         if(name.equals("") || address.equals("") || contact.equals("")){
         JOptionPane.showMessageDialog(null, " INPUT SOME FIELDS !!","",JOptionPane.ERROR_MESSAGE);
         ct.Customer();
            }
            else if(Banner.equals("ADD NEW CUSTOMER")){
                if(!Class_Customers.ExistCustomer(name)){
                    JOptionPane.showMessageDialog(null, "CUSTOMER ALREADY EXIST!","",JOptionPane.INFORMATION_MESSAGE);
                    ct.Customer();
                }else{
                    if(!Class_Customers.AddCustomer(name, address, contact))
                    {
                        JOptionPane.showMessageDialog(null, "SUCCESSFULY ADDED");
                        ct.Customer();

                    } 
                }
            }
            else if(Banner.equals("UPDATE CUSTOMER")){
            if(!Class_Customers.EditCustomer(name, address, contact, ids))
            {
               JOptionPane.showMessageDialog(null, "SUCCESSFULY UPDATED");
             
               ct.Customer();
                 dispose();
            }
            }
      
        
        




    }//GEN-LAST:event_Stock_Genset_UpdateMouseClicked

    private void Stock_Genset_UpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseEntered
        Stock_Genset_Panel_Update.setBackground(new Color(163, 235, 177));
        Stock_Genset_Update.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_Stock_Genset_UpdateMouseEntered

    private void Stock_Genset_UpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseExited
        Stock_Genset_Panel_Update.setBackground(new Color(0,163,204));
        Stock_Genset_Update.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Stock_Genset_UpdateMouseExited

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
            java.util.logging.Logger.getLogger(Insert_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert_Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Display_Customer;
    public static javax.swing.JTextArea Insert_Customer_address;
    public static javax.swing.JTextField Insert_Customer_contact;
    public static javax.swing.JTextField Insert_Customer_name;
    private javax.swing.JLabel Stock_Genset_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Update;
    private javax.swing.JLabel Stock_Genset_Update;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
