/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fieldpowerenterprises;

import java.sql.Connection;
import java.sql.DriverManager;
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
public class Customer extends javax.swing.JFrame {

    /**
     * Creates new form Customer
     */
    public Customer() {
        initComponents();
        costumer_id.setEditable(false);
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
        costumer_id = new javax.swing.JTextField();
        costumer_fname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        costumer_email_add = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        costumer_address = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        costumer_contack = new javax.swing.JTextField();
        customer_dates = new datechooser.beans.DateChooserCombo();
        jScrollPane1 = new javax.swing.JScrollPane();
        Costumer_table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 153));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 255, 255));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1294, 693));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("CUSTOMER ID");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 170, 30));

        costumer_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        costumer_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kGradientPanel1.add(costumer_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 220, 30));

        costumer_fname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        costumer_fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kGradientPanel1.add(costumer_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 220, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("CUSTOMER NAME");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 170, 30));

        costumer_email_add.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        costumer_email_add.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kGradientPanel1.add(costumer_email_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 220, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("EMAIL ADDRESS");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 170, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("DATE");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 120, 30));

        costumer_address.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        costumer_address.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kGradientPanel1.add(costumer_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, 220, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("COMPLETE ADDRESS");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 170, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("CONTACT NO.");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 170, 30));

        costumer_contack.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        costumer_contack.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kGradientPanel1.add(costumer_contack, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, 220, 30));

        customer_dates.setFieldFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));
        kGradientPanel1.add(customer_dates, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 210, 220, 30));

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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        kGradientPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 130, 30));

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
        String costumer_ids ,costumers_names,costumers_emails,costumers_addresss,costumers_contacts,costumerss_dates ; 
        //costumer_ids = costumer_id.getText();
        costumers_names  =costumer_fname.getText();     
        costumers_emails = costumer_email_add.getText();
        costumers_addresss = costumer_address.getText();
        costumers_contacts = costumer_contack.getText();
        costumerss_dates = customer_dates.getText();
        
        if(CustomerClass.AddCustomer(costumers_names, costumers_emails, costumers_addresss, costumers_contacts, costumerss_dates)){
            JOptionPane.showMessageDialog(null, "FAILED");
        }else{
             JOptionPane.showMessageDialog(null, "SUCCESS ADDED"); 
             DefaultTableModel model = (DefaultTableModel) Costumer_table.getModel();
             model.setRowCount(0);
             Costumer();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String costumer_ids ,costumers_names,costumers_emails,costumers_addresss,costumers_contacts,costumerss_dates ; 
       
        costumer_ids = costumer_id.getText();
        costumers_names  =costumer_fname.getText();     
        costumers_emails = costumer_email_add.getText();
        costumers_addresss = costumer_address.getText();
        costumers_contacts = costumer_contack.getText();
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
       
        costumer_ids = costumer_id.getText();
        
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
        costumer_id.setText(model.getValueAt(i,0).toString());  
        costumer_fname.setText(model.getValueAt(i,1).toString()); 
        costumer_email_add.setText(model.getValueAt(i,2).toString());  
        costumer_address.setText(model.getValueAt(i,3).toString()); 
        costumer_contack.setText(model.getValueAt(i,4).toString());  
        customer_dates.setText(model.getValueAt(i,5).toString()); 
    }//GEN-LAST:event_Costumer_tableMouseClicked

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyPressed
        DefaultTableModel tm = (DefaultTableModel)Costumer_table.getModel();
        String find = search.getText().toUpperCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
        Costumer_table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(find));
    }//GEN-LAST:event_searchKeyPressed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        DefaultTableModel tm = (DefaultTableModel)Costumer_table.getModel();
        String find = search.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
        Costumer_table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(find));
    }//GEN-LAST:event_searchKeyReleased

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Costumer_table;
    private javax.swing.JTextField costumer_address;
    private javax.swing.JTextField costumer_contack;
    private javax.swing.JTextField costumer_email_add;
    private javax.swing.JTextField costumer_fname;
    private javax.swing.JTextField costumer_id;
    private datechooser.beans.DateChooserCombo customer_dates;
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
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
