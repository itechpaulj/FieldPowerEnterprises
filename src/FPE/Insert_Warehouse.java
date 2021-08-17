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
public class Insert_Warehouse extends javax.swing.JFrame {
    String filename = null;
    public static byte[] images = null;
    String supplier_id = "";
        //-------------------------------------------------
    int insert_price;
    int insert_quantity;
    int insert_total;
    
    public Insert_Warehouse() {
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
        Inventory_Display = new javax.swing.JLabel();
        KG2_ADD_STOCK_GENSET = new keeptoo.KGradientPanel();
        Insert_Wh_date = new datechooser.beans.DateChooserCombo();
        Insert_Wh_Type = new javax.swing.JComboBox<>();
        Insert_Wh_Category = new javax.swing.JTextField();
        Insert_Wh_Brand = new javax.swing.JTextField();
        Insert_Wh_remarks = new javax.swing.JTextField();
        Insert_Wh_incharge = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        Stock_Genset_Panel_Update = new javax.swing.JPanel();
        Stock_Genset_Update = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        Stock_Genset_Back = new javax.swing.JLabel();
        Insert_Wh_pic = new javax.swing.JLabel();
        Insert_Wh_quantity = new javax.swing.JTextField();
        Insert_Wh_price = new javax.swing.JTextField();
        Insert_Wh_total_price = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 71, 94));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Inventory_Display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Inventory_Display.setForeground(new java.awt.Color(255, 255, 255));
        Inventory_Display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Inventory_Display.setText("ADD WAREHOUSE STOCK");
        Inventory_Display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Inventory_DisplayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(Inventory_Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 380, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 130));

        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Insert_Wh_date.setFieldFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));
        KG2_ADD_STOCK_GENSET.add(Insert_Wh_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 210, 30));

        Insert_Wh_Type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Wh_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "TOOLS" }));
        Insert_Wh_Type.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Wh_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 210, 30));

        Insert_Wh_Category.setEditable(false);
        Insert_Wh_Category.setBackground(new java.awt.Color(220, 220, 200));
        Insert_Wh_Category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Wh_Category.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Wh_Category.setText("WAREHOUSE");
        Insert_Wh_Category.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Wh_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 210, 30));

        Insert_Wh_Brand.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Wh_Brand.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Wh_Brand.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Wh_Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 210, 30));

        Insert_Wh_remarks.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Wh_remarks.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Wh_remarks.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Wh_remarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 210, 30));

        Insert_Wh_incharge.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Wh_incharge.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Wh_incharge.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Wh_incharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 210, 30));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(102, 255, 102));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setText(" CATEGORY");
        jTextField1.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 160, 30));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(102, 255, 102));
        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setText(" DATE RECIEVED");
        jTextField2.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 160, 30));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(102, 255, 102));
        jTextField3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField3.setText(" DESCRPTION");
        jTextField3.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 160, 30));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(102, 255, 102));
        jTextField5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField5.setText(" QUANTITY");
        jTextField5.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 160, 30));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(102, 255, 102));
        jTextField7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField7.setText(" PRICE");
        jTextField7.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 160, 30));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(102, 255, 102));
        jTextField8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField8.setText(" TYPE");
        jTextField8.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 160, 30));

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(102, 255, 102));
        jTextField14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField14.setText(" REMARKS");
        jTextField14.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 160, 30));

        jTextField15.setEditable(false);
        jTextField15.setBackground(new java.awt.Color(102, 255, 102));
        jTextField15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField15.setText(" PERSON INCHARGES");
        jTextField15.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 160, 30));

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
            .addGroup(Stock_Genset_Panel_UpdateLayout.createSequentialGroup()
                .addComponent(Stock_Genset_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );
        Stock_Genset_Panel_UpdateLayout.setVerticalGroup(
            Stock_Genset_Panel_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 170, 45));

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
                .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 51, Short.MAX_VALUE))
        );
        Stock_Genset_Panel_BackLayout.setVerticalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 170, 45));

        Insert_Wh_pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Insert_Wh_pic.setForeground(new java.awt.Color(20, 31, 31));
        Insert_Wh_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Insert_Wh_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Default_Imge.png"))); // NOI18N
        Insert_Wh_pic.setAlignmentY(1.0F);
        Insert_Wh_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)));
        Insert_Wh_pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Insert_Wh_picMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Insert_Wh_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 280, 180));

        Insert_Wh_quantity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Wh_quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Wh_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_Wh_quantityActionPerformed(evt);
            }
        });
        Insert_Wh_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Insert_Wh_quantityKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Insert_Wh_quantityKeyTyped(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Insert_Wh_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 210, 30));

        Insert_Wh_price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Wh_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Wh_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_Wh_priceActionPerformed(evt);
            }
        });
        Insert_Wh_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Insert_Wh_priceKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Insert_Wh_priceKeyTyped(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Insert_Wh_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 210, 30));

        Insert_Wh_total_price.setEditable(false);
        Insert_Wh_total_price.setBackground(new java.awt.Color(220, 220, 200));
        Insert_Wh_total_price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Wh_total_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Wh_total_price.setBorder(null);
        Insert_Wh_total_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Insert_Wh_total_priceKeyReleased(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Insert_Wh_total_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 210, 31));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(102, 255, 102));
        jTextField6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField6.setText(" TOTAL PRICE");
        jTextField6.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 160, 31));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Select/asterisk_15px.png"))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 20, 20));

        jLabel24.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Select/asterisk_15px.png"))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 20, 20));

        jLabel25.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Select/asterisk_15px.png"))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 20, 20));

        jLabel23.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Select/asterisk_15px.png"))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 20, 20));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 750, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Insert_Wh_picMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Insert_Wh_picMouseClicked
        Insert_Wh_pic.setText(null);
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        

        ImageIcon imageicon = new ImageIcon (new ImageIcon(filename).getImage().getScaledInstance(Insert_Wh_pic.getWidth(), Insert_Wh_pic.getHeight(),Image.SCALE_SMOOTH) );
        Insert_Wh_pic.setIcon(imageicon);

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
    }//GEN-LAST:event_Insert_Wh_picMouseClicked

    private void Stock_Genset_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseClicked
    
    String category = Insert_Wh_Category.getText().toUpperCase();
    String brand = Insert_Wh_Brand.getText().toUpperCase();
    String model= "";
    String kva = "";
    String phasing = "";
    String type = Insert_Wh_Type.getSelectedItem().toString().toUpperCase();
    String seller_price = Insert_Wh_price.getText().toUpperCase();
    String supplier_price = "";
    String quantity = Insert_Wh_quantity.getText();
    int total_price = Integer.parseInt(Insert_Wh_total_price.getText());
    
    
    String engine_sn = "";
    String alternator_sn = "";
    
    // String supplier_id ;
    String date_inbound = Insert_Wh_date.getText().toUpperCase();
    // image
    String incharge = "";
    String remarks = Insert_Wh_remarks.getText().toUpperCase();
    String supplier = "";
 
    /// SUpplier info
 
    if(brand.equals("") || type.equals("SELECT") || seller_price.equals("") || quantity.equals("")  )
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

    private void Insert_Wh_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_Wh_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Insert_Wh_quantityActionPerformed

    private void Insert_Wh_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_Wh_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Insert_Wh_priceActionPerformed

    private void Insert_Wh_priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Insert_Wh_priceKeyReleased
       
    }//GEN-LAST:event_Insert_Wh_priceKeyReleased

    private void Insert_Wh_quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Insert_Wh_quantityKeyReleased
    String q = Insert_Wh_quantity.getText();
    insert_price = Integer.parseInt(Insert_Wh_price.getText());
    if(q.isEmpty())
        {
            insert_total = insert_price * 0 ; 
            Insert_Wh_total_price.setText(""+insert_total);
        }
    else
        {   
            insert_price = Integer.parseInt(Insert_Wh_price.getText());
            insert_quantity = Integer.parseInt(Insert_Wh_quantity.getText());
            insert_total = insert_price * insert_quantity ;
            Insert_Wh_total_price.setText(""+insert_total);
        }
    }//GEN-LAST:event_Insert_Wh_quantityKeyReleased

    private void Insert_Wh_total_priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Insert_Wh_total_priceKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Insert_Wh_total_priceKeyReleased

    private void Insert_Wh_priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Insert_Wh_priceKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_Insert_Wh_priceKeyTyped

    private void Insert_Wh_quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Insert_Wh_quantityKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_Insert_Wh_quantityKeyTyped

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
            java.util.logging.Logger.getLogger(Insert_Warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert_Warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert_Warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_Warehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert_Warehouse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Insert_Wh_Brand;
    public static javax.swing.JTextField Insert_Wh_Category;
    public static javax.swing.JComboBox<String> Insert_Wh_Type;
    public static datechooser.beans.DateChooserCombo Insert_Wh_date;
    public static javax.swing.JTextField Insert_Wh_incharge;
    public static javax.swing.JLabel Insert_Wh_pic;
    private javax.swing.JTextField Insert_Wh_price;
    private javax.swing.JTextField Insert_Wh_quantity;
    public static javax.swing.JTextField Insert_Wh_remarks;
    public static javax.swing.JTextField Insert_Wh_total_price;
    public static javax.swing.JLabel Inventory_Display;
    public static keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    private javax.swing.JLabel Stock_Genset_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Update;
    private javax.swing.JLabel Stock_Genset_Update;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
