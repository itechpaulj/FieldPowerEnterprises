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
public class Insert_Generator extends javax.swing.JFrame {
    
    String filename = null;
    public static File resoucesDirectory ;
  
    
    String DateTime;
    

    
    public static byte[] images ;
    public static String supplier_id ;
    
    public Insert_Generator() {
        initComponents();
        imgisNull();

    }
//        void showDate(){
//       Date today = new Date();
//        DateTime = Mainpage.date.format(today) +" - " + Mainpage.time.format(today);
// }

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

        Insert_Invetory_Supplier_id = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        Inventory_Display = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        KG2_ADD_STOCK_GENSET = new keeptoo.KGradientPanel();
        Stock_Genset_Panel_Update = new javax.swing.JPanel();
        Stock_Genset_Update = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        Stock_Genset_Back = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Supplier_List_Btn = new javax.swing.JLabel();
        Insert_Gen_Pic = new javax.swing.JLabel();
        Insert_Gen_Model = new javax.swing.JTextField();
        Insert_Gen_Category = new javax.swing.JTextField();
        Insert_Gen_Alternator = new javax.swing.JTextField();
        Insert_Gen_Engine = new javax.swing.JTextField();
        Insert_Gen_Seller_Price = new javax.swing.JTextField();
        Insert_Gen_Supplier_Price = new javax.swing.JTextField();
        Insert_Gen_kva = new javax.swing.JTextField();
        Insert_Gen_Supplier_Name = new javax.swing.JTextField();
        Insert_Gen_Supplier_Contact = new javax.swing.JTextField();
        Insert_Gen_Band = new javax.swing.JComboBox<>();
        Insert_Gen_Type = new javax.swing.JComboBox<>();
        Insert_Gen_Phasing = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        Insert_Gen_date_inbound = new datechooser.beans.DateChooserCombo();
        jScrollPane1 = new javax.swing.JScrollPane();
        Insert_Gen_Supplier_Address = new javax.swing.JTextArea();
        jTextField15 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        Insert_Gen_quantity = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Insert_Gen_Remarks = new javax.swing.JTextArea();
        Insert_Gen_Total_price = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        Insert_Invetory_Supplier_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Invetory_Supplier_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Invetory_Supplier_id.setBorder(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 71, 94));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Inventory_Display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Inventory_Display.setForeground(new java.awt.Color(255, 255, 255));
        Inventory_Display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Inventory_Display.setText("ADD NEW GENERATOR");
        Inventory_Display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Inventory_DisplayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(Inventory_Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 620, 110));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Logo/Logo.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 170, 100));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 130));

        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setPreferredSize(new java.awt.Dimension(1390, 725));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 170, 50));

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
            .addGroup(Stock_Genset_Panel_BackLayout.createSequentialGroup()
                .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        Stock_Genset_Panel_BackLayout.setVerticalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 170, 50));

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

        KG2_ADD_STOCK_GENSET.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 410, 210, -1));

        Insert_Gen_Pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Insert_Gen_Pic.setForeground(new java.awt.Color(20, 31, 31));
        Insert_Gen_Pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Insert_Gen_Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Default_Imge.png"))); // NOI18N
        Insert_Gen_Pic.setAlignmentY(1.0F);
        Insert_Gen_Pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)));
        Insert_Gen_Pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Insert_Gen_PicMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 360, 180));

        Insert_Gen_Model.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Gen_Model.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Gen_Model.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Model, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 220, 31));

        Insert_Gen_Category.setEditable(false);
        Insert_Gen_Category.setBackground(new java.awt.Color(204, 204, 204));
        Insert_Gen_Category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Gen_Category.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Gen_Category.setText("GENERATOR");
        Insert_Gen_Category.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 220, 31));

        Insert_Gen_Alternator.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Gen_Alternator.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Gen_Alternator.setBorder(null);
        Insert_Gen_Alternator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_Gen_AlternatorActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Alternator, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 220, 30));

        Insert_Gen_Engine.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Gen_Engine.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Gen_Engine.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Engine, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 220, 31));

        Insert_Gen_Seller_Price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Gen_Seller_Price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Gen_Seller_Price.setBorder(null);
        Insert_Gen_Seller_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_Gen_Seller_PriceActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Seller_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 220, 31));

        Insert_Gen_Supplier_Price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Gen_Supplier_Price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Gen_Supplier_Price.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Supplier_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 220, 31));

        Insert_Gen_kva.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Gen_kva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Gen_kva.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_kva, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 220, 31));

        Insert_Gen_Supplier_Name.setEditable(false);
        Insert_Gen_Supplier_Name.setBackground(new java.awt.Color(204, 204, 204));
        Insert_Gen_Supplier_Name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Gen_Supplier_Name.setForeground(new java.awt.Color(51, 51, 51));
        Insert_Gen_Supplier_Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Gen_Supplier_Name.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Supplier_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 60, 220, 31));

        Insert_Gen_Supplier_Contact.setEditable(false);
        Insert_Gen_Supplier_Contact.setBackground(new java.awt.Color(204, 204, 204));
        Insert_Gen_Supplier_Contact.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Gen_Supplier_Contact.setForeground(new java.awt.Color(51, 51, 51));
        Insert_Gen_Supplier_Contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Gen_Supplier_Contact.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Supplier_Contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 200, 220, 31));

        Insert_Gen_Band.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Gen_Band.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "YANDONG", "CUMMINS", "ISUZU", "PERKINS", "WEIFANG", "YAMADA" }));
        Insert_Gen_Band.setBorder(null);
        Insert_Gen_Band.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Insert_Gen_BandMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Insert_Gen_BandMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Insert_Gen_BandMouseReleased(evt);
            }
        });
        Insert_Gen_Band.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_Gen_BandActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Band, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 220, 31));

        Insert_Gen_Type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Gen_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "SILENT TYPE", "OPEN TYPE" }));
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 220, 31));

        Insert_Gen_Phasing.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Gen_Phasing.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "SINGLE PHASE", "THREE PHASE" }));
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Phasing, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 220, 31));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(102, 255, 102));
        jTextField4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField4.setText(" MODEL");
        jTextField4.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 140, 31));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(102, 255, 102));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setText(" BRAND ");
        jTextField1.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 140, 31));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(102, 255, 102));
        jTextField2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setText(" CATEGORY");
        jTextField2.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 140, 31));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(102, 255, 102));
        jTextField6.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField6.setText(" DATE INBOUND");
        jTextField6.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 140, 31));

        jTextField16.setEditable(false);
        jTextField16.setBackground(new java.awt.Color(102, 255, 102));
        jTextField16.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField16.setText("  REMARKS");
        jTextField16.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 140, 31));

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(102, 255, 102));
        jTextField10.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField10.setText("  ALTERNATOR S.N.");
        jTextField10.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 140, 31));

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(102, 255, 102));
        jTextField11.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField11.setText("  ENGINE S.N");
        jTextField11.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 140, 31));

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(102, 255, 102));
        jTextField12.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField12.setText("  SELLER PRICE");
        jTextField12.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 140, 31));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(102, 255, 102));
        jTextField8.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField8.setText("  CONTACT");
        jTextField8.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, 140, 31));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(102, 255, 102));
        jTextField3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField3.setText(" KVA");
        jTextField3.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 140, 31));

        jTextField13.setEditable(false);
        jTextField13.setBackground(new java.awt.Color(102, 255, 102));
        jTextField13.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField13.setText("  NAME");
        jTextField13.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, 140, 31));

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(102, 255, 102));
        jTextField9.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField9.setText("  ADDRESS");
        jTextField9.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, 140, 31));

        Insert_Gen_date_inbound.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    Insert_Gen_date_inbound.setCalendarPreferredSize(new java.awt.Dimension(500, 400));
    Insert_Gen_date_inbound.setWeekStyle(datechooser.view.WeekDaysStyle.FULL);
    Insert_Gen_date_inbound.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 14));
    Insert_Gen_date_inbound.setNavigateFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));
    Insert_Gen_date_inbound.setCurrentNavigateIndex(0);
    KG2_ADD_STOCK_GENSET.add(Insert_Gen_date_inbound, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 220, 31));

    jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

    Insert_Gen_Supplier_Address.setEditable(false);
    Insert_Gen_Supplier_Address.setBackground(new java.awt.Color(204, 204, 204));
    Insert_Gen_Supplier_Address.setColumns(10);
    Insert_Gen_Supplier_Address.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    Insert_Gen_Supplier_Address.setForeground(new java.awt.Color(51, 51, 51));
    Insert_Gen_Supplier_Address.setRows(5);
    Insert_Gen_Supplier_Address.setTabSize(5);
    Insert_Gen_Supplier_Address.setAlignmentX(3.0F);
    Insert_Gen_Supplier_Address.setAlignmentY(2.0F);
    Insert_Gen_Supplier_Address.setBorder(null);
    Insert_Gen_Supplier_Address.setMargin(new java.awt.Insets(8, 8, 8, 8));
    jScrollPane1.setViewportView(Insert_Gen_Supplier_Address);

    KG2_ADD_STOCK_GENSET.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 110, 220, 70));

    jTextField15.setEditable(false);
    jTextField15.setBackground(new java.awt.Color(102, 255, 102));
    jTextField15.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
    jTextField15.setHorizontalAlignment(javax.swing.JTextField.LEFT);
    jTextField15.setText("  PHASING");
    jTextField15.setBorder(null);
    KG2_ADD_STOCK_GENSET.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 140, 31));

    jTextField17.setEditable(false);
    jTextField17.setBackground(new java.awt.Color(102, 255, 102));
    jTextField17.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
    jTextField17.setHorizontalAlignment(javax.swing.JTextField.LEFT);
    jTextField17.setText("  TYPE");
    jTextField17.setBorder(null);
    KG2_ADD_STOCK_GENSET.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 140, 31));

    jTextField18.setEditable(false);
    jTextField18.setBackground(new java.awt.Color(102, 255, 102));
    jTextField18.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
    jTextField18.setHorizontalAlignment(javax.swing.JTextField.LEFT);
    jTextField18.setText("  SUPPLIER PRICE");
    jTextField18.setBorder(null);
    KG2_ADD_STOCK_GENSET.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 140, 31));

    jTextField5.setEditable(false);
    jTextField5.setBackground(new java.awt.Color(102, 255, 102));
    jTextField5.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
    jTextField5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
    jTextField5.setText("  QUANTITY");
    jTextField5.setBorder(null);
    KG2_ADD_STOCK_GENSET.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 140, 31));

    Insert_Gen_quantity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    Insert_Gen_quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    Insert_Gen_quantity.setBorder(null);
    Insert_Gen_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            Insert_Gen_quantityKeyReleased(evt);
        }
    });
    KG2_ADD_STOCK_GENSET.add(Insert_Gen_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 220, 31));

    jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

    Insert_Gen_Remarks.setColumns(10);
    Insert_Gen_Remarks.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    Insert_Gen_Remarks.setForeground(new java.awt.Color(51, 51, 51));
    Insert_Gen_Remarks.setRows(5);
    Insert_Gen_Remarks.setTabSize(5);
    Insert_Gen_Remarks.setAlignmentX(3.0F);
    Insert_Gen_Remarks.setAlignmentY(2.0F);
    Insert_Gen_Remarks.setBorder(null);
    Insert_Gen_Remarks.setMargin(new java.awt.Insets(8, 8, 8, 8));
    Insert_Gen_Remarks.setPreferredSize(new java.awt.Dimension(110, 35));
    jScrollPane2.setViewportView(Insert_Gen_Remarks);

    KG2_ADD_STOCK_GENSET.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 220, 30));

    Insert_Gen_Total_price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
    Insert_Gen_Total_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    Insert_Gen_Total_price.setBorder(null);
    Insert_Gen_Total_price.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            Insert_Gen_Total_priceKeyReleased(evt);
        }
    });
    KG2_ADD_STOCK_GENSET.add(Insert_Gen_Total_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 220, 31));

    jTextField7.setEditable(false);
    jTextField7.setBackground(new java.awt.Color(102, 255, 102));
    jTextField7.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
    jTextField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
    jTextField7.setText(" TOTAL PRICE");
    jTextField7.setBorder(null);
    KG2_ADD_STOCK_GENSET.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 140, 31));

    jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)), " SUPPLIER INFO ", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 0, 20), new java.awt.Color(51, 51, 51))); // NOI18N
    KG2_ADD_STOCK_GENSET.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 410, 490));

    jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)), " GENERATOR INFO ", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 0, 20), new java.awt.Color(51, 51, 51))); // NOI18N
    KG2_ADD_STOCK_GENSET.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 790, 490));

    getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1280, 590));

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Insert_Gen_PicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Insert_Gen_PicMouseClicked
        Insert_Gen_Pic.setText(null);
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        

        ImageIcon imageicon = new ImageIcon (new ImageIcon(filename).getImage().getScaledInstance(Insert_Gen_Pic.getWidth(), Insert_Gen_Pic.getHeight(),Image.SCALE_SMOOTH) );
        Insert_Gen_Pic.setIcon(imageicon);

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
    }//GEN-LAST:event_Insert_Gen_PicMouseClicked

    private void Stock_Genset_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseClicked

   
    String category = Insert_Gen_Category.getText().toUpperCase();
    String brand = Insert_Gen_Band.getSelectedItem().toString().toUpperCase();
    String model= Insert_Gen_Model.getText().toUpperCase();
    String kva = Insert_Gen_kva.getText().toUpperCase();
    String phasing = Insert_Gen_Phasing.getSelectedItem().toString().toUpperCase();
    String type = Insert_Gen_Type.getSelectedItem().toString().toUpperCase();
    String supplier_price = Insert_Gen_Supplier_Price.getText().toUpperCase();
    String seller_price = Insert_Gen_Seller_Price.getText().toUpperCase();
    String quantity = Insert_Gen_quantity.getText();
    int total_price = Integer.parseInt(Insert_Gen_Total_price.getText());
    
    
    String engine_sn = Insert_Gen_Engine.getText().toUpperCase();
    String alternator_sn = Insert_Gen_Alternator.getText().toUpperCase();
    
    // String supplier_id ;
    String date_inbound = Insert_Gen_date_inbound.getText().toUpperCase();
    // image
    String incharge = "";
    String remarks = Insert_Gen_Remarks.getText().toUpperCase();
    String supplier = Insert_Gen_Supplier_Name.getText();
 
    /// SUpplier info
 
    if(brand.equals("SELECT") || model.equals("") || kva.equals("") || phasing.equals("SELECT") || type.equals("SELECT") || supplier_price.equals("") || seller_price.equals("") || quantity.equals("") || engine_sn.equals("") || alternator_sn.equals("") || supplier.equals("") )
    {
        JOptionPane.showMessageDialog(null, "FILL SOME BLANCK","",JOptionPane.ERROR_MESSAGE);
    }
    else if(!Class_SummaryStock.InsertStock(category, brand, model, kva, phasing, type, supplier_price, seller_price, quantity, total_price, engine_sn, alternator_sn, supplier_id, date_inbound, images, incharge, remarks))
    {
        JOptionPane.showMessageDialog(null, "SUCCESSFULLY ADDED !"); Webpage.Refresh(); dispose();
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
//        JTab.setSelectedIndex(1);
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

    private void Supplier_List_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplier_List_BtnMouseClicked
        Table_Supplier ts = new Table_Supplier();
        ts.setVisible(true);
        Table_Supplier.Supplier_path.setText("INSERT_GENERATOR");
       
    }//GEN-LAST:event_Supplier_List_BtnMouseClicked

    private void Insert_Gen_BandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Insert_Gen_BandMouseClicked

    }//GEN-LAST:event_Insert_Gen_BandMouseClicked

    private void Insert_Gen_BandMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Insert_Gen_BandMousePressed

    }//GEN-LAST:event_Insert_Gen_BandMousePressed

    private void Insert_Gen_BandMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Insert_Gen_BandMouseReleased

    }//GEN-LAST:event_Insert_Gen_BandMouseReleased

    private void Insert_Gen_BandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_Gen_BandActionPerformed
        String brand = Insert_Gen_Band.getSelectedItem().toString();
    
    }//GEN-LAST:event_Insert_Gen_BandActionPerformed

    private void Insert_Gen_AlternatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_Gen_AlternatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Insert_Gen_AlternatorActionPerformed

    private void Insert_Gen_Seller_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_Gen_Seller_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Insert_Gen_Seller_PriceActionPerformed

    private void Insert_Gen_quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Insert_Gen_quantityKeyReleased
        try{
            String number  = Insert_Gen_quantity.getText() ;
            int inputQuantity = Integer.parseInt(Insert_Gen_quantity.getText());
        }
        catch(NumberFormatException  e){
           Insert_Gen_quantity.setText("");
        }
    }//GEN-LAST:event_Insert_Gen_quantityKeyReleased

    private void Insert_Gen_Total_priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Insert_Gen_Total_priceKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Insert_Gen_Total_priceKeyReleased

    private void Inventory_DisplayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Inventory_DisplayAncestorAdded

    }//GEN-LAST:event_Inventory_DisplayAncestorAdded

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
    public static javax.swing.JTextField Insert_Gen_Alternator;
    public static javax.swing.JComboBox<String> Insert_Gen_Band;
    public static javax.swing.JTextField Insert_Gen_Category;
    public static javax.swing.JTextField Insert_Gen_Engine;
    public static javax.swing.JTextField Insert_Gen_Model;
    private javax.swing.JComboBox<String> Insert_Gen_Phasing;
    public static javax.swing.JLabel Insert_Gen_Pic;
    public static javax.swing.JTextArea Insert_Gen_Remarks;
    public static javax.swing.JTextField Insert_Gen_Seller_Price;
    public static javax.swing.JTextArea Insert_Gen_Supplier_Address;
    public static javax.swing.JTextField Insert_Gen_Supplier_Contact;
    public static javax.swing.JTextField Insert_Gen_Supplier_Name;
    public static javax.swing.JTextField Insert_Gen_Supplier_Price;
    public static javax.swing.JTextField Insert_Gen_Total_price;
    private javax.swing.JComboBox<String> Insert_Gen_Type;
    public static datechooser.beans.DateChooserCombo Insert_Gen_date_inbound;
    public static javax.swing.JTextField Insert_Gen_kva;
    public static javax.swing.JTextField Insert_Gen_quantity;
    public static javax.swing.JTextField Insert_Invetory_Supplier_id;
    private javax.swing.JLabel Inventory_Display;
    public static keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    private javax.swing.JLabel Stock_Genset_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Update;
    private javax.swing.JLabel Stock_Genset_Update;
    private javax.swing.JLabel Supplier_List_Btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
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
