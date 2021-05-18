/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE2;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import java.sql.ResultSet;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author ROBLES
 */
public class Stock_View_Filter_Item extends javax.swing.JFrame {

    /**
     * Creates new form Stock_View_Genset_Item
     */
    String filename = null;
    byte[] person_image = null;

    
    public Stock_View_Filter_Item() {
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
        display = new javax.swing.JLabel();
        KG2_ADD_STOCK_GENSET = new keeptoo.KGradientPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        svft_pic = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        svft_id = new javax.swing.JLabel();
        svft_supplier = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        svft_brand = new javax.swing.JTextField();
        svft_name = new javax.swing.JTextField();
        svft_des = new javax.swing.JTextField();
        svft_price = new javax.swing.JTextField();
        svft_quantity = new javax.swing.JTextField();
        Stock_Genset_Panel_Delete = new javax.swing.JPanel();
        Stock_Genset_Delete = new javax.swing.JLabel();
        Stock_Genset_Panel_Update = new javax.swing.JPanel();
        Stock_Genset_Update = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        Stock_Genset_Back = new javax.swing.JLabel();
        svft_date = new datechooser.beans.DateChooserCombo();
        svft_types = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 71, 94));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        display.setForeground(new java.awt.Color(255, 255, 255));
        display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        display.setText("STOCK VIEW FILTER ITEM");
        display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                displayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 470, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 100));

        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(0, 255, 153));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(0, 255, 153));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel20.setText("QUANTITY");
        jLabel20.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 110, 26));

        jLabel22.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel22.setText("DIMENSION");
        jLabel22.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 110, 26));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel2.setText("BRAND");
        jLabel2.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 110, 26));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel3.setText("NAME");
        jLabel3.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 110, 26));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel7.setText("DESCRIPTION");
        jLabel7.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 110, 26));

        id.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        id.setText("ID");
        id.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 110, 26));

        svft_pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        svft_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        svft_pic.setText("2x2");
        svft_pic.setAlignmentY(1.0F);
        svft_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        svft_pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svft_picMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(svft_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 330, 140));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel10.setText("PRICE");
        jLabel10.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 110, 26));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel16.setText("DATE");
        jLabel16.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 110, 26));

        svft_id.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        svft_id.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        svft_id.setAlignmentY(1.0F);
        svft_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(svft_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 220, 26));

        svft_supplier.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        svft_supplier.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        svft_supplier.setAlignmentY(1.0F);
        svft_supplier.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(svft_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 280, 26));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel4.setText("SUPPLIER");
        jLabel4.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 110, 26));

        svft_brand.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        svft_brand.setAlignmentY(1.0F);
        svft_brand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                svft_brandKeyReleased(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(svft_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 220, 31));

        svft_name.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        svft_name.setAlignmentY(1.0F);
        svft_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                svft_nameKeyReleased(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(svft_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 220, 31));

        svft_des.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        svft_des.setAlignmentY(1.0F);
        svft_des.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                svft_desKeyReleased(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(svft_des, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 220, 31));

        svft_price.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        svft_price.setAlignmentY(1.0F);
        svft_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                svft_priceKeyReleased(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(svft_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 220, 31));

        svft_quantity.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        svft_quantity.setAlignmentY(1.0F);
        svft_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                svft_quantityKeyReleased(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(svft_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 220, 31));

        Stock_Genset_Panel_Delete.setBackground(new java.awt.Color(255, 77, 77));

        Stock_Genset_Delete.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Delete.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Delete.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Stock_Genset_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FPE2/Cancel_Btn.png"))); // NOI18N
        Stock_Genset_Delete.setText(" DELETE ITEM      ");
        Stock_Genset_Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Genset_DeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Genset_DeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Genset_DeleteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_DeleteLayout = new javax.swing.GroupLayout(Stock_Genset_Panel_Delete);
        Stock_Genset_Panel_Delete.setLayout(Stock_Genset_Panel_DeleteLayout);
        Stock_Genset_Panel_DeleteLayout.setHorizontalGroup(
            Stock_Genset_Panel_DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_DeleteLayout.setVerticalGroup(
            Stock_Genset_Panel_DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, 190, 50));

        Stock_Genset_Panel_Update.setBackground(new java.awt.Color(51, 187, 255));

        Stock_Genset_Update.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Update.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Update.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Stock_Genset_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FPE2/Edit_Btn.png"))); // NOI18N
        Stock_Genset_Update.setText(" UPDATE ITEM    ");
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
            .addComponent(Stock_Genset_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_UpdateLayout.setVerticalGroup(
            Stock_Genset_Panel_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 190, 50));

        Stock_Genset_Panel_Back.setBackground(new java.awt.Color(255, 194, 102));

        Stock_Genset_Back.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Back.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Back.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Stock_Genset_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FPE2/bACKS_bTN.png"))); // NOI18N
        Stock_Genset_Back.setText("  BACK               ");
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
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_BackLayout.setVerticalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, 190, 50));

        svft_date.setCalendarPreferredSize(new java.awt.Dimension(400, 500));
        KG2_ADD_STOCK_GENSET.add(svft_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 280, 30));

        svft_types.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        svft_types.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "FILTER", "PARTS", "OTHER" }));
        KG2_ADD_STOCK_GENSET.add(svft_types, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 220, 30));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1070, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void displayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_displayAncestorAdded
        String Banner = display.getText();
        if(Banner.equals("STOCK VIEW FILTER ITEM"))
        {
            String id1 = svft_id.getText();

                    
           try{
                PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `filter_table` WHERE `ID`='"+id1+"'");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    svft_brand.setText(rs.getString("BRAND"));
                    svft_name.setText(rs.getString("NAME"));
                    svft_des.setText(rs.getString("DESCRIPTION"));
                    svft_price.setText(rs.getString("PRICE"));
                    svft_quantity.setText(rs.getString("QUANTITY"));

                    svft_supplier.setText(rs.getString("SUPPLIER"));
                    svft_date.setText(rs.getString("DATE"));
                    
                    String types = rs.getString("TYPE");
                    
                    if(types.equals("FILTER")){
                        svft_types.setSelectedIndex(1);
                    }
                    
                    if(types.equals("PARTS")){
                        svft_types.setSelectedIndex(2);
                    }
                    
                     if(types.equals("OTHER")){
                        svft_types.setSelectedIndex(3);
                    }
                     
                    svft_pic.setText(null);
                    ImageIcon imageicon = new ImageIcon (new ImageIcon(rs.getBytes("IMAGE")).getImage().getScaledInstance(svft_pic.getWidth(), svft_pic.getHeight(),Image.SCALE_SMOOTH) );
                    svft_pic.setIcon(imageicon);
                    person_image = rs.getBytes("IMAGE");
                }
            }catch(Exception e){
                e.printStackTrace();
            }          
        }
    }//GEN-LAST:event_displayAncestorAdded

    private void svft_picMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svft_picMouseClicked
        svft_pic.setText(null);
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        svft_pic.setText(filename);
        
                //Image getAbsolutePath = null;
        //ImageIcon icon = new ImageIcon(filename);
        ImageIcon imageicon = new ImageIcon (new ImageIcon(filename).getImage().getScaledInstance(svft_pic.getWidth(), svft_pic.getHeight(),Image.SCALE_SMOOTH) );
        svft_pic.setIcon(imageicon);

        try{
            File image = new File(filename);
            FileImageInputStream fis = new FileImageInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            
            for(int readNum;(readNum=fis.read(buf)) !=-1;){
                bos.write(buf,0,readNum);
            }
            person_image=bos.toByteArray();
            
        }
        catch(Exception e){
           // e.printStackTrace();
        }
        
    }//GEN-LAST:event_svft_picMouseClicked

    private void Stock_Genset_DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_DeleteMouseClicked
        String id1 = svft_id.getText();

            int opt = JOptionPane.showConfirmDialog(null, "YOU WANT TO DELETE THIS PRODUCT ? ","",JOptionPane.YES_NO_OPTION);
            if(opt==0){
                if(JOptionPane.YES_NO_OPTION == JOptionPane.YES_OPTION && !Class_Filter.DeleteFilter(id1) ){
                Class_table ct = new Class_table();
                ct.Show_Stock_Filter_Table();
                JOptionPane.showMessageDialog(null, " PRODUCT DELETED ","",JOptionPane.INFORMATION_MESSAGE);
                }
            }
    }//GEN-LAST:event_Stock_Genset_DeleteMouseClicked

    private void Stock_Genset_DeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_DeleteMouseEntered

    }//GEN-LAST:event_Stock_Genset_DeleteMouseEntered

    private void Stock_Genset_DeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_DeleteMouseExited
 
    }//GEN-LAST:event_Stock_Genset_DeleteMouseExited

    private void Stock_Genset_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseClicked
            String date = svft_date.getText().toUpperCase(); 
            String brand = svft_brand.getText().toUpperCase(); 
            String price = svft_price.getText().toUpperCase(); 
            String quantity = svft_quantity.getText().toUpperCase(); 
            String des = svft_des.getText().toUpperCase();
            String type = svft_types.getSelectedItem().toString();
            String names = svft_name.getText().toUpperCase();
            String supplier = svft_supplier.getText().toUpperCase();
            String id = svft_id.getText().toUpperCase();
        
        
                if(!Class_Filter.UpdateFilter(date, names, des, brand, type, price, quantity, person_image, id)){
                    Class_table ct = new Class_table();
                    ct.Show_Stock_Filter_Table();
                            
                    JOptionPane.showMessageDialog(null, "UPDATE SUCCESSFULLY","",JOptionPane.INFORMATION_MESSAGE);
                }

    }//GEN-LAST:event_Stock_Genset_UpdateMouseClicked

    private void Stock_Genset_UpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseEntered

    }//GEN-LAST:event_Stock_Genset_UpdateMouseEntered

    private void Stock_Genset_UpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseExited

    }//GEN-LAST:event_Stock_Genset_UpdateMouseExited

    private void Stock_Genset_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseClicked
       Mainpage.filter_id.setText("");
        dispose();
    }//GEN-LAST:event_Stock_Genset_BackMouseClicked

    private void Stock_Genset_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseEntered

    }//GEN-LAST:event_Stock_Genset_BackMouseEntered

    private void Stock_Genset_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseExited

    }//GEN-LAST:event_Stock_Genset_BackMouseExited

    private void svft_brandKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_svft_brandKeyReleased

    }//GEN-LAST:event_svft_brandKeyReleased

    private void svft_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_svft_nameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_svft_nameKeyReleased

    private void svft_desKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_svft_desKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_svft_desKeyReleased

    private void svft_priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_svft_priceKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_svft_priceKeyReleased

    private void svft_quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_svft_quantityKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_svft_quantityKeyReleased

    private void svgt_kvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svgt_kvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_svgt_kvaActionPerformed

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
            java.util.logging.Logger.getLogger(Stock_View_Filter_Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stock_View_Filter_Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stock_View_Filter_Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stock_View_Filter_Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stock_View_Filter_Item().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    private javax.swing.JLabel Stock_Genset_Back;
    private javax.swing.JLabel Stock_Genset_Delete;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Delete;
    public static javax.swing.JPanel Stock_Genset_Panel_Update;
    private javax.swing.JLabel Stock_Genset_Update;
    public static javax.swing.JLabel display;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JTextField svft_brand;
    private datechooser.beans.DateChooserCombo svft_date;
    public static javax.swing.JTextField svft_des;
    public static javax.swing.JLabel svft_id;
    public static javax.swing.JTextField svft_name;
    private javax.swing.JLabel svft_pic;
    public static javax.swing.JTextField svft_price;
    public static javax.swing.JTextField svft_quantity;
    public static javax.swing.JLabel svft_supplier;
    public static javax.swing.JComboBox<String> svft_types;
    // End of variables declaration//GEN-END:variables
}