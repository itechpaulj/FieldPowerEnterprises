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

/**
 *
 * @author ROBLES
 */
public class Sales_Parts extends javax.swing.JFrame {
    String filename = null;
    
   
    
    
    public static byte[] images = null;
    public static String Supplier_id ;
    String original_quantity;
    String Parts_id = null;
    String date;
    String Supplier_price;
    String remarks;
    String supplier_name;
    String supplier_id;
    Class_Cart ct = new Class_Cart();
    //removed for cart
    public static String cart_id = null;
    String totalQuantity = null;
    
    //request
    String getRequest = "1";
    int requestQuantity = 0;
    public Sales_Parts() {
        initComponents();
        imgisNull();
        ct.addCart();
        showDate();

    }
    
    void showDate(){
            Date today = new Date();

            SimpleDateFormat date = new SimpleDateFormat("MM/dd/yy");
            View_Parts_dateReleased.setText(date.format(today)); 
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
        View_Parts_Display = new javax.swing.JLabel();
        KG2_ADD_STOCK_GENSET = new keeptoo.KGradientPanel();
        View_Parts_Pic = new javax.swing.JLabel();
        Stock_Genset_Panel_Update = new javax.swing.JPanel();
        Stock_Genset_Update = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        Stock_Genset_Back = new javax.swing.JLabel();
        Path = new javax.swing.JLabel();
        View_Parts_Category = new javax.swing.JTextField();
        View_Parts_Type = new javax.swing.JTextField();
        View_Parts_Price = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        View_Parts_Quantity = new javax.swing.JTextField();
        Quantity1 = new javax.swing.JTextField();
        tp_txt = new javax.swing.JTextField();
        Quantity = new javax.swing.JTextField();
        View_Parts_Brand1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        View_Parts_dateReleased = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 51, 74));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        View_Parts_Display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        View_Parts_Display.setForeground(new java.awt.Color(255, 255, 255));
        View_Parts_Display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Parts_Display.setText("PARTS");
        View_Parts_Display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                View_Parts_DisplayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(View_Parts_Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 470, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 100));

        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        View_Parts_Pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Parts_Pic.setForeground(new java.awt.Color(20, 31, 31));
        View_Parts_Pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Parts_Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Default_Imge.png"))); // NOI18N
        View_Parts_Pic.setAlignmentY(1.0F);
        View_Parts_Pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)));
        View_Parts_Pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                View_Parts_PicMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Parts_Pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 280, 180));

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

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 160, 45));

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

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 160, 45));

        Path.setText("1");
        KG2_ADD_STOCK_GENSET.add(Path, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, 30, -1));

        View_Parts_Category.setEditable(false);
        View_Parts_Category.setBackground(new java.awt.Color(204, 204, 204));
        View_Parts_Category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Parts_Category.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Parts_Category.setText("PARTS");
        View_Parts_Category.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Parts_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 210, 30));

        View_Parts_Type.setEditable(false);
        View_Parts_Type.setBackground(new java.awt.Color(204, 204, 204));
        View_Parts_Type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Parts_Type.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Parts_Type.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Parts_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 210, 30));

        View_Parts_Price.setEditable(false);
        View_Parts_Price.setBackground(new java.awt.Color(204, 204, 204));
        View_Parts_Price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Parts_Price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Parts_Price.setBorder(null);
        View_Parts_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_Parts_PriceActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Parts_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 210, 30));

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
        KG2_ADD_STOCK_GENSET.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 140, 30));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(255, 128, 128));
        jTextField7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField7.setText("  PRICE");
        jTextField7.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 140, 30));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(255, 128, 128));
        jTextField8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField8.setText("  TYPE");
        jTextField8.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 140, 30));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(255, 128, 128));
        jTextField6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField6.setText("  QUANTITY");
        jTextField6.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 140, 30));

        txtStock.setEditable(false);
        txtStock.setBackground(new java.awt.Color(255, 255, 255));
        txtStock.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        txtStock.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtStock.setText("    AVAILABLE STOCK  :");
        txtStock.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 180, 30));

        View_Parts_Quantity.setEditable(false);
        View_Parts_Quantity.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        View_Parts_Quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Parts_Quantity.setText("0");
        View_Parts_Quantity.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Parts_Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 210, 30));

        Quantity1.setEditable(false);
        Quantity1.setBackground(new java.awt.Color(204, 204, 204));
        Quantity1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Quantity1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Quantity1.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Quantity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 210, 30));

        tp_txt.setEditable(false);
        tp_txt.setBackground(new java.awt.Color(255, 128, 128));
        tp_txt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tp_txt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tp_txt.setText("  TOTAL PRICE");
        tp_txt.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(tp_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 140, 30));

        Quantity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                QuantityKeyReleased(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 210, 30));

        View_Parts_Brand1.setEditable(false);
        View_Parts_Brand1.setBackground(new java.awt.Color(204, 204, 204));
        View_Parts_Brand1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Parts_Brand1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Parts_Brand1.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Parts_Brand1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 210, 30));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 128, 128));
        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setText("  DATE RELEASED");
        jTextField2.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 140, 30));

        View_Parts_dateReleased.setEditable(false);
        View_Parts_dateReleased.setBackground(new java.awt.Color(204, 204, 204));
        View_Parts_dateReleased.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Parts_dateReleased.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Parts_dateReleased.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Parts_dateReleased, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 210, 30));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 750, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void View_Parts_PicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_Parts_PicMouseClicked
        View_Parts_Pic.setText(null);
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        

        ImageIcon imageicon = new ImageIcon (new ImageIcon(filename).getImage().getScaledInstance(View_Parts_Pic.getWidth(), View_Parts_Pic.getHeight(),Image.SCALE_SMOOTH) );
        View_Parts_Pic.setIcon(imageicon);

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
    }//GEN-LAST:event_View_Parts_PicMouseClicked

    private void Stock_Genset_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseClicked

    String Banner = View_Parts_Display.getText();
    if(Banner.equals("PARTS")){
        try{
            String date_release = View_Parts_dateReleased.getText();

            String category = View_Parts_Category.getText().toUpperCase(); 
            String brand = View_Parts_Type.getText().toUpperCase();
            String model="";
            String kva = "";
            String phasing ="";
            String type = View_Parts_Type.getText().toUpperCase(); 
            String supplier_price ="";
            String person_in_charge = "";
            String seller_price = View_Parts_Price.getText().toUpperCase(); 
            String engine_sn ="";
            String alternator_sn ="";

            int result = Integer.parseInt(View_Parts_Quantity.getText()) - Integer.parseInt(Quantity.getText());
            int originalQuantity = 0;
            originalQuantity = Integer.parseInt(View_Parts_Quantity.getText().toString());

            String supplier_id = Supplier_id;
            String customer_id = "";

            String stock_id1 = Parts_id;    
            String status = "";
            String process_id = Integer.toString(Class_Cart.process) ;

            //total price
            String total_price = Quantity1.getText();


            // OR NO and  quotation
            String orno = "";
            String quoataion = "";
                int inputQuantity = Integer.parseInt(Quantity.getText().toString());
                String validQuantity = Quantity.getText();
                if(validQuantity.equals("")){
                    JOptionPane.showMessageDialog(null, "ENTER QUANTITY!","",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    int plusOne = originalQuantity + 1;
                    int finalQuantity = Integer.parseInt(View_Parts_Quantity.getText()) - Integer.parseInt(Quantity.getText()) ;
                 //JOptionPane.showMessageDialog(null, "Good","",JOptionPane.INFORMATION_MESSAGE);
                 if(finalQuantity == 0){
                     JOptionPane.showMessageDialog(null, "NO STOCK AVAILABLE!","",JOptionPane.INFORMATION_MESSAGE);
                 }
                 else if (validQuantity.equals("0")){
                     JOptionPane.showMessageDialog(null, "INVALID QUANTITY","",JOptionPane.INFORMATION_MESSAGE);
                 }
                 else if(inputQuantity>=plusOne){
                         JOptionPane.showMessageDialog(null, "INVALID QUANTITY","",JOptionPane.INFORMATION_MESSAGE);
                 }
                 else{
                     //execute the code
                    // JOptionPane.showMessageDialog(null, ""+quantity,"",JOptionPane.INFORMATION_MESSAGE);

                    try{
                        PreparedStatement ps;
                        ResultSet rs;
                        ps = FPE_DB.getConnection().prepareStatement("SELECT `QUANTITY` FROM `add_cart` WHERE `STOCK ID`='"+Parts_id+"'");
                        rs = ps.executeQuery();
                        if(rs.next()){
                            //update
                            //JOptionPane.showMessageDialog(null, "Update","",JOptionPane.INFORMATION_MESSAGE);
                           if(!Class_Cart.summary_StockUpdateQuantity(Integer.toString(finalQuantity),Parts_id))
                           {
                                ps = FPE_DB.getConnection().prepareStatement("SELECT `QUANTITY`,`TOTAL PRICE` FROM `add_cart` WHERE `STOCK ID`='"+Parts_id+"'");
                                rs = ps.executeQuery();
                                    if(rs.next()){
                                        String currentQuantity = rs.getString("QUANTITY");
                                        int getCurrentPrice = rs.getInt("TOTAL PRICE");
                                        int update_totalPrice = getCurrentPrice + Integer.parseInt(Quantity1.getText());
                                        int getQuantity = Integer.parseInt(currentQuantity) + Integer.parseInt(Quantity.getText());
                                        String last = Integer.toString(getQuantity);

                                        if(!Class_Cart.existCartToUpdateQuantity(last,  update_totalPrice,Parts_id) && !Class_Cart.existSale_Summary_stockToUpdateQuantity(last,update_totalPrice,Parts_id)){
                                             JOptionPane.showMessageDialog(null, "SUCCESSFULLY ADD CART","",JOptionPane.INFORMATION_MESSAGE);
                                             Class_Cart.addCart();
                                             new Class_tables().Cart();
                                             new Class_tables().Stocks();
                                             new Class_tables().SalesStock();
                                             dispose();

                                        }
                                    }
                           }
                            //JOptionPane.showMessageDialog(null, ""+finalQuantity,"",JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            
                            String getNowQuantity = Integer.toString(inputQuantity);
                            if(!Class_Cart.InsertCart(date_release, category, brand, model, kva, phasing, type, supplier_price, seller_price, engine_sn, alternator_sn, getNowQuantity, Integer.parseInt(total_price),person_in_charge,supplier_id, customer_id, stock_id1, images, quoataion ,orno,status, process_id) && !Class_Cart.AddCart(date_release, category, brand, model, kva, phasing, type, supplier_price, seller_price, engine_sn, alternator_sn, getNowQuantity, Integer.parseInt(total_price),person_in_charge,supplier_id, customer_id, stock_id1, images, status, quoataion ,orno ,process_id) && !Class_SummaryStock.UpdateQuantity(Integer.toString(result), stock_id1)){
                                    JOptionPane.showMessageDialog(null, "SUCCESSFULLY ADD CART","",JOptionPane.INFORMATION_MESSAGE);
                                    Class_Cart.addCart();
                                    new Class_tables().Cart();
                                    new Class_tables().Stocks();
                                    new Class_tables().SalesStock();
                                    dispose();
                            }
                        }
                    }catch(Exception e){
                    e.printStackTrace();
                    }



                 }


                }

        }
        catch(NumberFormatException  e){
           // JOptionPane.showMessageDialog(null,"Please Enter","",JOptionPane.ERROR_MESSAGE);
        }        
    }


    // remove cart
    
    if(Banner.equals("REMOVED CART PARTS")){
        //JOptionPane.showMessageDialog(null, cart_id);
     String input_quantityRemoved = Quantity.getText();
     String stockRemoved = View_Parts_Quantity.getText();
     int result = Integer.parseInt(input_quantityRemoved) + Integer.parseInt(totalQuantity); // resultQuantity
     int resultCartOnlyQuantity = Integer.parseInt(stockRemoved) - Integer.parseInt(input_quantityRemoved);
     
     if(resultCartOnlyQuantity == 0){
         Class_Cart_Remove ccr = new Class_Cart_Remove();
         if(ccr.quantityCartIsZero(cart_id)){
            new Class_tables().Cart();
         }
     }
        if(input_quantityRemoved.equals("")){
            JOptionPane.showMessageDialog(null, "ENTER QUANTITY","",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(Integer.parseInt(stockRemoved) + 1  <= Integer.parseInt(input_quantityRemoved)){
           JOptionPane.showMessageDialog(null, "INVALID QUANTITY","",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            Class_Cart_Remove ccr = new Class_Cart_Remove();
             if(!ccr.Sales_Parts(Integer.toString(result), Integer.parseInt(cart_id)) && !ccr.Updatecart(Integer.toString(resultCartOnlyQuantity), cart_id) ){
                 new Class_tables().Cart();
                 new Class_tables().Stocks();
                 JOptionPane.showMessageDialog(null, "SUCCESSFULLY REMOVED","",JOptionPane.INFORMATION_MESSAGE);
                 dispose();
             }
        }
    }
    
    
    
    //request
    if(Banner.equals("REQUEST PARTS")){
            String date_release = View_Parts_dateReleased.getText();

            String category = View_Parts_Category.getText().toUpperCase(); 
            String brand = View_Parts_Type.getText().toUpperCase();
            String model="";
            String kva = "";
            String phasing ="";
            String type = View_Parts_Type.getText().toUpperCase(); 
            String supplier_price ="";
            String person_in_charge = Quantity1.getText();
            String seller_price = View_Parts_Price.getText().toUpperCase(); 
            String engine_sn ="";
            String alternator_sn ="";

            
            int originalQuantity = 0;
            originalQuantity = Integer.parseInt(View_Parts_Quantity.getText().toString());

            String supplier_id = Supplier_id;
            String customer_id = "";

            String stock_id1 = Parts_id;    
            String status = "DONE";
            String process_id = Integer.toString(Class_Cart.process) ;

            //total price
            String total_price = "0";


            // OR NO and  quotation
            String orno = "REQUEST";
            String quoataion = "REQUEST";
            
            int getNowQuantity = Integer.parseInt(Quantity.getText());
            String reqQuantity = Integer.toString(getNowQuantity);
            

            int result = Integer.parseInt(View_Parts_Quantity.getText()) - Integer.parseInt(Quantity.getText());
            int validQuantity = Integer.parseInt(Quantity.getText());
                if( result + 1 <= validQuantity  ){
                    JOptionPane.showMessageDialog(null, "INVALID QUANTITY","",JOptionPane.INFORMATION_MESSAGE);
                }
                else if(Quantity1.equals("")){
                    JOptionPane.showMessageDialog(null, "EMPTY FIELDS","",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    if(!Class_Cart.InsertCart(date_release, category, brand, model, kva, phasing, type, supplier_price, seller_price, engine_sn, alternator_sn, reqQuantity, Integer.parseInt(total_price),person_in_charge,supplier_id, customer_id, stock_id1, images, quoataion ,orno,status, process_id) && !Class_SummaryStock.UpdateQuantity(Integer.toString(result), stock_id1)){
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

    private void View_Parts_DisplayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_View_Parts_DisplayAncestorAdded
    String Banner = View_Parts_Display.getText();
    String ids = Webpage.sales_id;
    String removed_id = Webpage.cart_id;
    String request = Webpage.request_id;
    if(Banner.equals("PARTS"))
        {
            try{
                PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `summary_stock` WHERE `ID` = '"+ids+"'");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                Parts_id = ""+rs.getInt("ID");    
                Supplier_id = rs.getString("SUPPLIER ID");
                System.out.println(""+Parts_id);
                System.out.println(Supplier_id);
                date = rs.getString("DATE RECEIVED");
                View_Parts_Category.setText(rs.getString("CATEGORY"));
                Supplier_id = rs.getString("SUPPLIER ID");
                View_Parts_Type.setText(rs.getString("BRAND"));
                original_quantity = rs.getString("QUANTITY");
                View_Parts_Brand1.setText(rs.getString("BRAND"));
                View_Parts_Type.setText(rs.getString("TYPE"));
                View_Parts_Price.setText(rs.getString("SELLER PRICE"));
                View_Parts_Quantity.setText(rs.getString("QUANTITY"));
 


                images = rs.getBytes("IMAGE");
                ImageIcon imageicon = new ImageIcon (new ImageIcon(images).getImage().getScaledInstance(View_Parts_Pic.getWidth(), View_Parts_Pic.getHeight(),Image.SCALE_SMOOTH) );
                View_Parts_Pic.setIcon(imageicon);

                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    
     //removed
     if(Banner.equals("REMOVED CART PARTS")){
            try{
                PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `summary_stock` WHERE `ID` = '"+removed_id+"'");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                Parts_id = ""+rs.getInt("ID");    
                Supplier_id = rs.getString("SUPPLIER ID");
                System.out.println(""+Parts_id);
                System.out.println(Supplier_id);
                date = rs.getString("DATE RECEIVED");
                View_Parts_Category.setText(rs.getString("CATEGORY"));
                Supplier_id = rs.getString("SUPPLIER ID");
                View_Parts_Type.setText(rs.getString("BRAND"));
                original_quantity = rs.getString("QUANTITY");
                View_Parts_Brand1.setText(rs.getString("BRAND"));
                View_Parts_Type.setText(rs.getString("TYPE"));
                View_Parts_Price.setText(rs.getString("SELLER PRICE"));
                totalQuantity = rs.getString("QUANTITY");
                images = rs.getBytes("IMAGE");
                ImageIcon imageicon = new ImageIcon (new ImageIcon(images).getImage().getScaledInstance(View_Parts_Pic.getWidth(), View_Parts_Pic.getHeight(),Image.SCALE_SMOOTH) );
                View_Parts_Pic.setIcon(imageicon);

                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
     }
     
     //request
     if(Banner.equals("REQUEST PARTS")){
            try{
                PreparedStatement ps = null;
                ResultSet rs =null;
                ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `summary_stock` WHERE `ID` = '"+request+"'");
                rs = ps.executeQuery();
                while(rs.next()){
                Parts_id = ""+rs.getInt("ID");    
                Supplier_id = rs.getString("SUPPLIER ID");
                System.out.println(""+Parts_id);
                System.out.println(Supplier_id);
                date = rs.getString("DATE RECEIVED");
                View_Parts_Category.setText(rs.getString("CATEGORY"));
                Supplier_id = rs.getString("SUPPLIER ID");
                View_Parts_Type.setText(rs.getString("BRAND"));
                original_quantity = rs.getString("QUANTITY");
                View_Parts_Brand1.setText(rs.getString("BRAND"));
                View_Parts_Type.setText(rs.getString("TYPE"));
                View_Parts_Price.setText(rs.getString("SELLER PRICE"));
                View_Parts_Quantity.setText(rs.getString("QUANTITY"));
                images = rs.getBytes("IMAGE");
                ImageIcon imageicon = new ImageIcon (new ImageIcon(images).getImage().getScaledInstance(View_Parts_Pic.getWidth(), View_Parts_Pic.getHeight(),Image.SCALE_SMOOTH) );
                View_Parts_Pic.setIcon(imageicon);

                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
     }     
     
    }//GEN-LAST:event_View_Parts_DisplayAncestorAdded

    private void View_Parts_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_Parts_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_View_Parts_PriceActionPerformed

    private void QuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuantityKeyReleased
        String Banner = View_Parts_Display.getText();
        
        if(Banner.equals("PARTS")){
            try{
                String number  = Quantity.getText() ;
                int result = Integer.parseInt(Quantity.getText().toString()) * Integer.parseInt(View_Parts_Price.getText().toString());
                Quantity1.setText(""+result);
            }
            catch(NumberFormatException  e){
               Quantity.setText("");
            }
        }
        if(Banner.equals("REMOVED CART PARTS")){
            try{
                String number  = Quantity.getText() ;
                int result = Integer.parseInt(Quantity.getText().toString()) * Integer.parseInt(View_Parts_Price.getText().toString());
                Quantity1.setText(""+result);
            }
            catch(NumberFormatException  e){
               Quantity.setText("");
            }
        }
        if(Banner.equals("REQUEST PARTS")){
            try{
                String number  = Quantity.getText() ;
                int result = Integer.parseInt(Quantity.getText().toString());
                Integer.toString(result);
            }
            catch(NumberFormatException  e){
               Quantity.setText("");
            }
        }         
    }//GEN-LAST:event_QuantityKeyReleased

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
            java.util.logging.Logger.getLogger(Sales_Parts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales_Parts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales_Parts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales_Parts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Sales_Parts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    public static javax.swing.JLabel Path;
    private javax.swing.JTextField Quantity;
    public static javax.swing.JTextField Quantity1;
    private javax.swing.JLabel Stock_Genset_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Update;
    public static javax.swing.JLabel Stock_Genset_Update;
    public static javax.swing.JTextField View_Parts_Brand1;
    public static javax.swing.JTextField View_Parts_Category;
    public static javax.swing.JLabel View_Parts_Display;
    public static javax.swing.JLabel View_Parts_Pic;
    public static javax.swing.JTextField View_Parts_Price;
    public static javax.swing.JTextField View_Parts_Quantity;
    public static javax.swing.JTextField View_Parts_Type;
    public static javax.swing.JTextField View_Parts_dateReleased;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    public static javax.swing.JTextField tp_txt;
    public static javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
