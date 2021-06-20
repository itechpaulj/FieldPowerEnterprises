/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE.folder;

import FPE.FPE_DB;
import FPE.Mainpage;
import java.awt.Color;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;

/**
 *
 * @author ROBLES
 */
public class Bin_Filter extends javax.swing.JFrame {

    /**
     * Creates new form History_Fitler
     */
    public Bin_Filter() {
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
        bin_des = new javax.swing.JLabel();
        bin_total = new javax.swing.JLabel();
        bin_date = new javax.swing.JLabel();
        bin_price = new javax.swing.JLabel();
        bin_brand = new javax.swing.JLabel();
        bin_pic = new javax.swing.JLabel();
        bin_id = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        bin_quantity = new javax.swing.JTextField();
        a1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        bin_type = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        history_genset_back = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Bin_Filter_Banner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setkTransparentControls(false);
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bin_des.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        bin_des.setForeground(new java.awt.Color(20, 31, 31));
        bin_des.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bin_des.setAlignmentY(1.0F);
        bin_des.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(bin_des, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 170, 30));

        bin_total.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        bin_total.setForeground(new java.awt.Color(20, 31, 31));
        bin_total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bin_total.setAlignmentY(1.0F);
        bin_total.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(bin_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 200, 30));

        bin_date.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        bin_date.setForeground(new java.awt.Color(20, 31, 31));
        bin_date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bin_date.setAlignmentY(1.0F);
        bin_date.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(bin_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 160, 30));

        bin_price.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        bin_price.setForeground(new java.awt.Color(20, 31, 31));
        bin_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bin_price.setAlignmentY(1.0F);
        bin_price.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(bin_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 200, 30));

        bin_brand.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        bin_brand.setForeground(new java.awt.Color(20, 31, 31));
        bin_brand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bin_brand.setAlignmentY(1.0F);
        bin_brand.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(bin_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 200, 30));

        bin_pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        bin_pic.setForeground(new java.awt.Color(20, 31, 31));
        bin_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bin_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Default_Imge.png"))); // NOI18N
        bin_pic.setAlignmentY(1.0F);
        bin_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)));
        bin_pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bin_picMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(bin_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 270, 150));

        bin_id.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        bin_id.setForeground(new java.awt.Color(20, 31, 31));
        bin_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bin_id.setAlignmentY(1.0F);
        bin_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(bin_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 170, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(20, 31, 31));
        jLabel16.setText("ORDERED DATE");
        jLabel16.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 130, 30));

        bin_quantity.setEditable(false);
        bin_quantity.setBackground(new java.awt.Color(42, 142, 142));
        bin_quantity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bin_quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bin_quantity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        bin_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bin_quantityKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bin_quantityKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bin_quantityKeyTyped(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(bin_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 200, 30));

        a1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        a1.setForeground(new java.awt.Color(20, 31, 31));
        a1.setText("ID");
        a1.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 60, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(20, 31, 31));
        jLabel3.setText("BRAND NAME");
        jLabel3.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 90, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(20, 31, 31));
        jLabel8.setText("DESCRIPTION");
        jLabel8.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 100, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(20, 31, 31));
        jLabel6.setText("TYPE");
        jLabel6.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 130, 30));

        jLabel30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(20, 31, 31));
        jLabel30.setText("PRICE");
        jLabel30.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 130, 30));

        jLabel31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(20, 31, 31));
        jLabel31.setText("QUANTITY");
        jLabel31.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 130, 30));

        jLabel29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(20, 31, 31));
        jLabel29.setText("TOTAL PRICE");
        jLabel29.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 130, 30));

        bin_type.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        bin_type.setForeground(new java.awt.Color(20, 31, 31));
        bin_type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bin_type.setAlignmentY(1.0F);
        bin_type.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(bin_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 200, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 0));
        jLabel12.setToolTipText("");
        jLabel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)), "FILTER / PART INFORMATION", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 20), new java.awt.Color(20, 31, 31))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1000, 470));

        Stock_Genset_Panel_Back.setBackground(new java.awt.Color(255, 194, 102));
        Stock_Genset_Panel_Back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        history_genset_back.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        history_genset_back.setForeground(new java.awt.Color(255, 255, 255));
        history_genset_back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        history_genset_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Backss.png"))); // NOI18N
        history_genset_back.setText(" BACK");
        history_genset_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                history_genset_backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                history_genset_backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                history_genset_backMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_BackLayout = new javax.swing.GroupLayout(Stock_Genset_Panel_Back);
        Stock_Genset_Panel_Back.setLayout(Stock_Genset_Panel_BackLayout);
        Stock_Genset_Panel_BackLayout.setHorizontalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(history_genset_back, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_BackLayout.setVerticalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(history_genset_back, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 210, 50));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1070, 620));

        jPanel4.setBackground(new java.awt.Color(2, 51, 74));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bin_Filter_Banner.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Bin_Filter_Banner.setForeground(new java.awt.Color(255, 255, 255));
        Bin_Filter_Banner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bin_Filter_Banner.setText("BIN FILTER");
        Bin_Filter_Banner.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Bin_Filter_BannerAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(Bin_Filter_Banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 470, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bin_picMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bin_picMouseClicked

    }//GEN-LAST:event_bin_picMouseClicked

    private void bin_quantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bin_quantityKeyPressed
        try{
            String quantitys=bin_quantity.getText();
            int sum=0,quantity = 0 ;
            int price = Integer.parseInt(bin_price.getText());
            quantity = Integer.parseInt(bin_quantity.getText().toString());
            sum = price * quantity;
            bin_total.setText(""+sum);
        }
        catch(Exception e){

        }
    }//GEN-LAST:event_bin_quantityKeyPressed

    private void bin_quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bin_quantityKeyReleased


    }//GEN-LAST:event_bin_quantityKeyReleased

    private void bin_quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bin_quantityKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_bin_quantityKeyTyped

    private void Bin_Filter_BannerAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Bin_Filter_BannerAncestorAdded
                String Banner = Bin_Filter_Banner.getText();
        
        if(Banner.equals("BIN FILTER")){
            
        try{   
            String id = Mainpage.bin_filter_id.getText();
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `history_filter` WHERE `ID`='"+id+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                     
            bin_id.setText(rs.getString("ID"));
             bin_date.setText(rs.getString("DATE"));
            bin_brand.setText(rs.getString("BRAND"));
            bin_des.setText(rs.getString("DESCRIPTION"));
           
            
            bin_type.setText(rs.getString("TYPE"));
            bin_price.setText(rs.getString("PRICE"));
            bin_quantity.setText(rs.getString("QUANTITY"));
            bin_total.setText(rs.getString("TOTAL PRICE"));
            
            byte[] images = rs.getBytes("IMAGE");
            ImageIcon imageicon = new ImageIcon (new ImageIcon(images).getImage().getScaledInstance(bin_pic.getWidth(), bin_pic.getHeight(),Image.SCALE_SMOOTH) );
            bin_pic.setIcon(imageicon);
            
    
          
            }
        }catch(Exception e){
            e.printStackTrace();
        } }
    }//GEN-LAST:event_Bin_Filter_BannerAncestorAdded

    private void history_genset_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_history_genset_backMouseClicked
        Mainpage.Shop_genset_id.setText("");
        dispose();
    }//GEN-LAST:event_history_genset_backMouseClicked

    private void history_genset_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_history_genset_backMouseEntered
        Stock_Genset_Panel_Back.setBackground(new Color(255,214,122));
    }//GEN-LAST:event_history_genset_backMouseEntered

    private void history_genset_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_history_genset_backMouseExited
        Stock_Genset_Panel_Back.setBackground(new Color(255,194,102));

    }//GEN-LAST:event_history_genset_backMouseExited

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
            java.util.logging.Logger.getLogger(Bin_Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bin_Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bin_Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bin_Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bin_Filter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Bin_Filter_Banner;
    private keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    private javax.swing.JLabel a1;
    public static javax.swing.JLabel bin_brand;
    public static javax.swing.JLabel bin_date;
    public static javax.swing.JLabel bin_des;
    public static javax.swing.JLabel bin_id;
    public static javax.swing.JLabel bin_pic;
    public static javax.swing.JLabel bin_price;
    private javax.swing.JTextField bin_quantity;
    public static javax.swing.JLabel bin_total;
    public static javax.swing.JLabel bin_type;
    private javax.swing.JLabel history_genset_back;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}