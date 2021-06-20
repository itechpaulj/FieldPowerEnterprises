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
import java.util.Date;
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
    
    
    public static byte[] images = null;
    public static String Supplier_id ;
    
    public Insert_Generator() {
        initComponents();
        imgisNull();
        showDate();
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
        Inventory_Display = new javax.swing.JLabel();
        KG2_ADD_STOCK_GENSET = new keeptoo.KGradientPanel();
        Stock_Genset_Panel_Update = new javax.swing.JPanel();
        Stock_Genset_Update = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        Stock_Genset_Back = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Supplier_List_Btn = new javax.swing.JLabel();
        Insert_Gen_Pic = new javax.swing.JLabel();
        Insert_Gen_Model = new javax.swing.JTextField();
        Insert_Gen_Band1 = new javax.swing.JTextField();
        Insert_Gen_Category = new javax.swing.JTextField();
        Insert_Gen_Remarks = new javax.swing.JTextField();
        Insert_Gen_Alternator = new javax.swing.JTextField();
        Insert_Gen_Engine = new javax.swing.JTextField();
        Insert_Gen_Seller_Price = new javax.swing.JTextField();
        Insert_Gen_Supplier_Price = new javax.swing.JTextField();
        Insert_Gen_kva = new javax.swing.JTextField();
        Insert_Gen_Supplier_Name = new javax.swing.JTextField();
        Insert_Gen_Supplier_Email = new javax.swing.JTextField();
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
        jTextField14 = new javax.swing.JTextField();
        Insert_Gen_id = new datechooser.beans.DateChooserCombo();
        jScrollPane1 = new javax.swing.JScrollPane();
        Insert_Gen_Supplier_Address = new javax.swing.JTextArea();
        jTextField15 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        Insert_Invetory_Supplier_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Invetory_Supplier_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Invetory_Supplier_id.setBorder(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 51, 74));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Inventory_Display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Inventory_Display.setForeground(new java.awt.Color(255, 255, 255));
        Inventory_Display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Inventory_Display.setText("ADD NEW GENERATOR STOCK");
        Inventory_Display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Inventory_DisplayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(Inventory_Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 1020, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 100));

        KG2_ADD_STOCK_GENSET.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
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

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 170, 50));

        Stock_Genset_Panel_Back.setBackground(new java.awt.Color(185, 144, 149));

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
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_BackLayout.setVerticalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 170, 50));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Supplier_List_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Supplier_List_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 320, 210, -1));

        Insert_Gen_Pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Insert_Gen_Pic.setForeground(new java.awt.Color(20, 31, 31));
        Insert_Gen_Pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Insert_Gen_Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Default_Imge.png"))); // NOI18N
        Insert_Gen_Pic.setAlignmentY(1.0F);
        Insert_Gen_Pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)));
        Insert_Gen_Pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Insert_Gen_PicMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 360, 150));

        Insert_Gen_Model.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Gen_Model.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Gen_Model.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Model, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 220, 31));

        Insert_Gen_Band1.setEditable(false);
        Insert_Gen_Band1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Gen_Band1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Gen_Band1.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Band1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 220, 31));

        Insert_Gen_Category.setEditable(false);
        Insert_Gen_Category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Gen_Category.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Gen_Category.setText("GENERATOR");
        Insert_Gen_Category.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 220, 31));

        Insert_Gen_Remarks.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Gen_Remarks.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Gen_Remarks.setBorder(null);
        Insert_Gen_Remarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_Gen_RemarksActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Remarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 220, 31));

        Insert_Gen_Alternator.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Gen_Alternator.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Gen_Alternator.setBorder(null);
        Insert_Gen_Alternator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_Gen_AlternatorActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Alternator, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 220, 30));

        Insert_Gen_Engine.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Gen_Engine.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Gen_Engine.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Engine, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 220, 31));

        Insert_Gen_Seller_Price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Gen_Seller_Price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Gen_Seller_Price.setBorder(null);
        Insert_Gen_Seller_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_Gen_Seller_PriceActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Seller_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 220, 31));

        Insert_Gen_Supplier_Price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Gen_Supplier_Price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Gen_Supplier_Price.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Supplier_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 220, 31));

        Insert_Gen_kva.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Gen_kva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Gen_kva.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_kva, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 220, 31));

        Insert_Gen_Supplier_Name.setEditable(false);
        Insert_Gen_Supplier_Name.setBackground(new java.awt.Color(204, 204, 204));
        Insert_Gen_Supplier_Name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Gen_Supplier_Name.setForeground(new java.awt.Color(51, 51, 51));
        Insert_Gen_Supplier_Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Gen_Supplier_Name.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Supplier_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 70, 220, 31));

        Insert_Gen_Supplier_Email.setEditable(false);
        Insert_Gen_Supplier_Email.setBackground(new java.awt.Color(204, 204, 204));
        Insert_Gen_Supplier_Email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Gen_Supplier_Email.setForeground(new java.awt.Color(51, 51, 51));
        Insert_Gen_Supplier_Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Gen_Supplier_Email.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Supplier_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 220, 220, 31));

        Insert_Gen_Supplier_Contact.setEditable(false);
        Insert_Gen_Supplier_Contact.setBackground(new java.awt.Color(204, 204, 204));
        Insert_Gen_Supplier_Contact.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Gen_Supplier_Contact.setForeground(new java.awt.Color(51, 51, 51));
        Insert_Gen_Supplier_Contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Gen_Supplier_Contact.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Supplier_Contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 270, 220, 31));

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
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Band, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 220, 31));

        Insert_Gen_Type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Gen_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "SILENT TYPE", "OPEN TYPE" }));
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 220, 31));

        Insert_Gen_Phasing.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Gen_Phasing.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "SINGLE PHASE", "THREE PHASE" }));
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Phasing, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 220, 31));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(102, 255, 102));
        jTextField4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField4.setText("  MODEL");
        jTextField4.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 140, 31));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(102, 255, 102));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setText("  BRAND ");
        jTextField1.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 140, 31));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(102, 255, 102));
        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setText("  CATEGORY");
        jTextField2.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 140, 31));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(102, 255, 102));
        jTextField6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField6.setText("  DATE RECIEVED");
        jTextField6.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 140, 31));

        jTextField16.setEditable(false);
        jTextField16.setBackground(new java.awt.Color(102, 255, 102));
        jTextField16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField16.setText("  REMARKS");
        jTextField16.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 140, 31));

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(102, 255, 102));
        jTextField10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField10.setText("  ALTERNATOR S.N.");
        jTextField10.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 140, 31));

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(102, 255, 102));
        jTextField11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField11.setText("  ENGINE S.N");
        jTextField11.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 140, 31));

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(102, 255, 102));
        jTextField12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField12.setText("  SELLER PRICE");
        jTextField12.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 140, 31));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(102, 255, 102));
        jTextField8.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField8.setText("  CONTACT");
        jTextField8.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 270, 140, 31));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(102, 255, 102));
        jTextField3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField3.setText("  KVA");
        jTextField3.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 140, 31));

        jTextField13.setEditable(false);
        jTextField13.setBackground(new java.awt.Color(102, 255, 102));
        jTextField13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField13.setText("  NAME");
        jTextField13.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, 140, 31));

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(102, 255, 102));
        jTextField9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField9.setText("  ADDRESS");
        jTextField9.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, 140, 31));

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(102, 255, 102));
        jTextField14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField14.setText("  EMAIL");
        jTextField14.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 220, 140, 31));

        Insert_Gen_id.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
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
    Insert_Gen_id.setCalendarPreferredSize(new java.awt.Dimension(500, 400));
    Insert_Gen_id.setWeekStyle(datechooser.view.WeekDaysStyle.FULL);
    Insert_Gen_id.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 14));
    Insert_Gen_id.setNavigateFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));
    Insert_Gen_id.setCurrentNavigateIndex(0);
    KG2_ADD_STOCK_GENSET.add(Insert_Gen_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 220, 31));

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

    KG2_ADD_STOCK_GENSET.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 120, 220, 80));

    jTextField15.setEditable(false);
    jTextField15.setBackground(new java.awt.Color(102, 255, 102));
    jTextField15.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
    jTextField15.setHorizontalAlignment(javax.swing.JTextField.LEFT);
    jTextField15.setText("  PHASING");
    jTextField15.setBorder(null);
    KG2_ADD_STOCK_GENSET.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 140, 31));

    jTextField17.setEditable(false);
    jTextField17.setBackground(new java.awt.Color(102, 255, 102));
    jTextField17.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
    jTextField17.setHorizontalAlignment(javax.swing.JTextField.LEFT);
    jTextField17.setText("  TYPE");
    jTextField17.setBorder(null);
    KG2_ADD_STOCK_GENSET.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 140, 31));

    jTextField18.setEditable(false);
    jTextField18.setBackground(new java.awt.Color(102, 255, 102));
    jTextField18.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
    jTextField18.setHorizontalAlignment(javax.swing.JTextField.LEFT);
    jTextField18.setText("  SUPPLIER PRICE");
    jTextField18.setBorder(null);
    KG2_ADD_STOCK_GENSET.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 140, 31));

    jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)), "SUPPLIER INFO", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 20), new java.awt.Color(0, 51, 51))); // NOI18N
    KG2_ADD_STOCK_GENSET.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 420, 460));

    jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)), "ADDING NEW GENERATOR", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 20), new java.awt.Color(0, 51, 51))); // NOI18N
    KG2_ADD_STOCK_GENSET.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 800, 460));

    getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1280, 580));

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

    String date = Insert_Gen_id.getText().toUpperCase();
    String category = Insert_Gen_Category.getText().toUpperCase();
    String brand = Insert_Gen_Band.getSelectedItem().toString().toUpperCase();
    String model= Insert_Gen_Model.getText().toUpperCase();
    String kva = Insert_Gen_kva.getText().toUpperCase();
    String phasing = Insert_Gen_Phasing.getSelectedItem().toString().toUpperCase();
    String type = Insert_Gen_Type.getSelectedItem().toString().toUpperCase();
    
    String supplier_price = Insert_Gen_Supplier_Price.getText().toUpperCase();
    String seller_price = Insert_Gen_Seller_Price.getText().toUpperCase();
    String engine_sn = Insert_Gen_Engine.getText().toUpperCase();
    String alternator_sn = Insert_Gen_Alternator.getText().toUpperCase();
    String remarks = Insert_Gen_Remarks.getText().toUpperCase();
    
    String person_in_charge = "";
    String quantity = "";
   
    
    
    
    String supplier_name = Insert_Gen_Supplier_Name.getText();
    
    String supplier_address = Insert_Gen_Supplier_Address.getText();
    String supplier_email = Insert_Gen_Supplier_Email.getText();
    String supplier_contact = Insert_Gen_Supplier_Contact.getText();
