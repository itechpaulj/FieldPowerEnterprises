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
public class Sales_Stock_1 extends javax.swing.JFrame {
    public static String Generator_id = null;
    public static String supplier_id = null;
    public static String customer_id = "";
    
    public static File resoucesDirectory ;
  
    public static byte[] images = null;
    String DateTime;
    //-----DECLARED STING VARIABLE-----------------------------------------
    String remarks="";
    String filename = null;
   
    
    //-----FOR COMPUTATION-----------------------------------------------------------------------
    int add_sale_quantity = 0,add_sale_price = 0,add_sale_total = 0;
    
    int get_stock_quantity = 0,updated_stock_price=0 ;
    
    int updated_stock_quantity,updated_stock_total,updated_stock_total1;
    
    int update_sale_quantity=0,updated_Sale_total=0;
    
    int get_sale_quantity=0;
    
    
    //----FOR RETURN----------------------------------------
    int Avail_quantity ;
    int Avail_total_price;
    
    // ----FOR STOCK----------------------------------------
    int Update_quantity ;
    int Update_total_price;
    
    //----FOR SALE------------------------------------------
    int Sale_quantity ;
    int Sale_total_price;
    //int ads;
    int stock_ids;
    int sale_ids;
    
    public Sales_Stock_1() {
        initComponents();
        imgisNull();
        Class_Amount a = new Class_Amount();
        a.Amount();
        Webpage.cc.addCart();
       
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
        Sale_Generator_Display = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        KG2_ADD_STOCK_GENSET = new keeptoo.KGradientPanel();
        Sale_Gen_Pic = new javax.swing.JLabel();
        Sale_Gen_supplier_Price = new javax.swing.JTextField();
        Sale_Gen_Model = new javax.swing.JTextField();
        Sale_Gen_category = new javax.swing.JTextField();
        Sale_Gen_Alternator = new javax.swing.JTextField();
        Sale_Gen_Seller_Price = new javax.swing.JTextField();
        Sale_Gen_Engine = new javax.swing.JTextField();
        Sale_Gen_kva = new javax.swing.JTextField();
        Sale_Gen_Supplier_Contact = new javax.swing.JTextField();
        Sale_Gen_Supplier_Name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Sale_Gen_Supplier_Address = new javax.swing.JTextArea();
        Panel_View_Btn = new javax.swing.JPanel();
        Sale_Btn = new javax.swing.JLabel();
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
        jTextField13 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        Sale_Gen_quantity = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        Sale_Gen_total_price = new javax.swing.JTextField();
        Sale_Gen_available_stock = new javax.swing.JTextField();
        Sale_Gen_date_inbound = new javax.swing.JTextField();
        Sale_Gen_Brand = new javax.swing.JTextField();
        Sale_Gen_Type = new javax.swing.JTextField();
        Sale_Gen_Phasing = new javax.swing.JTextField();
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

        Sale_Generator_Display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Sale_Generator_Display.setForeground(new java.awt.Color(255, 255, 255));
        Sale_Generator_Display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sale_Generator_Display.setText("SALE GENERATOR");
        Sale_Generator_Display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Sale_Generator_DisplayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(Sale_Generator_Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 540, 110));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Logo/Logo.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 170, 100));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 130));

        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setPreferredSize(new java.awt.Dimension(1390, 725));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sale_Gen_Pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Sale_Gen_Pic.setForeground(new java.awt.Color(20, 31, 31));
        Sale_Gen_Pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sale_Gen_Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Default_Imge.png"))); // NOI18N
        Sale_Gen_Pic.setAlignmentY(1.0F);
        Sale_Gen_Pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)));
        Sale_Gen_Pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sale_Gen_PicMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Sale_Gen_Pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 360, 180));

        Sale_Gen_supplier_Price.setEditable(false);
        Sale_Gen_supplier_Price.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Gen_supplier_Price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Gen_supplier_Price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Gen_supplier_Price.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sale_Gen_supplier_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 220, 31));

        Sale_Gen_Model.setEditable(false);
        Sale_Gen_Model.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Gen_Model.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Gen_Model.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Gen_Model.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sale_Gen_Model, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 220, 31));

        Sale_Gen_category.setEditable(false);
        Sale_Gen_category.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Gen_category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Gen_category.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Gen_category.setText("GENERATOR");
        Sale_Gen_category.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sale_Gen_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 220, 31));

        Sale_Gen_Alternator.setEditable(false);
        Sale_Gen_Alternator.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Gen_Alternator.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Gen_Alternator.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Gen_Alternator.setBorder(null);
        Sale_Gen_Alternator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sale_Gen_AlternatorActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Sale_Gen_Alternator, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 220, 30));

        Sale_Gen_Seller_Price.setEditable(false);
        Sale_Gen_Seller_Price.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Gen_Seller_Price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Gen_Seller_Price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Gen_Seller_Price.setBorder(null);
        Sale_Gen_Seller_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sale_Gen_Seller_PriceActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Sale_Gen_Seller_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 220, 31));

        Sale_Gen_Engine.setEditable(false);
        Sale_Gen_Engine.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Gen_Engine.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Gen_Engine.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Gen_Engine.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sale_Gen_Engine, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 220, 31));

        Sale_Gen_kva.setEditable(false);
        Sale_Gen_kva.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Gen_kva.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Gen_kva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Gen_kva.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sale_Gen_kva, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 220, 31));

        Sale_Gen_Supplier_Contact.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Gen_Supplier_Contact.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Gen_Supplier_Contact.setForeground(new java.awt.Color(51, 51, 51));
        Sale_Gen_Supplier_Contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Gen_Supplier_Contact.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sale_Gen_Supplier_Contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 200, 220, 31));

        Sale_Gen_Supplier_Name.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Gen_Supplier_Name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Gen_Supplier_Name.setForeground(new java.awt.Color(51, 51, 51));
        Sale_Gen_Supplier_Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Gen_Supplier_Name.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sale_Gen_Supplier_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 50, 220, 31));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Sale_Gen_Supplier_Address.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Gen_Supplier_Address.setColumns(10);
        Sale_Gen_Supplier_Address.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Gen_Supplier_Address.setForeground(new java.awt.Color(51, 51, 51));
        Sale_Gen_Supplier_Address.setRows(5);
        Sale_Gen_Supplier_Address.setTabSize(5);
        Sale_Gen_Supplier_Address.setAlignmentX(3.0F);
        Sale_Gen_Supplier_Address.setAlignmentY(2.0F);
        Sale_Gen_Supplier_Address.setBorder(null);
        Sale_Gen_Supplier_Address.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jScrollPane1.setViewportView(Sale_Gen_Supplier_Address);

        KG2_ADD_STOCK_GENSET.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 100, 220, 80));

        Panel_View_Btn.setBackground(new java.awt.Color(255, 133, 51));

        Sale_Btn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Sale_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Sale_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sale_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Save.png"))); // NOI18N
        Sale_Btn.setText(" CHECK OUT");
        Sale_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sale_BtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Sale_BtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Sale_BtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel_View_BtnLayout = new javax.swing.GroupLayout(Panel_View_Btn);
        Panel_View_Btn.setLayout(Panel_View_BtnLayout);
        Panel_View_BtnLayout.setHorizontalGroup(
            Panel_View_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sale_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Panel_View_BtnLayout.setVerticalGroup(
            Panel_View_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sale_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Panel_View_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 170, 45));

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
            .addComponent(Back_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        Panel_Back_BtnLayout.setVerticalGroup(
            Panel_Back_BtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Back_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Panel_Back_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 160, 45));
        KG2_ADD_STOCK_GENSET.add(other, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 110, 20));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 128, 128));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setText(" BRAND ");
        jTextField1.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 140, 31));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 128, 128));
        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setText(" CATEGORY");
        jTextField2.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 140, 31));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 128, 128));
        jTextField3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField3.setText(" KVA");
        jTextField3.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 140, 31));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 128, 128));
        jTextField4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField4.setText(" MODEL");
        jTextField4.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 140, 31));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(255, 128, 128));
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
        jTextField6.setBackground(new java.awt.Color(255, 128, 128));
        jTextField6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField6.setText(" DATE RECIEVED");
        jTextField6.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 140, 31));

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
        KG2_ADD_STOCK_GENSET.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 140, 31));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(255, 128, 128));
        jTextField8.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField8.setText(" PHASING");
        jTextField8.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 140, 31));

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(255, 128, 128));
        jTextField9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField9.setText(" ADDRESS");
        jTextField9.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, 140, 31));

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(255, 128, 128));
        jTextField10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField10.setText(" ALTERNATOR S.N.");
        jTextField10.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 140, 31));

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(255, 128, 128));
        jTextField11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField11.setText(" ENGINE S.N");
        jTextField11.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 140, 31));

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(255, 128, 128));
        jTextField12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField12.setText(" SELLER PRICE");
        jTextField12.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 140, 31));

        jTextField13.setEditable(false);
        jTextField13.setBackground(new java.awt.Color(255, 128, 128));
        jTextField13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField13.setText(" NAME");
        jTextField13.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 50, 140, 31));

        jTextField15.setEditable(false);
        jTextField15.setBackground(new java.awt.Color(255, 128, 128));
        jTextField15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField15.setText(" CONTACT NO");
        jTextField15.setBorder(null);
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, 140, 31));

        jTextField16.setEditable(false);
        jTextField16.setBackground(new java.awt.Color(255, 255, 102));
        jTextField16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField16.setText("  AVAILABLE STOCK ");
        jTextField16.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 140, 31));

        jTextField17.setEditable(false);
        jTextField17.setBackground(new java.awt.Color(255, 128, 128));
        jTextField17.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField17.setText(" QUANTITY");
        jTextField17.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 140, 31));

        Sale_Gen_quantity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Gen_quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Gen_quantity.setBorder(null);
        Sale_Gen_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Sale_Gen_quantityKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Sale_Gen_quantityKeyTyped(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Sale_Gen_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 220, 31));

        jTextField18.setEditable(false);
        jTextField18.setBackground(new java.awt.Color(255, 128, 128));
        jTextField18.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField18.setText(" TOTAL PRICE");
        jTextField18.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 140, 31));

        Sale_Gen_total_price.setEditable(false);
        Sale_Gen_total_price.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Gen_total_price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Gen_total_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Gen_total_price.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sale_Gen_total_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 220, 30));

        Sale_Gen_available_stock.setEditable(false);
        Sale_Gen_available_stock.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Gen_available_stock.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Gen_available_stock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Gen_available_stock.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Sale_Gen_available_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 220, 31));

        Sale_Gen_date_inbound.setEditable(false);
        Sale_Gen_date_inbound.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Gen_date_inbound.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Gen_date_inbound.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Gen_date_inbound.setBorder(null);
        Sale_Gen_date_inbound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sale_Gen_date_inboundActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Sale_Gen_date_inbound, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 220, 30));

        Sale_Gen_Brand.setEditable(false);
        Sale_Gen_Brand.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Gen_Brand.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Gen_Brand.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Gen_Brand.setBorder(null);
        Sale_Gen_Brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sale_Gen_BrandActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Sale_Gen_Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 220, 30));

        Sale_Gen_Type.setEditable(false);
        Sale_Gen_Type.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Gen_Type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Gen_Type.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Gen_Type.setBorder(null);
        Sale_Gen_Type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sale_Gen_TypeActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Sale_Gen_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 220, 30));

        Sale_Gen_Phasing.setEditable(false);
        Sale_Gen_Phasing.setBackground(new java.awt.Color(220, 220, 200));
        Sale_Gen_Phasing.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Gen_Phasing.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sale_Gen_Phasing.setBorder(null);
        Sale_Gen_Phasing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sale_Gen_PhasingActionPerformed(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Sale_Gen_Phasing, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 220, 30));

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)), " GENERATOR INFO ", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 790, 490));

        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)), " SUPPLIER INFO ", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 410, 490));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1280, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Sale_Gen_PicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sale_Gen_PicMouseClicked
        Sale_Gen_Pic.setText(null);
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        

        ImageIcon imageicon = new ImageIcon (new ImageIcon(filename).getImage().getScaledInstance(Sale_Gen_Pic.getWidth(), Sale_Gen_Pic.getHeight(),Image.SCALE_SMOOTH) );
        Sale_Gen_Pic.setIcon(imageicon);

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
    }//GEN-LAST:event_Sale_Gen_PicMouseClicked

    private void Sale_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sale_BtnMouseClicked
    int total_price =0;
    String btn = Sale_Btn.getText();
    String category = Sale_Gen_category.getText().toUpperCase();
    String brand = Sale_Gen_Brand.getText().toUpperCase();
    String model= Sale_Gen_Model.getText().toUpperCase();
    String kva = Sale_Gen_kva.getText().toUpperCase();
    String phasing = Sale_Gen_Phasing.getText().toUpperCase();
    
    String type = Sale_Gen_Type.getText().toUpperCase();
    String supplier_price = Sale_Gen_supplier_Price.getText().toUpperCase();
    String seller_price = Sale_Gen_Seller_Price.getText().toUpperCase();
    String avail = Sale_Gen_available_stock.getText();
    String quantity = Sale_Gen_quantity.getText(); 
    total_price = Integer.parseInt(Sale_Gen_total_price.getText());
    int aq = Integer.parseInt(avail);
    int q = Integer.parseInt(quantity);
