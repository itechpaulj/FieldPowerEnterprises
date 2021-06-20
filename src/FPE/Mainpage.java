/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;


import FPE.folder.Admin_Register;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;



public class Mainpage extends javax.swing.JFrame {
    public static String located = "Robles"; // report or print default location path
    public static SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
    public static SimpleDateFormat date = new SimpleDateFormat("MM dd yyyy");
    public static String admin_id ;

    public static Add_Selection as = new Add_Selection(); 
    
    public static byte[] images = null;
    Connection con;
    
    Class_tables ct11 = new Class_tables();
    Class_tables ct22 = new Class_tables();
    String Stock_cat;
    String Sales_cat;
    
    public Mainpage() {
       initComponents();
        category.setSelectedIndex(0);
        sales_category.setSelectedIndex(0);
        AllTable();
        
    }
         
//    public void Graph(){
//       
//       
//       Class_Graph cg =new Class_Graph();
//       cg.yandong();
//       cg.isuzu();
//       cg.cummins();
//       cg.perkins();
//       cg.GensetOther();
//       cg.Filter(); 
//       cg.Parts();
////       showPieChart();
//       }
    public void AllTable(){

       Class_tables ct1 = new Class_tables();
       Class_tables ct2 = new Class_tables();
       ct1 = ct11;
       ct2 = ct22;
       

       }

//public void Refresh()
//{
//       Class_tables ct = new Class_tables();
//       ct.Genset();
//     
//       ct.ShopGenset();
//       ct.ShopFilter();
//       ct.History_Genset();
//       ct.History_Fitler();
//       ct.Bin_Genset();
//       ct.Bin_Filter();
//       Graph();
//}
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
 
//    private void cartifEmpty (){
//        PreparedStatement ps;
//        ResultSet rs;
//        try{
//        ps=FPE_DB.getConnection().prepareStatement("SELECT `ID`, `BRAND`, `DATE`, `DESCRIPTION`, `TYPE`, `QUANTITY`, `PRICE`, `TOTAL PRICE` FROM `add_cart`");
//        rs = ps.executeQuery();
//            if(rs.next() == true){
//                // Database is not empty
//               cartIfEmpty.setText("2");
//            }
//            else{
//                //empty database
//               cartIfEmpty.setText("1");
//            }
//        }
//        catch(Exception e){
//            
//        }
//    }
    
//public void showPieChart(){
//
//        DefaultPieDataset barDataset = new DefaultPieDataset();
//        barDataset.setValue( "YANDONG" , new Integer(Class_Graph.yandong) );  
//        barDataset.setValue( "ISUZU" , new Integer(Class_Graph.isuzu) );   
//        barDataset.setValue( "CUMMINS" , new Integer(Class_Graph.cummins));    
//        barDataset.setValue( "PERKINS" , new Integer(Class_Graph.perkins) );
//        barDataset.setValue( "OTHER" , new Integer(Class_Graph.other) );  
//
//        JFreeChart piechart = ChartFactory.createPieChart(" GENSET SALES STATUS ",barDataset, false,true,false);//explain
//      
//        
//        ChartPanel barChartPanel = new ChartPanel(piechart);
//        Genset_Graph.removeAll();
//        Genset_Graph.add(barChartPanel, BorderLayout.CENTER);
//        Genset_Graph.validate();  
//        
//        // Filter Graph
//        DefaultPieDataset barDataset1 = new DefaultPieDataset( );
//        barDataset1.setValue( "FLTER" , new Integer(Class_Graph.filter) );  
//        barDataset1.setValue( "PARTS" , new Integer(Class_Graph.parts) );   
//       
//
//      //create chart
//       JFreeChart piechart1 = ChartFactory.createPieChart(" FILTER / PARTS SALES STATUS ",barDataset1, false,true,false);//explain
//      
//        ChartPanel barChartPanel2 = new ChartPanel(piechart1);
//        Filter_Graph.removeAll();
//        Filter_Graph.add(barChartPanel2, BorderLayout.CENTER);
//        Filter_Graph.validate();
//}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stock_supplier_id = new javax.swing.JLabel();
        pat_back_filter = new javax.swing.JLabel();
        pat_back_genset = new javax.swing.JLabel();
        DRAWER = new javax.swing.JPanel();
        HOME_PANEL = new javax.swing.JPanel();
        HOME = new javax.swing.JLabel();
        STOCK_PANEL = new javax.swing.JPanel();
        STOCK = new javax.swing.JLabel();
        SHOP_PANEL = new javax.swing.JPanel();
        SHOP = new javax.swing.JLabel();
        SALES_PANEL = new javax.swing.JPanel();
        SALES = new javax.swing.JLabel();
        STATUS_PANEL = new javax.swing.JPanel();
        STATUS = new javax.swing.JLabel();
        LOGOUT_PANEL = new javax.swing.JPanel();
        LOGOUT_LABEL1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        HEADER = new javax.swing.JPanel();
        Dashboard_Display_2 = new javax.swing.JLabel();
        Home_Dates = new javax.swing.JLabel();
        Home_Time = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Dashboard_Display_3 = new javax.swing.JLabel();
        Dashboard_Display_1 = new javax.swing.JLabel();
        JTab = new javax.swing.JTabbedPane();
        HOME_0 = new keeptoo.KGradientPanel();
        fpe_home = new javax.swing.JLabel();
        STOCKS_1 = new keeptoo.KGradientPanel();
        ShopFilter_Genset_1 = new javax.swing.JPanel();
        Shop_Genset = new javax.swing.JLabel();
        STOCKS_2 = new keeptoo.KGradientPanel();
        Stock_Genset_Panel_Add = new javax.swing.JPanel();
        Stock_Genset_Add = new javax.swing.JLabel();
        Stock_Genset_Panel_Supplier = new javax.swing.JPanel();
        Stock_Genset_Supplier = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        Stock_Genset_Back = new javax.swing.JLabel();
        Stock_Genset_Panel_View = new javax.swing.JPanel();
        Stock_Genset_View = new javax.swing.JLabel();
        Stock_Genset_Panel_Supplier1 = new javax.swing.JPanel();
        Stock_Genset_Supplier1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        All_Stock_Table = new javax.swing.JTable();
        ss_id = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        genset_brand = new javax.swing.JComboBox<>();
        category = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        SALES_3 = new keeptoo.KGradientPanel();
        ShopFilter_Genset_2 = new javax.swing.JPanel();
        Shop_Genset1 = new javax.swing.JLabel();
        ShopFilter_Genset_4 = new javax.swing.JPanel();
        Shop_Genset3 = new javax.swing.JLabel();
        SALES_4 = new keeptoo.KGradientPanel();
        Stock_Genset_Panel_Add1 = new javax.swing.JPanel();
        Shop_Add = new javax.swing.JLabel();
        Stock_Genset_Panel_Back1 = new javax.swing.JPanel();
        Shop_Back = new javax.swing.JLabel();
        Stock_Genset_Panel_Supplier3 = new javax.swing.JPanel();
        Shop_Print = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Sales_Table = new javax.swing.JTable();
        ss_id1 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        genset_brand1 = new javax.swing.JComboBox<>();
        sales_category = new javax.swing.JComboBox<>();
        jTextField6 = new javax.swing.JTextField();
        REPORT_5 = new keeptoo.KGradientPanel();
        ShopFilter_Genset_3 = new javax.swing.JPanel();
        Shop_Genset2 = new javax.swing.JLabel();
        REPORT_6 = new keeptoo.KGradientPanel();
        Stock_Genset_Panel_Add2 = new javax.swing.JPanel();
        Stock_Genset_Add2 = new javax.swing.JLabel();
        Stock_Genset_Panel_Supplier4 = new javax.swing.JPanel();
        Stock_Genset_Supplier4 = new javax.swing.JLabel();
        Stock_Genset_Panel_Back2 = new javax.swing.JPanel();
        Stock_Genset_Back2 = new javax.swing.JLabel();
        Stock_Genset_Panel_View2 = new javax.swing.JPanel();
        Stock_Genset_View2 = new javax.swing.JLabel();
        Stock_Genset_Panel_Supplier5 = new javax.swing.JPanel();
        Stock_Genset_Supplier5 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        All_Stock_Table2 = new javax.swing.JTable();
        ss_id2 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        genset_brand2 = new javax.swing.JComboBox<>();
        category2 = new javax.swing.JComboBox<>();
        jTextField8 = new javax.swing.JTextField();

