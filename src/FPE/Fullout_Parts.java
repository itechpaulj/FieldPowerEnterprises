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
public class Fullout_Parts extends javax.swing.JFrame {
    String filename = null;
    byte[] images = null;
    String Parts_id = null;
    public static String customer_id = "";
    
    public static String supplier_id = null;
    
    String remarks="";
    //-----------------------------------------------------------------
       
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
    
    public Fullout_Parts() {
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
        Sale_Parts_pic = new javax.swing.JLabel();
        Sale_Parts_Contact = new javax.swing.JTextField();
        Sale_PartsSupplier_name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Sale_Parts_Supplier_Address = new javax.swing.JTextArea();
        Stock_Genset_Panel_Update = new javax.swing.JPanel();
        Stock_Genset_Update = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        Stock_Genset_Back = new javax.swing.JLabel();
        Sale_Parts_available_quantity = new javax.swing.JTextField();
        Sale_Parts_Category = new javax.swing.JTextField();
        Sale_Parts_Brand = new javax.swing.JTextField();
        Sale_Parts_price = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        Sale_Parts_total_price = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        Sale_Parts_inbound_date = new javax.swing.JTextField();
        Sale_Parts_Type = new javax.swing.JTextField();
        Sale_Parts_quantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 71, 94));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fullout_display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        fullout_display.setForeground(new java.awt.Color(255, 255, 255));
        fullout_display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fullout_display.setText("FULLOUT PARTS");
        fullout_display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                fullout_displayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(fullout_display, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 470, 110));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 130));

        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sale_Parts_pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Sale_Parts_pic.setForeground(new java.awt.Color(20, 31, 31));
        Sale_Parts_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sale_Parts_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Default_Imge.png"))); // NOI18N
        Sale_Parts_pic.setAlignmentY(1.0F);
        Sale_Parts_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)));
        Sale_Parts_pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sale_Parts_picMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Sale_Parts_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 300, 180));

        Sale_Parts_Contact.setEditable(false);
        Sale_Parts_Contact.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Parts_Contact.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Parts_Contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Parts_Contact.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sale_Parts_Contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 210, 230, 31));

        Sale_PartsSupplier_name.setEditable(false);
        Sale_PartsSupplier_name.setBackground(new java.awt.Color(220, 220, 200));
        Sale_PartsSupplier_name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_PartsSupplier_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_PartsSupplier_name.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sale_PartsSupplier_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 70, 230, 31));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Sale_Parts_Supplier_Address.setEditable(false);
        Sale_Parts_Supplier_Address.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Parts_Supplier_Address.setColumns(10);
        Sale_Parts_Supplier_Address.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Parts_Supplier_Address.setRows(5);
        Sale_Parts_Supplier_Address.setTabSize(5);
        Sale_Parts_Supplier_Address.setAlignmentX(3.0F);
        Sale_Parts_Supplier_Address.setAlignmentY(2.0F);
        Sale_Parts_Supplier_Address.setBorder(null);
        Sale_Parts_Supplier_Address.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jScrollPane1.setViewportView(Sale_Parts_Supplier_Address);

        KG2_ADD_STOCK_GENSET.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 117, 230, 80));

        Stock_Genset_Panel_Update.setBackground(new java.awt.Color(255, 133, 51));

        Stock_Genset_Update.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Update.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Save.png"))); // NOI18N
        Stock_Genset_Update.setText(" CHECK OUT");
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

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 160, 45));

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
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_BackLayout.setVerticalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 160, 45));

        Sale_Parts_available_quantity.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Parts_available_quantity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Parts_available_quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Parts_available_quantity.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sale_Parts_available_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 210, 31));

        Sale_Parts_Category.setEditable(false);
        Sale_Parts_Category.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Parts_Category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Parts_Category.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Parts_Category.setText("PARTS");
        Sale_Parts_Category.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sale_Parts_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 210, 31));

        Sale_Parts_Brand.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Parts_Brand.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Parts_Brand.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Parts_Brand.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sale_Parts_Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 210, 31));

        Sale_Parts_price.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Parts_price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Parts_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Parts_price.setBorder(null);
        Sale_Parts_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sale_Parts_priceActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Sale_Parts_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 210, 31));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(214, 110, 92));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setText(" CATEGORY");
        jTextField1.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 140, 31));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(214, 110, 92));
        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setText(" DATE RECIEVED");
        jTextField2.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 140, 31));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(214, 110, 92));
        jTextField3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField3.setText(" DESCRPTION");
        jTextField3.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 140, 31));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(214, 110, 92));
        jTextField5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField5.setText(" QUANTITY");
        jTextField5.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 140, 31));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(214, 110, 92));
        jTextField7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField7.setText(" PRICE");
        jTextField7.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 140, 31));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(214, 110, 92));
        jTextField8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField8.setText(" AVAILABLE STOCK");
        jTextField8.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 140, 31));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(214, 110, 92));
        jTextField4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField4.setText(" NAME");
        jTextField4.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, 130, 31));

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(214, 110, 92));
        jTextField10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField10.setText(" ADDRESS");
        jTextField10.setBorder(null);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 130, 31));

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(214, 110, 92));
        jTextField11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField11.setText(" CONTACT");
        jTextField11.setBorder(null);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 130, 31));

        Sale_Parts_total_price.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Parts_total_price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Parts_total_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Parts_total_price.setBorder(null);
        Sale_Parts_total_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Sale_Parts_total_priceKeyReleased(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Sale_Parts_total_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 210, 30));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(214, 110, 92));
        jTextField6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField6.setText(" TOTAL PRICE");
        jTextField6.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 140, 30));

        Sale_Parts_inbound_date.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Parts_inbound_date.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Parts_inbound_date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Parts_inbound_date.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sale_Parts_inbound_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 210, 31));

        Sale_Parts_Type.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Parts_Type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Parts_Type.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Parts_Type.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sale_Parts_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 210, 31));

        Sale_Parts_quantity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Parts_quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Parts_quantity.setBorder(null);
        Sale_Parts_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Sale_Parts_quantityKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Sale_Parts_quantityKeyTyped(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Sale_Parts_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 210, 31));

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)), "PARTS INFO ", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 710, 440));

        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)), " SUPPLIER INFO ", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 410, 440));

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(214, 110, 92));
        jTextField9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField9.setText(" TYPE");
        jTextField9.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 140, 31));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1200, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Sale_Parts_picMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sale_Parts_picMouseClicked
        Sale_Parts_pic.setText(null);
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        

        ImageIcon imageicon = new ImageIcon (new ImageIcon(filename).getImage().getScaledInstance(Sale_Parts_pic.getWidth(), Sale_Parts_pic.getHeight(),Image.SCALE_SMOOTH) );
        Sale_Parts_pic.setIcon(imageicon);

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
    }//GEN-LAST:event_Sale_Parts_picMouseClicked

    private void Stock_Genset_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseClicked
    String btn = Stock_Genset_Update.getText();
    String category = Sale_Parts_Category.getText().toUpperCase();
    String brand = Sale_Parts_Brand.getText();
    String model= "";
    String kva = "";
    String phasing = "";
    String type = Sale_Parts_Type.getText().toUpperCase();
    String supplier_price = "";
    String seller_price = Sale_Parts_price.getText().toUpperCase();
    String quantity = Sale_Parts_quantity.getText();
    String avail = Sale_Parts_available_quantity.getText();
    
    int total_price = Integer.parseInt(Sale_Parts_total_price.getText());

    int aq = Integer.parseInt(avail);
    int q = Integer.parseInt(quantity);
    
    String engine_sn = "";
    String alternator_sn = "";
    
    // String supplier_id ;
    String date_inbound = Sale_Parts_inbound_date.getText().toUpperCase();
    // image
    String incharge = "";
    String supplier = Sale_PartsSupplier_name.getText();
    
    String date_outbound = "";
    String verify = "";
    String process = "";
    String project = "";
    
            
     if(quantity.equals("") || total_price == 0)
        {
            JOptionPane.showMessageDialog(null, "FILL SOME BLANCK","",JOptionPane.ERROR_MESSAGE);
        }
     else if(aq < q)
        {
            JOptionPane.showMessageDialog(null, "THE QUANTITY ENTERED IS TO MUCH!!","",JOptionPane.ERROR_MESSAGE);
        }
     
    else if(btn.equals(" CHECK OUT"))
        {
          
            if(stock_ids == sale_ids )
               
            {
     
                if(!Class_Amount.CartUpdateQuantityAndTotal(Update_Sale_quantity, Update_Sale_total_price, Parts_id) && !Class_Amount.HistoryUpdateQuantityAndTotal(""+Update_Sale_quantity, Update_Sale_total_price, Parts_id) && !Class_Amount.StockUpdateQuantityAndTotal(""+Update_Stock_quantity, Update_Stock_total_price, Parts_id))
                    {
                        System.out.print(""+Update_Sale_quantity);
                        System.out.print(Update_Sale_total_price);
                        JOptionPane.showMessageDialog(null, " CHECK OUT ADDED !");Webpage.Refresh();  dispose();
                    }
                
            }
           else if(!Class_fullout.InsertFullout(Parts_id, category, brand, type, supplier_price, seller_price, ""+Update_Sale_quantity, Update_Sale_total_price, supplier_id, date_inbound, date_outbound, images, incharge, remarks, process, verify) && !Class_History.InsertHistory(Parts_id, category, brand, model, kva, phasing, type, supplier_price, seller_price, quantity, total_price, engine_sn, alternator_sn, supplier_id, customer_id, date_inbound, date_outbound, images, incharge, remarks, process, verify, project) && !Class_Amount.StockUpdateQuantityAndTotal(""+Update_Stock_quantity, Update_Stock_total_price, Parts_id))
                    {
                        JOptionPane.showMessageDialog(null, " CHECK OUT SUCCESS !");Webpage.Refresh();  dispose();
                    }
    
        }         

             else if(btn.equals(" REMOVE"))
        {
        
        
                if(!Class_Amount.CartUpdateQuantityAndTotal(Update_Stock_quantity, Update_Stock_total_price, Parts_id) && !Class_Amount.HistoryUpdateQuantityAndTotal(""+Update_Stock_quantity, Update_Stock_total_price, Parts_id) && !Class_Amount.StockUpdateQuantityAndTotal(""+Update_Stock_quantity_return, Update_Stock_total_price_return, Parts_id))
                    {
                        System.out.print(""+Update_Stock_quantity);
                        System.out.print(Update_Stock_total_price);
                        JOptionPane.showMessageDialog(null, " SUCCESSFULY REMOVE !");Webpage.Refresh();  dispose();
                    }
                if(Update_Stock_quantity == 0)
                    {
                        if(!Class_Amount.HistoryDelete(Parts_id) &&  !Class_Amount.CartDelete(Parts_id )){
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
    
    
    System.out.print("ok");
    if(Banner.equals("FULLOUT PARTS"))
    {
        String ids = Webpage.stock_id;
        try{
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `stock_table` WHERE `STOCK ID` = '"+ids+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Parts_id = rs.getString("STOCK ID");
            stock_ids = Integer.parseInt(Parts_id);
            Sale_Parts_inbound_date.setText(rs.getString("DATE INBOUND"));
            Sale_Parts_Category.setText(rs.getString("CATEGORY"));
            Sale_Parts_Brand.setText(rs.getString("BRAND"));
            Sale_Parts_Type.setText(rs.getString("TYPE"));
            Sale_Parts_price.setText(rs.getString("SELLER PRICE"));
            Sale_Parts_available_quantity.setText(rs.getString("QUANTITY"));
            
            remarks = rs.getString("REMARKS");
            
            supplier_id = rs.getString("SUPPLIER ID");
            images = rs.getBytes("IMAGE");
            ImageIcon imageicon = new ImageIcon (new ImageIcon(images).getImage().getScaledInstance(Sale_Parts_pic.getWidth(), Sale_Parts_pic.getHeight(),Image.SCALE_SMOOTH) );
            Sale_Parts_pic.setIcon(imageicon);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
         try{
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `supplier_table` WHERE `ID` = '"+supplier_id+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            
            Sale_PartsSupplier_name.setText(rs.getString("NAME"));
            Sale_Parts_Supplier_Address.setText(rs.getString("ADDRESS"));
    
            Sale_Parts_Contact.setText(rs.getString("CONTACT"));
            
            
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
         
         try{
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`,`QUANTITY` FROM `fullout` WHERE `STOCK ID`='"+Webpage.sales_id+"'");
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
    
    
    
    
    
    
    
    
    
    
    else if(Banner.equals("REMOVE PARTS"))
        
    {
        String idss = Webpage.cart_id;
        try{
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `fullout` WHERE `STOCK ID`= '"+idss+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Parts_id = rs.getString("STOCK ID");
           
            Sale_Parts_inbound_date.setText(rs.getString("DATE INBOUND"));
            Sale_Parts_Category.setText(rs.getString("CATEGORY"));
            Sale_Parts_Brand.setText(rs.getString("BRAND"));
            Sale_Parts_Type.setText(rs.getString("TYPE"));
            Sale_Parts_price.setText(rs.getString("SELLER PRICE"));
            jTextField8.setText(" ORDER QUANTITY");
            Sale_Parts_available_quantity.setText(rs.getString("QUANTITY"));
            Sale_Parts_total_price.setText(""+rs.getInt("TOTAL PRICE"));
            
            remarks = rs.getString("REMARKS");
            
            supplier_id = rs.getString("SUPPLIER ID");
            images = rs.getBytes("IMAGE");
            ImageIcon imageicon = new ImageIcon (new ImageIcon(images).getImage().getScaledInstance(Sale_Parts_pic.getWidth(), Sale_Parts_pic.getHeight(),Image.SCALE_SMOOTH) );
            Sale_Parts_pic.setIcon(imageicon);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
         try{
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `supplier_table` WHERE `ID` = '"+supplier_id+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            
            Sale_PartsSupplier_name.setText(rs.getString("NAME"));
            Sale_Parts_Supplier_Address.setText(rs.getString("ADDRESS"));
    
            Sale_Parts_Contact.setText(rs.getString("CONTACT"));
            
            
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
         
         try{
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`,`QUANTITY` FROM `stock_table` WHERE `STOCK ID`='"+Webpage.sales_id+"'");
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

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void Sale_Parts_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sale_Parts_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sale_Parts_priceActionPerformed

    private void Sale_Parts_total_priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Sale_Parts_total_priceKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Sale_Parts_total_priceKeyReleased

    private void Sale_Parts_quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Sale_Parts_quantityKeyReleased
       int quantity = 0,price = 0,total = 0;
       price = Integer.parseInt(Sale_Parts_price.getText());
       
       String q = Sale_Parts_quantity.getText();
       if(q.equals(""))
       {
           total = price * 0;      
           Sale_Parts_total_price.setText(""+total);
       }
       else
       {
          Sale_price =  Integer.parseInt(Sale_Parts_price.getText());
          Sale_quantity = Integer.parseInt(Sale_Parts_quantity.getText());
          Sale_total = Sale_quantity * Sale_price;
          Sale_Parts_total_price.setText(""+Sale_total);
          System.out.println(" FOR ADD");
          System.out.println(""+Sale_quantity);
          System.out.println(""+Sale_total);
          System.out.println("\n \n");
          int Sale_avail = Integer.parseInt(Sale_Parts_available_quantity.getText());

           System.out.println(" FOR ADD CHECKOUT");
          Update_Sale_quantity = parts_quant + Sale_quantity;
          Update_Sale_total_price = Update_Sale_quantity * Sale_price;
          System.out.println(""+Update_Sale_quantity);
          System.out.println(""+Update_Sale_total_price);
          System.out.println("\n \n");
          
          System.out.println(" FOR UPDATE STOCK");
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
  
   
    
    // ----FOR STOCK----------------------------------------
    int Update_Stock_quantity ;
    int Update_Stock_total_price;
    
    //----FOR SALE------------------------------------------
    int Sale_total_price;
    int Sale_quantity ;
    
        
//              add_sale_quantity = Integer.parseInt(Sale_Gen_quantity.getText());
//           int aq = Integer.parseInt(Sale_Gen_available_stock.getText());
//           if(aq >= add_sale_quantity){
               
           
        //----   FOR ADD SALE
//        
//        add_sale_total = add_sale_price * add_sale_quantity;
//        Sale_Gen_total_price.setText(""+add_sale_total); 
//        System.out.println("------------FOR ADD SALE---------------------------------------------");
//        System.out.println(""+add_sale_quantity);
//        System.out.println(""+add_sale_total);
//        System.out.println();
//        
//        //----   FOR UPDATE SALE
//        
//        update_sale_quantity = Sale_quantity + add_sale_quantity;
//        updated_Sale_total = update_sale_quantity * add_sale_price;
//        System.out.println("------------FOR UPDATE SALE-------------------------------------------");
//        System.out.println(""+update_sale_quantity);
//        System.out.println(""+updated_Sale_total);
//        System.out.println();
//        
//        //----   FOR UPDATE THE STOCK 
//        
//        updated_stock_quantity = Integer.parseInt(Sale_Gen_available_stock.getText()) - add_sale_quantity;
//        updated_stock_total = updated_stock_quantity *add_sale_price ;
//        
//        int updated_stock_quantity1= Sale_quantity + add_sale_quantity;
//        updated_stock_total1 =  updated_stock_quantity1 * add_sale_price;
//        System.out.println("------------FOR UPDATE THE STOCK---------------------------------------");
//        System.out.println(""+updated_stock_quantity);
//        
//        System.out.println("\n \n");
       }
       
    }//GEN-LAST:event_Sale_Parts_quantityKeyReleased

    private void Sale_Parts_quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Sale_Parts_quantityKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_Sale_Parts_quantityKeyTyped

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
            java.util.logging.Logger.getLogger(Fullout_Parts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fullout_Parts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fullout_Parts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fullout_Parts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Fullout_Parts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    public static javax.swing.JTextField Sale_PartsSupplier_name;
    public static javax.swing.JTextField Sale_Parts_Brand;
    public static javax.swing.JTextField Sale_Parts_Category;
    public static javax.swing.JTextField Sale_Parts_Contact;
    public static javax.swing.JTextArea Sale_Parts_Supplier_Address;
    public static javax.swing.JTextField Sale_Parts_Type;
    public static javax.swing.JTextField Sale_Parts_available_quantity;
    public static javax.swing.JTextField Sale_Parts_inbound_date;
    public static javax.swing.JLabel Sale_Parts_pic;
    public static javax.swing.JTextField Sale_Parts_price;
    public static javax.swing.JTextField Sale_Parts_quantity;
    public static javax.swing.JTextField Sale_Parts_total_price;
    private javax.swing.JLabel Stock_Genset_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Update;
    public static javax.swing.JLabel Stock_Genset_Update;
    public static javax.swing.JLabel fullout_display;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    public static javax.swing.JTextField jTextField6;
    public static javax.swing.JTextField jTextField7;
    private static javax.swing.JTextField jTextField8;
    public static javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
