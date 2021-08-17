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
    public static String supplier_id = null;
    
    String filename = null;
    public static File resoucesDirectory ;
  
    public static byte[] images = null;
    String DateTime;
//-----------------------------------------------------------------
    int view_price;
    int view_quantity;
    int view_total;
    
    
    public View_Generator() {
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
        View_Generator_Banner = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        KG2_ADD_STOCK_GENSET = new keeptoo.KGradientPanel();
        View_Gen_Pic = new javax.swing.JLabel();
        View_Gen_Supplier_Price = new javax.swing.JTextField();
        View_Gen_Model = new javax.swing.JTextField();
        View_Gen_Category = new javax.swing.JTextField();
        View_Gen_Alternator = new javax.swing.JTextField();
        View_Gen_Seller_Price = new javax.swing.JTextField();
        View_Gen__Engine = new javax.swing.JTextField();
        View_Gen_kva = new javax.swing.JTextField();
        View_Gen_Supplier_Contact = new javax.swing.JTextField();
        View_Gen_Supplier_Name = new javax.swing.JTextField();
        View_Gen_Brand = new javax.swing.JComboBox<>();
        View_Gen_Date_inbound = new datechooser.beans.DateChooserCombo();
        jScrollPane1 = new javax.swing.JScrollPane();
        View_Gen_Supplier_Address = new javax.swing.JTextArea();
        Panel_View_Btn = new javax.swing.JPanel();
        View_Btn = new javax.swing.JLabel();
        Panel_Back_Btn = new javax.swing.JPanel();
        Back_Btn = new javax.swing.JLabel();
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
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        View_Gen_quantitty = new javax.swing.JTextField();
        Stock_Genset_Panel_View1 = new javax.swing.JPanel();
        Stock_Genset_Delete = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        View_Gen_Remarks = new javax.swing.JTextArea();
        jTextField18 = new javax.swing.JTextField();
        View_Gen_total_price = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        Insert_Invetory_Supplier_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Invetory_Supplier_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Invetory_Supplier_id.setBorder(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 71, 94));
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
        jPanel4.add(View_Generator_Banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 540, 110));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Logo/Logo.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 170, 100));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 130));

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
        View_Gen_Pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)));
        View_Gen_Pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                View_Gen_PicMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Gen_Pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 360, 180));

        View_Gen_Supplier_Price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_Supplier_Price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Gen_Supplier_Price.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Gen_Supplier_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 220, 31));

        View_Gen_Model.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_Model.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Gen_Model.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Gen_Model, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 220, 31));

        View_Gen_Category.setEditable(false);
        View_Gen_Category.setBackground(new java.awt.Color(220, 220, 200));
        View_Gen_Category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_Category.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Gen_Category.setText("GENERATOR");
        View_Gen_Category.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Gen_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 220, 31));

        View_Gen_Alternator.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_Alternator.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Gen_Alternator.setBorder(null);
        View_Gen_Alternator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_Gen_AlternatorActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Gen_Alternator, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 220, 30));

        View_Gen_Seller_Price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_Seller_Price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Gen_Seller_Price.setBorder(null);
        View_Gen_Seller_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_Gen_Seller_PriceActionPerformed(evt);
            }
        });
        View_Gen_Seller_Price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                View_Gen_Seller_PriceKeyTyped(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Gen_Seller_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 220, 31));

        View_Gen__Engine.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen__Engine.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Gen__Engine.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Gen__Engine, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 220, 31));

        View_Gen_kva.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_kva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Gen_kva.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Gen_kva, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 220, 31));

        View_Gen_Supplier_Contact.setBackground(new java.awt.Color(220, 220, 200));
        View_Gen_Supplier_Contact.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_Supplier_Contact.setForeground(new java.awt.Color(51, 51, 51));
        View_Gen_Supplier_Contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Gen_Supplier_Contact.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Gen_Supplier_Contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 220, 220, 31));

        View_Gen_Supplier_Name.setBackground(new java.awt.Color(220, 220, 200));
        View_Gen_Supplier_Name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_Supplier_Name.setForeground(new java.awt.Color(51, 51, 51));
        View_Gen_Supplier_Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Gen_Supplier_Name.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Gen_Supplier_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 70, 220, 31));

        View_Gen_Brand.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_Brand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "YANDONG", "CUMMINS", "ISUZU", "PERKINS", "WEIFANG", "YAMADA" }));
        View_Gen_Brand.setBorder(null);
        View_Gen_Brand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                View_Gen_BrandMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                View_Gen_BrandMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                View_Gen_BrandMouseReleased(evt);
            }
        });
        View_Gen_Brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_Gen_BrandActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Gen_Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 220, 31));

        View_Gen_Date_inbound.setCalendarPreferredSize(new java.awt.Dimension(500, 400));
        View_Gen_Date_inbound.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 14));
        View_Gen_Date_inbound.setNavigateFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));
        KG2_ADD_STOCK_GENSET.add(View_Gen_Date_inbound, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 220, 31));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        View_Gen_Supplier_Address.setBackground(new java.awt.Color(220, 220, 200));
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

        Panel_View_Btn.setBackground(new java.awt.Color(66, 139, 202));

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
            .addGroup(Panel_View_BtnLayout.createSequentialGroup()
                .addComponent(View_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );
        Panel_View_BtnLayout.setVerticalGroup(
            Panel_View_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(View_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Panel_View_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 160, 45));

        Panel_Back_Btn.setBackground(new java.awt.Color(185, 144, 149));

        Back_Btn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Back_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Back_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Back_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/arrow_35px.png"))); // NOI18N
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
                .addComponent(Back_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );
        Panel_Back_BtnLayout.setVerticalGroup(
            Panel_Back_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Back_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Panel_Back_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 160, 45));
        KG2_ADD_STOCK_GENSET.add(other, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 110, 20));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(51, 214, 255));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setText(" BRAND ");
        jTextField1.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 140, 31));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(51, 214, 255));
        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setText(" CATEGORY");
        jTextField2.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 140, 31));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(51, 214, 255));
        jTextField3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField3.setText(" KVA");
        jTextField3.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 140, 31));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(51, 214, 255));
        jTextField4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField4.setText(" MODEL");
        jTextField4.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 140, 31));

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
        KG2_ADD_STOCK_GENSET.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 140, 31));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(51, 214, 255));
        jTextField6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField6.setText(" DATE RECIEVED");
        jTextField6.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 140, 31));

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
        KG2_ADD_STOCK_GENSET.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 140, 31));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(51, 214, 255));
        jTextField8.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField8.setText(" PHASING");
        jTextField8.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 140, 31));

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
        KG2_ADD_STOCK_GENSET.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 140, 31));

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(51, 214, 255));
        jTextField11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField11.setText(" ENGINE S.N");
        jTextField11.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 140, 31));

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(51, 214, 255));
        jTextField12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField12.setText(" SELLER PRICE");
        jTextField12.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 140, 31));

        View_Gen_Type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "SILENT TYPE", "OPEN TYPE" }));
        View_Gen_Type.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Gen_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 220, 31));

        View_Gen_Phasing.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_Phasing.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "SINGLE PHASE", "THREE PHASE" }));
        View_Gen_Phasing.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Gen_Phasing, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 220, 31));

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
            .addComponent(Supplier_List_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Supplier_List_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 390, 240, -1));

        jTextField13.setEditable(false);
        jTextField13.setBackground(new java.awt.Color(51, 214, 255));
        jTextField13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField13.setText(" NAME");
        jTextField13.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, 140, 31));

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
        KG2_ADD_STOCK_GENSET.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 220, 140, 31));

        jTextField16.setEditable(false);
        jTextField16.setBackground(new java.awt.Color(51, 214, 255));
        jTextField16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField16.setText(" REMARKS");
        jTextField16.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 140, 31));

        jTextField17.setEditable(false);
        jTextField17.setBackground(new java.awt.Color(51, 214, 255));
        jTextField17.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField17.setText(" QUANTITY");
        jTextField17.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 140, 31));

        View_Gen_quantitty.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_quantitty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Gen_quantitty.setBorder(null);
        View_Gen_quantitty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                View_Gen_quantittyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                View_Gen_quantittyKeyTyped(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Gen_quantitty, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 220, 31));

        Stock_Genset_Panel_View1.setBackground(new java.awt.Color(255, 102, 102));

        Stock_Genset_Delete.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Delete.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_View.png"))); // NOI18N
        Stock_Genset_Delete.setText("  DELETE ");
        Stock_Genset_Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Genset_DeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Genset_DeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Genset_DeleteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_View1Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_View1);
        Stock_Genset_Panel_View1.setLayout(Stock_Genset_Panel_View1Layout);
        Stock_Genset_Panel_View1Layout.setHorizontalGroup(
            Stock_Genset_Panel_View1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_View1Layout.setVerticalGroup(
            Stock_Genset_Panel_View1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_View1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 170, 45));

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        View_Gen_Remarks.setColumns(10);
        View_Gen_Remarks.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_Remarks.setForeground(new java.awt.Color(51, 51, 51));
        View_Gen_Remarks.setRows(5);
        View_Gen_Remarks.setTabSize(5);
        View_Gen_Remarks.setAlignmentX(3.0F);
        View_Gen_Remarks.setAlignmentY(2.0F);
        View_Gen_Remarks.setBorder(null);
        View_Gen_Remarks.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jScrollPane2.setViewportView(View_Gen_Remarks);

        KG2_ADD_STOCK_GENSET.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 220, 30));

        jTextField18.setEditable(false);
        jTextField18.setBackground(new java.awt.Color(51, 214, 255));
        jTextField18.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField18.setText(" TOTAL PRICE");
        jTextField18.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 140, 31));

        View_Gen_total_price.setEditable(false);
        View_Gen_total_price.setBackground(new java.awt.Color(220, 220, 200));
        View_Gen_total_price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Gen_total_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Gen_total_price.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Gen_total_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 220, 31));

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)), " GENERATOR INFO ", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 790, 490));

        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)), " SUPPLIER INFO ", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 410, 490));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1280, 590));

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

    String category = View_Gen_Category.getText().toUpperCase();
    String brand = View_Gen_Brand.getSelectedItem().toString().toUpperCase();
    String model= View_Gen_Model.getText().toUpperCase();
    String kva = View_Gen_kva.getText().toUpperCase();
    String phasing = View_Gen_Phasing.getSelectedItem().toString().toUpperCase();
    String type = View_Gen_Type.getSelectedItem().toString().toUpperCase();
    String supplier_price = View_Gen_Supplier_Price.getText().toUpperCase();
    String seller_price = View_Gen_Seller_Price.getText().toUpperCase();
    String quantity = View_Gen_quantitty.getText();
    int total_price = Integer.parseInt(View_Gen_total_price.getText());
    
    
    String engine_sn = View_Gen__Engine.getText().toUpperCase();
    String alternator_sn = View_Gen_Alternator.getText().toUpperCase();
    
    // String supplier_id ;
    String date_inbound = View_Gen_Date_inbound.getText().toUpperCase();
    // image
    String incharge = "";
    String remarks = View_Gen_Remarks.getText().toUpperCase();
    String supplier = View_Gen_Supplier_Name.getText();
    
    if(brand.equals("SELECT") || model.equals("") || kva.equals("") || phasing.equals("SELECT") || type.equals("SELECT") || supplier_price.equals("") || seller_price.equals("") || quantity.equals("") || engine_sn.equals("") || alternator_sn.equals("") || supplier.equals("") )
    {
        JOptionPane.showMessageDialog(null, "FILL SOME BLANCK","",JOptionPane.ERROR_MESSAGE);
    }
    else if(!Class_SummaryStock.UpdateStock(category, brand, model, kva, phasing, type, supplier_price, seller_price, quantity, total_price, engine_sn, alternator_sn, supplier_id, date_inbound, images, incharge, remarks, Generator_id))
    {
        JOptionPane.showMessageDialog(null, "SUCCESSFULLY UPDATE !"); Webpage.Refresh(); dispose();
   
    }
    }//GEN-LAST:event_View_BtnMouseClicked

    private void View_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_BtnMouseEntered
    
        Panel_View_Btn.setBackground(new Color(0, 179, 60));
    }//GEN-LAST:event_View_BtnMouseEntered

    private void View_BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_BtnMouseExited
  
        Panel_View_Btn.setBackground(new Color(51, 187, 255));
    }//GEN-LAST:event_View_BtnMouseExited

    private void Back_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_BtnMouseClicked
    Webpage.Refresh();
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
    String ids = Webpage.stock_id;
    
    if(Banner.equals("VIEW GENERATOR ITEM"))
    {
        try{
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `stock_table` WHERE `STOCK ID` = '"+ids+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Generator_id = rs.getString("STOCK ID");   
            
           
           
            View_Gen_Date_inbound.setText(rs.getString("DATE INBOUND"));
            View_Gen_Category.setText(rs.getString("CATEGORY"));
            
            View_Gen_Brand.setSelectedItem(rs.getString("BRAND"));
           
            
            View_Gen_Model.setText(rs.getString("MODEL"));
            View_Gen_kva.setText(rs.getString("KVA"));
            View_Gen_Phasing.setSelectedItem(rs.getString("PHASING"));
            View_Gen_Type.setSelectedItem(rs.getString("TYPE"));
            View_Gen_Supplier_Price.setText(rs.getString("SUPPLIER PRICE"));
            View_Gen_Seller_Price.setText(rs.getString("SELLER PRICE"));
            View_Gen__Engine.setText(rs.getString("ENGINE S.N"));
            View_Gen_Alternator.setText(rs.getString("ALTERNATOR S.N"));
            View_Gen_quantitty.setText(rs.getString("QUANTITY"));
            View_Gen_Remarks.setText(rs.getString("REMARKS"));
            View_Gen_total_price.setText(""+rs.getInt("TOTAL PRICE"));
            
            images = rs.getBytes("IMAGE");
            ImageIcon imageicon = new ImageIcon (new ImageIcon(images).getImage().getScaledInstance(View_Gen_Pic.getWidth(), View_Gen_Pic.getHeight(),Image.SCALE_SMOOTH) );
            View_Gen_Pic.setIcon(imageicon);
          supplier_id = rs.getString("SUPPLIER ID");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
         try{
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `supplier_table` WHERE `ID` = '"+supplier_id+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
//            Supplier_id = rs.getString("ID");
//            System.out.println(Supplier_id);
            
            View_Gen_Supplier_Name.setText(rs.getString("NAME"));
            View_Gen_Supplier_Address.setText(rs.getString("ADDRESS"));
      
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

    private void View_Gen_BrandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_Gen_BrandMouseClicked
    
               
    }//GEN-LAST:event_View_Gen_BrandMouseClicked

    private void View_Gen_BrandMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_Gen_BrandMousePressed
   
    }//GEN-LAST:event_View_Gen_BrandMousePressed

    private void View_Gen_BrandMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_Gen_BrandMouseReleased
      
        
    }//GEN-LAST:event_View_Gen_BrandMouseReleased

    private void View_Gen_BrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_Gen_BrandActionPerformed

    }//GEN-LAST:event_View_Gen_BrandActionPerformed

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

    private void Stock_Genset_DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_DeleteMouseClicked
        String sid = Webpage.stock_id;

        if(sid.equals("")){
            JOptionPane.showMessageDialog(null, " PLEASE SELECT! ","",JOptionPane.ERROR_MESSAGE);
               
        }
        else{
            int opt = JOptionPane.showConfirmDialog(null, "YOU WANT TO DELETE THIS STOCK ? ","",JOptionPane.YES_NO_OPTION);
            if(opt==0){
                if(JOptionPane.YES_NO_OPTION == JOptionPane.YES_OPTION && !Class_SummaryStock.DeleteGenset(sid) ){
                    JOptionPane.showMessageDialog(null, " DELETE STOCK! ","",JOptionPane.ERROR_MESSAGE);
                    Webpage.Refresh();
                    dispose();
                }
            }
        }
    }//GEN-LAST:event_Stock_Genset_DeleteMouseClicked

    private void Stock_Genset_DeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_DeleteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_DeleteMouseEntered

    private void Stock_Genset_DeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_DeleteMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_DeleteMouseExited

    private void View_Gen_quantittyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_View_Gen_quantittyKeyReleased
          String q = View_Gen_quantitty.getText();
     view_price = Integer.parseInt(View_Gen_Seller_Price.getText());
     if(q.isEmpty())
     {
        view_total  = view_price * 0;
     
        View_Gen_total_price.setText(""+view_total);  
     }
     else{
        view_quantity  = Integer.parseInt(View_Gen_quantitty.getText());
        view_total  = view_price * view_quantity;    
        View_Gen_total_price.setText(""+view_total); 
     }
    }//GEN-LAST:event_View_Gen_quantittyKeyReleased

    private void View_Gen_Seller_PriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_View_Gen_Seller_PriceKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_View_Gen_Seller_PriceKeyTyped

    private void View_Gen_quantittyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_View_Gen_quantittyKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_View_Gen_quantittyKeyTyped

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
    public static javax.swing.JLabel Stock_Genset_Delete;
    public static javax.swing.JPanel Stock_Genset_Panel_View1;
    private javax.swing.JLabel Supplier_List_Btn;
    private javax.swing.JLabel View_Btn;
    public static javax.swing.JTextField View_Gen_Alternator;
    public static javax.swing.JComboBox<String> View_Gen_Brand;
    public static javax.swing.JTextField View_Gen_Category;
    public static datechooser.beans.DateChooserCombo View_Gen_Date_inbound;
    public static javax.swing.JTextField View_Gen_Model;
    private javax.swing.JComboBox<String> View_Gen_Phasing;
    public static javax.swing.JLabel View_Gen_Pic;
    public static javax.swing.JTextArea View_Gen_Remarks;
    public static javax.swing.JTextField View_Gen_Seller_Price;
    public static javax.swing.JTextArea View_Gen_Supplier_Address;
    public static javax.swing.JTextField View_Gen_Supplier_Contact;
    public static javax.swing.JTextField View_Gen_Supplier_Name;
    public static javax.swing.JTextField View_Gen_Supplier_Price;
    private javax.swing.JComboBox<String> View_Gen_Type;
    public static javax.swing.JTextField View_Gen__Engine;
    public static javax.swing.JTextField View_Gen_kva;
    public static javax.swing.JTextField View_Gen_quantitty;
    public static javax.swing.JTextField View_Gen_total_price;
    public static javax.swing.JLabel View_Generator_Banner;
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
    private javax.swing.JLabel other;
    // End of variables declaration//GEN-END:variables
}
