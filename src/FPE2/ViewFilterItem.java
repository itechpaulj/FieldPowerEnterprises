/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE2;

/**
 *
 * @author Javinez
 */
public class ViewFilterItem extends javax.swing.JFrame {

    /**
     * Creates new form ViewFilterItem1
     */
    public ViewFilterItem() {
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
        jPanel5 = new javax.swing.JPanel();
        display = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        af_pic = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        filterBtn = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        id3 = new javax.swing.JLabel();
        id4 = new javax.swing.JLabel();
        id5 = new javax.swing.JLabel();
        id6 = new javax.swing.JLabel();
        id7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(153, 204, 255));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(0, 255, 153));
        KG2_ADD_STOCK_GENSET.setMinimumSize(new java.awt.Dimension(820, 710));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(3, 33, 73));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        display.setForeground(new java.awt.Color(255, 255, 255));
        display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        display.setText("UPDATE FILTER / PARTS / OTHER PRODUCT");
        display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                displayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel5.add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 800, 80));

        KG2_ADD_STOCK_GENSET.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 100));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel20.setText("QUANTITY");
        jLabel20.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 120, 26));

        jLabel22.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel22.setText("TYPE");
        jLabel22.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 120, 26));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel2.setText("BRAND");
        jLabel2.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 120, 26));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel3.setText("NAME");
        jLabel3.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 120, 26));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel7.setText("DESCRIPTION");
        jLabel7.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 120, 26));

        id.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        id.setAlignmentY(1.0F);
        id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 230, 26));

        af_pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        af_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        af_pic.setText("2x2");
        af_pic.setAlignmentY(1.0F);
        af_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        af_pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                af_picMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(af_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 220, 200));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel10.setText("PRICE");
        jLabel10.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 120, 26));

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

        KG2_ADD_STOCK_GENSET.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 600, 210, 50));

        filterBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        filterBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        filterBtn.setText("ADD TO CART");
        filterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filterBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(filterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(filterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, 210, 50));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel13.setText("DATE");
        jLabel13.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 120, 26));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel14.setText("ID");
        jLabel14.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 120, 26));

        id1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        id1.setAlignmentY(1.0F);
        id1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 230, 26));

        id2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        id2.setAlignmentY(1.0F);
        id2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 230, 26));

        id3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        id3.setAlignmentY(1.0F);
        id3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(id3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 230, 26));

        id4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        id4.setAlignmentY(1.0F);
        id4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(id4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 230, 26));

        id5.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        id5.setAlignmentY(1.0F);
        id5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(id5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 230, 26));

        id6.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        id6.setAlignmentY(1.0F);
        id6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(id6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 230, 26));

        id7.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        id7.setAlignmentY(1.0F);
        id7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(id7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 230, 26));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_displayAncestorAdded

    }//GEN-LAST:event_displayAncestorAdded

    private void af_picMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_af_picMouseClicked

    }//GEN-LAST:event_af_picMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        dispose();

    }//GEN-LAST:event_jLabel5MouseClicked

    private void filterBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterBtnMouseClicked
        //       String date,names,des,brand,type,price,quantity,ids;
        //
        //       String save_add = filterBtn.getText();
        //       ids = jLabel20.getText();
        //       names = af_name.getText();
        //       date = af_date.getText();
        //       brand = af_brand.getText();
        //       price = af_price.getText();
        //       type = types.getSelectedItem().toString();
        //       int type1 = types.getSelectedIndex();
        //       quantity= af_quantity.getText();
        //       des = af_des.getText();

        InsertSupplier is = new InsertSupplier();
        is.setVisible(true);
        is.AddSup.setText("3"); // add supplier and filter

    }//GEN-LAST:event_filterBtnMouseClicked

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
            java.util.logging.Logger.getLogger(ViewFilterItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFilterItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFilterItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFilterItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFilterItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    public static javax.swing.JLabel af_pic;
    public static javax.swing.JLabel display;
    public static javax.swing.JLabel filterBtn;
    public static javax.swing.JLabel id;
    public static javax.swing.JLabel id1;
    public static javax.swing.JLabel id2;
    public static javax.swing.JLabel id3;
    public static javax.swing.JLabel id4;
    public static javax.swing.JLabel id5;
    public static javax.swing.JLabel id6;
    public static javax.swing.JLabel id7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
