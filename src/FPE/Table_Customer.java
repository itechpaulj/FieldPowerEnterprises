/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;



//import static FPE2.Table_Customer.Customer_table;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.TableModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ROBLES
 */
public class Table_Customer extends javax.swing.JFrame {

    /**
     * Creates new form Table_Supplier
     */
    public Table_Customer() {
        initComponents();
        Class_tables ct = new Class_tables();
        ct.Customer();
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
        displays = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Customer_Table = new javax.swing.JTable();
        add_panel_supplier = new javax.swing.JPanel();
        Add = new javax.swing.JLabel();
        update_panel_supplier = new javax.swing.JPanel();
        sup_listUpdate = new javax.swing.JLabel();
        delete_panel_supplier = new javax.swing.JPanel();
        sup_del = new javax.swing.JLabel();
        back_panel_supplier = new javax.swing.JPanel();
        Back = new javax.swing.JLabel();
        Supplier_Search = new javax.swing.JTextField();
        Customer_id = new javax.swing.JLabel();
        Path = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 71, 94));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        displays.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        displays.setForeground(new java.awt.Color(255, 255, 255));
        displays.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displays.setText("CUSTOMER LIST");
        displays.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                displaysAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(displays, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 570, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 100));

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 230, 184));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 230, 184));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Customer_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Customer_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Customer_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Customer_Table);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 78, 880, 350));

        add_panel_supplier.setBackground(new java.awt.Color(51, 255, 119));

        Add.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Add.setForeground(new java.awt.Color(255, 255, 255));
        Add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Add_Btn.png"))); // NOI18N
        Add.setText(" ADD CUSTOMER");
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddMouseExited(evt);
            }
        });

        javax.swing.GroupLayout add_panel_supplierLayout = new javax.swing.GroupLayout(add_panel_supplier);
        add_panel_supplier.setLayout(add_panel_supplierLayout);
        add_panel_supplierLayout.setHorizontalGroup(
            add_panel_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        add_panel_supplierLayout.setVerticalGroup(
            add_panel_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        kGradientPanel1.add(add_panel_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 200, 50));

        update_panel_supplier.setBackground(new java.awt.Color(51, 187, 255));

        sup_listUpdate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        sup_listUpdate.setForeground(new java.awt.Color(255, 255, 255));
        sup_listUpdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sup_listUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Edit_Btn.png"))); // NOI18N
        sup_listUpdate.setText(" UPDATE ");
        sup_listUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sup_listUpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sup_listUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sup_listUpdateMouseExited(evt);
            }
        });

        javax.swing.GroupLayout update_panel_supplierLayout = new javax.swing.GroupLayout(update_panel_supplier);
        update_panel_supplier.setLayout(update_panel_supplierLayout);
        update_panel_supplierLayout.setHorizontalGroup(
            update_panel_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sup_listUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        update_panel_supplierLayout.setVerticalGroup(
            update_panel_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sup_listUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        kGradientPanel1.add(update_panel_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 200, 50));

        delete_panel_supplier.setBackground(new java.awt.Color(255, 77, 77));

        sup_del.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        sup_del.setForeground(new java.awt.Color(255, 255, 255));
        sup_del.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sup_del.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Delete_Btn.png"))); // NOI18N
        sup_del.setText(" DELETE");
        sup_del.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sup_delMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sup_delMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sup_delMouseExited(evt);
            }
        });

        javax.swing.GroupLayout delete_panel_supplierLayout = new javax.swing.GroupLayout(delete_panel_supplier);
        delete_panel_supplier.setLayout(delete_panel_supplierLayout);
        delete_panel_supplierLayout.setHorizontalGroup(
            delete_panel_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sup_del, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        delete_panel_supplierLayout.setVerticalGroup(
            delete_panel_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sup_del, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        kGradientPanel1.add(delete_panel_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 200, 50));

        back_panel_supplier.setBackground(new java.awt.Color(255, 194, 102));

        Back.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Back_Btn.png"))); // NOI18N
        Back.setText(" BACK  ");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackMouseExited(evt);
            }
        });

        javax.swing.GroupLayout back_panel_supplierLayout = new javax.swing.GroupLayout(back_panel_supplier);
        back_panel_supplier.setLayout(back_panel_supplierLayout);
        back_panel_supplierLayout.setHorizontalGroup(
            back_panel_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        back_panel_supplierLayout.setVerticalGroup(
            back_panel_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        kGradientPanel1.add(back_panel_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, 200, 50));

        Supplier_Search.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Supplier_Search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Supplier_Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Supplier_SearchKeyPressed(evt);
            }
        });
        kGradientPanel1.add(Supplier_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, 31));
        kGradientPanel1.add(Customer_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 60, 30));
        kGradientPanel1.add(Path, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 60, 30));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Search_Btn.png"))); // NOI18N
        kGradientPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 35, 31));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 950, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void displaysAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_displaysAncestorAdded

    }//GEN-LAST:event_displaysAncestorAdded

    private void Customer_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Customer_TableMouseClicked
        int i=Customer_Table.getSelectedRow();
        TableModel model = Customer_Table.getModel();
        Customer_id.setText(model.getValueAt(i,0).toString());
        

    }//GEN-LAST:event_Customer_TableMouseClicked

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        String Action = Add.getText();
        String id = Customer_id.getText();
        String way = Path.getText();
        
        if(Action.equals("ADD CUSTOMER")){
            Insert_Customer ic = new Insert_Customer();
            ic.setVisible(true);
            Insert_Customer.Display_Customer.setText("ADD CUSTOMER");
            Path.setText("");
            
    
        }
        else if(Action.equals("SELECT") && way.equals("1")){
            if(id.equals("")){
            JOptionPane.showMessageDialog(null, " SELECT CUSTOMER !!","",JOptionPane.ERROR_MESSAGE);
            }else{
            Insert_Customer is = new Insert_Customer();
            is.setVisible(true);       
            Insert_Customer.Display_Customer.setText("CUSTOMER SELECTED");
             Path.setText("");
                                               
            }
        }
        else if(Action.equals("SELECT") && way.equals("2")){
            if(id.equals(""))
            {
                JOptionPane.showMessageDialog(null, " SELECT CUSTOMER !!","",JOptionPane.ERROR_MESSAGE);
            }
            else{      
            try{
                PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `customer_table` WHERE `ID` = "+id+"");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                //Insert_Inventory_Genset.Insert_Invetory_Supplier_id.setText(rs.getString("ID"));
                Process_Genset.Process_Genset_Customer_name.setText(rs.getString("NAME"));
                Process_Genset.Process_Genset_Customer_address.setText(rs.getString("ADDRESS"));
                Process_Genset.Process_Genset_Customer_email.setText(rs.getString("EMAIL"));
                Process_Genset.Process_Genset_Customer_contact.setText(rs.getString("CONTACT"));
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
            Path.setText("");
            dispose();  
            
            }
        }
        else if(Action.equals("SELECT") && way.equals("3")){
                if(id.equals(""))
                {
                    JOptionPane.showMessageDialog(null, " SELECT CUSTOMER !!","",JOptionPane.ERROR_MESSAGE);
                }
                else{      
                try{
                    PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `customer_table` WHERE `ID` = "+id+"");
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()){
                        
                    //Insert_Inventory_Filter.Insert_Filter_Supplier_id.setText(rs.getString("ID"));
                    //Insert_Inventory_Filter.Insert_Filter_Supplier_id.setEditable(false);
                    Process_Filter.Process_Filter_Customer_name.setText(rs.getString("NAME"));
                    Process_Filter.Process_Filter_Customer_address.setText(rs.getString("ADDRESS"));
                    Process_Filter.Process_Filter_Customer_email.setText(rs.getString("EMAIL"));
                    Process_Filter.Process_Filter_Customer_contact.setText(rs.getString("CONTACT"));
        
                    }
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                Path.setText("");
                dispose();  
            }
        }

    }//GEN-LAST:event_AddMouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        dispose();
    }//GEN-LAST:event_BackMouseClicked

    private void sup_listUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sup_listUpdateMouseClicked
        String id = Customer_id.getText();
        if(id.equals("")){
            JOptionPane.showMessageDialog(null, " SELECT SUPPLIER !!","",JOptionPane.ERROR_MESSAGE);
        }else{
            Insert_Supplier is = new Insert_Supplier();
            Insert_Supplier.Insert_Supplier_id.setText(id);
            Insert_Supplier.Display_Supplier.setText("UPDATE SUPPLIER");
            is.setVisible(true);
        
        }


    }//GEN-LAST:event_sup_listUpdateMouseClicked

    private void sup_delMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sup_delMouseClicked
        String id = Customer_id.getText();

            int opt = JOptionPane.showConfirmDialog(null, "YOU WANT TO DELETE THIS SUPPLIER ? ","",JOptionPane.YES_NO_OPTION);
            if(opt==0){
                if(JOptionPane.YES_NO_OPTION == JOptionPane.YES_OPTION && !Class_Supplier.DeleteSupplier(id) ){
                Class_tables ct = new Class_tables();
                ct.Supplier();
                JOptionPane.showMessageDialog(null, " SUPPLIER DELETED ","",JOptionPane.INFORMATION_MESSAGE);
                }
            }
    }//GEN-LAST:event_sup_delMouseClicked

    private void Supplier_SearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Supplier_SearchKeyPressed
        DefaultTableModel tm = (DefaultTableModel)Customer_Table.getModel();
        String find = Supplier_Search.getText().toUpperCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
        Customer_Table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(find));
    }//GEN-LAST:event_Supplier_SearchKeyPressed

    private void AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseEntered
        Add.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_AddMouseEntered

    private void sup_listUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sup_listUpdateMouseEntered
        sup_listUpdate.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_sup_listUpdateMouseEntered

    private void sup_delMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sup_delMouseEntered
       sup_del.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_sup_delMouseEntered

    private void BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseEntered
       Back.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_BackMouseEntered

    private void AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseExited
        Add.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_AddMouseExited

    private void sup_listUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sup_listUpdateMouseExited
       sup_listUpdate.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_sup_listUpdateMouseExited

    private void sup_delMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sup_delMouseExited
       sup_del.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_sup_delMouseExited

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited
       Back.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_BackMouseExited

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
            java.util.logging.Logger.getLogger(Table_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Table_Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Add;
    public static javax.swing.JLabel Back;
    public static javax.swing.JTable Customer_Table;
    public static javax.swing.JLabel Customer_id;
    public static javax.swing.JLabel Path;
    private javax.swing.JTextField Supplier_Search;
    public static javax.swing.JPanel add_panel_supplier;
    public static javax.swing.JPanel back_panel_supplier;
    public static javax.swing.JPanel delete_panel_supplier;
    public static javax.swing.JLabel displays;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    public static javax.swing.JLabel sup_del;
    public static javax.swing.JLabel sup_listUpdate;
    public static javax.swing.JPanel update_panel_supplier;
    // End of variables declaration//GEN-END:variables
}
