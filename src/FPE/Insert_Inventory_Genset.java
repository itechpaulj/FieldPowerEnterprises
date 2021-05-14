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
public class Insert_Inventory_Genset extends javax.swing.JFrame {
    
    String filename = null;
    public static File resoucesDirectory ;
  
    public static byte[] images = null;
    String DateTime;

    public Insert_Inventory_Genset() {
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
                FileImageInputStream fis1 = new FileImageInputStream(new File("src/Picture/Images_Image.png"));
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

        KG2_ADD_STOCK_GENSET = new keeptoo.KGradientPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        Insert_Invetory_Genset_pic = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        Insert_Invetory_Supplier_id = new javax.swing.JTextField();
        Insert_Invetory_Genset_supplier_price = new javax.swing.JTextField();
        Insert_Invetory_Genset_model = new javax.swing.JTextField();
        Insert_Invetory_Genset_id = new javax.swing.JTextField();
        Insert_Invetory_Genset_brand = new javax.swing.JTextField();
        Insert_Invetory_Genset_Alter_Serial = new javax.swing.JTextField();
        Insert_Invetory_Genset_dimension = new javax.swing.JTextField();
        Insert_Invetory_Genset_seller_price = new javax.swing.JTextField();
        Insert_Invetory_Genset_Engine_Serial = new javax.swing.JTextField();
        Insert_Invetory_Genset_kva = new javax.swing.JTextField();
        Insert_Invetory_Genset_phasing = new javax.swing.JTextField();
        Insert_Invetory_Genset_type = new javax.swing.JTextField();
        Insert_Invetory_Supplier_contact = new javax.swing.JTextField();
        Insert_Invetory_Supplier_email = new javax.swing.JTextField();
        Insert_Invetory_Supplier_name = new javax.swing.JTextField();
        Insert_Invetory_Genset_date = new datechooser.beans.DateChooserCombo();
        engine = new javax.swing.JComboBox<>();
        alter = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Insert_Invetory_Supplier_address = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        Supplier_List_Btn = new javax.swing.JLabel();
        Stock_Genset_Panel_Update = new javax.swing.JPanel();
        Stock_Genset_Update = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        Stock_Genset_Back = new javax.swing.JLabel();
        Path = new javax.swing.JLabel();
        Panel_Energized = new javax.swing.JPanel();
        Energized = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Inventory_Display = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(0, 230, 184));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(0, 230, 184));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(20, 31, 31));
        jLabel20.setText("UNIT TYPE");
        jLabel20.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 120, 30));

        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(20, 31, 31));
        jLabel22.setText("DIMENSION");
        jLabel22.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 120, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(20, 31, 31));
        jLabel2.setText("BRAND");
        jLabel2.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 80, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(20, 31, 31));
        jLabel7.setText("KVA");
        jLabel7.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 70, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(20, 31, 31));
        jLabel11.setText("ENGINE_SN");
        jLabel11.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 120, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(20, 31, 31));
        jLabel15.setText("ALTERNATOR_SN");
        jLabel15.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 130, 30));

        a.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        a.setForeground(new java.awt.Color(20, 31, 31));
        a.setText("ID");
        a.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 80, 30));

        Insert_Invetory_Genset_pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Insert_Invetory_Genset_pic.setForeground(new java.awt.Color(20, 31, 31));
        Insert_Invetory_Genset_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Insert_Invetory_Genset_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Image.png"))); // NOI18N
        Insert_Invetory_Genset_pic.setAlignmentY(1.0F);
        Insert_Invetory_Genset_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)));
        Insert_Invetory_Genset_pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Insert_Invetory_Genset_picMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Insert_Invetory_Genset_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 270, 150));

        jLabel29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(20, 31, 31));
        jLabel29.setText("SELLER  PRICE");
        jLabel29.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 120, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(20, 31, 31));
        jLabel5.setText("MODEL");
        jLabel5.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 80, 30));

        id1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id1.setText("NAME");
        id1.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 100, 30));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setText("ADDRESS");
        jLabel21.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 100, 30));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setText("EMAIL ");
        jLabel19.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, 100, 30));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setText("CONTACT NO.");
        jLabel18.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 100, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(20, 31, 31));
        jLabel10.setText("PHASING");
        jLabel10.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 70, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(20, 31, 31));
        jLabel16.setText("DATE RECIEVED ");
        jLabel16.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 130, 30));

        jLabel30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(20, 31, 31));
        jLabel30.setText("SUPPLIER PRICE");
        jLabel30.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 120, 30));

        id2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id2.setText("ID");
        id2.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 100, 30));

        Insert_Invetory_Supplier_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Invetory_Supplier_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Invetory_Supplier_id.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Invetory_Supplier_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 80, 180, 30));

        Insert_Invetory_Genset_supplier_price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Invetory_Genset_supplier_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Invetory_Genset_supplier_price.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Invetory_Genset_supplier_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 190, 30));

        Insert_Invetory_Genset_model.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Invetory_Genset_model.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Invetory_Genset_model.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Invetory_Genset_model, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 190, 30));

        Insert_Invetory_Genset_id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Invetory_Genset_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Invetory_Genset_id.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Invetory_Genset_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 190, 30));

        Insert_Invetory_Genset_brand.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Invetory_Genset_brand.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Invetory_Genset_brand.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Invetory_Genset_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 190, 30));

        Insert_Invetory_Genset_Alter_Serial.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Invetory_Genset_Alter_Serial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Invetory_Genset_Alter_Serial.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Invetory_Genset_Alter_Serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 190, 30));

        Insert_Invetory_Genset_dimension.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Invetory_Genset_dimension.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Invetory_Genset_dimension.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Invetory_Genset_dimension, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 190, 30));

        Insert_Invetory_Genset_seller_price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Invetory_Genset_seller_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Invetory_Genset_seller_price.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Invetory_Genset_seller_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 190, 30));

        Insert_Invetory_Genset_Engine_Serial.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Invetory_Genset_Engine_Serial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Invetory_Genset_Engine_Serial.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Invetory_Genset_Engine_Serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 190, 30));

        Insert_Invetory_Genset_kva.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Invetory_Genset_kva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Invetory_Genset_kva.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Invetory_Genset_kva, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 190, 30));

        Insert_Invetory_Genset_phasing.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Invetory_Genset_phasing.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Invetory_Genset_phasing.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Invetory_Genset_phasing, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 190, 30));

        Insert_Invetory_Genset_type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Invetory_Genset_type.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Invetory_Genset_type.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Invetory_Genset_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 190, 30));

        Insert_Invetory_Supplier_contact.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Invetory_Supplier_contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Invetory_Supplier_contact.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Invetory_Supplier_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, 180, 30));

        Insert_Invetory_Supplier_email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Invetory_Supplier_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Invetory_Supplier_email.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Invetory_Supplier_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 280, 180, 30));

        Insert_Invetory_Supplier_name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Invetory_Supplier_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Invetory_Supplier_name.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Invetory_Supplier_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 180, 30));

        Insert_Invetory_Genset_date.setCalendarPreferredSize(new java.awt.Dimension(400, 500));
        KG2_ADD_STOCK_GENSET.add(Insert_Invetory_Genset_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 190, 30));

        engine.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        engine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "ENGINE NEW", "ENGINE OLD" }));
        engine.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(engine, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 190, 30));

        alter.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        alter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "NEW SERIAL NO", "OLD SERIAL NO" }));
        alter.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(alter, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 190, 30));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Insert_Invetory_Supplier_address.setColumns(10);
        Insert_Invetory_Supplier_address.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Invetory_Supplier_address.setRows(5);
        Insert_Invetory_Supplier_address.setTabSize(5);
        Insert_Invetory_Supplier_address.setAlignmentX(3.0F);
        Insert_Invetory_Supplier_address.setAlignmentY(2.0F);
        Insert_Invetory_Supplier_address.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        Insert_Invetory_Supplier_address.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jScrollPane1.setViewportView(Insert_Invetory_Supplier_address);

        KG2_ADD_STOCK_GENSET.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 160, 180, 110));

        jPanel1.setBackground(new java.awt.Color(255, 255, 179));

        Supplier_List_Btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Supplier_List_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Supplier_List_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Exist.png"))); // NOI18N
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
            .addComponent(Supplier_List_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Supplier_List_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        KG2_ADD_STOCK_GENSET.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 370, 180, 30));

        Stock_Genset_Panel_Update.setBackground(new java.awt.Color(51, 187, 255));

        Stock_Genset_Update.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Update.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Save_Btn.png"))); // NOI18N
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
            .addComponent(Stock_Genset_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_UpdateLayout.setVerticalGroup(
            Stock_Genset_Panel_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 190, 50));

        Stock_Genset_Panel_Back.setBackground(new java.awt.Color(255, 194, 102));

        Stock_Genset_Back.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Back.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Cancel_Btn.png"))); // NOI18N
        Stock_Genset_Back.setText(" CANCEL ");
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
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_BackLayout.setVerticalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, 190, 50));

        Path.setText("1");
        KG2_ADD_STOCK_GENSET.add(Path, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, 100, 40));

        Energized.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Energized.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Energized.setText("ENERGIZED");
        Energized.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnergizedMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel_EnergizedLayout = new javax.swing.GroupLayout(Panel_Energized);
        Panel_Energized.setLayout(Panel_EnergizedLayout);
        Panel_EnergizedLayout.setHorizontalGroup(
            Panel_EnergizedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Energized, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        Panel_EnergizedLayout.setVerticalGroup(
            Panel_EnergizedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_EnergizedLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Energized, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        KG2_ADD_STOCK_GENSET.add(Panel_Energized, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 190, 40));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 0));
        jLabel13.setToolTipText("");
        jLabel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)), "GENSET INFORMATION", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 20), new java.awt.Color(20, 31, 31))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 670, 480));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 0));
        jLabel12.setToolTipText("");
        jLabel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)), "GENSET INFORMATION", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 20), new java.awt.Color(20, 31, 31))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 670, 480));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setToolTipText("");
        jLabel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)), "SUPPLIER INFORMATION", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 20), new java.awt.Color(20, 31, 31))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 330, 480));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1070, 620));

        jPanel4.setBackground(new java.awt.Color(2, 71, 94));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Inventory_Display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Inventory_Display.setForeground(new java.awt.Color(255, 255, 255));
        Inventory_Display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Inventory_Display.setText("ADD GENSET PRODUCT");
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Insert_Invetory_Genset_picMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Insert_Invetory_Genset_picMouseClicked
        Insert_Invetory_Genset_pic.setText(null);
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        

        ImageIcon imageicon = new ImageIcon (new ImageIcon(filename).getImage().getScaledInstance(Insert_Invetory_Genset_pic.getWidth(), Insert_Invetory_Genset_pic.getHeight(),Image.SCALE_SMOOTH) );
        Insert_Invetory_Genset_pic.setIcon(imageicon);

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
    }//GEN-LAST:event_Insert_Invetory_Genset_picMouseClicked

    private void Stock_Genset_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseClicked
    
    Class_tables ct = new Class_tables();
    
        
    String Banner = Inventory_Display.getText();
    
    String id       = Insert_Invetory_Genset_id.getText().toUpperCase();
    String brand    = Insert_Invetory_Genset_brand.getText().toUpperCase(); 
    String mode     = Insert_Invetory_Genset_model.getText().toUpperCase();
    String kva      = Insert_Invetory_Genset_kva.getText().toUpperCase();
    String date     = Insert_Invetory_Genset_date.getText().toUpperCase();
    String phasing  = Insert_Invetory_Genset_phasing.getText().toUpperCase(); 
    String type     = Insert_Invetory_Genset_type.getText().toUpperCase(); 
    String dimen    = Insert_Invetory_Genset_dimension.getText().toUpperCase();
    String price    = Insert_Invetory_Genset_supplier_price.getText().toUpperCase();
    String s_price  = Insert_Invetory_Genset_seller_price.getText().toUpperCase(); 
   
    String engine_sn     = Insert_Invetory_Genset_Engine_Serial.getText().toUpperCase();
    String engines       = engine.getSelectedItem().toString() +" - " + engine_sn;
    
    String alters1_sn    = Insert_Invetory_Genset_Alter_Serial.getText().toUpperCase();
    String alters        = alter.getSelectedItem().toString() + " - " + alters1_sn;
    
    String ids  = Insert_Invetory_Supplier_id.getText().toUpperCase();
    String  name       = Insert_Invetory_Supplier_name.getText().toUpperCase();
    String  address    = Insert_Invetory_Supplier_address.getText().toUpperCase();
    String  email      = Insert_Invetory_Supplier_email.getText().toUpperCase();
    String  contact    = Insert_Invetory_Supplier_contact.getText().toUpperCase();
    
    //if default select item combo box
    String sel_engine = engine.getSelectedItem().toString();
    String sel_alter = alter.getSelectedItem().toString();
    

    if(brand.equals("") || mode.equals("") || kva.equals("") || date.equals("") || phasing.equals("") || type.equals("") || dimen.equals("") || price.equals("") || s_price.equals("") || name.equals("") || address.equals("") || email.equals("") || contact.equals("") || sel_engine.equals("SELECT") || sel_alter.equals("SELECT")){
       
            JOptionPane.showMessageDialog(null,"FILLED SOME BLANKS !!! ","",JOptionPane.ERROR_MESSAGE); 
    }
    else if(Banner.equals("ADD GENSET PRODUCT") && Path.getText().equals("1"))
    {
        if(!Class_Supplier.ExistSupplier(email)){
            JOptionPane.showMessageDialog(null, " EXIST SUPPLIER\nPLEASE SELECT SUPPLIER LIST!","",JOptionPane.WARNING_MESSAGE);
            //Path.setText("2"); // exist supplier
            ct.Genset(); ct.Supplier();
        }
        else{
            if(!Class_Stock.AddGenset(date, brand, mode, kva, phasing, type, dimen, price, s_price, engines, alters, images, name) && !Class_Supplier.AddSupplier(name, address, contact, email))
            {
                JOptionPane.showMessageDialog(null, " SUCCESFULL ADDED ","",JOptionPane.INFORMATION_MESSAGE);
                ct.Genset(); ct.Supplier();
                dispose();
            }   
        }
    }
    else if(Banner.equals("ADD GENSET PRODUCT") && Path.getText().equals("2")){
        // exist supplier but new genset product
        if(!Class_Stock.AddGenset(date, brand, mode, kva, phasing, type, dimen, price, s_price, engines, alters, images, name))
        {
            JOptionPane.showMessageDialog(null, " SUCCESFULL ADDED ","",JOptionPane.INFORMATION_MESSAGE);
            ct.Genset(); ct.Supplier();
            dispose();
        }

    }
    else if(Banner.equals("UPDATE GENSET PRODUCT"))
    {

       if(!Class_Stock.UpdateGenset(id,date, brand, mode, kva, phasing, type, dimen, price, s_price, engines, alters, images, name,DateTime) && !Class_Supplier.UpdateSupplier(name, address, contact, email, ids));
        {
            JOptionPane.showMessageDialog(null, " SUCCESFULLY UPDATED ","",JOptionPane.INFORMATION_MESSAGE);
             ct.Genset(); ct.Supplier();
             dispose();
        } 
    }
    }//GEN-LAST:event_Stock_Genset_UpdateMouseClicked

    private void Stock_Genset_UpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseEntered
        Stock_Genset_Update.setForeground(new Color(41, 61, 61));
        Stock_Genset_Panel_Update.setBackground(new Color(51, 187, 255));
    }//GEN-LAST:event_Stock_Genset_UpdateMouseEntered

    private void Stock_Genset_UpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseExited
        Stock_Genset_Update.setForeground(new Color(255,255,255));
        Stock_Genset_Panel_Update.setBackground(new Color(51, 187, 255));
    }//GEN-LAST:event_Stock_Genset_UpdateMouseExited

    private void Stock_Genset_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseClicked
