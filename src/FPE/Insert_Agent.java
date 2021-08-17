
package FPE;

import FPE.Class_Customers;
import FPE.Class_tables;
import FPE.FPE_DB;
import FPE.Table_Customer;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Insert_Agent extends javax.swing.JFrame {
    
    String ids = null;
    Class_tables ct = new Class_tables();
    String id ;  
    public Insert_Agent() {
        initComponents();
        ct.Customer();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        Agent_Display = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        Stock_Genset_Back = new javax.swing.JLabel();
        Stock_Genset_Panel_Update = new javax.swing.JPanel();
        Stock_Genset_Update = new javax.swing.JLabel();
        agent_address = new javax.swing.JTextField();
        agent_contact = new javax.swing.JTextField();
        agent_name = new javax.swing.JTextField();
        agent_company = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 71, 94));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Agent_Display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Agent_Display.setForeground(new java.awt.Color(255, 255, 255));
        Agent_Display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Agent_Display.setText("ADD AGENT");
        Agent_Display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Agent_DisplayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(Agent_Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 590, 80));

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

        kGradientPanel1.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 170, -1));

        Stock_Genset_Panel_Update.setBackground(new java.awt.Color(0, 163, 204));

        Stock_Genset_Update.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Update.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Save.png"))); // NOI18N
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

        kGradientPanel1.add(Stock_Genset_Panel_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 170, -1));

        agent_address.setBackground(new java.awt.Color(230, 230, 230));
        agent_address.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        agent_address.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        agent_address.setBorder(null);
        kGradientPanel1.add(agent_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 290, 40));
        agent_address.getAccessibleContext().setAccessibleDescription("");

        agent_contact.setBackground(new java.awt.Color(230, 230, 230));
        agent_contact.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        agent_contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        agent_contact.setBorder(null);
        kGradientPanel1.add(agent_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 290, 40));
        agent_contact.getAccessibleContext().setAccessibleDescription("");

        agent_name.setBackground(new java.awt.Color(230, 230, 230));
        agent_name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        agent_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        agent_name.setBorder(null);
        kGradientPanel1.add(agent_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 290, 40));

        agent_company.setBackground(new java.awt.Color(230, 230, 230));
        agent_company.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        agent_company.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        agent_company.setBorder(null);
        kGradientPanel1.add(agent_company, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 290, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Password.png"))); // NOI18N
        jLabel2.setText(" COMPANY");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 180, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Admin.png"))); // NOI18N
        jLabel3.setText(" AGENT NAME");
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

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 660, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Agent_DisplayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Agent_DisplayAncestorAdded
        String Banner = Agent_Display.getText();
        id = Table_Agent.Agent_id;
        if(Banner.equals("UPDATE AGENT")){
                try{
                PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT `NAME`, `ADDRESS`, `CONTACT`, `COMPANY` FROM `agent_table` WHERE `ID`= '"+id+"'");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                
                 agent_name.setText(rs.getString("NAME"));
                 agent_address.setText(rs.getString("ADDRESS"));
              
                 agent_contact.setText(rs.getString("CONTACT"));
                 agent_company.setText(rs.getString("COMPANY"));
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
       }


    }//GEN-LAST:event_Agent_DisplayAncestorAdded

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
    String banner = Agent_Display.getText();
    
    String name = agent_name.getText();
    String add = agent_address.getText();
    String contact = agent_contact.getText();
    String company = agent_company.getText();
    
     
            if(banner.equals("ADD AGENT"))
            {
                if(!Class_Agent.AddAgent(name, add, contact,company))
                {
                 JOptionPane.showMessageDialog(null, "AGENT ADDED");   Webpage.ct.Agent(); dispose();
                }
            }
            else if (banner.equals("UPDATE AGENT"))
            {
                if(!Class_Agent.UpdateAgent(name, add, contact,company,id))
                {
                 JOptionPane.showMessageDialog(null, "AGENT UPDATED");  Webpage.ct.Agent(); dispose();
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
            java.util.logging.Logger.getLogger(Insert_Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert_Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert_Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert_Agent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Agent_Display;
    private javax.swing.JLabel Stock_Genset_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Update;
    private javax.swing.JLabel Stock_Genset_Update;
    public static javax.swing.JTextField agent_address;
    public static javax.swing.JTextField agent_company;
    public static javax.swing.JTextField agent_contact;
    public static javax.swing.JTextField agent_name;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
