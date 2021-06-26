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
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Sales_Warehouse extends javax.swing.JFrame {
    String filename = null;
    public static byte[] images = null;
    String Warehouse_id =null;
    public static String wh_id = null;
    String Supplier_id = null;
    String totalQuantity = null;
    public Sales_Warehouse() {
        initComponents();
        imgisNull();
        showDate();
        
    }
    
    void showDate(){
            Date today = new Date();

            SimpleDateFormat date = new SimpleDateFormat("MM/dd/yy");
            View_Wh_dateReleased.setText(date.format(today)); 
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
        View_Wh_quantity = new javax.swing.JTextField();
        View_Wh_Type = new javax.swing.JTextField();
        View_Wh_Brand = new javax.swing.JTextField();
        View_Wh_price = new javax.swing.JTextField();
        View_Wh_totalprice = new javax.swing.JTextField();
        Stock_Genset_Panel_Update = new javax.swing.JPanel();
        Stock_Genset_Update = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        Stock_Genset_Back = new javax.swing.JLabel();
        View_Wh_pic = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        View_Parts_Quantity = new javax.swing.JTextField();
        View_Wh_Category1 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        w_tp = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        View_Wh_dateReleased = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 51, 74));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        View_WH_Display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        View_WH_Display.setForeground(new java.awt.Color(255, 255, 255));
        View_WH_Display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_WH_Display.setText("WAREHOUSE");
        View_WH_Display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                View_WH_DisplayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(View_WH_Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 470, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 100));

        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        View_Wh_quantity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Wh_quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Wh_quantity.setBorder(null);
        View_Wh_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                View_Wh_quantityKeyReleased(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Wh_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 210, 31));

        View_Wh_Type.setEditable(false);
        View_Wh_Type.setBackground(new java.awt.Color(204, 204, 204));
        View_Wh_Type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Wh_Type.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Wh_Type.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Wh_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 210, 31));

        View_Wh_Brand.setEditable(false);
        View_Wh_Brand.setBackground(new java.awt.Color(204, 204, 204));
        View_Wh_Brand.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Wh_Brand.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Wh_Brand.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Wh_Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 210, 31));

        View_Wh_price.setEditable(false);
        View_Wh_price.setBackground(new java.awt.Color(204, 204, 204));
        View_Wh_price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Wh_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Wh_price.setBorder(null);
        View_Wh_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_Wh_priceActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Wh_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 210, 31));

        View_Wh_totalprice.setBackground(new java.awt.Color(204, 204, 204));
        View_Wh_totalprice.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Wh_totalprice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Wh_totalprice.setBorder(null);
        View_Wh_totalprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_Wh_totalpriceActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Wh_totalprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 210, 31));

        Stock_Genset_Panel_Update.setBackground(new java.awt.Color(51, 187, 255));

        Stock_Genset_Update.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Update.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Save.png"))); // NOI18N
        Stock_Genset_Update.setText(" ADD CART");
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

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 160, 45));

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
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_BackLayout.setVerticalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 160, 45));

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
        KG2_ADD_STOCK_GENSET.add(View_Wh_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 280, 180));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField6.setText("    AVAILABLE STOCK  :");
        jTextField6.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 180, 30));

        View_Parts_Quantity.setEditable(false);
        View_Parts_Quantity.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        View_Parts_Quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Parts_Quantity.setText("0");
        View_Parts_Quantity.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Parts_Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 210, 30));

        View_Wh_Category1.setEditable(false);
        View_Wh_Category1.setBackground(new java.awt.Color(204, 204, 204));
        View_Wh_Category1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Wh_Category1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Wh_Category1.setText("WAREHOUSE");
        View_Wh_Category1.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Wh_Category1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 210, 31));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 128, 128));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setText("  CATEGORY");
        jTextField1.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 140, 30));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 128, 128));
        jTextField3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField3.setText("  DESCRPTION");
        jTextField3.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 140, 30));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(255, 128, 128));
        jTextField8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField8.setText("  TYPE");
        jTextField8.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 140, 30));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(255, 128, 128));
        jTextField7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField7.setText("  PRICE");
        jTextField7.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 140, 30));

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(255, 128, 128));
        jTextField9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField9.setText("  QUANTITY");
        jTextField9.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 140, 30));

        w_tp.setEditable(false);
        w_tp.setBackground(new java.awt.Color(255, 128, 128));
        w_tp.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        w_tp.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        w_tp.setText("  TOTAL PRICE");
        w_tp.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(w_tp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 140, 30));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 128, 128));
        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setText("  DATE RELEASED");
        jTextField2.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 140, 30));

        View_Wh_dateReleased.setEditable(false);
        View_Wh_dateReleased.setBackground(new java.awt.Color(204, 204, 204));
        View_Wh_dateReleased.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Wh_dateReleased.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Wh_dateReleased.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Wh_dateReleased, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 210, 30));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 750, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Stock_Genset_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseClicked
    
    String Banner = View_WH_Display.getText();
    
    if(Banner.equals("WAREHOUSE")){
        String date = View_Wh_dateReleased.getText();
        String category = View_Wh_Type.getText();
        String brand = View_Wh_Brand.getText();
        String type = View_Wh_Type.getText();
        String seller_price = View_Wh_price.getText();
        String quantity = View_Wh_quantity.getText();
        String remarks = View_Wh_totalprice.getText();
        //String person_in_charge="";

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

        if(!Class_SummaryStock.UpdateStock(date, category, brand, model, kva, phasing, type, supplier_price, seller_price, engine_sn, alternator_sn, quantity, remarks, supplier_name,id, images, kva))
        {
            JOptionPane.showMessageDialog(null, "SUCCESSFULY ADDED","",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "TRY AGAIN","",JOptionPane.ERROR_MESSAGE);
        }        
    }
    
        if(Banner.equals("REQUEST WAREHOUSE")){



            String quantity = View_Wh_quantity.getText();
            String remarks = View_Wh_totalprice.getText();

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
            
            
            String date_release = View_Wh_dateReleased.getText();

            String category = View_Wh_Type.getText().toUpperCase(); 
            String brand = View_Wh_Brand.getText().toUpperCase();

            String type = View_Wh_Type.getText().toUpperCase(); 

            String person_in_charge = View_Wh_totalprice.getText();
            String seller_price = View_Wh_price.getText().toUpperCase(); 


            
            int originalQuantity = 0;
            originalQuantity = Integer.parseInt(View_Parts_Quantity.getText().toString());

            String supplier_id = Supplier_id;
            String customer_id = "";

            String stock_id1 = Warehouse_id;    
            String status = "DONE";
            String process_id = Integer.toString(Class_Cart.process) ;

            //total price
            String total_price = "0";


            // OR NO and  quotation
            String orno = "REQUEST";
            String quoataion = "REQUEST";
            String completed = "";
            int getNowQuantity = Integer.parseInt(View_Wh_quantity.getText());
            String reqQuantity = Integer.toString(getNowQuantity);

            int result = Integer.parseInt(View_Parts_Quantity.getText()) - Integer.parseInt(View_Wh_quantity.getText());
            int validQuantity = Integer.parseInt(View_Wh_quantity.getText()); 

                if( result + 1 <= validQuantity  ){
                    JOptionPane.showMessageDialog(null, "INVALID QUANTITY","",JOptionPane.INFORMATION_MESSAGE);
                }
                else if(View_Wh_totalprice.equals("")){
                    JOptionPane.showMessageDialog(null, "EMPTY FIELDS","",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    if(!Class_Cart.InsertCart(date_release, category, brand, model, kva, phasing, type, supplier_price, seller_price, engine_sn, alternator_sn, reqQuantity, Integer.parseInt(total_price),person_in_charge,supplier_id, customer_id, stock_id1, images, quoataion ,orno,completed,status, process_id) && !Class_SummaryStock.UpdateQuantity(Integer.toString(result), stock_id1)){
                            JOptionPane.showMessageDialog(null, "SUCCESSFULLY REQUEST","",JOptionPane.INFORMATION_MESSAGE);
                            Class_Cart.addCart();
                            new Class_tables().Cart();
                            new Class_tables().Stocks();
                            new Class_tables().Sales_OW();
                            dispose();
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
        String wh_id = Webpage.request_id;
     if(Banner.equals("REQUEST WAREHOUSE")){
            try{
                PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `summary_stock` WHERE `ID` = '"+wh_id+"'");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                Warehouse_id = ""+rs.getInt("ID");    
                View_Wh_dateReleased.setText(rs.getString("DATE RECEIVED"));
                View_Wh_Category1.setText(rs.getString("CATEGORY"));
                Supplier_id = rs.getString("SUPPLIER ID");
                View_Wh_Brand.setText(rs.getString("BRAND"));
                View_Parts_Quantity.setText(rs.getString("QUANTITY"));
                View_Wh_Brand.setText(rs.getString("BRAND"));
                View_Wh_Type.setText(rs.getString("TYPE"));
                View_Wh_price.setText(rs.getString("SELLER PRICE"));
                totalQuantity = rs.getString("QUANTITY");
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

    private void View_Wh_quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_View_Wh_quantityKeyReleased
        String Banner = View_WH_Display.getText();
        
        if(Banner.equals("WAREHOUSE")){
            try{
                String number  = View_Wh_quantity.getText() ;
                int result = Integer.parseInt(View_Wh_quantity.getText().toString()) * Integer.parseInt(View_Parts_Quantity.getText().toString());
                View_Wh_totalprice.setText(""+result);
            }
            catch(NumberFormatException  e){
               View_Wh_quantity.setText("");
               
            }
        }

        if(Banner.equals("REQUEST WAREHOUSE")){
            try{
                String number  = View_Wh_quantity.getText() ;
                int result = Integer.parseInt(View_Wh_quantity.getText().toString());
                Integer.toString(result);
            }
            catch(NumberFormatException  e){
               View_Wh_quantity.setText("");
               
            }
        }
    }//GEN-LAST:event_View_Wh_quantityKeyReleased

    private void View_Wh_totalpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_Wh_totalpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_View_Wh_totalpriceActionPerformed

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
            java.util.logging.Logger.getLogger(Sales_Warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales_Warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales_Warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales_Warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Sales_Warehouse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    private javax.swing.JLabel Stock_Genset_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Update;
    public static javax.swing.JLabel Stock_Genset_Update;
    public static javax.swing.JTextField View_Parts_Quantity;
    public static javax.swing.JLabel View_WH_Display;
    public static javax.swing.JTextField View_Wh_Brand;
    public static javax.swing.JTextField View_Wh_Category1;
    public static javax.swing.JTextField View_Wh_Type;
    public static javax.swing.JTextField View_Wh_dateReleased;
    public static javax.swing.JLabel View_Wh_pic;
    public static javax.swing.JTextField View_Wh_price;
    public static javax.swing.JTextField View_Wh_quantity;
    public static javax.swing.JTextField View_Wh_totalprice;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    public static javax.swing.JTextField w_tp;
    // End of variables declaration//GEN-END:variables
}