        stock_supplier_id.setText("jLabel2");

        pat_back_filter.setText("jLabel5");

        pat_back_genset.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DRAWER.setBackground(new java.awt.Color(2, 51, 74));
        DRAWER.setPreferredSize(new java.awt.Dimension(230, 775));
        DRAWER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HOME_PANEL.setBackground(new java.awt.Color(0, 117, 128));

        HOME.setBackground(new java.awt.Color(253, 254, 255));
        HOME.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        HOME.setForeground(new java.awt.Color(255, 255, 255));
        HOME.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HOME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Drawer_Home.png"))); // NOI18N
        HOME.setText(" HOME      ");
        HOME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HOMEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HOMEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HOMEMouseExited(evt);
            }
        });

        javax.swing.GroupLayout HOME_PANELLayout = new javax.swing.GroupLayout(HOME_PANEL);
        HOME_PANEL.setLayout(HOME_PANELLayout);
        HOME_PANELLayout.setHorizontalGroup(
            HOME_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HOME_PANELLayout.createSequentialGroup()
                .addComponent(HOME, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );
        HOME_PANELLayout.setVerticalGroup(
            HOME_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HOME, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        DRAWER.add(HOME_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 190, 70));

        STOCK_PANEL.setBackground(new java.awt.Color(0, 117, 128));

        STOCK.setBackground(new java.awt.Color(253, 254, 255));
        STOCK.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        STOCK.setForeground(new java.awt.Color(255, 255, 255));
        STOCK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        STOCK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Drawer_Stock.png"))); // NOI18N
        STOCK.setText(" STOCK     ");
        STOCK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                STOCKMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                STOCKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                STOCKMouseExited(evt);
            }
        });

        javax.swing.GroupLayout STOCK_PANELLayout = new javax.swing.GroupLayout(STOCK_PANEL);
        STOCK_PANEL.setLayout(STOCK_PANELLayout);
        STOCK_PANELLayout.setHorizontalGroup(
            STOCK_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(STOCK_PANELLayout.createSequentialGroup()
                .addComponent(STOCK, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );
        STOCK_PANELLayout.setVerticalGroup(
            STOCK_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(STOCK, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        DRAWER.add(STOCK_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 190, 70));

        SHOP_PANEL.setBackground(new java.awt.Color(0, 117, 128));

        SHOP.setBackground(new java.awt.Color(253, 254, 255));
        SHOP.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        SHOP.setForeground(new java.awt.Color(255, 255, 255));
        SHOP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SHOP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Drawer_Shop.png"))); // NOI18N
        SHOP.setText(" SALES     ");
        SHOP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SHOPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SHOPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SHOPMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SHOP_PANELLayout = new javax.swing.GroupLayout(SHOP_PANEL);
        SHOP_PANEL.setLayout(SHOP_PANELLayout);
        SHOP_PANELLayout.setHorizontalGroup(
            SHOP_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SHOP_PANELLayout.createSequentialGroup()
                .addComponent(SHOP, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );
        SHOP_PANELLayout.setVerticalGroup(
            SHOP_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SHOP, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        DRAWER.add(SHOP_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 190, 70));

        SALES_PANEL.setBackground(new java.awt.Color(0, 117, 128));

        SALES.setBackground(new java.awt.Color(253, 254, 255));
        SALES.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        SALES.setForeground(new java.awt.Color(255, 255, 255));
        SALES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SALES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Drawer_System.png"))); // NOI18N
        SALES.setText(" REPORTS");
        SALES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SALESMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SALESMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SALESMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SALES_PANELLayout = new javax.swing.GroupLayout(SALES_PANEL);
        SALES_PANEL.setLayout(SALES_PANELLayout);
        SALES_PANELLayout.setHorizontalGroup(
            SALES_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SALES_PANELLayout.createSequentialGroup()
                .addComponent(SALES, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );
        SALES_PANELLayout.setVerticalGroup(
            SALES_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SALES, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        DRAWER.add(SALES_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 190, 70));

        STATUS_PANEL.setBackground(new java.awt.Color(0, 117, 128));

        STATUS.setBackground(new java.awt.Color(253, 254, 255));
        STATUS.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        STATUS.setForeground(new java.awt.Color(255, 255, 255));
        STATUS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        STATUS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Drawer_Chart.png"))); // NOI18N
        STATUS.setText(" STATUS   ");
        STATUS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                STATUSMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                STATUSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                STATUSMouseExited(evt);
            }
        });

        javax.swing.GroupLayout STATUS_PANELLayout = new javax.swing.GroupLayout(STATUS_PANEL);
        STATUS_PANEL.setLayout(STATUS_PANELLayout);
        STATUS_PANELLayout.setHorizontalGroup(
            STATUS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(STATUS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        STATUS_PANELLayout.setVerticalGroup(
            STATUS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(STATUS, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        DRAWER.add(STATUS_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 190, 70));

        LOGOUT_PANEL.setBackground(new java.awt.Color(0, 117, 128));

        LOGOUT_LABEL1.setBackground(new java.awt.Color(253, 254, 255));
        LOGOUT_LABEL1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LOGOUT_LABEL1.setForeground(new java.awt.Color(255, 255, 255));
        LOGOUT_LABEL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGOUT_LABEL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Drawer_Logout.png"))); // NOI18N
        LOGOUT_LABEL1.setText(" LOGOUT   ");
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
            .addComponent(LOGOUT_LABEL1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        LOGOUT_PANELLayout.setVerticalGroup(
            LOGOUT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LOGOUT_LABEL1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        DRAWER.add(LOGOUT_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 190, 70));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("FIELD POWER ENTERPRISES");
        DRAWER.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 190, 30));

        getContentPane().add(DRAWER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 725));

        HEADER.setBackground(new java.awt.Color(2, 51, 74));
        HEADER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Dashboard_Display_2.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        Dashboard_Display_2.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard_Display_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HEADER.add(Dashboard_Display_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 280, 70));

        Home_Dates.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Home_Dates.setForeground(new java.awt.Color(243, 246, 26));
        HEADER.add(Home_Dates, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 30, 110, 28));

        Home_Time.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Home_Time.setForeground(new java.awt.Color(243, 246, 26));
        HEADER.add(Home_Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 60, 110, 28));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(243, 246, 26));
        jLabel2.setText("TIME     :");
        HEADER.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 60, 70, 28));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(243, 246, 26));
        jLabel3.setText("DATE   :");
        HEADER.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 30, 70, 28));

        Dashboard_Display_3.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        Dashboard_Display_3.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard_Display_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HEADER.add(Dashboard_Display_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 200, 70));

        Dashboard_Display_1.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        Dashboard_Display_1.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard_Display_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HEADER.add(Dashboard_Display_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 140, 70));

        getContentPane().add(HEADER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1364, 120));

        HOME_0.setBackground(new java.awt.Color(0, 79, 153));
        HOME_0.setkEndColor(new java.awt.Color(42, 142, 142));
        HOME_0.setkGradientFocus(700);
        HOME_0.setkStartColor(new java.awt.Color(42, 142, 142));
        HOME_0.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fpe_home.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        fpe_home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fpe_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Logo/Home_logo2.png"))); // NOI18N
        HOME_0.add(fpe_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1130, 590));

        JTab.addTab("1", HOME_0);

        STOCKS_1.setkEndColor(new java.awt.Color(42, 142, 142));
        STOCKS_1.setkGradientFocus(700);
        STOCKS_1.setkStartColor(new java.awt.Color(42, 142, 142));
        STOCKS_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ShopFilter_Genset_1.setBackground(new java.awt.Color(0, 117, 128));
        ShopFilter_Genset_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Genset.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Shop_Genset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Path_Btn/Shop_Gensets.PNG"))); // NOI18N
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

        javax.swing.GroupLayout ShopFilter_Genset_1Layout = new javax.swing.GroupLayout(ShopFilter_Genset_1);
        ShopFilter_Genset_1.setLayout(ShopFilter_Genset_1Layout);
        ShopFilter_Genset_1Layout.setHorizontalGroup(
            ShopFilter_Genset_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
        );
        ShopFilter_Genset_1Layout.setVerticalGroup(
            ShopFilter_Genset_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
        );

        STOCKS_1.add(ShopFilter_Genset_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 880, 470));

        JTab.addTab("4", STOCKS_1);

        STOCKS_2.setkEndColor(new java.awt.Color(42, 142, 142));
        STOCKS_2.setkGradientFocus(700);
        STOCKS_2.setkStartColor(new java.awt.Color(42, 142, 142));
        STOCKS_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                STOCKS_2MouseEntered(evt);
            }
        });
        STOCKS_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Stock_Genset_Panel_Add.setBackground(new java.awt.Color(24, 165, 88));

        Stock_Genset_Add.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Stock_Genset_Add.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Add.png"))); // NOI18N
        Stock_Genset_Add.setText("  ADD STOCK");
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
            .addComponent(Stock_Genset_Add, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_AddLayout.setVerticalGroup(
            Stock_Genset_Panel_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Add, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        STOCKS_2.add(Stock_Genset_Panel_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 170, 50));

        Stock_Genset_Panel_Supplier.setBackground(new java.awt.Color(153, 153, 102));

        Stock_Genset_Supplier.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Stock_Genset_Supplier.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Supplier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Supplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Supplier.png"))); // NOI18N
        Stock_Genset_Supplier.setText(" SUPPLIER");
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
            .addComponent(Stock_Genset_Supplier, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_SupplierLayout.setVerticalGroup(
            Stock_Genset_Panel_SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Supplier, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        STOCKS_2.add(Stock_Genset_Panel_Supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, 170, 50));

        Stock_Genset_Panel_Back.setBackground(new java.awt.Color(255, 173, 51));

        Stock_Genset_Back.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Back.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Back.png"))); // NOI18N
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
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_BackLayout.setVerticalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        STOCKS_2.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 530, 170, 50));

        Stock_Genset_Panel_View.setBackground(new java.awt.Color(66, 139, 202));

        Stock_Genset_View.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Stock_Genset_View.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_View.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_View.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_View.png"))); // NOI18N
        Stock_Genset_View.setText(" EDIT STOCK");
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
            .addComponent(Stock_Genset_View, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_ViewLayout.setVerticalGroup(
            Stock_Genset_Panel_ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_View, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        STOCKS_2.add(Stock_Genset_Panel_View, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 170, 50));

        Stock_Genset_Panel_Supplier1.setBackground(new java.awt.Color(102, 153, 153));

        Stock_Genset_Supplier1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Stock_Genset_Supplier1.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Supplier1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Supplier1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Print.png"))); // NOI18N
        Stock_Genset_Supplier1.setText(" PRINT");
        Stock_Genset_Supplier1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Genset_Supplier1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Genset_Supplier1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Genset_Supplier1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_Supplier1Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_Supplier1);
        Stock_Genset_Panel_Supplier1.setLayout(Stock_Genset_Panel_Supplier1Layout);
        Stock_Genset_Panel_Supplier1Layout.setHorizontalGroup(
            Stock_Genset_Panel_Supplier1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Supplier1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Supplier1Layout.setVerticalGroup(
            Stock_Genset_Panel_Supplier1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Supplier1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        STOCKS_2.add(Stock_Genset_Panel_Supplier1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 170, 50));

        All_Stock_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        All_Stock_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                All_Stock_TableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(All_Stock_Table);

        STOCKS_2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 1070, 420));
        STOCKS_2.add(ss_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 150, 30));

        jTextField3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });
        STOCKS_2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, 31));

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Search.png"))); // NOI18N
        STOCKS_2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 35, 31));

        genset_brand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "CUMMINS", "ISUZU", "PERKINS", "YANDONG", "OTHER BRAND" }));
        STOCKS_2.add(genset_brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, 110, 30));

        category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL STOCK", "GENERATOR", "PARTS", "WAREHOUSE", "OFFICE" }));
        category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryActionPerformed(evt);
            }
        });
        STOCKS_2.add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 180, 30));

        jTextField4.setBackground(new java.awt.Color(255, 204, 153));
        jTextField4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("CATEGORY");
        STOCKS_2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 120, 30));

        JTab.addTab("2", STOCKS_2);

        SALES_3.setkEndColor(new java.awt.Color(42, 142, 142));
        SALES_3.setkGradientFocus(700);
        SALES_3.setkStartColor(new java.awt.Color(42, 142, 142));
        SALES_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ShopFilter_Genset_2.setBackground(new java.awt.Color(0, 117, 128));
        ShopFilter_Genset_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Genset1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Shop_Genset1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Path_Btn/Shop_Gensets.PNG"))); // NOI18N
        Shop_Genset1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Genset1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Genset1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Genset1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout ShopFilter_Genset_2Layout = new javax.swing.GroupLayout(ShopFilter_Genset_2);
        ShopFilter_Genset_2.setLayout(ShopFilter_Genset_2Layout);
        ShopFilter_Genset_2Layout.setHorizontalGroup(
            ShopFilter_Genset_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
        );
        ShopFilter_Genset_2Layout.setVerticalGroup(
            ShopFilter_Genset_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        SALES_3.add(ShopFilter_Genset_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 420, 430));

        ShopFilter_Genset_4.setBackground(new java.awt.Color(0, 117, 128));
        ShopFilter_Genset_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Genset3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Shop_Genset3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Path_Btn/Shop_Gensets.PNG"))); // NOI18N
        Shop_Genset3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Genset3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Genset3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Genset3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout ShopFilter_Genset_4Layout = new javax.swing.GroupLayout(ShopFilter_Genset_4);
        ShopFilter_Genset_4.setLayout(ShopFilter_Genset_4Layout);
        ShopFilter_Genset_4Layout.setHorizontalGroup(
            ShopFilter_Genset_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset3, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
        );
        ShopFilter_Genset_4Layout.setVerticalGroup(
            ShopFilter_Genset_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        SALES_3.add(ShopFilter_Genset_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 420, 430));

        JTab.addTab("4", SALES_3);

        SALES_4.setkEndColor(new java.awt.Color(42, 142, 142));
        SALES_4.setkGradientFocus(700);
        SALES_4.setkStartColor(new java.awt.Color(42, 142, 142));
        SALES_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SALES_4MouseEntered(evt);
            }
        });
        SALES_4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Stock_Genset_Panel_Add1.setBackground(new java.awt.Color(24, 165, 88));

        Shop_Add.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Shop_Add.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/New/cursor_30px.png"))); // NOI18N
        Shop_Add.setText("SELECT ");
        Shop_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_AddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_AddMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_Add1Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_Add1);
        Stock_Genset_Panel_Add1.setLayout(Stock_Genset_Panel_Add1Layout);
        Stock_Genset_Panel_Add1Layout.setHorizontalGroup(
            Stock_Genset_Panel_Add1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Add1Layout.setVerticalGroup(
            Stock_Genset_Panel_Add1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        SALES_4.add(Stock_Genset_Panel_Add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 170, 50));

        Stock_Genset_Panel_Back1.setBackground(new java.awt.Color(255, 173, 51));

        Shop_Back.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Back.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Back.png"))); // NOI18N
        Shop_Back.setText(" BACK");
        Shop_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_BackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_BackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_BackMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_Back1Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_Back1);
        Stock_Genset_Panel_Back1.setLayout(Stock_Genset_Panel_Back1Layout);
        Stock_Genset_Panel_Back1Layout.setHorizontalGroup(
            Stock_Genset_Panel_Back1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Back1Layout.setVerticalGroup(
            Stock_Genset_Panel_Back1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        SALES_4.add(Stock_Genset_Panel_Back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, 170, 50));

        Stock_Genset_Panel_Supplier3.setBackground(new java.awt.Color(102, 153, 153));

        Shop_Print.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Shop_Print.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Print.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Print.png"))); // NOI18N
        Shop_Print.setText(" PRINT");
        Shop_Print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_PrintMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_PrintMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_PrintMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_Supplier3Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_Supplier3);
        Stock_Genset_Panel_Supplier3.setLayout(Stock_Genset_Panel_Supplier3Layout);
        Stock_Genset_Panel_Supplier3Layout.setHorizontalGroup(
            Stock_Genset_Panel_Supplier3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Print, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Supplier3Layout.setVerticalGroup(
            Stock_Genset_Panel_Supplier3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Print, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        SALES_4.add(Stock_Genset_Panel_Supplier3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 170, 50));

        Sales_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Sales_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sales_TableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(Sales_Table);

        SALES_4.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 1070, 420));
        SALES_4.add(ss_id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 150, 30));

        jTextField5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });
        SALES_4.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, 31));

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Search.png"))); // NOI18N
        SALES_4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 35, 31));

        genset_brand1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "CUMMINS", "ISUZU", "PERKINS", "YANDONG", "OTHER BRAND" }));
        SALES_4.add(genset_brand1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, 110, 30));

        sales_category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sales_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL STOCK", "GENERATOR", "PARTS", "WAREHOUSE", "OFFICE" }));
        sales_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sales_categoryActionPerformed(evt);
            }
        });
        SALES_4.add(sales_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 180, 30));

        jTextField6.setBackground(new java.awt.Color(204, 51, 0));
        jTextField6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("CATEGORY");
        SALES_4.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 120, 30));

        JTab.addTab("2", SALES_4);

        REPORT_5.setkEndColor(new java.awt.Color(42, 142, 142));
        REPORT_5.setkGradientFocus(700);
        REPORT_5.setkStartColor(new java.awt.Color(42, 142, 142));
        REPORT_5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ShopFilter_Genset_3.setBackground(new java.awt.Color(0, 117, 128));
        ShopFilter_Genset_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Genset2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Shop_Genset2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Path_Btn/Shop_Gensets.PNG"))); // NOI18N
        Shop_Genset2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Genset2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Genset2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Genset2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout ShopFilter_Genset_3Layout = new javax.swing.GroupLayout(ShopFilter_Genset_3);
        ShopFilter_Genset_3.setLayout(ShopFilter_Genset_3Layout);
        ShopFilter_Genset_3Layout.setHorizontalGroup(
            ShopFilter_Genset_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset2, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
        );
        ShopFilter_Genset_3Layout.setVerticalGroup(
            ShopFilter_Genset_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
        );

        REPORT_5.add(ShopFilter_Genset_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 880, 470));

        JTab.addTab("4", REPORT_5);

        REPORT_6.setkEndColor(new java.awt.Color(42, 142, 142));
        REPORT_6.setkGradientFocus(700);
        REPORT_6.setkStartColor(new java.awt.Color(42, 142, 142));
        REPORT_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                REPORT_6MouseEntered(evt);
            }
        });
        REPORT_6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Stock_Genset_Panel_Add2.setBackground(new java.awt.Color(24, 165, 88));

        Stock_Genset_Add2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Stock_Genset_Add2.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Add2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Add2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Add.png"))); // NOI18N
        Stock_Genset_Add2.setText("  ADD STOCK");
        Stock_Genset_Add2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Genset_Add2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Genset_Add2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Genset_Add2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_Add2Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_Add2);
        Stock_Genset_Panel_Add2.setLayout(Stock_Genset_Panel_Add2Layout);
        Stock_Genset_Panel_Add2Layout.setHorizontalGroup(
            Stock_Genset_Panel_Add2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Add2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Add2Layout.setVerticalGroup(
            Stock_Genset_Panel_Add2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Add2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        REPORT_6.add(Stock_Genset_Panel_Add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 170, 50));

        Stock_Genset_Panel_Supplier4.setBackground(new java.awt.Color(153, 153, 102));

        Stock_Genset_Supplier4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Stock_Genset_Supplier4.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Supplier4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Supplier4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Supplier.png"))); // NOI18N
        Stock_Genset_Supplier4.setText(" SUPPLIER");
        Stock_Genset_Supplier4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Genset_Supplier4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Genset_Supplier4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Genset_Supplier4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_Supplier4Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_Supplier4);
        Stock_Genset_Panel_Supplier4.setLayout(Stock_Genset_Panel_Supplier4Layout);
        Stock_Genset_Panel_Supplier4Layout.setHorizontalGroup(
            Stock_Genset_Panel_Supplier4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Supplier4, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Supplier4Layout.setVerticalGroup(
            Stock_Genset_Panel_Supplier4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Supplier4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        REPORT_6.add(Stock_Genset_Panel_Supplier4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, 170, 50));

        Stock_Genset_Panel_Back2.setBackground(new java.awt.Color(255, 173, 51));

        Stock_Genset_Back2.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Back2.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Back2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Back2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Back.png"))); // NOI18N
        Stock_Genset_Back2.setText(" BACK");
        Stock_Genset_Back2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Genset_Back2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Genset_Back2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Genset_Back2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_Back2Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_Back2);
        Stock_Genset_Panel_Back2.setLayout(Stock_Genset_Panel_Back2Layout);
        Stock_Genset_Panel_Back2Layout.setHorizontalGroup(
            Stock_Genset_Panel_Back2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Back2Layout.setVerticalGroup(
            Stock_Genset_Panel_Back2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        REPORT_6.add(Stock_Genset_Panel_Back2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 530, 170, 50));

        Stock_Genset_Panel_View2.setBackground(new java.awt.Color(66, 139, 202));

        Stock_Genset_View2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Stock_Genset_View2.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_View2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_View2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_View.png"))); // NOI18N
        Stock_Genset_View2.setText(" EDIT STOCK");
        Stock_Genset_View2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Genset_View2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Genset_View2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Genset_View2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_View2Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_View2);
        Stock_Genset_Panel_View2.setLayout(Stock_Genset_Panel_View2Layout);
        Stock_Genset_Panel_View2Layout.setHorizontalGroup(
            Stock_Genset_Panel_View2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_View2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_View2Layout.setVerticalGroup(
            Stock_Genset_Panel_View2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_View2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        REPORT_6.add(Stock_Genset_Panel_View2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, 170, 50));

        Stock_Genset_Panel_Supplier5.setBackground(new java.awt.Color(102, 153, 153));

        Stock_Genset_Supplier5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Stock_Genset_Supplier5.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Supplier5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Supplier5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Print.png"))); // NOI18N
        Stock_Genset_Supplier5.setText(" PRINT");
        Stock_Genset_Supplier5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Genset_Supplier5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Genset_Supplier5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Genset_Supplier5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_Supplier5Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_Supplier5);
        Stock_Genset_Panel_Supplier5.setLayout(Stock_Genset_Panel_Supplier5Layout);
        Stock_Genset_Panel_Supplier5Layout.setHorizontalGroup(
            Stock_Genset_Panel_Supplier5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Supplier5, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Supplier5Layout.setVerticalGroup(
            Stock_Genset_Panel_Supplier5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Supplier5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        REPORT_6.add(Stock_Genset_Panel_Supplier5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 170, 50));

        All_Stock_Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        All_Stock_Table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                All_Stock_Table2MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(All_Stock_Table2);

        REPORT_6.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 1070, 420));
        REPORT_6.add(ss_id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 150, 30));

        jTextField7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
        });
        REPORT_6.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, 31));

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Search.png"))); // NOI18N
        REPORT_6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 35, 31));

        genset_brand2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "CUMMINS", "ISUZU", "PERKINS", "YANDONG", "OTHER BRAND" }));
        REPORT_6.add(genset_brand2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, 110, 30));

        category2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        category2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL STOCK", "GENERATOR", "PARTS", "WAREHOUSE", "OFFICE" }));
        category2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category2ActionPerformed(evt);
            }
        });
        REPORT_6.add(category2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 180, 30));

        jTextField8.setBackground(new java.awt.Color(255, 204, 153));
        jTextField8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("CATEGORY");
        REPORT_6.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 120, 30));

        JTab.addTab("2", REPORT_6);

        getContentPane().add(JTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 1134, 634));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HOMEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOMEMouseClicked
        Dashboard_Display_1.setForeground(new Color(243,246,26));
        Dashboard_Display_1.setText("HOME");
        Dashboard_Display_2.setText(null);
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(0);
//        Refresh();
    }//GEN-LAST:event_HOMEMouseClicked

    private void HOMEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOMEMouseEntered
