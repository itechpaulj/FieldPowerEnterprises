/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE2;

import static FPE2.Insert_Filter.id;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;

/**
 *
 * @author Javinez
 */
public class ViewGensetItem extends javax.swing.JFrame {

    /**
     * Creates new form ViewGensetItem
     */
    public ViewGensetItem() {
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

        KG2_ADD_STOCK_GENSET = new keeptoo.KGradientPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        vg_pic = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        vg_id = new javax.swing.JLabel();
        vg_model = new javax.swing.JLabel();
        vg_price = new javax.swing.JLabel();
        vg_brand = new javax.swing.JLabel();
        vg_unit_type = new javax.swing.JLabel();
        vg_phasing = new javax.swing.JLabel();
        vg_kva = new javax.swing.JLabel();
        vg_body_type = new javax.swing.JLabel();
        vg_fuel = new javax.swing.JLabel();
        vg_dimension = new javax.swing.JLabel();
        vg_date = new javax.swing.JLabel();
        vg_alternator = new javax.swing.JLabel();
        vg_engine = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        display = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(153, 204, 255));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(0, 255, 153));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel20.setText("UNIT TYPE");
        jLabel20.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 110, 26));

        jLabel22.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel22.setText("DIMENSION");
        jLabel22.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 110, 26));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel2.setText("BRAND");
        jLabel2.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 110, 26));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel3.setText("MODEL");
        jLabel3.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 110, 26));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel7.setText("KVA");
        jLabel7.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 110, 26));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel11.setText("ENGINE_SN");
        jLabel11.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 120, 26));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel13.setText("FUEL TANK CAP");
        jLabel13.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 120, 30));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel14.setText("BODY TYPE");
        jLabel14.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 120, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel15.setText("ALTERNATOR_SN");
        jLabel15.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 130, 26));

        id.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        id.setText("ID");
        id.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 110, 26));

        vg_pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        vg_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vg_pic.setText("2x2");
        vg_pic.setAlignmentY(1.0F);
        vg_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vg_pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vg_picMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(vg_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 330, 180));

        jLabel29.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel29.setText("PRICE");
        jLabel29.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 100, 26));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel10.setText("PHASING");
        jLabel10.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 110, 26));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BACK");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 210, 50));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PROCEED");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 210, 50));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel16.setText("DATE");
        jLabel16.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 110, 26));

        vg_id.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        vg_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vg_id.setText("NONE");
        vg_id.setAlignmentY(1.0F);
        vg_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(vg_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 180, 26));

        vg_model.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        vg_model.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vg_model.setText("NONE");
        vg_model.setAlignmentY(1.0F);
        vg_model.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(vg_model, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 180, 26));

        vg_price.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        vg_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vg_price.setText("NONE");
        vg_price.setAlignmentY(1.0F);
        vg_price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(vg_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 180, 26));

        vg_brand.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        vg_brand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vg_brand.setText("NONE");
        vg_brand.setAlignmentY(1.0F);
        vg_brand.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(vg_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 180, 26));

        vg_unit_type.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        vg_unit_type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vg_unit_type.setText("NONE");
        vg_unit_type.setAlignmentY(1.0F);
        vg_unit_type.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(vg_unit_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 180, 26));

        vg_phasing.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        vg_phasing.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vg_phasing.setText("NONE");
        vg_phasing.setAlignmentY(1.0F);
        vg_phasing.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(vg_phasing, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 180, 26));

        vg_kva.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        vg_kva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vg_kva.setText("NONE");
        vg_kva.setAlignmentY(1.0F);
        vg_kva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(vg_kva, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 180, 26));

        vg_body_type.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        vg_body_type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vg_body_type.setText("NONE");
        vg_body_type.setAlignmentY(1.0F);
        vg_body_type.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(vg_body_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 180, 26));

        vg_fuel.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        vg_fuel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vg_fuel.setText("NONE");
        vg_fuel.setAlignmentY(1.0F);
        vg_fuel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(vg_fuel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 180, 26));

        vg_dimension.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        vg_dimension.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vg_dimension.setText("NONE");
        vg_dimension.setAlignmentY(1.0F);
        vg_dimension.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(vg_dimension, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 180, 26));

        vg_date.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        vg_date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vg_date.setText("NONE");
        vg_date.setAlignmentY(1.0F);
        vg_date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(vg_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 180, 26));

        vg_alternator.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        vg_alternator.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vg_alternator.setText("NONE");
        vg_alternator.setAlignmentY(1.0F);
        vg_alternator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(vg_alternator, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 180, 26));

        vg_engine.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        vg_engine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vg_engine.setText("NONE");
        vg_engine.setAlignmentY(1.0F);
        vg_engine.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(vg_engine, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 180, 26));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 820, 610));

        jPanel4.setBackground(new java.awt.Color(3, 33, 73));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        display.setForeground(new java.awt.Color(255, 255, 255));
        display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        display.setText("VIEW GENSET PRODUCT");
        display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                displayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 470, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vg_picMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vg_picMouseClicked
        
         
      
    }//GEN-LAST:event_vg_picMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Mainpage.shop_genset_id.setText("");
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void displayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_displayAncestorAdded
        
        String id = vg_id.getText();
       // String viewDisplayGenset = display.getText();
        String resultId = Mainpage.shop_genset_id.getText();
        if(resultId.equals(id)){
            try{
               PreparedStatement ps;
               ResultSet rs;
               ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `genset_table` WHERE `ID`='"+id+"'");
               rs = ps.executeQuery();
                while(rs.next()){
                     vg_pic.setText(null);
                     ImageIcon imageicon = new ImageIcon (new ImageIcon(rs.getBytes("IMAGE")).getImage().getScaledInstance(vg_pic.getWidth(), vg_pic.getHeight(),Image.SCALE_SMOOTH) );
                     vg_pic.setIcon(imageicon);

                     vg_brand.setText(rs.getString("BRAND"));
                     vg_model.setText(rs.getString("MODEL"));
                     vg_kva.setText(rs.getString("KVA"));
                     vg_phasing.setText(rs.getString("PHASING"));
                     vg_unit_type.setText(rs.getString("UNIT_TYPE"));
                     vg_dimension.setText(rs.getString("DIMENSION"));
                     vg_fuel.setText(rs.getString("TANK_CAP"));
                     vg_body_type.setText(rs.getString("BODY TYPE"));
                     vg_price.setText(rs.getString("PRICE"));
                     vg_engine.setText(rs.getString("ENGINE_SERIAL_NO"));
                     vg_alternator.setText(rs.getString("ALTERNATOR_SERIAL_NO"));
                     vg_date.setText(rs.getString("DATE"));
                     
                }
           }
           catch(Exception e){
               e.printStackTrace();
           }           
        }
       
        
    }//GEN-LAST:event_displayAncestorAdded

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(ViewGensetItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewGensetItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewGensetItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewGensetItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewGensetItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    public static javax.swing.JLabel display;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JLabel vg_alternator;
    public static javax.swing.JLabel vg_body_type;
    public static javax.swing.JLabel vg_brand;
    public static javax.swing.JLabel vg_date;
    public static javax.swing.JLabel vg_dimension;
    public static javax.swing.JLabel vg_engine;
    public static javax.swing.JLabel vg_fuel;
    public static javax.swing.JLabel vg_id;
    public static javax.swing.JLabel vg_kva;
    public static javax.swing.JLabel vg_model;
    public static javax.swing.JLabel vg_phasing;
    private javax.swing.JLabel vg_pic;
    public static javax.swing.JLabel vg_price;
    public static javax.swing.JLabel vg_unit_type;
    // End of variables declaration//GEN-END:variables
}