//    int avai11 = Integer.parseInt(""+avail);
//    int quantity1 = Integer.parseInt(""+quantity);
            
    String engine_sn = Sale_Gen_Engine.getText().toUpperCase();
    String alternator_sn = Sale_Gen_Alternator.getText().toUpperCase();
    
    // String supplier_id ;
    String date_inbound = Sale_Gen_date_inbound.getText().toUpperCase();
    // image
    String incharge = "";

    String supplier = Sale_Gen_Supplier_Name.getText();
    
    String date_outbound = "";
    String verify = "";
    String process = Integer.toString(Webpage.cc.process);
    
    String project = "";
  
    if(quantity.equals("") && total_price == 0)
        {
            JOptionPane.showMessageDialog(null, "FILL SOME BLANCK","",JOptionPane.ERROR_MESSAGE);
        }
    else if(aq < q)
        {
             JOptionPane.showMessageDialog(null, "THE QUANTITY ENTERED IS TO MUCH!!","",JOptionPane.ERROR_MESSAGE);
        }
    else if(btn.equals(" CHECK OUT"))
        {
      
        
        if(stock_ids == sale_ids)
        {
            
            if(!Class_Amount.CartUpdateQuantityAndTotal(update_sale_quantity, updated_Sale_total, Generator_id) && !Class_Amount.HistoryUpdateQuantityAndTotal(""+update_sale_quantity, updated_Sale_total, Generator_id) && !Class_Amount.StockUpdateQuantityAndTotal(""+updated_stock_quantity, updated_stock_total, Generator_id))
            {

                JOptionPane.showMessageDialog(null, " CHECK OUT ADDED !");Webpage.Refresh();  dispose();
            }
            
        }
         else if(!Class_Cart.InsertCart(Generator_id, category, brand, model, kva, phasing, type, supplier_price, seller_price,""+update_sale_quantity, updated_Sale_total, engine_sn, alternator_sn, supplier_id, date_inbound, date_outbound, images, incharge, remarks, process, verify) && !Class_History.InsertHistory(Generator_id, category, brand, model, kva, phasing, type, supplier_price, seller_price, quantity, total_price, engine_sn, alternator_sn, supplier_id, customer_id, date_inbound, date_outbound, images, incharge, remarks, process, verify, project) && !Class_Amount.StockUpdateQuantityAndTotal(""+updated_stock_quantity, updated_stock_total, Generator_id))
            {
                JOptionPane.showMessageDialog(null, " CHECK OUT SUCCESS !");Webpage.Refresh();  dispose();
            }

        }
    
        else if(btn.equals(" REMOVE"))
        {
            if(!Class_Amount.CartUpdateQuantityAndTotal(updated_stock_quantity, updated_stock_total, Generator_id) && !Class_Amount.HistoryUpdateQuantityAndTotal(""+updated_stock_quantity, updated_stock_quantity, Generator_id) && !Class_Amount.StockUpdateQuantityAndTotal(""+update_sale_quantity, updated_stock_total1, Generator_id))
                {
                    System.out.print(""+updated_stock_quantity);
                    System.out.print(updated_Sale_total);
                    JOptionPane.showMessageDialog(null, " SUCCESSFULY REMOVE !");Webpage.Refresh();  dispose();
                }
            if(updated_stock_quantity == 0)
                {
                    if(!Class_Amount.HistoryDelete(Generator_id) &&  !Class_Amount.CartDelete(Generator_id )){
                        Webpage.Refresh();  dispose();
                    }
                }
            
        }
 
    }//GEN-LAST:event_Sale_BtnMouseClicked

    private void Sale_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sale_BtnMouseEntered
        String btn = Sale_Btn.getText();
        if(btn.equals(" CHECK OUT")){
      
           Panel_View_Btn.setBackground(new Color(163, 235, 177));
           Sale_Btn.setForeground(new Color(33, 21, 34));
        }else if(btn.equals(" REMOVE")){
           Panel_View_Btn.setBackground(new Color(163, 235, 177));
           Sale_Btn.setForeground(new Color(33, 21, 34)); 
        }
        
    }//GEN-LAST:event_Sale_BtnMouseEntered

    private void Sale_BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sale_BtnMouseExited
  
        String btn = Sale_Btn.getText();
        if(btn.equals(" CHECK OUT")){
      
           Panel_View_Btn.setBackground(new Color(255,133,51));
            Sale_Btn.setForeground(new Color(255,255,255));
        }else if(btn.equals(" REMOVE")){
           Panel_View_Btn.setBackground(new Color(255,128,128));
           Sale_Btn.setForeground(new Color(255,255,255)); 
        }
    }//GEN-LAST:event_Sale_BtnMouseExited

    private void Back_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_BtnMouseClicked
    Class_tables ct = new Class_tables();
    ct.Stock();
    Webpage.Stock_cat = null;
    dispose();
    }//GEN-LAST:event_Back_BtnMouseClicked

    private void Back_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_BtnMouseEntered
      Panel_Back_Btn.setBackground(new Color(163, 235, 177));
      Back_Btn.setForeground(new Color(33, 21, 34));
        
    }//GEN-LAST:event_Back_BtnMouseEntered

    private void Back_BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_BtnMouseExited
     Panel_Back_Btn.setBackground(new Color(185,144,149));
     Back_Btn.setForeground(new Color(255,255,255)); 
        
    }//GEN-LAST:event_Back_BtnMouseExited

    private void Sale_Generator_DisplayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Sale_Generator_DisplayAncestorAdded
    String Banner = Sale_Generator_Display.getText();
    
    
    if(Banner.equals("SALE GENERATOR"))
    {
        String ids = Webpage.sales_id;
        try{
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `stock_table` WHERE `STOCK ID` = '"+ids+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Generator_id = rs.getString("STOCK ID");        
            stock_ids = Integer.parseInt(Generator_id);
            
            Sale_Gen_date_inbound.setText(rs.getString("DATE INBOUND"));
            Sale_Gen_category.setText(rs.getString("CATEGORY"));          
            Sale_Gen_Brand.setText(rs.getString("BRAND"));
    
            Sale_Gen_Model.setText(rs.getString("MODEL"));
            Sale_Gen_kva.setText(rs.getString("KVA"));
            Sale_Gen_Phasing.setText(rs.getString("PHASING"));
            Sale_Gen_Type.setText(rs.getString("TYPE"));
            Sale_Gen_supplier_Price.setText(rs.getString("SUPPLIER PRICE"));
            Sale_Gen_Seller_Price.setText(rs.getString("SELLER PRICE"));
            Sale_Gen_Engine.setText(rs.getString("ENGINE S.N"));
            Sale_Gen_Alternator.setText(rs.getString("ALTERNATOR S.N"));
            Sale_Gen_available_stock.setText(rs.getString("QUANTITY"));
            remarks = rs.getString("REMARKS");
                       
            //Sale_Gen_total_price.setText(""+rs.getInt("TOTAL PRICE"));
            
            images = rs.getBytes("IMAGE");
            ImageIcon imageicon = new ImageIcon (new ImageIcon(images).getImage().getScaledInstance(Sale_Gen_Pic.getWidth(), Sale_Gen_Pic.getHeight(),Image.SCALE_SMOOTH) );
            Sale_Gen_Pic.setIcon(imageicon);
            supplier_id = rs.getString("SUPPLIER ID");

            }
            
            //-- 
            
        }
        
        catch(Exception e){
            e.printStackTrace();
        }

    
         try{
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `supplier_table` WHERE `ID` = '"+supplier_id+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
          
            Sale_Gen_Supplier_Name.setText(rs.getString("NAME"));
            Sale_Gen_Supplier_Address.setText(rs.getString("ADDRESS"));
      
            Sale_Gen_Supplier_Contact.setText(rs.getString("CONTACT"));
            
            
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
         
        
        try{
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`,`QUANTITY` FROM `cart_table` WHERE `STOCK ID`='"+Webpage.sales_id+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
          
            sale_ids = rs.getInt("STOCK ID");
            Sale_quantity = rs.getInt("QUANTITY");
            System.out.println(""+sale_ids);
            System.out.println(""+Sale_quantity);
            
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
    
    
    else if(Banner.equals("REMOVE GENERATOR"))
    {
        try{
            
            String ids = Webpage.cart_id;
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `cart_table` WHERE `STOCK ID` = '"+ids+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Generator_id = rs.getString("STOCK ID");   
            stock_ids = Integer.parseInt(Generator_id);
            
            Sale_Gen_date_inbound.setText(rs.getString("DATE INBOUND"));
            Sale_Gen_category.setText(rs.getString("CATEGORY"));
            
            Sale_Gen_Brand.setText(rs.getString("BRAND"));
           
            
            Sale_Gen_Model.setText(rs.getString("MODEL"));
            Sale_Gen_kva.setText(rs.getString("KVA"));
            Sale_Gen_Phasing.setText(rs.getString("PHASING"));
            Sale_Gen_Type.setText(rs.getString("TYPE"));
            Sale_Gen_supplier_Price.setText(rs.getString("SUPPLIER PRICE"));
            Sale_Gen_Seller_Price.setText(rs.getString("SELLER PRICE"));
            Sale_Gen_Engine.setText(rs.getString("ENGINE S.N"));
            Sale_Gen_Alternator.setText(rs.getString("ALTERNATOR S.N"));
            jTextField16.setText(" ORDER QUANTITY");
            Sale_Gen_available_stock.setText(rs.getString("QUANTITY"));
            
            Sale_Gen_total_price.setText(rs.getString("TOTAL PRICE"));
            remarks = rs.getString("REMARKS");
            
            
            //Sale_Gen_total_price.setText(""+rs.getInt("TOTAL PRICE"));
            
            images = rs.getBytes("IMAGE");
            ImageIcon imageicon = new ImageIcon (new ImageIcon(images).getImage().getScaledInstance(Sale_Gen_Pic.getWidth(), Sale_Gen_Pic.getHeight(),Image.SCALE_SMOOTH) );
            Sale_Gen_Pic.setIcon(imageicon);
            supplier_id = rs.getString("SUPPLIER ID");
            }
            
            try{
            ps = FPE_DB.getConnection().prepareStatement("SELECT `QUANTITY` FROM `stock_table` WHERE `STOCK ID`='"+ids +"' ");
            
            rs = ps.executeQuery();
            while(rs.next()){
            Avail_quantity = rs.getInt("QUANTITY");       
            //System.out.print(""+Avail_qiantity);
            }
            }catch (Exception e){
            
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
         try{
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `supplier_table` WHERE `ID` = '"+supplier_id+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
          
            Sale_Gen_Supplier_Name.setText(rs.getString("NAME"));
            Sale_Gen_Supplier_Address.setText(rs.getString("ADDRESS"));   
            Sale_Gen_Supplier_Contact.setText(rs.getString("CONTACT"));                     
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
         
         try{
             //sale_ids = Integer.parseInt(Webpage.sales_id);
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`,`QUANTITY` FROM `stock_table` WHERE `STOCK ID`='"+Webpage.sales_id+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            
            sale_ids = rs.getInt("STOCK ID");
            Sale_quantity = rs.getInt("QUANTITY");
            System.out.println(""+sale_ids);
            System.out.println(""+Sale_quantity);
            
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
        
    }//GEN-LAST:event_Sale_Generator_DisplayAncestorAdded

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void Sale_Gen_Seller_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sale_Gen_Seller_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sale_Gen_Seller_PriceActionPerformed

    private void Sale_Gen_AlternatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sale_Gen_AlternatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sale_Gen_AlternatorActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void Sale_Gen_date_inboundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sale_Gen_date_inboundActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sale_Gen_date_inboundActionPerformed

    private void Sale_Gen_BrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sale_Gen_BrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sale_Gen_BrandActionPerformed

    private void Sale_Gen_TypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sale_Gen_TypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sale_Gen_TypeActionPerformed

    private void Sale_Gen_PhasingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sale_Gen_PhasingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sale_Gen_PhasingActionPerformed

    private void Sale_Gen_quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Sale_Gen_quantityKeyReleased

    add_sale_price = Integer.parseInt(Sale_Gen_Seller_Price.getText());
    

       String q = Sale_Gen_quantity.getText();

       if(q.equals(""))
       {
        add_sale_total = add_sale_price * 0;    
        Sale_Gen_total_price.setText(""+add_sale_total); 
       }else
       {
           add_sale_quantity = Integer.parseInt(Sale_Gen_quantity.getText());
           int aq = Integer.parseInt(Sale_Gen_available_stock.getText());
           if(aq >= add_sale_quantity){
               
           
        //----   FOR ADD SALE
        
        add_sale_total = add_sale_price * add_sale_quantity;
        Sale_Gen_total_price.setText(""+add_sale_total); 
        System.out.println("------------FOR ADD SALE---------------------------------------------");
        System.out.println(""+add_sale_quantity);
        System.out.println(""+add_sale_total);
        System.out.println();
        
        //----   FOR UPDATE SALE
        
        update_sale_quantity = Sale_quantity + add_sale_quantity;
        updated_Sale_total = update_sale_quantity * add_sale_price;
        System.out.println("------------FOR UPDATE SALE-------------------------------------------");
        System.out.println(""+update_sale_quantity);
        System.out.println(""+updated_Sale_total);
        System.out.println();
        
        //----   FOR UPDATE THE STOCK 
        
        updated_stock_quantity = Integer.parseInt(Sale_Gen_available_stock.getText()) - add_sale_quantity;
        updated_stock_total = updated_stock_quantity *add_sale_price ;
        
        int updated_stock_quantity1= Sale_quantity + add_sale_quantity;
        updated_stock_total1 =  updated_stock_quantity1 * add_sale_price;
        System.out.println("------------FOR UPDATE THE STOCK---------------------------------------");
        System.out.println(""+updated_stock_quantity);
        
        System.out.println("\n \n");
            }
         
        }
 
       
    }//GEN-LAST:event_Sale_Gen_quantityKeyReleased

    private void Sale_Gen_quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Sale_Gen_quantityKeyTyped
       char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_Sale_Gen_quantityKeyTyped

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
    public static javax.swing.JLabel Sale_Btn;
    public static javax.swing.JTextField Sale_Gen_Alternator;
    public static javax.swing.JTextField Sale_Gen_Brand;
    public static javax.swing.JTextField Sale_Gen_Engine;
    public static javax.swing.JTextField Sale_Gen_Model;
    public static javax.swing.JTextField Sale_Gen_Phasing;
    public static javax.swing.JLabel Sale_Gen_Pic;
    public static javax.swing.JTextField Sale_Gen_Seller_Price;
    public static javax.swing.JTextArea Sale_Gen_Supplier_Address;
    public static javax.swing.JTextField Sale_Gen_Supplier_Contact;
    public static javax.swing.JTextField Sale_Gen_Supplier_Name;
    public static javax.swing.JTextField Sale_Gen_Type;
    public static javax.swing.JTextField Sale_Gen_available_stock;
    public static javax.swing.JTextField Sale_Gen_category;
    public static javax.swing.JTextField Sale_Gen_date_inbound;
    public static javax.swing.JTextField Sale_Gen_kva;
    public static javax.swing.JTextField Sale_Gen_quantity;
    public static javax.swing.JTextField Sale_Gen_supplier_Price;
    private javax.swing.JTextField Sale_Gen_total_price;
    public static javax.swing.JLabel Sale_Generator_Display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
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
