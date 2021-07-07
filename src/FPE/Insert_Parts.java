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
import javax.imageio.stream.FileImageInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ROBLES
 */
public class Insert_Parts extends javax.swing.JFrame {
    String filename = null;
    byte[] images = null;
    
    public static String supplier_id=null;
    
    public Insert_Parts() {
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
        Inventory_Display = new javax.swing.JLabel();
        KG2_ADD_STOCK_GENSET = new keeptoo.KGradientPanel();
        Insert_Parts_Pic = new javax.swing.JLabel();
        Insert_Parts_Supplier_Contact = new javax.swing.JTextField();
        Insert_Parts_Supplier_name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Insert_Parts_Supplier_Address = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        Supplier_List_Btn = new javax.swing.JLabel();
        Stock_Genset_Panel_Update = new javax.swing.JPanel();
        Stock_Genset_Update = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        Stock_Genset_Back = new javax.swing.JLabel();
        Path = new javax.swing.JLabel();
        Insert_Parts_Quantity = new javax.swing.JTextField();
        Insert_Parts_Category = new javax.swing.JTextField();
        Insert_Parts_Brand = new javax.swing.JTextField();
        Insert_Parts_Price = new javax.swing.JTextField();
        Insert_Parts_Date = new datechooser.beans.DateChooserCombo();
        Insert_Parts_Type = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        Insert_Parts_Remarks = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        Insert_Parts_total_price = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 71, 94));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Inventory_Display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Inventory_Display.setForeground(new java.awt.Color(255, 255, 255));
        Inventory_Display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Inventory_Display.setText("ADD NEW PARTS STOCK");
        Inventory_Display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Inventory_DisplayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(Inventory_Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 470, 110));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 130));

        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Insert_Parts_Pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Insert_Parts_Pic.setForeground(new java.awt.Color(255, 204, 153));
        Insert_Parts_Pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Insert_Parts_Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Default_Imge.png"))); // NOI18N
        Insert_Parts_Pic.setAlignmentY(1.0F);
        Insert_Parts_Pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)));
        Insert_Parts_Pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Insert_Parts_PicMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Insert_Parts_Pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 300, 200));

        Insert_Parts_Supplier_Contact.setEditable(false);
        Insert_Parts_Supplier_Contact.setBackground(new java.awt.Color(204, 204, 204));
        Insert_Parts_Supplier_Contact.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Parts_Supplier_Contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Parts_Supplier_Contact.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Parts_Supplier_Contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 220, 230, 30));

        Insert_Parts_Supplier_name.setEditable(false);
        Insert_Parts_Supplier_name.setBackground(new java.awt.Color(204, 204, 204));
        Insert_Parts_Supplier_name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Parts_Supplier_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Parts_Supplier_name.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Parts_Supplier_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 70, 230, 30));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Insert_Parts_Supplier_Address.setEditable(false);
        Insert_Parts_Supplier_Address.setBackground(new java.awt.Color(204, 204, 204));
        Insert_Parts_Supplier_Address.setColumns(10);
        Insert_Parts_Supplier_Address.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Parts_Supplier_Address.setRows(5);
        Insert_Parts_Supplier_Address.setTabSize(5);
        Insert_Parts_Supplier_Address.setAlignmentX(3.0F);
        Insert_Parts_Supplier_Address.setAlignmentY(2.0F);
        Insert_Parts_Supplier_Address.setBorder(null);
        Insert_Parts_Supplier_Address.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jScrollPane1.setViewportView(Insert_Parts_Supplier_Address);

        KG2_ADD_STOCK_GENSET.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 117, 230, 80));

        jPanel1.setBackground(new java.awt.Color(255, 255, 179));

        Supplier_List_Btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Supplier_List_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Supplier_List_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Supplier.png"))); // NOI18N
        Supplier_List_Btn.setText(" SUPPLIER LIST   ");
        Supplier_List_Btn.setAlignmentY(1.0F);
        Supplier_List_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Supplier_List_BtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Supplier_List_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Supplier_List_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 370, 210, 40));

        Stock_Genset_Panel_Update.setBackground(new java.awt.Color(5, 157, 192));

        Stock_Genset_Update.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Update.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Save.png"))); // NOI18N
        Stock_Genset_Update.setText(" SAVE");
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
            .addComponent(Stock_Genset_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_UpdateLayout.setVerticalGroup(
            Stock_Genset_Panel_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 170, 50));

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
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_BackLayout.setVerticalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 170, 50));

        Path.setText("1");
        KG2_ADD_STOCK_GENSET.add(Path, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 10, 30, -1));

        Insert_Parts_Quantity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Parts_Quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Parts_Quantity.setBorder(null);
        Insert_Parts_Quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Insert_Parts_QuantityKeyReleased(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Insert_Parts_Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 210, 30));

        Insert_Parts_Category.setEditable(false);
        Insert_Parts_Category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Parts_Category.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Parts_Category.setText("PARTS");
        Insert_Parts_Category.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Parts_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 210, 30));

        Insert_Parts_Brand.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Parts_Brand.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Parts_Brand.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Parts_Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 210, 30));

        Insert_Parts_Price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Parts_Price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Parts_Price.setBorder(null);
        Insert_Parts_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_Parts_PriceActionPerformed(evt);
            }
        });
        Insert_Parts_Price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Insert_Parts_PriceKeyReleased(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Insert_Parts_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 210, 30));

        Insert_Parts_Date.setFieldFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));
        KG2_ADD_STOCK_GENSET.add(Insert_Parts_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 210, 30));

        Insert_Parts_Type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Parts_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "FILTER", "PARTS" }));
        Insert_Parts_Type.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Parts_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 210, 30));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(102, 255, 102));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setText(" CATEGORY");
        jTextField1.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 130, 30));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(102, 255, 102));
        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setText(" DATE INBOUND");
        jTextField2.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 130, 30));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(102, 255, 102));
        jTextField3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField3.setText(" DESCRPTION");
        jTextField3.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 130, 30));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(102, 255, 102));
        jTextField5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField5.setText(" QUANTITY");
        jTextField5.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 130, 30));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(102, 255, 102));
        jTextField7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField7.setText(" PRICE");
        jTextField7.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 130, 30));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(102, 255, 102));
        jTextField8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField8.setText(" TYPE");
        jTextField8.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 130, 30));

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(102, 255, 102));
        jTextField14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField14.setText(" REMARKS");
        jTextField14.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 130, 30));

        Insert_Parts_Remarks.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Parts_Remarks.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Parts_Remarks.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Parts_Remarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 210, 30));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(102, 255, 102));
        jTextField4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField4.setText(" NAME");
        jTextField4.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, 130, 30));

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(102, 255, 102));
        jTextField9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField9.setText(" ADDRESS");
        jTextField9.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, 130, 30));

        jTextField15.setEditable(false);
        jTextField15.setBackground(new java.awt.Color(102, 255, 102));
        jTextField15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField15.setText(" CONTACT");
        jTextField15.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 130, 30));

        Insert_Parts_total_price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Parts_total_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Parts_total_price.setBorder(null);
        Insert_Parts_total_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Insert_Parts_total_priceKeyReleased(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Insert_Parts_total_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 210, 30));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(102, 255, 102));
        jTextField6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField6.setText(" TOTAL PRICE");
        jTextField6.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 130, 30));

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)), "PARTS INFO ", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 0, 20), new java.awt.Color(51, 51, 51))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 710, 440));

        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)), " SUPPLIER INFO ", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 0, 20), new java.awt.Color(51, 51, 51))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 410, 430));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1200, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Insert_Parts_PicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Insert_Parts_PicMouseClicked
        Insert_Parts_Pic.setText(null);
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        

        ImageIcon imageicon = new ImageIcon (new ImageIcon(filename).getImage().getScaledInstance(Insert_Parts_Pic.getWidth(), Insert_Parts_Pic.getHeight(),Image.SCALE_SMOOTH) );
        Insert_Parts_Pic.setIcon(imageicon);

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
    }//GEN-LAST:event_Insert_Parts_PicMouseClicked

    private void Stock_Genset_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseClicked

    String category = Insert_Parts_Category.getText().toUpperCase();
    String brand = Insert_Parts_Brand.getText();
    String model= "";
    String kva = "";
    String phasing = "";
    String type = Insert_Parts_Type.getSelectedItem().toString().toUpperCase();
    String supplier_price = "";
    String seller_price = Insert_Parts_Price.getText().toUpperCase();
    String quantity = Insert_Parts_Quantity.getText();
    int total_price = Integer.parseInt(Insert_Parts_total_price.getText());
    
    
    String engine_sn = "";
    String alternator_sn = "";
    
    // String supplier_id ;
    String date_inbound = Insert_Parts_Date.getText().toUpperCase();
    // image
    String incharge = "";
    String remarks = Insert_Parts_Remarks.getText().toUpperCase();
    String supplier = Insert_Parts_Supplier_name.getText();
 
    /// SUpplier info
 
    if(brand.equals("") || type.equals("SELECT") || seller_price.equals("") || quantity.equals("") || supplier.equals("") )
    {
        JOptionPane.showMessageDialog(null, "FILL SOME BLANCK","",JOptionPane.ERROR_MESSAGE);
    }
    else if(!Class_SummaryStock.InsertStock(category, brand, model, kva, phasing, type, supplier_price, seller_price, quantity, total_price, engine_sn, alternator_sn, supplier_id, date_inbound, images, incharge, remarks))
    {
        JOptionPane.showMessageDialog(null, "SUCCESSFULLY ADDED !"); Webpage.ct.Stocks(); dispose();
    }
    
    
    }//GEN-LAST:event_Stock_Genset_UpdateMouseClicked

    private void Stock_Genset_UpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseEntered
        Stock_Genset_Update.setForeground(new Color(33, 21, 34));
        Stock_Genset_Panel_Update.setBackground(new Color(163, 235, 177));
    }//GEN-LAST:event_Stock_Genset_UpdateMouseEntered

    private void Stock_Genset_UpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseExited
        Stock_Genset_Update.setForeground(new Color(255,255,255));     
        Stock_Genset_Panel_Update.setBackground(new Color(5,157,192));
    }//GEN-LAST:event_Stock_Genset_UpdateMouseExited

    private void Stock_Genset_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseClicked
        
    dispose();
    }//GEN-LAST:event_Stock_Genset_BackMouseClicked

    private void Stock_Genset_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseEntered
        Stock_Genset_Back.setForeground(new Color(33, 21, 34));
        Stock_Genset_Panel_Back.setBackground(new Color(163, 235, 177));
    }//GEN-LAST:event_Stock_Genset_BackMouseEntered

    private void Stock_Genset_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseExited
        Stock_Genset_Back.setForeground(new Color(255,255,255));     
        Stock_Genset_Panel_Back.setBackground(new Color(185, 144, 149));
    }//GEN-LAST:event_Stock_Genset_BackMouseExited

    private void Inventory_DisplayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Inventory_DisplayAncestorAdded
        
    }//GEN-LAST:event_Inventory_DisplayAncestorAdded

    private void Supplier_List_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplier_List_BtnMouseClicked
        Table_Supplier ts = new Table_Supplier();
        ts.setVisible(true);
        Table_Supplier.Supplier_path.setText("INSERT_PARTS");
       
    }//GEN-LAST:event_Supplier_List_BtnMouseClicked

    private void Insert_Parts_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_Parts_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Insert_Parts_PriceActionPerformed

    private void Insert_Parts_PriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Insert_Parts_PriceKeyReleased
        try{
            String number  = Insert_Parts_Price.getText() ;
            int inputQuantity = Integer.parseInt(Insert_Parts_Price.getText());
        }
        catch(NumberFormatException  e){
           Insert_Parts_Price.setText("");
        }
    }//GEN-LAST:event_Insert_Parts_PriceKeyReleased

    private void Insert_Parts_QuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Insert_Parts_QuantityKeyReleased
        try{
            String number  = Insert_Parts_Quantity.getText() ;
            
        }
        catch(NumberFormatException  e){
           Insert_Parts_Quantity.setText("");
        }
    }//GEN-LAST:event_Insert_Parts_QuantityKeyReleased

    private void Insert_Parts_total_priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Insert_Parts_total_priceKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Insert_Parts_total_priceKeyReleased

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
            java.util.logging.Logger.getLogger(Insert_Parts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert_Parts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert_Parts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_Parts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert_Parts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Insert_Parts_Brand;
    public static javax.swing.JTextField Insert_Parts_Category;
    public static datechooser.beans.DateChooserCombo Insert_Parts_Date;
    public static javax.swing.JLabel Insert_Parts_Pic;
    public static javax.swing.JTextField Insert_Parts_Price;
    public static javax.swing.JTextField Insert_Parts_Quantity;
    public static javax.swing.JTextField Insert_Parts_Remarks;
    public static javax.swing.JTextArea Insert_Parts_Supplier_Address;
    public static javax.swing.JTextField Insert_Parts_Supplier_Contact;
    public static javax.swing.JTextField Insert_Parts_Supplier_name;
    public static javax.swing.JComboBox<String> Insert_Parts_Type;
    public static javax.swing.JTextField Insert_Parts_total_price;
    public static javax.swing.JLabel Inventory_Display;
    public static keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    public static javax.swing.JLabel Path;
    private javax.swing.JLabel Stock_Genset_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Update;
    private javax.swing.JLabel Stock_Genset_Update;
    private javax.swing.JLabel Supplier_List_Btn;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
