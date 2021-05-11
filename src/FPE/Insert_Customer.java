
package FPE;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Insert_Customer extends javax.swing.JFrame {
    
    String ids = null;
    
    public Insert_Customer() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        Display_Customer = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        panel_customer_list = new javax.swing.JPanel();
        Supplier_List_Btn2 = new javax.swing.JLabel();
        Insert_Customer_contact = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Insert_Customer_email = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Insert_Customer_address = new javax.swing.JTextArea();
        Insert_Customer_name = new javax.swing.JTextField();
        id1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        Stock_Genset_Back = new javax.swing.JLabel();
        Stock_Genset_Panel_Update = new javax.swing.JPanel();
        Stock_Genset_Update = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        Insert_customer_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 71, 94));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Display_Customer.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Display_Customer.setForeground(new java.awt.Color(255, 255, 255));
        Display_Customer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Display_Customer.setText("ADD CUSTOMER");
        Display_Customer.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Display_CustomerAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(Display_Customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 480, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 100));

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 153));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 255, 153));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_customer_list.setBackground(new java.awt.Color(255, 255, 179));

        Supplier_List_Btn2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Supplier_List_Btn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Supplier_List_Btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Exist.png"))); // NOI18N
        Supplier_List_Btn2.setText(" CUSTOMER LIST   ");
        Supplier_List_Btn2.setAlignmentY(1.0F);
        Supplier_List_Btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Supplier_List_Btn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_customer_listLayout = new javax.swing.GroupLayout(panel_customer_list);
        panel_customer_list.setLayout(panel_customer_listLayout);
        panel_customer_listLayout.setHorizontalGroup(
            panel_customer_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_customer_listLayout.createSequentialGroup()
                .addComponent(Supplier_List_Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );
        panel_customer_listLayout.setVerticalGroup(
            panel_customer_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_customer_listLayout.createSequentialGroup()
                .addComponent(Supplier_List_Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        kGradientPanel1.add(panel_customer_list, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 250, 30));

        Insert_Customer_contact.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        kGradientPanel1.add(Insert_Customer_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 250, 30));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setText("CONTACT NO.");
        jLabel18.setAlignmentY(1.0F);
        kGradientPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 100, 30));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setText("EMAIL ");
        jLabel19.setAlignmentY(1.0F);
        kGradientPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 100, 30));

        Insert_Customer_email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        kGradientPanel1.add(Insert_Customer_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 250, 30));

        Insert_Customer_address.setColumns(20);
        Insert_Customer_address.setRows(5);
        jScrollPane1.setViewportView(Insert_Customer_address);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 250, 110));

        Insert_Customer_name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        kGradientPanel1.add(Insert_Customer_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 250, 30));

        id1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id1.setText("NAME");
        id1.setAlignmentY(1.0F);
        kGradientPanel1.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 100, 30));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setText("ADDRESS");
        jLabel21.setAlignmentY(1.0F);
        kGradientPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 100, 30));

        Stock_Genset_Panel_Back.setBackground(new java.awt.Color(255, 194, 102));

        Stock_Genset_Back.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Back.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Images_Back_Btn.png"))); // NOI18N
        Stock_Genset_Back.setText(" BACK     ");
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
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_BackLayout.setVerticalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        kGradientPanel1.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 150, -1));

        Stock_Genset_Panel_Update.setBackground(new java.awt.Color(51, 187, 255));

        Stock_Genset_Update.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Update.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Save_Btn.png"))); // NOI18N
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
            .addComponent(Stock_Genset_Update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_UpdateLayout.setVerticalGroup(
            Stock_Genset_Panel_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        kGradientPanel1.add(Stock_Genset_Panel_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 150, -1));

        id2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id2.setText("ID");
        id2.setAlignmentY(1.0F);
        kGradientPanel1.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 100, 30));

        Insert_customer_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_customer_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kGradientPanel1.add(Insert_customer_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 250, 30));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 480, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Display_CustomerAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Display_CustomerAncestorAdded
        String Banner = Display_Customer.getText();
        String id = Table_Customer.Customer_id.getText();
        Class_tables ts = new Class_tables();
        if(Banner.equals("CUSTOMER SELECTED"))
        {
            try{
                PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT `ID`, `NAME`, `ADDRESS`, `EMAIL`, `CONTACT` FROM `customer_table` WHERE `ID` = '"+id+"'");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                 Insert_customer_id.setText(rs.getString("ID"));
                 Insert_Customer_name.setText(rs.getString("NAME"));
                 Insert_Customer_address.setText(rs.getString("ADDRESS"));
                 Insert_Customer_email.setText(rs.getString("EMAIL"));
                 Insert_Customer_contact.setText(rs.getString("CONTACT"));
                 ts.Customer();
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }else if(Banner.equals("UPDATE CUSTOMER")){
                try{
                PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT `ID`, `NAME`, `ADDRESS`, `EMAIL`, `CONTACT` FROM `customer_table` WHERE `ID` = '"+id+"' ");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                 Insert_customer_id.setText(rs.getString("ID"));
                 Insert_Customer_name.setText(rs.getString("NAME"));
                 Insert_Customer_address.setText(rs.getString("ADDRESS"));
                 Insert_Customer_email.setText(rs.getString("EMAIL"));
                 Insert_Customer_contact.setText(rs.getString("CONTACT"));
                 ts.Customer();
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
            }
    }//GEN-LAST:event_Display_CustomerAncestorAdded

    private void Stock_Genset_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseClicked
        dispose();
    }//GEN-LAST:event_Stock_Genset_BackMouseClicked

    private void Stock_Genset_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseEntered
        Stock_Genset_Back.setForeground(new Color(41, 61, 61));
        Stock_Genset_Panel_Back.setBackground(new Color(255,194,102));
    }//GEN-LAST:event_Stock_Genset_BackMouseEntered

    private void Stock_Genset_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseExited
        Stock_Genset_Back.setForeground(new Color(255,255,255));
        Stock_Genset_Panel_Back.setBackground(new Color(255,194,102));
    }//GEN-LAST:event_Stock_Genset_BackMouseExited

    private void Stock_Genset_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseClicked
        String Banner = Display_Customer.getText().toUpperCase();
        
        String name = Insert_Customer_name.getText().toUpperCase();
        String address = Insert_Customer_address.getText().toUpperCase();
        String email = Insert_Customer_email.getText().toUpperCase();
        String contact = Insert_Customer_contact.getText().toUpperCase();
        Class_tables ts = new Class_tables();
        if(name.equals("") || address.equals("") || email.equals("") || contact.equals("")){
           JOptionPane.showMessageDialog(null, " INPUT SOME FIELDS !!","",JOptionPane.ERROR_MESSAGE); 
        }
        else if(Banner.equals("ADD CUSTOMER")){
           if(!Class_Customers.ExistCustomer(email)){
               JOptionPane.showMessageDialog(null, "ALREADY EXIST EMAIL!\nPLEASE TRY DIFFERENT!","",JOptionPane.WARNING_MESSAGE);
           } 
            else{
            if(!Class_Customers.AddCustomer(name, address, contact, email))
            {
                JOptionPane.showMessageDialog(null, "SUCCESSFULY ADDED");
                dispose();
                ts.Customer();
            }
           }
        }
        else if (Banner.equals("UPDATE CUSTOMER")){
            String id = Insert_customer_id.getText();
            if(!Class_Customers.EditCustomer(name, address, contact, email, id))
            {
               JOptionPane.showMessageDialog(null, "SUCCESSFULY UPDATED");
               dispose();
               ts.Customer();
            }
        }

    }//GEN-LAST:event_Stock_Genset_UpdateMouseClicked

    private void Stock_Genset_UpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseEntered
        Stock_Genset_Update.setForeground(new Color(41, 61, 61));
        Stock_Genset_Panel_Update.setBackground(new Color(51, 187, 255));
    }//GEN-LAST:event_Stock_Genset_UpdateMouseEntered

    private void Stock_Genset_UpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseExited
        Stock_Genset_Update.setForeground(new Color(255,255,255));
        Stock_Genset_Panel_Update.setBackground(new Color(51, 187, 255));
    }//GEN-LAST:event_Stock_Genset_UpdateMouseExited

    private void Supplier_List_Btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplier_List_Btn2MouseClicked
        Table_Customer.Path.setText("1");
        dispose();
    }//GEN-LAST:event_Supplier_List_Btn2MouseClicked

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
    private javax.swing.JTextArea Insert_Customer_address;
    private javax.swing.JTextField Insert_Customer_contact;
    private javax.swing.JTextField Insert_Customer_email;
    private javax.swing.JTextField Insert_Customer_name;
    public static javax.swing.JTextField Insert_customer_id;
    private javax.swing.JLabel Stock_Genset_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Update;
    private javax.swing.JLabel Stock_Genset_Update;
    private javax.swing.JLabel Supplier_List_Btn2;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    public static javax.swing.JPanel panel_customer_list;
    // End of variables declaration//GEN-END:variables
}
