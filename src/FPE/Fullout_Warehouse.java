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

public class Fullout_Warehouse extends javax.swing.JFrame {
    String filename = null;
    public static byte[] images = null;
    String Warehouse_id =null;
    
    String remarks = "";
    String incharge = "";

     
   //----FOR UPDATE----------------------------------------
    int Update_Sale_quantity ;
    int Update_Sale_total_price;
    
    // ----FOR STOCK----------------------------------------
    int Update_Stock_quantity ;
    int Update_Stock_total_price;
    
    // ----FOR STOCK RETURN----------------------------------------
    int Update_Stock_quantity_return;
    int Update_Stock_total_price_return;
    
    //----FOR SALE------------------------------------------
    int parts_quant ;
    //--------
    int Sale_price;
    int Sale_quantity ;
    int Sale_total;
   
    int stock_ids;
    int sale_ids; 
    
    public Fullout_Warehouse() {
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
        fullout_display = new javax.swing.JLabel();
        KG2_ADD_STOCK_GENSET = new keeptoo.KGradientPanel();
        Sale_Wh_available_stock = new javax.swing.JTextField();
        Sale_Wh_category = new javax.swing.JTextField();
        Sale_Wh_brand = new javax.swing.JTextField();
        Sale_Wh_price = new javax.swing.JTextField();
        Sale_Wh_quantity = new javax.swing.JTextField();
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
        Sale_Wh_pic = new javax.swing.JLabel();
        Sale_Wh_total_price = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        Sale_Wh_type = new javax.swing.JTextField();
        Sale_Wh_inbound_date = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 71, 94));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fullout_display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        fullout_display.setForeground(new java.awt.Color(255, 255, 255));
        fullout_display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fullout_display.setText("FULLOUT WAREHOUSE");
        fullout_display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                fullout_displayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(fullout_display, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 340, 100));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 130));

        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sale_Wh_available_stock.setEditable(false);
        Sale_Wh_available_stock.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Wh_available_stock.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Wh_available_stock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Wh_available_stock.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sale_Wh_available_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 210, 31));

        Sale_Wh_category.setEditable(false);
        Sale_Wh_category.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Wh_category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Wh_category.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Wh_category.setText("WAREHOUSE");
        Sale_Wh_category.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sale_Wh_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 210, 31));

        Sale_Wh_brand.setEditable(false);
        Sale_Wh_brand.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Wh_brand.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Wh_brand.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Wh_brand.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sale_Wh_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 210, 31));

        Sale_Wh_price.setEditable(false);
        Sale_Wh_price.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Wh_price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Wh_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Wh_price.setBorder(null);
        Sale_Wh_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sale_Wh_priceActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Sale_Wh_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 210, 31));

        Sale_Wh_quantity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Wh_quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Wh_quantity.setBorder(null);
        Sale_Wh_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Sale_Wh_quantityKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Sale_Wh_quantityKeyTyped(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Sale_Wh_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 210, 31));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(214, 110, 92));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setText(" CATEGORY");
        jTextField1.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 160, 31));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(214, 110, 92));
        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setText(" DATE RECIEVED");
        jTextField2.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 160, 31));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(214, 110, 92));
        jTextField3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField3.setText(" DESCRPTION");
        jTextField3.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 160, 31));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(255, 255, 102));
        jTextField5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField5.setText(" AVAILABLE STOCK ");
        jTextField5.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 160, 31));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(214, 110, 92));
        jTextField7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField7.setText(" PRICE");
        jTextField7.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 160, 31));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(214, 110, 92));
        jTextField8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField8.setText(" TYPE");
        jTextField8.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 160, 31));

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(214, 110, 92));
        jTextField14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(255, 255, 255));
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField14.setText(" QUANTITY");
        jTextField14.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 160, 31));

        Stock_Genset_Panel_Update.setBackground(new java.awt.Color(144, 30, 29));

        Stock_Genset_Update.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Stock_Genset_Update.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Save.png"))); // NOI18N
        Stock_Genset_Update.setText(" FULL OUT");
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
            .addComponent(Stock_Genset_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_UpdateLayout.setVerticalGroup(
            Stock_Genset_Panel_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 180, 45));

        Stock_Genset_Panel_Back.setBackground(new java.awt.Color(185, 144, 149));

        Stock_Genset_Back.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
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
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_BackLayout.setVerticalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 140, 45));

        Sale_Wh_pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Sale_Wh_pic.setForeground(new java.awt.Color(20, 31, 31));
        Sale_Wh_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sale_Wh_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Default_Imge.png"))); // NOI18N
        Sale_Wh_pic.setAlignmentY(1.0F);
        Sale_Wh_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)));
        Sale_Wh_pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sale_Wh_picMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Sale_Wh_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 280, 180));

        Sale_Wh_total_price.setEditable(false);
        Sale_Wh_total_price.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Wh_total_price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Wh_total_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Wh_total_price.setBorder(null);
        Sale_Wh_total_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Sale_Wh_total_priceKeyReleased(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Sale_Wh_total_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 210, 31));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(214, 110, 92));
        jTextField6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField6.setText(" TOTAL PRICE");
        jTextField6.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 160, 31));

        Sale_Wh_type.setEditable(false);
        Sale_Wh_type.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Wh_type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Wh_type.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Wh_type.setBorder(null);
        Sale_Wh_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sale_Wh_typeActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Sale_Wh_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 210, 31));

        Sale_Wh_inbound_date.setEditable(false);
        Sale_Wh_inbound_date.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Wh_inbound_date.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Wh_inbound_date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Wh_inbound_date.setBorder(null);
        Sale_Wh_inbound_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sale_Wh_inbound_dateActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Sale_Wh_inbound_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 210, 31));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 750, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Sale_Wh_picMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sale_Wh_picMouseClicked
        Sale_Wh_pic.setText(null);
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        

        ImageIcon imageicon = new ImageIcon (new ImageIcon(filename).getImage().getScaledInstance(Sale_Wh_pic.getWidth(), Sale_Wh_pic.getHeight(),Image.SCALE_SMOOTH) );
        Sale_Wh_pic.setIcon(imageicon);

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
    }//GEN-LAST:event_Sale_Wh_picMouseClicked

    private void Stock_Genset_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseClicked
    String btn = Stock_Genset_Update.getText();
    String category = Sale_Wh_category.getText().toUpperCase();
    String brand = Sale_Wh_brand.getText();
    String model= "";
    String kva = "";
    String phasing = "";
    String type = Sale_Wh_type.getText().toUpperCase();
    String supplier_price = "";
    String seller_price = Sale_Wh_price.getText().toUpperCase();
    String quantity = Sale_Wh_quantity.getText();
    int total_price = Integer.parseInt(Sale_Wh_total_price.getText());
    
    
    String engine_sn = "";
    String alternator_sn = "";
    String customer_id ="";
     String supplier_id ="";
    String date_inbound = Sale_Wh_inbound_date.getText().toUpperCase();
    // image
    //String incharge = "";
    //String remarks ="";
    String supplier = "";
    
    String date_outbound = "";
    String verify = "";
    String process = ""; 
    String project = "";
    
 if(quantity.equals("") && total_price == 0)
    {
        JOptionPane.showMessageDialog(null, "FILL SOME BLANCK","",JOptionPane.ERROR_MESSAGE);
    }     
    else if(btn.equals(" FULL OUT"))
        {
          
            if(stock_ids == sale_ids )
               
            {
     
                if(!Class_Amount.FulloutUpdateQuantityAndTotal(""+Update_Sale_quantity, Update_Sale_total_price, Warehouse_id) && !Class_Amount.HistoryUpdateQuantityAndTotal(""+Update_Sale_quantity, Update_Sale_total_price, Warehouse_id) && !Class_Amount.StockUpdateQuantityAndTotal(""+Update_Stock_quantity, Update_Stock_total_price, Warehouse_id))
                    {
                        System.out.print(""+Update_Sale_quantity);
                        System.out.print(Update_Sale_total_price);
                        JOptionPane.showMessageDialog(null, " CHECK OUT ADDED !");Webpage.Refresh();  dispose();
                    }
                
            }
           else if(!Class_fullout.InsertFullout(Warehouse_id, category, brand, type, supplier_price, seller_price,""+ Update_Sale_quantity, Update_Sale_total_price, supplier_id, date_inbound, date_outbound, images, incharge, remarks, process, verify) && !Class_History.InsertHistory(Warehouse_id, category, brand, model, kva, phasing, type, supplier_price, seller_price, quantity, total_price, engine_sn, alternator_sn, supplier_id, customer_id, date_inbound, date_outbound, images, incharge, remarks, process, verify, project) && !Class_Amount.StockUpdateQuantityAndTotal(""+Update_Stock_quantity, Update_Stock_total_price, Warehouse_id))
                    {
                        JOptionPane.showMessageDialog(null, " CHECK OUT SUCCESS !");Webpage.Refresh();  dispose();
                    }
    
        }         

             else if(btn.equals(" REMOVE"))
        {
        
        
                if(!Class_Amount.FulloutUpdateQuantityAndTotal(""+Update_Stock_quantity, Update_Stock_total_price, Warehouse_id) && !Class_Amount.HistoryUpdateQuantityAndTotal(""+Update_Stock_quantity, Update_Stock_total_price, Warehouse_id) && !Class_Amount.StockUpdateQuantityAndTotal(""+Update_Stock_quantity_return, Update_Stock_total_price_return, Warehouse_id))
                    {
                        System.out.print(""+Update_Stock_quantity);
                        System.out.print(Update_Stock_total_price);
                        JOptionPane.showMessageDialog(null, " SUCCESSFULY REMOVE !");Webpage.Refresh();  dispose();
                    
                if(Update_Stock_quantity == 0)
                    {
                        if(!Class_Amount.HistoryDelete(Warehouse_id) &&  !Class_Amount.FulloutDelete(Warehouse_id )){
                            Webpage.Refresh();  dispose();
                        }
                    }
                    }
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
    ct.Stock();
    Webpage.Stock_cat = null;
    dispose();
    }//GEN-LAST:event_Stock_Genset_BackMouseClicked

    private void Stock_Genset_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseEntered
     
        Stock_Genset_Panel_Back.setBackground(new Color(255,214,102));
    }//GEN-LAST:event_Stock_Genset_BackMouseEntered

    private void Stock_Genset_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseExited
   
        Stock_Genset_Panel_Back.setBackground(new Color(255,194,102));
    }//GEN-LAST:event_Stock_Genset_BackMouseExited

    private void fullout_displayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_fullout_displayAncestorAdded
    String Banner = fullout_display.getText();
    
    System.out.print("FULLOUT WAREHOUSE");
    if(Banner.equals("FULLOUT WAREHOUSE"))
    {
        String ids = Webpage.stock_id;
        try{
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `stock_table` WHERE `STOCK ID` ='"+ids+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Warehouse_id = rs.getString("STOCK ID");
            stock_ids = Integer.parseInt(""+Warehouse_id);
            Sale_Wh_inbound_date.setText(rs.getString("DATE INBOUND"));
            Sale_Wh_category.setText(rs.getString("CATEGORY"));
            Sale_Wh_brand.setText(rs.getString("BRAND"));
            Sale_Wh_type.setText("TYPE");
            Sale_Wh_price.setText(rs.getString("SELLER PRICE"));
            Sale_Wh_available_stock.setText(rs.getString("QUANTITY"));
            
            remarks =rs.getString("REMARKS");
            incharge = rs.getString("INCHARGE");
            
            images = rs.getBytes("IMAGE");
            ImageIcon imageicon = new ImageIcon (new ImageIcon(images).getImage().getScaledInstance(Sale_Wh_pic.getWidth(), Sale_Wh_pic.getHeight(),Image.SCALE_SMOOTH) );
            Sale_Wh_pic.setIcon(imageicon);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
         try{
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`,`QUANTITY` FROM `fullout` WHERE `STOCK ID`='"+ids+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
          
            sale_ids = rs.getInt("STOCK ID");
            parts_quant = rs.getInt("QUANTITY");
            System.out.println(""+sale_ids);
            System.out.println(""+parts_quant);
            
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
                 
    }
    
    else if(Banner.equals(" REMOVE WAREHOUSE"))
    {
        String ids = Webpage.fullout_id;
        try{
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `fullout` WHERE `STOCK ID` ='"+ids+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Warehouse_id = rs.getString("STOCK ID");
            
            Sale_Wh_inbound_date.setText(rs.getString("DATE INBOUND"));
            Sale_Wh_category.setText(rs.getString("CATEGORY"));
            Sale_Wh_brand.setText(rs.getString("BRAND"));
            Sale_Wh_type.setText("TYPE");
            Sale_Wh_price.setText(rs.getString("SELLER PRICE"));
            Sale_Wh_available_stock.setText(rs.getString("QUANTITY"));
            Sale_Wh_total_price.setText(rs.getString("TOTAL PRICE"));
            remarks =rs.getString("REMARKS");
            incharge = rs.getString("INCHARGE");
            
            images = rs.getBytes("IMAGE");
            ImageIcon imageicon = new ImageIcon (new ImageIcon(images).getImage().getScaledInstance(Sale_Wh_pic.getWidth(), Sale_Wh_pic.getHeight(),Image.SCALE_SMOOTH) );
            Sale_Wh_pic.setIcon(imageicon);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
                 try{
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`,`QUANTITY` FROM `stock_table` WHERE `STOCK ID`='"+ids+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
          
            sale_ids = rs.getInt("STOCK ID");
            parts_quant = rs.getInt("QUANTITY");
            System.out.println(""+sale_ids);
            System.out.println(""+parts_quant);
            
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
                 
    }
    }//GEN-LAST:event_fullout_displayAncestorAdded

    private void Sale_Wh_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sale_Wh_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sale_Wh_priceActionPerformed

    private void Sale_Wh_total_priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Sale_Wh_total_priceKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Sale_Wh_total_priceKeyReleased

    private void Sale_Wh_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sale_Wh_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sale_Wh_typeActionPerformed

    private void Sale_Wh_inbound_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sale_Wh_inbound_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sale_Wh_inbound_dateActionPerformed

    private void Sale_Wh_quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Sale_Wh_quantityKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_Sale_Wh_quantityKeyTyped

    private void Sale_Wh_quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Sale_Wh_quantityKeyReleased
       int price = 0,total = 0;
       price = Integer.parseInt(Sale_Wh_price.getText());
       
       String q = Sale_Wh_quantity.getText();
       if(q.equals(""))
            {
             total = price * 0;      
             Sale_Wh_total_price.setText(""+total);
            }   
      else
       {
          Sale_price =  Integer.parseInt(Sale_Wh_price.getText());
          Sale_quantity = Integer.parseInt(Sale_Wh_quantity.getText());
          Sale_total = Sale_quantity * Sale_price;
          Sale_Wh_total_price.setText(""+Sale_total);
          System.out.println("FOR ADD");
          System.out.println(""+Sale_quantity);
          System.out.println(""+Sale_total);
          System.out.println("\n \n");
          int Sale_avail = Integer.parseInt(Sale_Wh_available_stock.getText());

          System.out.println("FOR ADD CHECKOUT");
          Update_Sale_quantity = parts_quant + Sale_quantity;
          Update_Sale_total_price = Update_Sale_quantity * Sale_price;
          System.out.println(""+Update_Sale_quantity);
          System.out.println(""+Update_Sale_total_price);
          System.out.println("\n \n");
          
          System.out.println("FOR UPDATE STOCK");
          Update_Stock_quantity = Sale_avail - Sale_quantity;
          Update_Stock_total_price = Update_Stock_quantity * Sale_price;
          System.out.println(""+Update_Stock_quantity);
          System.out.println(""+Update_Stock_total_price);
          System.out.println("\n \n");
          
          Update_Stock_quantity_return = parts_quant + Sale_quantity;
          Update_Stock_total_price_return = Update_Stock_quantity_return * Sale_price;
          System.out.println(""+Update_Stock_quantity_return);
          System.out.println(""+Update_Stock_total_price_return);
          System.out.println("\n \n");System.out.println("\n \n");
  
       }
    }//GEN-LAST:event_Sale_Wh_quantityKeyReleased

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
            java.util.logging.Logger.getLogger(Fullout_Warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fullout_Warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fullout_Warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fullout_Warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fullout_Warehouse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    public static javax.swing.JTextField Sale_Wh_available_stock;
    public static javax.swing.JTextField Sale_Wh_brand;
    public static javax.swing.JTextField Sale_Wh_category;
    public static javax.swing.JTextField Sale_Wh_inbound_date;
    public static javax.swing.JLabel Sale_Wh_pic;
    public static javax.swing.JTextField Sale_Wh_price;
    public static javax.swing.JTextField Sale_Wh_quantity;
    public static javax.swing.JTextField Sale_Wh_total_price;
    public static javax.swing.JTextField Sale_Wh_type;
    private javax.swing.JLabel Stock_Genset_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Update;
    public static javax.swing.JLabel Stock_Genset_Update;
    public static javax.swing.JLabel fullout_display;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
