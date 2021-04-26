/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE2;

import static FPE2.Insert_Genset.as_alternator_sn;
import static FPE2.Insert_Genset.as_body_parts;
import static FPE2.Insert_Genset.as_brand;
import static FPE2.Insert_Genset.as_dimension;
import static FPE2.Insert_Genset.as_engine_sn;
import static FPE2.Insert_Genset.as_fuel_tank;
import static FPE2.Insert_Genset.as_id;
import static FPE2.Insert_Genset.as_kva;
import static FPE2.Insert_Genset.as_model;
import static FPE2.Insert_Genset.as_phasing;
import static FPE2.Insert_Genset.as_pic;
import static FPE2.Insert_Genset.as_price;
import static FPE2.Insert_Genset.as_unitType;
import static FPE2.Table_Supplier.Supplier_table;
import java.awt.Color;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import static FPE2.Insert_Genset.as_supplierNone;


public class Mainpage extends javax.swing.JFrame {

  
    String choose = "";
    public Mainpage() {
        initComponents();
        Class_table ct = new Class_table(); 
        ct.Show_Stock_Genset_Table();
        ct.Show_Stock_Filter_Table();
        ct.shopGenset();
        ct.shopFilter();
        stock_supplier_id.setVisible(false);
    }
       

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stock_supplier_id = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        HEADER = new javax.swing.JPanel();
        HOME_MENU = new javax.swing.JLabel();
        HOME_VIEW_PRODUCT = new javax.swing.JLabel();
        DRAWER = new javax.swing.JPanel();
        HOME_PANEL = new javax.swing.JPanel();
        HOME_LABEL = new javax.swing.JLabel();
        LOGOUT_PANEL = new javax.swing.JPanel();
        LOGOUT_LABEL1 = new javax.swing.JLabel();
        STOCK_PANEL = new javax.swing.JPanel();
        STOCK_LABEL = new javax.swing.JLabel();
        SHOP_PANEL = new javax.swing.JPanel();
        SHOP_LABEL = new javax.swing.JLabel();
        REPORT_PANEL = new javax.swing.JPanel();
        REPORT_LABEL = new javax.swing.JLabel();
        JTab = new javax.swing.JTabbedPane();
        HOME = new keeptoo.KGradientPanel();
        fpe_home = new javax.swing.JLabel();
        STOCK = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        STOCK_GENSET = new keeptoo.KGradientPanel();
        add_genset = new javax.swing.JPanel();
        Add = new javax.swing.JLabel();
        update_genset = new javax.swing.JPanel();
        Update = new javax.swing.JLabel();
        delete_genset = new javax.swing.JPanel();
        Delete = new javax.swing.JLabel();
        suppliergenset = new javax.swing.JPanel();
        Supplier = new javax.swing.JLabel();
        back_genset = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Stock_Genset_Table = new javax.swing.JTable();
        Genset_id = new javax.swing.JLabel();
        STOCK_FILTER = new keeptoo.KGradientPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Stock_Filter_Table = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        SHOP = new keeptoo.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SHOP_GENSET = new keeptoo.KGradientPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        Shop_Genset_Table = new javax.swing.JTable();
        jPanel25 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Shop_genset_id = new javax.swing.JLabel();
        SHOP_FILTER = new keeptoo.KGradientPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        Shop_Filter_Table = new javax.swing.JTable();
        jPanel30 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        stock_supplier_id.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FPE2/logos1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 190));

        HEADER.setBackground(new java.awt.Color(3, 33, 73));
        HEADER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HOME_MENU.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        HOME_MENU.setForeground(new java.awt.Color(255, 255, 255));
        HEADER.add(HOME_MENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 130, 70));

        HOME_VIEW_PRODUCT.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        HOME_VIEW_PRODUCT.setForeground(new java.awt.Color(255, 255, 255));
        HEADER.add(HOME_VIEW_PRODUCT, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 330, 70));

        getContentPane().add(HEADER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 110));

        DRAWER.setBackground(new java.awt.Color(3, 33, 73));
        DRAWER.setPreferredSize(new java.awt.Dimension(230, 775));
        DRAWER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HOME_LABEL.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        HOME_LABEL.setForeground(new java.awt.Color(3, 33, 73));
        HOME_LABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HOME_LABEL.setText("HOME");
        HOME_LABEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HOME_LABELMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HOME_LABELMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HOME_LABELMouseExited(evt);
            }
        });

        javax.swing.GroupLayout HOME_PANELLayout = new javax.swing.GroupLayout(HOME_PANEL);
        HOME_PANEL.setLayout(HOME_PANELLayout);
        HOME_PANELLayout.setHorizontalGroup(
            HOME_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HOME_LABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        HOME_PANELLayout.setVerticalGroup(
            HOME_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HOME_LABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        DRAWER.add(HOME_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 190, 70));

        LOGOUT_LABEL1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LOGOUT_LABEL1.setForeground(new java.awt.Color(3, 33, 73));
        LOGOUT_LABEL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGOUT_LABEL1.setText("LOGOUT");
        LOGOUT_LABEL1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LOGOUT_LABEL1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LOGOUT_LABEL1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout LOGOUT_PANELLayout = new javax.swing.GroupLayout(LOGOUT_PANEL);
        LOGOUT_PANEL.setLayout(LOGOUT_PANELLayout);
        LOGOUT_PANELLayout.setHorizontalGroup(
            LOGOUT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LOGOUT_LABEL1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        LOGOUT_PANELLayout.setVerticalGroup(
            LOGOUT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LOGOUT_LABEL1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        DRAWER.add(LOGOUT_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 190, 70));

        STOCK_LABEL.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        STOCK_LABEL.setForeground(new java.awt.Color(3, 33, 73));
        STOCK_LABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        STOCK_LABEL.setText("STOCK");
        STOCK_LABEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                STOCK_LABELMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                STOCK_LABELMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                STOCK_LABELMouseExited(evt);
            }
        });

        javax.swing.GroupLayout STOCK_PANELLayout = new javax.swing.GroupLayout(STOCK_PANEL);
        STOCK_PANEL.setLayout(STOCK_PANELLayout);
        STOCK_PANELLayout.setHorizontalGroup(
            STOCK_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(STOCK_LABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        STOCK_PANELLayout.setVerticalGroup(
            STOCK_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(STOCK_LABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        DRAWER.add(STOCK_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 190, 70));

        SHOP_LABEL.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        SHOP_LABEL.setForeground(new java.awt.Color(3, 33, 73));
        SHOP_LABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SHOP_LABEL.setText("SHOP");
        SHOP_LABEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SHOP_LABELMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SHOP_LABELMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SHOP_LABELMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SHOP_PANELLayout = new javax.swing.GroupLayout(SHOP_PANEL);
        SHOP_PANEL.setLayout(SHOP_PANELLayout);
        SHOP_PANELLayout.setHorizontalGroup(
            SHOP_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SHOP_LABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        SHOP_PANELLayout.setVerticalGroup(
            SHOP_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SHOP_LABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        DRAWER.add(SHOP_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 190, 70));

        REPORT_LABEL.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        REPORT_LABEL.setForeground(new java.awt.Color(3, 33, 73));
        REPORT_LABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        REPORT_LABEL.setText("REPORT");
        REPORT_LABEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REPORT_LABELMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                REPORT_LABELMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                REPORT_LABELMouseExited(evt);
            }
        });

        javax.swing.GroupLayout REPORT_PANELLayout = new javax.swing.GroupLayout(REPORT_PANEL);
        REPORT_PANEL.setLayout(REPORT_PANELLayout);
        REPORT_PANELLayout.setHorizontalGroup(
            REPORT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(REPORT_LABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        REPORT_PANELLayout.setVerticalGroup(
            REPORT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(REPORT_LABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        DRAWER.add(REPORT_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 190, 70));

        getContentPane().add(DRAWER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 725));

        HOME.setkEndColor(new java.awt.Color(153, 204, 255));
        HOME.setkGradientFocus(700);
        HOME.setkStartColor(new java.awt.Color(0, 255, 153));
        HOME.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fpe_home.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        fpe_home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fpe_home.setText("FIELD POWER ENTERPRISES");
        HOME.add(fpe_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 890, 120));

        JTab.addTab("HOME", HOME);

        STOCK.setkEndColor(new java.awt.Color(153, 204, 255));
        STOCK.setkGradientFocus(700);
        STOCK.setkStartColor(new java.awt.Color(0, 255, 153));
        STOCK.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FILTER  PARTS");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        STOCK.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 370, 320));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("GENSET ");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        STOCK.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 370, 320));

        JTab.addTab("STOCK", STOCK);

        STOCK_GENSET.setkEndColor(new java.awt.Color(153, 204, 255));
        STOCK_GENSET.setkGradientFocus(700);
        STOCK_GENSET.setkStartColor(new java.awt.Color(0, 255, 153));
        STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Add.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add.setText("ADD");
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout add_gensetLayout = new javax.swing.GroupLayout(add_genset);
        add_genset.setLayout(add_gensetLayout);
        add_gensetLayout.setHorizontalGroup(
            add_gensetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        add_gensetLayout.setVerticalGroup(
            add_gensetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        STOCK_GENSET.add(add_genset, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 190, 50));

        Update.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Update.setText("UPDATE");
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout update_gensetLayout = new javax.swing.GroupLayout(update_genset);
        update_genset.setLayout(update_gensetLayout);
        update_gensetLayout.setHorizontalGroup(
            update_gensetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        update_gensetLayout.setVerticalGroup(
            update_gensetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        STOCK_GENSET.add(update_genset, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 190, 50));

        Delete.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Delete.setText("DELETE");
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout delete_gensetLayout = new javax.swing.GroupLayout(delete_genset);
        delete_genset.setLayout(delete_gensetLayout);
        delete_gensetLayout.setHorizontalGroup(
            delete_gensetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        delete_gensetLayout.setVerticalGroup(
            delete_gensetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        STOCK_GENSET.add(delete_genset, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 190, 50));

        Supplier.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Supplier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Supplier.setText("SUPPLIER");
        Supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupplierMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout suppliergensetLayout = new javax.swing.GroupLayout(suppliergenset);
        suppliergenset.setLayout(suppliergensetLayout);
        suppliergensetLayout.setHorizontalGroup(
            suppliergensetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Supplier, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        suppliergensetLayout.setVerticalGroup(
            suppliergensetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Supplier, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        STOCK_GENSET.add(suppliergenset, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 530, 190, 50));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("BACK");

        javax.swing.GroupLayout back_gensetLayout = new javax.swing.GroupLayout(back_genset);
        back_genset.setLayout(back_gensetLayout);
        back_gensetLayout.setHorizontalGroup(
            back_gensetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        back_gensetLayout.setVerticalGroup(
            back_gensetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        STOCK_GENSET.add(back_genset, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 530, 190, 50));

        Stock_Genset_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Stock_Genset_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Genset_TableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(Stock_Genset_Table);

        STOCK_GENSET.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 1050, 420));
        STOCK_GENSET.add(Genset_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 150, 30));

        JTab.addTab("STOCK_GENSET", STOCK_GENSET);

        STOCK_FILTER.setkEndColor(new java.awt.Color(153, 204, 255));
        STOCK_FILTER.setkGradientFocus(700);
        STOCK_FILTER.setkStartColor(new java.awt.Color(0, 255, 153));
        STOCK_FILTER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Stock_Filter_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(Stock_Filter_Table);

        STOCK_FILTER.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 1050, 420));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        STOCK_FILTER.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 530, 190, 50));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        STOCK_FILTER.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 530, 190, 50));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        STOCK_FILTER.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 190, 50));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        STOCK_FILTER.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 190, 50));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        STOCK_FILTER.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 190, 50));

        jLabel6.setText("jLabel6");
        STOCK_FILTER.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        JTab.addTab("STOCK_FILTER", STOCK_FILTER);

        SHOP.setkEndColor(new java.awt.Color(153, 204, 255));
        SHOP.setkGradientFocus(700);
        SHOP.setkStartColor(new java.awt.Color(0, 255, 153));
        SHOP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("GENSET ");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        SHOP.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 370, 320));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("FILTER  PARTS");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        SHOP.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 370, 320));

        JTab.addTab("SHOP", SHOP);

        SHOP_GENSET.setkEndColor(new java.awt.Color(153, 204, 255));
        SHOP_GENSET.setkGradientFocus(700);
        SHOP_GENSET.setkStartColor(new java.awt.Color(0, 255, 153));
        SHOP_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Shop_Genset_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Shop_Genset_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Genset_TableMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(Shop_Genset_Table);

        SHOP_GENSET.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 1050, 420));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("BACK");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        SHOP_GENSET.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 190, 50));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("VIEW");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        SHOP_GENSET.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 190, 50));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("SELECT");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        SHOP_GENSET.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 190, 50));

        Shop_genset_id.setText("jLabel14");
        SHOP_GENSET.add(Shop_genset_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 80, 20));

        JTab.addTab("SHOP_GENSET", SHOP_GENSET);

        SHOP_FILTER.setkEndColor(new java.awt.Color(153, 204, 255));
        SHOP_FILTER.setkGradientFocus(700);
        SHOP_FILTER.setkStartColor(new java.awt.Color(0, 255, 153));
        SHOP_FILTER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Shop_Filter_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(Shop_Filter_Table);

        SHOP_FILTER.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 1050, 420));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("BACK");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        SHOP_FILTER.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 190, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("VIEW");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        SHOP_FILTER.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 190, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SELECT");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        SHOP_FILTER.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 190, 50));

        JTab.addTab("SHOP_FILTER", SHOP_FILTER);

        getContentPane().add(JTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 1130, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HOME_LABELMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME_LABELMouseEntered
       HOME_LABEL.setForeground(new Color(255,255,255));
       HOME_PANEL.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_HOME_LABELMouseEntered

    private void HOME_LABELMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME_LABELMouseExited
        // TODO add your handling code here:
        HOME_LABEL.setForeground(new Color(0,0,0));
       HOME_PANEL.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_HOME_LABELMouseExited

    private void LOGOUT_LABEL1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUT_LABEL1MouseEntered
       LOGOUT_LABEL1.setForeground(new Color(255,255,255));
       LOGOUT_PANEL.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_LOGOUT_LABEL1MouseEntered

    private void LOGOUT_LABEL1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUT_LABEL1MouseExited
        LOGOUT_LABEL1.setForeground(new Color(0,0,0));
       LOGOUT_PANEL.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_LOGOUT_LABEL1MouseExited

    private void STOCK_LABELMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STOCK_LABELMouseEntered
       STOCK_LABEL.setForeground(new Color(255,255,255));
       STOCK_PANEL.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_STOCK_LABELMouseEntered

    private void STOCK_LABELMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STOCK_LABELMouseExited
        STOCK_LABEL.setForeground(new Color(0,0,0));
       STOCK_PANEL.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_STOCK_LABELMouseExited

    private void SHOP_LABELMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHOP_LABELMouseEntered
        SHOP_LABEL.setForeground(new Color(255,255,255));
       SHOP_PANEL.setBackground(new Color(0,255,153));
        
    }//GEN-LAST:event_SHOP_LABELMouseEntered

    private void SHOP_LABELMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHOP_LABELMouseExited
     SHOP_LABEL.setForeground(new Color(0,0,0));
       SHOP_PANEL.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_SHOP_LABELMouseExited

    private void REPORT_LABELMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPORT_LABELMouseEntered
       REPORT_LABEL.setForeground(new Color(255,255,255));
       REPORT_PANEL.setBackground(new Color(0,255,153));
    }//GEN-LAST:event_REPORT_LABELMouseEntered

    private void REPORT_LABELMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPORT_LABELMouseExited
        REPORT_LABEL.setForeground(new Color(0,0,0));
       REPORT_PANEL.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_REPORT_LABELMouseExited

    private void HOME_LABELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME_LABELMouseClicked
       // HEADER MENU
       HOME_MENU.setText("  HOME");
       HOME_VIEW_PRODUCT.setText(null);
       JTab.setSelectedIndex(0);
    }//GEN-LAST:event_HOME_LABELMouseClicked

    private void STOCK_LABELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STOCK_LABELMouseClicked
        // HEADER MENU
       HOME_MENU.setText("  STOCK");
        HOME_VIEW_PRODUCT.setText(null);
       // STOCK JTAB
       JTab.setSelectedIndex(1);
    }//GEN-LAST:event_STOCK_LABELMouseClicked

    private void SHOP_LABELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHOP_LABELMouseClicked
     // HEADER MENU
       HOME_MENU.setText("  SHOP");
       HOME_VIEW_PRODUCT.setText(null);
       JTab.setSelectedIndex(4);
    }//GEN-LAST:event_SHOP_LABELMouseClicked

    private void REPORT_LABELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPORT_LABELMouseClicked
      // HEADER MENU
        HOME_MENU.setText("  REPORT");
        HOME_VIEW_PRODUCT.setText(null);
    }//GEN-LAST:event_REPORT_LABELMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        JTab.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        JTab.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        JTab.setSelectedIndex(5);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        JTab.setSelectedIndex(6);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void Stock_Genset_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_TableMouseClicked
        int i=Stock_Genset_Table.getSelectedRow();
        TableModel model = Stock_Genset_Table.getModel();
        Genset_id.setText(model.getValueAt(i,0).toString());            
      
    }//GEN-LAST:event_Stock_Genset_TableMouseClicked

    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
        Insert_Genset ig = new Insert_Genset();
        ig.setVisible(true);
        Insert_Genset.display.setText("UPDATE GENSET PRODUCT");
        Insert_Genset.gensetBtn.setText("UPDATE");
        
        Insert_Genset.as_supplierNone.setVisible(true);
        Insert_Genset.supplierTxt.setVisible(true);
        Insert_Genset.id.setVisible(true);
        Insert_Genset.as_id.setVisible(true);

    }//GEN-LAST:event_UpdateMouseClicked

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        Insert_Genset ig = new Insert_Genset();
        ig.setVisible(true);
        Insert_Genset.display.setText("ADD GENSET PRODUCT");
    }//GEN-LAST:event_AddMouseClicked

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        String id = Genset_id.getText();

            int opt = JOptionPane.showConfirmDialog(null, "YOU WANT TO DELETE THIS PRODUCT ? ","",JOptionPane.YES_NO_OPTION);
            if(opt==0){
                if(JOptionPane.YES_NO_OPTION == JOptionPane.YES_OPTION && !Class_Stock.DeleteGenset(id) ){
                JOptionPane.showMessageDialog(null, " PRODUCT DELETED ","",JOptionPane.INFORMATION_MESSAGE);
                }
            }
    }//GEN-LAST:event_DeleteMouseClicked

    private void SupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierMouseClicked
        Table_Supplier tbs = new Table_Supplier();
        tbs.setVisible(true);
       
    }//GEN-LAST:event_SupplierMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        ViewGensetItem vgi = new ViewGensetItem();
        vgi.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void Shop_Genset_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_TableMouseClicked
        int i=Shop_Genset_Table.getSelectedRow();
        TableModel model = Shop_Genset_Table.getModel();
        Shop_genset_id.setText(model.getValueAt(i,0).toString()); 
           
        
    }//GEN-LAST:event_Shop_Genset_TableMouseClicked

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
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add;
    private javax.swing.JPanel DRAWER;
    private javax.swing.JLabel Delete;
    public static javax.swing.JLabel Genset_id;
    private javax.swing.JPanel HEADER;
    private keeptoo.KGradientPanel HOME;
    private javax.swing.JLabel HOME_LABEL;
    public static javax.swing.JLabel HOME_MENU;
    private javax.swing.JPanel HOME_PANEL;
    public static javax.swing.JLabel HOME_VIEW_PRODUCT;
    private javax.swing.JTabbedPane JTab;
    private javax.swing.JLabel LOGOUT_LABEL1;
    private javax.swing.JPanel LOGOUT_PANEL;
    private javax.swing.JLabel REPORT_LABEL;
    private javax.swing.JPanel REPORT_PANEL;
    private keeptoo.KGradientPanel SHOP;
    private keeptoo.KGradientPanel SHOP_FILTER;
    private keeptoo.KGradientPanel SHOP_GENSET;
    private javax.swing.JLabel SHOP_LABEL;
    private javax.swing.JPanel SHOP_PANEL;
    private keeptoo.KGradientPanel STOCK;
    private keeptoo.KGradientPanel STOCK_FILTER;
    private keeptoo.KGradientPanel STOCK_GENSET;
    private javax.swing.JLabel STOCK_LABEL;
    private javax.swing.JPanel STOCK_PANEL;
    public static javax.swing.JTable Shop_Filter_Table;
    public static javax.swing.JTable Shop_Genset_Table;
    public static javax.swing.JLabel Shop_genset_id;
    public static javax.swing.JTable Stock_Filter_Table;
    public static javax.swing.JTable Stock_Genset_Table;
    private javax.swing.JLabel Supplier;
    private javax.swing.JLabel Update;
    public static javax.swing.JPanel add_genset;
    public static javax.swing.JPanel back_genset;
    public static javax.swing.JPanel delete_genset;
    private javax.swing.JLabel fpe_home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    public static javax.swing.JLabel stock_supplier_id;
    public static javax.swing.JPanel suppliergenset;
    public static javax.swing.JPanel update_genset;
    // End of variables declaration//GEN-END:variables
}
