/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Javinez
 */
public class year extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public year() {
        initComponents();
        yearCompared.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        yr_select = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Display_Engine = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        Panel_Energized_Energized_Back = new javax.swing.JPanel();
        Energized_Back = new javax.swing.JLabel();
        Pane_Energized_Update = new javax.swing.JPanel();
        Energized_Update = new javax.swing.JLabel();
        yr = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        quot_number = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        prev_quo = new javax.swing.JLabel();
        yearCompared = new javax.swing.JLabel();

        yr_select.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 71, 94));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Display_Engine.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Display_Engine.setForeground(new java.awt.Color(255, 255, 255));
        Display_Engine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Display_Engine.setText("YEAR - QUOTATION # ");
        Display_Engine.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Display_EngineAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(Display_Engine, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 440, 50));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 74));

        kGradientPanel1.setkEndColor(new java.awt.Color(42, 162, 162));
        kGradientPanel1.setkStartColor(new java.awt.Color(42, 162, 162));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Energized_Energized_Back.setBackground(new java.awt.Color(255, 194, 102));
        Panel_Energized_Energized_Back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Energized_Back.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Energized_Back.setForeground(new java.awt.Color(255, 255, 255));
        Energized_Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Energized_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Backss.png"))); // NOI18N
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
            .addComponent(Energized_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );
        Panel_Energized_Energized_BackLayout.setVerticalGroup(
            Panel_Energized_Energized_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Energized_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        kGradientPanel1.add(Panel_Energized_Energized_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 150, -1));

        Pane_Energized_Update.setBackground(new java.awt.Color(51, 187, 255));
        Pane_Energized_Update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Energized_Update.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Energized_Update.setForeground(new java.awt.Color(255, 255, 255));
        Energized_Update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Energized_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Check.png"))); // NOI18N
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
            .addComponent(Energized_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );
        Pane_Energized_UpdateLayout.setVerticalGroup(
            Pane_Energized_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Energized_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        kGradientPanel1.add(Pane_Energized_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 150, -1));

        yr.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        yr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yrActionPerformed(evt);
            }
        });
        kGradientPanel1.add(yr, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 190, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("PREVIOUS QUOTATION :");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 180, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("QUOTATION # :");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 180, 30));

        quot_number.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        quot_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quot_numberActionPerformed(evt);
            }
        });
        kGradientPanel1.add(quot_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 190, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("SELECTED YEAR:");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 180, 30));

        prev_quo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        kGradientPanel1.add(prev_quo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 190, 30));

        yearCompared.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        yearCompared.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yearCompared.setText("2");
        kGradientPanel1.add(yearCompared, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 70, 30));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 480, 290));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Display_EngineAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Display_EngineAncestorAdded
        PreparedStatement ps;
        ResultSet rs;
        int start = Integer.parseInt("2013".toString());
        Date today = new Date();
         SimpleDateFormat date = new SimpleDateFormat("yyyy");
         String getNowYr = date.format(today);
         
         
        if(yearCompared.getText().equals("1")){
            int setDate = Integer.parseInt(getNowYr.toString());
            for(start=2013;start<=setDate;start++){
                 yr.addItem(""+start); 
            }
            try{
                ps=FPE_DB.getConnection().prepareStatement("SELECT `QUOTATION` FROM `history_genset_table` ORDER BY `ID` DESC LIMIT 1");
                rs = ps.executeQuery();
                if(rs.next()){
                    prev_quo.setText(rs.getString("QUOTATION"));
                }
            }
            catch(Exception e){

            }
        }
        else{
            if(yearCompared.getText().equals("2")){
                int setDate = Integer.parseInt(getNowYr.toString());
                for(start=2013;start<=setDate;start++){
                     yr.addItem(""+start); 
                }
                try{
                    ps=FPE_DB.getConnection().prepareStatement("SELECT `COUNT_PROCESS`, `QUOTATION` FROM `history_filter` ORDER BY `ID` DESC LIMIT 1");
                    rs = ps.executeQuery();
                    if(rs.next()){
                        int pre_qoutation = Integer.parseInt(rs.getString("COUNT_PROCESS")) - 1;       
                           // prev_quo.setText(""+pre_qoutation);
                                ps=FPE_DB.getConnection().prepareStatement("SELECT `QUOTATION` FROM `history_filter` WHERE `COUNT_PROCESS`='"+pre_qoutation+"'");
                                rs = ps.executeQuery();
                                
                                if(rs.next()){
                                    prev_quo.setText(rs.getString("QUOTATION"));
                                    if(rs.getString("QUOTATION").equals(prev_quo.getText())){
                                        String[] splitQuot = rs.getString("QUOTATION").split(" - ");
                                        int plusOne = Integer.parseInt(splitQuot[1]) + 1;
                                        //prev_quo.setText(splitQuot[0] + " - "+plusOne);
                                        String originalQuotation = splitQuot[0] + " - "+plusOne;
                                        ps=FPE_DB.getConnection().prepareStatement("SELECT `QUOTATION` FROM `history_filter` WHERE `QUOTATION`='"+originalQuotation+"'");
                                        rs = ps.executeQuery();
                                        if(rs.next()){
                                            int newQuotation = plusOne;
                                            prev_quo.setText(splitQuot[0] + " - "+newQuotation);
                                        }                                     
                                        
                                    }
                                    
                                   
                                }else{
                                    ps=FPE_DB.getConnection().prepareStatement("SELECT `QUOTATION`, `QUOTATION` FROM `history_filter` ORDER BY `ID` DESC LIMIT 1");
                                    rs = ps.executeQuery();
                                    if(rs.next()){
                                        prev_quo.setText(rs.getString("QUOTATION"));
                                    }
                                }   

                    }
                }
                catch(Exception e){

                } 
            }
        }
    }//GEN-LAST:event_Display_EngineAncestorAdded

    private void Energized_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Energized_BackMouseClicked
        dispose();
    }//GEN-LAST:event_Energized_BackMouseClicked

    private void Energized_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Energized_BackMouseEntered
        Panel_Energized_Energized_Back.setBackground(new Color(255,214,122));
    }//GEN-LAST:event_Energized_BackMouseEntered

    private void Energized_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Energized_BackMouseExited
        Panel_Energized_Energized_Back.setBackground(new Color(255,214,122));
    }//GEN-LAST:event_Energized_BackMouseExited

    private void Energized_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Energized_UpdateMouseClicked

        if(yearCompared.getText().equals("1")){
            String[] quot = Process_Genset.quotation_display_year.getText().split(" - ");
            Process_Genset.quotation_display_year.setText(yr_select.getText());

            Process_Genset.quotations.setText(yr_select.getText() +" - "+ quot_number.getText());
            Process_Genset.quotation_display_number.setText(quot_number.getText());
            dispose();            
        }else{
            if(yearCompared.getText().equals("2")){
                Process_Filter.quotation.setText(yr.getSelectedItem().toString()+" - "+quot_number.getText());
                dispose();
            }
        }

    }//GEN-LAST:event_Energized_UpdateMouseClicked

    private void Energized_UpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Energized_UpdateMouseEntered
        Pane_Energized_Update.setBackground(new Color(51, 207, 255));
    }//GEN-LAST:event_Energized_UpdateMouseEntered

    private void Energized_UpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Energized_UpdateMouseExited
        Pane_Energized_Update.setBackground(new Color(51, 187, 255));
    }//GEN-LAST:event_Energized_UpdateMouseExited

    private void yrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yrActionPerformed
         Date today = new Date();
         SimpleDateFormat date = new SimpleDateFormat("yyyy");
        
         if(yr_select.getText().equals("Choose Year")){
         yr_select.setText("2013");
         }
         else{
             yr_select.setText(yr.getSelectedItem().toString());
            // quot_number.setText(""+yr+" - ");
         }
    }//GEN-LAST:event_yrActionPerformed

    private void quot_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quot_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quot_numberActionPerformed

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
            java.util.logging.Logger.getLogger(year.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(year.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(year.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(year.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new year().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Display_Engine;
    private javax.swing.JLabel Energized_Back;
    private javax.swing.JLabel Energized_Update;
    public static javax.swing.JPanel Pane_Energized_Update;
    public static javax.swing.JPanel Panel_Energized_Energized_Back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel prev_quo;
    public static javax.swing.JTextField quot_number;
    public static javax.swing.JLabel yearCompared;
    public static javax.swing.JComboBox<String> yr;
    public static javax.swing.JLabel yr_select;
    // End of variables declaration//GEN-END:variables
}
