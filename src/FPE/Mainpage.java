/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;



public class Mainpage extends javax.swing.JFrame {

       public static SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
       public static SimpleDateFormat date = new SimpleDateFormat("MM dd yyyy");
     
   


    
    public static byte[] images = null;
    
    public Mainpage() {
       initComponents();
       Class_tables ct = new Class_tables(); 
       ct.Genset();
       ct.Filter();
       ct.ShopGenset();
       ct.ShopFilter();
       Home_Dates.setText(""+date);
       Home_Time.setText(""+time);   
        showDate();

    }
               
//     Date today = new Date();
//     SimpleDateFormat date = new SimpleDateFormat("MM dd yyyy");
//     SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
//     
//     Home_Dates.setText(date.format(today));
//     Home_Time.setText(time.format(today));
 void showDate(){

            new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Date today = new Date();
                
                SimpleDateFormat date = new SimpleDateFormat("MM dd yyyy");
                Home_Dates.setText(date.format(today));
                
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                Home_Time.setText(s.format(today));
            }
            
        }).start();
 }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stock_supplier_id = new javax.swing.JLabel();
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
        jLabel1 = new javax.swing.JLabel();
        HEADER = new javax.swing.JPanel();
        Dashboard_Display_1 = new javax.swing.JLabel();
        Dashboard_Display_2 = new javax.swing.JLabel();
        Home_Dates = new javax.swing.JLabel();
        Home_Time = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTab = new javax.swing.JTabbedPane();
        HOME = new keeptoo.KGradientPanel();
        fpe_home = new javax.swing.JLabel();
        STOCK = new keeptoo.KGradientPanel();
        Stock_Filter = new javax.swing.JLabel();
        Stock_Genset = new javax.swing.JLabel();
        HOME_PANEL1 = new javax.swing.JPanel();
        Stock_Filter_Parts_Btn = new javax.swing.JLabel();
        HOME_PANEL2 = new javax.swing.JPanel();
        Stock_Genset_Btn = new javax.swing.JLabel();
        STOCK_GENSET = new keeptoo.KGradientPanel();
        Stock_Genset_Panel_Add = new javax.swing.JPanel();
        Stock_Genset_Add = new javax.swing.JLabel();
        Stock_Genset_Panel_Supplier = new javax.swing.JPanel();
        Stock_Genset_Supplier = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        Stock_Genset_Back = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Stock_Genset_Table = new javax.swing.JTable();
        Genset_id = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        Stock_Genset_Panel_View = new javax.swing.JPanel();
        Stock_Genset_View = new javax.swing.JLabel();
        STOCK_FILTER = new keeptoo.KGradientPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Stock_Filter_Table = new javax.swing.JTable();
        filter_id = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        Stock_Filter_Panel_Supplier = new javax.swing.JPanel();
        Stock_Filter_supplier_list = new javax.swing.JLabel();
        Stock_Filter_Panel_Add = new javax.swing.JPanel();
        Stock_Filter_Add = new javax.swing.JLabel();
        Stock_Filter_Panel_view = new javax.swing.JPanel();
        Stock_Filter_view = new javax.swing.JLabel();
        Stock_Filter_Panel_back = new javax.swing.JPanel();
        Stock_Filter_back = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        SHOP = new keeptoo.KGradientPanel();
        Shop_Genset = new javax.swing.JLabel();
        Shop_Filter = new javax.swing.JLabel();
        HOME_PANEL3 = new javax.swing.JPanel();
        ShopFilter_Parts_Btn = new javax.swing.JLabel();
        HOME_PANEL4 = new javax.swing.JPanel();
        Shop_Genset_Btn = new javax.swing.JLabel();
        SHOP_GENSET = new keeptoo.KGradientPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        Shop_Genset_Table = new javax.swing.JTable();
        Shop_genset_id = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        Shop_Genset_Panel_back = new javax.swing.JPanel();
        Shop_Genset_Panel_Back = new javax.swing.JLabel();
        Shop_Genset_Panel_view = new javax.swing.JPanel();
        Shop_Gensetr_view = new javax.swing.JLabel();
        Shop_Genset_Panel_Customer = new javax.swing.JPanel();
        Shop_Genset_Customer_list = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        SHOP_FILTER = new keeptoo.KGradientPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        Shop_Filter_Table = new javax.swing.JTable();
        Shop_filter_id = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Shop_Filter_Panel_Back = new javax.swing.JPanel();
        Shop_Filter_back = new javax.swing.JLabel();
        Shop_Filter_Panel_view = new javax.swing.JPanel();
        Shop_Filter_view = new javax.swing.JLabel();
        Shop_Filter_Panel_Customer_list = new javax.swing.JPanel();
        Shop_Filter_customer = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        REPORT = new keeptoo.KGradientPanel();

        stock_supplier_id.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DRAWER.setBackground(new java.awt.Color(2, 71, 94));
        DRAWER.setPreferredSize(new java.awt.Dimension(230, 775));
        DRAWER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HOME_PANEL.setBackground(new java.awt.Color(0, 117, 128));
        HOME_PANEL.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(243, 246, 26)));

        HOME_LABEL.setBackground(new java.awt.Color(253, 254, 255));
        HOME_LABEL.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        HOME_LABEL.setForeground(new java.awt.Color(255, 255, 255));
        HOME_LABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HOME_LABEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Hom_Btn.png"))); // NOI18N
        HOME_LABEL.setText(" HOME     ");
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
        LOGOUT_LABEL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/logout_Btn.png"))); // NOI18N
        LOGOUT_LABEL1.setText(" LOGOUT  ");
        LOGOUT_LABEL1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGOUT_LABEL1MouseClicked(evt);
            }
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
        STOCK_LABEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Stock_Btn.png"))); // NOI18N
        STOCK_LABEL.setText(" STOCK    ");
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
        SHOP_LABEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Shop_Btn.png"))); // NOI18N
        SHOP_LABEL.setText(" SHOP      ");
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
        REPORT_LABEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/System.png"))); // NOI18N
        REPORT_LABEL.setText(" REPORT  ");
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

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_logos.png"))); // NOI18N
        DRAWER.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 190, 160));

        getContentPane().add(DRAWER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 725));

        HEADER.setBackground(new java.awt.Color(2, 71, 94));
        HEADER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Dashboard_Display_1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Dashboard_Display_1.setForeground(new java.awt.Color(255, 255, 255));
        HEADER.add(Dashboard_Display_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 190, 70));

        Dashboard_Display_2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Dashboard_Display_2.setForeground(new java.awt.Color(255, 255, 255));
        HEADER.add(Dashboard_Display_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 350, 70));

        Home_Dates.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Home_Dates.setForeground(new java.awt.Color(255, 255, 255));
        HEADER.add(Home_Dates, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 20, 100, 30));

        Home_Time.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Home_Time.setForeground(new java.awt.Color(255, 255, 255));
        HEADER.add(Home_Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 60, 100, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TIME   :");
        HEADER.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 60, 70, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DATE  :");
        HEADER.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, 70, 30));

        getContentPane().add(HEADER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 120));

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

        Stock_Filter.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Stock_Filter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Filters.png"))); // NOI18N
        Stock_Filter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_FilterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_FilterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_FilterMouseExited(evt);
            }
        });
        STOCK.add(Stock_Filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 400, 350));

        Stock_Genset.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Stock_Genset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Gensets.png"))); // NOI18N
        Stock_Genset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_GensetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_GensetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_GensetMouseExited(evt);
            }
        });
        STOCK.add(Stock_Genset, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 400, 350));

        HOME_PANEL1.setBackground(new java.awt.Color(0, 117, 128));

        Stock_Filter_Parts_Btn.setBackground(new java.awt.Color(253, 254, 255));
        Stock_Filter_Parts_Btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Stock_Filter_Parts_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Filter_Parts_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Filter_Parts_Btn.setText("FILTER / PARTS");
        Stock_Filter_Parts_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Filter_Parts_BtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Filter_Parts_BtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Filter_Parts_BtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout HOME_PANEL1Layout = new javax.swing.GroupLayout(HOME_PANEL1);
        HOME_PANEL1.setLayout(HOME_PANEL1Layout);
        HOME_PANEL1Layout.setHorizontalGroup(
            HOME_PANEL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HOME_PANEL1Layout.createSequentialGroup()
                .addComponent(Stock_Filter_Parts_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        HOME_PANEL1Layout.setVerticalGroup(
            HOME_PANEL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Filter_Parts_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        STOCK.add(HOME_PANEL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 400, 45));

        HOME_PANEL2.setBackground(new java.awt.Color(0, 117, 128));

        Stock_Genset_Btn.setBackground(new java.awt.Color(253, 254, 255));
        Stock_Genset_Btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Stock_Genset_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Btn.setText("GENSET");
        Stock_Genset_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Genset_BtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Genset_BtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Genset_BtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout HOME_PANEL2Layout = new javax.swing.GroupLayout(HOME_PANEL2);
        HOME_PANEL2.setLayout(HOME_PANEL2Layout);
        HOME_PANEL2Layout.setHorizontalGroup(
            HOME_PANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        HOME_PANEL2Layout.setVerticalGroup(
            HOME_PANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        STOCK.add(HOME_PANEL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 400, 45));

        JTab.addTab("STOCK", STOCK);

        STOCK_GENSET.setkEndColor(new java.awt.Color(0, 230, 184));
        STOCK_GENSET.setkGradientFocus(700);
        STOCK_GENSET.setkStartColor(new java.awt.Color(0, 230, 184));
        STOCK_GENSET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Stock_Genset_Panel_Add.setBackground(new java.awt.Color(51, 255, 119));

        Stock_Genset_Add.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Add.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Add_Btn.png"))); // NOI18N
        Stock_Genset_Add.setText("  ADD ITEM   ");
        Stock_Genset_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Genset_AddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Genset_AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Genset_AddMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_AddLayout = new javax.swing.GroupLayout(Stock_Genset_Panel_Add);
        Stock_Genset_Panel_Add.setLayout(Stock_Genset_Panel_AddLayout);
        Stock_Genset_Panel_AddLayout.setHorizontalGroup(
            Stock_Genset_Panel_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Add, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_AddLayout.setVerticalGroup(
            Stock_Genset_Panel_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Add, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        STOCK_GENSET.add(Stock_Genset_Panel_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 190, 50));

        Stock_Genset_Panel_Supplier.setBackground(new java.awt.Color(133, 173, 173));

        Stock_Genset_Supplier.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Supplier.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Supplier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Supplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Supplier_Btn.png"))); // NOI18N
        Stock_Genset_Supplier.setText("SUPPLIER LIST ");
        Stock_Genset_Supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Genset_SupplierMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Genset_SupplierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Genset_SupplierMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_SupplierLayout = new javax.swing.GroupLayout(Stock_Genset_Panel_Supplier);
        Stock_Genset_Panel_Supplier.setLayout(Stock_Genset_Panel_SupplierLayout);
        Stock_Genset_Panel_SupplierLayout.setHorizontalGroup(
            Stock_Genset_Panel_SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Supplier, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_SupplierLayout.setVerticalGroup(
            Stock_Genset_Panel_SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Supplier, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        STOCK_GENSET.add(Stock_Genset_Panel_Supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 530, 190, 50));

        Stock_Genset_Panel_Back.setBackground(new java.awt.Color(255, 194, 102));

        Stock_Genset_Back.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Back.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Back_Btn.png"))); // NOI18N
        Stock_Genset_Back.setText("   BACK       ");
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

        STOCK_GENSET.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 530, 190, 50));

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

        STOCK_GENSET.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 1070, 420));
        STOCK_GENSET.add(Genset_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 150, 30));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Search_Btn.png"))); // NOI18N
        STOCK_GENSET.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 35, 31));

        jTextField3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });
        STOCK_GENSET.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, 31));

        Stock_Genset_Panel_View.setBackground(new java.awt.Color(255, 153, 153));

        Stock_Genset_View.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_View.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_View.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_View.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_view_icon.png"))); // NOI18N
        Stock_Genset_View.setText("  VIEW ITEM  ");
        Stock_Genset_View.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Genset_ViewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Genset_ViewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Genset_ViewMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_ViewLayout = new javax.swing.GroupLayout(Stock_Genset_Panel_View);
        Stock_Genset_Panel_View.setLayout(Stock_Genset_Panel_ViewLayout);
        Stock_Genset_Panel_ViewLayout.setHorizontalGroup(
            Stock_Genset_Panel_ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_View, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_ViewLayout.setVerticalGroup(
            Stock_Genset_Panel_ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_View, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        STOCK_GENSET.add(Stock_Genset_Panel_View, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 190, 50));

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
        STOCK_FILTER.add(filter_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 70, 20));

        jTextField4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });
        STOCK_FILTER.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, 31));

        Stock_Filter_Panel_Supplier.setBackground(new java.awt.Color(133, 173, 173));

        Stock_Filter_supplier_list.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Filter_supplier_list.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Filter_supplier_list.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Filter_supplier_list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Supplier_Btn.png"))); // NOI18N
        Stock_Filter_supplier_list.setText("SUPPLIER LIST  ");
        Stock_Filter_supplier_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Filter_supplier_listMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Filter_supplier_listMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Filter_supplier_listMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Filter_Panel_SupplierLayout = new javax.swing.GroupLayout(Stock_Filter_Panel_Supplier);
        Stock_Filter_Panel_Supplier.setLayout(Stock_Filter_Panel_SupplierLayout);
        Stock_Filter_Panel_SupplierLayout.setHorizontalGroup(
            Stock_Filter_Panel_SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Filter_supplier_list, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        Stock_Filter_Panel_SupplierLayout.setVerticalGroup(
            Stock_Filter_Panel_SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Filter_supplier_list, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        STOCK_FILTER.add(Stock_Filter_Panel_Supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 530, 190, 50));

        Stock_Filter_Panel_Add.setBackground(new java.awt.Color(51, 255, 119));

        Stock_Filter_Add.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Filter_Add.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Filter_Add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Filter_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Add_Btn.png"))); // NOI18N
        Stock_Filter_Add.setText("ADD ITEM");
        Stock_Filter_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Filter_AddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Filter_AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Filter_AddMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Filter_Panel_AddLayout = new javax.swing.GroupLayout(Stock_Filter_Panel_Add);
        Stock_Filter_Panel_Add.setLayout(Stock_Filter_Panel_AddLayout);
        Stock_Filter_Panel_AddLayout.setHorizontalGroup(
            Stock_Filter_Panel_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Filter_Add, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        Stock_Filter_Panel_AddLayout.setVerticalGroup(
            Stock_Filter_Panel_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Filter_Add, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        STOCK_FILTER.add(Stock_Filter_Panel_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 190, 50));

        Stock_Filter_Panel_view.setBackground(new java.awt.Color(255, 153, 153));

        Stock_Filter_view.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Filter_view.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Filter_view.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Filter_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_view_icon.png"))); // NOI18N
        Stock_Filter_view.setText("  VIEW ITEM   ");
        Stock_Filter_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Filter_viewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Filter_viewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Filter_viewMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Filter_Panel_viewLayout = new javax.swing.GroupLayout(Stock_Filter_Panel_view);
        Stock_Filter_Panel_view.setLayout(Stock_Filter_Panel_viewLayout);
        Stock_Filter_Panel_viewLayout.setHorizontalGroup(
            Stock_Filter_Panel_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Filter_view, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        Stock_Filter_Panel_viewLayout.setVerticalGroup(
            Stock_Filter_Panel_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Filter_view, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        STOCK_FILTER.add(Stock_Filter_Panel_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 190, 50));

        Stock_Filter_Panel_back.setBackground(new java.awt.Color(255, 194, 102));

        Stock_Filter_back.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Filter_back.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Filter_back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Filter_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Back_Btn.png"))); // NOI18N
        Stock_Filter_back.setText("   BACK   ");
        Stock_Filter_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Filter_backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Filter_backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Filter_backMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Filter_Panel_backLayout = new javax.swing.GroupLayout(Stock_Filter_Panel_back);
        Stock_Filter_Panel_back.setLayout(Stock_Filter_Panel_backLayout);
        Stock_Filter_Panel_backLayout.setHorizontalGroup(
            Stock_Filter_Panel_backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Filter_back, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        Stock_Filter_Panel_backLayout.setVerticalGroup(
            Stock_Filter_Panel_backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Filter_back, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        STOCK_FILTER.add(Stock_Filter_Panel_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 530, 190, 50));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Search_Btn.png"))); // NOI18N
        STOCK_FILTER.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 35, 31));

        JTab.addTab("STOCK_FILTER", STOCK_FILTER);

        SHOP.setkEndColor(new java.awt.Color(0, 230, 184));
        SHOP.setkGradientFocus(700);
        SHOP.setkStartColor(new java.awt.Color(0, 230, 184));
        SHOP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Shop_Genset.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Shop_Genset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_shop_Genset.png"))); // NOI18N
        Shop_Genset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_GensetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_GensetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_GensetMouseExited(evt);
            }
        });
        SHOP.add(Shop_Genset, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 400, 350));

        Shop_Filter.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Shop_Filter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_shop_Filter.png"))); // NOI18N
        Shop_Filter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_FilterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_FilterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_FilterMouseExited(evt);
            }
        });
        SHOP.add(Shop_Filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 400, 350));

        HOME_PANEL3.setBackground(new java.awt.Color(47, 79, 79));

        ShopFilter_Parts_Btn.setBackground(new java.awt.Color(253, 254, 255));
        ShopFilter_Parts_Btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ShopFilter_Parts_Btn.setForeground(new java.awt.Color(255, 255, 255));
        ShopFilter_Parts_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShopFilter_Parts_Btn.setText("FILTER / PARTS");
        ShopFilter_Parts_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShopFilter_Parts_BtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ShopFilter_Parts_BtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ShopFilter_Parts_BtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout HOME_PANEL3Layout = new javax.swing.GroupLayout(HOME_PANEL3);
        HOME_PANEL3.setLayout(HOME_PANEL3Layout);
        HOME_PANEL3Layout.setHorizontalGroup(
            HOME_PANEL3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HOME_PANEL3Layout.createSequentialGroup()
                .addComponent(ShopFilter_Parts_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        HOME_PANEL3Layout.setVerticalGroup(
            HOME_PANEL3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ShopFilter_Parts_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        SHOP.add(HOME_PANEL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 400, 45));

        HOME_PANEL4.setBackground(new java.awt.Color(47, 79, 79));

        Shop_Genset_Btn.setBackground(new java.awt.Color(253, 254, 255));
        Shop_Genset_Btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Shop_Genset_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Genset_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset_Btn.setText("GENSET");
        Shop_Genset_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Genset_BtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Genset_BtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Genset_BtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout HOME_PANEL4Layout = new javax.swing.GroupLayout(HOME_PANEL4);
        HOME_PANEL4.setLayout(HOME_PANEL4Layout);
        HOME_PANEL4Layout.setHorizontalGroup(
            HOME_PANEL4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        HOME_PANEL4Layout.setVerticalGroup(
            HOME_PANEL4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        SHOP.add(HOME_PANEL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 400, 45));

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
        SHOP_GENSET.add(Shop_genset_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 80, 20));

        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        SHOP_GENSET.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, 31));

        Shop_Genset_Panel_back.setBackground(new java.awt.Color(255, 194, 102));

        Shop_Genset_Panel_Back.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Genset_Panel_Back.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Genset_Panel_Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset_Panel_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Back_Btn.png"))); // NOI18N
        Shop_Genset_Panel_Back.setText("   BACK   ");
        Shop_Genset_Panel_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Genset_Panel_BackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Genset_Panel_BackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Genset_Panel_BackMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Shop_Genset_Panel_backLayout = new javax.swing.GroupLayout(Shop_Genset_Panel_back);
        Shop_Genset_Panel_back.setLayout(Shop_Genset_Panel_backLayout);
        Shop_Genset_Panel_backLayout.setHorizontalGroup(
            Shop_Genset_Panel_backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Panel_Back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        Shop_Genset_Panel_backLayout.setVerticalGroup(
            Shop_Genset_Panel_backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Panel_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        SHOP_GENSET.add(Shop_Genset_Panel_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 530, 200, 50));

        Shop_Genset_Panel_view.setBackground(new java.awt.Color(255, 153, 153));

        Shop_Gensetr_view.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Gensetr_view.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Gensetr_view.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Gensetr_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_view_icon.png"))); // NOI18N
        Shop_Gensetr_view.setText("  VIEW ITEM   ");
        Shop_Gensetr_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Gensetr_viewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Gensetr_viewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Gensetr_viewMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Shop_Genset_Panel_viewLayout = new javax.swing.GroupLayout(Shop_Genset_Panel_view);
        Shop_Genset_Panel_view.setLayout(Shop_Genset_Panel_viewLayout);
        Shop_Genset_Panel_viewLayout.setHorizontalGroup(
            Shop_Genset_Panel_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Shop_Genset_Panel_viewLayout.createSequentialGroup()
                .addComponent(Shop_Gensetr_view, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Shop_Genset_Panel_viewLayout.setVerticalGroup(
            Shop_Genset_Panel_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Gensetr_view, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        SHOP_GENSET.add(Shop_Genset_Panel_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, 200, 50));

        Shop_Genset_Panel_Customer.setBackground(new java.awt.Color(133, 173, 173));

        Shop_Genset_Customer_list.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Genset_Customer_list.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Genset_Customer_list.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset_Customer_list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Customer_Btn.png"))); // NOI18N
        Shop_Genset_Customer_list.setText(" CUSTOMER LIST");
        Shop_Genset_Customer_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_listMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_listMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_listMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Shop_Genset_Panel_CustomerLayout = new javax.swing.GroupLayout(Shop_Genset_Panel_Customer);
        Shop_Genset_Panel_Customer.setLayout(Shop_Genset_Panel_CustomerLayout);
        Shop_Genset_Panel_CustomerLayout.setHorizontalGroup(
            Shop_Genset_Panel_CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Shop_Genset_Panel_CustomerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Shop_Genset_Customer_list, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Shop_Genset_Panel_CustomerLayout.setVerticalGroup(
            Shop_Genset_Panel_CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Customer_list, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        SHOP_GENSET.add(Shop_Genset_Panel_Customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 200, 50));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Search_Btn.png"))); // NOI18N
        SHOP_GENSET.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 35, 31));

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
        Shop_Filter_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Filter_TableMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(Shop_Filter_Table);

        SHOP_FILTER.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 1050, 420));
        SHOP_FILTER.add(Shop_filter_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 80, 20));

        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        SHOP_FILTER.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, 31));

        Shop_Filter_Panel_Back.setBackground(new java.awt.Color(255, 194, 102));

        Shop_Filter_back.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Filter_back.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Filter_back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Filter_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Back_Btn.png"))); // NOI18N
        Shop_Filter_back.setText("   BACK   ");
        Shop_Filter_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Filter_backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Filter_backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Filter_backMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Shop_Filter_Panel_BackLayout = new javax.swing.GroupLayout(Shop_Filter_Panel_Back);
        Shop_Filter_Panel_Back.setLayout(Shop_Filter_Panel_BackLayout);
        Shop_Filter_Panel_BackLayout.setHorizontalGroup(
            Shop_Filter_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Filter_back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        Shop_Filter_Panel_BackLayout.setVerticalGroup(
            Shop_Filter_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Filter_back, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        SHOP_FILTER.add(Shop_Filter_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 530, 200, 50));

        Shop_Filter_Panel_view.setBackground(new java.awt.Color(255, 153, 153));

        Shop_Filter_view.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Filter_view.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Filter_view.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Filter_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_view_icon.png"))); // NOI18N
        Shop_Filter_view.setText("  VIEW ITEM   ");
        Shop_Filter_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Filter_viewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Filter_viewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Filter_viewMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Shop_Filter_Panel_viewLayout = new javax.swing.GroupLayout(Shop_Filter_Panel_view);
        Shop_Filter_Panel_view.setLayout(Shop_Filter_Panel_viewLayout);
        Shop_Filter_Panel_viewLayout.setHorizontalGroup(
            Shop_Filter_Panel_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Shop_Filter_Panel_viewLayout.createSequentialGroup()
                .addComponent(Shop_Filter_view, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Shop_Filter_Panel_viewLayout.setVerticalGroup(
            Shop_Filter_Panel_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Filter_view, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        SHOP_FILTER.add(Shop_Filter_Panel_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, 200, 50));

        Shop_Filter_Panel_Customer_list.setBackground(new java.awt.Color(133, 173, 173));

        Shop_Filter_customer.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Filter_customer.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Filter_customer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Filter_customer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Customer_Btn.png"))); // NOI18N
        Shop_Filter_customer.setText(" CUSTOMER LIST");
        Shop_Filter_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Filter_customerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Filter_customerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Filter_customerMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Shop_Filter_Panel_Customer_listLayout = new javax.swing.GroupLayout(Shop_Filter_Panel_Customer_list);
        Shop_Filter_Panel_Customer_list.setLayout(Shop_Filter_Panel_Customer_listLayout);
        Shop_Filter_Panel_Customer_listLayout.setHorizontalGroup(
            Shop_Filter_Panel_Customer_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Filter_customer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        Shop_Filter_Panel_Customer_listLayout.setVerticalGroup(
            Shop_Filter_Panel_Customer_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Filter_customer, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        SHOP_FILTER.add(Shop_Filter_Panel_Customer_list, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 200, 50));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Search_Btn.png"))); // NOI18N
        SHOP_FILTER.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 35, 31));

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

    private void HOME_LABELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME_LABELMouseClicked
        // HEADER MENU
        Dashboard_Display_1.setText("HOME");
        Dashboard_Display_2.setText(null);
        JTab.setSelectedIndex(0);
    }//GEN-LAST:event_HOME_LABELMouseClicked

    private void HOME_LABELMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME_LABELMouseEntered
        HOME_LABEL.setForeground(new Color(41, 61, 61));
        HOME_PANEL.setBackground(new Color(128, 229, 255));
    }//GEN-LAST:event_HOME_LABELMouseEntered

    private void HOME_LABELMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME_LABELMouseExited
        // TODO add your handling code here:
        HOME_LABEL.setForeground(new Color(255,255,255));
        HOME_PANEL.setBackground(new Color(0, 117, 128));
    }//GEN-LAST:event_HOME_LABELMouseExited

    private void LOGOUT_LABEL1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUT_LABEL1MouseEntered
        LOGOUT_LABEL1.setForeground(new Color(41, 61, 61));
        LOGOUT_PANEL.setBackground(new Color(128, 229, 255));
    }//GEN-LAST:event_LOGOUT_LABEL1MouseEntered

    private void LOGOUT_LABEL1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUT_LABEL1MouseExited
        LOGOUT_LABEL1.setForeground(new Color(255,255,255));
        LOGOUT_PANEL.setBackground(new Color(0, 117, 128));
    }//GEN-LAST:event_LOGOUT_LABEL1MouseExited

    private void STOCK_LABELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STOCK_LABELMouseClicked
        // HEADER MENU
        Dashboard_Display_1.setText("STOCK");
        Dashboard_Display_2.setText(null);
        // STOCK JTAB
        JTab.setSelectedIndex(1);
    }//GEN-LAST:event_STOCK_LABELMouseClicked

    private void STOCK_LABELMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STOCK_LABELMouseEntered
        STOCK_LABEL.setForeground(new Color(41, 61, 61));
        STOCK_PANEL.setBackground(new Color(128, 229, 255));
    }//GEN-LAST:event_STOCK_LABELMouseEntered

    private void STOCK_LABELMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STOCK_LABELMouseExited
        STOCK_LABEL.setForeground(new Color(255,255,255));
        STOCK_PANEL.setBackground(new Color(0, 117, 128));
    }//GEN-LAST:event_STOCK_LABELMouseExited

    private void SHOP_LABELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHOP_LABELMouseClicked
        // HEADER MENU
        Dashboard_Display_1.setText("SHOP");
        Dashboard_Display_2.setText(null);
        JTab.setSelectedIndex(4);
    }//GEN-LAST:event_SHOP_LABELMouseClicked

    private void SHOP_LABELMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHOP_LABELMouseEntered
        SHOP_LABEL.setForeground(new Color(41, 61, 61));
        SHOP_PANEL.setBackground(new Color(128, 229, 255));

    }//GEN-LAST:event_SHOP_LABELMouseEntered

    private void SHOP_LABELMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHOP_LABELMouseExited
        SHOP_LABEL.setForeground(new Color(255,255,255));
        SHOP_PANEL.setBackground(new Color(0, 117, 128));
    }//GEN-LAST:event_SHOP_LABELMouseExited

    private void REPORT_LABELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPORT_LABELMouseClicked
        // HEADER MENU
        Dashboard_Display_1.setText("REPORT");
        Dashboard_Display_2.setText(null);
        JTab.setSelectedIndex(7);
    }//GEN-LAST:event_REPORT_LABELMouseClicked

    private void REPORT_LABELMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPORT_LABELMouseEntered
        REPORT_LABEL.setForeground(new Color(41, 61, 61));
        REPORT_PANEL.setBackground(new Color(128, 229, 255));
    }//GEN-LAST:event_REPORT_LABELMouseEntered

    private void REPORT_LABELMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPORT_LABELMouseExited
        REPORT_LABEL.setForeground(new Color(255,255,255));
        REPORT_PANEL.setBackground(new Color(0, 117, 128));
    }//GEN-LAST:event_REPORT_LABELMouseExited

    private void Stock_FilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_FilterMouseClicked
         Stock_Genset_Supplier.setForeground(new Color(41, 61, 61));
        JTab.setSelectedIndex(3);
    }//GEN-LAST:event_Stock_FilterMouseClicked

    private void Stock_GensetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_GensetMouseClicked
        JTab.setSelectedIndex(2);
        Stock_Genset_Btn.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_Stock_GensetMouseClicked

    private void Stock_Filter_Parts_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_Parts_BtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Filter_Parts_BtnMouseClicked

    private void Stock_Filter_Parts_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_Parts_BtnMouseEntered
        // TODO add your handling code here:
         Stock_Filter_Parts_Btn.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_Stock_Filter_Parts_BtnMouseEntered

    private void Stock_Filter_Parts_BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_Parts_BtnMouseExited
        Stock_Filter_Parts_Btn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Stock_Filter_Parts_BtnMouseExited

    private void Stock_Genset_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BtnMouseClicked
       
    }//GEN-LAST:event_Stock_Genset_BtnMouseClicked

    private void Stock_Genset_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BtnMouseEntered
        Stock_Genset_Btn.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_Stock_Genset_BtnMouseEntered

    private void Stock_Genset_BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BtnMouseExited
        Stock_Genset_Btn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Stock_Genset_BtnMouseExited

    private void Stock_Genset_AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_AddMouseClicked
        Insert_Inventory_Genset iig = new Insert_Inventory_Genset();
        iig.setVisible(true);
        Insert_Inventory_Genset.Inventory_Display.setText("ADD GENSET PRODUCT");
        Insert_Inventory_Genset.Insert_Invetory_Genset_id.setEditable(false);
        Insert_Inventory_Genset.Insert_Invetory_Supplier_id.setEditable(false);
        Insert_Inventory_Genset.Energized.setVisible(false);
        Insert_Inventory_Genset.Panel_Energized.setVisible(false);

        
    }//GEN-LAST:event_Stock_Genset_AddMouseClicked

    private void Stock_Genset_AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_AddMouseEntered
        Stock_Genset_Add.setForeground(new Color(41, 61, 61));
