/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE2;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class Mainpage extends javax.swing.JFrame {

  
    String choose = "";
    public Mainpage() {
        initComponents();
        Class_table ct = new Class_table(); 
        ct.showGenset();
        ct.showFilter();
        ct.shopGenset();
        ct.shopFilter();
        ct.showCustomer_Table();
        ct.Stocksupplier();
        edit_gen_id.setVisible(false);
        shop_genset_id.setVisible(false);
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
        jTab = new javax.swing.JTabbedPane();
        KG0_HOME = new keeptoo.KGradientPanel();
        fpe_home = new javax.swing.JLabel();
        KG1_STOCK = new keeptoo.KGradientPanel();
        MENU_GENSET = new javax.swing.JLabel();
        MENU_SUPPLIER = new javax.swing.JLabel();
        MENU_FILTER_PART = new javax.swing.JLabel();
        KG2_GENSET = new keeptoo.KGradientPanel();
        jPanel22 = new javax.swing.JPanel();
        BackGensetBtn = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        ViewGenset_Table = new javax.swing.JTable();
        edit_gen_id = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        AddGensetBtn = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        UpdateGensetBtn = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        DeleteGensetBtn = new javax.swing.JLabel();
        edit_gen_date1 = new javax.swing.JLabel();
        KG3_FILTER_PARTS = new keeptoo.KGradientPanel();
        jPanel26 = new javax.swing.JPanel();
        BackFilterBtn = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        ViewFitler_table = new javax.swing.JTable();
        jPanel27 = new javax.swing.JPanel();
        AddFilterBtn = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        UpdateFilterBtn = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        DeleteFilterBtn = new javax.swing.JLabel();
        update_filter_id = new javax.swing.JLabel();
        KG4_STOCK_SUPPLIER = new keeptoo.KGradientPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        Stock_supplier = new javax.swing.JTable();
        jPanel37 = new javax.swing.JPanel();
        stock_supplier_edit = new javax.swing.JLabel();
        KG5_SHOP = new keeptoo.KGradientPanel();
        MENU_GENSET1 = new javax.swing.JLabel();
        MENU_FILTER_PART1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        KG6_SHOP_GENSET = new keeptoo.KGradientPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        Shop_genset_table = new javax.swing.JTable();
        jPanel30 = new javax.swing.JPanel();
        BackShopGenset = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        BackFilterBtn2 = new javax.swing.JLabel();
        shop_genset_id = new javax.swing.JLabel();
        KG7_SHOP_FILTER = new keeptoo.KGradientPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        KG7_TABLE_FILTER = new javax.swing.JTable();
        jPanel32 = new javax.swing.JPanel();
        BackShopFilter = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        BackFilterBtn4 = new javax.swing.JLabel();
        shop_filter_id = new javax.swing.JLabel();
        SHOP_CUSTOMER = new keeptoo.KGradientPanel();
        customer_id = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        Shop_Customer_Table = new javax.swing.JTable();
        jPanel38 = new javax.swing.JPanel();
        shop_customer_edit = new javax.swing.JLabel();
        kG3_TABLE_GENSET = new keeptoo.KGradientPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        back_genset = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        kG4_TABLE_FilterPart = new keeptoo.KGradientPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel38 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        back_FilterPart = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();

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

        getContentPane().add(HEADER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 102));

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

        jTab.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        KG0_HOME.setkEndColor(new java.awt.Color(153, 204, 255));
        KG0_HOME.setkGradientFocus(700);
        KG0_HOME.setkStartColor(new java.awt.Color(0, 255, 153));
        KG0_HOME.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fpe_home.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        fpe_home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fpe_home.setText("FIELD POWER ENTERPRISES");
        KG0_HOME.add(fpe_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1070, 120));

        jTab.addTab("HOME", KG0_HOME);

        KG1_STOCK.setkEndColor(new java.awt.Color(153, 204, 255));
        KG1_STOCK.setkStartColor(new java.awt.Color(0, 255, 153));
        KG1_STOCK.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MENU_GENSET.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        MENU_GENSET.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MENU_GENSET.setText("GENSET");
        MENU_GENSET.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MENU_GENSET.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MENU_GENSETMouseClicked(evt);
            }
        });
        KG1_STOCK.add(MENU_GENSET, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 340, 201));

        MENU_SUPPLIER.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        MENU_SUPPLIER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MENU_SUPPLIER.setText("SUPPLIER");
        MENU_SUPPLIER.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MENU_SUPPLIER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MENU_SUPPLIERMouseClicked(evt);
            }
        });
        KG1_STOCK.add(MENU_SUPPLIER, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, 340, 201));

        MENU_FILTER_PART.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        MENU_FILTER_PART.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MENU_FILTER_PART.setText("FILTER / PART");
        MENU_FILTER_PART.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MENU_FILTER_PART.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MENU_FILTER_PARTMouseClicked(evt);
            }
        });
        KG1_STOCK.add(MENU_FILTER_PART, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 340, 201));

        jTab.addTab("MENU_STOCK", KG1_STOCK);

        KG2_GENSET.setkEndColor(new java.awt.Color(153, 204, 255));
        KG2_GENSET.setkStartColor(new java.awt.Color(0, 255, 153));
        KG2_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackGensetBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BackGensetBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackGensetBtn.setText("BACK");
        BackGensetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackGensetBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGensetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGensetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG2_GENSET.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 520, 160, 50));

        ViewGenset_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ViewGenset_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewGenset_TableMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(ViewGenset_Table);

        KG2_GENSET.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 82, 1040, 400));

        edit_gen_id.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        edit_gen_id.setAlignmentY(1.0F);
        KG2_GENSET.add(edit_gen_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 110, 26));

        AddGensetBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        AddGensetBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddGensetBtn.setText("ADD");
        AddGensetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddGensetBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddGensetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddGensetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG2_GENSET.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 160, 50));

        UpdateGensetBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        UpdateGensetBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UpdateGensetBtn.setText("UPDATE");
        UpdateGensetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateGensetBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UpdateGensetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UpdateGensetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG2_GENSET.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 160, 50));

        DeleteGensetBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        DeleteGensetBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DeleteGensetBtn.setText("DELETE");
        DeleteGensetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteGensetBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DeleteGensetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DeleteGensetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG2_GENSET.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 160, 50));

        edit_gen_date1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        edit_gen_date1.setText("DATE");
        edit_gen_date1.setAlignmentY(1.0F);
        KG2_GENSET.add(edit_gen_date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 110, 26));

        jTab.addTab("GENSET", KG2_GENSET);

        KG3_FILTER_PARTS.setkEndColor(new java.awt.Color(153, 204, 255));
        KG3_FILTER_PARTS.setkStartColor(new java.awt.Color(0, 255, 153));
        KG3_FILTER_PARTS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackFilterBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BackFilterBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackFilterBtn.setText("BACK");
        BackFilterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackFilterBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackFilterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackFilterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG3_FILTER_PARTS.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 520, 160, 50));

        ViewFitler_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ViewFitler_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewFitler_tableMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(ViewFitler_table);

        KG3_FILTER_PARTS.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 1040, 400));

        AddFilterBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        AddFilterBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddFilterBtn.setText("ADD");
        AddFilterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddFilterBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddFilterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddFilterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG3_FILTER_PARTS.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 160, 50));

        UpdateFilterBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        UpdateFilterBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UpdateFilterBtn.setText("UPDATE");
        UpdateFilterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateFilterBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UpdateFilterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UpdateFilterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG3_FILTER_PARTS.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 160, 50));

        DeleteFilterBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        DeleteFilterBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DeleteFilterBtn.setText("DELETE");
        DeleteFilterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteFilterBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DeleteFilterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DeleteFilterBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG3_FILTER_PARTS.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 160, 50));
        KG3_FILTER_PARTS.add(update_filter_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 130, 30));

        jTab.addTab("FILTER_PARTS", KG3_FILTER_PARTS);

        KG4_STOCK_SUPPLIER.setkEndColor(new java.awt.Color(153, 204, 255));
        KG4_STOCK_SUPPLIER.setkStartColor(new java.awt.Color(0, 255, 153));
        KG4_STOCK_SUPPLIER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Stock_supplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Stock_supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_supplierMouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(Stock_supplier);

        KG4_STOCK_SUPPLIER.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 1040, 400));

        stock_supplier_edit.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        stock_supplier_edit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stock_supplier_edit.setText("EDIT");
        stock_supplier_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stock_supplier_editMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addComponent(stock_supplier_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(stock_supplier_edit, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG4_STOCK_SUPPLIER.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 160, 50));

        jTab.addTab("SUPPLIER", KG4_STOCK_SUPPLIER);

        KG5_SHOP.setkEndColor(new java.awt.Color(153, 204, 255));
        KG5_SHOP.setkStartColor(new java.awt.Color(0, 255, 153));
        KG5_SHOP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MENU_GENSET1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        MENU_GENSET1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MENU_GENSET1.setText("GENSET");
        MENU_GENSET1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MENU_GENSET1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MENU_GENSET1MouseClicked(evt);
            }
        });
        KG5_SHOP.add(MENU_GENSET1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 320, 201));

        MENU_FILTER_PART1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        MENU_FILTER_PART1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MENU_FILTER_PART1.setText("FILTER\n/ PART");
        MENU_FILTER_PART1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MENU_FILTER_PART1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MENU_FILTER_PART1MouseClicked(evt);
            }
        });
        KG5_SHOP.add(MENU_FILTER_PART1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 320, 201));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CUSTOMER");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        KG5_SHOP.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 200, 300, 200));

        jTab.addTab("MENU_SHOP", KG5_SHOP);

        KG6_SHOP_GENSET.setkEndColor(new java.awt.Color(153, 204, 255));
        KG6_SHOP_GENSET.setkStartColor(new java.awt.Color(0, 255, 153));
        KG6_SHOP_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Shop_genset_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Shop_genset_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_genset_tableMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(Shop_genset_table);

        KG6_SHOP_GENSET.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 1040, 400));

        BackShopGenset.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BackShopGenset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackShopGenset.setText("BACK");
        BackShopGenset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackShopGensetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackShopGenset, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackShopGenset, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG6_SHOP_GENSET.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 160, 50));

        BackFilterBtn2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BackFilterBtn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackFilterBtn2.setText("SELECT ITEM");
        BackFilterBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackFilterBtn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackFilterBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackFilterBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG6_SHOP_GENSET.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 160, 50));
        KG6_SHOP_GENSET.add(shop_genset_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 100, 30));

        jTab.addTab("SHOP_GENSET", KG6_SHOP_GENSET);

        KG7_SHOP_FILTER.setkEndColor(new java.awt.Color(153, 204, 255));
        KG7_SHOP_FILTER.setkStartColor(new java.awt.Color(0, 255, 153));
        KG7_SHOP_FILTER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KG7_TABLE_FILTER.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        KG7_TABLE_FILTER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KG7_TABLE_FILTERMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(KG7_TABLE_FILTER);

        KG7_SHOP_FILTER.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 1040, 400));

        BackShopFilter.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BackShopFilter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackShopFilter.setText("BACK");
        BackShopFilter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackShopFilterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackShopFilter, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackShopFilter, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG7_SHOP_FILTER.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 160, 50));

        BackFilterBtn4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BackFilterBtn4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackFilterBtn4.setText("SELECT ITEM");
        BackFilterBtn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackFilterBtn4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackFilterBtn4, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackFilterBtn4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        KG7_SHOP_FILTER.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 160, 50));

        shop_filter_id.setText("jLabel2");
        KG7_SHOP_FILTER.add(shop_filter_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 100, 30));

        jTab.addTab("SHOP_FILTER", KG7_SHOP_FILTER);

        SHOP_CUSTOMER.setkEndColor(new java.awt.Color(153, 204, 255));
        SHOP_CUSTOMER.setkStartColor(new java.awt.Color(0, 255, 153));
        SHOP_CUSTOMER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        customer_id.setText("CUSTOMER");
        SHOP_CUSTOMER.add(customer_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 106, 23));

        Shop_Customer_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Shop_Customer_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Customer_TableMouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(Shop_Customer_Table);

        SHOP_CUSTOMER.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 1040, 400));

        shop_customer_edit.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        shop_customer_edit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shop_customer_edit.setText("EDIT");
        shop_customer_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shop_customer_editMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addComponent(shop_customer_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shop_customer_edit, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        SHOP_CUSTOMER.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 160, 50));

        jTab.addTab("CUSTOMER", SHOP_CUSTOMER);

        kG3_TABLE_GENSET.setkEndColor(new java.awt.Color(153, 204, 255));
        kG3_TABLE_GENSET.setkStartColor(new java.awt.Color(0, 255, 153));
        kG3_TABLE_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        kG3_TABLE_GENSET.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 740, 210));

        jLabel30.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "GENSET", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 18))); // NOI18N
        kG3_TABLE_GENSET.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 780, 270));
        kG3_TABLE_GENSET.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 20, 200, 30));

        back_genset.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        back_genset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back_genset.setText("BACK");
        back_genset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_gensetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addComponent(back_genset, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 17, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(back_genset, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        kG3_TABLE_GENSET.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 560, 90, 50));

        jLabel36.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("EDIT");
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 20, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        kG3_TABLE_GENSET.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 90, 40));

        jLabel37.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("DELETE");
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addComponent(jLabel37)
                    .addGap(0, 19, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        kG3_TABLE_GENSET.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 90, 40));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(jTable4);

        kG3_TABLE_GENSET.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 370, 190));

        jLabel32.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PREVIEW", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 18))); // NOI18N
        kG3_TABLE_GENSET.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 300, 530));

        jLabel34.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AGENT", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 18))); // NOI18N
        kG3_TABLE_GENSET.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 410, 250));

        jLabel42.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CUSTOMER", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 18))); // NOI18N
        kG3_TABLE_GENSET.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 300, 220));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(jTable5);

        kG3_TABLE_GENSET.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 260, 160));

        jTab.addTab("TABLE_GENSET", kG3_TABLE_GENSET);

        kG4_TABLE_FilterPart.setkEndColor(new java.awt.Color(153, 204, 255));
        kG4_TABLE_FilterPart.setkStartColor(new java.awt.Color(0, 255, 153));
        kG4_TABLE_FilterPart.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable3);

        kG4_TABLE_FilterPart.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 1040, 390));

        jLabel38.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FILTER / PART", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 18))); // NOI18N
        kG4_TABLE_FilterPart.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 1080, 450));
        kG4_TABLE_FilterPart.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 20, 200, 40));

        back_FilterPart.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        back_FilterPart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back_FilterPart.setText("BACK");
        back_FilterPart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_FilterPartMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(back_FilterPart, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(back_FilterPart, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        kG4_TABLE_FilterPart.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, 180, 50));

        jLabel40.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("EDIT");
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        kG4_TABLE_FilterPart.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 180, 50));

        jLabel41.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("DELETE");
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        kG4_TABLE_FilterPart.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, 180, 50));

        jTab.addTab("TABLE_FilterPart", kG4_TABLE_FilterPart);

        getContentPane().add(jTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 1280, 625));

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
       jTab.setSelectedIndex(0);
    }//GEN-LAST:event_HOME_LABELMouseClicked

    private void STOCK_LABELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STOCK_LABELMouseClicked
        // HEADER MENU
       HOME_MENU.setText("  STOCK");
        HOME_VIEW_PRODUCT.setText(null);
       // STOCK JTAB
       jTab.setSelectedIndex(1);
    }//GEN-LAST:event_STOCK_LABELMouseClicked

    private void SHOP_LABELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHOP_LABELMouseClicked
     // HEADER MENU
       HOME_MENU.setText("  SHOP");
        HOME_VIEW_PRODUCT.setText(null);
       jTab.setSelectedIndex(5);
    }//GEN-LAST:event_SHOP_LABELMouseClicked

    private void REPORT_LABELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPORT_LABELMouseClicked
      // HEADER MENU
        HOME_MENU.setText("  REPORT");
        HOME_VIEW_PRODUCT.setText(null);
    }//GEN-LAST:event_REPORT_LABELMouseClicked

    private void DeleteFilterBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteFilterBtnMouseClicked
        String id = update_filter_id.getText();
        if(id.equals("")){
            JOptionPane.showMessageDialog(null, "Please Select Filter!","",JOptionPane.ERROR_MESSAGE);
            Class_table ct = new Class_table();
            ct.shopGenset();
        }
        else{
            
                int option = JOptionPane.showConfirmDialog(null, "Are you sure to delete?","",JOptionPane.YES_NO_CANCEL_OPTION);
                
                if(option==0){
                    if(!Class_Filter.DeleteFilter(id))
                   { JOptionPane.showMessageDialog(null, " DELETED ","",JOptionPane.INFORMATION_MESSAGE); Class_table ct = new Class_table(); ct.showFilter(); }                     
                }            
        
        }
        
    }//GEN-LAST:event_DeleteFilterBtnMouseClicked

    private void UpdateFilterBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateFilterBtnMouseClicked
        choose="UPDATE FILTER PRODUCT";
        Insert_Filter ifs  = new Insert_Filter();
        ifs.setVisible(true);
        Insert_Filter.displays.setText(choose);
        Insert_Filter.filterBtn.setText("UPDATE"); // update btn in INSERT_FILTER.java
        Insert_Filter.id.setText(update_filter_id.getText());
    }//GEN-LAST:event_UpdateFilterBtnMouseClicked

    private void AddFilterBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddFilterBtnMouseClicked
       
        choose="ADD FILTER PRODUCT";
         Insert_Filter ifs  = new Insert_Filter();
        ifs.setVisible(true);
        Insert_Filter.displays.setText(choose);
    }//GEN-LAST:event_AddFilterBtnMouseClicked

    private void BackFilterBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackFilterBtnMouseClicked
        HOME_VIEW_PRODUCT.setText(null);
        jTab.setSelectedIndex(1);
    }//GEN-LAST:event_BackFilterBtnMouseClicked

    private void DeleteGensetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteGensetBtnMouseClicked
        // TODO add your handling code here:
        String id = edit_gen_id.getText();
        if(id.equals("")){
            JOptionPane.showMessageDialog(null, "Please Select Genset!","",JOptionPane.ERROR_MESSAGE);
            Class_table ct = new Class_table();
            ct.shopGenset();
        }
        else{
            
                int option = JOptionPane.showConfirmDialog(null, "Are you sure to delete?","",JOptionPane.YES_NO_CANCEL_OPTION);
                
                if(option==0){
                    if(!Class_Stock.DeleteGenset(id))
                   { JOptionPane.showMessageDialog(null, " DELETED "); Class_table ct = new Class_table(); ct.showGenset(); }                   
                }            
        }

    }//GEN-LAST:event_DeleteGensetBtnMouseClicked

    private void UpdateGensetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateGensetBtnMouseClicked
        String getId = edit_gen_id.getText();
        if(getId.equals("")){
            JOptionPane.showMessageDialog(null, "Select Genset First!","",JOptionPane.ERROR_MESSAGE);
        }
        else{
            choose="UPDATE GENSET PRODUCT";
            //Insert_Genset ig = new Insert_Genset(dis);
            Insert_Genset ig = new Insert_Genset();
            ig.setVisible(true);
            Insert_Genset.display.setText(choose);
            Insert_Genset.as_id.setText(edit_gen_id.getText());

            //btn
            Insert_Genset.gensetBtn.setText("UPDATE");
            Insert_Genset.display.setText("UPDATE GENSET PRODUCT");
        }
        
        
    }//GEN-LAST:event_UpdateGensetBtnMouseClicked

    private void AddGensetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddGensetBtnMouseClicked
        choose="ADD GENSET PRODUCT";
        Insert_Genset ig = new Insert_Genset();
        ig.setVisible(true);
        Insert_Genset.display.setText(choose);
    }//GEN-LAST:event_AddGensetBtnMouseClicked

    private void BackGensetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackGensetBtnMouseClicked
        HOME_VIEW_PRODUCT.setText(null);
         jTab.setSelectedIndex(1);
    }//GEN-LAST:event_BackGensetBtnMouseClicked

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked

    }//GEN-LAST:event_jLabel41MouseClicked

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked

    }//GEN-LAST:event_jLabel40MouseClicked

    private void back_FilterPartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_FilterPartMouseClicked
        // back shop menu
        jTab.setSelectedIndex(2);
    }//GEN-LAST:event_back_FilterPartMouseClicked

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel37MouseClicked

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel36MouseClicked

    private void back_gensetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_gensetMouseClicked
        // TODO add your handling code here:
        // back shop menu
        jTab.setSelectedIndex(2);
    }//GEN-LAST:event_back_gensetMouseClicked

    private void MENU_SUPPLIERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MENU_SUPPLIERMouseClicked
        // STOCK MENU SUPPLIER
        jTab.setSelectedIndex(4);
    }//GEN-LAST:event_MENU_SUPPLIERMouseClicked

    private void MENU_GENSETMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MENU_GENSETMouseClicked
        // TODO add your handling code here:
        // ADD ITEM STOCK GENSET
        jTab.setSelectedIndex(2);
        HOME_VIEW_PRODUCT.setText(MENU_GENSET.getText());
    }//GEN-LAST:event_MENU_GENSETMouseClicked

    private void ViewGenset_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewGenset_TableMouseClicked
        int i=ViewGenset_Table.getSelectedRow();
        TableModel model = ViewGenset_Table.getModel();
        edit_gen_id.setText(model.getValueAt(i,0).toString());
    }//GEN-LAST:event_ViewGenset_TableMouseClicked

    private void ViewFitler_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewFitler_tableMouseClicked
        int i=ViewFitler_table.getSelectedRow();
        TableModel model = ViewFitler_table.getModel();
        update_filter_id.setText(model.getValueAt(i,0).toString());
    }//GEN-LAST:event_ViewFitler_tableMouseClicked

    private void MENU_GENSET1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MENU_GENSET1MouseClicked
        jTab.setSelectedIndex(6);
    }//GEN-LAST:event_MENU_GENSET1MouseClicked

    private void MENU_FILTER_PART1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MENU_FILTER_PART1MouseClicked
        jTab.setSelectedIndex(7);
    }//GEN-LAST:event_MENU_FILTER_PART1MouseClicked

    private void Shop_genset_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_genset_tableMouseClicked
        int i=Shop_genset_table.getSelectedRow();
        TableModel model = ViewGenset_Table.getModel();
        shop_genset_id.setText(model.getValueAt(i,0).toString());
    }//GEN-LAST:event_Shop_genset_tableMouseClicked

    private void KG7_TABLE_FILTERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KG7_TABLE_FILTERMouseClicked
        int i=KG7_TABLE_FILTER.getSelectedRow();
        TableModel model = ViewGenset_Table.getModel();
        shop_filter_id.setText(model.getValueAt(i,0).toString());
    }//GEN-LAST:event_KG7_TABLE_FILTERMouseClicked

    private void BackShopGensetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackShopGensetMouseClicked
        jTab.setSelectedIndex(4);
    }//GEN-LAST:event_BackShopGensetMouseClicked

    private void BackFilterBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackFilterBtn2MouseClicked
        String getId = shop_genset_id.getText();
        
        if(getId.equals("")){
            JOptionPane.showMessageDialog(null, "SELECT ITEM!","",JOptionPane.ERROR_MESSAGE);
            Class_table ct = new Class_table();
            ct.shopGenset();
        }
        else{
            ViewGensetItem vgi = new ViewGensetItem();
            vgi.setVisible(true);
            ViewGensetItem.vg_id.setText(shop_genset_id.getText());          
        }

    }//GEN-LAST:event_BackFilterBtn2MouseClicked

    private void BackShopFilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackShopFilterMouseClicked
        jTab.setSelectedIndex(4);
    }//GEN-LAST:event_BackShopFilterMouseClicked

    private void BackFilterBtn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackFilterBtn4MouseClicked
        jTab.setSelectedIndex(4);
    }//GEN-LAST:event_BackFilterBtn4MouseClicked

    private void MENU_FILTER_PARTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MENU_FILTER_PARTMouseClicked
       HOME_VIEW_PRODUCT.setText(MENU_FILTER_PART.getText());
        jTab.setSelectedIndex(3);
    }//GEN-LAST:event_MENU_FILTER_PARTMouseClicked

    private void Stock_supplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_supplierMouseClicked
        int i=Stock_supplier.getSelectedRow();
        TableModel model = Stock_supplier.getModel();
        stock_supplier_id.setText(model.getValueAt(i,0).toString());
    }//GEN-LAST:event_Stock_supplierMouseClicked

    private void stock_supplier_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stock_supplier_editMouseClicked
       
        String getId = stock_supplier_id.getText();
        if(getId.equals("")){
            Class_table ct = new Class_table();
            ct.Stocksupplier();
            JOptionPane.showMessageDialog(null, "Please Select Supplier!","",JOptionPane.ERROR_MESSAGE);
        }
        else{
            InsertSupplier is = new InsertSupplier();
            is.setVisible(true);
            InsertSupplier.id.setText(stock_supplier_id.getText());
            InsertSupplier.SUPPLIER_MENU.setText("UPDATE SUPPLIER");
            InsertSupplier.sup_add.setText("UPDATE");
        }

    }//GEN-LAST:event_stock_supplier_editMouseClicked

    private void Shop_Customer_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Customer_TableMouseClicked
        int i=Shop_Customer_Table.getSelectedRow();
        TableModel model = Shop_Customer_Table.getModel();
        customer_id.setText(model.getValueAt(i,0).toString());
        
    }//GEN-LAST:event_Shop_Customer_TableMouseClicked

    private void shop_customer_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shop_customer_editMouseClicked

        InsertSupplier is = new InsertSupplier();
        is.setVisible(true);
        String cus_id = customer_id.getText();
        InsertSupplier.SUPPLIER_MENU.setText("EDIT CUSTOMER");
        InsertSupplier.id.setText(cus_id);
        InsertSupplier.sup_add.setText("UPDATE");

    }//GEN-LAST:event_shop_customer_editMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        jTab.setSelectedIndex(8);
    }//GEN-LAST:event_jLabel2MouseClicked

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
    private javax.swing.JLabel AddFilterBtn;
    private javax.swing.JLabel AddGensetBtn;
    private javax.swing.JLabel BackFilterBtn;
    private javax.swing.JLabel BackFilterBtn2;
    private javax.swing.JLabel BackFilterBtn4;
    private javax.swing.JLabel BackGensetBtn;
    private javax.swing.JLabel BackShopFilter;
    private javax.swing.JLabel BackShopGenset;
    private javax.swing.JPanel DRAWER;
    private javax.swing.JLabel DeleteFilterBtn;
    private javax.swing.JLabel DeleteGensetBtn;
    private javax.swing.JPanel HEADER;
    private javax.swing.JLabel HOME_LABEL;
    public static javax.swing.JLabel HOME_MENU;
    private javax.swing.JPanel HOME_PANEL;
    public static javax.swing.JLabel HOME_VIEW_PRODUCT;
    private keeptoo.KGradientPanel KG0_HOME;
    private keeptoo.KGradientPanel KG1_STOCK;
    private keeptoo.KGradientPanel KG2_GENSET;
    private keeptoo.KGradientPanel KG3_FILTER_PARTS;
    private keeptoo.KGradientPanel KG4_STOCK_SUPPLIER;
    private keeptoo.KGradientPanel KG5_SHOP;
    private keeptoo.KGradientPanel KG6_SHOP_GENSET;
    private keeptoo.KGradientPanel KG7_SHOP_FILTER;
    public static javax.swing.JTable KG7_TABLE_FILTER;
    private javax.swing.JLabel LOGOUT_LABEL1;
    private javax.swing.JPanel LOGOUT_PANEL;
    private javax.swing.JLabel MENU_FILTER_PART;
    private javax.swing.JLabel MENU_FILTER_PART1;
    private javax.swing.JLabel MENU_GENSET;
    private javax.swing.JLabel MENU_GENSET1;
    private javax.swing.JLabel MENU_SUPPLIER;
    private javax.swing.JLabel REPORT_LABEL;
    private javax.swing.JPanel REPORT_PANEL;
    private keeptoo.KGradientPanel SHOP_CUSTOMER;
    private javax.swing.JLabel SHOP_LABEL;
    private javax.swing.JPanel SHOP_PANEL;
    private javax.swing.JLabel STOCK_LABEL;
    private javax.swing.JPanel STOCK_PANEL;
    public static javax.swing.JTable Shop_Customer_Table;
    public static javax.swing.JTable Shop_genset_table;
    public static javax.swing.JTable Stock_supplier;
    private javax.swing.JLabel UpdateFilterBtn;
    private javax.swing.JLabel UpdateGensetBtn;
    public static javax.swing.JTable ViewFitler_table;
    public static javax.swing.JTable ViewGenset_Table;
    private javax.swing.JLabel back_FilterPart;
    private javax.swing.JLabel back_genset;
    private javax.swing.JLabel customer_id;
    public static javax.swing.JLabel edit_gen_date1;
    public static javax.swing.JLabel edit_gen_id;
    private javax.swing.JLabel fpe_home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTab;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private keeptoo.KGradientPanel kG3_TABLE_GENSET;
    private keeptoo.KGradientPanel kG4_TABLE_FilterPart;
    public static javax.swing.JLabel shop_customer_edit;
    public static javax.swing.JLabel shop_filter_id;
    public static javax.swing.JLabel shop_genset_id;
    private javax.swing.JLabel stock_supplier_edit;
    public static javax.swing.JLabel stock_supplier_id;
    public static javax.swing.JLabel update_filter_id;
    // End of variables declaration//GEN-END:variables
}
