/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import static FPE.Mainpage.images;
import java.awt.Color;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ROBLES
 */
public class View_Shop_Filter extends javax.swing.JFrame {

    public static byte[] images  = null;
    Class_tables ct = new Class_tables();
    
    public View_Shop_Filter() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        Wiew_Genset_Display = new javax.swing.JLabel();
        KG2_ADD_STOCK_GENSET = new keeptoo.KGradientPanel();
        View_Shop_Filter_description = new javax.swing.JLabel();
        View_Shop_Filter_total = new javax.swing.JLabel();
        View_Shop_Filter_date = new javax.swing.JLabel();
        View_Shop_Filter_seller_price = new javax.swing.JLabel();
        View_Shop_Filter_brand = new javax.swing.JLabel();
        View_Shop_Filter_pic = new javax.swing.JLabel();
        View_Shop_Filter_id = new javax.swing.JLabel();
        ViewAdd = new javax.swing.JPanel();
        AddToCart = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        CartBack = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        View_Shop_Filter_quantity = new javax.swing.JTextField();
        a1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        View_Shop_Filter_type = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ViewCart = new javax.swing.JPanel();
        GoToCart = new javax.swing.JLabel();
        ViewAdd1 = new javax.swing.JPanel();
        OTHERS = new javax.swing.JLabel();
        count_process = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 71, 94));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Wiew_Genset_Display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Wiew_Genset_Display.setForeground(new java.awt.Color(255, 255, 255));
        Wiew_Genset_Display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Wiew_Genset_Display.setText("VIEW FILTER / PART PRODUCT");
        Wiew_Genset_Display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Wiew_Genset_DisplayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(Wiew_Genset_Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 470, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 100));

        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(0, 230, 184));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(0, 230, 184));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        View_Shop_Filter_description.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Shop_Filter_description.setForeground(new java.awt.Color(20, 31, 31));
        View_Shop_Filter_description.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Shop_Filter_description.setAlignmentY(1.0F);
        View_Shop_Filter_description.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_Shop_Filter_description, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 200, 30));

        View_Shop_Filter_total.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Shop_Filter_total.setForeground(new java.awt.Color(20, 31, 31));
        View_Shop_Filter_total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Shop_Filter_total.setAlignmentY(1.0F);
        View_Shop_Filter_total.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_Shop_Filter_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 200, 30));

        View_Shop_Filter_date.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Shop_Filter_date.setForeground(new java.awt.Color(20, 31, 31));
        View_Shop_Filter_date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Shop_Filter_date.setAlignmentY(1.0F);
        View_Shop_Filter_date.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_Shop_Filter_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 200, 30));

        View_Shop_Filter_seller_price.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Shop_Filter_seller_price.setForeground(new java.awt.Color(20, 31, 31));
        View_Shop_Filter_seller_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Shop_Filter_seller_price.setAlignmentY(1.0F);
        View_Shop_Filter_seller_price.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_Shop_Filter_seller_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 200, 30));

        View_Shop_Filter_brand.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Shop_Filter_brand.setForeground(new java.awt.Color(20, 31, 31));
        View_Shop_Filter_brand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Shop_Filter_brand.setAlignmentY(1.0F);
        View_Shop_Filter_brand.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_Shop_Filter_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 170, 30));

        View_Shop_Filter_pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Shop_Filter_pic.setForeground(new java.awt.Color(20, 31, 31));
        View_Shop_Filter_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Shop_Filter_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Image.png"))); // NOI18N
        View_Shop_Filter_pic.setAlignmentY(1.0F);
        View_Shop_Filter_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)));
        View_Shop_Filter_pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                View_Shop_Filter_picMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Shop_Filter_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 270, 150));

        View_Shop_Filter_id.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Shop_Filter_id.setForeground(new java.awt.Color(20, 31, 31));
        View_Shop_Filter_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Shop_Filter_id.setAlignmentY(1.0F);
        View_Shop_Filter_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_Shop_Filter_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 170, 30));

        ViewAdd.setBackground(new java.awt.Color(0, 204, 68));

        AddToCart.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        AddToCart.setForeground(new java.awt.Color(255, 255, 255));
        AddToCart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddToCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Edit_Btn.png"))); // NOI18N
        AddToCart.setText(" ADD TO CART");
        AddToCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCartMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToCartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddToCartMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ViewAddLayout = new javax.swing.GroupLayout(ViewAdd);
        ViewAdd.setLayout(ViewAddLayout);
        ViewAddLayout.setHorizontalGroup(
            ViewAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddToCart, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        ViewAddLayout.setVerticalGroup(
            ViewAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddToCart, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(ViewAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 190, 50));

        Stock_Genset_Panel_Back.setBackground(new java.awt.Color(255, 194, 102));

        CartBack.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        CartBack.setForeground(new java.awt.Color(255, 255, 255));
        CartBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CartBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Images_Back_Btn.png"))); // NOI18N
        CartBack.setText(" BACK");
        CartBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CartBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CartBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CartBackMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_BackLayout = new javax.swing.GroupLayout(Stock_Genset_Panel_Back);
        Stock_Genset_Panel_Back.setLayout(Stock_Genset_Panel_BackLayout);
        Stock_Genset_Panel_BackLayout.setHorizontalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CartBack, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_BackLayout.setVerticalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CartBack, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 530, 190, 50));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(20, 31, 31));
        jLabel16.setText("DATE");
        jLabel16.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 80, 30));

        View_Shop_Filter_quantity.setBackground(new java.awt.Color(0, 230, 184));
        View_Shop_Filter_quantity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        View_Shop_Filter_quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        View_Shop_Filter_quantity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        View_Shop_Filter_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                View_Shop_Filter_quantityKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                View_Shop_Filter_quantityKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                View_Shop_Filter_quantityKeyTyped(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Shop_Filter_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 200, 30));

        a1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        a1.setForeground(new java.awt.Color(20, 31, 31));
        a1.setText("ID");
        a1.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 60, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(20, 31, 31));
        jLabel3.setText("BRAND NAME");
        jLabel3.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 90, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(20, 31, 31));
        jLabel8.setText("DESCRIPTION");
        jLabel8.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 120, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(20, 31, 31));
        jLabel6.setText("TYPE");
        jLabel6.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 120, 30));

        jLabel30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(20, 31, 31));
        jLabel30.setText("PRICE");
        jLabel30.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 120, 30));

        jLabel31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(20, 31, 31));
        jLabel31.setText("QUANTITY");
        jLabel31.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 120, 30));

        jLabel29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(20, 31, 31));
        jLabel29.setText("TOTAL PRICE");
        jLabel29.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 120, 30));

        View_Shop_Filter_type.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Shop_Filter_type.setForeground(new java.awt.Color(20, 31, 31));
        View_Shop_Filter_type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Shop_Filter_type.setAlignmentY(1.0F);
        View_Shop_Filter_type.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_Shop_Filter_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 200, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 0));
        jLabel12.setToolTipText("");
        jLabel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)), "FILTER / PART INFORMATION", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 20), new java.awt.Color(20, 31, 31))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1000, 470));

        ViewCart.setBackground(new java.awt.Color(102, 204, 255));

        GoToCart.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        GoToCart.setForeground(new java.awt.Color(255, 255, 255));
        GoToCart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GoToCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Images_Back_Btn.png"))); // NOI18N
        GoToCart.setText(" GO TO CART");
        GoToCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoToCartMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GoToCartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GoToCartMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ViewCartLayout = new javax.swing.GroupLayout(ViewCart);
        ViewCart.setLayout(ViewCartLayout);
        ViewCartLayout.setHorizontalGroup(
            ViewCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GoToCart, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        ViewCartLayout.setVerticalGroup(
            ViewCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GoToCart, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(ViewCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 190, 50));

        ViewAdd1.setBackground(new java.awt.Color(102, 255, 102));

        OTHERS.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        OTHERS.setForeground(new java.awt.Color(255, 255, 255));
        OTHERS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OTHERS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Edit_Btn.png"))); // NOI18N
        OTHERS.setText(" OTHERS");
        OTHERS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OTHERSMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OTHERSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OTHERSMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ViewAdd1Layout = new javax.swing.GroupLayout(ViewAdd1);
        ViewAdd1.setLayout(ViewAdd1Layout);
        ViewAdd1Layout.setHorizontalGroup(
            ViewAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OTHERS, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        ViewAdd1Layout.setVerticalGroup(
            ViewAdd1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OTHERS, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(ViewAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, 190, 50));

        count_process.setText("1");
        KG2_ADD_STOCK_GENSET.add(count_process, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 20));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1070, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Wiew_Genset_DisplayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Wiew_Genset_DisplayAncestorAdded
        String Banner = Wiew_Genset_Display.getText();
        
        if(Banner.equals("VIEW FILTER / PART PRODUCT")){
            
        try{   
            String id = Mainpage.Shop_filter_id.getText();
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `filter_table` WHERE `ID`='"+id+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            View_Shop_Filter_id.setText(rs.getString("ID"));
            View_Shop_Filter_brand.setText(rs.getString("BRAND"));
            View_Shop_Filter_description.setText(rs.getString("DESCRIPTION"));
            View_Shop_Filter_date.setText(rs.getString("DATE"));
            View_Shop_Filter_type.setText(rs.getString("TYPE"));
            View_Shop_Filter_seller_price.setText(rs.getString("SELLER PRICE"));

            images = rs.getBytes("IMAGE");
            ImageIcon imageicon = new ImageIcon (new ImageIcon(images).getImage().getScaledInstance(View_Shop_Filter_pic.getWidth(), View_Shop_Filter_pic.getHeight(),Image.SCALE_SMOOTH) );
            View_Shop_Filter_pic.setIcon(imageicon);
          
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        try{
            String count_processed = count_process.getText();
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT `COUNT_PROCESS` FROM `history_filter` ORDER BY `ID` DESC LIMIT 1");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                if(count_processed.equals(rs.getString("COUNT_PROCESS"))){    
                    int output = Integer.parseInt(rs.getString("COUNT_PROCESS")) + 1;
                    count_process.setText(""+output);
                }
                else{
                    count_process.setText("1");
                }
          
            }
        }catch(Exception e){
            e.printStackTrace();
        }         
        
        }
    }//GEN-LAST:event_Wiew_Genset_DisplayAncestorAdded

    private void AddToCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartMouseClicked
        String date = View_Shop_Filter_date.getText();
        String brand = View_Shop_Filter_brand.getText();
        String desc = View_Shop_Filter_description.getText();
        String type = View_Shop_Filter_type.getText();
        String price = View_Shop_Filter_seller_price.getText();
        String quantity = View_Shop_Filter_quantity.getText();
        String total = View_Shop_Filter_total.getText();
        String qoutation = "";
        String c_name = "";
        String c_address = "";
        String c_email = "";
        String c_contact = "";
        String agent_name = "";
        String agent_contact = "";
        String filter_id =View_Shop_Filter_id.getText();
        String count_processed = count_process.getText();
        
        if(!Class_Cart.AddCart(filter_id,brand, date, desc, type, price, quantity, total) && !Class_Order.InsertBinFilter(date, brand, desc, type, price, quantity, total) && !Class_Order.InsertHistoryFilter(brand, date, desc, type, price, quantity, total, qoutation, c_name, c_address, c_email, c_contact, agent_name, agent_contact, filter_id, count_processed)){
            JOptionPane.showMessageDialog(null, "ADDED"); ct.ShowCart(); ct.ShowOrder();
        
        }
                
    }//GEN-LAST:event_AddToCartMouseClicked

    private void AddToCartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartMouseEntered
        AddToCart.setForeground(new Color(41, 61, 61));
      
    }//GEN-LAST:event_AddToCartMouseEntered

    private void AddToCartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartMouseExited
        AddToCart.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_AddToCartMouseExited

    private void CartBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartBackMouseClicked
        Mainpage.Shop_filter_id.setText("");
        dispose();
        
    }//GEN-LAST:event_CartBackMouseClicked

    private void CartBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartBackMouseEntered
        CartBack.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_CartBackMouseEntered

    private void CartBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartBackMouseExited
        CartBack.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_CartBackMouseExited

    private void View_Shop_Filter_picMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_Shop_Filter_picMouseClicked

    }//GEN-LAST:event_View_Shop_Filter_picMouseClicked

    private void View_Shop_Filter_quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_View_Shop_Filter_quantityKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_View_Shop_Filter_quantityKeyTyped

    private void View_Shop_Filter_quantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_View_Shop_Filter_quantityKeyPressed
        try{
        String quantitys=View_Shop_Filter_quantity.getText();
        int sum=0,quantity = 0 ;
        int price = Integer.parseInt(View_Shop_Filter_seller_price.getText());
        quantity = Integer.parseInt(View_Shop_Filter_quantity.getText().toString());
        sum = price * quantity;
        View_Shop_Filter_total.setText(""+sum);
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_View_Shop_Filter_quantityKeyPressed

    private void View_Shop_Filter_quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_View_Shop_Filter_quantityKeyReleased
        int sum=0,quantity = 0 ;
        int price = Integer.parseInt(View_Shop_Filter_seller_price.getText());
        quantity = Integer.parseInt(View_Shop_Filter_quantity.getText().toString());
        sum = price * quantity;
        View_Shop_Filter_total.setText(""+sum);
    }//GEN-LAST:event_View_Shop_Filter_quantityKeyReleased

    private void GoToCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoToCartMouseClicked
        AddCart ac = new AddCart();
        ac.setVisible(true);
        dispose();
    }//GEN-LAST:event_GoToCartMouseClicked

    private void GoToCartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoToCartMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_GoToCartMouseEntered

    private void GoToCartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoToCartMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_GoToCartMouseExited

    private void OTHERSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OTHERSMouseClicked
        Tech t = new Tech();
        t.setVisible(true);
        
    }//GEN-LAST:event_OTHERSMouseClicked

    private void OTHERSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OTHERSMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_OTHERSMouseEntered

    private void OTHERSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OTHERSMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_OTHERSMouseExited

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
            java.util.logging.Logger.getLogger(View_Shop_Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Shop_Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Shop_Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Shop_Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new View_Shop_Filter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddToCart;
    private javax.swing.JLabel CartBack;
    private javax.swing.JLabel GoToCart;
    private keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    private javax.swing.JLabel OTHERS;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel ViewAdd;
    public static javax.swing.JPanel ViewAdd1;
    public static javax.swing.JPanel ViewCart;
    public static javax.swing.JLabel View_Shop_Filter_brand;
    public static javax.swing.JLabel View_Shop_Filter_date;
    public static javax.swing.JLabel View_Shop_Filter_description;
    public static javax.swing.JLabel View_Shop_Filter_id;
    public static javax.swing.JLabel View_Shop_Filter_pic;
    private javax.swing.JTextField View_Shop_Filter_quantity;
    public static javax.swing.JLabel View_Shop_Filter_seller_price;
    public static javax.swing.JLabel View_Shop_Filter_total;
    public static javax.swing.JLabel View_Shop_Filter_type;
    public static javax.swing.JLabel Wiew_Genset_Display;
    private javax.swing.JLabel a1;
    private javax.swing.JLabel count_process;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}