//        Stock_Genset_Panel_Add.setBackground(new Color(51, 255, 119));
    }//GEN-LAST:event_Stock_Genset_AddMouseEntered

    private void Stock_Genset_AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_AddMouseExited
        Stock_Genset_Add.setForeground(new Color(255,255,255));
//        Stock_Genset_Panel_Add.setBackground(new Color(51, 255, 119));
    }//GEN-LAST:event_Stock_Genset_AddMouseExited

    private void Stock_Genset_SupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_SupplierMouseClicked
        Table_Supplier tbs = new Table_Supplier();
        Table_Supplier.Add.setText("ADD SUPPLIER");
        Table_Supplier.Path.setText("1");
        Table_Supplier.supplier_id.setText("");        
        tbs.setVisible(true);

    }//GEN-LAST:event_Stock_Genset_SupplierMouseClicked

    private void Stock_Genset_SupplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_SupplierMouseEntered
        Stock_Genset_Supplier.setForeground(new Color(41, 61, 61));
//        Stock_Genset_Panel_Supplier.setBackground(new Color(133, 173, 173));
    }//GEN-LAST:event_Stock_Genset_SupplierMouseEntered

    private void Stock_Genset_SupplierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_SupplierMouseExited
        Stock_Genset_Supplier.setForeground(new Color(255,255,255));
