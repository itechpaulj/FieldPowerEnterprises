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
                FileImageInputStream fis1 = new FileImageInputStream(new File("C:/Users/"+Webpage.located+"/Documents/NetBeansProjects/FieldPowerEnterprises/src/Picture/Drawer_Btn/Default_Imge.png"));
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        Stock_Genset_Panel_Update = new javax.swing.JPanel();
        Stock_Genset_Update = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        Stock_Genset_Back = new javax.swing.JLabel();
        View_Wh_pic = new javax.swing.JLabel();
        Stock_Genset_Panel_View1 = new javax.swing.JPanel();
        Stock_Genset_Delete = new javax.swing.JLabel();

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
        jPanel4.add(View_WH_Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 360, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 100));

        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        View_Wh_date.setFieldFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));
        KG2_ADD_STOCK_GENSET.add(View_Wh_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 210, 30));

        View_Wh_Type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Wh_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "FILTER", "PARTS" }));
        View_Wh_Type.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Wh_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 210, 31));

        View_Wh_quantity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Wh_quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Wh_quantity.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Wh_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 210, 31));

        View_Wh_Category.setEditable(false);
        View_Wh_Category.setBackground(new java.awt.Color(204, 204, 204));
        View_Wh_Category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Wh_Category.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Wh_Category.setText("WAREHOUSE");
        View_Wh_Category.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Wh_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 210, 31));

        View_Wh_Brand.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Wh_Brand.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Wh_Brand.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Wh_Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 210, 31));

        View_Wh_price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Wh_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Wh_price.setBorder(null);
        View_Wh_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_Wh_priceActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Wh_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 210, 31));

        View_Wh_remarks.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Wh_remarks.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Wh_remarks.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Wh_remarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 210, 31));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(51, 214, 255));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setText(" CATEGORY");
        jTextField1.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 160, 31));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(51, 214, 255));
        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setText(" DATE RECIEVED");
        jTextField2.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 160, 31));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(51, 214, 255));
        jTextField3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField3.setText(" DESCRPTION");
        jTextField3.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 160, 31));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(51, 214, 255));
        jTextField5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField5.setText(" QUANTITY");
        jTextField5.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 160, 31));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(51, 214, 255));
        jTextField7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField7.setText(" PRICE");
        jTextField7.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 160, 31));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(51, 214, 255));
        jTextField8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField8.setText(" TYPE");
        jTextField8.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 160, 31));

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(51, 214, 255));
        jTextField14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField14.setText(" REMARKS");
        jTextField14.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 160, 31));

        Stock_Genset_Panel_Update.setBackground(new java.awt.Color(66, 139, 202));

        Stock_Genset_Update.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Update.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Save.png"))); // NOI18N
        Stock_Genset_Update.setText("UPDATE");
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
            .addComponent(Stock_Genset_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_UpdateLayout.setVerticalGroup(
            Stock_Genset_Panel_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 160, 45));

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
            .addGroup(Stock_Genset_Panel_BackLayout.createSequentialGroup()
                .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );
        Stock_Genset_Panel_BackLayout.setVerticalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 160, 45));

        View_Wh_pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Wh_pic.setForeground(new java.awt.Color(20, 31, 31));
        View_Wh_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Wh_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Default_Imge.png"))); // NOI18N
        View_Wh_pic.setAlignmentY(1.0F);
        View_Wh_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)));
        View_Wh_pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                View_Wh_picMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Wh_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 280, 180));

        Stock_Genset_Panel_View1.setBackground(new java.awt.Color(255, 86, 83));

        Stock_Genset_Delete.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Delete.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_View.png"))); // NOI18N
        Stock_Genset_Delete.setText("  DELETE ");
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

        javax.swing.GroupLayout Stock_Genset_Panel_View1Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_View1);
        Stock_Genset_Panel_View1.setLayout(Stock_Genset_Panel_View1Layout);
        Stock_Genset_Panel_View1Layout.setHorizontalGroup(
            Stock_Genset_Panel_View1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Stock_Genset_Panel_View1Layout.createSequentialGroup()
                .addComponent(Stock_Genset_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        Stock_Genset_Panel_View1Layout.setVerticalGroup(
            Stock_Genset_Panel_View1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_View1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 170, 45));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 750, 550));

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
    //String person_in_charge= View_Wh_incharge.getText();
    
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
    Class_tables ct = new Class_tables();
        if(!Class_SummaryStock.UpdateStock(date, category, brand, model, kva, phasing, type, supplier_price, seller_price, engine_sn, alternator_sn, quantity, remarks, supplier_name,id, images, Warehouse_id))
        {
            ct.Stocks();
            JOptionPane.showMessageDialog(null, "SUCCESSFULY ADDED","",JOptionPane.INFORMATION_MESSAGE);
        }else{
            ct.Stocks();
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
    Class_tables ct = new Class_tables();
    ct.Stocks();
    Webpage.Stock_cat = null;
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
    String id = Webpage.Stock_Category_Id.getText();
    
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

    private void Stock_Genset_DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_DeleteMouseClicked
        String sid = Webpage.Stock_Category_Id.getText();

        if(sid.equals("")){
            JOptionPane.showMessageDialog(null, " PLEASE SELECT! ","",JOptionPane.ERROR_MESSAGE);
             Webpage.ct.Stocks();
        }
        else{
            int opt = JOptionPane.showConfirmDialog(null, "YOU WANT TO DELETE THIS STOCK ? ","",JOptionPane.YES_NO_OPTION);
            if(opt==0){
                if(JOptionPane.YES_NO_OPTION == JOptionPane.YES_OPTION && !Class_SummaryStock.DeleteGenset(sid) ){
                    JOptionPane.showMessageDialog(null, " DELETE STOCK! ","",JOptionPane.ERROR_MESSAGE);
                Webpage.ct.Stocks();
                }
            }
        }
    }//GEN-LAST:event_Stock_Genset_DeleteMouseClicked

    private void Stock_Genset_DeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_DeleteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_DeleteMouseEntered

    private void Stock_Genset_DeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_DeleteMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_DeleteMouseExited

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
    public static javax.swing.JLabel Stock_Genset_Delete;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Update;
    public static javax.swing.JPanel Stock_Genset_Panel_View1;
    private javax.swing.JLabel Stock_Genset_Update;
    public static javax.swing.JLabel View_WH_Display;
    public static javax.swing.JTextField View_Wh_Brand;
    public static javax.swing.JTextField View_Wh_Category;
    public static javax.swing.JComboBox<String> View_Wh_Type;
    public static datechooser.beans.DateChooserCombo View_Wh_date;
    public static javax.swing.JLabel View_Wh_pic;
    public static javax.swing.JTextField View_Wh_price;
    public static javax.swing.JTextField View_Wh_quantity;
    public static javax.swing.JTextField View_Wh_remarks;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
