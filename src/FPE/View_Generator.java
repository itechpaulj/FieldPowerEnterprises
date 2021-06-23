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
public class View_Generator extends javax.swing.JFrame {
    public static String Generator_id = null;
    public static String Supplier_id = null;
    
    String filename = null;
    public static File resoucesDirectory ;
  
    public static byte[] images = null;
    String DateTime;

    public View_Generator() {
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
        View_Generator_Banner = new javax.swing.JLabel();
        KG2_ADD_STOCK_GENSET = new keeptoo.KGradientPanel();
        View_Gen_Pic = new javax.swing.JLabel();
        View_Gen_Supplier_Price = new javax.swing.JTextField();
        View_Gen_Model = new javax.swing.JTextField();
        View_Gen_Category = new javax.swing.JTextField();
        View_Gen_Brand = new javax.swing.JTextField();
        View_Gen_Alternator = new javax.swing.JTextField();
        View_Gen_Seller_Price = new javax.swing.JTextField();
        View_Gen__Engine = new javax.swing.JTextField();
        View_Gen_kva = new javax.swing.JTextField();
        View_Gen_Supplier_Contact = new javax.swing.JTextField();
        View_Gen_Supplier_Email = new javax.swing.JTextField();
        View_Gen_Supplier_Name = new javax.swing.JTextField();
        Insert_Gen_Brand = new javax.swing.JComboBox<>();
        View_Gen_Date = new datechooser.beans.DateChooserCombo();
        jScrollPane1 = new javax.swing.JScrollPane();
        View_Gen_Supplier_Address = new javax.swing.JTextArea();
        Panel_View_Btn = new javax.swing.JPanel();
        View_Btn = new javax.swing.JLabel();
        Panel_Back_Btn = new javax.swing.JPanel();
        Back_Btn = new javax.swing.JLabel();
        Path = new javax.swing.JLabel();
        other = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        View_Gen_Type = new javax.swing.JComboBox<>();
        View_Gen_Phasing = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        Supplier_List_Btn = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        View_Gen_Remarks = new javax.swing.JTextField();
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

        View_Generator_Banner.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        View_Generator_Banner.setForeground(new java.awt.Color(255, 255, 255));
        View_Generator_Banner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Generator_Banner.setText("VIEW GENERATOR ITEM");
        View_Generator_Banner.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                View_Generator_BannerAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(View_Generator_Banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 1020, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 100));

