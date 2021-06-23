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

/**
 *
 * @author ROBLES
 */
public class View_Office extends javax.swing.JFrame {
    String filename = null;
    String Office_id = null;
    public static byte[] images = null;
    
    public View_Office() {
        initComponents();
        imgisNull();
        Path.setVisible(false);
        
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
        View_Office_Display = new javax.swing.JLabel();
        KG2_ADD_STOCK_GENSET = new keeptoo.KGradientPanel();
        View_Office_pic = new javax.swing.JLabel();
        Stock_Genset_Panel_Update = new javax.swing.JPanel();
        Stock_Genset_Update = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        Stock_Genset_Back = new javax.swing.JLabel();
        Path = new javax.swing.JLabel();
        View_Office_quantity = new javax.swing.JTextField();
        View_Office_Category = new javax.swing.JTextField();
        View_Office_Brand = new javax.swing.JTextField();
        View_Office_Price = new javax.swing.JTextField();
        View_Office_date = new datechooser.beans.DateChooserCombo();
        View_Office_Type = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        View_Office_Remarks = new javax.swing.JTextField();
        View_Office_Incharges = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 51, 74));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        View_Office_Display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        View_Office_Display.setForeground(new java.awt.Color(255, 255, 255));
        View_Office_Display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Office_Display.setText("VIEW OFFICE ITEM");
        View_Office_Display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                View_Office_DisplayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(View_Office_Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 470, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 100));

        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        View_Office_pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Office_pic.setForeground(new java.awt.Color(20, 31, 31));
        View_Office_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Office_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Default_Imge.png"))); // NOI18N
        View_Office_pic.setAlignmentY(1.0F);
        View_Office_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)));
        View_Office_pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                View_Office_picMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Office_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 300, 180));

        Stock_Genset_Panel_Update.setBackground(new java.awt.Color(51, 187, 255));
        Stock_Genset_Panel_Update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

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
            .addGroup(Stock_Genset_Panel_UpdateLayout.createSequentialGroup()
                .addComponent(Stock_Genset_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
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
                .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        Stock_Genset_Panel_BackLayout.setVerticalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 210, 50));

        Path.setText("1");
        KG2_ADD_STOCK_GENSET.add(Path, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, 30, -1));

        View_Office_quantity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Office_quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Office_quantity.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Office_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 260, 31));

        View_Office_Category.setEditable(false);
        View_Office_Category.setBackground(new java.awt.Color(204, 204, 204));
        View_Office_Category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Office_Category.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Office_Category.setText("OFFICE");
        View_Office_Category.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Office_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 260, 31));

        View_Office_Brand.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Office_Brand.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Office_Brand.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Office_Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 260, 31));

        View_Office_Price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Office_Price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Office_Price.setBorder(null);
        View_Office_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_Office_PriceActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Office_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 260, 31));

        View_Office_date.setFieldFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));
        KG2_ADD_STOCK_GENSET.add(View_Office_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 260, 31));

        View_Office_Type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Office_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "LAPTOP", "INK", "PRINT", "PAPER", "BALLPEN", "ERASER" }));
        View_Office_Type.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Office_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 260, 31));

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
        jTextField3.setText(" DESCRIPTION");
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

        View_Office_Remarks.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Office_Remarks.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Office_Remarks.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Office_Remarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 260, 31));

        View_Office_Incharges.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Office_Incharges.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Office_Incharges.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Office_Incharges, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 260, 31));

        jTextField15.setEditable(false);
        jTextField15.setBackground(new java.awt.Color(51, 214, 255));
        jTextField15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField15.setText("  PERSON INCHARGES");
        jTextField15.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 160, 31));

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

    private void View_Office_picMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_Office_picMouseClicked
        View_Office_pic.setText(null);
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        

        ImageIcon imageicon = new ImageIcon (new ImageIcon(filename).getImage().getScaledInstance(View_Office_pic.getWidth(), View_Office_pic.getHeight(),Image.SCALE_SMOOTH) );
        View_Office_pic.setIcon(imageicon);

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
    }//GEN-LAST:event_View_Office_picMouseClicked

    private void Stock_Genset_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseClicked

    String date = View_Office_date.getText();
    String category = View_Office_Category.getText();
    String brand = View_Office_Brand.getText();
    String type = View_Office_Type.getSelectedItem().toString();
    String seller_price = View_Office_Price.getText();
    String quantity = View_Office_quantity.getText();
    String remarks = View_Office_Remarks.getText();
    String person_in_charge = View_Office_Incharges.getText();
    String id = "";
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
    Class_tables ct = new Class_tables();
    if(!Class_SummaryStock.UpdateStock(date, category, brand, model, kva, phasing, type, supplier_price, seller_price, engine_sn, alternator_sn, quantity, person_in_charge, remarks, supplier_name,id, images, Office_id))
    {
        ct.Stocks();
        JOptionPane.showMessageDialog(null, "UPDATE SUCCESSFULLY","",JOptionPane.INFORMATION_MESSAGE);
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

    private void View_Office_DisplayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_View_Office_DisplayAncestorAdded
    String Banner = View_Office_Display.getText();
    String id = Webpage.Stock_Category_Id.getText();
    
    if(Banner.equals("VIEW OFFICE ITEM"))
    {
        try{
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `summary_stock` WHERE `ID` = '"+id+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Office_id = rs.getString("ID");
            View_Office_date.setText(rs.getString("DATE RECEIVED"));
            View_Office_Category.setText(rs.getString("CATEGORY"));
            View_Office_Brand.setText(rs.getString("BRAND"));
            View_Office_Type.setSelectedItem(rs.getString("TYPE"));
            View_Office_Price.setText(rs.getString("SELLER PRICE"));
            View_Office_quantity.setText(rs.getString("QUANTITY"));
            View_Office_Remarks.setText(rs.getString("REMARKS"));
            View_Office_Incharges.setText(rs.getString("PERSON IN CHARGE"));
            
            images = rs.getBytes("IMAGE");
            ImageIcon imageicon = new ImageIcon (new ImageIcon(images).getImage().getScaledInstance(View_Office_pic.getWidth(), View_Office_pic.getHeight(),Image.SCALE_SMOOTH) );
            View_Office_pic.setIcon(imageicon);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        

    }
    }//GEN-LAST:event_View_Office_DisplayAncestorAdded

    private void View_Office_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_Office_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_View_Office_PriceActionPerformed

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
            java.util.logging.Logger.getLogger(View_Office.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Office.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Office.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Office.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Office().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    public static javax.swing.JLabel Path;
    private javax.swing.JLabel Stock_Genset_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Update;
    private javax.swing.JLabel Stock_Genset_Update;
    public static javax.swing.JTextField View_Office_Brand;
    public static javax.swing.JTextField View_Office_Category;
    public static javax.swing.JLabel View_Office_Display;
    public static javax.swing.JTextField View_Office_Incharges;
    public static javax.swing.JTextField View_Office_Price;
    public static javax.swing.JTextField View_Office_Remarks;
    public static javax.swing.JComboBox<String> View_Office_Type;
    public static datechooser.beans.DateChooserCombo View_Office_date;
    public static javax.swing.JLabel View_Office_pic;
    public static javax.swing.JTextField View_Office_quantity;
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
