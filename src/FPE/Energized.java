package FPE;


import FPE.Insert_Inventory_Genset;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROBLES
 */
public class Energized extends javax.swing.JFrame {

    /**
     * Creates new form Energized
     */
    public Energized() {
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
        Display_Engine = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        Energized_technician = new javax.swing.JTextField();
        Energized_oil_usage = new javax.swing.JTextField();
        Energized_date = new datechooser.beans.DateChooserCombo();
        Energized_tank_capacity = new javax.swing.JTextField();
        Energized_oil_esystem = new javax.swing.JTextField();
        Energized_oil_weight = new javax.swing.JTextField();
        Energized_oil_frame = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Panel_Energized_Energized_Back = new javax.swing.JPanel();
        Energized_Back = new javax.swing.JLabel();
        Pane_Energized_Update = new javax.swing.JPanel();
        Energized_Update = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 71, 94));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Display_Engine.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Display_Engine.setForeground(new java.awt.Color(255, 255, 255));
        Display_Engine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Display_Engine.setText("ENGINE ENERGIZED");
        Display_Engine.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Display_EngineAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(Display_Engine, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 440, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 100));

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 255, 153));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 255, 153));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Energized_technician.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Energized_technician.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kGradientPanel1.add(Energized_technician, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 220, 35));

        Energized_oil_usage.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Energized_oil_usage.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kGradientPanel1.add(Energized_oil_usage, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 220, 35));

        Energized_date.setFieldFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));
        kGradientPanel1.add(Energized_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 220, 30));

        Energized_tank_capacity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Energized_tank_capacity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kGradientPanel1.add(Energized_tank_capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 220, 35));

        Energized_oil_esystem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Energized_oil_esystem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kGradientPanel1.add(Energized_oil_esystem, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 220, 35));

        Energized_oil_weight.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Energized_oil_weight.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kGradientPanel1.add(Energized_oil_weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 220, 35));

        Energized_oil_frame.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Energized_oil_frame.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kGradientPanel1.add(Energized_oil_frame, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 220, 35));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setText("TECHNICIAN");
        jLabel18.setAlignmentY(1.0F);
        kGradientPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 100, 35));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setText("ENERGIZED DATE");
        jLabel19.setAlignmentY(1.0F);
        kGradientPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 130, 35));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setText("OIL USAGE");
        jLabel21.setAlignmentY(1.0F);
        kGradientPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 100, 35));

        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setText("STARTING SYSTEM");
        jLabel23.setAlignmentY(1.0F);
        kGradientPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 130, 35));

        jLabel24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel24.setText("WEIGHT");
        jLabel24.setAlignmentY(1.0F);
        kGradientPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 100, 35));

        jLabel25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel25.setText("FRAME");
        jLabel25.setAlignmentY(1.0F);
        kGradientPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 100, 35));

        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setText("TANK CAPACITY");
        jLabel22.setAlignmentY(1.0F);
        kGradientPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 130, 35));

        Panel_Energized_Energized_Back.setBackground(new java.awt.Color(255, 194, 102));

        Energized_Back.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Energized_Back.setForeground(new java.awt.Color(255, 255, 255));
        Energized_Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Energized_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Images_Back_Btn.png"))); // NOI18N
        Energized_Back.setText(" BACK     ");
        Energized_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Energized_BackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Energized_BackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Energized_BackMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel_Energized_Energized_BackLayout = new javax.swing.GroupLayout(Panel_Energized_Energized_Back);
        Panel_Energized_Energized_Back.setLayout(Panel_Energized_Energized_BackLayout);
        Panel_Energized_Energized_BackLayout.setHorizontalGroup(
            Panel_Energized_Energized_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Energized_Back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        Panel_Energized_Energized_BackLayout.setVerticalGroup(
            Panel_Energized_Energized_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Energized_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        kGradientPanel1.add(Panel_Energized_Energized_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 150, -1));

        Pane_Energized_Update.setBackground(new java.awt.Color(51, 187, 255));

        Energized_Update.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Energized_Update.setForeground(new java.awt.Color(255, 255, 255));
        Energized_Update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Energized_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Save_Btn.png"))); // NOI18N
        Energized_Update.setText(" SAVE");
        Energized_Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Energized_UpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Energized_UpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Energized_UpdateMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Pane_Energized_UpdateLayout = new javax.swing.GroupLayout(Pane_Energized_Update);
        Pane_Energized_Update.setLayout(Pane_Energized_UpdateLayout);
        Pane_Energized_UpdateLayout.setHorizontalGroup(
            Pane_Energized_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Energized_Update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        Pane_Energized_UpdateLayout.setVerticalGroup(
            Pane_Energized_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Energized_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        kGradientPanel1.add(Pane_Energized_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 150, -1));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 480, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Display_EngineAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Display_EngineAncestorAdded
        String Banner = Display_Engine.getText();
       
        if(Banner.equals("ENGINE ENERGIZED")){
            
        try{   
            String id = Insert_Inventory_Genset.Insert_Invetory_Genset_id.getText();
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT `ENERGIZED DATE`, `OIL USAGE`,`TECHNICIAN`,`TANK CAPACITY` FROM `genset_table` WHERE ID ='"+id+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            
            Energized_date.setText(rs.getString("ENERGIZED DATE"));
            Energized_oil_usage.setText(rs.getString("OIL USAGE"));
            Energized_technician.setText(rs.getString("TECHNICIAN"));
            Energized_tank_capacity.setText(rs.getString("TANK CAPACITY"));
            }
        }catch(Exception e ){
                    e.printStackTrace();
                    }
                }
    }//GEN-LAST:event_Display_EngineAncestorAdded

    private void Energized_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Energized_BackMouseClicked
        dispose();
    }//GEN-LAST:event_Energized_BackMouseClicked

    private void Energized_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Energized_BackMouseEntered
        Energized_Back.setForeground(new Color(41, 61, 61));
        Panel_Energized_Energized_Back.setBackground(new Color(255,194,102));
    }//GEN-LAST:event_Energized_BackMouseEntered

    private void Energized_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Energized_BackMouseExited
        Energized_Back.setForeground(new Color(255,255,255));
        Panel_Energized_Energized_Back.setBackground(new Color(255,194,102));
    }//GEN-LAST:event_Energized_BackMouseExited

    private void Energized_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Energized_UpdateMouseClicked
        String id = Insert_Inventory_Genset.Insert_Invetory_Genset_id.getText();
        String tank_cap = Energized_tank_capacity.getText().toUpperCase();
        String date_energized = Energized_date.getText().toUpperCase();
        String oil = Energized_oil_usage.getText().toUpperCase();
        String tech = Energized_technician.getText().toUpperCase();
        String esystem = Energized_oil_esystem.getText().toUpperCase();
        String weight = Energized_oil_weight.getText().toUpperCase();
        String frame = Energized_oil_frame.getText().toUpperCase();
        
        
        if(!Class_Stock.UpdateEnergized(date_energized,tank_cap, oil, tech,esystem,weight,frame, id)){
            JOptionPane.showMessageDialog(null, "ENERGIZED UPDATED ");
            dispose();
        }
    }//GEN-LAST:event_Energized_UpdateMouseClicked

    private void Energized_UpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Energized_UpdateMouseEntered
        Energized_Update.setForeground(new Color(41, 61, 61));
        Pane_Energized_Update.setBackground(new Color(51, 187, 255));
    }//GEN-LAST:event_Energized_UpdateMouseEntered

    private void Energized_UpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Energized_UpdateMouseExited
        Energized_Update.setForeground(new Color(255,255,255));
        Pane_Energized_Update.setBackground(new Color(51, 187, 255));
    }//GEN-LAST:event_Energized_UpdateMouseExited

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
            java.util.logging.Logger.getLogger(Energized.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Energized.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Energized.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Energized.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Energized().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Display_Engine;
    private javax.swing.JLabel Energized_Back;
    private javax.swing.JLabel Energized_Update;
    private datechooser.beans.DateChooserCombo Energized_date;
    private javax.swing.JTextField Energized_oil_esystem;
    private javax.swing.JTextField Energized_oil_frame;
    private javax.swing.JTextField Energized_oil_usage;
    private javax.swing.JTextField Energized_oil_weight;
    private javax.swing.JTextField Energized_tank_capacity;
    private javax.swing.JTextField Energized_technician;
    public static javax.swing.JPanel Pane_Energized_Update;
    public static javax.swing.JPanel Panel_Energized_Energized_Back;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel4;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