        KG2_ADD_STOCK_GENSET.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setPreferredSize(new java.awt.Dimension(1390, 725));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        View_Gen_Pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Gen_Pic.setForeground(new java.awt.Color(20, 31, 31));
        View_Gen_Pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Gen_Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Default_Imge.png"))); // NOI18N
        View_Gen_Pic.setAlignmentY(1.0F);
        View_Gen_Pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)));
        View_Gen_Pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                View_Gen_PicMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Gen_Pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 360, 150));

        View_Gen_Supplier_Price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_Supplier_Price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Gen_Supplier_Price.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Gen_Supplier_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 220, 31));

        View_Gen_Model.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_Model.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Gen_Model.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Gen_Model, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 220, 31));

        View_Gen_Category.setEditable(false);
        View_Gen_Category.setBackground(new java.awt.Color(204, 204, 204));
        View_Gen_Category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_Category.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Gen_Category.setText("GENERATOR");
        View_Gen_Category.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Gen_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 220, 31));

        View_Gen_Brand.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_Brand.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Gen_Brand.setBorder(null);
        View_Gen_Brand.setEnabled(false);
        View_Gen_Brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_Gen_BrandActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Gen_Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 220, 31));

        View_Gen_Alternator.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_Alternator.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Gen_Alternator.setBorder(null);
        View_Gen_Alternator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_Gen_AlternatorActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Gen_Alternator, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 220, 30));

        View_Gen_Seller_Price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_Seller_Price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Gen_Seller_Price.setBorder(null);
        View_Gen_Seller_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_Gen_Seller_PriceActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Gen_Seller_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 220, 31));

        View_Gen__Engine.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen__Engine.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Gen__Engine.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Gen__Engine, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 220, 31));

        View_Gen_kva.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_kva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Gen_kva.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Gen_kva, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 220, 31));

        View_Gen_Supplier_Contact.setBackground(new java.awt.Color(204, 204, 204));
        View_Gen_Supplier_Contact.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_Supplier_Contact.setForeground(new java.awt.Color(51, 51, 51));
        View_Gen_Supplier_Contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Gen_Supplier_Contact.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Gen_Supplier_Contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 270, 220, 31));

        View_Gen_Supplier_Email.setBackground(new java.awt.Color(204, 204, 204));
        View_Gen_Supplier_Email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_Supplier_Email.setForeground(new java.awt.Color(51, 51, 51));
        View_Gen_Supplier_Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Gen_Supplier_Email.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Gen_Supplier_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 220, 220, 31));

        View_Gen_Supplier_Name.setBackground(new java.awt.Color(204, 204, 204));
        View_Gen_Supplier_Name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_Supplier_Name.setForeground(new java.awt.Color(51, 51, 51));
        View_Gen_Supplier_Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Gen_Supplier_Name.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Gen_Supplier_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 70, 220, 31));

        Insert_Gen_Brand.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Gen_Brand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "YANDONG", "CUMMINS", "ISUZU", "PERKINS", "WEIFANG", "YAMADA" }));
        Insert_Gen_Brand.setBorder(null);
        Insert_Gen_Brand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Insert_Gen_BrandMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Insert_Gen_BrandMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Insert_Gen_BrandMouseReleased(evt);
            }
        });
        Insert_Gen_Brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_Gen_BrandActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Insert_Gen_Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 220, 31));

        View_Gen_Date.setCalendarPreferredSize(new java.awt.Dimension(500, 400));
        View_Gen_Date.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 14));
        View_Gen_Date.setNavigateFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));
        KG2_ADD_STOCK_GENSET.add(View_Gen_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 220, 31));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        View_Gen_Supplier_Address.setBackground(new java.awt.Color(204, 204, 204));
        View_Gen_Supplier_Address.setColumns(10);
        View_Gen_Supplier_Address.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_Supplier_Address.setForeground(new java.awt.Color(51, 51, 51));
        View_Gen_Supplier_Address.setRows(5);
        View_Gen_Supplier_Address.setTabSize(5);
        View_Gen_Supplier_Address.setAlignmentX(3.0F);
        View_Gen_Supplier_Address.setAlignmentY(2.0F);
        View_Gen_Supplier_Address.setBorder(null);
        View_Gen_Supplier_Address.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jScrollPane1.setViewportView(View_Gen_Supplier_Address);

        KG2_ADD_STOCK_GENSET.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 120, 220, 80));

        Panel_View_Btn.setBackground(new java.awt.Color(51, 187, 255));
        Panel_View_Btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        View_Btn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        View_Btn.setForeground(new java.awt.Color(255, 255, 255));
        View_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Save.png"))); // NOI18N
        View_Btn.setText(" UPDATE");
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
            .addComponent(View_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Panel_View_BtnLayout.setVerticalGroup(
            Panel_View_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(View_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Panel_View_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 210, 50));

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
            .addComponent(Back_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Panel_Back_BtnLayout.setVerticalGroup(
            Panel_Back_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Back_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Panel_Back_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 210, 50));

        Path.setText("1");
        KG2_ADD_STOCK_GENSET.add(Path, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 100, 40));
        KG2_ADD_STOCK_GENSET.add(other, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 110, 20));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(51, 214, 255));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setText(" BRAND ");
        jTextField1.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 140, 31));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(51, 214, 255));
        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setText(" CATEGORY");
        jTextField2.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 140, 31));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(51, 214, 255));
        jTextField3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField3.setText(" KVA");
        jTextField3.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 140, 31));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(51, 214, 255));
        jTextField4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField4.setText(" MODEL");
        jTextField4.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 140, 31));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(51, 214, 255));
        jTextField5.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField5.setText(" SUPPLIER PRICE");
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 140, 31));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(51, 214, 255));
        jTextField6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField6.setText(" DATE RECIEVED");
        jTextField6.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 140, 31));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(51, 214, 255));
        jTextField7.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField7.setText(" UNIT TYPE ");
        jTextField7.setBorder(null);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 140, 31));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(51, 214, 255));
        jTextField8.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField8.setText(" PHASING");
        jTextField8.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 140, 31));

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(51, 214, 255));
        jTextField9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField9.setText(" ADDRESS");
        jTextField9.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, 140, 31));

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(51, 214, 255));
        jTextField10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField10.setText(" ALTERNATOR S.N.");
        jTextField10.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 140, 31));

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(51, 214, 255));
        jTextField11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField11.setText(" ENGINE S.N");
        jTextField11.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 140, 31));

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(51, 214, 255));
        jTextField12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField12.setText(" SELLER PRICE");
        jTextField12.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 140, 31));

        View_Gen_Type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "SILENT TYPE", "OPEN TYPE" }));
        View_Gen_Type.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Gen_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 220, 31));

        View_Gen_Phasing.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_Phasing.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "SINGLE PHASE", "THREE PHASE" }));
        View_Gen_Phasing.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Gen_Phasing, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 220, 31));

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

        jTextField13.setEditable(false);
        jTextField13.setBackground(new java.awt.Color(51, 214, 255));
        jTextField13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField13.setText(" NAME");
        jTextField13.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, 140, 31));

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(51, 214, 255));
        jTextField14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField14.setText(" EMAIL");
        jTextField14.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 220, 140, 31));

        jTextField15.setEditable(false);
        jTextField15.setBackground(new java.awt.Color(51, 214, 255));
        jTextField15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField15.setText(" CONTACT NO");
        jTextField15.setBorder(null);
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 270, 140, 31));

        jTextField16.setEditable(false);
        jTextField16.setBackground(new java.awt.Color(51, 214, 255));
        jTextField16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField16.setText(" REMARKS");
        jTextField16.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 140, 31));

        View_Gen_Remarks.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_Remarks.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Gen_Remarks.setBorder(null);
        View_Gen_Remarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_Gen_RemarksActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Gen_Remarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 220, 31));

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)), "SUPPLIER INFO", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 20), new java.awt.Color(0, 51, 51))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 420, 460));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)), "ADDING NEW GENERATOR", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 20), new java.awt.Color(0, 51, 51))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 800, 460));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1280, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void View_Gen_PicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_Gen_PicMouseClicked
        View_Gen_Pic.setText(null);
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        

        ImageIcon imageicon = new ImageIcon (new ImageIcon(filename).getImage().getScaledInstance(View_Gen_Pic.getWidth(), View_Gen_Pic.getHeight(),Image.SCALE_SMOOTH) );
        View_Gen_Pic.setIcon(imageicon);

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
    }//GEN-LAST:event_View_Gen_PicMouseClicked

    private void View_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_BtnMouseClicked

    String date = View_Gen_Date.getText().toUpperCase();
    String category = View_Gen_Category.getText().toUpperCase();
    String brand = Insert_Gen_Brand.getSelectedItem().toString().toUpperCase();
    String model= View_Gen_Model.getText().toUpperCase();
    String kva = View_Gen_kva.getText().toUpperCase();
    String phasing = View_Gen_Phasing.getSelectedItem().toString().toUpperCase();
    String type = View_Gen_Type.getSelectedItem().toString().toUpperCase();
    
    String supplier_price = View_Gen_Supplier_Price.getText().toUpperCase();
    String seller_price = View_Gen_Seller_Price.getText().toUpperCase();
    String engine_sn = View_Gen__Engine.getText().toUpperCase();
    String alternator_sn = View_Gen_Alternator.getText().toUpperCase();
    String remarks = View_Gen_Remarks.getText().toUpperCase();
    
    String person_in_charge = "";
    String quantity = "1";
   
    String supplier_name = View_Gen_Supplier_Name.getText();
    
    String supplier_address = View_Gen_Supplier_Address.getText();
    String supplier_email = View_Gen_Supplier_Email.getText();
    String supplier_contact = View_Gen_Supplier_Contact.getText();
    Class_tables ct = new Class_tables();
    if(!Class_SummaryStock.UpdateStock(date, category, brand, model, kva, phasing, type, supplier_price, seller_price, engine_sn, alternator_sn, quantity, person_in_charge, remarks, supplier_name,Supplier_id, images, Generator_id))  
    {
        ct.Stocks();
        JOptionPane.showMessageDialog(null, "UPDATE SUCCESSFULLY","",JOptionPane.INFORMATION_MESSAGE);
    }else{
        ct.Stocks();
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
    }//GEN-LAST:event_View_BtnMouseClicked

    private void View_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_BtnMouseEntered
    
        Panel_View_Btn.setBackground(new Color(0, 179, 60));
    }//GEN-LAST:event_View_BtnMouseEntered

    private void View_BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_BtnMouseExited
  
        Panel_View_Btn.setBackground(new Color(51, 187, 255));
    }//GEN-LAST:event_View_BtnMouseExited

    private void Back_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_BtnMouseClicked
    Class_tables ct = new Class_tables();
    ct.Stocks();
    Webpage.Stock_cat = null;
    dispose();
    }//GEN-LAST:event_Back_BtnMouseClicked

    private void Back_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_BtnMouseEntered
      
        Panel_Back_Btn.setBackground(new Color(0, 179, 60));
    }//GEN-LAST:event_Back_BtnMouseEntered

    private void Back_BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_BtnMouseExited
     
        Panel_Back_Btn.setBackground(new Color(255,214,122));
    }//GEN-LAST:event_Back_BtnMouseExited

    private void View_Generator_BannerAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_View_Generator_BannerAncestorAdded
    String Banner = View_Generator_Banner.getText();
    String ids = Webpage.Stock_Category_Id.getText();
    
    if(Banner.equals("VIEW GENERATOR ITEM"))
    {
        try{
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `summary_stock` WHERE `ID` = '"+ids+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Generator_id = rs.getString("ID");   
            Supplier_id = rs.getString("SUPPLIER ID");
            System.out.println(Generator_id);
            System.out.println(Supplier_id);
            View_Gen_Date.setText(rs.getString("DATE RECEIVED"));
            View_Gen_Category.setText(rs.getString("CATEGORY"));
            
            Insert_Gen_Brand.setSelectedItem(rs.getString("BRAND"));
            View_Gen_Brand.setText(rs.getString("BRAND"));
            
            View_Gen_Model.setText(rs.getString("MODEL"));
            View_Gen_kva.setText(rs.getString("KVA"));
            View_Gen_Phasing.setSelectedItem(rs.getString("PHASING"));
            View_Gen_Type.setSelectedItem(rs.getString("TYPE"));
            View_Gen_Supplier_Price.setText(rs.getString("SUPPLIER PRICE"));
            View_Gen_Seller_Price.setText(rs.getString("SELLER PRICE"));
            View_Gen__Engine.setText(rs.getString("ENGINE S N"));
            View_Gen_Alternator.setText(rs.getString("ALTERNATOR S N"));
            View_Gen_Remarks.setText(rs.getString("REMARKS"));
            View_Gen_Supplier_Name.setText(rs.getString("SUPPLIER"));
            
            images = rs.getBytes("IMAGE");
            ImageIcon imageicon = new ImageIcon (new ImageIcon(images).getImage().getScaledInstance(View_Gen_Pic.getWidth(), View_Gen_Pic.getHeight(),Image.SCALE_SMOOTH) );
            View_Gen_Pic.setIcon(imageicon);
         
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
         try{
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `supplier_table` WHERE `ID` = '"+Supplier_id+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
//            Supplier_id = rs.getString("ID");
//            System.out.println(Supplier_id);
            
            View_Gen_Supplier_Name.setText(rs.getString("NAME"));
            View_Gen_Supplier_Address.setText(rs.getString("ADDRESS"));
            View_Gen_Supplier_Email.setText(rs.getString("EMAIL"));
            View_Gen_Supplier_Contact.setText(rs.getString("CONTACT"));
            
            
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
       
    }
    
        
    }//GEN-LAST:event_View_Generator_BannerAncestorAdded

    private void Supplier_List_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplier_List_BtnMouseClicked
        Table_Supplier ts = new Table_Supplier();
        ts.setVisible(true);
        Table_Supplier.Supplier_path.setText("VIEW_GENERATOR");
       
    }//GEN-LAST:event_Supplier_List_BtnMouseClicked

    private void Insert_Gen_BrandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Insert_Gen_BrandMouseClicked
    
               
    }//GEN-LAST:event_Insert_Gen_BrandMouseClicked

    private void Insert_Gen_BrandMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Insert_Gen_BrandMousePressed
   
    }//GEN-LAST:event_Insert_Gen_BrandMousePressed

    private void Insert_Gen_BrandMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Insert_Gen_BrandMouseReleased
      
        
    }//GEN-LAST:event_Insert_Gen_BrandMouseReleased

    private void Insert_Gen_BrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_Gen_BrandActionPerformed
       String ty = Insert_Gen_Brand.getSelectedItem().toString();
       int tys = Insert_Gen_Brand.getSelectedIndex();
        if(ty.equals("OTHER BRAND")){
       
        View_Gen_Brand.setText(null);
        View_Gen_Brand.enable(true);
        other.setText("OTHER BRAND");
            
        }else{
        View_Gen_Brand.setText(Insert_Gen_Brand.getSelectedItem().toString());
        View_Gen_Brand.enable(false);
        other.setText("");
        }
    }//GEN-LAST:event_Insert_Gen_BrandActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void View_Gen_Seller_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_Gen_Seller_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_View_Gen_Seller_PriceActionPerformed

    private void View_Gen_AlternatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_Gen_AlternatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_View_Gen_AlternatorActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void View_Gen_RemarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_Gen_RemarksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_View_Gen_RemarksActionPerformed

    private void View_Gen_BrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_Gen_BrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_View_Gen_BrandActionPerformed

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
    public static javax.swing.JComboBox<String> Insert_Gen_Brand;
    public static javax.swing.JTextField Insert_Invetory_Supplier_id;
    public static keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    public static javax.swing.JPanel Panel_Back_Btn;
    public static javax.swing.JPanel Panel_View_Btn;
    public static javax.swing.JLabel Path;
    private javax.swing.JLabel Supplier_List_Btn;
    private javax.swing.JLabel View_Btn;
    public static javax.swing.JTextField View_Gen_Alternator;
    public static javax.swing.JTextField View_Gen_Brand;
    public static javax.swing.JTextField View_Gen_Category;
    public static datechooser.beans.DateChooserCombo View_Gen_Date;
    public static javax.swing.JTextField View_Gen_Model;
    private javax.swing.JComboBox<String> View_Gen_Phasing;
    public static javax.swing.JLabel View_Gen_Pic;
    public static javax.swing.JTextField View_Gen_Remarks;
    public static javax.swing.JTextField View_Gen_Seller_Price;
    public static javax.swing.JTextArea View_Gen_Supplier_Address;
    public static javax.swing.JTextField View_Gen_Supplier_Contact;
    public static javax.swing.JTextField View_Gen_Supplier_Email;
    public static javax.swing.JTextField View_Gen_Supplier_Name;
    public static javax.swing.JTextField View_Gen_Supplier_Price;
    private javax.swing.JComboBox<String> View_Gen_Type;
    public static javax.swing.JTextField View_Gen__Engine;
    public static javax.swing.JTextField View_Gen_kva;
    public static javax.swing.JLabel View_Generator_Banner;
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
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel other;
    // End of variables declaration//GEN-END:variables
}