//        Stock_Genset_Panel_Supplier.setBackground(new Color(133, 173, 173));
    }//GEN-LAST:event_Stock_Genset_SupplierMouseExited

    private void Stock_Genset_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseClicked
        JTab.setSelectedIndex(1);
    }//GEN-LAST:event_Stock_Genset_BackMouseClicked

    private void Stock_Genset_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseEntered
        Stock_Genset_Back.setForeground(new Color(41, 61, 61));
//        Stock_Genset_Panel_Back.setBackground(new Color(255,194,102));
    }//GEN-LAST:event_Stock_Genset_BackMouseEntered

    private void Stock_Genset_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseExited
        Stock_Genset_Back.setForeground(new Color(255,255,255));
//        Stock_Genset_Panel_Back.setBackground(new Color(255,194,102));
    }//GEN-LAST:event_Stock_Genset_BackMouseExited

    private void Stock_Genset_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_TableMouseClicked
        int i=Stock_Genset_Table.getSelectedRow();
        TableModel model = Stock_Genset_Table.getModel();
        Genset_id.setText(model.getValueAt(i,0).toString());
        
    }//GEN-LAST:event_Stock_Genset_TableMouseClicked

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        DefaultTableModel tm = (DefaultTableModel)Stock_Genset_Table.getModel();
        String find = jTextField3.getText().toUpperCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
        Stock_Genset_Table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(find));
    }//GEN-LAST:event_jTextField3KeyPressed

    private void Stock_Filter_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_TableMouseClicked
        int i=Stock_Filter_Table.getSelectedRow();
        TableModel model = Stock_Filter_Table.getModel();
        filter_id.setText(model.getValueAt(i,0).toString());
    }//GEN-LAST:event_Stock_Filter_TableMouseClicked

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        DefaultTableModel tm = (DefaultTableModel)Stock_Filter_Table.getModel();
        String find = jTextField4.getText().toUpperCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
        Stock_Filter_Table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(find));
    }//GEN-LAST:event_jTextField4KeyPressed

    private void Shop_GensetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_GensetMouseClicked
        JTab.setSelectedIndex(5);
    }//GEN-LAST:event_Shop_GensetMouseClicked

    private void Shop_FilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_FilterMouseClicked
        JTab.setSelectedIndex(6);
    }//GEN-LAST:event_Shop_FilterMouseClicked

    private void Shop_Genset_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_TableMouseClicked
        int i=Shop_Genset_Table.getSelectedRow();
        TableModel model = Shop_Genset_Table.getModel();
        Shop_genset_id.setText(model.getValueAt(i,0).toString());

    }//GEN-LAST:event_Shop_Genset_TableMouseClicked

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        DefaultTableModel tm = (DefaultTableModel)Shop_Genset_Table.getModel();
        String find = jTextField2.getText().toUpperCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
        Shop_Genset_Table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(find));
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        DefaultTableModel tm = (DefaultTableModel)Shop_Filter_Table.getModel();
        String find = jTextField1.getText().toUpperCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
        Shop_Filter_Table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(find));
    }//GEN-LAST:event_jTextField1KeyPressed

    private void Stock_Genset_ViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_ViewMouseClicked
       String id = Genset_id.getText();
        if(id.equals("")){
            JOptionPane.showMessageDialog(null, " SELECT FILTER !! ","",JOptionPane.ERROR_MESSAGE);
        }
        else{
         View_Stock_Genset vsg = new View_Stock_Genset();
         vsg.setVisible(true); 
        }
  
    }//GEN-LAST:event_Stock_Genset_ViewMouseClicked

    private void Stock_Genset_ViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_ViewMouseEntered
        Stock_Genset_View.setForeground(new Color(41, 61, 61));
