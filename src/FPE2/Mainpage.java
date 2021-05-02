/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE2;


import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;



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
        jLabel15 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        STOCK_FILTER = new keeptoo.KGradientPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Stock_Filter_Table = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        backfilter = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        view_supplier = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        delete_filter = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        update_filter = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        add_filter = new javax.swing.JLabel();
        filter_id = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
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
        jLabel14 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        SHOP_FILTER = new keeptoo.KGradientPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        Shop_Filter_Table = new javax.swing.JTable();
        jPanel30 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Shop_filter_id = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        REPORT = new keeptoo.KGradientPanel();

        stock_supplier_id.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FPE2/logos1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 190));

        HEADER.setBackground(new java.awt.Color(2, 71, 94));
        HEADER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HOME_MENU.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        HOME_MENU.setForeground(new java.awt.Color(255, 255, 255));
        HEADER.add(HOME_MENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 130, 70));

        HOME_VIEW_PRODUCT.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        HOME_VIEW_PRODUCT.setForeground(new java.awt.Color(255, 255, 255));
        HEADER.add(HOME_VIEW_PRODUCT, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 330, 70));

        getContentPane().add(HEADER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 120));

        DRAWER.setBackground(new java.awt.Color(2, 71, 94));
        DRAWER.setPreferredSize(new java.awt.Dimension(230, 775));
        DRAWER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HOME_PANEL.setBackground(new java.awt.Color(0, 117, 128));
        HOME_PANEL.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(243, 246, 26)));

        HOME_LABEL.setBackground(new java.awt.Color(253, 254, 255));
        HOME_LABEL.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        HOME_LABEL.setForeground(new java.awt.Color(255, 255, 255));
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
            .addComponent(HOME_LABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );
        HOME_PANELLayout.setVerticalGroup(
            HOME_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HOME_LABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        DRAWER.add(HOME_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 190, 70));

        LOGOUT_PANEL.setBackground(new java.awt.Color(0, 117, 128));
        LOGOUT_PANEL.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(243, 246, 26)));

        LOGOUT_LABEL1.setBackground(new java.awt.Color(253, 254, 255));
        LOGOUT_LABEL1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LOGOUT_LABEL1.setForeground(new java.awt.Color(255, 255, 255));
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
            .addComponent(LOGOUT_LABEL1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );
        LOGOUT_PANELLayout.setVerticalGroup(
            LOGOUT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LOGOUT_LABEL1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        DRAWER.add(LOGOUT_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 190, 70));

        STOCK_PANEL.setBackground(new java.awt.Color(0, 117, 128));
        STOCK_PANEL.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(243, 246, 26)));

        STOCK_LABEL.setBackground(new java.awt.Color(253, 254, 255));
        STOCK_LABEL.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        STOCK_LABEL.setForeground(new java.awt.Color(255, 255, 255));
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
            .addComponent(STOCK_LABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );
        STOCK_PANELLayout.setVerticalGroup(
            STOCK_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(STOCK_LABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        DRAWER.add(STOCK_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 190, 70));

        SHOP_PANEL.setBackground(new java.awt.Color(0, 117, 128));
        SHOP_PANEL.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(243, 246, 26)));

        SHOP_LABEL.setBackground(new java.awt.Color(253, 254, 255));
        SHOP_LABEL.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        SHOP_LABEL.setForeground(new java.awt.Color(255, 255, 255));
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
            .addComponent(SHOP_LABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );
        SHOP_PANELLayout.setVerticalGroup(
            SHOP_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SHOP_LABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        DRAWER.add(SHOP_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 190, 70));

        REPORT_PANEL.setBackground(new java.awt.Color(0, 117, 128));
        REPORT_PANEL.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(243, 246, 26)));

        REPORT_LABEL.setBackground(new java.awt.Color(253, 254, 255));
        REPORT_LABEL.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        REPORT_LABEL.setForeground(new java.awt.Color(255, 255, 255));
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
            .addComponent(REPORT_LABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );
        REPORT_PANELLayout.setVerticalGroup(
            REPORT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(REPORT_LABEL, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        DRAWER.add(REPORT_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 190, 70));

        getContentPane().add(DRAWER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 725));

        HOME.setBackground(new java.awt.Color(0, 79, 153));
        HOME.setkEndColor(new java.awt.Color(0, 230, 184));
        HOME.setkGradientFocus(700);
        HOME.setkStartColor(new java.awt.Color(0, 230, 184));
        HOME.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fpe_home.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        fpe_home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fpe_home.setText("FIELD POWER ENTERPRISES");
        HOME.add(fpe_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 890, 120));

        JTab.addTab("HOME", HOME);

        STOCK.setkEndColor(new java.awt.Color(0, 230, 184));
        STOCK.setkGradientFocus(700);
        STOCK.setkStartColor(new java.awt.Color(0, 230, 184));
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

        STOCK_GENSET.setkEndColor(new java.awt.Color(0, 230, 184));
        STOCK_GENSET.setkGradientFocus(700);
        STOCK_GENSET.setkStartColor(new java.awt.Color(0, 230, 184));
        STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add_genset.setBackground(new java.awt.Color(51, 204, 51));

        Add.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        Add.setForeground(new java.awt.Color(13, 13, 13));
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
            .addGroup(add_gensetLayout.createSequentialGroup()
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );
        add_gensetLayout.setVerticalGroup(
            add_gensetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        STOCK_GENSET.add(add_genset, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 190, 50));

        update_genset.setBackground(new java.awt.Color(0, 153, 255));

        Update.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        Update.setForeground(new java.awt.Color(13, 13, 13));
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
            .addGroup(update_gensetLayout.createSequentialGroup()
                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 88, Short.MAX_VALUE))
        );
        update_gensetLayout.setVerticalGroup(
            update_gensetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        STOCK_GENSET.add(update_genset, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 190, 50));

        delete_genset.setBackground(new java.awt.Color(255, 77, 77));

        Delete.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        Delete.setForeground(new java.awt.Color(13, 13, 13));
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
            .addGroup(delete_gensetLayout.createSequentialGroup()
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );
        delete_gensetLayout.setVerticalGroup(
            delete_gensetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        STOCK_GENSET.add(delete_genset, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 190, 50));

        suppliergenset.setBackground(new java.awt.Color(116, 139, 116));

        Supplier.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        Supplier.setForeground(new java.awt.Color(13, 13, 13));
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
            .addGroup(suppliergensetLayout.createSequentialGroup()
                .addComponent(Supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );
        suppliergensetLayout.setVerticalGroup(
            suppliergensetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Supplier, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        STOCK_GENSET.add(suppliergenset, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 530, 190, 50));

        back_genset.setBackground(new java.awt.Color(0, 117, 128));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(13, 13, 13));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("BACK");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout back_gensetLayout = new javax.swing.GroupLayout(back_genset);
        back_genset.setLayout(back_gensetLayout);
        back_gensetLayout.setHorizontalGroup(
            back_gensetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, back_gensetLayout.createSequentialGroup()
                .addGap(0, 63, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        STOCK_GENSET.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 1060, 420));
        STOCK_GENSET.add(Genset_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 150, 30));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FPE2/search_icon.png"))); // NOI18N
        STOCK_GENSET.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 35, 31));

        jTextField3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        STOCK_GENSET.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, 31));

        JTab.addTab("STOCK_GENSET", STOCK_GENSET);

        STOCK_FILTER.setkEndColor(new java.awt.Color(0, 230, 184));
        STOCK_FILTER.setkGradientFocus(700);
        STOCK_FILTER.setkStartColor(new java.awt.Color(0, 230, 184));
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
        Stock_Filter_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Filter_TableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(Stock_Filter_Table);

        STOCK_FILTER.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 1050, 420));

        jPanel18.setBackground(new java.awt.Color(0, 117, 128));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 246, 26)));

        backfilter.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        backfilter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backfilter.setText("BACK");
        backfilter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backfilterMouseClicked(evt);
            }
        });
        backfilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                backfilterKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(backfilter, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backfilter, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        STOCK_FILTER.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 530, 190, 50));

        jPanel19.setBackground(new java.awt.Color(116, 139, 116));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 246, 26)));

        view_supplier.setBackground(new java.awt.Color(166, 77, 255));
        view_supplier.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        view_supplier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        view_supplier.setText("SUPPLIER");
        view_supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view_supplierMouseClicked(evt);
            }
        });
        view_supplier.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                view_supplierKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(view_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(view_supplier, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        STOCK_FILTER.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 530, 190, 50));

        jPanel20.setBackground(new java.awt.Color(255, 77, 77));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 246, 26)));

        delete_filter.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        delete_filter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete_filter.setText("DELETE");
        delete_filter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_filterMouseClicked(evt);
            }
        });
        delete_filter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                delete_filterKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(delete_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(delete_filter, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        STOCK_FILTER.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 190, 50));

        jPanel21.setBackground(new java.awt.Color(0, 153, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 246, 26)));

        update_filter.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        update_filter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update_filter.setText("UPDATE");
        update_filter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_filterMouseClicked(evt);
            }
        });
        update_filter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                update_filterKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(update_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(update_filter, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        STOCK_FILTER.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 190, 50));

        jPanel22.setBackground(new java.awt.Color(51, 204, 51));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 246, 26)));

        add_filter.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        add_filter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_filter.setText("ADD");
        add_filter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_filterMouseClicked(evt);
            }
        });
        add_filter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                add_filterKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(add_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 49, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(add_filter, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        STOCK_FILTER.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 190, 50));
        STOCK_FILTER.add(filter_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 70, 20));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FPE2/search_icon.png"))); // NOI18N
        STOCK_FILTER.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 35, 31));

        jTextField4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        STOCK_FILTER.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, 31));

        JTab.addTab("STOCK_FILTER", STOCK_FILTER);

        SHOP.setkEndColor(new java.awt.Color(0, 230, 184));
        SHOP.setkGradientFocus(700);
        SHOP.setkStartColor(new java.awt.Color(0, 230, 184));
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

        SHOP_GENSET.setkEndColor(new java.awt.Color(0, 230, 184));
        SHOP_GENSET.setkGradientFocus(700);
        SHOP_GENSET.setkStartColor(new java.awt.Color(0, 230, 184));
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

        jPanel25.setBackground(new java.awt.Color(0, 117, 128));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 246, 26)));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("BACK");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        SHOP_GENSET.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 190, 50));

        jPanel26.setBackground(new java.awt.Color(251, 173, 55));
        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 246, 26)));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
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
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        SHOP_GENSET.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 190, 50));

        jPanel27.setBackground(new java.awt.Color(255, 153, 187));
        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 246, 26)));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CUSTOMER");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        SHOP_GENSET.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 190, 50));
        SHOP_GENSET.add(Shop_genset_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 80, 20));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FPE2/search_icon.png"))); // NOI18N
        SHOP_GENSET.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 35, 31));

        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SHOP_GENSET.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, 31));

        JTab.addTab("SHOP_GENSET", SHOP_GENSET);

        SHOP_FILTER.setkEndColor(new java.awt.Color(0, 230, 184));
        SHOP_FILTER.setkGradientFocus(700);
        SHOP_FILTER.setkStartColor(new java.awt.Color(0, 230, 184));
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

        jPanel30.setBackground(new java.awt.Color(0, 117, 128));
        jPanel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 246, 26)));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("BACK");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        SHOP_FILTER.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 190, 50));

        jPanel31.setBackground(new java.awt.Color(251, 173, 55));
        jPanel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 246, 26)));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("VIEW");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        SHOP_FILTER.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 190, 50));

        jPanel32.setBackground(new java.awt.Color(255, 153, 187));
        jPanel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 246, 26)));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CUSTOMER");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        SHOP_FILTER.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 190, 50));
        SHOP_FILTER.add(Shop_filter_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 80, 20));

        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SHOP_FILTER.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, 31));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FPE2/search_icon.png"))); // NOI18N
        SHOP_FILTER.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 35, 31));

        JTab.addTab("SHOP_FILTER", SHOP_FILTER);

        REPORT.setkEndColor(new java.awt.Color(0, 230, 184));
        REPORT.setkStartColor(new java.awt.Color(0, 230, 184));

        javax.swing.GroupLayout REPORTLayout = new javax.swing.GroupLayout(REPORT);
        REPORT.setLayout(REPORTLayout);
        REPORTLayout.setHorizontalGroup(
            REPORTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1125, Short.MAX_VALUE)
        );
        REPORTLayout.setVerticalGroup(
            REPORTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );

        JTab.addTab("REPORTS", REPORT);

        getContentPane().add(JTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 1130, 635));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HOME_LABELMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME_LABELMouseEntered
       HOME_LABEL.setForeground(new Color(255,255,255));
       HOME_PANEL.setBackground(new Color(26, 144, 255));
    }//GEN-LAST:event_HOME_LABELMouseEntered

    private void HOME_LABELMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME_LABELMouseExited
        // TODO add your handling code here:
        HOME_LABEL.setForeground(new Color(255,255,255));
       HOME_PANEL.setBackground(new Color(0, 117, 128));
    }//GEN-LAST:event_HOME_LABELMouseExited

    private void LOGOUT_LABEL1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUT_LABEL1MouseEntered
       LOGOUT_LABEL1.setForeground(new Color(255,255,255));
       LOGOUT_PANEL.setBackground(new Color(26, 144, 255));
    }//GEN-LAST:event_LOGOUT_LABEL1MouseEntered

    private void LOGOUT_LABEL1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUT_LABEL1MouseExited
        LOGOUT_LABEL1.setForeground(new Color(255,255,255));
       LOGOUT_PANEL.setBackground(new Color(0, 117, 128));
    }//GEN-LAST:event_LOGOUT_LABEL1MouseExited

    private void STOCK_LABELMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STOCK_LABELMouseEntered
       STOCK_LABEL.setForeground(new Color(255,255,255));
       STOCK_PANEL.setBackground(new Color(26, 144, 255));
    }//GEN-LAST:event_STOCK_LABELMouseEntered

    private void STOCK_LABELMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STOCK_LABELMouseExited
        STOCK_LABEL.setForeground(new Color(255,255,255));
       STOCK_PANEL.setBackground(new Color(0, 117, 128));
    }//GEN-LAST:event_STOCK_LABELMouseExited

    private void SHOP_LABELMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHOP_LABELMouseEntered
        SHOP_LABEL.setForeground(new Color(255,255,255));
       SHOP_PANEL.setBackground(new Color(26, 144, 255));
        
    }//GEN-LAST:event_SHOP_LABELMouseEntered

    private void SHOP_LABELMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHOP_LABELMouseExited
       SHOP_LABEL.setForeground(new Color(255,255,255));
       SHOP_PANEL.setBackground(new Color(0, 117, 128));
    }//GEN-LAST:event_SHOP_LABELMouseExited

    private void REPORT_LABELMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPORT_LABELMouseEntered
       REPORT_LABEL.setForeground(new Color(255,255,255));
       REPORT_PANEL.setBackground(new Color(26, 144, 255));
    }//GEN-LAST:event_REPORT_LABELMouseEntered

    private void REPORT_LABELMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPORT_LABELMouseExited
        REPORT_LABEL.setForeground(new Color(255,255,255));
       REPORT_PANEL.setBackground(new Color(0, 117, 128));
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
        JTab.setSelectedIndex(7);
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
        
        String gen_id = Genset_id.getText();
        
        if(gen_id.equals("")){
            JOptionPane.showMessageDialog(null, "SELECT GENSET!","",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            Insert_Genset ig = new Insert_Genset();
            ig.setVisible(true);
            Insert_Genset.display.setText("UPDATE GENSET PRODUCT");
            Insert_Genset.gensetBtn.setText("UPDATE");

            Insert_Genset.as_supplierNone.setVisible(true);
            Insert_Genset.supplierTxt.setVisible(true);
            Insert_Genset.id.setVisible(true);
            Insert_Genset.as_id.setVisible(true);           
        }


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
                Class_table ct = new Class_table();
                ct.Show_Stock_Genset_Table();
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

    private void add_filterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_filterMouseClicked
        Insert_Filter ifl = new Insert_Filter();
        ifl.setVisible(true);

    }//GEN-LAST:event_add_filterMouseClicked

    private void add_filterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_add_filterKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_filterKeyPressed

    private void update_filterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_filterMouseClicked
        // UPDATE FILTER / PART / OTHER
        
        String filter = filter_id.getText();
        
        if(filter.equals("")){
            JOptionPane.showMessageDialog(null, "SELECT FILTER / PARTS / OTHER !","",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            Insert_Filter ifl = new Insert_Filter();
            ifl.displays.setText("UPDATE FILTER / PARTS / OTHER PRODUCT");
            ifl.filterBtn.setText("UPDATE");
            ifl.id.setText(filter_id.getText());
            ifl.setVisible(true);
        }

        
    }//GEN-LAST:event_update_filterMouseClicked

    private void update_filterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_update_filterKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_filterKeyPressed

    private void delete_filterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_filterMouseClicked
        String id = filter_id.getText();

            int opt = JOptionPane.showConfirmDialog(null, "YOU WANT TO DELETE THIS PRODUCT ? ","",JOptionPane.YES_NO_OPTION);
            if(opt==0){
                if(JOptionPane.YES_NO_OPTION == JOptionPane.YES_OPTION && !Class_Filter.DeleteFilter(id) ){
                Class_table ct = new Class_table();
                ct.Show_Stock_Filter_Table();
                JOptionPane.showMessageDialog(null, " PRODUCT DELETED ","",JOptionPane.INFORMATION_MESSAGE);
                }
            }
    }//GEN-LAST:event_delete_filterMouseClicked

    private void delete_filterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_delete_filterKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_filterKeyPressed

    private void view_supplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_supplierMouseClicked
        Table_Supplier ts = new Table_Supplier();
        ts.setVisible(true);
    }//GEN-LAST:event_view_supplierMouseClicked

    private void view_supplierKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_view_supplierKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_view_supplierKeyPressed

    private void backfilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backfilterMouseClicked
      JTab.setSelectedIndex(1);
    }//GEN-LAST:event_backfilterMouseClicked

    private void backfilterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backfilterKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_backfilterKeyPressed

    private void Stock_Filter_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_TableMouseClicked
        int i=Stock_Filter_Table.getSelectedRow();
        TableModel model = Stock_Filter_Table.getModel();
        filter_id.setText(model.getValueAt(i,0).toString()); 
    }//GEN-LAST:event_Stock_Filter_TableMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        JTab.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        JTab.setSelectedIndex(4);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        JTab.setSelectedIndex(4);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        Table_Customer tc = new Table_Customer();
        tc.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Table_Customer tc = new Table_Customer();
        tc.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

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
    public static javax.swing.JTabbedPane JTab;
    private javax.swing.JLabel LOGOUT_LABEL1;
    private javax.swing.JPanel LOGOUT_PANEL;
    private keeptoo.KGradientPanel REPORT;
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
    public static javax.swing.JLabel Shop_filter_id;
    public static javax.swing.JLabel Shop_genset_id;
    public static javax.swing.JTable Stock_Filter_Table;
    public static javax.swing.JTable Stock_Genset_Table;
    private javax.swing.JLabel Supplier;
    private javax.swing.JLabel Update;
    public static javax.swing.JLabel add_filter;
    public static javax.swing.JPanel add_genset;
    public static javax.swing.JPanel back_genset;
    public static javax.swing.JLabel backfilter;
    public static javax.swing.JLabel delete_filter;
    public static javax.swing.JPanel delete_genset;
    public static javax.swing.JLabel filter_id;
    private javax.swing.JLabel fpe_home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    public static javax.swing.JLabel stock_supplier_id;
    public static javax.swing.JPanel suppliergenset;
    public static javax.swing.JLabel update_filter;
    public static javax.swing.JPanel update_genset;
    public static javax.swing.JLabel view_supplier;
    // End of variables declaration//GEN-END:variables
}