//        HOME.setForeground(new Color(41, 61, 61));
        HOME_PANEL.setBackground(new Color(0,147,158));
    }//GEN-LAST:event_HOMEMouseEntered

    private void HOMEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOMEMouseExited
        // TODO add your handling code here:
        HOME.setForeground(new Color(255,255,255));
        HOME_PANEL.setBackground(new Color(0, 117, 128));
    }//GEN-LAST:event_HOMEMouseExited

    private void STOCKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STOCKMouseClicked
        Dashboard_Display_1.setForeground(new Color(243,246,26));
        Dashboard_Display_1.setText("STOCK");
        Dashboard_Display_2.setText(null);
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(1);
        AllTable();
//        Refresh();
    }//GEN-LAST:event_STOCKMouseClicked

    private void STOCKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STOCKMouseEntered
//        STOCK.setForeground(new Color(41, 61, 61));
        STOCK_PANEL.setBackground(new Color(0,137,148));
    }//GEN-LAST:event_STOCKMouseEntered

    private void STOCKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STOCKMouseExited
        STOCK.setForeground(new Color(255,255,255));
        STOCK_PANEL.setBackground(new Color(0, 117, 128));
    }//GEN-LAST:event_STOCKMouseExited

    private void Stock_Genset_ViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_ViewMouseExited
    
        Stock_Genset_Panel_View.setBackground(new Color(66,139,202));
        Stock_Genset_View.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Stock_Genset_ViewMouseExited

    private void Stock_Genset_ViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_ViewMouseEntered
      Stock_Genset_Panel_View.setBackground(new Color(163, 235, 177));
      Stock_Genset_View.setForeground(new Color(33, 21, 34));
     

    }//GEN-LAST:event_Stock_Genset_ViewMouseEntered

    private void Stock_Genset_ViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_ViewMouseClicked
        String Goto = category.getSelectedItem().toString();
        
        if(Stock_cat.equals("")){
            JOptionPane.showMessageDialog(null, "SELECT ITEM ! ","",JOptionPane.ERROR);
        }else if(Stock_cat.equals("GENERATOR")){
           View_Generator ig = new View_Generator();
           ig.setVisible(true);
        }else if(Stock_cat.equals("PARTS")){
           View_Parts ig = new View_Parts();
           ig.setVisible(true);
        }else if(Stock_cat.equals("WAREHOUSE")){
           View_Warehouse ig = new View_Warehouse();
           ig.setVisible(true);
        }else if(Stock_cat.equals("OFFICE")){
           View_Office ig = new View_Office();
           ig.setVisible(true);
        }

    }//GEN-LAST:event_Stock_Genset_ViewMouseClicked

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        DefaultTableModel tm = (DefaultTableModel)All_Stock_Table.getModel();
        String find = jTextField3.getText().toUpperCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
        All_Stock_Table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(find));
    }//GEN-LAST:event_jTextField3KeyPressed

    private void All_Stock_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_All_Stock_TableMouseClicked
        int i=All_Stock_Table.getSelectedRow();
        TableModel model = All_Stock_Table.getModel();
        ss_id.setText(model.getValueAt(i,0).toString());
        Stock_cat = model.getValueAt(i,2).toString();
        as.dispose();
    }//GEN-LAST:event_All_Stock_TableMouseClicked

    private void Stock_Genset_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseExited
        Stock_Genset_Panel_Back.setBackground(new Color(255,173,51));
        Stock_Genset_Back.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Stock_Genset_BackMouseExited

    private void Stock_Genset_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseEntered
        Stock_Genset_Panel_Back.setBackground(new Color(163, 235, 177));
        Stock_Genset_Back.setForeground(new Color(33, 21, 34));
    }//GEN-LAST:event_Stock_Genset_BackMouseEntered

    private void Stock_Genset_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseClicked
        Dashboard_Display_1.setForeground(new Color(243,246,26));
        Dashboard_Display_2.setText(null);
        Dashboard_Display_3.setText(null); 
        JTab.setSelectedIndex(1);
    }//GEN-LAST:event_Stock_Genset_BackMouseClicked

    private void Stock_Genset_SupplierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_SupplierMouseExited
        Stock_Genset_Panel_Supplier.setBackground(new Color(153,153,102));
        Stock_Genset_Supplier.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Stock_Genset_SupplierMouseExited

    private void Stock_Genset_SupplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_SupplierMouseEntered
        Stock_Genset_Panel_Supplier.setBackground(new Color(163, 235, 177));
        Stock_Genset_Supplier.setForeground(new Color(33, 21, 34));
    }//GEN-LAST:event_Stock_Genset_SupplierMouseEntered

    private void Stock_Genset_SupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_SupplierMouseClicked
        Table_Supplier tbs = new Table_Supplier();
    
        tbs.setVisible(true);
    }//GEN-LAST:event_Stock_Genset_SupplierMouseClicked

    private void Stock_Genset_AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_AddMouseExited
        Stock_Genset_Panel_Add.setBackground(new Color(24,165,88));
        Stock_Genset_Add.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Stock_Genset_AddMouseExited

    private void Stock_Genset_AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_AddMouseEntered
       Stock_Genset_Panel_Add.setBackground(new Color(163, 235, 177));
       Stock_Genset_Add.setForeground(new Color(33, 21, 34));
      
       as.setVisible(true);
          
    }//GEN-LAST:event_Stock_Genset_AddMouseEntered

    private void Stock_Genset_AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_AddMouseClicked
