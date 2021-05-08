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
public class View_Stock_Filter extends javax.swing.JFrame {
    String filename = null;
    public static byte[] images = null;
    
    public View_Stock_Filter() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        View_Filter_Display = new javax.swing.JLabel();
        KG2_ADD_STOCK_GENSET = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        View_stock_Filter_pic = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        View_stock_supplier_id = new javax.swing.JLabel();
        View_stock_supplier_name = new javax.swing.JLabel();
        View_stock_supplier_address = new javax.swing.JLabel();
        View_stock_supplier_email = new javax.swing.JLabel();
        View_stock_supplier_contact = new javax.swing.JLabel();
        View_stock_Filter_quantity = new javax.swing.JLabel();
        View_stock_Filter_seller_price = new javax.swing.JLabel();
        View_stock_Filter_supplier_price = new javax.swing.JLabel();
        View_stock_Filter_type = new javax.swing.JLabel();
        View_stock_Filter_description = new javax.swing.JLabel();
        View_stock_Filter_brand_name = new javax.swing.JLabel();
        View_stock_Filter_id = new javax.swing.JLabel();
        View_stock_Filter_date = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        Stock_Genset_Back = new javax.swing.JLabel();
        Stock_Genset_Panel_Delete = new javax.swing.JPanel();
        Stock_Genset_Delete = new javax.swing.JLabel();
        Stock_Genset_Panel_Update = new javax.swing.JPanel();
        Stock_Genset_Update = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 71, 94));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        View_Filter_Display.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        View_Filter_Display.setForeground(new java.awt.Color(255, 255, 255));
        View_Filter_Display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_Filter_Display.setText("VIEW FILTER PRODUCT");
        View_Filter_Display.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                View_Filter_DisplayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel4.add(View_Filter_Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 470, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 100));

        KG2_ADD_STOCK_GENSET.setkEndColor(new java.awt.Color(0, 230, 184));
        KG2_ADD_STOCK_GENSET.setkGradientFocus(700);
        KG2_ADD_STOCK_GENSET.setkStartColor(new java.awt.Color(0, 230, 184));
        KG2_ADD_STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(20, 31, 31));
        jLabel2.setText("BRAND NAME");
        jLabel2.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 100, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(20, 31, 31));
        jLabel7.setText("DESCRIPTION");
        jLabel7.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 120, 30));

        a.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        a.setForeground(new java.awt.Color(20, 31, 31));
        a.setText("ID");
        a.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 80, 30));

        View_stock_Filter_pic.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_stock_Filter_pic.setForeground(new java.awt.Color(20, 31, 31));
        View_stock_Filter_pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_stock_Filter_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Image.png"))); // NOI18N
        View_stock_Filter_pic.setAlignmentY(1.0F);
        View_stock_Filter_pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)));
        View_stock_Filter_pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                View_stock_Filter_picMouseClicked(evt);
            }
        });
        KG2_ADD_STOCK_GENSET.add(View_stock_Filter_pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 270, 150));

        jLabel29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(20, 31, 31));
        jLabel29.setText("QUANTITY");
        jLabel29.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 120, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(20, 31, 31));
        jLabel5.setText("TYPE");
        jLabel5.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 110, 30));

        id1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id1.setText("NAME");
        id1.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 100, 30));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setText("ADDRESS");
        jLabel21.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 100, 30));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setText("EMAIL ");
        jLabel19.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 100, 30));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setText("CONTACT NO.");
        jLabel18.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, 100, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(20, 31, 31));
        jLabel16.setText("DATE");
        jLabel16.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 110, 30));

        jLabel30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(20, 31, 31));
        jLabel30.setText("SUPPLIER PRICE");
        jLabel30.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 120, 30));

        id2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id2.setText("ID");
        id2.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 100, 30));

        jLabel31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(20, 31, 31));
        jLabel31.setText("SELLER  PRICE");
        jLabel31.setAlignmentY(1.0F);
        KG2_ADD_STOCK_GENSET.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 120, 30));

        View_stock_supplier_id.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_stock_supplier_id.setForeground(new java.awt.Color(20, 31, 31));
        View_stock_supplier_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_stock_supplier_id.setAlignmentY(1.0F);
        View_stock_supplier_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_stock_supplier_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 180, 26));

        View_stock_supplier_name.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_stock_supplier_name.setForeground(new java.awt.Color(20, 31, 31));
        View_stock_supplier_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_stock_supplier_name.setAlignmentY(1.0F);
        View_stock_supplier_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_stock_supplier_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 160, 180, 26));

        View_stock_supplier_address.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_stock_supplier_address.setForeground(new java.awt.Color(20, 31, 31));
        View_stock_supplier_address.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_stock_supplier_address.setAlignmentY(1.0F);
        View_stock_supplier_address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_stock_supplier_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 200, 180, 120));

        View_stock_supplier_email.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_stock_supplier_email.setForeground(new java.awt.Color(20, 31, 31));
        View_stock_supplier_email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_stock_supplier_email.setAlignmentY(1.0F);
        View_stock_supplier_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_stock_supplier_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, 180, 26));

        View_stock_supplier_contact.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_stock_supplier_contact.setForeground(new java.awt.Color(20, 31, 31));
        View_stock_supplier_contact.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_stock_supplier_contact.setAlignmentY(1.0F);
        View_stock_supplier_contact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_stock_supplier_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 360, 180, 26));

        View_stock_Filter_quantity.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_stock_Filter_quantity.setForeground(new java.awt.Color(20, 31, 31));
        View_stock_Filter_quantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_stock_Filter_quantity.setAlignmentY(1.0F);
        View_stock_Filter_quantity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_stock_Filter_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 180, 26));

        View_stock_Filter_seller_price.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_stock_Filter_seller_price.setForeground(new java.awt.Color(20, 31, 31));
        View_stock_Filter_seller_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_stock_Filter_seller_price.setAlignmentY(1.0F);
        View_stock_Filter_seller_price.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_stock_Filter_seller_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 180, 26));

        View_stock_Filter_supplier_price.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_stock_Filter_supplier_price.setForeground(new java.awt.Color(20, 31, 31));
        View_stock_Filter_supplier_price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_stock_Filter_supplier_price.setAlignmentY(1.0F);
        View_stock_Filter_supplier_price.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_stock_Filter_supplier_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 180, 26));

        View_stock_Filter_type.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_stock_Filter_type.setForeground(new java.awt.Color(20, 31, 31));
        View_stock_Filter_type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_stock_Filter_type.setAlignmentY(1.0F);
        View_stock_Filter_type.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_stock_Filter_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 180, 26));

        View_stock_Filter_description.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_stock_Filter_description.setForeground(new java.awt.Color(20, 31, 31));
        View_stock_Filter_description.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_stock_Filter_description.setAlignmentY(1.0F);
        View_stock_Filter_description.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_stock_Filter_description, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 180, 26));

        View_stock_Filter_brand_name.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_stock_Filter_brand_name.setForeground(new java.awt.Color(20, 31, 31));
        View_stock_Filter_brand_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_stock_Filter_brand_name.setAlignmentY(1.0F);
        View_stock_Filter_brand_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_stock_Filter_brand_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 180, 26));

        View_stock_Filter_id.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_stock_Filter_id.setForeground(new java.awt.Color(20, 31, 31));
        View_stock_Filter_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_stock_Filter_id.setAlignmentY(1.0F);
        View_stock_Filter_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_stock_Filter_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 180, 26));

        View_stock_Filter_date.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        View_stock_Filter_date.setForeground(new java.awt.Color(20, 31, 31));
        View_stock_Filter_date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        View_stock_Filter_date.setAlignmentY(1.0F);
        View_stock_Filter_date.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        KG2_ADD_STOCK_GENSET.add(View_stock_Filter_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 180, 26));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 0));
        jLabel12.setToolTipText("");
        jLabel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)), "GENSET INFORMATION", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 20), new java.awt.Color(20, 31, 31))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 670, 450));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setToolTipText("");
        jLabel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 31, 31)), "GENSET INFORMATION", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 20), new java.awt.Color(20, 31, 31))); // NOI18N
        KG2_ADD_STOCK_GENSET.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 330, 450));

        Stock_Genset_Panel_Back.setBackground(new java.awt.Color(255, 194, 102));

        Stock_Genset_Back.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Back.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Back.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Stock_Genset_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Images_Back_Btn.png"))); // NOI18N
        Stock_Genset_Back.setText("  BACK               ");
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

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 530, 190, 50));

        Stock_Genset_Panel_Delete.setBackground(new java.awt.Color(255, 77, 77));

        Stock_Genset_Delete.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Delete.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Delete.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Stock_Genset_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Delete_Btn.png"))); // NOI18N
        Stock_Genset_Delete.setText(" DELETE ITEM      ");
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

        javax.swing.GroupLayout Stock_Genset_Panel_DeleteLayout = new javax.swing.GroupLayout(Stock_Genset_Panel_Delete);
        Stock_Genset_Panel_Delete.setLayout(Stock_Genset_Panel_DeleteLayout);
        Stock_Genset_Panel_DeleteLayout.setHorizontalGroup(
            Stock_Genset_Panel_DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_DeleteLayout.setVerticalGroup(
            Stock_Genset_Panel_DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, 190, 50));

        Stock_Genset_Panel_Update.setBackground(new java.awt.Color(51, 187, 255));

        Stock_Genset_Update.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Update.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Update.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Stock_Genset_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Edit_Btn.png"))); // NOI18N
        Stock_Genset_Update.setText(" UPDATE ITEM    ");
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

        KG2_ADD_STOCK_GENSET.add(Stock_Genset_Panel_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 190, 50));

        getContentPane().add(KG2_ADD_STOCK_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1070, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void View_stock_Filter_picMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_stock_Filter_picMouseClicked
        View_stock_Filter_pic.setText(null);
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        

        ImageIcon imageicon = new ImageIcon (new ImageIcon(filename).getImage().getScaledInstance(View_stock_Filter_pic.getWidth(), View_stock_Filter_pic.getHeight(),Image.SCALE_SMOOTH) );
        View_stock_Filter_pic.setIcon(imageicon);

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
    }//GEN-LAST:event_View_stock_Filter_picMouseClicked

    private void View_Filter_DisplayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_View_Filter_DisplayAncestorAdded
                String Banner = View_Filter_Display.getText();
        
        if(Banner.equals("VIEW FILTER PRODUCT")){
            
        try{   
            String id = Mainpage.filter_id.getText();
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `filter_table` WHERE `ID`='"+id+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            
            View_stock_Filter_date.setText(rs.getString("DATE"));
            View_stock_Filter_id.setText(rs.getString("ID"));
            View_stock_Filter_brand_name.setText(rs.getString("BRAND"));
            View_stock_Filter_description.setText(rs.getString("DESCRIPTION"));
            View_stock_Filter_type.setText(rs.getString("TYPE"));
            View_stock_Filter_supplier_price.setText(rs.getString("SUPPLIER PRICE"));
            View_stock_Filter_seller_price.setText(rs.getString("SELLER PRICE"));
            View_stock_Filter_quantity.setText(rs.getString("QUANTITY"));
            
            View_stock_supplier_name.setText(rs.getString("SUPPLIER"));
            
            images = rs.getBytes("IMAGE");
            ImageIcon imageicon = new ImageIcon (new ImageIcon(images).getImage().getScaledInstance(View_stock_Filter_pic.getWidth(), View_stock_Filter_pic.getHeight(),Image.SCALE_SMOOTH) );
            View_stock_Filter_pic.setIcon(imageicon);
          
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            String name = View_stock_supplier_name.getText();
            PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT * FROM `supplier_table` WHERE `NAME`='"+name+"'");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            
            View_stock_supplier_id.setText(rs.getString("ID"));
            View_stock_supplier_address.setText(rs.getString("ADDRESS"));
            View_stock_supplier_email.setText(rs.getString("EMAIL"));
            View_stock_supplier_contact.setText(rs.getString("CONTACT"));
            
            
           
            }
        }catch(Exception e){
            e.printStackTrace();
        } }
    }//GEN-LAST:event_View_Filter_DisplayAncestorAdded

    private void Stock_Genset_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseClicked
        Mainpage.Genset_id.setText("");
        dispose();
    }//GEN-LAST:event_Stock_Genset_BackMouseClicked

    private void Stock_Genset_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseEntered
        Stock_Genset_Back.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_Stock_Genset_BackMouseEntered

    private void Stock_Genset_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseExited
        Stock_Genset_Back.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Stock_Genset_BackMouseExited

    private void Stock_Genset_DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_DeleteMouseClicked
        String id = View_stock_Filter_id.getText();
        String ids = View_stock_supplier_id.getText();
        
        int opt = JOptionPane.showConfirmDialog(null, "YOU WANT TO DELETE THIS PRODUCT ? ","",JOptionPane.YES_NO_OPTION);
        if(opt==0){
            if(JOptionPane.YES_NO_OPTION == JOptionPane.YES_OPTION && !Class_Filter.DeleteFilter(id) && !Class_Supplier.DeleteSupplier(ids) ){
                JOptionPane.showMessageDialog(null, " PRODUCT SUCCESSFULY DELETED ","",JOptionPane.INFORMATION_MESSAGE);
                Class_tables ct = new Class_tables();
                ct.Filter(); ct.Supplier(); dispose(); Mainpage.Genset_id.setText("");
            }
        }
    }//GEN-LAST:event_Stock_Genset_DeleteMouseClicked

    private void Stock_Genset_DeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_DeleteMouseEntered
        Stock_Genset_Delete.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_Stock_Genset_DeleteMouseEntered

    private void Stock_Genset_DeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_DeleteMouseExited
        Stock_Genset_Delete.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Stock_Genset_DeleteMouseExited

    private void Stock_Genset_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseClicked
        Insert_Inventory_Filter iig = new Insert_Inventory_Filter();
        iig.setVisible(true);

        Insert_Inventory_Filter.Inventory_Display.setText("UPDATE FILTER PRODUCT");
        Insert_Inventory_Filter.Insert_Invetory_Filter_date.setText(View_stock_Filter_date.getText());
        Insert_Inventory_Filter.Insert_Invetory_Filter_id.setText(View_stock_Filter_id.getText());
        Insert_Inventory_Filter.Insert_Invetory_Filter_brand_name.setText(View_stock_Filter_brand_name.getText());
        Insert_Inventory_Filter.Insert_Invetory_Filter_description.setText(View_stock_Filter_description.getText());
        Insert_Inventory_Filter.Insert_Invetory_Filter_type.setSelectedItem(View_stock_Filter_type.getText());
        Insert_Inventory_Filter.Insert_Invetory_Filter_seller_price.setText(View_stock_Filter_seller_price.getText());
        Insert_Inventory_Filter.Insert_Invetory_Filter_supplier_price.setText(View_stock_Filter_supplier_price.getText());
        Insert_Inventory_Filter.Insert_Invetory_Filter_quantity.setText(View_stock_Filter_quantity.getText());

        Insert_Inventory_Filter.Insert_Filter_Supplier_id.setText(View_stock_supplier_id.getText());
        Insert_Inventory_Filter.Insert_Filter_Supplier_id.setEditable(false);
        Insert_Inventory_Filter.Insert_Filter_Supplier_name.setText(View_stock_supplier_name.getText());
        Insert_Inventory_Filter.Insert_Filter_Supplier_address.setText(View_stock_supplier_address.getText());
        Insert_Inventory_Filter.Insert_Filter_Supplier_email.setText(View_stock_supplier_email.getText());
        Insert_Inventory_Filter.Insert_Filter_Supplier_contact.setText(View_stock_supplier_contact.getText());

        ImageIcon imageicon = new ImageIcon (new ImageIcon(images).getImage().getScaledInstance(Insert_Inventory_Filter.Insert_Invetory_Filter_pic.getWidth(), Insert_Inventory_Filter.Insert_Invetory_Filter_pic.getHeight(),Image.SCALE_SMOOTH) );
        Insert_Inventory_Filter.Insert_Invetory_Filter_pic.setIcon(imageicon);
        Insert_Inventory_Filter.images = images;
        dispose();

    }//GEN-LAST:event_Stock_Genset_UpdateMouseClicked

    private void Stock_Genset_UpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseEntered
        Stock_Genset_Update.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_Stock_Genset_UpdateMouseEntered

    private void Stock_Genset_UpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_UpdateMouseExited
        Stock_Genset_Update.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Stock_Genset_UpdateMouseExited

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
            java.util.logging.Logger.getLogger(View_Stock_Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Stock_Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Stock_Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Stock_Filter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Stock_Filter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static keeptoo.KGradientPanel KG2_ADD_STOCK_GENSET;
    private javax.swing.JLabel Stock_Genset_Back;
    private javax.swing.JLabel Stock_Genset_Delete;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Delete;
    public static javax.swing.JPanel Stock_Genset_Panel_Update;
    private javax.swing.JLabel Stock_Genset_Update;
    public static javax.swing.JLabel View_Filter_Display;
    public static javax.swing.JLabel View_stock_Filter_brand_name;
    public static javax.swing.JLabel View_stock_Filter_date;
    public static javax.swing.JLabel View_stock_Filter_description;
    public static javax.swing.JLabel View_stock_Filter_id;
    public static javax.swing.JLabel View_stock_Filter_pic;
    public static javax.swing.JLabel View_stock_Filter_quantity;
    public static javax.swing.JLabel View_stock_Filter_seller_price;
    public static javax.swing.JLabel View_stock_Filter_supplier_price;
    public static javax.swing.JLabel View_stock_Filter_type;
    public static javax.swing.JLabel View_stock_supplier_address;
    public static javax.swing.JLabel View_stock_supplier_contact;
    public static javax.swing.JLabel View_stock_supplier_email;
    public static javax.swing.JLabel View_stock_supplier_id;
    public static javax.swing.JLabel View_stock_supplier_name;
    private javax.swing.JLabel a;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
