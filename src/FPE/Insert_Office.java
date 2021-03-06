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
public class Insert_Office extends javax.swing.JFrame {
    String filename = null;
    public static byte[] images = null;
    public static String supplier_id="";
    
        //-------------------------------------------------
    int insert_price;
    int insert_quantity;
    int insert_total;
    
    public Insert_Office() {
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
        Insert_Office_pic = new javax.swing.JLabel();
        Stock_Genset_Panel_Update = new javax.swing.JPanel();
        Stock_Genset_Update = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        Stock_Genset_Back = new javax.swing.JLabel();
        Path = new javax.swing.JLabel();
        Insert_Office_quantity = new javax.swing.JTextField();
        Insert_Office_Category = new javax.swing.JTextField();
        Insert_Office_Brand = new javax.swing.JTextField();
        Insert_Office_Price = new javax.swing.JTextField();
        Insert_Office_date = new datechooser.beans.DateChooserCombo();
        Insert_Office_Type = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        remtxt = new javax.swing.JTextField();
        Insert_Office_Remarks = new javax.swing.JTextField();
        Insert_Office_Incharges = new javax.swing.JTextField();
        perTxt = new javax.swing.JTextField();
        Insert_Office_total_price = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 71, 94));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Inventory_Display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Inventory_Display.setForeground(new java.awt.Color(255, 255, 255));
        Inventory_Display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Inventory_Display.setText("ADD NEW OFFICE STOCK");
        Inventory_Display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Inventory_DisplayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(Inventory_Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 470, 110));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 130));

        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Insert_Office_pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Insert_Office_pic.setForeground(new java.awt.Color(20, 31, 31));
        Insert_Office_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Insert_Office_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Default_Imge.png"))); // NOI18N
        Insert_Office_pic.setAlignmentY(1.0F);
        Insert_Office_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)));
        Insert_Office_pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Insert_Office_picMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Insert_Office_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 280, 190));

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

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 170, 50));

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
                .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
        );
        Stock_Genset_Panel_BackLayout.setVerticalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 170, 50));

        Path.setText("1");
        KG2_ADD_STOCK_GENSET.add(Path, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, 30, -1));

        Insert_Office_quantity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Office_quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Office_quantity.setBorder(null);
        Insert_Office_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Insert_Office_quantityKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Insert_Office_quantityKeyTyped(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Insert_Office_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 200, 31));

        Insert_Office_Category.setEditable(false);
        Insert_Office_Category.setBackground(new java.awt.Color(220, 220, 200));
        Insert_Office_Category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Office_Category.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Office_Category.setText("OFFICE");
        Insert_Office_Category.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Office_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 200, 31));

        Insert_Office_Brand.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Office_Brand.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Office_Brand.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Office_Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 200, 31));

        Insert_Office_Price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Office_Price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Office_Price.setBorder(null);
        Insert_Office_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_Office_PriceActionPerformed(evt);
            }
        });
        Insert_Office_Price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Insert_Office_PriceKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Insert_Office_PriceKeyTyped(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Insert_Office_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 200, 31));

        Insert_Office_date.setFieldFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));
        KG2_ADD_STOCK_GENSET.add(Insert_Office_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 200, 31));

        Insert_Office_Type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Office_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "LAPTOP", "INK", "PRINT", "PAPER", "BALLPEN", "ERASER", "OTHER" }));
        Insert_Office_Type.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Office_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 200, 31));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(102, 255, 102));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setText(" CATEGORY");
        jTextField1.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 160, 31));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(102, 255, 102));
        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setText(" DATE RECIEVED");
        jTextField2.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 160, 31));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(102, 255, 102));
        jTextField3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField3.setText(" DESCRIPTION");
        jTextField3.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 160, 31));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(102, 255, 102));
        jTextField5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField5.setText(" QUANTITY");
        jTextField5.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 160, 31));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(102, 255, 102));
        jTextField7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField7.setText(" PRICE");
        jTextField7.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 160, 31));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(102, 255, 102));
        jTextField8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField8.setText(" TYPE");
        jTextField8.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 160, 31));

        remtxt.setEditable(false);
        remtxt.setBackground(new java.awt.Color(102, 255, 102));
        remtxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        remtxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        remtxt.setText(" REMARKS");
        remtxt.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(remtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 160, 31));

        Insert_Office_Remarks.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Office_Remarks.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Office_Remarks.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Office_Remarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 200, 31));

        Insert_Office_Incharges.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Office_Incharges.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Office_Incharges.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(Insert_Office_Incharges, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 200, 31));

        perTxt.setEditable(false);
        perTxt.setBackground(new java.awt.Color(102, 255, 102));
        perTxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        perTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        perTxt.setText("  PERSON INCHARGES");
        perTxt.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(perTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 160, 31));

        Insert_Office_total_price.setEditable(false);
        Insert_Office_total_price.setBackground(new java.awt.Color(220, 220, 200));
        Insert_Office_total_price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Insert_Office_total_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Office_total_price.setBorder(null);
        Insert_Office_total_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Insert_Office_total_priceKeyReleased(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(Insert_Office_total_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 200, 31));

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
        KG2_ADD_STOCK_GENSET.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 20, 20));

        jLabel23.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Select/asterisk_15px.png"))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 20, 20));

        jLabel24.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Select/asterisk_15px.png"))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 20, 20));

        jLabel25.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Select/asterisk_15px.png"))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 20, 20));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 750, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Insert_Office_picMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Insert_Office_picMouseClicked
        Insert_Office_pic.setText(null);
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        

        ImageIcon imageicon = new ImageIcon (new ImageIcon(filename).getImage().getScaledInstance(Insert_Office_pic.getWidth(), Insert_Office_pic.getHeight(),Image.SCALE_SMOOTH) );
        Insert_Office_pic.setIcon(imageicon);

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
    }//GEN-LAST:event_Insert_Office_picMouseClicked

    private void Stock_Genset_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseClicked
    String category = Insert_Office_Category.getText().toUpperCase();
    String brand = Insert_Office_Brand.getText().toUpperCase();
    String model= "";
    String kva = "";
    String phasing = "";
    String type = Insert_Office_Type.getSelectedItem().toString().toUpperCase();
    String seller_price = Insert_Office_Price.getText().toUpperCase();
    String supplier_price = "";
    String quantity = Insert_Office_quantity.getText();
    int total_price = Integer.parseInt(Insert_Office_total_price.getText());
    
    
    String engine_sn = "";
    String alternator_sn = "";
    
    // String supplier_id ;
    String date_inbound = Insert_Office_date.getText().toUpperCase();
    // image
    String incharge = Insert_Office_Incharges.getText().toUpperCase();
    String remarks = Insert_Office_Remarks.getText().toUpperCase();
    String supplier = "";
 
    /// SUpplier info
 
    if(brand.equals("") || type.equals("SELECT") || seller_price.equals("") || quantity.equals("") )
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

    private void Insert_Office_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_Office_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Insert_Office_PriceActionPerformed

    private void Insert_Office_PriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Insert_Office_PriceKeyReleased
        try{
            String number  = Insert_Office_Price.getText() ;
            int inputQuantity = Integer.parseInt(Insert_Office_Price.getText());
        }
        catch(NumberFormatException  e){
           Insert_Office_Price.setText("");
        }
    }//GEN-LAST:event_Insert_Office_PriceKeyReleased

    private void Insert_Office_quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Insert_Office_quantityKeyReleased
    insert_price = Integer.parseInt(Insert_Office_Price.getText());
    String q = Insert_Office_quantity.getText();
    if(q.isEmpty())
        {
            insert_total = insert_price * 0 ; 
            Insert_Office_total_price.setText(""+insert_total);
        }
    else
        {        
            insert_price = Integer.parseInt(Insert_Office_Price.getText());
            insert_quantity = Integer.parseInt(Insert_Office_quantity.getText());
            insert_total = insert_price * insert_quantity ;
            Insert_Office_total_price.setText(""+insert_total);
        }
        
    }//GEN-LAST:event_Insert_Office_quantityKeyReleased

    private void Insert_Office_total_priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Insert_Office_total_priceKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Insert_Office_total_priceKeyReleased

    private void Insert_Office_PriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Insert_Office_PriceKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_Insert_Office_PriceKeyTyped

    private void Insert_Office_quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Insert_Office_quantityKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_Insert_Office_quantityKeyTyped

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
            java.util.logging.Logger.getLogger(Insert_Office.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert_Office.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert_Office.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_Office.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Insert_Office().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Insert_Office_Brand;
    public static javax.swing.JTextField Insert_Office_Category;
    public static javax.swing.JTextField Insert_Office_Incharges;
    public static javax.swing.JTextField Insert_Office_Price;
    public static javax.swing.JTextField Insert_Office_Remarks;
    public static javax.swing.JComboBox<String> Insert_Office_Type;
    public static datechooser.beans.DateChooserCombo Insert_Office_date;
    public static javax.swing.JLabel Insert_Office_pic;
    public static javax.swing.JTextField Insert_Office_quantity;
    public static javax.swing.JTextField Insert_Office_total_price;
    public static javax.swing.JLabel Inventory_Display;
    public static keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    public static javax.swing.JLabel Path;
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
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    public static javax.swing.JTextField perTxt;
    public static javax.swing.JTextField remtxt;
    // End of variables declaration//GEN-END:variables
}