//        JTab.setSelectedIndex(1);
    dispose();
    }//GEN-LAST:event_Stock_Genset_BackMouseClicked

    private void Stock_Genset_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseEntered
        Stock_Genset_Back.setForeground(new Color(41, 61, 61));
        Stock_Genset_Panel_Back.setBackground(new Color(255,194,102));
    }//GEN-LAST:event_Stock_Genset_BackMouseEntered

    private void Stock_Genset_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseExited
        Stock_Genset_Back.setForeground(new Color(255,255,255));
        Stock_Genset_Panel_Back.setBackground(new Color(255,194,102));
    }//GEN-LAST:event_Stock_Genset_BackMouseExited

    private void Inventory_DisplayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Inventory_DisplayAncestorAdded
        
    }//GEN-LAST:event_Inventory_DisplayAncestorAdded

    private void Supplier_List_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Supplier_List_BtnMouseClicked
        Table_Supplier ts = new Table_Supplier();
        ts.setVisible(true);
        Table_Supplier.Add.setText("SELECT");
        Table_Supplier.Path.setText("2");
       
    }//GEN-LAST:event_Supplier_List_BtnMouseClicked

    private void EnergizedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnergizedMouseClicked
        Energized e = new Energized();
        e.setVisible(true);
    }//GEN-LAST:event_EnergizedMouseClicked

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
            java.util.logging.Logger.getLogger(Insert_Inventory_Genset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert_Inventory_Genset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert_Inventory_Genset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_Inventory_Genset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert_Inventory_Genset().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Energized;
    public static javax.swing.JTextField Insert_Invetory_Genset_Alter_Serial;
    public static javax.swing.JTextField Insert_Invetory_Genset_Engine_Serial;
    public static javax.swing.JTextField Insert_Invetory_Genset_brand;
    public static datechooser.beans.DateChooserCombo Insert_Invetory_Genset_date;
    public static javax.swing.JTextField Insert_Invetory_Genset_dimension;
    public static javax.swing.JTextField Insert_Invetory_Genset_id;
    public static javax.swing.JTextField Insert_Invetory_Genset_kva;
    public static javax.swing.JTextField Insert_Invetory_Genset_model;
    public static javax.swing.JTextField Insert_Invetory_Genset_phasing;
    public static javax.swing.JLabel Insert_Invetory_Genset_pic;
    public static javax.swing.JTextField Insert_Invetory_Genset_seller_price;
    public static javax.swing.JTextField Insert_Invetory_Genset_supplier_price;
    public static javax.swing.JTextField Insert_Invetory_Genset_type;
    public static javax.swing.JTextArea Insert_Invetory_Supplier_address;
    public static javax.swing.JTextField Insert_Invetory_Supplier_contact;
    public static javax.swing.JTextField Insert_Invetory_Supplier_email;
    public static javax.swing.JTextField Insert_Invetory_Supplier_id;
    public static javax.swing.JTextField Insert_Invetory_Supplier_name;
    public static javax.swing.JLabel Inventory_Display;
    public static keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    public static javax.swing.JPanel Panel_Energized;
    public static javax.swing.JLabel Path;
    private javax.swing.JLabel Stock_Genset_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Update;
    private javax.swing.JLabel Stock_Genset_Update;
    private javax.swing.JLabel Supplier_List_Btn;
    public static javax.swing.JLabel a;
    public static javax.swing.JComboBox<String> alter;
    public static javax.swing.JComboBox<String> engine;
    private javax.swing.JLabel id1;
    public static javax.swing.JLabel id2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
