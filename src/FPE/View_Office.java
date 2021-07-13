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
public class View_Office extends javax.swing.JFrame {
    String filename = null;
    String Office_id = null;
    public static byte[] images = null;
    
//-----------------------------------------------------------------
    int view_price;
    int view_quantity;
    int view_total;
    
    
    public View_Office() {
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
        View_Office_Display = new javax.swing.JLabel();
        KG2_ADD_STOCK_GENSET = new keeptoo.KGradientPanel();
        View_Office_pic = new javax.swing.JLabel();
        Stock_Genset_Panel_Update = new javax.swing.JPanel();
        Stock_Genset_Update = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        Stock_Genset_Back = new javax.swing.JLabel();
        Path = new javax.swing.JLabel();
        View_Office_quantity = new javax.swing.JTextField();
        View_Office_Category = new javax.swing.JTextField();
        View_Office_Brand = new javax.swing.JTextField();
        View_Office_Price = new javax.swing.JTextField();
        View_Office_date = new datechooser.beans.DateChooserCombo();
        View_Office_Type = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        View_Office_Remarks = new javax.swing.JTextField();
        Stock_Genset_Panel_View1 = new javax.swing.JPanel();
        Stock_Genset_Delete = new javax.swing.JLabel();
        View_Office_total_price = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        View_Office_Remarks1 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 71, 94));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        View_Office_Display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        View_Office_Display.setForeground(new java.awt.Color(255, 255, 255));
        View_Office_Display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Office_Display.setText("VIEW OFFICE ITEM");
        View_Office_Display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                View_Office_DisplayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(View_Office_Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 320, 110));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 130));

        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(42, 142, 142));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        View_Office_pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Office_pic.setForeground(new java.awt.Color(20, 31, 31));
        View_Office_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Office_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Default_Imge.png"))); // NOI18N
        View_Office_pic.setAlignmentY(1.0F);
        View_Office_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)));
        View_Office_pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                View_Office_picMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Office_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 280, 200));

        Stock_Genset_Panel_Update.setBackground(new java.awt.Color(66, 139, 202));

        Stock_Genset_Update.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Update.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Save.png"))); // NOI18N
        Stock_Genset_Update.setText("UPDATE");
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
            .addComponent(Stock_Genset_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_UpdateLayout.setVerticalGroup(
            Stock_Genset_Panel_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Update, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 160, 45));

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
                .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Stock_Genset_Panel_BackLayout.setVerticalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, 140, 45));

        Path.setText("1");
        KG2_ADD_STOCK_GENSET.add(Path, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 30, 30, -1));

        View_Office_quantity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Office_quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Office_quantity.setBorder(null);
        View_Office_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                View_Office_quantityKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                View_Office_quantityKeyTyped(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Office_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 210, 31));

        View_Office_Category.setEditable(false);
        View_Office_Category.setBackground(new java.awt.Color(220, 220, 200));
        View_Office_Category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Office_Category.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Office_Category.setText("OFFICE");
        View_Office_Category.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Office_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 210, 31));

        View_Office_Brand.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Office_Brand.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Office_Brand.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Office_Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 210, 31));

        View_Office_Price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Office_Price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Office_Price.setBorder(null);
        View_Office_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_Office_PriceActionPerformed(evt);
            }
        });
        View_Office_Price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                View_Office_PriceKeyTyped(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Office_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 210, 31));

        View_Office_date.setFieldFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));
        KG2_ADD_STOCK_GENSET.add(View_Office_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 210, 31));

        View_Office_Type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Office_Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "LAPTOP", "INK", "PRINT", "PAPER", "BALLPEN", "ERASER" }));
        View_Office_Type.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Office_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 210, 31));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(51, 214, 255));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setText(" CATEGORY");
        jTextField1.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 160, 31));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(51, 214, 255));
        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setText(" DATE RECIEVED");
        jTextField2.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 160, 31));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(51, 214, 255));
        jTextField3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField3.setText(" DESCRIPTION");
        jTextField3.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 160, 31));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(51, 214, 255));
        jTextField5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField5.setText(" QUANTITY");
        jTextField5.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 160, 31));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(51, 214, 255));
        jTextField7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField7.setText(" PRICE");
        jTextField7.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 160, 31));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(51, 214, 255));
        jTextField8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField8.setText(" TYPE");
        jTextField8.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 160, 31));

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(51, 214, 255));
        jTextField14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField14.setText(" PERSON INCHARGE");
        jTextField14.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 160, 31));

        View_Office_Remarks.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Office_Remarks.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Office_Remarks.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Office_Remarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 210, 31));

        Stock_Genset_Panel_View1.setBackground(new java.awt.Color(255, 86, 83));

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

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_View1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 170, 45));

        View_Office_total_price.setEditable(false);
        View_Office_total_price.setBackground(new java.awt.Color(220, 220, 200));
        View_Office_total_price.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Office_total_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Office_total_price.setBorder(null);
        View_Office_total_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                View_Office_total_priceKeyReleased(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Office_total_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 210, 31));

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(51, 214, 255));
        jTextField6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField6.setText(" TOTAL PRICE");
        jTextField6.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 160, 31));

        View_Office_Remarks1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Office_Remarks1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Office_Remarks1.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(View_Office_Remarks1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 210, 31));

        jTextField15.setEditable(false);
        jTextField15.setBackground(new java.awt.Color(51, 214, 255));
        jTextField15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField15.setText(" REMARKS");
        jTextField15.setBorder(null);
        KG2_ADD_STOCK_GENSET.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 160, 31));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 750, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void View_Office_picMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_Office_picMouseClicked
        View_Office_pic.setText(null);
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        

        ImageIcon imageicon = new ImageIcon (new ImageIcon(filename).getImage().getScaledInstance(View_Office_pic.getWidth(), View_Office_pic.getHeight(),Image.SCALE_SMOOTH) );
        View_Office_pic.setIcon(imageicon);

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
    }//GEN-LAST:event_View_Office_picMouseClicked

    private void Stock_Genset_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseClicked

    String category = View_Office_Category.getText().toUpperCase();
    String brand = View_Office_Brand.getText().toUpperCase();
    String model= "";
    String kva = "";
    String phasing = "";
    String type = View_Office_Type.getSelectedItem().toString().toUpperCase();
    String seller_price = View_Office_Price.getText().toUpperCase();
    String supplier_price = "";
    String quantity = View_Office_quantity.getText();
    int total_price = Integer.parseInt(View_Office_total_price.getText());
    
    
    String engine_sn = "";
    String alternator_sn = "";
    
    // String supplier_id ;
    String date_inbound = View_Office_date.getText().toUpperCase();
    // image
    String incharge = View_Office_Remarks.getText().toUpperCase();
    String remarks = View_Office_Remarks.getText().toUpperCase();
    String supplier = "";
 
    /// SUpplier info
 
    if(brand.equals("") || type.equals("SELECT") ||  seller_price.equals("") || quantity.equals("") )
    {
        JOptionPane.showMessageDialog(null, "FILL SOME BLANCK","",JOptionPane.ERROR_MESSAGE);
    }
    else if(!Class_SummaryStock.UpdateStock(category, brand, model, kva, phasing, type, supplier_price, seller_price, quantity, total_price, engine_sn, alternator_sn, supplier, date_inbound, images, incharge, remarks, Office_id))
    {
        JOptionPane.showMessageDialog(null, "SUCCESSFULLY ADDED !");  Webpage.ct.Stock(); Webpage.ct.Sale();  dispose();
    }
    }//GEN-LAST:event_Stock_Genset_UpdateMouseClicked

    private void Stock_Genset_UpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseEntered
      
        Stock_Genset_Panel_Update.setBackground(new Color(51, 207, 255));
    }//GEN-LAST:event_Stock_Genset_UpdateMouseEntered

    private void Stock_Genset_UpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseExited
     
        Stock_Genset_Panel_Update.setBackground(new Color(51, 187, 255));
    }//GEN-LAST:event_Stock_Genset_UpdateMouseExited

    private void Stock_Genset_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseClicked
    Class_tables ct = new Class_tables();
    ct.Stock();
    Webpage.Stock_cat = null;        
    dispose();
    }//GEN-LAST:event_Stock_Genset_BackMouseClicked

    private void Stock_Genset_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseEntered
     
        Stock_Genset_Panel_Back.setBackground(new Color(255,214,102));
    }//GEN-LAST:event_Stock_Genset_BackMouseEntered

    private void Stock_Genset_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseExited
   
        Stock_Genset_Panel_Back.setBackground(new Color(255,194,102));
    }//GEN-LAST:event_Stock_Genset_BackMouseExited

    private void View_Office_DisplayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_View_Office_DisplayAncestorAdded
    String Banner = View_Office_Display.getText();
    String id = Webpage.stock_id;
    
    if(Banner.equals("VIEW OFFICE ITEM"))
    {
        try{
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `stock_table` WHERE `STOCK ID` = '"+id+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Office_id = rs.getString("STOCK ID");
            View_Office_date.setText(rs.getString("DATE INBOUND"));
            View_Office_Category.setText(rs.getString("CATEGORY"));
            View_Office_Brand.setText(rs.getString("BRAND"));
            View_Office_Type.setSelectedItem(rs.getString("TYPE"));
            View_Office_Price.setText(rs.getString("SELLER PRICE"));
            View_Office_quantity.setText(rs.getString("QUANTITY"));
            View_Office_total_price.setText(rs.getString("TOTAL PRICE"));
            View_Office_Remarks.setText(rs.getString("REMARKS"));
            
            images = rs.getBytes("IMAGE");
            ImageIcon imageicon = new ImageIcon (new ImageIcon(images).getImage().getScaledInstance(View_Office_pic.getWidth(), View_Office_pic.getHeight(),Image.SCALE_SMOOTH) );
            View_Office_pic.setIcon(imageicon);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        

    }
    }//GEN-LAST:event_View_Office_DisplayAncestorAdded

    private void View_Office_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_Office_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_View_Office_PriceActionPerformed

    private void Stock_Genset_DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_DeleteMouseClicked
        String sid = Webpage.stock_id;

        if(sid.equals("")){
            JOptionPane.showMessageDialog(null, " PLEASE SELECT! ","",JOptionPane.ERROR_MESSAGE);
            Webpage.ct.Stock();
        }
        else{
            int opt = JOptionPane.showConfirmDialog(null, "YOU WANT TO DELETE THIS STOCK ? ","",JOptionPane.YES_NO_OPTION);
            if(opt==0){
                if(JOptionPane.YES_NO_OPTION == JOptionPane.YES_OPTION && !Class_SummaryStock.DeleteGenset(sid) ){
                    JOptionPane.showMessageDialog(null, " DELETE STOCK! ","",JOptionPane.ERROR_MESSAGE);
                     Webpage.Refresh(); dispose();
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

    private void View_Office_total_priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_View_Office_total_priceKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_View_Office_total_priceKeyReleased

    private void View_Office_quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_View_Office_quantityKeyReleased
     String q = View_Office_quantity.getText();
     view_price = Integer.parseInt(View_Office_Price.getText());
     if(q.isEmpty())
     {
        view_total  = view_price * 0;
     
        View_Office_total_price.setText(""+view_total);  
     }
     else{
        view_quantity  = Integer.parseInt(View_Office_quantity.getText());
        view_total  = view_price * view_quantity;    
        View_Office_total_price.setText(""+view_total); 
     }
     
    }//GEN-LAST:event_View_Office_quantityKeyReleased

    private void View_Office_quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_View_Office_quantityKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_View_Office_quantityKeyTyped

    private void View_Office_PriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_View_Office_PriceKeyTyped
       char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_View_Office_PriceKeyTyped

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
            java.util.logging.Logger.getLogger(View_Office.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Office.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Office.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Office.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Office().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    public static javax.swing.JLabel Path;
    private javax.swing.JLabel Stock_Genset_Back;
    public static javax.swing.JLabel Stock_Genset_Delete;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Update;
    public static javax.swing.JPanel Stock_Genset_Panel_View1;
    private javax.swing.JLabel Stock_Genset_Update;
    public static javax.swing.JTextField View_Office_Brand;
    public static javax.swing.JTextField View_Office_Category;
    public static javax.swing.JLabel View_Office_Display;
    public static javax.swing.JTextField View_Office_Price;
    public static javax.swing.JTextField View_Office_Remarks;
    public static javax.swing.JTextField View_Office_Remarks1;
    public static javax.swing.JComboBox<String> View_Office_Type;
    public static datechooser.beans.DateChooserCombo View_Office_date;
    public static javax.swing.JLabel View_Office_pic;
    public static javax.swing.JTextField View_Office_quantity;
    public static javax.swing.JTextField View_Office_total_price;
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
