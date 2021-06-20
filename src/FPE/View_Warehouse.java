/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class View_Warehouse extends javax.swing.JFrame {
    String filename = null;
    public static byte[] images = null;
    String Warehouse_id =null;
    
    public View_Warehouse() {
        initComponents();
        imgisNull();
    
        
    }
 public void imgisNull(){
        try{
                if(images == null) {
                FileImageInputStream fis1 = new FileImageInputStream(new File("C:/Users/"+Mainpage.located+"/Documents/NetBeansProjects/FieldPowerEnterprises/src/Picture/Drawer_Btn/Default_Imge.png"));
                ByteArrayOutputStream bos1 = new ByteArrayOutputStream();
                byte[] buf1 = new byte[1024];
                    for(int readNum;(readNum=fis1.read(buf1)) !=-1;){
                        bos1.write(buf1,0,readNum);
                    }
                images=bos1.toByteArray(); 
            }
        }
        catch(Exception e){
//            e.printStackTrace();
        }
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        View_WH_Display = new javax.swing.JLabel();
        KG2_ADD_STOCK_GENSET = new keeptoo.KGradientPanel();
        View_Wh_date = new datechooser.beans.DateChooserCombo();
        View_Wh_Type = new javax.swing.JComboBox<>();
        View_Wh_quantity = new javax.swing.JTextField();
        View_Wh_Category = new javax.swing.JTextField();
        View_Wh_Brand = new javax.swing.JTextField();
        View_Wh_price = new javax.swing.JTextField();
        View_Wh_remarks = new javax.swing.JTextField();
        View_Wh_incharge = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        Stock_Genset_Panel_Update = new javax.swing.JPanel();
        Stock_Genset_Update = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        Stock_Genset_Back = new javax.swing.JLabel();
        View_Wh_pic = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 51, 74));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        View_WH_Display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        View_WH_Display.setForeground(new java.awt.Color(255, 255, 255));
        View_WH_Display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_WH_Display.setText("VIEW WAREHOUSE ITEM");
        View_WH_Display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                View_WH_DisplayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(View_WH_Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 470, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 100));

        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        View_Wh_date.setFieldFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));
        KG2_ADD_STOCK_GENSET.add(View_Wh_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 260, 30));

        View_Wh_Type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Wh_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "FILTER", "PARTS" }));
        View_Wh_Type.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Wh_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 260, 31));

        View_Wh_quantity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Wh_quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Wh_quantity.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Wh_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 260, 31));

        View_Wh_Category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Wh_Category.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Wh_Category.setText("WAREHOUSE");
        View_Wh_Category.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Wh_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 260, 31));

        View_Wh_Brand.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Wh_Brand.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Wh_Brand.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Wh_Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 260, 31));

        View_Wh_price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Wh_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Wh_price.setBorder(null);
        View_Wh_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_Wh_priceActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Wh_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 260, 31));

        View_Wh_remarks.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Wh_remarks.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Wh_remarks.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Wh_remarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 260, 31));

        View_Wh_incharge.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Wh_incharge.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Wh_incharge.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Wh_incharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 260, 31));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(51, 214, 255));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setText(" CATEGORY");
        jTextField1.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 160, 31));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(51, 214, 255));
        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setText(" DATE RECIEVED");
        jTextField2.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 160, 31));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(51, 214, 255));
        jTextField3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField3.setText(" DESCRPTION");
        jTextField3.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 160, 31));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(51, 214, 255));
        jTextField5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField5.setText(" QUANTITY");
        jTextField5.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 160, 31));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(51, 214, 255));
        jTextField7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField7.setText(" PRICE");
        jTextField7.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 160, 31));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(51, 214, 255));
        jTextField8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField8.setText(" TYPE");
        jTextField8.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 160, 31));

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(51, 214, 255));
        jTextField14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField14.setText(" REMARKS");
        jTextField14.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 160, 31));

        jTextField15.setEditable(false);
        jTextField15.setBackground(new java.awt.Color(51, 214, 255));
        jTextField15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField15.setText(" INCHARGES");
        jTextField15.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 160, 31));

        Stock_Genset_Panel_Update.setBackground(new java.awt.Color(51, 187, 255));
        Stock_Genset_Panel_Update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Stock_Genset_Update.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Update.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Save.png"))); // NOI18N
        Stock_Genset_Update.setText(" SAVE RECORD ");
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
            .addGroup(Stock_Genset_Panel_UpdateLayout.createSequentialGroup()
                .addComponent(Stock_Genset_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        Stock_Genset_Panel_UpdateLayout.setVerticalGroup(
            Stock_Genset_Panel_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 210, 50));

        Stock_Genset_Panel_Back.setBackground(new java.awt.Color(255, 173, 51));
        Stock_Genset_Panel_Back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Stock_Genset_Back.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Back.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Backss.png"))); // NOI18N
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
            .addGroup(Stock_Genset_Panel_BackLayout.createSequentialGroup()
                .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );
        Stock_Genset_Panel_BackLayout.setVerticalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 210, 50));

        View_Wh_pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Wh_pic.setForeground(new java.awt.Color(20, 31, 31));
        View_Wh_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Wh_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Default_Imge.png"))); // NOI18N
        View_Wh_pic.setAlignmentY(1.0F);
        View_Wh_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)));
        View_Wh_pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                View_Wh_picMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Wh_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 300, 180));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 0));
        jLabel12.setToolTipText("");
        jLabel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)), "ADD NEW PARTS", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 20), new java.awt.Color(20, 31, 31))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 790, 450));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 830, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void View_Wh_picMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_Wh_picMouseClicked
        View_Wh_pic.setText(null);
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        

        ImageIcon imageicon = new ImageIcon (new ImageIcon(filename).getImage().getScaledInstance(View_Wh_pic.getWidth(), View_Wh_pic.getHeight(),Image.SCALE_SMOOTH) );
        View_Wh_pic.setIcon(imageicon);

        try{
            File image = new File(filename);
            FileImageInputStream fis = new FileImageInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            
            for(int readNum;(readNum=fis.read(buf)) !=-1;){
                bos.write(buf,0,readNum);
            }
            images=bos.toByteArray();
       
        }
        catch(Exception e){
           // e.printStackTrace();
        }
    }//GEN-LAST:event_View_Wh_picMouseClicked

    private void Stock_Genset_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseClicked
    String date = View_Wh_date.getText();
    String category = View_Wh_Category.getText();
    String brand = View_Wh_Brand.getText();
    String type = View_Wh_Type.getSelectedItem().toString();
    String seller_price = View_Wh_price.getText();
    String quantity = View_Wh_quantity.getText();
    String remarks = View_Wh_remarks.getText();
    String person_in_charge= View_Wh_incharge.getText();
    
    String supplier_name = "";
    String supplier_address = "";
    String supplier_email = "";
    String supplier_contact = "";
    String model="";
    String phasing="";
    
    String supplier_price="";
    String engine_sn="";
    String alternator_sn="";
    String kva="";
    String id = "";
    
    if(!Class_SummaryStock.UpdateStock(date, category, brand, model, kva, phasing, type, supplier_price, seller_price, engine_sn, alternator_sn, quantity, person_in_charge, remarks, supplier_name,id, images, kva))
    {
        JOptionPane.showMessageDialog(null, "SUCCESSFULY ADDED","",JOptionPane.INFORMATION_MESSAGE);
    }else{
        JOptionPane.showMessageDialog(null, "TRY AGAIN","",JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_Stock_Genset_UpdateMouseClicked

    private void Stock_Genset_UpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseEntered
      
        Stock_Genset_Panel_Update.setBackground(new Color(51, 207, 255));
    }//GEN-LAST:event_Stock_Genset_UpdateMouseEntered

    private void Stock_Genset_UpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseExited
     
        Stock_Genset_Panel_Update.setBackground(new Color(51, 187, 255));
    }//GEN-LAST:event_Stock_Genset_UpdateMouseExited

    private void Stock_Genset_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseClicked
        
    dispose();
    }//GEN-LAST:event_Stock_Genset_BackMouseClicked

    private void Stock_Genset_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseEntered
     
        Stock_Genset_Panel_Back.setBackground(new Color(255,214,102));
    }//GEN-LAST:event_Stock_Genset_BackMouseEntered

    private void Stock_Genset_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseExited
   
        Stock_Genset_Panel_Back.setBackground(new Color(255,194,102));
    }//GEN-LAST:event_Stock_Genset_BackMouseExited

    private void View_WH_DisplayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_View_WH_DisplayAncestorAdded
    String Banner = View_WH_Display.getText();
    String id = Mainpage.ss_id.getText();
    
    if(Banner.equals("VIEW WAREHOUSE ITEM"))
    {
        try{
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `summary_stock` WHERE `ID` = '"+id+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Warehouse_id = rs.getString("ID");
            View_Wh_date.setText(rs.getString("DATE RECEIVED"));
            View_Wh_Category.setText(rs.getString("CATEGORY"));
            View_Wh_Brand.setText(rs.getString("BRAND"));
            View_Wh_Type.setSelectedItem("TYPE");
            View_Wh_price.setText(rs.getString("SELLER PRICE"));
            View_Wh_quantity.setText(rs.getString("QUANTITY"));
            View_Wh_remarks.setText(rs.getString("REMARKS"));
            View_Wh_incharge.setText(rs.getString("PERSON IN CHARGE"));
            
            images = rs.getBytes("IMAGE");
            ImageIcon imageicon = new ImageIcon (new ImageIcon(images).getImage().getScaledInstance(View_Wh_pic.getWidth(), View_Wh_pic.getHeight(),Image.SCALE_SMOOTH) );
            View_Wh_pic.setIcon(imageicon);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_View_WH_DisplayAncestorAdded

    private void View_Wh_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_Wh_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_View_Wh_priceActionPerformed

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
            java.util.logging.Logger.getLogger(View_Warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new View_Warehouse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    private javax.swing.JLabel Stock_Genset_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Update;
    private javax.swing.JLabel Stock_Genset_Update;
    public static javax.swing.JLabel View_WH_Display;
    public static javax.swing.JTextField View_Wh_Brand;
    public static javax.swing.JTextField View_Wh_Category;
    public static javax.swing.JComboBox<String> View_Wh_Type;
    public static datechooser.beans.DateChooserCombo View_Wh_date;
    public static javax.swing.JTextField View_Wh_incharge;
    public static javax.swing.JLabel View_Wh_pic;
    public static javax.swing.JTextField View_Wh_price;
    public static javax.swing.JTextField View_Wh_quantity;
    public static javax.swing.JTextField View_Wh_remarks;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
