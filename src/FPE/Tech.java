/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Javinez
 */
public class Tech extends javax.swing.JFrame {

    /**
     * Creates new form Tech
     */
    public Tech() {
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
        Process_Filter_Display = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        View_Shop_Filter_description = new javax.swing.JLabel();
        View_Shop_Filter_seller_price = new javax.swing.JLabel();
        View_Shop_Filter_quantity = new javax.swing.JTextField();
        View_Shop_Filter_total = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ADD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 51, 74));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Process_Filter_Display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Process_Filter_Display.setForeground(new java.awt.Color(255, 255, 255));
        Process_Filter_Display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Process_Filter_Display.setText("OTHERS");
        Process_Filter_Display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Process_Filter_DisplayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(Process_Filter_Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 360, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 100));

        kGradientPanel1.setkEndColor(new java.awt.Color(42, 142, 142));
        kGradientPanel1.setkStartColor(new java.awt.Color(42, 142, 142));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        View_Shop_Filter_description.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Shop_Filter_description.setForeground(new java.awt.Color(20, 31, 31));
        View_Shop_Filter_description.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Shop_Filter_description.setAlignmentY(1.0F);
        View_Shop_Filter_description.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(View_Shop_Filter_description, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 220, 30));

        View_Shop_Filter_seller_price.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Shop_Filter_seller_price.setForeground(new java.awt.Color(20, 31, 31));
        View_Shop_Filter_seller_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Shop_Filter_seller_price.setAlignmentY(1.0F);
        View_Shop_Filter_seller_price.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(View_Shop_Filter_seller_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 220, 30));

        View_Shop_Filter_quantity.setBackground(new java.awt.Color(42, 142, 142));
        View_Shop_Filter_quantity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Shop_Filter_quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Shop_Filter_quantity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        View_Shop_Filter_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                View_Shop_Filter_quantityKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                View_Shop_Filter_quantityKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                View_Shop_Filter_quantityKeyTyped(evt);
            }
        });
        kGradientPanel1.add(View_Shop_Filter_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 220, 30));

        View_Shop_Filter_total.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Shop_Filter_total.setForeground(new java.awt.Color(20, 31, 31));
        View_Shop_Filter_total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Shop_Filter_total.setAlignmentY(1.0F);
        View_Shop_Filter_total.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        kGradientPanel1.add(View_Shop_Filter_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 220, 30));

        jLabel29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(20, 31, 31));
        jLabel29.setText("TOTAL PRICE");
        jLabel29.setAlignmentY(1.0F);
        kGradientPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 110, 30));

        jLabel31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(20, 31, 31));
        jLabel31.setText("QUANTITY");
        jLabel31.setAlignmentY(1.0F);
        kGradientPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 110, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(20, 31, 31));
        jLabel8.setText("DESCRIPTION");
        jLabel8.setAlignmentY(1.0F);
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 110, 30));

        jLabel30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(20, 31, 31));
        jLabel30.setText("PRICE");
        jLabel30.setAlignmentY(1.0F);
        kGradientPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 110, 30));

        jPanel1.setBackground(new java.awt.Color(255, 194, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Back.png"))); // NOI18N
        jLabel1.setText(" CANCEL");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 160, 50));

        jPanel2.setBackground(new java.awt.Color(0, 153, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        ADD.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ADD.setForeground(new java.awt.Color(255, 255, 255));
        ADD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ADD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Add.png"))); // NOI18N
        ADD.setText(" ADD");
        ADD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ADDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ADDMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ADD, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ADD, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        kGradientPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 160, 50));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 470, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Process_Filter_DisplayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Process_Filter_DisplayAncestorAdded

    }//GEN-LAST:event_Process_Filter_DisplayAncestorAdded

    private void View_Shop_Filter_quantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_View_Shop_Filter_quantityKeyPressed

        String quantitys=View_Shop_Filter_quantity.getText();
        int sum=0,quantity = 0 ;
        int price = Integer.parseInt(View_Shop_Filter_seller_price.getText());
        quantity = Integer.parseInt(View_Shop_Filter_quantity.getText().toString());
        sum = price * quantity;
        View_Shop_Filter_total.setText(""+sum);
    }//GEN-LAST:event_View_Shop_Filter_quantityKeyPressed

    private void View_Shop_Filter_quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_View_Shop_Filter_quantityKeyReleased
        int sum=0,quantity = 0 ;
        int price = Integer.parseInt(View_Shop_Filter_seller_price.getText());
        quantity = Integer.parseInt(View_Shop_Filter_quantity.getText().toString());
        sum = price * quantity;
        View_Shop_Filter_total.setText(""+sum);
    }//GEN-LAST:event_View_Shop_Filter_quantityKeyReleased

    private void View_Shop_Filter_quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_View_Shop_Filter_quantityKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_View_Shop_Filter_quantityKeyTyped

    private void ADDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDMouseClicked
        String des = View_Shop_Filter_description.getText();
        String price = View_Shop_Filter_seller_price.getText();
        String quantity = View_Shop_Filter_quantity.getText();
        String total = View_Shop_Filter_total.getText();
        
   
        
        if(!Class_Cart.AddOther(des, price, quantity, total)){
            JOptionPane.showMessageDialog(null, "ADDED");
            dispose();
        }  
        
        
    }//GEN-LAST:event_ADDMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
            dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void ADDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDMouseEntered
       jPanel2.setBackground(new Color(0,173,71));
    }//GEN-LAST:event_ADDMouseEntered

    private void ADDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDMouseExited
        jPanel2.setBackground(new Color(0,153,51));
    }//GEN-LAST:event_ADDMouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jPanel1.setBackground(new Color(255,174,122));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
       jPanel1.setBackground(new Color(255,194,122));
    }//GEN-LAST:event_jLabel1MouseExited

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
            java.util.logging.Logger.getLogger(Tech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tech().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ADD;
    public static javax.swing.JLabel Process_Filter_Display;
    public static javax.swing.JLabel View_Shop_Filter_description;
    private javax.swing.JTextField View_Shop_Filter_quantity;
    public static javax.swing.JLabel View_Shop_Filter_seller_price;
    public static javax.swing.JLabel View_Shop_Filter_total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
