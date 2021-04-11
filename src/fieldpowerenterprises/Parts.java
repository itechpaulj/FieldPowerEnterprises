/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fieldpowerenterprises;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ROBLES
 */
public class Parts extends javax.swing.JFrame {

    /**
     * Creates new form Customer
     */
    public Parts() {
        initComponents();
        item_id.setEditable(false);
        Costumer();
    }

    private void Costumer(){
        try{
        PreparedStatement ps = database.getConnection().prepareStatement("SELECT * FROM customer_tbl ");
        ResultSet rs = ps.executeQuery();
        Costumer_table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
              System.out.println(e);
        }
        

     
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        item_id = new javax.swing.JTextField();
        item_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        item_brand = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        item_price = new javax.swing.JTextField();
        customer_dates = new datechooser.beans.DateChooserCombo();
        jScrollPane1 = new javax.swing.JScrollPane();
        Costumer_table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        description = new javax.swing.JComboBox<>();
        quantity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        total_price = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 153));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 255, 255));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1294, 693));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("ITEM ID");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 100, 30));

        item_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kGradientPanel1.add(item_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 190, 30));

        item_name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kGradientPanel1.add(item_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 190, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("ITEM NAME");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 100, 30));

        item_brand.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_brand.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kGradientPanel1.add(item_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 190, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("BRAND");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 100, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("DATE");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 110, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("DESCRIPTION");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 100, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("PRICE");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 110, 30));

        item_price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        item_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kGradientPanel1.add(item_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 190, 30));

        customer_dates.setFieldFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));
        kGradientPanel1.add(customer_dates, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 160, 190, 30));

        Costumer_table.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Costumer_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Costumer_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Costumer_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Costumer_table);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 1190, 320));

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("EDIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 130, 40));

        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 130, 40));

        jButton3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton3.setText("BACK");
        kGradientPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, 130, 40));

        jButton4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 130, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SEARCH");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 70, 30));

        search.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchKeyPressed(evt);
            }
        });
        kGradientPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 130, 30));

        description.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        description.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PARTS", "FILTER" }));
        kGradientPanel1.add(description, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 190, 30));

        quantity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kGradientPanel1.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 190, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("QUANTITY");
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 110, 30));

        total_price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        total_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kGradientPanel1.add(total_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 190, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("TOTAL PRICE");
        kGradientPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1304, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String item_ids ,item_names,item_brands,prices,quantitys,desc,dates;
        item_ids = item_id.getText();
        item_names  =item_name.getText();     
        item_brands = item_brand.getText();
        prices = item_price.getText();
        quantitys = quantity.getText();
        dates = customer_dates.getText();
        desc = description.getSelectedItem().toString();
        
//        if(Custom){
//            JOptionPane.showMessageDialog(null, "FAILED");
//        }else{
//             JOptionPane.showMessageDialog(null, "SUCCESS ADDED"); 
//             DefaultTableModel model = (DefaultTableModel) Costumer_table.getModel();
//             model.setRowCount(0);
//             Costumer();
//        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String costumer_ids ,costumers_names,costumers_emails,costumers_addresss,costumers_contacts,costumerss_dates ; 
       
        costumer_ids = item_id.getText();
        costumers_names  =item_name.getText();     
        costumers_emails = item_brand.getText();
        costumers_addresss = costumer_address.getText();
        costumers_contacts = item_price.getText();
        costumerss_dates = customer_dates.getText();
        if(CustomerClass.UpdateCustomer(costumer_ids, costumers_names, costumers_emails, costumers_addresss, costumers_contacts, costumerss_dates)){
            JOptionPane.showMessageDialog(null, "FAILED");
        }else{
             JOptionPane.showMessageDialog(null, "SUCCESS UPDATED");  
             Costumer();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       String costumer_ids ;
       
        costumer_ids = item_id.getText();
        
        if(CustomerClass.DeleteCustomer(costumer_ids)){
            JOptionPane.showMessageDialog(null, "FAILED");
        }else{
             JOptionPane.showMessageDialog(null, "SUCCESS DELETED");  
             Costumer();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void Costumer_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Costumer_tableMouseClicked
          int i = Costumer_table.getSelectedRow();
        TableModel model = Costumer_table.getModel();
        item_id.setText(model.getValueAt(i,0).toString());  
        item_name.setText(model.getValueAt(i,1).toString()); 
        item_brand.setText(model.getValueAt(i,2).toString());  
        costumer_address.setText(model.getValueAt(i,3).toString()); 
        item_price.setText(model.getValueAt(i,4).toString());  
        customer_dates.setText(model.getValueAt(i,5).toString()); 
    }//GEN-LAST:event_Costumer_tableMouseClicked

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyPressed
        DefaultTableModel tm = (DefaultTableModel)Costumer_table.getModel();
        String find = search.getText().toUpperCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
        Costumer_table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(find));
    }//GEN-LAST:event_searchKeyPressed

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
            java.util.logging.Logger.getLogger(Parts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Costumer_table;
    private datechooser.beans.DateChooserCombo customer_dates;
    private javax.swing.JComboBox<String> description;
    private javax.swing.JTextField item_brand;
    private javax.swing.JTextField item_id;
    private javax.swing.JTextField item_name;
    private javax.swing.JTextField item_price;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField search;
    private javax.swing.JTextField total_price;
    // End of variables declaration//GEN-END:variables
}