//    String supplier_
    if(!Class_SummaryStock.InsertStock(date, category, brand, model, kva, phasing, type, supplier_price, seller_price, engine_sn, alternator_sn, quantity, person_in_charge, remarks,supplier_name,Supplier_id, images) && !Class_Supplier.AddSupplier(supplier_name, supplier_address, supplier_email, supplier_contact))
    {
        JOptionPane.showMessageDialog(null, "SUCCESSFULY ADDED","",JOptionPane.INFORMATION_MESSAGE);
    }else{
        JOptionPane.showMessageDialog(null, "TRY AGAIN","",JOptionPane.ERROR_MESSAGE);
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//    Class_tables ct = new Class_tables();
//    
//        
//    String Banner = Inventory_Display.getText();
//    
//    String id       = Insert_Gen_Category.getText().toUpperCase();
//    String brand    = Insert_Gen_Band1.getText().toUpperCase(); 
//    String mode     = Insert_Gen_Model.getText().toUpperCase();
//    String kva      = Insert_Gen_kva.getText().toUpperCase();
//    String date     = Insert_Gen_id.getText().toUpperCase();
//
////    String price    = Insert_Invetory_Genset_supplier_price.getText().toUpperCase();
//    String s_price  = Insert_Gen_Seller_Price.getText().toUpperCase(); 
//   
//    String engine_sn     = Insert_Gen_Engine.getText().toUpperCase();
////    String engines       = engine.getSelectedItem().toString() +" - " + engine_sn;
//    
//    String alters1_sn    = Insert_Gen_Alternator.getText().toUpperCase();
////    String alters        = alter.getSelectedItem().toString() + " - " + alters1_sn;
//    
//    String ids  = Insert_Invetory_Supplier_id.getText().toUpperCase();
//    String  name       = Insert_Gen_Supplier_Name.getText().toUpperCase();
//    String  address    = Insert_Gen_Supplier_Address.getText().toUpperCase();
//    String  email      = Insert_Gen_Supplier_Email.getText().toUpperCase();
//    String  contact    = Insert_Gen_Supplier_Contact.getText().toUpperCase();
//    
//    //if default select item combo box
////    String sel_engine = engine.getSelectedItem().toString();
////    String sel_alter = alter.getSelectedItem().toString();
////    
//    String other_brand = other.getText();
//
////    if(brand.equals("") || mode.equals("") || kva.equals("") || date.equals("") || phasing.equals("") || type.equals("") || dimen.equals("") || price.equals("") || s_price.equals("") || name.equals("") || address.equals("") || email.equals("") || contact.equals("") || sel_engine.equals("SELECT") || sel_alter.equals("SELECT")){
////       
////            JOptionPane.showMessageDialog(null,"FILLED SOME BLANKS !!! ","",JOptionPane.ERROR_MESSAGE); 
////    }
////    else if(Banner.equals("ADD GENSET PRODUCT") && Path.getText().equals("1"))
////    {
////        if(other_brand.equals("")){
////            if(!Class_Supplier.ExistSupplier(email)){
////                JOptionPane.showMessageDialog(null, " EXIST SUPPLIER\nPLEASE SELECT SUPPLIER LIST!","",JOptionPane.WARNING_MESSAGE);
////                //Path.setText("2"); // exist supplier
////                ct.Genset(); ct.Supplier();ct.ShopGenset();
////            }
////            else{
////                if(!Class_Stock.AddGenset(date, brand, mode, kva, phasing, type, dimen, price, s_price, engines, alters, images, name) && !Class_Supplier.AddSupplier(name, address, contact, email))
////                {
////                    JOptionPane.showMessageDialog(null, " SUCCESFULL ADDED ","",JOptionPane.INFORMATION_MESSAGE);
////                    ct.Genset(); ct.Supplier();ct.ShopGenset();
////                    dispose();
////                }   
////            }
////        }
////        else{
////            if(other_brand.equals("OTHER BRAND")){
////                 String confirm_otherBrand = brand + " "+other_brand;
////                 if(!Class_Stock.AddGenset(date, confirm_otherBrand, mode, kva, phasing, type, dimen, price, s_price, engines, alters, images, name) && !Class_Supplier.AddSupplier(name, address, contact, email))
////                 {
////                     JOptionPane.showMessageDialog(null, " SUCCESFULL ADDED ","",JOptionPane.INFORMATION_MESSAGE);
////                     ct.Genset(); ct.Supplier();ct.ShopGenset();
////                     dispose();
////                 }    
////            }
////            else{
////                String confirm_otherBrand = brand + " "+other_brand;
////                if(other_brand.equals("OITHER BRAND")){
////                    if(!Class_Stock.AddGenset(date, confirm_otherBrand, mode, kva, phasing, type, dimen, price, s_price, engines, alters, images, name) && !Class_Supplier.AddSupplier(name, address, contact, email))
////                    {
////                        JOptionPane.showMessageDialog(null, " SUCCESFULL ADDED ","",JOptionPane.INFORMATION_MESSAGE);
////                        ct.Genset(); ct.Supplier();ct.ShopGenset();
////                        dispose();
////                    }
////                }
////            }
////            
////        }
////    }
////    else if(Banner.equals("ADD GENSET PRODUCT") && Path.getText().equals("2")){
////        // exist supplier but new genset product
////        if(other_brand.equals("")){
////            if(!Class_Stock.AddGenset(date, brand, mode, kva, phasing, type, dimen, price, s_price, engines, alters, images, name))
////            {
////                JOptionPane.showMessageDialog(null, " SUCCESFULL ADDED ","",JOptionPane.INFORMATION_MESSAGE);
////                ct.Genset(); ct.Supplier();ct.ShopGenset();
////                dispose();
////            }
////        }
////        else{
////            String confirm_otherBrand = brand + " "+ other_brand;
////            if(other_brand.equals("OTHER BRAND")){
////               if(!Class_Stock.AddGenset(date, confirm_otherBrand, mode, kva, phasing, type, dimen, price, s_price, engines, alters, images, name))
////               {
////                   JOptionPane.showMessageDialog(null, " SUCCESFULL ADDED ","",JOptionPane.INFORMATION_MESSAGE);
////                   ct.Genset(); ct.Supplier();ct.ShopGenset();
////                   dispose();
////               }
////            }
////        }
////
////
////    }
////    else if(Banner.equals("UPDATE GENSET PRODUCT"))
////    {
////
////       if(!Class_Stock.UpdateGenset(id,date, brand, mode, kva, phasing, type, dimen, price, s_price, engines, alters, images, name,DateTime) && !Class_Supplier.UpdateSupplier(name, address, contact, email, ids));
////        {
////            JOptionPane.showMessageDialog(null, " SUCCESFULLY UPDATED ","",JOptionPane.INFORMATION_MESSAGE);
////             ct.Genset(); ct.Supplier();ct.ShopGenset();
////             dispose();
////        } 
////    }
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

    private void Inventory_DisplayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Inventory_DisplayAncestorAdded
        
    }//GEN-LAST:event_Inventory_DisplayAncestorAdded

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
        Insert_Gen_Band1.setText(brand);
    }//GEN-LAST:event_Insert_Gen_BandActionPerformed

    private void Insert_Gen_RemarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_Gen_RemarksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Insert_Gen_RemarksActionPerformed

    private void Insert_Gen_AlternatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_Gen_AlternatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Insert_Gen_AlternatorActionPerformed

    private void Insert_Gen_Seller_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_Gen_Seller_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Insert_Gen_Seller_PriceActionPerformed

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
    public static javax.swing.JTextField Insert_Gen_Band1;
    public static javax.swing.JTextField Insert_Gen_Category;
    public static javax.swing.JTextField Insert_Gen_Engine;
    public static javax.swing.JTextField Insert_Gen_Model;
    private javax.swing.JComboBox<String> Insert_Gen_Phasing;
    public static javax.swing.JLabel Insert_Gen_Pic;
    public static javax.swing.JTextField Insert_Gen_Remarks;
    public static javax.swing.JTextField Insert_Gen_Seller_Price;
    public static javax.swing.JTextArea Insert_Gen_Supplier_Address;
    public static javax.swing.JTextField Insert_Gen_Supplier_Contact;
    public static javax.swing.JTextField Insert_Gen_Supplier_Email;
    public static javax.swing.JTextField Insert_Gen_Supplier_Name;
    public static javax.swing.JTextField Insert_Gen_Supplier_Price;
    private javax.swing.JComboBox<String> Insert_Gen_Type;
    public static datechooser.beans.DateChooserCombo Insert_Gen_id;
    public static javax.swing.JTextField Insert_Gen_kva;
    public static javax.swing.JTextField Insert_Invetory_Supplier_id;
    public static javax.swing.JLabel Inventory_Display;
    public static keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    private javax.swing.JLabel Stock_Genset_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Update;
    private javax.swing.JLabel Stock_Genset_Update;
    private javax.swing.JLabel Supplier_List_Btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
