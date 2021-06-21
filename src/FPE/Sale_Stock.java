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
import java.util.Date;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ROBLES
 */
public class Sale_Stock extends javax.swing.JFrame {
  
    String filename = null;
    public static File resoucesDirectory ;
  
    String DateTime;
    
    public static byte[] images = null;

    
    String Generator_id;
    String date;
    String Supplier_price;
    String remarks;
    String supplier_name;
    String supplier_id;
    Class_Cart ct = new Class_Cart();
    
    
    
    
    
    
    public Sale_Stock() {
        initComponents();
        imgisNull();
        showDate();
        ct.addCart();
    }
        void showDate(){
       Date today = new Date();
        DateTime = Mainpage.date.format(today) +" - " + Mainpage.time.format(today);
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

        Insert_Invetory_Supplier_id = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        sale_Generator_Banner = new javax.swing.JLabel();
        KG2_ADD_STOCK_GENSET = new keeptoo.KGradientPanel();
        Sales_Gen_Pic = new javax.swing.JLabel();
        Sales_Gen_Model = new javax.swing.JTextField();
        Sales_Gen_Category = new javax.swing.JTextField();
        Sales_Gen_Band = new javax.swing.JTextField();
        Sales_Gen_Alternator = new javax.swing.JTextField();
        Sales_Gen_Seller_Price = new javax.swing.JTextField();
        Sales_Gen_Engine = new javax.swing.JTextField();
        Sales_Gen_kva = new javax.swing.JTextField();
        Panel_View_Btn = new javax.swing.JPanel();
        View_Btn = new javax.swing.JLabel();
        Panel_Back_Btn = new javax.swing.JPanel();
        Back_Btn = new javax.swing.JLabel();
        other = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        Sales_Gen_Type = new javax.swing.JComboBox<>();
        Sales_Gen_Phasing = new javax.swing.JComboBox<>();
        stock_id = new javax.swing.JLabel();

        Insert_Invetory_Supplier_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Invetory_Supplier_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Invetory_Supplier_id.setBorder(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 51, 74));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sale_Generator_Banner.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        sale_Generator_Banner.setForeground(new java.awt.Color(255, 255, 255));
        sale_Generator_Banner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sale_Generator_Banner.setText("SALE GENERATOR");
        sale_Generator_Banner.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                sale_Generator_BannerAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(sale_Generator_Banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 890, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 100));

        KG2_ADD_STOCK_GENSET.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setPreferredSize(new java.awt.Dimension(1390, 725));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sales_Gen_Pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Sales_Gen_Pic.setForeground(new java.awt.Color(20, 31, 31));
        Sales_Gen_Pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sales_Gen_Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Default_Imge.png"))); // NOI18N
        Sales_Gen_Pic.setAlignmentY(1.0F);
        Sales_Gen_Pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)));
        Sales_Gen_Pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sales_Gen_PicMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Sales_Gen_Pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 370, 230));

        Sales_Gen_Model.setEditable(false);
        Sales_Gen_Model.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sales_Gen_Model.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sales_Gen_Model.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sales_Gen_Model, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 250, 31));

        Sales_Gen_Category.setEditable(false);
        Sales_Gen_Category.setBackground(new java.awt.Color(204, 204, 204));
        Sales_Gen_Category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sales_Gen_Category.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sales_Gen_Category.setText("GENERATOR");
        Sales_Gen_Category.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sales_Gen_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 220, 31));

        Sales_Gen_Band.setEditable(false);
        Sales_Gen_Band.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sales_Gen_Band.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sales_Gen_Band.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sales_Gen_Band, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 220, 31));

        Sales_Gen_Alternator.setEditable(false);
        Sales_Gen_Alternator.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sales_Gen_Alternator.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sales_Gen_Alternator.setBorder(null);
        Sales_Gen_Alternator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sales_Gen_AlternatorActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Sales_Gen_Alternator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 250, 30));

        Sales_Gen_Seller_Price.setEditable(false);
        Sales_Gen_Seller_Price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sales_Gen_Seller_Price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sales_Gen_Seller_Price.setBorder(null);
        Sales_Gen_Seller_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sales_Gen_Seller_PriceActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Sales_Gen_Seller_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 250, 31));

        Sales_Gen_Engine.setEditable(false);
        Sales_Gen_Engine.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sales_Gen_Engine.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sales_Gen_Engine.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sales_Gen_Engine, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 250, 31));

        Sales_Gen_kva.setEditable(false);
        Sales_Gen_kva.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sales_Gen_kva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sales_Gen_kva.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sales_Gen_kva, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 250, 31));

        Panel_View_Btn.setBackground(new java.awt.Color(51, 187, 255));
        Panel_View_Btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        View_Btn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        View_Btn.setForeground(new java.awt.Color(255, 255, 255));
        View_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Save.png"))); // NOI18N
        View_Btn.setText(" ADD CART");
        View_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                View_BtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                View_BtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                View_BtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel_View_BtnLayout = new javax.swing.GroupLayout(Panel_View_Btn);
        Panel_View_Btn.setLayout(Panel_View_BtnLayout);
        Panel_View_BtnLayout.setHorizontalGroup(
            Panel_View_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(View_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
        );
        Panel_View_BtnLayout.setVerticalGroup(
            Panel_View_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(View_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Panel_View_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 170, 45));

        Panel_Back_Btn.setBackground(new java.awt.Color(255, 173, 51));
        Panel_Back_Btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Back_Btn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Back_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Back_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Back_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Backss.png"))); // NOI18N
        Back_Btn.setText(" BACK");
        Back_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back_BtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Back_BtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Back_BtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel_Back_BtnLayout = new javax.swing.GroupLayout(Panel_Back_Btn);
        Panel_Back_Btn.setLayout(Panel_Back_BtnLayout);
        Panel_Back_BtnLayout.setHorizontalGroup(
            Panel_Back_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Back_BtnLayout.createSequentialGroup()
                .addComponent(Back_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
        );
        Panel_Back_BtnLayout.setVerticalGroup(
            Panel_Back_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Back_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Panel_Back_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 170, 45));
        KG2_ADD_STOCK_GENSET.add(other, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 110, 20));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 128, 128));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setText(" BRAND ");
        jTextField1.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 150, 31));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 128, 128));
        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setText(" CATEGORY");
        jTextField2.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 150, 31));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 128, 128));
        jTextField3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField3.setText(" KVA");
        jTextField3.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 150, 31));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 128, 128));
        jTextField4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField4.setText(" MODEL");
        jTextField4.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 150, 31));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(255, 128, 128));
        jTextField7.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField7.setText(" UNIT TYPE ");
        jTextField7.setBorder(null);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 150, 31));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(255, 128, 128));
        jTextField8.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField8.setText(" PHASING");
        jTextField8.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 150, 31));

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(255, 128, 128));
        jTextField10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField10.setText(" ALTERNATOR S.N.");
        jTextField10.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 150, 31));

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(255, 128, 128));
        jTextField11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField11.setText(" ENGINE S.N");
        jTextField11.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 150, 31));

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(255, 128, 128));
        jTextField12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField12.setText(" SELLER PRICE");
        jTextField12.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 150, 31));

        Sales_Gen_Type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sales_Gen_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " SELECT", " SILENT TYPE", " OPEN TYPE" }));
        Sales_Gen_Type.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sales_Gen_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 250, 31));

        Sales_Gen_Phasing.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sales_Gen_Phasing.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " SELECT", " SINGLE PHASE", " THREE PHASE" }));
        Sales_Gen_Phasing.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sales_Gen_Phasing, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 250, 31));
        KG2_ADD_STOCK_GENSET.add(stock_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 110, 20));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 930, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Sales_Gen_PicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sales_Gen_PicMouseClicked
        Sales_Gen_Pic.setText(null);
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        

        ImageIcon imageicon = new ImageIcon (new ImageIcon(filename).getImage().getScaledInstance(Sales_Gen_Pic.getWidth(), Sales_Gen_Pic.getHeight(),Image.SCALE_SMOOTH) );
        Sales_Gen_Pic.setIcon(imageicon);

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
    }//GEN-LAST:event_Sales_Gen_PicMouseClicked

    private void View_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_BtnMouseClicked

    String date_release = "";
        
    String category = Sales_Gen_Category.getText().toUpperCase(); 
    String brand = Sales_Gen_Band.getText().toUpperCase();
    String model= Sales_Gen_Model.getText().toUpperCase();
    String kva = Sales_Gen_kva.getText().toUpperCase();
    String phasing = Sales_Gen_Phasing.getSelectedItem().toString().toUpperCase();
    String type = Sales_Gen_Type.getSelectedItem().toString().toUpperCase(); 
    String supplier_price = Supplier_price ;
        
    String seller_price = Sales_Gen_Seller_Price.getText().toUpperCase(); 
    String engine_sn = Sales_Gen_Engine.getText().toUpperCase();
    String alternator_sn = Sales_Gen_Alternator.getText().toUpperCase();
    String quantity="";
        
  
    String customer_id = "";
    String stock_id1 = stock_id.getText();
        
    String status = "";
    String  process_id = Integer.toString(Class_Cart.process) ;
     
     // 17 IMAGE
      
     //JOptionPane.showMessageDialog(null, process_id);
        if(!Class_Cart.InsertCart(date_release, category, brand, model, kva, phasing, type, supplier_price, seller_price, engine_sn, alternator_sn, quantity, supplier_id, customer_id, stock_id1, images, status, process_id) && !Class_Cart.AddCart(date_release, category, brand, model, kva, phasing, type, supplier_price, seller_price, engine_sn, alternator_sn, quantity, supplier_id, customer_id, stock_id1, images, status, process_id))
        {
            JOptionPane.showMessageDialog(null, "OK");
            Class_Cart.addCart();
            dispose();
        }
   
    }//GEN-LAST:event_View_BtnMouseClicked

    private void View_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_BtnMouseEntered
    
        Panel_View_Btn.setBackground(new Color(0, 179, 60));
    }//GEN-LAST:event_View_BtnMouseEntered

    private void View_BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_BtnMouseExited
  
        Panel_View_Btn.setBackground(new Color(51, 187, 255));
    }//GEN-LAST:event_View_BtnMouseExited

    private void Back_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_BtnMouseClicked
    Webpage.Stock_cat = null;
    dispose();
    }//GEN-LAST:event_Back_BtnMouseClicked

    private void Back_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_BtnMouseEntered
      
        Panel_Back_Btn.setBackground(new Color(0, 179, 60));
    }//GEN-LAST:event_Back_BtnMouseEntered

    private void Back_BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_BtnMouseExited
     
        Panel_Back_Btn.setBackground(new Color(255,214,122));
    }//GEN-LAST:event_Back_BtnMouseExited

    private void sale_Generator_BannerAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_sale_Generator_BannerAncestorAdded
    String Banner = sale_Generator_Banner.getText();
    String ids = Webpage.ss_id1.getText();
    
    if(Banner.equals("SALE GENERATOR"))
    {
        try{
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `summary_stock` WHERE `ID` = '"+ids+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            stock_id.setText(""+rs.getInt("ID"));  
            supplier_id = rs.getString("SUPPLIER ID");
            System.out.println(""+Generator_id);
            System.out.println(supplier_id);
            date = rs.getString("DATE RECEIVED");
            Sales_Gen_Category.setText(rs.getString("CATEGORY"));
        
            Sales_Gen_Band.setText(rs.getString("BRAND"));
            
            Sales_Gen_Model.setText(rs.getString("MODEL"));
            Sales_Gen_kva.setText(rs.getString("KVA"));
            Sales_Gen_Phasing.setSelectedItem("PHASING");
            Sales_Gen_Type.setSelectedItem("TYPE");
            Supplier_price = rs.getString("SUPPLIER PRICE");
            Sales_Gen_Seller_Price.setText(rs.getString("SELLER PRICE"));
            Sales_Gen_Engine.setText(rs.getString("ENGINE S N"));
            Sales_Gen_Alternator.setText(rs.getString("ALTERNATOR S N"));
            remarks = rs.getString("REMARKS");
            
            
            images = rs.getBytes("IMAGE");
            ImageIcon imageicon = new ImageIcon (new ImageIcon(images).getImage().getScaledInstance(Sales_Gen_Pic.getWidth(), Sales_Gen_Pic.getHeight(),Image.SCALE_SMOOTH) );
            Sales_Gen_Pic.setIcon(imageicon);
         
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
        
    }//GEN-LAST:event_sale_Generator_BannerAncestorAdded

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void Sales_Gen_Seller_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sales_Gen_Seller_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sales_Gen_Seller_PriceActionPerformed

    private void Sales_Gen_AlternatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sales_Gen_AlternatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sales_Gen_AlternatorActionPerformed

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
            java.util.logging.Logger.getLogger(Insert_Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert_Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert_Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert_Generator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back_Btn;
    public static javax.swing.JTextField Insert_Invetory_Supplier_id;
    public static keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    public static javax.swing.JPanel Panel_Back_Btn;
    public static javax.swing.JPanel Panel_View_Btn;
    public static javax.swing.JTextField Sales_Gen_Alternator;
    public static javax.swing.JTextField Sales_Gen_Band;
    public static javax.swing.JTextField Sales_Gen_Category;
    public static javax.swing.JTextField Sales_Gen_Engine;
    public static javax.swing.JTextField Sales_Gen_Model;
    private javax.swing.JComboBox<String> Sales_Gen_Phasing;
    public static javax.swing.JLabel Sales_Gen_Pic;
    public static javax.swing.JTextField Sales_Gen_Seller_Price;
    private javax.swing.JComboBox<String> Sales_Gen_Type;
    public static javax.swing.JTextField Sales_Gen_kva;
    private javax.swing.JLabel View_Btn;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel other;
    public static javax.swing.JLabel sale_Generator_Banner;
    private javax.swing.JLabel stock_id;
    // End of variables declaration//GEN-END:variables
}
