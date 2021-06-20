
package FPE.folder;

import FPE.FPE_DB;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class History_Customer extends javax.swing.JFrame {
    
    String ids = null;
    
    public History_Customer() {
        initComponents();
        validate.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        Display_Customer = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        History_Customer_contact = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        History_Customer_email = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        History_Customer_address = new javax.swing.JTextArea();
        id1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        Stock_Genset_Back = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        History_Customer_name = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        History_customer_id = new javax.swing.JTextField();
        validate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 51, 74));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Display_Customer.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Display_Customer.setForeground(new java.awt.Color(255, 255, 255));
        Display_Customer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Display_Customer.setText("CUSTOMER DETAILED");
        Display_Customer.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Display_CustomerAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(Display_Customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 410, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 100));

        kGradientPanel1.setkEndColor(new java.awt.Color(42, 142, 142));
        kGradientPanel1.setkStartColor(new java.awt.Color(42, 142, 142));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        History_Customer_contact.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        kGradientPanel1.add(History_Customer_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 250, 30));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setText("CONTACT NO.");
        jLabel18.setAlignmentY(1.0F);
        kGradientPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 100, 30));

        History_Customer_email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        kGradientPanel1.add(History_Customer_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 250, 30));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        History_Customer_address.setColumns(20);
        History_Customer_address.setRows(5);
        jScrollPane1.setViewportView(History_Customer_address);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 250, 80));

        id1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id1.setText("NAME");
        id1.setAlignmentY(1.0F);
        kGradientPanel1.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 100, 30));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setText("EMAIL");
        jLabel21.setAlignmentY(1.0F);
        kGradientPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 100, 30));

        Stock_Genset_Panel_Back.setBackground(new java.awt.Color(255, 173, 51));
        Stock_Genset_Panel_Back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Stock_Genset_Back.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Back.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Backss.png"))); // NOI18N
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
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_BackLayout.setVerticalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        kGradientPanel1.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 210, -1));

        id2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id2.setText("ID");
        id2.setAlignmentY(1.0F);
        kGradientPanel1.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 100, 30));

        History_Customer_name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        kGradientPanel1.add(History_Customer_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 250, 30));

        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setText("ADDRESS");
        jLabel22.setAlignmentY(1.0F);
        kGradientPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 100, 30));

        History_customer_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        kGradientPanel1.add(History_customer_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 250, 30));

        validate.setText("1");
        kGradientPanel1.add(validate, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 4, 60, 20));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 480, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Display_CustomerAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Display_CustomerAncestorAdded
        String Banner = Display_Customer.getText();
        String id = History_customer_id.getText();
      
        if(Banner.equals("CUSTOMER DETAILED"))
        {
        History_customer_id.setEditable(false);
        History_Customer_name.setEditable(false);
        History_Customer_address.setEditable(false);
        History_Customer_email.setEditable(false);
        History_Customer_contact.setEditable(false);
            if(validate.getText().equals("1")){
                try{
                    PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT` FROM `history_genset_table` WHERE `ID` = '"+id+"'");
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()){
                     History_Customer_name.setText(rs.getString("CUSTOMER_NAME"));
                     History_Customer_address.setText(rs.getString("CUSTOMER_ADDRESS"));
                     History_Customer_email.setText(rs.getString("CUSTOMER_EMAIL"));
                     History_Customer_contact.setText(rs.getString("CUSTOMER_CONTACT"));
                    }
                }
                catch(Exception e){
                    e.printStackTrace();
                }
             }
            else{
               if(validate.getText().equals("2")){
                    try{
                        PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT `NAME`, `ADDRESS`, `EMAIL`, `CONTACT` FROM `history_filter` WHERE `ID` = '"+id+"'");
                        ResultSet rs = ps.executeQuery();
                        while(rs.next()){
                         History_Customer_name.setText(rs.getString("NAME"));
                         History_Customer_address.setText(rs.getString("ADDRESS"));
                         History_Customer_email.setText(rs.getString("EMAIL"));
                         History_Customer_contact.setText(rs.getString("CONTACT"));
                        }
                    }
                    catch(Exception e){
                        e.printStackTrace();
                    }
               } 
            }
        }
    }//GEN-LAST:event_Display_CustomerAncestorAdded

    private void Stock_Genset_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseClicked
        dispose();
    }//GEN-LAST:event_Stock_Genset_BackMouseClicked

    private void Stock_Genset_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseEntered
       Stock_Genset_Panel_Back.setBackground(new Color(255,193,71));
    }//GEN-LAST:event_Stock_Genset_BackMouseEntered

    private void Stock_Genset_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseExited
       Stock_Genset_Panel_Back.setBackground(new Color(255,193,71));
    }//GEN-LAST:event_Stock_Genset_BackMouseExited

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
            java.util.logging.Logger.getLogger(History_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(History_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(History_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(History_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new History_Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Display_Customer;
    public static javax.swing.JTextArea History_Customer_address;
    public static javax.swing.JTextField History_Customer_contact;
    public static javax.swing.JTextField History_Customer_email;
    public static javax.swing.JTextField History_Customer_name;
    public static javax.swing.JTextField History_customer_id;
    private javax.swing.JLabel Stock_Genset_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    public static javax.swing.JLabel validate;
    // End of variables declaration//GEN-END:variables
}
