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
public class Insert_Inventory_Filter extends javax.swing.JFrame {
    String filename = null;
    public static byte[] images = null;
    
    public Insert_Inventory_Filter() {
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
        Inventory_Display = new javax.swing.JLabel();
        KG2_ADD_STOCK_GENSET = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        Insert_Invetory_Filter_pic = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        Insert_Filter_Supplier_id = new javax.swing.JTextField();
        Insert_Invetory_Filter_seller_price = new javax.swing.JTextField();
        Insert_Invetory_Filter_id = new javax.swing.JTextField();
        Insert_Invetory_Filter_brand_name = new javax.swing.JTextField();
        Insert_Invetory_Filter_quantity = new javax.swing.JTextField();
        Insert_Invetory_Filter_description = new javax.swing.JTextField();
        Insert_Filter_Supplier_contact = new javax.swing.JTextField();
        Insert_Filter_Supplier_email = new javax.swing.JTextField();
        Insert_Invetory_Filter_supplier_price = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        Insert_Filter_Supplier_name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Insert_Filter_Supplier_address = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        Supplier_List_Btn = new javax.swing.JLabel();
        Stock_Genset_Panel_Update = new javax.swing.JPanel();
        Stock_Genset_Update = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        Stock_Genset_Back = new javax.swing.JLabel();
        Insert_Invetory_Filter_date = new datechooser.beans.DateChooserCombo();
        Insert_Invetory_Filter_type = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Path = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 51, 74));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Inventory_Display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Inventory_Display.setForeground(new java.awt.Color(255, 255, 255));
        Inventory_Display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Inventory_Display.setText("ADD FILTER PRODUCT");
        Inventory_Display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Inventory_DisplayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(Inventory_Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 470, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 100));

        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(20, 31, 31));
        jLabel2.setText("BRAND NAME");
        jLabel2.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 100, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(20, 31, 31));
        jLabel7.setText("DESCRIPTION");
        jLabel7.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 120, 30));

        a.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        a.setForeground(new java.awt.Color(20, 31, 31));
        a.setText("ID");
        a.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 80, 30));

        Insert_Invetory_Filter_pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Insert_Invetory_Filter_pic.setForeground(new java.awt.Color(20, 31, 31));
        Insert_Invetory_Filter_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Insert_Invetory_Filter_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Default_Imge.png"))); // NOI18N
        Insert_Invetory_Filter_pic.setAlignmentY(1.0F);
        Insert_Invetory_Filter_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)));
        Insert_Invetory_Filter_pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Insert_Invetory_Filter_picMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Insert_Invetory_Filter_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 270, 150));

        jLabel29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(20, 31, 31));
        jLabel29.setText("QUANTITY");
        jLabel29.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 120, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(20, 31, 31));
        jLabel5.setText("TYPE");
        jLabel5.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 110, 30));

        id1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id1.setText("NAME");
        id1.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 100, 30));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setText("ADDRESS");
        jLabel21.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 100, 30));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setText("EMAIL ");
        jLabel19.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 100, 30));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setText("CONTACT NO.");
        jLabel18.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, 100, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(20, 31, 31));
        jLabel16.setText("DATE");
        jLabel16.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 110, 30));

        jLabel30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(20, 31, 31));
        jLabel30.setText("SUPPLIER PRICE");
        jLabel30.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 120, 30));

        id2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id2.setText("ID");
        id2.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 100, 30));

        Insert_Filter_Supplier_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Filter_Supplier_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Filter_Supplier_id.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Filter_Supplier_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 180, 30));

        Insert_Invetory_Filter_seller_price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Invetory_Filter_seller_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Invetory_Filter_seller_price.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Invetory_Filter_seller_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 190, 30));

        Insert_Invetory_Filter_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Invetory_Filter_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Invetory_Filter_id.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Invetory_Filter_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 190, 30));

        Insert_Invetory_Filter_brand_name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Invetory_Filter_brand_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Invetory_Filter_brand_name.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Invetory_Filter_brand_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 190, 30));

        Insert_Invetory_Filter_quantity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Invetory_Filter_quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Invetory_Filter_quantity.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Invetory_Filter_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 190, 30));

        Insert_Invetory_Filter_description.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Invetory_Filter_description.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Invetory_Filter_description.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Invetory_Filter_description, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 190, 30));

        Insert_Filter_Supplier_contact.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Filter_Supplier_contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Filter_Supplier_contact.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Filter_Supplier_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 360, 180, 30));

        Insert_Filter_Supplier_email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Filter_Supplier_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Filter_Supplier_email.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Filter_Supplier_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, 180, 30));

        Insert_Invetory_Filter_supplier_price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Invetory_Filter_supplier_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Invetory_Filter_supplier_price.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Invetory_Filter_supplier_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 190, 30));

        jLabel31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(20, 31, 31));
        jLabel31.setText("SELLER  PRICE");
        jLabel31.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 120, 30));

        Insert_Filter_Supplier_name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Filter_Supplier_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Filter_Supplier_name.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Filter_Supplier_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 160, 180, 30));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Insert_Filter_Supplier_address.setColumns(10);
        Insert_Filter_Supplier_address.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Filter_Supplier_address.setRows(5);
        Insert_Filter_Supplier_address.setTabSize(5);
        Insert_Filter_Supplier_address.setAlignmentX(3.0F);
        Insert_Filter_Supplier_address.setAlignmentY(2.0F);
        Insert_Filter_Supplier_address.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        Insert_Filter_Supplier_address.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jScrollPane1.setViewportView(Insert_Filter_Supplier_address);

        KG2_ADD_STOCK_GENSET.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 200, 180, 110));

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
            .addComponent(Supplier_List_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Supplier_List_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, 180, 40));

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
            .addComponent(Stock_Genset_Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_UpdateLayout.setVerticalGroup(
            Stock_Genset_Panel_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 210, 50));

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
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_BackLayout.setVerticalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 210, 50));

        Insert_Invetory_Filter_date.setFieldFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));
        KG2_ADD_STOCK_GENSET.add(Insert_Invetory_Filter_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 190, 30));

        Insert_Invetory_Filter_type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Invetory_Filter_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "FILTER", "PARTS" }));
        KG2_ADD_STOCK_GENSET.add(Insert_Invetory_Filter_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 190, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 0));
        jLabel12.setToolTipText("");
        jLabel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)), "FILTER INFORMATION", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 20), new java.awt.Color(20, 31, 31))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 670, 450));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setToolTipText("");
        jLabel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)), "SUPPIER INFORMATION", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 20), new java.awt.Color(20, 31, 31))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 330, 450));

        Path.setText("1");
        KG2_ADD_STOCK_GENSET.add(Path, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, 30, -1));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1070, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Insert_Invetory_Filter_picMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Insert_Invetory_Filter_picMouseClicked
        Insert_Invetory_Filter_pic.setText(null);
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        

        ImageIcon imageicon = new ImageIcon (new ImageIcon(filename).getImage().getScaledInstance(Insert_Invetory_Filter_pic.getWidth(), Insert_Invetory_Filter_pic.getHeight(),Image.SCALE_SMOOTH) );
        Insert_Invetory_Filter_pic.setIcon(imageicon);

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
    }//GEN-LAST:event_Insert_Invetory_Filter_picMouseClicked

    private void Stock_Genset_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseClicked
    
    Class_tables ct = new Class_tables();
        
    String Banner = Inventory_Display.getText();
    
    String date         = Insert_Invetory_Filter_date.getText().toUpperCase();
    String id           = Insert_Invetory_Filter_id.getText().toUpperCase();
    String brand        = Insert_Invetory_Filter_brand_name.getText().toUpperCase(); 
    String description  = Insert_Invetory_Filter_description.getText().toUpperCase();
    String type         = Insert_Invetory_Filter_type.getSelectedItem().toString();
    String supplier_price      = Insert_Invetory_Filter_supplier_price.getText().toUpperCase();
    String seller_price      = Insert_Invetory_Filter_seller_price.getText().toUpperCase(); 
    String quantity      = Insert_Invetory_Filter_quantity.getText().toUpperCase(); 
    
    
    String  ids        = Insert_Filter_Supplier_id.getText().toUpperCase();
    String  name       = Insert_Filter_Supplier_name.getText().toUpperCase();
    String  address    = Insert_Filter_Supplier_address.getText().toUpperCase();
    String  email      = Insert_Filter_Supplier_email.getText().toUpperCase();
    String  contact    = Insert_Filter_Supplier_contact.getText().toUpperCase();
    
    if(date.equals("") || brand.equals("") || description.equals("") || type.equals("SELECT") || supplier_price.equals("") || seller_price.equals("") || quantity.equals("") || name.equals("") || address.equals("") || email.equals("") || contact.equals("")){
        JOptionPane.showMessageDialog(null,"FILLED SOME BLANKS !!! ","",JOptionPane.ERROR_MESSAGE);
    }
    else if(Banner.equals("ADD FILTER PRODUCT") && Path.getText().equals("1"))
    {
        //new supplier and new new filter
        if(!Class_Filter.ExistBrand(brand)){
            JOptionPane.showMessageDialog(null, "EXIST BRAND\nPLEASE UPDATE QUANTITY!","",JOptionPane.WARNING_MESSAGE);
            //Path.setText("2"); // exist supplier
            ct.Filter(); ct.Supplier(); ct.ShopFilter();
        }
        else if(!Class_Supplier.ExistSupplier(email)){
            JOptionPane.showMessageDialog(null, " EXIST SUPPLIER\nPLEASE SELECT SUPPLIER LIST!","",JOptionPane.WARNING_MESSAGE);
            //Path.setText("2"); // exist supplier
            ct.Filter(); ct.Supplier(); ct.ShopFilter();
        }
        else{        
        
            if(!Class_Filter.AddFilter(date, brand, description, type, supplier_price, seller_price, quantity, images, name)&& !Class_Supplier.AddSupplier(name, address, contact, email))
            {
                JOptionPane.showMessageDialog(null, " SUCCESFULLY ADDED ","",JOptionPane.INFORMATION_MESSAGE);
               ct.Filter(); ct.Supplier(); ct.ShopFilter();
                dispose();

            }
        }
    }
    else if(Banner.equals("ADD FILTER PRODUCT") && Path.getText().equals("3"))
    {
        //exist supplier but new new filter
                //new supplier and new new filter
        if(!Class_Filter.ExistBrand(brand)){
            JOptionPane.showMessageDialog(null, "ALREADY SELECTED ITEM\nTHIS QUANTITY WILL BE ADD","",JOptionPane.WARNING_MESSAGE);
            //Path.setText("2"); // exist supplier
            ct.Filter(); ct.Supplier(); ct.ShopFilter();
        }
        else if(!Class_Filter.AddFilter(date, brand, description, type, supplier_price, seller_price, quantity, images, name))
        {
            JOptionPane.showMessageDialog(null, " SUCCESFULLY ADDED ","",JOptionPane.INFORMATION_MESSAGE);
           ct.Filter(); ct.Supplier(); ct.ShopFilter();
            dispose();

        }
        
    } 
    else if(Banner.equals("UPDATE FILTER PRODUCT"))
    {
       if(!Class_Filter.UpdateFilter(date, brand, description, type, supplier_price, seller_price, quantity, images, name, id) && !Class_Supplier.UpdateSupplier(name, address, contact, email, ids) )
        {
            JOptionPane.showMessageDialog(null, " SUCCESFULLY UPDATED ","",JOptionPane.INFORMATION_MESSAGE);
             ct.Filter(); ct.Supplier(); ct.ShopFilter();
             dispose();
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
        
    dispose();
    }//GEN-LAST:event_Stock_Genset_BackMouseClicked

    private void Stock_Genset_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseEntered
     
        Stock_Genset_Panel_Back.setBackground(new Color(255,214,102));
    }//GEN-LAST:event_Stock_Genset_BackMouseEntered

    private void Stock_Genset_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseExited
   
        Stock_Genset_Panel_Back.setBackground(new Color(255,194,102));
    }//GEN-LAST:event_Stock_Genset_BackMouseExited

    private void Inventory_DisplayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Inventory_DisplayAncestorAdded
        
    }//GEN-LAST:event_Inventory_DisplayAncestorAdded

    private void Supplier_List_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplier_List_BtnMouseClicked
        Table_Supplier ts = new Table_Supplier();
        ts.setVisible(true);
        Table_Supplier.Add.setText("SELECT");
        Table_Supplier.Path.setText("3");
       
    }//GEN-LAST:event_Supplier_List_BtnMouseClicked

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
            java.util.logging.Logger.getLogger(Insert_Inventory_Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert_Inventory_Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert_Inventory_Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_Inventory_Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert_Inventory_Filter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea Insert_Filter_Supplier_address;
    public static javax.swing.JTextField Insert_Filter_Supplier_contact;
    public static javax.swing.JTextField Insert_Filter_Supplier_email;
    public static javax.swing.JTextField Insert_Filter_Supplier_id;
    public static javax.swing.JTextField Insert_Filter_Supplier_name;
    public static javax.swing.JTextField Insert_Invetory_Filter_brand_name;
    public static datechooser.beans.DateChooserCombo Insert_Invetory_Filter_date;
    public static javax.swing.JTextField Insert_Invetory_Filter_description;
    public static javax.swing.JTextField Insert_Invetory_Filter_id;
    public static javax.swing.JLabel Insert_Invetory_Filter_pic;
    public static javax.swing.JTextField Insert_Invetory_Filter_quantity;
    public static javax.swing.JTextField Insert_Invetory_Filter_seller_price;
    public static javax.swing.JTextField Insert_Invetory_Filter_supplier_price;
    public static javax.swing.JComboBox<String> Insert_Invetory_Filter_type;
    public static javax.swing.JLabel Inventory_Display;
    public static keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    public static javax.swing.JLabel Path;
    private javax.swing.JLabel Stock_Genset_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Update;
    private javax.swing.JLabel Stock_Genset_Update;
    private javax.swing.JLabel Supplier_List_Btn;
    private javax.swing.JLabel a;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