//        Insert_Generator iig = new Insert_Generator();
//        iig.setVisible(true);
//        Insert_Generator.Inventory_Display.setText("ADD GENSET PRODUCT");
//        Insert_Generator.Insert_Invetory_Genset_id.setEditable(false);
//        Insert_Generator.Insert_Invetory_Supplier_id.setEditable(false);
//        Insert_Generator.Energized.setVisible(false);
//        Insert_Generator.Panel_Energized.setVisible(false);

    }//GEN-LAST:event_Stock_Genset_AddMouseClicked

    private void Stock_Genset_Supplier1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Supplier1MouseClicked
        
    }//GEN-LAST:event_Stock_Genset_Supplier1MouseClicked

    private void Stock_Genset_Supplier1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Supplier1MouseEntered
        // TODO add your handling code here:
        Stock_Genset_Panel_Supplier1.setBackground(new Color(163, 235, 177));
        Stock_Genset_Supplier1.setForeground(new Color(33, 21, 34));
    }//GEN-LAST:event_Stock_Genset_Supplier1MouseEntered

    private void Stock_Genset_Supplier1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Supplier1MouseExited
        Stock_Genset_Panel_Supplier1.setBackground(new Color(102,153,153));
        Stock_Genset_Supplier1.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Stock_Genset_Supplier1MouseExited

    private void STOCKS_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STOCKS_2MouseEntered
         as.dispose();
    }//GEN-LAST:event_STOCKS_2MouseEntered

    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryActionPerformed
        String Stock_Table = category.getSelectedItem().toString();
        if(Stock_Table.equals("ALL STOCK")){
             ct11.Stocks();
        }else if(Stock_Table.equals("GENERATOR")){
             ct11.Generator();
        }else if(Stock_Table.equals("PARTS")){
             ct11.Parts();
        }else if(Stock_Table.equals("WAREHOUSE")){
             ct11.WareHouse();
        }else if(Stock_Table.equals("OFFICE")){
             ct11.Office();
        } 
    }//GEN-LAST:event_categoryActionPerformed

    private void LOGOUT_LABEL1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUT_LABEL1MouseExited
        LOGOUT_LABEL1.setForeground(new Color(255,255,255));
        LOGOUT_PANEL.setBackground(new Color(0, 117, 128));
    }//GEN-LAST:event_LOGOUT_LABEL1MouseExited

    private void LOGOUT_LABEL1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUT_LABEL1MouseEntered
        //        LOGOUT_LABEL1.setForeground(new Color(41, 61, 61));
        LOGOUT_PANEL.setBackground(new Color(0,137,148));
    }//GEN-LAST:event_LOGOUT_LABEL1MouseEntered

    private void LOGOUT_LABEL1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUT_LABEL1MouseClicked
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LOGOUT_LABEL1MouseClicked

    private void STATUSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STATUSMouseExited
        STATUS.setForeground(new Color(255,255,255));
        STATUS_PANEL.setBackground(new Color(0, 117, 128));
    }//GEN-LAST:event_STATUSMouseExited

    private void STATUSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STATUSMouseEntered
        //        STATUS.setForeground(new Color(41, 61, 61));
        STATUS_PANEL.setBackground(new Color(0,137,148));
    }//GEN-LAST:event_STATUSMouseEntered

    private void STATUSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STATUSMouseClicked
        Dashboard_Display_1.setForeground(new Color(243,246,26));
        Dashboard_Display_1.setText("STATUS");
        Dashboard_Display_2.setText(null);
        Dashboard_Display_3.setText(null);

        //        Refresh();
        JTab.setSelectedIndex(14);
    }//GEN-LAST:event_STATUSMouseClicked

    private void SHOPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHOPMouseExited
        SHOP.setForeground(new Color(255,255,255));
        SHOP_PANEL.setBackground(new Color(0, 117, 128));
    }//GEN-LAST:event_SHOPMouseExited

    private void SHOPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHOPMouseEntered
        //        SHOP.setForeground(new Color(41, 61, 61));
        SHOP_PANEL.setBackground(new Color(0,137,148));
    }//GEN-LAST:event_SHOPMouseEntered

    private void SHOPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHOPMouseClicked
        Dashboard_Display_1.setForeground(new Color(243,246,26));
        Dashboard_Display_1.setText("SALES");
        Dashboard_Display_2.setText(null);
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(3);
        //        Refresh();
    }//GEN-LAST:event_SHOPMouseClicked

    private void SALESMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALESMouseExited
        SALES.setForeground(new Color(255,255,255));
        SALES_PANEL.setBackground(new Color(0, 117, 128));
    }//GEN-LAST:event_SALESMouseExited

    private void SALESMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALESMouseEntered
        //       SALES.setForeground(new Color(41, 61, 61));
        SALES_PANEL.setBackground(new Color(0,137,148));
    }//GEN-LAST:event_SALESMouseEntered

    private void SALESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALESMouseClicked
        Dashboard_Display_1.setForeground(new Color(243,246,26));
        Dashboard_Display_1.setText("SALES");
        Dashboard_Display_2.setText(null);
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(7);
        //        Refresh();
    }//GEN-LAST:event_SALESMouseClicked

    private void Shop_GensetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_GensetMouseExited
