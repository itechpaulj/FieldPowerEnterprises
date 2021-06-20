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
public class View_Parts extends javax.swing.JFrame {
    String filename = null;
    byte[] images = null;
    String Parts_id = null;
    public static String Supplier_id = null;
    
    
    public View_Parts() {
        initComponents();
        imgisNull();
        Path.setVisible(false);
        
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
        View_Parts_Supplier_Contact = new javax.swing.JTextField();
        View_Parts_Supplier_Email = new javax.swing.JTextField();
        View_Parts_Supplier_name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        View_Parts_Supplier_Address = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        Supplier_List_Btn = new javax.swing.JLabel();
        Stock_Genset_Panel_Update = new javax.swing.JPanel();
        Stock_Genset_Update = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        Stock_Genset_Back = new javax.swing.JLabel();
        Path = new javax.swing.JLabel();
        View_Parts_Quantity = new javax.swing.JTextField();
        View_Parts_Category = new javax.swing.JTextField();
        View_Parts_Brand = new javax.swing.JTextField();
        View_Parts_Price = new javax.swing.JTextField();
        View_Parts_Date = new datechooser.beans.DateChooserCombo();
        View_Parts_Type = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        View_Parts_Remarks = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 51, 74));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        View_Parts_Display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        View_Parts_Display.setForeground(new java.awt.Color(255, 255, 255));
        View_Parts_Display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Parts_Display.setText("VIEW PARTS ITEM");
        View_Parts_Display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                View_Parts_DisplayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(View_Parts_Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 470, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 100));

        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        View_Parts_Pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Parts_Pic.setForeground(new java.awt.Color(20, 31, 31));
        View_Parts_Pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Parts_Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Default_Imge.png"))); // NOI18N
        View_Parts_Pic.setAlignmentY(1.0F);
        View_Parts_Pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)));
        View_Parts_Pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                View_Parts_PicMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Parts_Pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 300, 160));

        View_Parts_Supplier_Contact.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Parts_Supplier_Contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Parts_Supplier_Contact.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Parts_Supplier_Contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 250, 230, 31));

        View_Parts_Supplier_Email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Parts_Supplier_Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Parts_Supplier_Email.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Parts_Supplier_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 210, 230, 31));

        View_Parts_Supplier_name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Parts_Supplier_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Parts_Supplier_name.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Parts_Supplier_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 70, 230, 31));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        View_Parts_Supplier_Address.setColumns(10);
        View_Parts_Supplier_Address.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Parts_Supplier_Address.setRows(5);
        View_Parts_Supplier_Address.setTabSize(5);
        View_Parts_Supplier_Address.setAlignmentX(3.0F);
        View_Parts_Supplier_Address.setAlignmentY(2.0F);
        View_Parts_Supplier_Address.setBorder(null);
        View_Parts_Supplier_Address.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jScrollPane1.setViewportView(View_Parts_Supplier_Address);

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
            .addComponent(Supplier_List_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Supplier_List_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 310, 230, 40));

        Stock_Genset_Panel_Update.setBackground(new java.awt.Color(51, 187, 255));
        Stock_Genset_Panel_Update.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Stock_Genset_Update.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Update.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Save.png"))); // NOI18N
        Stock_Genset_Update.setText(" SAVE RECORD ");
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
            .addComponent(Stock_Genset_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_UpdateLayout.setVerticalGroup(
            Stock_Genset_Panel_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 210, 50));

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
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_BackLayout.setVerticalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 210, 50));

        Path.setText("1");
        KG2_ADD_STOCK_GENSET.add(Path, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, 30, -1));

        View_Parts_Quantity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Parts_Quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Parts_Quantity.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Parts_Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 220, 31));

        View_Parts_Category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Parts_Category.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Parts_Category.setText("PARTS");
        View_Parts_Category.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Parts_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 220, 31));

        View_Parts_Brand.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Parts_Brand.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Parts_Brand.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Parts_Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 220, 31));

        View_Parts_Price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Parts_Price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Parts_Price.setBorder(null);
        View_Parts_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_Parts_PriceActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Parts_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 220, 31));

        View_Parts_Date.setFieldFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));
        KG2_ADD_STOCK_GENSET.add(View_Parts_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 220, 30));

        View_Parts_Type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Parts_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "FILTER", "PARTS" }));
        View_Parts_Type.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Parts_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 220, 31));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(51, 214, 255));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setText(" CATEGORY");
        KG2_ADD_STOCK_GENSET.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 130, 33));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(51, 214, 255));
        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setText(" DATE RECIEVED");
        KG2_ADD_STOCK_GENSET.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 130, 33));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(51, 214, 255));
        jTextField3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField3.setText(" DESCRPTION");
        KG2_ADD_STOCK_GENSET.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 130, 33));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(51, 214, 255));
        jTextField5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField5.setText(" QUANTITY");
        KG2_ADD_STOCK_GENSET.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 130, 33));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(51, 214, 255));
        jTextField7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField7.setText(" PRICE");
        KG2_ADD_STOCK_GENSET.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 130, 33));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(51, 214, 255));
        jTextField8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField8.setText(" TYPE");
        KG2_ADD_STOCK_GENSET.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 130, 33));

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(51, 214, 255));
        jTextField14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField14.setText(" REMARKS");
        KG2_ADD_STOCK_GENSET.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 130, 33));

        View_Parts_Remarks.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Parts_Remarks.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Parts_Remarks.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Parts_Remarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 220, 31));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 0));
        jLabel12.setToolTipText("");
        jLabel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)), "ADD NEW PARTS", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 20), new java.awt.Color(20, 31, 31))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 720, 420));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(51, 214, 255));
        jTextField4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField4.setText(" NAME");
        jTextField4.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, 130, 31));

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(51, 214, 255));
        jTextField10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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
        jTextField11.setBackground(new java.awt.Color(51, 214, 255));
        jTextField11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField11.setText(" CONTACT");
        jTextField11.setBorder(null);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 130, 31));

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(51, 214, 255));
        jTextField12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField12.setText(" EMAIL");
        jTextField12.setBorder(null);
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 130, 31));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setToolTipText("");
        jLabel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)), "SUPPIER INFO", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 20), new java.awt.Color(20, 31, 31))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 410, 420));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1200, 580));

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

    String date = View_Parts_Date.getText();
    String category = View_Parts_Category.getText();
    String brand = View_Parts_Brand.getText();
    String type = View_Parts_Type.getSelectedItem().toString();
    String seller_price = View_Parts_Price.getText();
    String quantity = View_Parts_Quantity.getText();
    String remarks = View_Parts_Remarks.getText();
    
    String supplier_name = View_Parts_Supplier_name.getText();
    String supplier_address = View_Parts_Supplier_Address.getText();
    String supplier_email = View_Parts_Supplier_Email.getText();
    String supplier_contact = View_Parts_Supplier_Contact.getText();
    
    String model="";
    String phasing="";
    String person_in_charge="";
    String supplier_price="";
    String engine_sn="";
    String alternator_sn="";
    String kva="";
    
    if(!Class_SummaryStock.UpdateStock(date, category, brand, model, kva, phasing, type, supplier_price, seller_price, engine_sn, alternator_sn, quantity, person_in_charge, remarks, supplier_name,Supplier_id, images, Parts_id))
    {
        JOptionPane.showMessageDialog(null, "SUCCESSFULY UPDATED","",JOptionPane.INFORMATION_MESSAGE);
    }else{
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
    String ids = Mainpage.ss_id.getText();
    
    if(Banner.equals("VIEW PARTS ITEM"))
    {
        try{
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `summary_stock` WHERE `ID` = '"+ids+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Parts_id = rs.getString("ID");
            System.out.println(Parts_id);
            View_Parts_Date.setText(rs.getString("DATE RECEIVED"));
            View_Parts_Category.setText(rs.getString("CATEGORY"));
            View_Parts_Brand.setText(rs.getString("BRAND"));
            View_Parts_Type.setSelectedItem("TYPE");
            View_Parts_Price.setText(rs.getString("SELLER PRICE"));
            View_Parts_Quantity.setText(rs.getString("QUANTITY"));
            View_Parts_Remarks.setText(rs.getString("REMARKS"));
            View_Parts_Supplier_name.setText(rs.getString("SUPPLIER"));
            Supplier_id = rs.getString("SUPPLIER ID");
            images = rs.getBytes("IMAGE");
            ImageIcon imageicon = new ImageIcon (new ImageIcon(images).getImage().getScaledInstance(View_Parts_Pic.getWidth(), View_Parts_Pic.getHeight(),Image.SCALE_SMOOTH) );
            View_Parts_Pic.setIcon(imageicon);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
         try{
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `supplier_table` WHERE `ID` = '"+Supplier_id+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            View_Parts_Supplier_Address.setText(rs.getString("ADDRESS"));
            View_Parts_Supplier_Email.setText(rs.getString("EMAIL"));
            View_Parts_Supplier_Contact.setText(rs.getString("CONTACT"));
            
            
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_View_Parts_DisplayAncestorAdded

    private void Supplier_List_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplier_List_BtnMouseClicked
        Table_Supplier ts = new Table_Supplier();
        ts.setVisible(true);
        Table_Supplier.Supplier_path.setText("VIEW_PARTS");
       
    }//GEN-LAST:event_Supplier_List_BtnMouseClicked

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void View_Parts_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_Parts_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_View_Parts_PriceActionPerformed

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
            java.util.logging.Logger.getLogger(View_Parts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Parts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Parts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Parts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new View_Parts().setVisible(true);
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
    private javax.swing.JLabel Supplier_List_Btn;
    public static javax.swing.JTextField View_Parts_Brand;
    public static javax.swing.JTextField View_Parts_Category;
    public static datechooser.beans.DateChooserCombo View_Parts_Date;
    public static javax.swing.JLabel View_Parts_Display;
    public static javax.swing.JLabel View_Parts_Pic;
    public static javax.swing.JTextField View_Parts_Price;
    public static javax.swing.JTextField View_Parts_Quantity;
    public static javax.swing.JTextField View_Parts_Remarks;
    public static javax.swing.JTextArea View_Parts_Supplier_Address;
    public static javax.swing.JTextField View_Parts_Supplier_Contact;
    public static javax.swing.JTextField View_Parts_Supplier_Email;
    public static javax.swing.JTextField View_Parts_Supplier_name;
    public static javax.swing.JComboBox<String> View_Parts_Type;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
