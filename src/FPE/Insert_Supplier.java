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

public class Insert_Supplier extends javax.swing.JFrame {

    /**
     * Creates new form Insert_Supplier
     */
    public Insert_Supplier() {
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
        Display_Supplier = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        panel_supplier_list = new javax.swing.JPanel();
        Supplier_List_Btn2 = new javax.swing.JLabel();
        Insert_Supplier_contact = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Insert_Supplier_email = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Insert_Supplier_address = new javax.swing.JTextArea();
        Insert_Supplier_name = new javax.swing.JTextField();
        id1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        Stock_Genset_Back = new javax.swing.JLabel();
        Stock_Genset_Panel_Update = new javax.swing.JPanel();
        Stock_Genset_Save = new javax.swing.JLabel();
        Insert_Supplier_id = new javax.swing.JTextField();
        id2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 51, 74));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Display_Supplier.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Display_Supplier.setForeground(new java.awt.Color(255, 255, 255));
        Display_Supplier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Display_Supplier.setText("ADD SUPPLIER");
        Display_Supplier.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Display_SupplierAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(Display_Supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 410, 60));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 100));

        kGradientPanel1.setkEndColor(new java.awt.Color(42, 142, 142));
        kGradientPanel1.setkStartColor(new java.awt.Color(42, 142, 142));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_supplier_list.setBackground(new java.awt.Color(255, 255, 179));

        Supplier_List_Btn2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Supplier_List_Btn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Supplier_List_Btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Supplier.png"))); // NOI18N
        Supplier_List_Btn2.setText(" SUPPLIER LIST   ");
        Supplier_List_Btn2.setAlignmentY(1.0F);
        Supplier_List_Btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Supplier_List_Btn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_supplier_listLayout = new javax.swing.GroupLayout(panel_supplier_list);
        panel_supplier_list.setLayout(panel_supplier_listLayout);
        panel_supplier_listLayout.setHorizontalGroup(
            panel_supplier_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Supplier_List_Btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        panel_supplier_listLayout.setVerticalGroup(
            panel_supplier_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Supplier_List_Btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        kGradientPanel1.add(panel_supplier_list, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 280, 40));

        Insert_Supplier_contact.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Supplier_contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kGradientPanel1.add(Insert_Supplier_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 280, 30));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setText("CONTACT NO.");
        jLabel18.setAlignmentY(1.0F);
        kGradientPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, 30));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setText("EMAIL ");
        jLabel19.setAlignmentY(1.0F);
        kGradientPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 100, 30));

        Insert_Supplier_email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Supplier_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kGradientPanel1.add(Insert_Supplier_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 280, 30));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Insert_Supplier_address.setColumns(20);
        Insert_Supplier_address.setRows(5);
        jScrollPane1.setViewportView(Insert_Supplier_address);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 280, 80));

        Insert_Supplier_name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Supplier_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kGradientPanel1.add(Insert_Supplier_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 280, 30));

        id1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id1.setText("NAME");
        id1.setAlignmentY(1.0F);
        kGradientPanel1.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 100, 30));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setText("ADDRESS");
        jLabel21.setAlignmentY(1.0F);
        kGradientPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 100, 30));

        Stock_Genset_Panel_Back.setBackground(new java.awt.Color(255, 194, 102));

        Stock_Genset_Back.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Back.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Backss.png"))); // NOI18N
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
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_BackLayout.setVerticalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        kGradientPanel1.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 180, -1));

        Stock_Genset_Panel_Update.setBackground(new java.awt.Color(51, 187, 255));

        Stock_Genset_Save.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Save.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Save.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Save.png"))); // NOI18N
        Stock_Genset_Save.setText(" SAVE");
        Stock_Genset_Save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Genset_SaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Genset_SaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Genset_SaveMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_UpdateLayout = new javax.swing.GroupLayout(Stock_Genset_Panel_Update);
        Stock_Genset_Panel_Update.setLayout(Stock_Genset_Panel_UpdateLayout);
        Stock_Genset_Panel_UpdateLayout.setHorizontalGroup(
            Stock_Genset_Panel_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Save, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_UpdateLayout.setVerticalGroup(
            Stock_Genset_Panel_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Save, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        kGradientPanel1.add(Stock_Genset_Panel_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 180, -1));

        Insert_Supplier_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Supplier_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kGradientPanel1.add(Insert_Supplier_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 280, 30));

        id2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id2.setText("ID");
        id2.setAlignmentY(1.0F);
        kGradientPanel1.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 100, 30));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 470, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Display_SupplierAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Display_SupplierAncestorAdded
            String Banner = Display_Supplier.getText();
            String id = Table_Supplier.supplier_id.getText();
            if(Banner.equals("SUPPLIER SELECTED"))
            {
                try{
                PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `supplier_table` WHERE `ID` = "+id+"");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                Insert_Supplier_id.setText(rs.getString("ID"));
                Insert_Supplier_name.setText(rs.getString("NAME"));
                Insert_Supplier_address.setText(rs.getString("ADDRESS"));
                Insert_Supplier_email.setText(rs.getString("EMAIL"));
                Insert_Supplier_contact.setText(rs.getString("CONTACT"));
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
            }else if(Banner.equals("UPDATE SUPPLIER")){
                try{
                    PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `supplier_table` WHERE `ID` = "+id+"");
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()){
                    Insert_Supplier_id.setText(rs.getString("ID"));
                    Insert_Supplier_name.setText(rs.getString("NAME"));
                    Insert_Supplier_address.setText(rs.getString("ADDRESS"));
                    Insert_Supplier_email.setText(rs.getString("EMAIL"));
                    Insert_Supplier_contact.setText(rs.getString("CONTACT"));
                    }
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
    }//GEN-LAST:event_Display_SupplierAncestorAdded

    private void Stock_Genset_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseClicked
        Table_Supplier.Add.setText("ADD SUPPLIER");
        Table_Supplier.Path.setText("1");
        Table_Supplier.supplier_id.setText("");
        dispose();
    }//GEN-LAST:event_Stock_Genset_BackMouseClicked

    private void Stock_Genset_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseEntered
    
        Stock_Genset_Panel_Back.setBackground(new Color(255,214,102));
    }//GEN-LAST:event_Stock_Genset_BackMouseEntered

    private void Stock_Genset_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseExited
  
        Stock_Genset_Panel_Back.setBackground(new Color(255,194,102));
    }//GEN-LAST:event_Stock_Genset_BackMouseExited

    private void Stock_Genset_SaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_SaveMouseClicked
        String Banner = Display_Supplier.getText().toUpperCase();
        String id = Insert_Supplier_id.getText().toUpperCase();
        String name = Insert_Supplier_name.getText().toUpperCase();
        String address = Insert_Supplier_address.getText().toUpperCase();
        String email = Insert_Supplier_email.getText().toUpperCase();
        String contact = Insert_Supplier_contact.getText().toUpperCase();
        Class_tables ts = new Class_tables(); 
        if(name.equals("") || address.equals("") || email.equals("") || contact.equals("")){
           JOptionPane.showMessageDialog(null, " INPUT SOME FIELDS !!","",JOptionPane.ERROR_MESSAGE); 
        }
        else if(Banner.equals("ADD SUPPLIER")){
           if(!Class_Supplier.AddSupplier(name, address, contact, email))
           {
               JOptionPane.showMessageDialog(null, "SUCCESSFULY ADDED");
               dispose();
              
               ts.Supplier();
           }
        }
        else if (Banner.equals("UPDATE SUPPLIER")){
            if(!Class_Supplier.UpdateSupplier(name, address, contact, email, id))
            {
               JOptionPane.showMessageDialog(null, "SUCCESSFULY UPDATED");
               dispose();
               ts.Supplier();
            }
        }
    }//GEN-LAST:event_Stock_Genset_SaveMouseClicked

    private void Stock_Genset_SaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_SaveMouseEntered
   
        Stock_Genset_Panel_Update.setBackground(new Color(51, 207, 255));
    }//GEN-LAST:event_Stock_Genset_SaveMouseEntered

    private void Stock_Genset_SaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_SaveMouseExited
   
        Stock_Genset_Panel_Update.setBackground(new Color(51, 187, 255));
    }//GEN-LAST:event_Stock_Genset_SaveMouseExited

    private void Supplier_List_Btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplier_List_Btn2MouseClicked

        Table_Customer.Add.setText("SELECT");
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
            java.util.logging.Logger.getLogger(Insert_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert_Supplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Display_Supplier;
    public static javax.swing.JTextArea Insert_Supplier_address;
    public static javax.swing.JTextField Insert_Supplier_contact;
    public static javax.swing.JTextField Insert_Supplier_email;
    public static javax.swing.JTextField Insert_Supplier_id;
    public static javax.swing.JTextField Insert_Supplier_name;
    private javax.swing.JLabel Stock_Genset_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Update;
    private javax.swing.JLabel Stock_Genset_Save;
    private javax.swing.JLabel Supplier_List_Btn2;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    public static javax.swing.JPanel panel_supplier_list;
    // End of variables declaration//GEN-END:variables
}
