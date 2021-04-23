/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE2;

import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author ROBLES
 */
public class InsertSupplier extends javax.swing.JFrame {
    
    String dates1 = Insert_Genset.as_date.getText().toUpperCase();
    String brand1 = Insert_Genset.as_brand.getText().toUpperCase();;
    String phasing1 = Insert_Genset.as_phasing.getText().toUpperCase();;
    String unit_type = Insert_Genset.as_unitType.getText().toUpperCase();;
    String dimen1 = Insert_Genset.as_dimension.getText().toUpperCase();;
    String kva = Insert_Genset.as_kva.getText().toUpperCase();
    String price1 = Insert_Genset.as_price.getText().toUpperCase();
    String model=Insert_Genset.as_model.getText().toUpperCase();
    String fuel_tank = Insert_Genset.as_fuel_tank.getText().toUpperCase();
    String body_type = Insert_Genset.as_body_parts.getText().toUpperCase();
    String engines_sn  = Insert_Genset.as_engine_sn.getText().toUpperCase() + " " + Insert_Genset.eng_sn.getSelectedItem(); 
    String alter_sn = Insert_Genset.as_alternator_sn.getText().toUpperCase() + " " + Insert_Genset.alt_sn.getSelectedItem();
    
    byte[] person_image1;
    
    public InsertSupplier(byte[] person_image) {
        initComponents();
        id_supplier.setVisible(false);
        id.setVisible(false);
        person_image1 = person_image;
    }
       
    

<<<<<<< HEAD
    
=======
>>>>>>> b3e4ce9fce2ed3584d9376e853ff3edab2b4881c



 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Supplier_Text_display = new javax.swing.JLabel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        sup_name = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        id_supplier = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        sup_address = new javax.swing.JTextField();
        sup_email = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        sup_contact = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        sup_add = new javax.swing.JLabel();
        option = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(3, 33, 73));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Supplier_Text_display.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        Supplier_Text_display.setForeground(new java.awt.Color(255, 255, 255));
        Supplier_Text_display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Supplier_Text_display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Supplier_Text_displayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(Supplier_Text_display, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 11, 365, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 100));

        kGradientPanel5.setkEndColor(new java.awt.Color(153, 204, 255));
        kGradientPanel5.setkStartColor(new java.awt.Color(0, 255, 153));
        kGradientPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sup_name.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        sup_name.setAlignmentY(1.0F);
        kGradientPanel5.add(sup_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 280, 31));

        id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id.setText("NONE");
        kGradientPanel5.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 280, 30));

        id_supplier.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        id_supplier.setText("ID");
        id_supplier.setAlignmentY(1.0F);
        kGradientPanel5.add(id_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 100, 26));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel17.setText("NAME");
        jLabel17.setAlignmentY(1.0F);
        kGradientPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 100, 26));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel16.setText("ADDRESS");
        jLabel16.setAlignmentY(1.0F);
        kGradientPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 100, 26));

        sup_address.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        sup_address.setAlignmentY(1.0F);
        kGradientPanel5.add(sup_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 280, 31));

        sup_email.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        sup_email.setAlignmentY(1.0F);
        kGradientPanel5.add(sup_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 280, 31));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel19.setText("EMAIL ");
        jLabel19.setAlignmentY(1.0F);
        kGradientPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 100, 26));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel18.setText("CONTACT");
        jLabel18.setAlignmentY(1.0F);
        kGradientPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 100, 26));

        sup_contact.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        sup_contact.setAlignmentY(1.0F);
        kGradientPanel5.add(sup_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 280, 31));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CANCEL");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        kGradientPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 160, 50));

        sup_add.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        sup_add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sup_add.setText("SAVE");
        sup_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sup_addMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sup_add, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sup_add, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        kGradientPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 160, 50));
<<<<<<< HEAD

        option.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kGradientPanel5.add(option, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 50, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIEW SUPPLIER");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        kGradientPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 280, 30));
=======
        kGradientPanel5.add(SUPPLIER, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 110, 40));
        kGradientPanel5.add(customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 110, 40));