//        Stock_Genset_Panel_View.setBackground(new Color(133, 173, 173));
    }//GEN-LAST:event_Stock_Genset_ViewMouseEntered

    private void Stock_Genset_ViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_ViewMouseExited
        Stock_Genset_View.setForeground(new Color(255,255,255));
//        Stock_Genset_Panel_View.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_Stock_Genset_ViewMouseExited

    private void Stock_Filter_supplier_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_supplier_listMouseClicked
        Table_Supplier tbs = new Table_Supplier();
        Table_Supplier.Add.setText("ADD SUPPLIER");
        Table_Supplier.Path.setText("1");
        Table_Supplier.supplier_id.setText("");                 
        tbs.setVisible(true);

    }//GEN-LAST:event_Stock_Filter_supplier_listMouseClicked

    private void Stock_Filter_supplier_listMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_supplier_listMouseEntered
        // TODO add your handling code here:
        Stock_Filter_supplier_list.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_Stock_Filter_supplier_listMouseEntered

    private void Stock_Filter_supplier_listMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_supplier_listMouseExited
        // TODO add your handling code here:
        Stock_Filter_supplier_list.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Stock_Filter_supplier_listMouseExited

    private void Stock_Filter_AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_AddMouseClicked
        Insert_Inventory_Filter iig = new Insert_Inventory_Filter();
        iig.setVisible(true);
        Insert_Inventory_Filter.Inventory_Display.setText("ADD FILTER PRODUCT");
        Insert_Inventory_Filter.Insert_Invetory_Filter_id.setEditable(false);
        Insert_Inventory_Filter.Insert_Filter_Supplier_id.setEditable(false);
    }//GEN-LAST:event_Stock_Filter_AddMouseClicked

    private void Stock_Filter_AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_AddMouseEntered
        // TODO add your handling code here:
        Stock_Filter_Add.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_Stock_Filter_AddMouseEntered

    private void Stock_Filter_AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_AddMouseExited
        // TODO add your handling code here:
        Stock_Filter_Add.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Stock_Filter_AddMouseExited

    private void Stock_Filter_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_viewMouseClicked
        // TODO add your handling code here:
        String id = filter_id.getText();
        if(id.equals("")){
            JOptionPane.showMessageDialog(null, " SELCET FILTER !! ","",JOptionPane.ERROR_MESSAGE);
        }
        else{  
           View_Stock_Filter vsf = new View_Stock_Filter();
           vsf.setVisible(true);  
        }
        
    }//GEN-LAST:event_Stock_Filter_viewMouseClicked

    private void Stock_Filter_viewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_viewMouseEntered
        // TODO add your handling code here:
        Stock_Filter_view.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_Stock_Filter_viewMouseEntered

    private void Stock_Filter_viewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_viewMouseExited
        // TODO add your handling code here:
        Stock_Filter_view.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Stock_Filter_viewMouseExited

    private void Stock_Filter_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_backMouseClicked
        // TODO add your handling code here:
        JTab.setSelectedIndex(1);
    }//GEN-LAST:event_Stock_Filter_backMouseClicked

    private void Stock_Filter_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_backMouseEntered
        // TODO add your handling code here:
        Stock_Filter_back.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_Stock_Filter_backMouseEntered

    private void Stock_Filter_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_backMouseExited
        // TODO add your handling code here:
        Stock_Filter_back.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Stock_Filter_backMouseExited

    private void LOGOUT_LABEL1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUT_LABEL1MouseClicked
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_LOGOUT_LABEL1MouseClicked

    private void ShopFilter_Parts_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShopFilter_Parts_BtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ShopFilter_Parts_BtnMouseClicked

    private void ShopFilter_Parts_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShopFilter_Parts_BtnMouseEntered
        ShopFilter_Parts_Btn.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_ShopFilter_Parts_BtnMouseEntered

    private void ShopFilter_Parts_BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShopFilter_Parts_BtnMouseExited
       ShopFilter_Parts_Btn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_ShopFilter_Parts_BtnMouseExited

    private void Shop_Genset_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_BtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset_BtnMouseClicked

    private void Shop_Genset_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_BtnMouseEntered
       Shop_Genset_Btn.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_Shop_Genset_BtnMouseEntered

    private void Shop_Genset_BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_BtnMouseExited
        Shop_Genset_Btn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Shop_Genset_BtnMouseExited

    private void Shop_Genset_Panel_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Panel_BackMouseClicked
        JTab.setSelectedIndex(4);
    }//GEN-LAST:event_Shop_Genset_Panel_BackMouseClicked

    private void Shop_Genset_Panel_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Panel_BackMouseEntered
        Shop_Genset_Panel_Back.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_Shop_Genset_Panel_BackMouseEntered

    private void Shop_Genset_Panel_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Panel_BackMouseExited
        Shop_Genset_Panel_Back.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Shop_Genset_Panel_BackMouseExited

    private void Shop_Gensetr_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Gensetr_viewMouseClicked
        String id = Shop_genset_id.getText();
        if(id.equals(""))
        {
            JOptionPane.showMessageDialog(null, " SELECT ITEM !!","",JOptionPane.ERROR_MESSAGE);
        }else{
        View_Shop_Genset vsg = new View_Shop_Genset();
        vsg.setVisible(true);  
        }
        
    }//GEN-LAST:event_Shop_Gensetr_viewMouseClicked

    private void Shop_Gensetr_viewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Gensetr_viewMouseEntered
        Shop_Gensetr_view.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_Shop_Gensetr_viewMouseEntered

    private void Shop_Gensetr_viewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Gensetr_viewMouseExited
       Shop_Gensetr_view.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Shop_Gensetr_viewMouseExited

    private void Shop_Filter_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Filter_backMouseClicked
       JTab.setSelectedIndex(4);
    }//GEN-LAST:event_Shop_Filter_backMouseClicked

    private void Shop_Filter_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Filter_backMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Filter_backMouseEntered

    private void Shop_Filter_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Filter_backMouseExited
        Shop_Gensetr_view.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Shop_Filter_backMouseExited

    private void Shop_Filter_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Filter_viewMouseClicked
        String id = Shop_filter_id.getText();
        if(id.equals(""))
        {
            JOptionPane.showMessageDialog(null, " SELECT ITEM !!","",JOptionPane.ERROR_MESSAGE);
        }else{
        View_Shop_Firter vsf = new View_Shop_Firter();
        vsf.setVisible(true);
        }
    }//GEN-LAST:event_Shop_Filter_viewMouseClicked

    private void Shop_Filter_viewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Filter_viewMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Filter_viewMouseEntered

    private void Shop_Filter_viewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Filter_viewMouseExited
        Shop_Gensetr_view.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Shop_Filter_viewMouseExited

    private void Shop_Filter_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Filter_customerMouseClicked
      Table_Customer cus = new Table_Customer();
      Table_Customer.Add.setText("ADD CUSTOMER");
      Table_Customer.Path.setText("1");
      cus.setVisible(true);
    }//GEN-LAST:event_Shop_Filter_customerMouseClicked

    private void Shop_Filter_customerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Filter_customerMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Filter_customerMouseEntered

    private void Shop_Filter_customerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Filter_customerMouseExited
        Shop_Gensetr_view.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Shop_Filter_customerMouseExited

    private void Shop_Genset_Customer_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_listMouseClicked
      Table_Customer cus = new Table_Customer();
      Table_Customer.Add.setText("ADD CUSTOMER");
      Table_Customer.Path.setText("1");
      cus.setVisible(true);
    }//GEN-LAST:event_Shop_Genset_Customer_listMouseClicked

    private void Shop_Genset_Customer_listMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_listMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset_Customer_listMouseEntered

    private void Shop_Genset_Customer_listMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_listMouseExited
       Shop_Genset_Customer_list.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Shop_Genset_Customer_listMouseExited

    private void Stock_GensetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_GensetMouseEntered
         Stock_Genset_Btn.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_Stock_GensetMouseEntered

    private void Stock_GensetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_GensetMouseExited
        Stock_Genset_Btn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Stock_GensetMouseExited

    private void Stock_FilterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_FilterMouseEntered
        Stock_Filter_Parts_Btn.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_Stock_FilterMouseEntered

    private void Stock_FilterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_FilterMouseExited
        Stock_Filter_Parts_Btn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Stock_FilterMouseExited

    private void Shop_GensetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_GensetMouseEntered
        Shop_Genset_Btn.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_Shop_GensetMouseEntered

    private void Shop_FilterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_FilterMouseEntered
         ShopFilter_Parts_Btn.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_Shop_FilterMouseEntered

    private void Shop_FilterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_FilterMouseExited
         ShopFilter_Parts_Btn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Shop_FilterMouseExited

    private void Shop_GensetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_GensetMouseExited
        Shop_Genset_Btn.setForeground(new Color(255,255,255));
        
    }//GEN-LAST:event_Shop_GensetMouseExited

    private void Shop_Filter_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Filter_TableMouseClicked
        int i=Shop_Filter_Table.getSelectedRow();
        TableModel model = Shop_Filter_Table.getModel();
        Shop_filter_id.setText(model.getValueAt(i,0).toString());
    }//GEN-LAST:event_Shop_Filter_TableMouseClicked
      
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DRAWER;
    public static javax.swing.JLabel Dashboard_Display_1;
    public static javax.swing.JLabel Dashboard_Display_2;
    public static javax.swing.JLabel Genset_id;
    private javax.swing.JPanel HEADER;
    private keeptoo.KGradientPanel HOME;
    private javax.swing.JLabel HOME_LABEL;
    private javax.swing.JPanel HOME_PANEL;
    private javax.swing.JPanel HOME_PANEL1;
    private javax.swing.JPanel HOME_PANEL2;
    private javax.swing.JPanel HOME_PANEL3;
    private javax.swing.JPanel HOME_PANEL4;
    private javax.swing.JLabel Home_Dates;
    private javax.swing.JLabel Home_Time;
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
    private javax.swing.JLabel ShopFilter_Parts_Btn;
    private javax.swing.JLabel Shop_Filter;
    public static javax.swing.JPanel Shop_Filter_Panel_Back;
    public static javax.swing.JPanel Shop_Filter_Panel_Customer_list;
    public static javax.swing.JPanel Shop_Filter_Panel_view;
    public static javax.swing.JTable Shop_Filter_Table;
    private javax.swing.JLabel Shop_Filter_back;
    private javax.swing.JLabel Shop_Filter_customer;
    private javax.swing.JLabel Shop_Filter_view;
    private javax.swing.JLabel Shop_Genset;
    private javax.swing.JLabel Shop_Genset_Btn;
    private javax.swing.JLabel Shop_Genset_Customer_list;
    private javax.swing.JLabel Shop_Genset_Panel_Back;
    public static javax.swing.JPanel Shop_Genset_Panel_Customer;
    public static javax.swing.JPanel Shop_Genset_Panel_back;
    public static javax.swing.JPanel Shop_Genset_Panel_view;
    public static javax.swing.JTable Shop_Genset_Table;
    private javax.swing.JLabel Shop_Gensetr_view;
    public static javax.swing.JLabel Shop_filter_id;
    public static javax.swing.JLabel Shop_genset_id;
    private javax.swing.JLabel Stock_Filter;
    private javax.swing.JLabel Stock_Filter_Add;
    public static javax.swing.JPanel Stock_Filter_Panel_Add;
    public static javax.swing.JPanel Stock_Filter_Panel_Supplier;
    public static javax.swing.JPanel Stock_Filter_Panel_back;
    public static javax.swing.JPanel Stock_Filter_Panel_view;
    private javax.swing.JLabel Stock_Filter_Parts_Btn;
    public static javax.swing.JTable Stock_Filter_Table;
    private javax.swing.JLabel Stock_Filter_back;
    private javax.swing.JLabel Stock_Filter_supplier_list;
    private javax.swing.JLabel Stock_Filter_view;
    private javax.swing.JLabel Stock_Genset;
    private javax.swing.JLabel Stock_Genset_Add;
    private javax.swing.JLabel Stock_Genset_Back;
    private javax.swing.JLabel Stock_Genset_Btn;
    public static javax.swing.JPanel Stock_Genset_Panel_Add;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Supplier;
    public static javax.swing.JPanel Stock_Genset_Panel_View;
    private javax.swing.JLabel Stock_Genset_Supplier;
    public static javax.swing.JTable Stock_Genset_Table;
    private javax.swing.JLabel Stock_Genset_View;
    public static javax.swing.JLabel filter_id;
    private javax.swing.JLabel fpe_home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    public static javax.swing.JLabel stock_supplier_id;
    // End of variables declaration//GEN-END:variables
}