//        Shop_Genset_2.setForeground(new Color(255,255,255));
//        ShopFilter_Genset_1.setBackground(new Color(0,117,128));
//        Shop_Genset_3.setBackground(new Color(0,117,128));
    }//GEN-LAST:event_Shop_GensetMouseExited

    private void Shop_GensetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_GensetMouseEntered
//        //        Shop_Genset_2.setForeground(new Color(41, 61, 61));
//        ShopFilter_Genset_1.setBackground(new Color(0,137,148));
//        Shop_Genset_3.setBackground(new Color(0,137,148));
    }//GEN-LAST:event_Shop_GensetMouseEntered

    private void Shop_GensetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_GensetMouseClicked

        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(243,246,26));
        Dashboard_Display_2.setText("SUMMARY OF STOCK");
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(2);
    }//GEN-LAST:event_Shop_GensetMouseClicked

    private void Shop_AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_AddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_AddMouseClicked

    private void Shop_AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_AddMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_AddMouseEntered

    private void Shop_AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_AddMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_AddMouseExited

    private void Shop_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_BackMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_BackMouseClicked

    private void Shop_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_BackMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_BackMouseEntered

    private void Shop_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_BackMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_BackMouseExited

    private void Shop_PrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_PrintMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_PrintMouseClicked

    private void Shop_PrintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_PrintMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_PrintMouseEntered

    private void Shop_PrintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_PrintMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_PrintMouseExited

    private void Sales_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sales_TableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Sales_TableMouseClicked

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5KeyPressed

    private void sales_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sales_categoryActionPerformed
       String Stock_Table = sales_category.getSelectedItem().toString();
        if(Stock_Table.equals("ALL STOCK")){
             ct22.Sales_Stocks();
        }else if(Stock_Table.equals("GENERATOR")){
             ct22.Sales_Generator();
        }else if(Stock_Table.equals("PARTS")){
             ct22.Sales_Parts();
        }else if(Stock_Table.equals("WAREHOUSE")){
             ct22.Sales_WareHouse();
        }else if(Stock_Table.equals("OFFICE")){
             ct22.Sales_Office();
        } 
    }//GEN-LAST:event_sales_categoryActionPerformed

    private void SALES_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALES_4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_SALES_4MouseEntered

    private void Shop_Genset1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset1MouseClicked
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(243,246,26));
        Dashboard_Display_2.setText("SUMMARY OF STOCK");
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(4);
    }//GEN-LAST:event_Shop_Genset1MouseClicked

    private void Shop_Genset1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset1MouseEntered

    private void Shop_Genset1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset1MouseExited

    private void Stock_Genset_Add2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Add2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_Add2MouseClicked

    private void Stock_Genset_Add2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Add2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_Add2MouseEntered

    private void Stock_Genset_Add2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Add2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_Add2MouseExited

    private void Stock_Genset_Supplier4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Supplier4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_Supplier4MouseClicked

    private void Stock_Genset_Supplier4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Supplier4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_Supplier4MouseEntered

    private void Stock_Genset_Supplier4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Supplier4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_Supplier4MouseExited

    private void Stock_Genset_Back2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Back2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_Back2MouseClicked

    private void Stock_Genset_Back2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Back2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_Back2MouseEntered

    private void Stock_Genset_Back2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Back2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_Back2MouseExited

    private void Stock_Genset_View2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_View2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_View2MouseClicked

    private void Stock_Genset_View2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_View2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_View2MouseEntered

    private void Stock_Genset_View2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_View2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_View2MouseExited

    private void Stock_Genset_Supplier5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Supplier5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_Supplier5MouseClicked

    private void Stock_Genset_Supplier5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Supplier5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_Supplier5MouseEntered

    private void Stock_Genset_Supplier5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Supplier5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_Supplier5MouseExited

    private void All_Stock_Table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_All_Stock_Table2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_All_Stock_Table2MouseClicked

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7KeyPressed

    private void category2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_category2ActionPerformed

    private void REPORT_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPORT_6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_REPORT_6MouseEntered

    private void Shop_Genset2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset2MouseClicked

    private void Shop_Genset2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset2MouseEntered

    private void Shop_Genset2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset2MouseExited

    private void Shop_Genset3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset3MouseClicked

    private void Shop_Genset3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset3MouseEntered

    private void Shop_Genset3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset3MouseExited
      
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
    public static javax.swing.JTable All_Stock_Table;
    public static javax.swing.JTable All_Stock_Table2;
    private javax.swing.JPanel DRAWER;
    private javax.swing.JLabel Dashboard_Display_1;
    private javax.swing.JLabel Dashboard_Display_2;
    private javax.swing.JLabel Dashboard_Display_3;
    private javax.swing.JPanel HEADER;
    private javax.swing.JLabel HOME;
    private keeptoo.KGradientPanel HOME_0;
    private javax.swing.JPanel HOME_PANEL;
    public static javax.swing.JLabel Home_Dates;
    private javax.swing.JLabel Home_Time;
    public static javax.swing.JTabbedPane JTab;
    private javax.swing.JLabel LOGOUT_LABEL1;
    private javax.swing.JPanel LOGOUT_PANEL;
    private keeptoo.KGradientPanel REPORT_5;
    private keeptoo.KGradientPanel REPORT_6;
    private javax.swing.JLabel SALES;
    private keeptoo.KGradientPanel SALES_3;
    private keeptoo.KGradientPanel SALES_4;
    private javax.swing.JPanel SALES_PANEL;
    private javax.swing.JLabel SHOP;
    private javax.swing.JPanel SHOP_PANEL;
    private javax.swing.JLabel STATUS;
    private javax.swing.JPanel STATUS_PANEL;
    private javax.swing.JLabel STOCK;
    private keeptoo.KGradientPanel STOCKS_1;
    private keeptoo.KGradientPanel STOCKS_2;
    private javax.swing.JPanel STOCK_PANEL;
    public static javax.swing.JTable Sales_Table;
    private javax.swing.JPanel ShopFilter_Genset_1;
    private javax.swing.JPanel ShopFilter_Genset_2;
    private javax.swing.JPanel ShopFilter_Genset_3;
    private javax.swing.JPanel ShopFilter_Genset_4;
    public static javax.swing.JLabel Shop_Add;
    private javax.swing.JLabel Shop_Back;
    private javax.swing.JLabel Shop_Genset;
    private javax.swing.JLabel Shop_Genset1;
    private javax.swing.JLabel Shop_Genset2;
    private javax.swing.JLabel Shop_Genset3;
    public static javax.swing.JLabel Shop_Print;
    public static javax.swing.JLabel Stock_Genset_Add;
    public static javax.swing.JLabel Stock_Genset_Add2;
    private javax.swing.JLabel Stock_Genset_Back;
    private javax.swing.JLabel Stock_Genset_Back2;
    public static javax.swing.JPanel Stock_Genset_Panel_Add;
    public static javax.swing.JPanel Stock_Genset_Panel_Add1;
    public static javax.swing.JPanel Stock_Genset_Panel_Add2;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Back1;
    public static javax.swing.JPanel Stock_Genset_Panel_Back2;
    public static javax.swing.JPanel Stock_Genset_Panel_Supplier;
    public static javax.swing.JPanel Stock_Genset_Panel_Supplier1;
    public static javax.swing.JPanel Stock_Genset_Panel_Supplier3;
    public static javax.swing.JPanel Stock_Genset_Panel_Supplier4;
    public static javax.swing.JPanel Stock_Genset_Panel_Supplier5;
    public static javax.swing.JPanel Stock_Genset_Panel_View;
    public static javax.swing.JPanel Stock_Genset_Panel_View2;
    public static javax.swing.JLabel Stock_Genset_Supplier;
    public static javax.swing.JLabel Stock_Genset_Supplier1;
    public static javax.swing.JLabel Stock_Genset_Supplier4;
    public static javax.swing.JLabel Stock_Genset_Supplier5;
    public static javax.swing.JLabel Stock_Genset_View;
    public static javax.swing.JLabel Stock_Genset_View2;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JComboBox<String> category2;
    private javax.swing.JLabel fpe_home;
    private javax.swing.JComboBox<String> genset_brand;
    private javax.swing.JComboBox<String> genset_brand1;
    private javax.swing.JComboBox<String> genset_brand2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel pat_back_filter;
    private javax.swing.JLabel pat_back_genset;
    private javax.swing.JComboBox<String> sales_category;
    public static javax.swing.JLabel ss_id;
    public static javax.swing.JLabel ss_id1;
    public static javax.swing.JLabel ss_id2;
    public static javax.swing.JLabel stock_supplier_id;
    // End of variables declaration//GEN-END:variables
}
