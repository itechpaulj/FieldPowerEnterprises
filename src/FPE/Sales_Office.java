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
public class Sales_Office extends javax.swing.JFrame {
    String filename = null;
    public static byte[] images = null;
    String Office_id = null;
    String Supplier_id = null;
    
    public Sales_Office() {
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
        sales_quantity = new javax.swing.JTextField();
        sales_type = new javax.swing.JTextField();
        sales_description = new javax.swing.JTextField();
        sales_price = new javax.swing.JTextField();
        Sales_given = new javax.swing.JTextField();
        View_Parts_Quantity = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        o_txt = new javax.swing.JTextField();
        sales_catagory1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        View_Parts_dateReleased = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 51, 74));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        View_Office_Display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        View_Office_Display.setForeground(new java.awt.Color(255, 255, 255));
        View_Office_Display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Office_Display.setText("OFFICE");
        View_Office_Display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                View_Office_DisplayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(View_Office_Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 450, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 100));

        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        View_Office_pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Office_pic.setForeground(new java.awt.Color(20, 31, 31));
        View_Office_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Office_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Default_Imge.png"))); // NOI18N
        View_Office_pic.setAlignmentY(1.0F);
        View_Office_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)));
        View_Office_pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                View_Office_picMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Office_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 280, 180));

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

        Path.setText("1");
        KG2_ADD_STOCK_GENSET.add(Path, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, 30, -1));

        sales_quantity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sales_quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sales_quantity.setBorder(null);
        sales_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sales_quantityKeyReleased(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(sales_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 210, 31));

        sales_type.setEditable(false);
        sales_type.setBackground(new java.awt.Color(204, 204, 204));
        sales_type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sales_type.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        KG2_ADD_STOCK_GENSET.add(sales_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 210, 31));

        sales_description.setBackground(new java.awt.Color(204, 204, 204));
        sales_description.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sales_description.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        KG2_ADD_STOCK_GENSET.add(sales_description, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 210, 31));

        sales_price.setEditable(false);
        sales_price.setBackground(new java.awt.Color(204, 204, 204));
        sales_price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sales_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sales_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sales_priceActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(sales_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 210, 31));

        Sales_given.setEditable(false);
        Sales_given.setBackground(new java.awt.Color(204, 204, 204));
        Sales_given.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sales_given.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        KG2_ADD_STOCK_GENSET.add(Sales_given, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 210, 31));

        View_Parts_Quantity.setEditable(false);
        View_Parts_Quantity.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        View_Parts_Quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Parts_Quantity.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Parts_Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 210, 30));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField6.setText("    AVAILABLE STOCK  :");
        jTextField6.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 180, 30));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 128, 128));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setText("  CATEGORY");
        jTextField1.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 140, 30));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 128, 128));
        jTextField3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField3.setText("  DESCRPTION");
        jTextField3.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 140, 30));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(255, 128, 128));
        jTextField8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField8.setText("  TYPE");
        jTextField8.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 140, 30));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(255, 128, 128));
        jTextField7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField7.setText("  PRICE");
        jTextField7.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 140, 30));

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(255, 128, 128));
        jTextField9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField9.setText("  QUANTITY");
        jTextField9.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 140, 30));

        o_txt.setEditable(false);
        o_txt.setBackground(new java.awt.Color(255, 128, 128));
        o_txt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        o_txt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        o_txt.setText("  TOTAL PRICE");
        o_txt.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(o_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 140, 30));

        sales_catagory1.setEditable(false);
        sales_catagory1.setBackground(new java.awt.Color(204, 204, 204));
        sales_catagory1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sales_catagory1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sales_catagory1.setText("OFFICE");
        sales_catagory1.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(sales_catagory1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 210, 31));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 128, 128));
        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setText("  DATE RELEASED");
        jTextField2.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 140, 30));

        View_Parts_dateReleased.setEditable(false);
        View_Parts_dateReleased.setBackground(new java.awt.Color(204, 204, 204));
        View_Parts_dateReleased.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Parts_dateReleased.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Parts_dateReleased.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Parts_dateReleased, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 210, 30));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 750, 480));

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

    String Banner = View_Office_Display.getText();
    
    //request
    if(Banner.equals("REQUEST OFFICE")){
            String date_release = View_Parts_dateReleased.getText();

            String category = sales_catagory1.getText().toUpperCase(); 
            String brand = sales_description.getText().toUpperCase();
            String model="";
            String kva = "";
            String phasing ="";
            String type = sales_type.getText().toUpperCase(); 
            String supplier_price ="";
            String person_in_charge = Sales_given.getText();
            
            String seller_price = sales_price.getText(); 
            String engine_sn ="";
            String alternator_sn ="";

            
            int originalQuantity = 0;
            originalQuantity = Integer.parseInt(View_Parts_Quantity.getText().toString());

            String supplier_id = Supplier_id;
            String customer_id = "";

            String stock_id1 = Office_id;    
            String status = "";
            String process_id = Integer.toString(Class_Cart.process) ;
            
            //total price
            String total_price = Sales_given.getText();


            // OR NO and  quotation
            String orno = "REQUEST";
            String quoataion = "REQUEST";
            String completed = "";
            
            int getNowQuantity = Integer.parseInt(sales_quantity.getText());
            String reqQuantity = Integer.toString(getNowQuantity);
            int inputQuantity = Integer.parseInt(sales_quantity.getText().toString());

            int result = Integer.parseInt(View_Parts_Quantity.getText()) - Integer.parseInt(sales_quantity.getText());
            int validQuantity = Integer.parseInt(sales_quantity.getText());
                if( result + 1 <= validQuantity  ){
                    JOptionPane.showMessageDialog(null, "INVALID QUANTITY","",JOptionPane.INFORMATION_MESSAGE);
                }
                else if(Sales_given.equals("")){
                    JOptionPane.showMessageDialog(null, "EMPTY FIELDS","",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    String getRequestNowQuantity = Integer.toString(inputQuantity);
                    if(!Class_Cart.InsertCart(date_release, category, brand, model, kva, phasing, type, supplier_price, seller_price, engine_sn, alternator_sn, reqQuantity, Integer.parseInt(total_price),person_in_charge,supplier_id, customer_id, stock_id1, images, quoataion ,orno,completed,status, process_id) && !Class_Cart.AddCartRequest(date_release, category, brand, model, kva, phasing, type, supplier_price, seller_price, engine_sn, alternator_sn, getRequestNowQuantity, Integer.parseInt(total_price),person_in_charge,supplier_id, customer_id, stock_id1, images, status, quoataion ,orno ,process_id) && !Class_SummaryStock.UpdateQuantity(Integer.toString(result), stock_id1)){
                            JOptionPane.showMessageDialog(null, "SUCCESSFULLY REQUEST","",JOptionPane.INFORMATION_MESSAGE);
                            Class_Cart.addCart();
                            new Class_tables().Cart();
                            new Class_tables().Stocks();
                            new Class_tables().Sales_Office();
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

    private void View_Office_DisplayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_View_Office_DisplayAncestorAdded
    String Banner = View_Office_Display.getText();
    String request = Webpage.request_id;
     //request
     if(Banner.equals("REQUEST OFFICE")){
            try{
                PreparedStatement ps = null;
                ResultSet rs =null;
                ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `summary_stock` WHERE `ID` = '"+request+"'");
                rs = ps.executeQuery();
                while(rs.next()){
                Office_id = ""+rs.getInt("ID");    
                Supplier_id = rs.getString("SUPPLIER ID");
                System.out.println(""+Office_id);
                System.out.println(Supplier_id);
                View_Parts_dateReleased.setText(rs.getString("DATE RECEIVED"));
                sales_catagory1.setText(rs.getString("CATEGORY"));
                Supplier_id = rs.getString("SUPPLIER ID");
                sales_description.setText(rs.getString("BRAND"));
                sales_type.setText(rs.getString("TYPE"));
                sales_price.setText(rs.getString("SELLER PRICE"));
                View_Parts_Quantity.setText(rs.getString("QUANTITY"));
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

    private void sales_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sales_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sales_priceActionPerformed

    private void sales_quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sales_quantityKeyReleased
        String Banner = View_Office_Display.getText();
        
        if(Banner.equals("REQUEST OFFICE")){
            try{
                String number  = sales_quantity.getText() ;
                int result = Integer.parseInt(sales_quantity.getText().toString()) * Integer.parseInt(sales_price.getText().toString());
                Sales_given.setText(""+result);
            }
            catch(NumberFormatException  e){
               Sales_given.setText("");
            }
        }
    }//GEN-LAST:event_sales_quantityKeyReleased

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
            java.util.logging.Logger.getLogger(Sales_Office.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales_Office.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales_Office.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales_Office.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sales_Office().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    public static javax.swing.JLabel Path;
    public static javax.swing.JTextField Sales_given;
    private javax.swing.JLabel Stock_Genset_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Update;
    public static javax.swing.JLabel Stock_Genset_Update;
    public static javax.swing.JLabel View_Office_Display;
    public static javax.swing.JLabel View_Office_pic;
    public static javax.swing.JTextField View_Parts_Quantity;
    public static javax.swing.JTextField View_Parts_dateReleased;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    public static javax.swing.JTextField o_txt;
    public static javax.swing.JTextField sales_catagory1;
    public static javax.swing.JTextField sales_description;
    public static javax.swing.JTextField sales_price;
    public static javax.swing.JTextField sales_quantity;
    public static javax.swing.JTextField sales_type;
    // End of variables declaration//GEN-END:variables
}
