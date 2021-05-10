/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.awt.Color;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;

/**
 *
 * @author ROBLES
 */
public class View_Shop_Genset extends javax.swing.JFrame {

    public static byte[] images  = null;
    
    public static String date_recieved = null;
    public static String supplier_price = null;
    public static String supplier_name = null;
    public static String energized = null;
    public static String tank_cap = null;
    public static String oil_usage = null;
    public static String tech = null;
    public static String updated_at = null;
 
    
    public View_Shop_Genset() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        View_Genset_Display = new javax.swing.JLabel();
        KG2_ADD_STOCK_GENSET = new keeptoo.KGradientPanel();
        View_Genset_phasing = new javax.swing.JLabel();
        View_Genset_kva = new javax.swing.JLabel();
        View_Genset_engine_sn = new javax.swing.JLabel();
        View_Genset_dimension = new javax.swing.JLabel();
        View_Genset_alter_sn = new javax.swing.JLabel();
        View_Genset_id = new javax.swing.JLabel();
        View_Genset_brand = new javax.swing.JLabel();
        View_Genset_model = new javax.swing.JLabel();
        View_Genset_pic = new javax.swing.JLabel();
        View_Genset_type = new javax.swing.JLabel();
        Stock_Genset_Panel_Update = new javax.swing.JPanel();
        View_Genset__Btn = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        View_Genset__Back = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        View_Genset_price = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 71, 94));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        View_Genset_Display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        View_Genset_Display.setForeground(new java.awt.Color(255, 255, 255));
        View_Genset_Display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Genset_Display.setText("VIEW GENSET PRODUCT");
        View_Genset_Display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                View_Genset_DisplayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(View_Genset_Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 470, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 100));

        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(0, 230, 184));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(0, 230, 184));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        View_Genset_phasing.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Genset_phasing.setForeground(new java.awt.Color(20, 31, 31));
        View_Genset_phasing.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Genset_phasing.setAlignmentY(1.0F);
        View_Genset_phasing.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_Genset_phasing, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 180, 30));

        View_Genset_kva.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Genset_kva.setForeground(new java.awt.Color(20, 31, 31));
        View_Genset_kva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Genset_kva.setAlignmentY(1.0F);
        View_Genset_kva.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_Genset_kva, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 180, 30));

        View_Genset_engine_sn.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Genset_engine_sn.setForeground(new java.awt.Color(20, 31, 31));
        View_Genset_engine_sn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Genset_engine_sn.setAlignmentY(1.0F);
        View_Genset_engine_sn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_Genset_engine_sn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 180, 30));

        View_Genset_dimension.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Genset_dimension.setForeground(new java.awt.Color(20, 31, 31));
        View_Genset_dimension.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Genset_dimension.setAlignmentY(1.0F);
        View_Genset_dimension.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_Genset_dimension, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, 180, 30));

        View_Genset_alter_sn.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Genset_alter_sn.setForeground(new java.awt.Color(20, 31, 31));
        View_Genset_alter_sn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Genset_alter_sn.setAlignmentY(1.0F);
        View_Genset_alter_sn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_Genset_alter_sn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 180, 30));

        View_Genset_id.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Genset_id.setForeground(new java.awt.Color(20, 31, 31));
        View_Genset_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Genset_id.setAlignmentY(1.0F);
        View_Genset_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_Genset_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 180, 30));

        View_Genset_brand.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Genset_brand.setForeground(new java.awt.Color(20, 31, 31));
        View_Genset_brand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Genset_brand.setAlignmentY(1.0F);
        View_Genset_brand.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_Genset_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 180, 30));

        View_Genset_model.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Genset_model.setForeground(new java.awt.Color(20, 31, 31));
        View_Genset_model.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Genset_model.setAlignmentY(1.0F);
        View_Genset_model.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_Genset_model, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 180, 30));

        View_Genset_pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Genset_pic.setForeground(new java.awt.Color(20, 31, 31));
        View_Genset_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Genset_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Image.png"))); // NOI18N
        View_Genset_pic.setAlignmentY(1.0F);
        View_Genset_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)));
        View_Genset_pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                View_Genset_picMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_Genset_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 270, 150));

        View_Genset_type.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Genset_type.setForeground(new java.awt.Color(20, 31, 31));
        View_Genset_type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Genset_type.setAlignmentY(1.0F);
        View_Genset_type.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_Genset_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 180, 30));

        Stock_Genset_Panel_Update.setBackground(new java.awt.Color(51, 187, 255));

        View_Genset__Btn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        View_Genset__Btn.setForeground(new java.awt.Color(255, 255, 255));
        View_Genset__Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Genset__Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Edit_Btn.png"))); // NOI18N
        View_Genset__Btn.setText(" PROCEED");
        View_Genset__Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                View_Genset__BtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                View_Genset__BtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                View_Genset__BtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_UpdateLayout = new javax.swing.GroupLayout(Stock_Genset_Panel_Update);
        Stock_Genset_Panel_Update.setLayout(Stock_Genset_Panel_UpdateLayout);
        Stock_Genset_Panel_UpdateLayout.setHorizontalGroup(
            Stock_Genset_Panel_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(View_Genset__Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_UpdateLayout.setVerticalGroup(
            Stock_Genset_Panel_UpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(View_Genset__Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 190, 50));

        Stock_Genset_Panel_Back.setBackground(new java.awt.Color(255, 194, 102));

        View_Genset__Back.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        View_Genset__Back.setForeground(new java.awt.Color(255, 255, 255));
        View_Genset__Back.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        View_Genset__Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Images_Back_Btn.png"))); // NOI18N
        View_Genset__Back.setText("  BACK              ");
        View_Genset__Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                View_Genset__BackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                View_Genset__BackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                View_Genset__BackMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_BackLayout = new javax.swing.GroupLayout(Stock_Genset_Panel_Back);
        Stock_Genset_Panel_Back.setLayout(Stock_Genset_Panel_BackLayout);
        Stock_Genset_Panel_BackLayout.setHorizontalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(View_Genset__Back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_BackLayout.setVerticalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(View_Genset__Back, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 530, 190, 50));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(20, 31, 31));
        jLabel20.setText("UNIT TYPE");
        jLabel20.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 130, 30));

        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(20, 31, 31));
        jLabel22.setText("DIMENSION");
        jLabel22.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 130, 30));

        jLabel29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(20, 31, 31));
        jLabel29.setText("PRICE");
        jLabel29.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 130, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(20, 31, 31));
        jLabel11.setText("ENGINE_SN");
        jLabel11.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 130, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(20, 31, 31));
        jLabel15.setText("ALTERNATOR_SN");
        jLabel15.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 130, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(20, 31, 31));
        jLabel10.setText("PHASING");
        jLabel10.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 130, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(20, 31, 31));
        jLabel7.setText("KVA");
        jLabel7.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 80, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(20, 31, 31));
        jLabel5.setText("MODEL");
        jLabel5.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 80, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(20, 31, 31));
        jLabel2.setText("BRAND");
        jLabel2.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 80, 30));

        View_Genset_price.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_Genset_price.setForeground(new java.awt.Color(20, 31, 31));
        View_Genset_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Genset_price.setAlignmentY(1.0F);
        View_Genset_price.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_Genset_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 180, 30));

        a.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        a.setForeground(new java.awt.Color(20, 31, 31));
        a.setText("ID");
        a.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 80, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 0));
        jLabel12.setToolTipText("");
        jLabel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)), "GENSET INFORMATION", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 20), new java.awt.Color(20, 31, 31))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1000, 470));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1070, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void View_Genset_DisplayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_View_Genset_DisplayAncestorAdded
        String Banner = View_Genset_Display.getText();
        
        if(Banner.equals("VIEW GENSET PRODUCT")){
            
        try{   
            String id = Mainpage.Shop_genset_id.getText();
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `genset_table` WHERE `ID`='"+id+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            
            date_recieved = rs.getString("DATE");
            supplier_price = rs.getString("PRICE");
            supplier_name = rs.getString("SUPPLIER");
            energized = rs.getString("ENERGIZED DATE");
            tank_cap = rs.getString("TANK CAPACITY");
            oil_usage = rs.getString("OIL USAGE");
            tech = rs.getString("TECHNICIAN");
            updated_at = rs.getString("UPDATED AT");
   
                
            View_Genset_id.setText(rs.getString("ID"));
            View_Genset_brand.setText(rs.getString("bRAND"));
            View_Genset_model.setText(rs.getString("MODEL"));
            View_Genset_kva.setText(rs.getString("KVA"));
            View_Genset_phasing.setText(rs.getString("PHASING"));
            View_Genset_type.setText(rs.getString("UNIT_TYPE"));
            View_Genset_dimension.setText(rs.getString("DIMENSION"));
            
            View_Genset_price.setText(rs.getString("SELLER_PRICE"));
            String [] eng_sn = rs.getString("ENGINE_SERIAL_NO").split(" - ");
            String [] alter_sn = rs.getString("ALTERNATOR_SERIAL_NO").split(" - ");
            
            View_Genset_engine_sn.setText(eng_sn[1]);
            View_Genset_alter_sn.setText(alter_sn[1]);
            
            images = rs.getBytes("IMAGE");
            ImageIcon imageicon = new ImageIcon (new ImageIcon(images).getImage().getScaledInstance(View_Genset_pic.getWidth(), View_Genset_pic.getHeight(),Image.SCALE_SMOOTH) );
            View_Genset_pic.setIcon(imageicon);
          
            }
        }catch(Exception e){
            e.printStackTrace();
        } }
    }//GEN-LAST:event_View_Genset_DisplayAncestorAdded

    private void View_Genset__BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_Genset__BtnMouseClicked
           Process_Genset p = new Process_Genset(); 
           Process_Genset.Process_Genset_Display.setText("GENSET PROCESSING");
           Process_Genset.Process_Genset_id.setText(View_Genset_id.getText());
           Process_Genset.Process_Genset_brand.setText(View_Genset_brand.getText());
           Process_Genset.Process_Genset_model.setText(View_Genset_model.getText());
           Process_Genset.Process_Genset_kva.setText(View_Genset_kva.getText());
           Process_Genset.Process_Genset_type.setText(View_Genset_type.getText());
           Process_Genset.Process_Genset_dimension.setText(View_Genset_dimension.getText());
           Process_Genset.Process_Genset_phasing.setText(View_Genset_phasing.getText());
           Process_Genset.Process_Genset_price.setText(View_Genset_price.getText());
           Process_Genset.Process_Genset_Engine_Serial.setText(View_Genset_engine_sn.getText());
           Process_Genset.Process_Genset_Alter_Serial.setText(View_Genset_alter_sn.getText());
           
           ImageIcon imageicon = new ImageIcon (new ImageIcon(images).getImage().getScaledInstance(Process_Genset.Process_Genset_pic.getWidth(), Process_Genset.Process_Genset_pic.getHeight(),Image.SCALE_SMOOTH) );
           Process_Genset.Process_Genset_pic.setIcon(imageicon);
           
           
            p.setVisible(true);
            dispose();
        
    }//GEN-LAST:event_View_Genset__BtnMouseClicked

    private void View_Genset__BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_Genset__BtnMouseEntered
        View_Genset__Btn.setForeground(new Color(41, 61, 61));
      
    }//GEN-LAST:event_View_Genset__BtnMouseEntered

    private void View_Genset__BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_Genset__BtnMouseExited
        View_Genset__Btn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_View_Genset__BtnMouseExited

    private void View_Genset__BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_Genset__BackMouseClicked
        Mainpage.Shop_genset_id.setText("");
        dispose();
        
    }//GEN-LAST:event_View_Genset__BackMouseClicked

    private void View_Genset__BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_Genset__BackMouseEntered
        View_Genset__Back.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_View_Genset__BackMouseEntered

    private void View_Genset__BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_Genset__BackMouseExited
        View_Genset__Back.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_View_Genset__BackMouseExited

    private void View_Genset_picMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_Genset_picMouseClicked

    }//GEN-LAST:event_View_Genset_picMouseClicked

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
            java.util.logging.Logger.getLogger(View_Shop_Genset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Shop_Genset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Shop_Genset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Shop_Genset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new View_Shop_Genset().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Update;
    public static javax.swing.JLabel View_Genset_Display;
    private javax.swing.JLabel View_Genset__Back;
    private javax.swing.JLabel View_Genset__Btn;
    public static javax.swing.JLabel View_Genset_alter_sn;
    public static javax.swing.JLabel View_Genset_brand;
    public static javax.swing.JLabel View_Genset_dimension;
    public static javax.swing.JLabel View_Genset_engine_sn;
    public static javax.swing.JLabel View_Genset_id;
    public static javax.swing.JLabel View_Genset_kva;
    public static javax.swing.JLabel View_Genset_model;
    public static javax.swing.JLabel View_Genset_phasing;
    public static javax.swing.JLabel View_Genset_pic;
    public static javax.swing.JLabel View_Genset_price;
    public static javax.swing.JLabel View_Genset_type;
    private javax.swing.JLabel a;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
