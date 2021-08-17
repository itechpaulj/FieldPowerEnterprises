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
public class Fullout_Office extends javax.swing.JFrame {
    String filename = null;
    String Office_id = null;
    public static byte[] images = null;
    
    String incharge="";
    String remarks="";

   int process_no;
   int price;
   int quantity;
   int avail;
   
   int chectout_quantity,chectout_total_price;  
   
   // UPDATE THE QUANTITY Of STOCK 
   
   int update_stock_quantity,update_stock_total_price;
    
    int Sale_price;
    int Sale_quantity ;
    int Sale_total;
    
   //----------------------------------------------------------------------------
    int sale_ids ;
    int stock_ids;
    int parts_quant ;
    
    public Fullout_Office() {
        initComponents();
        imgisNull();
        Path.setVisible(false);
        Webpage.cc.ProcessFulloutt();
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
        Sale_Office_pic = new javax.swing.JLabel();
        Stock_Genset_Panel_Update = new javax.swing.JPanel();
        Stock_Genset_Update = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        Stock_Genset_Back = new javax.swing.JLabel();
        Path = new javax.swing.JLabel();
        Sale_Office_available_stock = new javax.swing.JTextField();
        Sale_Office_category = new javax.swing.JTextField();
        Sale_Office_brand = new javax.swing.JTextField();
        Sale_Office_price = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        Sale_Office_total_price = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        Sale_Office_quantity = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        Sale_Office_inbound_date = new javax.swing.JTextField();
        Sale_Office_type = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 71, 94));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fullout_display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        fullout_display.setForeground(new java.awt.Color(255, 255, 255));
        fullout_display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fullout_display.setText("FULLOUT OFFICE");
        fullout_display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                fullout_displayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(fullout_display, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 320, 110));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 130));

        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sale_Office_pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Sale_Office_pic.setForeground(new java.awt.Color(20, 31, 31));
        Sale_Office_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sale_Office_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Default_Imge.png"))); // NOI18N
        Sale_Office_pic.setAlignmentY(1.0F);
        Sale_Office_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)));
        Sale_Office_pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sale_Office_picMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Sale_Office_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 280, 180));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Stock_Genset_Panel_BackLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Stock_Genset_Panel_BackLayout.setVerticalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 140, 45));

        Path.setText("1");
        KG2_ADD_STOCK_GENSET.add(Path, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, 30, -1));

        Sale_Office_available_stock.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Office_available_stock.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Office_available_stock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Office_available_stock.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sale_Office_available_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 210, 31));

        Sale_Office_category.setEditable(false);
        Sale_Office_category.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Office_category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Office_category.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Office_category.setText("OFFICE");
        Sale_Office_category.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sale_Office_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 210, 31));

        Sale_Office_brand.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Office_brand.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Office_brand.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Office_brand.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sale_Office_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 210, 31));

        Sale_Office_price.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Office_price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Office_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Office_price.setBorder(null);
        Sale_Office_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sale_Office_priceActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Sale_Office_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 210, 31));

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
        jTextField3.setText(" DESCRIPTION");
        jTextField3.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 160, 31));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(255, 255, 102));
        jTextField5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField5.setText(" AVAILABLE STOCK");
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

        Sale_Office_total_price.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Office_total_price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Office_total_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Office_total_price.setBorder(null);
        Sale_Office_total_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Sale_Office_total_priceKeyReleased(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Sale_Office_total_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 210, 31));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(214, 110, 92));
        jTextField6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField6.setText(" TOTAL PRICE");
        jTextField6.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 160, 31));

        Sale_Office_quantity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Office_quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Office_quantity.setBorder(null);
        Sale_Office_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Sale_Office_quantityKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Sale_Office_quantityKeyTyped(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Sale_Office_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 210, 31));

        jTextField15.setEditable(false);
        jTextField15.setBackground(new java.awt.Color(214, 110, 92));
        jTextField15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(255, 255, 255));
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField15.setText(" QUANTITY");
        jTextField15.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 160, 31));

        Sale_Office_inbound_date.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Office_inbound_date.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Office_inbound_date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Office_inbound_date.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sale_Office_inbound_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 210, 31));

        Sale_Office_type.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Office_type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Office_type.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Office_type.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sale_Office_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 210, 31));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 750, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Sale_Office_picMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sale_Office_picMouseClicked
        Sale_Office_pic.setText(null);
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        

        ImageIcon imageicon = new ImageIcon (new ImageIcon(filename).getImage().getScaledInstance(Sale_Office_pic.getWidth(), Sale_Office_pic.getHeight(),Image.SCALE_SMOOTH) );
        Sale_Office_pic.setIcon(imageicon);

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
    }//GEN-LAST:event_Sale_Office_picMouseClicked

    private void Stock_Genset_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseClicked
    String btn = Stock_Genset_Update.getText();
    String category = Sale_Office_category.getText().toUpperCase();
    String brand = Sale_Office_brand.getText();
    String model= "";
    String kva = "";
    String phasing = "";
    String type = Sale_Office_type.getText().toUpperCase();
    String supplier_price = "";
    String seller_price = Sale_Office_price.getText().toUpperCase();
    String quantity = Sale_Office_quantity.getText();
    
    
    
    String engine_sn = "";
    String alternator_sn = "";
    
    String supplier_id ="";
    String customer_id="";
    String date_inbound = Sale_Office_inbound_date.getText().toUpperCase();
    // image
    //String incharge = "";
    //String remarks = "";
    String supplier = "";
    
    String date_outbound = "";
    String verify = "";
    String proces = Integer.toString(Webpage.cc.process_fullout); 
    String project = "";
    String action = "FULLOUT";
            
    int aq = avail;
    int q = Integer.parseInt(quantity);
    
    if(quantity.equals(""))
        {
            JOptionPane.showMessageDialog(null, "FILL SOME BLANCK","",JOptionPane.ERROR_MESSAGE);
        }
     else if(aq < q)
        {
            JOptionPane.showMessageDialog(null, "THE QUANTITY ENTERED IS TO MUCH!!","",JOptionPane.ERROR_MESSAGE);
        }
     
    else if(btn.equals(" FULL OUT"))
        {
            if(stock_ids == sale_ids )
            {
     
              if(!Class_Amount.FulloutUpdateQuantityAndTotal(""+chectout_quantity, chectout_total_price, Office_id) && !Class_Amount.HistoryUpdateforFullout(""+chectout_quantity, chectout_total_price, Office_id,process_no,verify) && !Class_Amount.StockUpdateQuantityAndTotal(""+update_stock_quantity, update_stock_total_price, Office_id))
                {
                    JOptionPane.showMessageDialog(null, " FULL OUT ADDED !");Webpage.Refresh();  dispose();
                }
              
            }
            
            else if(!Class_fullout.InsertFullout(Office_id, category, brand, type, supplier_price, seller_price, ""+chectout_quantity, chectout_total_price, supplier_id, date_inbound, date_outbound, images, incharge, remarks, proces, verify) && !Class_History.InsertHistory(Office_id, category, brand, model, kva, phasing, type, supplier_price, seller_price,""+chectout_quantity, chectout_total_price, engine_sn, alternator_sn, supplier_id, customer_id, date_inbound, date_outbound, images, incharge, remarks, proces, verify, project,action) && !Class_Amount.StockUpdateQuantityAndTotal(""+update_stock_quantity, update_stock_total_price, Office_id))
                {
                    JOptionPane.showMessageDialog(null, " FULL OUT SUCCESS !");Webpage.Refresh();  dispose();
                }
        }         
    
    
    else if(btn.equals(" REMOVE"))
        {
        
            if(!Class_Amount.FulloutUpdateQuantityAndTotal(""+update_stock_quantity, update_stock_total_price, Office_id) && !Class_Amount.HistoryUpdateforFullout(""+update_stock_quantity, update_stock_total_price, Office_id,process_no,verify) && !Class_Amount.StockUpdateQuantityAndTotal(""+chectout_quantity, chectout_total_price, Office_id))
                {
                    JOptionPane.showMessageDialog(null, " SUCCESSFULY REMOVE !");Webpage.Refresh();  dispose();
                }
            if(update_stock_quantity == 0)
                {
                    if(!Class_Amount.HistoryDelete(Office_id,process_no,verify) &&  !Class_Amount.FulloutDelete(Office_id )){
                        Webpage.Refresh();  dispose();
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
    
    
    if(Banner.equals("FULLOUT OFFICE"))
    {
        String ids = Webpage.stock_id;
        try{
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `stock_table` WHERE `STOCK ID` = '"+ids+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Office_id = rs.getString("STOCK ID");
            stock_ids = Integer.parseInt(Office_id);
            
            Sale_Office_inbound_date.setText(rs.getString("DATE INBOUND"));
            Sale_Office_category.setText(rs.getString("CATEGORY"));
            Sale_Office_brand.setText(rs.getString("BRAND"));
            Sale_Office_type.setText(rs.getString("TYPE"));
            Sale_Office_price.setText(rs.getString("SELLER PRICE"));
            Sale_Office_available_stock.setText(rs.getString("QUANTITY"));
            
            incharge = rs.getString("INCHARGE");
            remarks = rs.getString("REMARKS");
            
            images = rs.getBytes("IMAGE");
            ImageIcon imageicon = new ImageIcon (new ImageIcon(images).getImage().getScaledInstance(Sale_Office_pic.getWidth(), Sale_Office_pic.getHeight(),Image.SCALE_SMOOTH) );
            Sale_Office_pic.setIcon(imageicon);
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
            Sale_quantity = rs.getInt("QUANTITY");
            System.out.println(""+sale_ids);
            System.out.println(""+parts_quant);
            
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    if(Banner.equals(" REMOVE OFFICE"))
    {
        
        String ids = Webpage.fullout_id;
        try{
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `fullout` WHERE `STOCK ID` = '"+ids+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Office_id = rs.getString("STOCK ID");
            stock_ids = Integer.parseInt(Office_id);
            
            Sale_Office_inbound_date.setText(rs.getString("DATE INBOUND"));
            Sale_Office_category.setText(rs.getString("CATEGORY"));
            Sale_Office_brand.setText(rs.getString("BRAND"));
            Sale_Office_type.setText(rs.getString("TYPE"));
            Sale_Office_price.setText(rs.getString("SELLER PRICE"));
            jTextField5.setText(" ORDER QUANTITY");
            Sale_Office_available_stock.setText(rs.getString("QUANTITY"));
            Sale_Office_total_price.setText(rs.getString("TOTAL PRICE"));
           
            incharge = rs.getString("INCHARGE");
            remarks = rs.getString("REMARKS");
            
            images = rs.getBytes("IMAGE");
            ImageIcon imageicon = new ImageIcon (new ImageIcon(images).getImage().getScaledInstance(Sale_Office_pic.getWidth(), Sale_Office_pic.getHeight(),Image.SCALE_SMOOTH) );
            Sale_Office_pic.setIcon(imageicon);
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
            Sale_quantity = rs.getInt("QUANTITY");
            System.out.println(""+sale_ids);
            System.out.println(""+parts_quant);
            
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
    }//GEN-LAST:event_fullout_displayAncestorAdded

    private void Sale_Office_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sale_Office_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sale_Office_priceActionPerformed

    private void Sale_Office_total_priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Sale_Office_total_priceKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Sale_Office_total_priceKeyReleased

    private void Sale_Office_quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Sale_Office_quantityKeyReleased
       int quantity = 0,price = 0,total = 0;
       price = Integer.parseInt(Sale_Office_price.getText());
       
       String q = Sale_Office_quantity.getText();
       if(q.equals(""))
            {
             total = price * 0;      
             Sale_Office_total_price.setText(""+total);
            }
       else
       {
           
        price =  Integer.parseInt(Sale_Office_price.getText());
        quantity = Integer.parseInt(Sale_Office_quantity.getText());
        avail = Integer.parseInt(Sale_Office_available_stock.getText());
        
        // ADDING QUANTITY FOR SALE CART
        chectout_quantity = Sale_quantity + quantity ;
        chectout_total_price = price * chectout_quantity;
        Sale_Office_total_price.setText(""+chectout_total_price);
        System.out.println("TOTAL CHECK OUT ITEM ");
        System.out.println(""+chectout_quantity);
        System.out.println(""+chectout_total_price);
        System.out.println("\n");
        
        // UPDATE THE QUANTITY OF STOCK 
        update_stock_quantity = avail - quantity;
        update_stock_total_price = price * update_stock_quantity;
        System.out.println("UPDATE THE QUANTITY OF STOCK ");
        System.out.println(""+update_stock_quantity);
        System.out.println(""+update_stock_total_price);
        System.out.println("\n");
  
       }
       
    }//GEN-LAST:event_Sale_Office_quantityKeyReleased

    private void Sale_Office_quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Sale_Office_quantityKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_Sale_Office_quantityKeyTyped

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
            java.util.logging.Logger.getLogger(Fullout_Office.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fullout_Office.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fullout_Office.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fullout_Office.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fullout_Office().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    public static javax.swing.JLabel Path;
    public static javax.swing.JTextField Sale_Office_available_stock;
    public static javax.swing.JTextField Sale_Office_brand;
    public static javax.swing.JTextField Sale_Office_category;
    public static javax.swing.JTextField Sale_Office_inbound_date;
    public static javax.swing.JLabel Sale_Office_pic;
    public static javax.swing.JTextField Sale_Office_price;
    public static javax.swing.JTextField Sale_Office_quantity;
    public static javax.swing.JTextField Sale_Office_total_price;
    public static javax.swing.JTextField Sale_Office_type;
    private javax.swing.JLabel Stock_Genset_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Update;
    public static javax.swing.JLabel Stock_Genset_Update;
    public static javax.swing.JLabel fullout_display;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
