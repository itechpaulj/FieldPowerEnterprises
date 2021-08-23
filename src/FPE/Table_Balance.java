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
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ROBLES
 */
public class Table_Balance extends javax.swing.JFrame {
//
    public static String process_no = null;
    public static String status = "";
    //String name = "";
    
    public static String project = Webpage.project_no; 
    public static PreparedStatement ps;
    
    public Table_Balance() {
    initComponents();
   
       bal();
    }
    public static void  bal(){
       ResultSet rs;
        try{
            ps = FPE_DB.getConnection().prepareStatement("SELECT  `PROJECT NO`,(SELECT `NAME` FROM `customer_table` WHERE `customer_table`.`ID`= `payment_menthod`.`CUSTOMER ID`) AS `CUSTOMER`,(SELECT `ADDRESS` FROM `customer_table` WHERE `customer_table`.`ID`=`payment_menthod`.`CUSTOMER ID`) AS `ADDRESS`,`CUSTOMER P O NO` AS `P.O NO.`, `P O DATE` AS `P.O DATE`, `QUOTATION NO` AS `QUOT. NO`, `QUOTATION DATE` AS `QUOT. DATE`,`TOTAL AMOUNT`,`DOWNPAYMENT`, `BALANCE`,`STATUS` FROM `payment_menthod` WHERE `PROJECT NO`="+Webpage.project_no+" ORDER BY `P O DATE` DESC");
             rs = ps.executeQuery();
            Balance_Table.setModel(DbUtils.resultSetToTableModel(rs));
            
            
            }catch(Exception e){
              //System.out.println(e);
            }
        
        try
        {
            ps = FPE_DB.getConnection().prepareStatement("SELECT `STATUS` FROM `payment_menthod` WHERE `PROJECT NO`="+Webpage.project_no+" ORDER BY `PROCESS` DESC LIMIT 1");
            rs = ps.executeQuery();
            if(rs.next())
            {
               status = rs.getString("STATUS");
               System.out.println(status);
            }           
        }
        catch(Exception e)
            {
                e.printStackTrace();
            } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        displays = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Balance_Table = new javax.swing.JTable();
        add_panel_supplier = new javax.swing.JPanel();
        Add = new javax.swing.JLabel();
        back_panel_supplier = new javax.swing.JPanel();
        Back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 71, 94));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        displays.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        displays.setForeground(new java.awt.Color(255, 255, 255));
        displays.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        displays.setText("BALANCE TABLE");
        displays.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                displaysAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(displays, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 440, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 120));

        kGradientPanel1.setkEndColor(new java.awt.Color(42, 142, 142));
        kGradientPanel1.setkStartColor(new java.awt.Color(42, 142, 142));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Balance_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Balance_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Balance_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Balance_Table);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 1170, 320));

        add_panel_supplier.setBackground(new java.awt.Color(35, 215, 176));

        Add.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Add.setForeground(new java.awt.Color(255, 255, 255));
        Add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Add_Supplier_Btn.PNG"))); // NOI18N
        Add.setText(" ADD PAYMENT");
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
            .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        add_panel_supplierLayout.setVerticalGroup(
            add_panel_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        kGradientPanel1.add(add_panel_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 210, 45));

        back_panel_supplier.setBackground(new java.awt.Color(185, 144, 149));

        Back.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/arrow_35px.png"))); // NOI18N
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
            .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        back_panel_supplierLayout.setVerticalGroup(
            back_panel_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        kGradientPanel1.add(back_panel_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 160, 45));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1210, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void displaysAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_displaysAncestorAdded
   
    String banner = displays.getText();
    
    if(banner.equals("BALANCE TABLE"))
    {
        bal(); 
        System.out.println(status);
    }
    }//GEN-LAST:event_displaysAncestorAdded

    private void Balance_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Balance_TableMouseClicked
        
        
    }//GEN-LAST:event_Balance_TableMouseClicked

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
    if(status.equals("PAID"))
    {
        JOptionPane.showMessageDialog(null," THIS CUSTOMER IS ALREADY PAID ! ","",JOptionPane.INFORMATION_MESSAGE);
    }
        else
    {
        AddCart ac = new AddCart();
        ac.setVisible(true);
        AddCart.displays.setText("ADD PAYMENT");  
    }
        
        

    }//GEN-LAST:event_AddMouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        Webpage.project_no = "";
        dispose();
        
    }//GEN-LAST:event_BackMouseClicked

    private void AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseEntered
        add_panel_supplier.setBackground(new Color(163, 235, 177));
        Add.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_AddMouseEntered

    private void BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseEntered
       back_panel_supplier.setBackground(new Color(163, 235, 177));
       Back.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_BackMouseEntered

    private void AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseExited
      add_panel_supplier.setBackground(new Color(35,215,176));
      Add.setForeground(new Color(255,255,255));

    }//GEN-LAST:event_AddMouseExited

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited
       back_panel_supplier.setBackground(new Color(185,144,149));
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
            java.util.logging.Logger.getLogger(Table_Balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table_Balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table_Balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table_Balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Table_Balance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Add;
    public static javax.swing.JLabel Back;
    public static javax.swing.JTable Balance_Table;
    public static javax.swing.JPanel add_panel_supplier;
    public static javax.swing.JPanel back_panel_supplier;
    public static javax.swing.JLabel displays;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