>>>>>>> b3e4ce9fce2ed3584d9376e853ff3edab2b4881c

        getContentPane().add(kGradientPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 530, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void sup_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sup_addMouseClicked
      String s_name,address,email,contact,getId,banner;
        s_name  =   sup_name.getText();
        address =   sup_address.getText();
        email   =   sup_email.getText();
        contact =   sup_contact.getText();
        getId   =   id.getText();
        banner  =   Supplier_Text_display.getText();
        String choose = "ADD SUPPLIER";
        
        
<<<<<<< HEAD
        if(!Class_Supplier.AddSupplier(s_name, address, contact, email) && !Class_Stock.AddStock(dates1, brand1, phasing1, unit_type, dimen1, kva, price1, model, fuel_tank, body_type, engines_sn, alter_sn,person_image1, dates1))
        {
            JOptionPane.showMessageDialog(null, "OK");
        }  else
        {
            
=======
        if(confirmSupplierCustomer.equals("SAVE") && cus_sup_title.equals("ADD SUPPLIER") ){
            if(s_name.equals("")|| address.equals("") || contact.equals("") || email.equals("")){
                JOptionPane.showMessageDialog(null, "EMPTY FIELDS!","",JOptionPane.ERROR_MESSAGE);
            }
            else{
               if(!Class_Supplier.AddSupplier(s_name, address, contact, email))
                 { 
                     JOptionPane.showMessageDialog(null, "SUCCESSFULY ADD","",JOptionPane.INFORMATION_MESSAGE);
                     Class_table ct = new Class_table(); ct.showGenset(); 
                 }    
            }
         
        }
        
        
        else if(confirmSupplierCustomer.equals("SAVE") && cus_sup_title.equals("ADD CUSTOMER")){
               if(!Class_customers.AddCustomer(s_name, address, contact, email))
                 { 
                     JOptionPane.showMessageDialog(null, "SUCCESSFULY ADD","",JOptionPane.INFORMATION_MESSAGE);
                     Class_table ct = new Class_table(); ct.showCustomer_Table(); 
                 } 
        }
        
        
        
        
        else{
                if(confirmSupplierCustomer.equals("UPDATE") && cus_sup_title.equals("ADD SUPPLIER")){
                    
                    Class_Supplier cs = new Class_Supplier();
                    
                    if(!cs.EditSupplier(s_name, address, contact, email, getId )){
                        Class_table ct = new Class_table();
                        ct.Stocksupplier();
                        JOptionPane.showMessageDialog(null, "UPDATE");
                    }
                }

>>>>>>> b3e4ce9fce2ed3584d9376e853ff3edab2b4881c
        }
  
            
     
//        String getId= id.getText();

//String s_name,address,email,contact;
//        s_name= sup_name.getText();
//        address = sup_address.getText();
//        email = sup_email.getText();
//        contact = sup_contact.getText();
//        String getId= id.getText();
////        String eng_com = engines_sn1+engine1;
////        String alt_com = alters1_sn+ alter_sn1;
//               
//        
//        String confirmSupplierCustomer = sup_add.getText();
//        String cus_sup_title = Supplier_Text_display.getText();
//        
//        if(confirmSupplierCustomer.equals("SAVE") && cus_sup_title.equals("ADD SUPPLIER") ){
//            if(s_name.equals("")|| address.equals("") || contact.equals("") || email.equals("")){
//                JOptionPane.showMessageDialog(null, "EMPTY FIELDS!","",JOptionPane.ERROR_MESSAGE);
//            }
//            else{
//               if(!Class_Supplier.AddSupplier(s_name, address, contact, email))
//                 { 
//                     JOptionPane.showMessageDialog(null, "SUCCESSFULY ADD","",JOptionPane.INFORMATION_MESSAGE);
//                     Class_table ct = new Class_table(); ct.showGenset(); 
//                 }    
//            }
//        }
//        else if(confirmSupplierCustomer.equals("SAVE") && cus_sup_title.equals("ADD CUSTOMER")){
//               if(!Class_customers.AddCustomer(s_name, address, contact, email))
//                 { 
//                     JOptionPane.showMessageDialog(null, "SUCCESSFULY ADD","",JOptionPane.INFORMATION_MESSAGE);
//                     Class_table ct = new Class_table(); ct.showCustomer_Table(); 
//                 } 
//        }
//        else{
//                if(confirmSupplierCustomer.equals("UPDATE") && cus_sup_title.equals("ADD SUPPLIER")){
//                    
//                    Class_Supplier cs = new Class_Supplier();
//                    
//                    if(!cs.EditSupplier(s_name, address, contact, email, getId )){
//                        Class_table ct = new Class_table();
//                        ct.Stocksupplier();
//                        JOptionPane.showMessageDialog(null, "UPDATE");
//                    }
//                }
//
//        }
//
//               
                                                                                                                
               
//               int d2 = Integer.parseInt(dis2.getText());
//               
//               if(d2 == 1)
//               {
//                  if(!Class_Supplier.AddSupplier(s_name, address, contact, email) && !Class_Stock.AddStock(date1, brand1, phasing1, body_type1, unit_type1, kva1, price1, model1, fuel_tank1, body_type1, engines_sn1, alter_sn1, url1, images1));
//                    { JOptionPane.showMessageDialog(null, "SUCCESSFULY ADD"); Class_table ct = new Class_table(); ct.showGenset(); } 
//               }
//               else if(d2 ==2)
//               {
//                  if(!Class_Supplier.AddSupplier(s_name, address, contact, email) && !Class_Filter.AddFilter(date1, names1, des1, brand1, type1, price1, quantity1))
//                    { JOptionPane.showMessageDialog(null, "SUCCESSFULY ADD"); Class_table ct = new Class_table(); ct.showGenset(); } 
//               
//               }

    }//GEN-LAST:event_sup_addMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//        dis1.setText(date1);
//        id.setText(Mainpage.stock_supplier_id.getText());
    }//GEN-LAST:event_formWindowOpened

    private void Supplier_Text_displayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Supplier_Text_displayAncestorAdded
       //String choose = "UPDATE SUPPLIER";
       String update_supplier = Supplier_Text_display.getText();
       
       if(update_supplier.equals("ADD SUPPLIER")){
            id_supplier.setVisible(false);
            id.setVisible(false);
       }
       else{
            if(update_supplier.equals("UPDATE SUPPLIER")){
                    id_supplier.setVisible(true);
                    id.setVisible(true);
                  try{
                      PreparedStatement ps;
                      ResultSet rs;
                      ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `supplier_table` WHERE `ID`='"+id.getText()+"'");
                      rs = ps.executeQuery();
                       while(rs.next()){
                           sup_name.setText(rs.getString("NAME"));
                           sup_address.setText(rs.getString("ADDRESS"));
                           sup_email.setText(rs.getString("EMAIL"));
                           sup_contact.setText(rs.getString("CONTACT"));
                       }
                  }
                  catch(Exception e){
                      e.printStackTrace();
                  }         
            }
            else{
                if(update_supplier.equals("ADD CUSTOMER")){
                    //JOptionPane.showMessageDialog(null, "ADD CUSTOMER");
                }
            }
       }

    }//GEN-LAST:event_Supplier_Text_displayAncestorAdded

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Table_Supplier tbs = new Table_Supplier();
        tbs.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(InsertSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
      
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
    public static javax.swing.JLabel Supplier_Text_display;
=======
    public static javax.swing.JLabel SUPPLIER;
    public static javax.swing.JLabel SUPPLIER_MENU;
    public static javax.swing.JLabel customer;
>>>>>>> b3e4ce9fce2ed3584d9376e853ff3edab2b4881c
    public static javax.swing.JLabel id;
    public static javax.swing.JLabel id_supplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    public static javax.swing.JLabel option;
    public static javax.swing.JLabel sup_add;
    public static javax.swing.JTextField sup_address;
    public static javax.swing.JTextField sup_contact;
    public static javax.swing.JTextField sup_email;
    public static javax.swing.JTextField sup_name;
    // End of variables declaration//GEN-END:variables
}
