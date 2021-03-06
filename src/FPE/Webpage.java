/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;



public class Webpage extends javax.swing.JFrame {
    
    public static String located = "Robles"; // report or print default location path
    public static SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
    public static SimpleDateFormat date = new SimpleDateFormat("MM dd yyyy");
    
     // ----------- ADMIN  ----------------------------------------------
    public static String level="";
    
    // ----------- ADMIN  ----------------------------------------------
    public static String admin_id ;
    
    // ----------- DRAWER ----------------------------------------------
    public static Add_Selection as = new Add_Selection(); 
    public static Add_Drawer_Sale ads = new Add_Drawer_Sale();
    public static Add_Drawer_Reports adr = new Add_Drawer_Reports();
    Add_Drawer_Account ada = new Add_Drawer_Account();
    
    // ----------- STOCK ID ----------------------------------------------
    public static String stock_id = null;
    public static String Stock_cat = null;
    public  static int Stock  = 0;
    
    // ----------- SALES ID ----------------------------------------------
    public static String sales_id = null;
    public  static String Sales_cat = null;
   
    // ----------- CART ID -----------------------------------------------
    public static String cart_id = null;
    public static String Cart_cat = null; 
    
    // ----------- FULLOUT ID --------------------------------------------
    public static String fullout_id = null;
    public static String fullout_cat = null; 
    
    // ----------- PROJECT ID --------------------------------------------
    public static String project_no = ""; 
   
    // ----------- PROJECT ID --------------------------------------------
    public static String request = "";
    
    // ----------- HISTORY ID --------------------------------------------
    

    // ----------- IMAGE ------------------------------------------------
    public static byte[] images = null;
    
    // ----------- CLASS TABLE ------------------------------------------
    String path = "";
    
    public static Class_tables  ct  = new Class_tables();
    public static Class_Amount  a   = new Class_Amount();
    public static Class_fullout f   = new Class_fullout();
    public static Class_Cart    cc  = new Class_Cart();
    public static Class_Graph   cg  = new Class_Graph();
  

    //============end
    public Webpage() {
       initComponents();
       
       level=log.getText();
       Refresh();
      
    }   


    public static void Refresh(){
       
       ct.Stock();
       ct.Sale();
       ct.Cart();
       ct.Fullout();
       ct.project();
       ct.History();
       ct.request();
       ct.project();
       
       ct.Agent();
       a.Amount();
       f.Amount();
       
       cg.DefaultGraph();
//       cg.yandong();
//       cg.yamada();
//       cg.isuzu();
//       cg.weifang();
//       cg.perkins();
       
       showBarChart();
       
       System.out.print("\n");
//       System.out.println(" CUMMINS \t"+cg.cummins);
//       System.out.println(" YANDONG \t"+cg.yandong);
//       System.out.println(" YAMADA \t"+cg.yamada);
//       System.out.println(" ISUZU   \t"+cg.isuzu);
//       System.out.println(" WEIFANG \t"+cg.weifang);
//       System.out.println(" PERKINS \t"+cg.perkins);
       
       
    }

      
    public void Dispose(){
        ads.dispose();
        adr.dispose();
        ada.dispose();
        as.dispose();
    }


    public static void showBarChart(){
       
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(cg.isuzu, "ISUZU", "ISUZU"); 
        dataset.addValue(cg.yandong, "YANDONG", "YANDONG");
        dataset.addValue(cg.perkins, "PERKINS", "PERKINS");
        dataset.addValue(cg.yamada, "YAMADA", "YAMADA");
        dataset.addValue(cg.weifang, "WEIFANG", "WEIFANG");
        dataset.addValue(cg.cummins, "CUMMINS", "CUMMINS");
       
        JFreeChart chart = ChartFactory.createBarChart("GRAPH","BRAND","QUANTITY",dataset, PlotOrientation.VERTICAL, true,true,true);
        
        CategoryPlot categoryPlot = chart.getCategoryPlot();
        categoryPlot.setRangeGridlinePaint(Color.BLUE);
        categoryPlot.setBackgroundPaint(Color.WHITE);
        
        
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        //Color clr3 = new Color(204,0,51);
//        renderer.setSeriesPaint(0, clr3);
        renderer.setSeriesPaint(0, Color.red);
        renderer.setSeriesPaint(1, Color.green);
        renderer.setSeriesPaint(2, Color.blue);
        renderer.setSeriesPaint(3, Color.yellow);
        renderer.setSeriesPaint(4, Color.orange);
        renderer.setSeriesPaint(5, Color.pink);

        renderer.setDrawBarOutline(false);
        renderer.setItemMargin(0);        
     
        
        ChartPanel barpChartPanel = new ChartPanel(chart);
        Generator_Graph.removeAll();
        Generator_Graph.add(barpChartPanel, BorderLayout.CENTER);
        Generator_Graph.validate();
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stock_supplier_id = new javax.swing.JLabel();
        pat_back_filter = new javax.swing.JLabel();
        pat_back_genset = new javax.swing.JLabel();
        HEADER = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        HOME_PANEL = new javax.swing.JPanel();
        HOME = new javax.swing.JLabel();
        STOCK_PANEL = new javax.swing.JPanel();
        STOCK = new javax.swing.JLabel();
        REPORT_PANEL = new javax.swing.JPanel();
        REPORT = new javax.swing.JLabel();
        SALE_PANEL = new javax.swing.JPanel();
        SALE = new javax.swing.JLabel();
        ACCOUNT_PANEL = new javax.swing.JPanel();
        ACCOUNT = new javax.swing.JLabel();
        log = new javax.swing.JLabel();
        HOME_PANEL1 = new javax.swing.JPanel();
        HOME1 = new javax.swing.JLabel();
        JTab = new javax.swing.JTabbedPane();
        HOME_0 = new keeptoo.KGradientPanel();
        fpe_home = new javax.swing.JLabel();
        STOCKS_1 = new keeptoo.KGradientPanel();
        Stock_Genset_Panel_Add = new javax.swing.JPanel();
        Stock_Genset_Add = new javax.swing.JLabel();
        Stock_Genset_Panel_Supplier1 = new javax.swing.JPanel();
        Stock_Genset_AllPrint = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Stock_Table = new javax.swing.JTable();
        Search_Stock = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        Stock_Category = new javax.swing.JComboBox<>();
        jTextField15 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Stock_Genset_Panel_Supplier3 = new javax.swing.JPanel();
        Stock_Genset_Supplier1 = new javax.swing.JLabel();
        SALES_2 = new keeptoo.KGradientPanel();
        Search_Sale = new javax.swing.JTextField();
        Sale_Category = new javax.swing.JComboBox<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        Sales_Table = new javax.swing.JTable();
        process = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        Stock_Genset_Panel_Add5 = new javax.swing.JPanel();
        Shop_Add3 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CART_3 = new keeptoo.KGradientPanel();
        Stock_Genset_Panel_Add4 = new javax.swing.JPanel();
        Shop_Add2 = new javax.swing.JLabel();
        Search_Cart = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        Cart_Table = new javax.swing.JTable();
        process1 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        Stock_Genset_Panel_Add6 = new javax.swing.JPanel();
        Shop_Add4 = new javax.swing.JLabel();
        Cart_Category = new javax.swing.JComboBox<>();
        jTextField19 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        total_amount = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        FULLOUT_4 = new keeptoo.KGradientPanel();
        Stock_Genset_Panel_Add7 = new javax.swing.JPanel();
        Shop_Add5 = new javax.swing.JLabel();
        Search_Fullout = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        FullOut_Table = new javax.swing.JTable();
        process2 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        Stock_Genset_Panel_Add8 = new javax.swing.JPanel();
        Shop_Add6 = new javax.swing.JLabel();
        Fullout_Category = new javax.swing.JComboBox<>();
        jTextField20 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        fullout_amount = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        PROJECT = new keeptoo.KGradientPanel();
        Search_Project = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        project_table = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        Stock_Genset_Panel_Add11 = new javax.swing.JPanel();
        Shop_Add9 = new javax.swing.JLabel();
        REQUEST = new keeptoo.KGradientPanel();
        Search_Request = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        request_table = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        Stock_Genset_Panel_Add14 = new javax.swing.JPanel();
        Shop_Add12 = new javax.swing.JLabel();
        HISTORY = new keeptoo.KGradientPanel();
        Search_History = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        Purchase_Category = new javax.swing.JComboBox<>();
        jScrollPane12 = new javax.swing.JScrollPane();
        History_Table = new javax.swing.JTable();
        jTextField14 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Stock_Genset_Panel_Supplier5 = new javax.swing.JPanel();
        Stock_Genset_Supplier3 = new javax.swing.JLabel();
        Stock_Genset_Panel_Add9 = new javax.swing.JPanel();
        Shop_Add7 = new javax.swing.JLabel();
        Stock_Genset_Panel_Add10 = new javax.swing.JPanel();
        Shop_Add8 = new javax.swing.JLabel();
        STATUS = new keeptoo.KGradientPanel();
        Generator_Graph = new javax.swing.JPanel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        stock_supplier_id.setText("jLabel2");

        pat_back_filter.setText("jLabel5");

        pat_back_genset.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HEADER.setBackground(new java.awt.Color(2, 51, 74));
        HEADER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HEADERMouseEntered(evt);
            }
        });
        HEADER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Logo/Logo.png"))); // NOI18N
        HEADER.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 80));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("FIELD POWER ENTERPRISES");
        HEADER.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 170, 30));

        HOME_PANEL.setBackground(new java.awt.Color(0, 117, 128));

        HOME.setBackground(new java.awt.Color(253, 254, 255));
        HOME.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        HOME.setForeground(new java.awt.Color(255, 255, 255));
        HOME.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HOME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/BAGO/home.png"))); // NOI18N
        HOME.setText("  HOME       ");
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
            .addComponent(HOME, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        HOME_PANELLayout.setVerticalGroup(
            HOME_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HOME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        HEADER.add(HOME_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 180, 60));

        STOCK_PANEL.setBackground(new java.awt.Color(0, 117, 128));

        STOCK.setBackground(new java.awt.Color(253, 254, 255));
        STOCK.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        STOCK.setForeground(new java.awt.Color(255, 255, 255));
        STOCK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        STOCK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/BAGO/stock.png"))); // NOI18N
        STOCK.setText("  STOCK       ");
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
            .addComponent(STOCK, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        STOCK_PANELLayout.setVerticalGroup(
            STOCK_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(STOCK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        HEADER.add(STOCK_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 180, 60));

        REPORT_PANEL.setBackground(new java.awt.Color(0, 117, 128));

        REPORT.setBackground(new java.awt.Color(253, 254, 255));
        REPORT.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        REPORT.setForeground(new java.awt.Color(255, 255, 255));
        REPORT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        REPORT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/BAGO/report.png"))); // NOI18N
        REPORT.setText(" REPORT ???    ");
        REPORT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REPORTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                REPORTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                REPORTMouseExited(evt);
            }
        });

        javax.swing.GroupLayout REPORT_PANELLayout = new javax.swing.GroupLayout(REPORT_PANEL);
        REPORT_PANEL.setLayout(REPORT_PANELLayout);
        REPORT_PANELLayout.setHorizontalGroup(
            REPORT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(REPORT, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        REPORT_PANELLayout.setVerticalGroup(
            REPORT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(REPORT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        HEADER.add(REPORT_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, 180, 60));

        SALE_PANEL.setBackground(new java.awt.Color(0, 117, 128));

        SALE.setBackground(new java.awt.Color(253, 254, 255));
        SALE.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        SALE.setForeground(new java.awt.Color(255, 255, 255));
        SALE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SALE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Drawer_Shop.png"))); // NOI18N
        SALE.setText("  SALE ???     ");
        SALE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SALEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SALEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SALEMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SALE_PANELLayout = new javax.swing.GroupLayout(SALE_PANEL);
        SALE_PANEL.setLayout(SALE_PANELLayout);
        SALE_PANELLayout.setHorizontalGroup(
            SALE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SALE, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        SALE_PANELLayout.setVerticalGroup(
            SALE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SALE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        HEADER.add(SALE_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 180, 60));

        ACCOUNT_PANEL.setBackground(new java.awt.Color(0, 117, 128));

        ACCOUNT.setBackground(new java.awt.Color(253, 254, 255));
        ACCOUNT.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        ACCOUNT.setForeground(new java.awt.Color(255, 255, 255));
        ACCOUNT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ACCOUNT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/BAGO/settings.png"))); // NOI18N
        ACCOUNT.setText(" MANAGE    ");
        ACCOUNT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ACCOUNTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ACCOUNTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ACCOUNTMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ACCOUNT_PANELLayout = new javax.swing.GroupLayout(ACCOUNT_PANEL);
        ACCOUNT_PANEL.setLayout(ACCOUNT_PANELLayout);
        ACCOUNT_PANELLayout.setHorizontalGroup(
            ACCOUNT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ACCOUNT, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        ACCOUNT_PANELLayout.setVerticalGroup(
            ACCOUNT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ACCOUNT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        HEADER.add(ACCOUNT_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 40, 180, 60));

        log.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        log.setForeground(new java.awt.Color(2, 51, 74));
        log.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                logAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        HEADER.add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 50, 30));

        HOME_PANEL1.setBackground(new java.awt.Color(0, 117, 128));

        HOME1.setBackground(new java.awt.Color(253, 254, 255));
        HOME1.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        HOME1.setForeground(new java.awt.Color(255, 255, 255));
        HOME1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HOME1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Drawer_Logout.png"))); // NOI18N
        HOME1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HOME1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HOME1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HOME1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout HOME_PANEL1Layout = new javax.swing.GroupLayout(HOME_PANEL1);
        HOME_PANEL1.setLayout(HOME_PANEL1Layout);
        HOME_PANEL1Layout.setHorizontalGroup(
            HOME_PANEL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HOME1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        HOME_PANEL1Layout.setVerticalGroup(
            HOME_PANEL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HOME1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        HEADER.add(HOME_PANEL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 40, 70, 60));

        getContentPane().add(HEADER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1364, 130));

        JTab.setBackground(new java.awt.Color(255, 255, 255));
        JTab.setEnabled(false);
        JTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JTabMouseEntered(evt);
            }
        });

        HOME_0.setBackground(new java.awt.Color(0, 79, 153));
        HOME_0.setkEndColor(new java.awt.Color(42, 117, 107));
        HOME_0.setkGradientFocus(700);
        HOME_0.setkStartColor(new java.awt.Color(42, 117, 107));
        HOME_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HOME_0MouseEntered(evt);
            }
        });
        HOME_0.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fpe_home.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        fpe_home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fpe_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Logo/Home_logo2.png"))); // NOI18N
        fpe_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fpe_homeMouseEntered(evt);
            }
        });
        HOME_0.add(fpe_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1360, 590));

        JTab.addTab("", HOME_0);

        STOCKS_1.setkEndColor(new java.awt.Color(42, 117, 107));
        STOCKS_1.setkGradientFocus(700);
        STOCKS_1.setkStartColor(new java.awt.Color(42, 117, 107));
        STOCKS_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                STOCKS_1MouseEntered(evt);
            }
        });
        STOCKS_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Stock_Genset_Panel_Add.setBackground(new java.awt.Color(24, 165, 88));

        Stock_Genset_Add.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Stock_Genset_Add.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Select/plus_math_35px.png"))); // NOI18N
        Stock_Genset_Add.setText(" ADD ITEM ???");
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
            .addComponent(Stock_Genset_Add, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_AddLayout.setVerticalGroup(
            Stock_Genset_Panel_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Add, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        STOCKS_1.add(Stock_Genset_Panel_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 180, 45));

        Stock_Genset_Panel_Supplier1.setBackground(new java.awt.Color(102, 153, 153));

        Stock_Genset_AllPrint.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Stock_Genset_AllPrint.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_AllPrint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_AllPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Select/print_35px.png"))); // NOI18N
        Stock_Genset_AllPrint.setText("  PRINT");
        Stock_Genset_AllPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Genset_AllPrintMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Genset_AllPrintMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Genset_AllPrintMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_Supplier1Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_Supplier1);
        Stock_Genset_Panel_Supplier1.setLayout(Stock_Genset_Panel_Supplier1Layout);
        Stock_Genset_Panel_Supplier1Layout.setHorizontalGroup(
            Stock_Genset_Panel_Supplier1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_AllPrint, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Supplier1Layout.setVerticalGroup(
            Stock_Genset_Panel_Supplier1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_AllPrint, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        STOCKS_1.add(Stock_Genset_Panel_Supplier1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 160, 45));

        Stock_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Stock_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_TableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_TableMouseEntered(evt);
            }
        });
        jScrollPane5.setViewportView(Stock_Table);

        STOCKS_1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 1280, 370));

        Search_Stock.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Search_Stock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Search_Stock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Search_StockKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Search_StockKeyReleased(evt);
            }
        });
        STOCKS_1.add(Search_Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 240, 31));

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Search.png"))); // NOI18N
        STOCKS_1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 35, 31));

        Stock_Category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Stock_Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL STOCK", "GENERATOR", "PARTS", "OFFICE", "WAREHOUSE" }));
        Stock_Category.setBorder(null);
        Stock_Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stock_CategoryActionPerformed(evt);
            }
        });
        STOCKS_1.add(Stock_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 200, 31));

        jTextField15.setEditable(false);
        jTextField15.setBackground(new java.awt.Color(148, 184, 184));
        jTextField15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setText("CATEGORY");
        jTextField15.setBorder(null);
        STOCKS_1.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 130, 31));

        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)), " SUMMARY OF STOCK ", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 1, 26), new java.awt.Color(240, 240, 240))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });
        STOCKS_1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1320, 480));

        Stock_Genset_Panel_Supplier3.setBackground(new java.awt.Color(144, 30, 29));

        Stock_Genset_Supplier1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Stock_Genset_Supplier1.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Supplier1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Supplier1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Select/move_stock_30px.png"))); // NOI18N
        Stock_Genset_Supplier1.setText(" FULL OUT LIST");
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

        javax.swing.GroupLayout Stock_Genset_Panel_Supplier3Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_Supplier3);
        Stock_Genset_Panel_Supplier3.setLayout(Stock_Genset_Panel_Supplier3Layout);
        Stock_Genset_Panel_Supplier3Layout.setHorizontalGroup(
            Stock_Genset_Panel_Supplier3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Supplier1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Supplier3Layout.setVerticalGroup(
            Stock_Genset_Panel_Supplier3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Supplier1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        STOCKS_1.add(Stock_Genset_Panel_Supplier3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 200, 45));

        JTab.addTab("", STOCKS_1);

        SALES_2.setkEndColor(new java.awt.Color(42, 117, 107));
        SALES_2.setkGradientFocus(700);
        SALES_2.setkStartColor(new java.awt.Color(42, 117, 107));
        SALES_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SALES_2MouseEntered(evt);
            }
        });
        SALES_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Search_Sale.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Search_Sale.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Search_Sale.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Search_SaleKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Search_SaleKeyReleased(evt);
            }
        });
        SALES_2.add(Search_Sale, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 240, 31));

        Sale_Category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL STOCK", "GENERATOR", "PARTS", "OFFICE" }));
        Sale_Category.setBorder(null);
        Sale_Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sale_CategoryActionPerformed(evt);
            }
        });
        SALES_2.add(Sale_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 200, 31));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Sales_TableMouseEntered(evt);
            }
        });
        jScrollPane8.setViewportView(Sales_Table);

        SALES_2.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 1280, 370));
        SALES_2.add(process, new org.netbeans.lib.awtextra.AbsoluteConstraints(1274, 30, 70, 30));

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Search.png"))); // NOI18N
        SALES_2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 35, 31));

        Stock_Genset_Panel_Add5.setBackground(new java.awt.Color(111, 148, 122));

        Shop_Add3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Shop_Add3.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Add3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Add3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/BAGO/checkout.png"))); // NOI18N
        Shop_Add3.setText(" CHECK OUT    ");
        Shop_Add3.setToolTipText("");
        Shop_Add3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Add3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Add3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Add3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_Add5Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_Add5);
        Stock_Genset_Panel_Add5.setLayout(Stock_Genset_Panel_Add5Layout);
        Stock_Genset_Panel_Add5Layout.setHorizontalGroup(
            Stock_Genset_Panel_Add5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Add5Layout.setVerticalGroup(
            Stock_Genset_Panel_Add5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        SALES_2.add(Stock_Genset_Panel_Add5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 200, 45));

        jTextField18.setEditable(false);
        jTextField18.setBackground(new java.awt.Color(148, 184, 184));
        jTextField18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setText("CATEGORY");
        jTextField18.setBorder(null);
        SALES_2.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 130, 31));

        jLabel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)), " LIST OF SALE ", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 1, 26), new java.awt.Color(240, 240, 240))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
        });
        SALES_2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1320, 480));

        JTab.addTab("", SALES_2);

        CART_3.setkEndColor(new java.awt.Color(42, 117, 107));
        CART_3.setkGradientFocus(700);
        CART_3.setkStartColor(new java.awt.Color(42, 117, 107));
        CART_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CART_3MouseEntered(evt);
            }
        });
        CART_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Stock_Genset_Panel_Add4.setBackground(new java.awt.Color(24, 165, 88));

        Shop_Add2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Shop_Add2.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Add2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Add2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/BAGO/purchase_orderpx.png"))); // NOI18N
        Shop_Add2.setText(" PLACE ORDER");
        Shop_Add2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Add2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Add2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Add2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_Add4Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_Add4);
        Stock_Genset_Panel_Add4.setLayout(Stock_Genset_Panel_Add4Layout);
        Stock_Genset_Panel_Add4Layout.setHorizontalGroup(
            Stock_Genset_Panel_Add4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Add4Layout.setVerticalGroup(
            Stock_Genset_Panel_Add4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        CART_3.add(Stock_Genset_Panel_Add4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 200, 45));

        Search_Cart.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Search_Cart.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Search_Cart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Search_CartKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Search_CartKeyReleased(evt);
            }
        });
        CART_3.add(Search_Cart, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 240, 31));

        Cart_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Cart_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cart_TableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Cart_TableMouseEntered(evt);
            }
        });
        jScrollPane9.setViewportView(Cart_Table);

        CART_3.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 1280, 370));
        CART_3.add(process1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1274, 30, 70, 30));

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Search.png"))); // NOI18N
        CART_3.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 35, 31));

        Stock_Genset_Panel_Add6.setBackground(new java.awt.Color(131, 81, 81));

        Shop_Add4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Shop_Add4.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Add4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Add4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/BAGO/back.png"))); // NOI18N
        Shop_Add4.setText(" BACK");
        Shop_Add4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Add4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Add4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Add4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_Add6Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_Add6);
        Stock_Genset_Panel_Add6.setLayout(Stock_Genset_Panel_Add6Layout);
        Stock_Genset_Panel_Add6Layout.setHorizontalGroup(
            Stock_Genset_Panel_Add6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add4, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Add6Layout.setVerticalGroup(
            Stock_Genset_Panel_Add6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add4, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        CART_3.add(Stock_Genset_Panel_Add6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, 160, -1));

        Cart_Category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Cart_Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL STOCK", "GENERATOR", "PARTS", "OFFICE" }));
        Cart_Category.setBorder(null);
        Cart_Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cart_CategoryActionPerformed(evt);
            }
        });
        CART_3.add(Cart_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 200, 31));

        jTextField19.setEditable(false);
        jTextField19.setBackground(new java.awt.Color(148, 184, 184));
        jTextField19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setText("CATEGORY");
        jTextField19.setBorder(null);
        CART_3.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 130, 31));

        jLabel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)), " CART ", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 1, 26), new java.awt.Color(240, 240, 240))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
        });
        CART_3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1320, 480));

        total_amount.setBackground(new java.awt.Color(220, 220, 200));
        total_amount.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        total_amount.setForeground(new java.awt.Color(51, 51, 51));
        total_amount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total_amount.setBorder(null);
        total_amount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                total_amountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                total_amountMouseExited(evt);
            }
        });
        CART_3.add(total_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 520, 260, 40));

        jTextField29.setEditable(false);
        jTextField29.setBackground(new java.awt.Color(255, 255, 153));
        jTextField29.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField29.setForeground(new java.awt.Color(51, 51, 51));
        jTextField29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField29.setText("TOTAL AMOUNT :");
        jTextField29.setBorder(null);
        jTextField29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField29MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField29MouseExited(evt);
            }
        });
        CART_3.add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 520, 200, 40));

        JTab.addTab("", CART_3);

        FULLOUT_4.setkEndColor(new java.awt.Color(42, 117, 107));
        FULLOUT_4.setkGradientFocus(700);
        FULLOUT_4.setkStartColor(new java.awt.Color(42, 117, 107));
        FULLOUT_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FULLOUT_4MouseEntered(evt);
            }
        });
        FULLOUT_4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Stock_Genset_Panel_Add7.setBackground(new java.awt.Color(153, 153, 102));

        Shop_Add5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Shop_Add5.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Add5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Add5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/BAGO/purchase_orderpx.png"))); // NOI18N
        Shop_Add5.setText(" PLACE ORDER");
        Shop_Add5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Add5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Add5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Add5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_Add7Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_Add7);
        Stock_Genset_Panel_Add7.setLayout(Stock_Genset_Panel_Add7Layout);
        Stock_Genset_Panel_Add7Layout.setHorizontalGroup(
            Stock_Genset_Panel_Add7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add5, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Add7Layout.setVerticalGroup(
            Stock_Genset_Panel_Add7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add5, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        FULLOUT_4.add(Stock_Genset_Panel_Add7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 200, 45));

        Search_Fullout.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Search_Fullout.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Search_Fullout.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Search_FulloutKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Search_FulloutKeyReleased(evt);
            }
        });
        FULLOUT_4.add(Search_Fullout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 240, 31));

        FullOut_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        FullOut_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FullOut_TableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FullOut_TableMouseEntered(evt);
            }
        });
        jScrollPane10.setViewportView(FullOut_Table);

        FULLOUT_4.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 1280, 370));
        FULLOUT_4.add(process2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1274, 30, 70, 30));

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Search.png"))); // NOI18N
        FULLOUT_4.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 35, 31));

        Stock_Genset_Panel_Add8.setBackground(new java.awt.Color(131, 81, 81));

        Shop_Add6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Shop_Add6.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Add6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Add6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/BAGO/back.png"))); // NOI18N
        Shop_Add6.setText(" BACK");
        Shop_Add6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Add6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Add6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Add6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_Add8Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_Add8);
        Stock_Genset_Panel_Add8.setLayout(Stock_Genset_Panel_Add8Layout);
        Stock_Genset_Panel_Add8Layout.setHorizontalGroup(
            Stock_Genset_Panel_Add8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Stock_Genset_Panel_Add8Layout.createSequentialGroup()
                .addComponent(Shop_Add6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Stock_Genset_Panel_Add8Layout.setVerticalGroup(
            Stock_Genset_Panel_Add8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add6, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        FULLOUT_4.add(Stock_Genset_Panel_Add8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, 160, -1));

        Fullout_Category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Fullout_Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL STOCK", "PARTS", "OFFICE", "WAREHOUSE" }));
        Fullout_Category.setBorder(null);
        Fullout_Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fullout_CategoryActionPerformed(evt);
            }
        });
        FULLOUT_4.add(Fullout_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 200, 31));

        jTextField20.setEditable(false);
        jTextField20.setBackground(new java.awt.Color(148, 184, 184));
        jTextField20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setText("CATEGORY");
        FULLOUT_4.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 130, 31));

        jLabel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)), " FULL OUT LIST ", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 1, 26), new java.awt.Color(240, 240, 240))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
        });
        FULLOUT_4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1320, 480));

        fullout_amount.setBackground(new java.awt.Color(220, 220, 200));
        fullout_amount.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        fullout_amount.setForeground(new java.awt.Color(51, 51, 51));
        fullout_amount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fullout_amount.setBorder(null);
        fullout_amount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fullout_amountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fullout_amountMouseExited(evt);
            }
        });
        FULLOUT_4.add(fullout_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 520, 260, 40));

        jTextField30.setEditable(false);
        jTextField30.setBackground(new java.awt.Color(255, 255, 153));
        jTextField30.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField30.setForeground(new java.awt.Color(51, 51, 51));
        jTextField30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField30.setText("TOTAL AMOUNT :");
        jTextField30.setBorder(null);
        jTextField30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField30MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField30MouseExited(evt);
            }
        });
        FULLOUT_4.add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 520, 200, 40));

        JTab.addTab("", FULLOUT_4);

        PROJECT.setBackground(new java.awt.Color(0, 79, 153));
        PROJECT.setkEndColor(new java.awt.Color(42, 117, 107));
        PROJECT.setkGradientFocus(700);
        PROJECT.setkStartColor(new java.awt.Color(42, 117, 107));
        PROJECT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PROJECTMouseEntered(evt);
            }
        });
        PROJECT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Search_Project.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Search_Project.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Search_Project.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Search_ProjectKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Search_ProjectKeyReleased(evt);
            }
        });
        PROJECT.add(Search_Project, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 240, 31));

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Search.png"))); // NOI18N
        PROJECT.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 35, 31));

        project_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        project_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                project_tableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                project_tableMouseEntered(evt);
            }
        });
        jScrollPane13.setViewportView(project_table);

        PROJECT.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 1280, 370));

        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)), " SUMMARY OF PROJECT ", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 1, 26), new java.awt.Color(240, 240, 240))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
        });
        PROJECT.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1320, 480));

        Stock_Genset_Panel_Add11.setBackground(new java.awt.Color(102, 153, 153));

        Shop_Add9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Shop_Add9.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Add9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Add9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/BAGO/print_30px.png"))); // NOI18N
        Shop_Add9.setText(" PRINT");
        Shop_Add9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Add9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Add9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Add9MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_Add11Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_Add11);
        Stock_Genset_Panel_Add11.setLayout(Stock_Genset_Panel_Add11Layout);
        Stock_Genset_Panel_Add11Layout.setHorizontalGroup(
            Stock_Genset_Panel_Add11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add9, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Add11Layout.setVerticalGroup(
            Stock_Genset_Panel_Add11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add9, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        PROJECT.add(Stock_Genset_Panel_Add11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 160, -1));

        JTab.addTab("", PROJECT);

        REQUEST.setBackground(new java.awt.Color(0, 79, 153));
        REQUEST.setkEndColor(new java.awt.Color(42, 117, 107));
        REQUEST.setkGradientFocus(700);
        REQUEST.setkStartColor(new java.awt.Color(42, 117, 107));
        REQUEST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                REQUESTMouseEntered(evt);
            }
        });
        REQUEST.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Search_Request.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Search_Request.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Search_Request.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Search_RequestKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Search_RequestKeyReleased(evt);
            }
        });
        REQUEST.add(Search_Request, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 240, 31));

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Search.png"))); // NOI18N
        REQUEST.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 35, 31));

        request_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        request_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                request_tableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                request_tableMouseEntered(evt);
            }
        });
        jScrollPane14.setViewportView(request_table);

        REQUEST.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 1280, 370));

        jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)), " SUMMARY OF REQUEST ", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 1, 26), new java.awt.Color(240, 240, 240))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
        });
        REQUEST.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1320, 480));

        Stock_Genset_Panel_Add14.setBackground(new java.awt.Color(102, 153, 153));

        Shop_Add12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Shop_Add12.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Add12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Add12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/BAGO/print_30px.png"))); // NOI18N
        Shop_Add12.setText(" PRINT");
        Shop_Add12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Add12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Add12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Add12MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_Add14Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_Add14);
        Stock_Genset_Panel_Add14.setLayout(Stock_Genset_Panel_Add14Layout);
        Stock_Genset_Panel_Add14Layout.setHorizontalGroup(
            Stock_Genset_Panel_Add14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add12, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Add14Layout.setVerticalGroup(
            Stock_Genset_Panel_Add14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add12, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        REQUEST.add(Stock_Genset_Panel_Add14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 160, -1));

        JTab.addTab("", REQUEST);

        HISTORY.setBackground(new java.awt.Color(0, 79, 153));
        HISTORY.setkEndColor(new java.awt.Color(42, 117, 107));
        HISTORY.setkGradientFocus(700);
        HISTORY.setkStartColor(new java.awt.Color(42, 117, 107));
        HISTORY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HISTORYMouseEntered(evt);
            }
        });
        HISTORY.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Search_History.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Search_History.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Search_History.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Search_HistoryKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Search_HistoryKeyReleased(evt);
            }
        });
        HISTORY.add(Search_History, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 240, 31));

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Search.png"))); // NOI18N
        HISTORY.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 35, 31));

        Purchase_Category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Purchase_Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL STOCK", "WAREHOUSE", "CATEGORY" }));
        Purchase_Category.setBorder(null);
        Purchase_Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Purchase_CategoryActionPerformed(evt);
            }
        });
        HISTORY.add(Purchase_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 200, 31));

        History_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        History_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                History_TableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                History_TableMouseEntered(evt);
            }
        });
        jScrollPane12.setViewportView(History_Table);

        HISTORY.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 1280, 370));

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(148, 184, 184));
        jTextField14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("CATEGORY");
        jTextField14.setBorder(null);
        HISTORY.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 130, 31));

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)), " HISTORY ", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 1, 26), new java.awt.Color(240, 240, 240))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
        });
        HISTORY.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1320, 480));

        Stock_Genset_Panel_Supplier5.setBackground(new java.awt.Color(153, 153, 102));

        Stock_Genset_Supplier3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Stock_Genset_Supplier3.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Supplier3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Supplier3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/BAGO/balance.png"))); // NOI18N
        Stock_Genset_Supplier3.setText(" BALANCE");
        Stock_Genset_Supplier3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Genset_Supplier3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Genset_Supplier3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Genset_Supplier3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_Supplier5Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_Supplier5);
        Stock_Genset_Panel_Supplier5.setLayout(Stock_Genset_Panel_Supplier5Layout);
        Stock_Genset_Panel_Supplier5Layout.setHorizontalGroup(
            Stock_Genset_Panel_Supplier5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Supplier3, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Supplier5Layout.setVerticalGroup(
            Stock_Genset_Panel_Supplier5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Supplier3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        HISTORY.add(Stock_Genset_Panel_Supplier5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 160, 45));

        Stock_Genset_Panel_Add9.setBackground(new java.awt.Color(102, 153, 153));

        Shop_Add7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Shop_Add7.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Add7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Add7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/BAGO/print_30px.png"))); // NOI18N
        Shop_Add7.setText(" PRINT ");
        Shop_Add7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Add7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Add7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Add7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_Add9Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_Add9);
        Stock_Genset_Panel_Add9.setLayout(Stock_Genset_Panel_Add9Layout);
        Stock_Genset_Panel_Add9Layout.setHorizontalGroup(
            Stock_Genset_Panel_Add9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add7, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Add9Layout.setVerticalGroup(
            Stock_Genset_Panel_Add9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add7, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        HISTORY.add(Stock_Genset_Panel_Add9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 160, -1));

        Stock_Genset_Panel_Add10.setBackground(new java.awt.Color(131, 81, 81));

        Shop_Add8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Shop_Add8.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Add8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Add8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/BAGO/back.png"))); // NOI18N
        Shop_Add8.setText(" BACK ");
        Shop_Add8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Add8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Add8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Add8MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_Add10Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_Add10);
        Stock_Genset_Panel_Add10.setLayout(Stock_Genset_Panel_Add10Layout);
        Stock_Genset_Panel_Add10Layout.setHorizontalGroup(
            Stock_Genset_Panel_Add10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add8, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Add10Layout.setVerticalGroup(
            Stock_Genset_Panel_Add10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add8, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        HISTORY.add(Stock_Genset_Panel_Add10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 160, -1));

        JTab.addTab("", HISTORY);

        STATUS.setBackground(new java.awt.Color(0, 79, 153));
        STATUS.setkEndColor(new java.awt.Color(42, 117, 107));
        STATUS.setkGradientFocus(700);
        STATUS.setkStartColor(new java.awt.Color(42, 117, 107));
        STATUS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                STATUSMouseEntered(evt);
            }
        });
        STATUS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Generator_Graph.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Generator_GraphMouseEntered(evt);
            }
        });
        Generator_Graph.setLayout(new java.awt.BorderLayout());
        STATUS.add(Generator_Graph, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 1290, 430));

        jFormattedTextField1.setBorder(null);
        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("   ##    /    ##    /    ##   ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        STATUS.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 200, 30));

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Search.png"))); // NOI18N
        STATUS.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 35, 31));

        jLabel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)), " STATUS OF SALE ", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 1, 26), new java.awt.Color(240, 240, 240))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
        });
        STATUS.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1320, 550));

        JTab.addTab("", STATUS);

        getContentPane().add(JTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 94, 1370, 630));

        setSize(new java.awt.Dimension(1361, 724));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Search_StockKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_StockKeyPressed
    
    }//GEN-LAST:event_Search_StockKeyPressed

    private void Stock_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_TableMouseClicked
        
    int i=Stock_Table.getSelectedRow();
    TableModel model = Stock_Table.getModel();

    stock_id = model.getValueAt(i,0).toString();
    Stock_cat = model.getValueAt(i,1).toString();
    as.dispose();
    
    if(log.getText().equals("ADMIN"))
    {
        
        String[] options = new String[2];
        options[0] = (" VIEW ITEM    ");
        options[1] = (" FULLOUT ITEM ");
        int opt = JOptionPane.showOptionDialog(null," DO YOU WANT TO ",null,0,JOptionPane.UNDEFINED_CONDITION,null,options,null);
        
        if(opt == 0)
        {
        if(Stock_cat.equals("GENERATOR")){
            
            View_Generator vg = new View_Generator();
            vg.setVisible(true); 
            
            
        }
        else if(Stock_cat.equals("PARTS"))
        {
             View_Parts vp = new View_Parts();
             vp.setVisible(true);
        }
        else if(Stock_cat.equals("OFFICE"))
        {
             View_Office vo = new View_Office();
             vo.setVisible(true);
        }
        else if(Stock_cat.equals("WAREHOUSE"))
        {
             View_Warehouse vw = new View_Warehouse();
             vw.setVisible(true);
        }
    } 
    else if(opt == 1)
    {
        if(Stock_cat.equals("PARTS")){
             Fullout_Parts fp = new Fullout_Parts();
             fp.setVisible(true);
        }else if(Stock_cat.equals("OFFICE")){
             Fullout_Office fo = new Fullout_Office();               
             fo.setVisible(true);
        }else if(Stock_cat.equals("WAREHOUSE")){
             Fullout_Warehouse fw = new Fullout_Warehouse();
             fw.setVisible(true);
        }else if(Stock_cat.equals("GENERATOR")){
             JOptionPane.showMessageDialog(null, "THIS ITEM IS CANNOT TO FULLOUT"," ACTION DENIED !",JOptionPane.UNDEFINED_CONDITION);
        }
    }

    }
    else if(log.getText().equals("STAFF"))
    {
        if(Stock_cat.equals("PARTS")){
             Fullout_Parts fp = new Fullout_Parts();
             fp.setVisible(true);
        }else if(Stock_cat.equals("OFFICE")){
             Fullout_Office fo = new Fullout_Office();               
             fo.setVisible(true);
        }else if(Stock_cat.equals("WAREHOUSE")){
             Fullout_Warehouse fw = new Fullout_Warehouse();
             fw.setVisible(true);
        }else if(Stock_cat.equals("GENERATOR")){
             JOptionPane.showMessageDialog(null, "THIS ITEM IS CANNOT TO FULLOUT"," ACTION DENIED !",JOptionPane.UNDEFINED_CONDITION);
        }
    }
         
    }//GEN-LAST:event_Stock_TableMouseClicked

    private void Stock_Genset_AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_AddMouseExited
        Stock_Genset_Panel_Add.setBackground(new Color(24,165,88));
        Stock_Genset_Add.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Stock_Genset_AddMouseExited

    private void Stock_Genset_AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_AddMouseEntered
       Stock_Genset_Panel_Add.setBackground(new Color(163, 235, 177));
       Stock_Genset_Add.setForeground(new Color(33, 21, 34));
      
       
          
    }//GEN-LAST:event_Stock_Genset_AddMouseEntered

    private void Stock_Genset_AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_AddMouseClicked
       if(log.getText().equals("STAFF"))
       {
          ads.setVisible(false); JOptionPane.showMessageDialog(null,null," ONLY ADMIN CAN ACCESS THIS ",JOptionPane.UNDEFINED_CONDITION);
       }else
       {
           as.setVisible(true);
       }
        

    }//GEN-LAST:event_Stock_Genset_AddMouseClicked

    private void Stock_Genset_AllPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_AllPrintMouseClicked
    
        String print[] = new String[2]; 
        print[0] = " PRINT ";
        print[1] = " NO    ";
        int prnt = JOptionPane.showOptionDialog(null," DO YOU WANT TO PRINT THE STOCK ?",null, 0,JOptionPane.UNDEFINED_CONDITION,null,print,null);
        if(prnt == 0)
        {
           try{
          DefaultTableModel tablemodel =(DefaultTableModel) Stock_Table.getModel();
          HashMap<String, Object> params = new HashMap<String, Object>();
          BufferedImage image = ImageIO.read(getClass().getResource("logo.png"));
          params.put("logo", image );
          //JasperPrint jasperPrint = null;
          JasperCompileManager.compileReportToFile("C:\\Users\\"+located+"\\Documents\\NetBeansProjects\\FieldPowerEnterprises\\src\\FPE\\stock_table.jrxml");
          JasperPrint jasperPrint = JasperFillManager.fillReport("C:\\Users\\"+located+"\\Documents\\NetBeansProjects\\FieldPowerEnterprises\\src\\FPE\\stock_table.jasper", params, new JRTableModelDataSource(tablemodel));
          JasperViewer.viewReport(jasperPrint, false);
        }
        catch(Exception e){
            e.printStackTrace();
        } 
        }
        
    }//GEN-LAST:event_Stock_Genset_AllPrintMouseClicked

    private void Stock_Genset_AllPrintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_AllPrintMouseEntered
        // TODO add your handling code here:
        Stock_Genset_Panel_Supplier1.setBackground(new Color(163, 235, 177));
        Stock_Genset_AllPrint.setForeground(new Color(33, 21, 34));
    }//GEN-LAST:event_Stock_Genset_AllPrintMouseEntered

    private void Stock_Genset_AllPrintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_AllPrintMouseExited
        Stock_Genset_Panel_Supplier1.setBackground(new Color(102,153,153));
        Stock_Genset_AllPrint.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Stock_Genset_AllPrintMouseExited

    private void STOCKS_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STOCKS_1MouseEntered
         
         Dispose();
    }//GEN-LAST:event_STOCKS_1MouseEntered

    private void Search_SaleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_SaleKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_SaleKeyPressed

    private void Sale_CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sale_CategoryActionPerformed
       String Sake_Table = Sale_Category.getSelectedItem().toString();
       
       if(Sake_Table.equals("ALL STOCK")){
             ct.Sale();
        }else if(Sake_Table.equals("GENERATOR")){
             ct.Sale_Generator();
        }else if(Sake_Table.equals("PARTS")){
             ct.Sale_Parts();
        }else if(Sake_Table.equals("OFFICE")){
             ct.Sale_Office();
        }
       
    }//GEN-LAST:event_Sale_CategoryActionPerformed

    private void SALES_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALES_2MouseEntered
        Dispose();
    }//GEN-LAST:event_SALES_2MouseEntered

    private void STOCKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STOCKMouseClicked
        JTab.setSelectedIndex(1);
        ct.Stock();
    }//GEN-LAST:event_STOCKMouseClicked

    private void STOCKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STOCKMouseEntered
        STOCK_PANEL.setBackground(new Color(163, 235, 177));
        STOCK.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_STOCKMouseEntered

    private void STOCKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STOCKMouseExited
        // TODO add your handling code here:
        STOCK.setForeground(new Color(255,255,255));
        STOCK_PANEL.setBackground(new Color(0, 117, 128));
        
    }//GEN-LAST:event_STOCKMouseExited

    private void HOMEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOMEMouseClicked
        JTab.setSelectedIndex(0);
    }//GEN-LAST:event_HOMEMouseClicked

    private void HOMEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOMEMouseEntered
        HOME_PANEL.setBackground(new Color(163, 235, 177));
        HOME.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_HOMEMouseEntered

    private void HOMEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOMEMouseExited
        HOME_PANEL.setBackground(new Color(0,117,128));
        HOME.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_HOMEMouseExited

    private void REPORTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPORTMouseClicked
         if(log.getText().equals("ADMIN"))
        {
            adr.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"STAFF CAN'T ACCESS THIS ",null,JOptionPane.UNDEFINED_CONDITION);
        }
    }//GEN-LAST:event_REPORTMouseClicked

    private void REPORTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPORTMouseEntered
        REPORT_PANEL.setBackground(new Color(163, 235, 177));
        REPORT.setForeground(new Color(51,51,51));
        
    }//GEN-LAST:event_REPORTMouseEntered

    private void REPORTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPORTMouseExited
        REPORT_PANEL.setBackground(new Color(0,117,128));
        REPORT.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_REPORTMouseExited

    private void SALEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALEMouseClicked
//       new Class_tables().SalesStock();
//       JTab.setSelectedIndex(2);
       ads.setVisible(true);
    }//GEN-LAST:event_SALEMouseClicked

    private void SALEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALEMouseEntered
        SALE_PANEL.setBackground(new Color(163, 235, 177));
        SALE.setForeground(new Color(51,51,51));
        
        
    }//GEN-LAST:event_SALEMouseEntered

    private void SALEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALEMouseExited
        SALE_PANEL.setBackground(new Color(0,117,128));
        SALE.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_SALEMouseExited

    private void ACCOUNTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACCOUNTMouseClicked
         if(log.getText().equals("ADMIN"))
        {
            ada.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"STAFF CAN'T ACCESS THIS ",null,JOptionPane.UNDEFINED_CONDITION);
        }
    }//GEN-LAST:event_ACCOUNTMouseClicked

    private void ACCOUNTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACCOUNTMouseEntered
        ACCOUNT_PANEL.setBackground(new Color(163, 235, 177));
        ACCOUNT.setForeground(new Color(51,51,51));
        
       
        
    }//GEN-LAST:event_ACCOUNTMouseEntered

    private void ACCOUNTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACCOUNTMouseExited
        ACCOUNT_PANEL.setBackground(new Color(0,117,128));
        ACCOUNT.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_ACCOUNTMouseExited

    private void Sales_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sales_TableMouseClicked
        int i=Sales_Table.getSelectedRow();
        TableModel model = Sales_Table.getModel();
        sales_id = model.getValueAt(i,0).toString();
        Sales_cat = model.getValueAt(i,1).toString();
        
        if(Sales_cat.equals("GENERATOR")){
            Sales_Stock_1 ss = new Sales_Stock_1();
         
            ss.setVisible(true);
            
        }else if(Sales_cat.equals("PARTS")){
             Sale_Parts sp = new Sale_Parts();
            
             sp.setVisible(true);
        }else if(Sales_cat.equals("OFFICE")){
             Sale_Office so = new Sale_Office();
          
             so.setVisible(true);
        }
        
    }//GEN-LAST:event_Sales_TableMouseClicked

    private void Stock_TableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_TableMouseEntered
        as.dispose();
        Dispose();
    }//GEN-LAST:event_Stock_TableMouseEntered

    private void Shop_Add2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add2MouseClicked
       
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, `SUPPLIER PRICE`, `SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`, `ENGINE S.N`, `ALTERNATOR S.N`, `SUPPLIER ID`, `DATE INBOUND`, `DATE OUTBOUND`, `IMAGE`, `INCHARGE`, `REMARKS`, `PROCESS`, `VERIFY` FROM `cart_table`");
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            AddCart ac = new AddCart();
            ac.setVisible(true);
            AddCart.total_amount.setText(total_amount.getText());
        }else{
           JOptionPane.showMessageDialog(null, "EMPTY CART!","",JOptionPane.ERROR_MESSAGE);
        }
        }catch(Exception e){
              //System.out.println(e);
        }       

    }//GEN-LAST:event_Shop_Add2MouseClicked

    private void Shop_Add2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add2MouseEntered
        Stock_Genset_Panel_Add4.setBackground(new Color(163, 235, 177));
        Shop_Add2.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_Shop_Add2MouseEntered

    private void Shop_Add2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add2MouseExited
        // TODO add your handling code here:[24,165,88]
        Stock_Genset_Panel_Add4.setBackground(new Color(24,165,88));
        Shop_Add2.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Shop_Add2MouseExited

    private void Search_CartKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_CartKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_CartKeyPressed

    private void Cart_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cart_TableMouseClicked
int i=Cart_Table.getSelectedRow();
        TableModel model = Cart_Table.getModel();
        cart_id = model.getValueAt(i,0).toString();
        Cart_cat = model.getValueAt(i,1).toString();
        
        
        if(Cart_cat.equals("GENERATOR")){
            Sales_Stock_1 ss = new Sales_Stock_1();
            ss.setVisible(true);
            Sales_Stock_1.Sale_Generator_Display.setText("REMOVE GENERATOR");
            Sales_Stock_1.Panel_View_Btn.setBackground(new Color(255,128,128));
            Sales_Stock_1.Sale_Btn.setText(" REMOVE");
            
        }else if(Cart_cat.equals("PARTS")){
             Sale_Parts sp = new Sale_Parts();
             sp.setVisible(true);
             Sale_Parts.Sale_Parts_Display.setText("REMOVE PARTS");
             Sale_Parts.Stock_Genset_Panel_Update.setBackground(new Color(255,128,128));
             Sale_Parts.Stock_Genset_Update.setText(" REMOVE");
        }else if(Cart_cat.equals("OFFICE")){
             Sale_Office so = new Sale_Office();
             so.setVisible(true);
             Sale_Office.Sale_Office_Display.setText("REMOVE OFFICE");
             Sale_Office.Stock_Genset_Panel_Update.setBackground(new Color(255,128,128));
             Sale_Office.Stock_Genset_Update.setText(" REMOVE");
        }
    }//GEN-LAST:event_Cart_TableMouseClicked

    private void CART_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CART_3MouseEntered
        Dispose();
        
    }//GEN-LAST:event_CART_3MouseEntered

    private void Shop_Add3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add3MouseClicked
        JTab.setSelectedIndex(3);
    }//GEN-LAST:event_Shop_Add3MouseClicked

    private void Shop_Add3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add3MouseEntered
        // TODO add your handling code here:
        Stock_Genset_Panel_Add5.setBackground(new Color(163, 235, 177));
        Shop_Add3.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_Shop_Add3MouseEntered

    private void Shop_Add3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add3MouseExited
        Stock_Genset_Panel_Add5.setBackground(new Color(111,148,122));
        Shop_Add3.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Shop_Add3MouseExited

    private void Shop_Add4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add4MouseClicked
//         AllTable();
//         ct.SalesStock();
        JTab.setSelectedIndex(2);
       
    }//GEN-LAST:event_Shop_Add4MouseClicked

    private void Shop_Add4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add4MouseEntered
        // TODO add your handling code here:
        Stock_Genset_Panel_Add6.setBackground(new Color(163, 235, 177));
        Shop_Add4.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_Shop_Add4MouseEntered

    private void Shop_Add4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add4MouseExited
        // TODO add your handling code here:185,144,149
        Stock_Genset_Panel_Add6.setBackground(new Color(131,81,81));
        Shop_Add4.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Shop_Add4MouseExited

    private void Cart_CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cart_CategoryActionPerformed
       String cart_car = Cart_Category.getSelectedItem().toString();
       if(cart_car.equals("ALL STOCK")){
          ct.Cart();
       }else if(cart_car.equals("GENERATOR")){
          ct.Cart_Generator();
       }else if(cart_car.equals("PARTS")){
          ct.Cart_Parts();  
       }else if(cart_car.equals("OFFICE")){
          ct.Cart_Office();  
       }
    }//GEN-LAST:event_Cart_CategoryActionPerformed

    private void Search_StockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_StockKeyReleased

    DefaultTableModel tm = (DefaultTableModel)Stock_Table.getModel();
    String find = Search_Stock.getText().toUpperCase();
    TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
    Stock_Table.setRowSorter(tr);
    tr.setRowFilter(RowFilter.regexFilter(find));
//        Stock_Category.setSelectedIndex(0);
//        PreparedStatement ps = null;
//        ResultSet rs = null;
//        try{
//        //String sql = "SELECT `STOCK ID`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, FORMAT(`SELLER PRICE`, '#,##0.00') AS `SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`, `ENGINE S.N`, `ALTERNATOR S.N`, `DATE INBOUND`, `INCHARGE`, `REMARKS` FROM `stock_table` WHERE `STOCK ID` LIKE '%"+searched_all_stock.getText()+"%' OR `CATEGORY` LIKE '%"+searched_all_stock.getText()+"%' OR `BRAND` LIKE '%"+searched_all_stock.getText()+"%' OR `MODEL` LIKE '%"+searched_all_stock.getText()+"%' OR  `KVA` LIKE '%"+searched_all_stock.getText()+"%' OR `PHASING` LIKE '%"+searched_all_stock.getText()+"%' OR `TYPE` LIKE '%"+searched_all_stock.getText()+"%' OR `SELLER PRICE` LIKE '%"+searched_all_stock.getText()+"%' OR `QUANTITY` LIKE '%"+searched_all_stock.getText()+"%' OR `TOTAL PRICE` LIKE '%"+searched_all_stock.getText()+"%' OR `ENGINE S.N` LIKE '%"+searched_all_stock.getText()+"%' OR `ALTERNATOR S.N` OR `DATE INBOUND` LIKE '%"+searched_all_stock.getText()+"%' OR `INCHARGE` LIKE '%"+searched_all_stock.getText()+"%' OR `REMARKS` LIKE '%"+searched_all_stock.getText()+"%' ";
//        String sql = "SELECT `STOCK ID`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, FORMAT(`SELLER PRICE`, '#,##0.00') AS `SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`, `ENGINE S.N`, `ALTERNATOR S.N` ,(SELECT `NAME` FROM `supplier_table` WHERE `stock_table`.`SUPPLIER ID`= `supplier_table`.`ID`) AS `SUPPLIER`,`DATE INBOUND`, `INCHARGE`, `REMARKS` FROM `stock_table` WHERE `STOCK ID` LIKE '"+Search_Stock.getText()+"%' OR `CATEGORY` LIKE '"+Search_Stock.getText()+"%' OR `BRAND` LIKE '"+Search_Stock.getText()+"%' OR `MODEL` LIKE '"+Search_Stock.getText()+"%' OR `KVA` LIKE '"+Search_Stock.getText()+"%' OR `PHASING`LIKE '"+Search_Stock.getText()+"%' OR `TYPE` LIKE '"+Search_Stock.getText()+"%' OR `SELLER PRICE` LIKE '"+Search_Stock.getText()+"%' OR `QUANTITY` LIKE '"+Search_Stock.getText()+"%' OR `TOTAL PRICE` LIKE '"+Search_Stock.getText()+"%' OR `ENGINE S.N` LIKE '"+Search_Stock.getText()+"%' OR `ALTERNATOR S.N` LIKE '"+Search_Stock.getText()+"%' OR `DATE INBOUND` LIKE '"+Search_Stock.getText()+"%' OR `INCHARGE` LIKE '"+Search_Stock.getText()+"%' OR `REMARKS` LIKE '"+Search_Stock.getText()+"%' ";
//        ps = FPE_DB.getConnection().prepareStatement(sql);
//        rs = ps.executeQuery();
//        Stock_Table.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
//        Stock_Table.getColumnModel().getColumn(0).setMaxWidth(100);
//        }
//        catch(Exception e){
//            e.printStackTrace(); }
        
    }//GEN-LAST:event_Search_StockKeyReleased

    private void Stock_CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stock_CategoryActionPerformed
        String Stock = Stock_Category.getSelectedItem().toString();
        
        if(Stock.equals("ALL STOCK")){
            ct.Stock();
        }
        else if(Stock.equals("GENERATOR")){
            ct.Stock_Generator();
        }
        else if(Stock.equals("PARTS")){
            ct.Stock_Parts();
        }
        else if(Stock.equals("OFFICE")){
            ct.Stock_Office();
        }
        else if(Stock.equals("WAREHOUSE")){
            ct.Stock_Warehouse();
        }
    }//GEN-LAST:event_Stock_CategoryActionPerformed

    private void JTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTabMouseEntered
        Dispose();
    }//GEN-LAST:event_JTabMouseEntered

    private void HOME_0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME_0MouseEntered
        Dispose();
    }//GEN-LAST:event_HOME_0MouseEntered

    private void Search_SaleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_SaleKeyReleased
        DefaultTableModel tm = (DefaultTableModel)Sales_Table.getModel();
        String find = Search_Sale.getText().toUpperCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
        Sales_Table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(find));


    }//GEN-LAST:event_Search_SaleKeyReleased

    private void HEADERMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HEADERMouseEntered
         Dispose();
    }//GEN-LAST:event_HEADERMouseEntered

    private void HISTORYMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HISTORYMouseEntered
      Dispose();
    }//GEN-LAST:event_HISTORYMouseEntered

    private void Search_HistoryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_HistoryKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_HistoryKeyPressed

    private void Purchase_CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Purchase_CategoryActionPerformed
       
    }//GEN-LAST:event_Purchase_CategoryActionPerformed

    private void STATUSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STATUSMouseEntered
       Dispose();
    }//GEN-LAST:event_STATUSMouseEntered

    private void History_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_History_TableMouseClicked
       
    }//GEN-LAST:event_History_TableMouseClicked

    private void logAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_logAncestorAdded
 
        
    }//GEN-LAST:event_logAncestorAdded

    private void HOME1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME1MouseClicked
        String[] options = new String[2];
        options[0] = (" YES ");
        options[1] = (" NO  ");
        int opt = JOptionPane.showOptionDialog(null," DO YOU WANT TO LOGOUT ? ", null,0,JOptionPane.UNDEFINED_CONDITION,null,options,null);
        
        if(opt == 0)
        {
        level = "";
        Login l = new Login();
        l.setVisible(true);
        dispose();
        }
    }//GEN-LAST:event_HOME1MouseClicked

    private void HOME1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME1MouseEntered
         HOME_PANEL1.setBackground(new Color(163, 235, 177));
        HOME1.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_HOME1MouseEntered

    private void HOME1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME1MouseExited
        HOME_PANEL1.setBackground(new Color(0,117,128));
        HOME1.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_HOME1MouseExited

    private void Shop_Add5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add5MouseClicked
        AddFullout af = new AddFullout();
        af.setVisible(true);
        
    }//GEN-LAST:event_Shop_Add5MouseClicked

    private void Shop_Add5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add5MouseEntered
        // TODO add your handling code here:
        Stock_Genset_Panel_Add7.setBackground(new Color(163, 235, 177));
        Shop_Add5.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_Shop_Add5MouseEntered

    private void Shop_Add5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add5MouseExited
        // TODO add your handling code here:
         Stock_Genset_Panel_Add7.setBackground(new Color(153,153,102));
        Shop_Add5.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Shop_Add5MouseExited

    private void Search_FulloutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_FulloutKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_FulloutKeyPressed

    private void FullOut_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FullOut_TableMouseClicked
        int i=FullOut_Table.getSelectedRow();
        TableModel model = FullOut_Table.getModel();
        fullout_id = model.getValueAt(i,0).toString();
        fullout_cat = model.getValueAt(i,1).toString();
        
        if(fullout_cat.equals("WAREHOUSE")){
            Fullout_Warehouse ss = new Fullout_Warehouse();
            ss.setVisible(true);
            Fullout_Warehouse.fullout_display.setText(" REMOVE WAREHOUSE");
            Fullout_Warehouse.Stock_Genset_Panel_Update.setBackground(new Color(255,128,128));
            Fullout_Warehouse.Stock_Genset_Update.setText(" REMOVE");
            
        }else if(fullout_cat.equals("PARTS")){
             Fullout_Parts sp = new Fullout_Parts();
             sp.setVisible(true);
             Fullout_Parts.fullout_display.setText(" REMOVE PARTS");
             Fullout_Parts.Stock_Genset_Panel_Update.setBackground(new Color(255,128,128));
             Fullout_Parts.Stock_Genset_Update.setText(" REMOVE");
        }else if(fullout_cat.equals("OFFICE")){
             Fullout_Office so = new Fullout_Office();
             so.setVisible(true);
             Fullout_Office.fullout_display.setText(" REMOVE OFFICE");
             Fullout_Office.Stock_Genset_Panel_Update.setBackground(new Color(255,128,128));
             Fullout_Office.Stock_Genset_Update.setText(" REMOVE");
        }
    }//GEN-LAST:event_FullOut_TableMouseClicked

    private void Shop_Add6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add6MouseClicked
        JTab.setSelectedIndex(1);
    }//GEN-LAST:event_Shop_Add6MouseClicked

    private void Shop_Add6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add6MouseEntered
        // TODO add your handling code here:
        Stock_Genset_Panel_Add8.setBackground(new Color(163, 235, 177));
        Shop_Add6.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_Shop_Add6MouseEntered

    private void Shop_Add6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add6MouseExited
        Stock_Genset_Panel_Add8.setBackground(new Color(131,81,81));
        Shop_Add6.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Shop_Add6MouseExited

    private void Fullout_CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fullout_CategoryActionPerformed
         String cart_car = Fullout_Category.getSelectedItem().toString();
       if(cart_car.equals("ALL STOCK")){
          ct.Fullout();
       }else if(cart_car.equals("WAREHOUSE")){
          ct.FulloutWarehouse();
       }else if(cart_car.equals("PARTS")){
          ct.Fullout_Parts();  
       }else if(cart_car.equals("OFFICE")){
          ct.Fullout_Office();  
       }
    }//GEN-LAST:event_Fullout_CategoryActionPerformed

    private void FULLOUT_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FULLOUT_4MouseEntered
       Dispose();
    }//GEN-LAST:event_FULLOUT_4MouseEntered

    private void Stock_Genset_Supplier1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Supplier1MouseClicked
        JTab.setSelectedIndex(4);
    }//GEN-LAST:event_Stock_Genset_Supplier1MouseClicked

    private void Stock_Genset_Supplier1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Supplier1MouseEntered
        Stock_Genset_Panel_Supplier3.setBackground(new Color(163, 235, 177));
        Stock_Genset_Supplier1.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_Stock_Genset_Supplier1MouseEntered

    private void Stock_Genset_Supplier1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Supplier1MouseExited
        Stock_Genset_Panel_Supplier3.setBackground(new Color(144,30,29));
        Stock_Genset_Supplier1.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Stock_Genset_Supplier1MouseExited

    private void jTextField29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField29MouseEntered
        jTextField29.setForeground(new Color(230, 34, 0));
        total_amount.setForeground(new Color(230, 34, 0));
    }//GEN-LAST:event_jTextField29MouseEntered

    private void total_amountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_total_amountMouseEntered
        jTextField29.setForeground(new Color(230, 34, 0));
        total_amount.setForeground(new Color(230, 34, 0));
    }//GEN-LAST:event_total_amountMouseEntered

    private void jTextField29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField29MouseExited
        jTextField29.setForeground(new Color(51,51,51));
        total_amount.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jTextField29MouseExited

    private void total_amountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_total_amountMouseExited
        jTextField29.setForeground(new Color(51,51,51));
        total_amount.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_total_amountMouseExited

    private void jTextField30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField30MouseEntered
        jTextField30.setForeground(new Color(230, 34, 0));
        fullout_amount.setForeground(new Color(230, 34, 0));
    }//GEN-LAST:event_jTextField30MouseEntered

    private void fullout_amountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullout_amountMouseEntered
       jTextField30.setForeground(new Color(230, 34, 0));
        fullout_amount.setForeground(new Color(230, 34, 0));
    }//GEN-LAST:event_fullout_amountMouseEntered

    private void jTextField30MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField30MouseExited
        jTextField30.setForeground(new Color(51,51,51));
        fullout_amount.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_jTextField30MouseExited

    private void fullout_amountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullout_amountMouseExited
        jTextField30.setForeground(new Color(51,51,51));
        fullout_amount.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_fullout_amountMouseExited

    private void fpe_homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fpe_homeMouseEntered
        Dispose();
    }//GEN-LAST:event_fpe_homeMouseEntered

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
       Dispose();
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        Dispose();
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
       Dispose();
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        Dispose();
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        Dispose();
    }//GEN-LAST:event_jLabel4MouseEntered

    private void project_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_project_tableMouseClicked
    int i=project_table.getSelectedRow();
    TableModel model = project_table.getModel();

    project_no = model.getValueAt(i,0).toString();
    //status = model.getValueAt(i, 9).toString();
    
    System.out.println(project_no);
   
    
    if(log.getText().equals("ADMIN"))
    {  
        String[] options = new String[3];
        options[0] = (" VIEW PURCHASE HISTORY ");
        options[1] = (" VIEW BALANCE HISTORY "); 
        options[2] = (" NO ");
        int opt = JOptionPane.showOptionDialog(null," PROJECT NO "+project_no+" ",null,0,JOptionPane.UNDEFINED_CONDITION,null,options,null);
        
        if(opt == 0)
        {
          path="PROJECT";
          JTab.setSelectedIndex(7);
          try{
            PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `PROJECT NO`,`STOCK ID` AS `ID`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, `SELLER PRICE` AS `PRICE`, `QUANTITY`, `TOTAL PRICE`, `ENGINE S.N`, `ALTERNATOR S.N`,(SELECT `NAME` FROM `customer_table` WHERE `customer_table`.`ID` = `history_table`.`CUSTOMER ID`) AS `CUSTOMER`, `DATE OUTBOUND` FROM `history_table` WHERE `PROJECT NO` = "+project_no+" AND `ACTION`='SALE'");
            ResultSet rs = ps.executeQuery();
            History_Table.setModel(DbUtils.resultSetToTableModel(rs));
            
          }catch(Exception e){
              System.out.println(e);
            }
        }
        else if(opt == 1) {
          
          Table_Balance tb = new Table_Balance();
          tb.setVisible(true);
           
        }
        
            
    }else if(log.getText().equals("STAFF"))
    {
       JOptionPane.showMessageDialog(null,"ONLY ADDMIN CAN ACCESS THIS ",null,JOptionPane.UNDEFINED_CONDITION); 
    }
    }//GEN-LAST:event_project_tableMouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        Dispose();
    }//GEN-LAST:event_jLabel6MouseEntered

    private void PROJECTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROJECTMouseEntered
        Dispose();
    }//GEN-LAST:event_PROJECTMouseEntered

    private void Search_ProjectKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_ProjectKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_ProjectKeyPressed

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        Dispose();
    }//GEN-LAST:event_jLabel13MouseEntered

    private void Search_CartKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_CartKeyReleased
    DefaultTableModel tm = (DefaultTableModel)Cart_Table.getModel();
    String find = Search_Cart.getText().toUpperCase();
    TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
    Cart_Table.setRowSorter(tr);
    tr.setRowFilter(RowFilter.regexFilter(find));
    }//GEN-LAST:event_Search_CartKeyReleased

    private void Search_FulloutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_FulloutKeyReleased
    DefaultTableModel tm = (DefaultTableModel)FullOut_Table.getModel();
    String find = Search_Fullout.getText().toUpperCase();
    TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
    FullOut_Table.setRowSorter(tr);
    tr.setRowFilter(RowFilter.regexFilter(find));
    }//GEN-LAST:event_Search_FulloutKeyReleased

    private void Search_ProjectKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_ProjectKeyReleased
        // TODO add your handling code here:
    DefaultTableModel tm = (DefaultTableModel)project_table.getModel();
    String find = Search_Project.getText().toUpperCase();
    TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
    project_table.setRowSorter(tr);
    tr.setRowFilter(RowFilter.regexFilter(find));
    }//GEN-LAST:event_Search_ProjectKeyReleased

    private void Search_HistoryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_HistoryKeyReleased
    DefaultTableModel tm = (DefaultTableModel)History_Table.getModel();
    String find = Search_History.getText().toUpperCase();
    TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
    History_Table.setRowSorter(tr);
    tr.setRowFilter(RowFilter.regexFilter(find));
    }//GEN-LAST:event_Search_HistoryKeyReleased

    private void Stock_Genset_Supplier3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Supplier3MouseClicked
        Table_Balance tb = new Table_Balance();
        tb.setVisible(true);
    }//GEN-LAST:event_Stock_Genset_Supplier3MouseClicked

    private void Stock_Genset_Supplier3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Supplier3MouseEntered
        Stock_Genset_Panel_Supplier5.setBackground(new Color(163, 235, 177));
        Stock_Genset_Supplier3.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_Stock_Genset_Supplier3MouseEntered

    private void Stock_Genset_Supplier3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Supplier3MouseExited
        Stock_Genset_Panel_Supplier5.setBackground(new Color(153,153,102));
        Stock_Genset_Supplier3.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Stock_Genset_Supplier3MouseExited

    private void Shop_Add7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add7MouseClicked
        if(path.equals("PROJECT"))
        {
        Print_Reciept_Generator prg = new Print_Reciept_Generator();
        Print_Reciept_Parts prp = new Print_Reciept_Parts();
        prg.setVisible(true);
        prp.setVisible(true);
        Print_Reciept_Generator.id = project_no;
        Print_Reciept_Parts.id= project_no;
          
        }else if(path.equals("REQUEST"))
        {
        Print_Reciept_Request ppr = new Print_Reciept_Request();
        ppr.setVisible(true);
        Print_Reciept_Request.id = request; 
        
        }
    }//GEN-LAST:event_Shop_Add7MouseClicked

    private void Shop_Add7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add7MouseEntered
       Stock_Genset_Panel_Add9.setBackground(new Color(163, 235, 177));
        Shop_Add7.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_Shop_Add7MouseEntered

    private void Shop_Add7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add7MouseExited
        Stock_Genset_Panel_Add9.setBackground(new Color(102,153,153));
        Shop_Add7.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Shop_Add7MouseExited

    private void Shop_Add8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add8MouseClicked
        if(path.equals("PROJECT"))
        {
        JTab.setSelectedIndex(5);
        project_no = "";
        path="";   
        }else if(path.equals("REQUEST"))
        {
        JTab.setSelectedIndex(6);
        project_no = ""; 
        path="";
        }
        
    }//GEN-LAST:event_Shop_Add8MouseClicked

    private void Shop_Add8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add8MouseEntered
       Stock_Genset_Panel_Add10.setBackground(new Color(163, 235, 177));
        Shop_Add8.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_Shop_Add8MouseEntered

    private void Shop_Add8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add8MouseExited
        Stock_Genset_Panel_Add10.setBackground(new Color(131,81,81));
        Shop_Add8.setForeground(new Color(255,255,255));
        
    }//GEN-LAST:event_Shop_Add8MouseExited

    private void Shop_Add9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Add9MouseClicked

    private void Shop_Add9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add9MouseEntered
        Stock_Genset_Panel_Add11.setBackground(new Color(102,153,153));
        Shop_Add9.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_Shop_Add9MouseEntered

    private void Shop_Add9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add9MouseExited
        Stock_Genset_Panel_Add11.setBackground(new Color(102,153,153));
        Shop_Add9.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Shop_Add9MouseExited

    private void Search_RequestKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_RequestKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_RequestKeyPressed

    private void Search_RequestKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_RequestKeyReleased
        DefaultTableModel tm = (DefaultTableModel)request_table.getModel();
        String find = Search_Request.getText().toUpperCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
        request_table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(find));
    }//GEN-LAST:event_Search_RequestKeyReleased

    private void request_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_request_tableMouseClicked
        int i=request_table.getSelectedRow();
        TableModel model = request_table.getModel();
        request = model.getValueAt(i,0).toString();
        
        String[] options = new String[2];
        options[0] = (" VIEW REQUEST ");
        options[1] = (" NO ");
        int opt = JOptionPane.showOptionDialog(null," PROJECT NO "+project_no+" ",null,0,JOptionPane.UNDEFINED_CONDITION,null,options,null);
        if(opt == 0)
        {
           path="REQUEST";
           JTab.setSelectedIndex(7);
           
          try{
            PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `PROJECT NO`,`STOCK ID`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, `SELLER PRICE` AS `PRICE`, `QUANTITY`, `TOTAL PRICE`,(SELECT `NAME` FROM `request_table` WHERE `history_table`.`PROJECT NO` = `request_table`.`SRS NO`  ) AS `NAME`, `DATE OUTBOUND` FROM `history_table` WHERE `PROJECT NO` = "+request+" AND `ACTION`='FULLOUT' ");
            ResultSet rs = ps.executeQuery();
            History_Table.setModel(DbUtils.resultSetToTableModel(rs));
            
          }catch(Exception e){
              System.out.println(e);
            }
        }
        
    }//GEN-LAST:event_request_tableMouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
      Dispose();
    }//GEN-LAST:event_jLabel7MouseEntered

    private void Shop_Add12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Add12MouseClicked

    private void Shop_Add12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add12MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Add12MouseEntered

    private void Shop_Add12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add12MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Add12MouseExited

    private void REQUESTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REQUESTMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_REQUESTMouseEntered

    private void request_tableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_request_tableMouseEntered
        Dispose();
    }//GEN-LAST:event_request_tableMouseEntered

    private void Sales_TableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sales_TableMouseEntered
        Dispose();
    }//GEN-LAST:event_Sales_TableMouseEntered

    private void Cart_TableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cart_TableMouseEntered
       Dispose();
    }//GEN-LAST:event_Cart_TableMouseEntered

    private void FullOut_TableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FullOut_TableMouseEntered
      Dispose();
    }//GEN-LAST:event_FullOut_TableMouseEntered

    private void project_tableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_project_tableMouseEntered
        Dispose();
    }//GEN-LAST:event_project_tableMouseEntered

    private void History_TableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_History_TableMouseEntered
        Dispose();
    }//GEN-LAST:event_History_TableMouseEntered

    private void Generator_GraphMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Generator_GraphMouseEntered
       Dispose();
    }//GEN-LAST:event_Generator_GraphMouseEntered
      
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
            java.util.logging.Logger.getLogger(Webpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Webpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Webpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Webpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Webpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ACCOUNT;
    private javax.swing.JPanel ACCOUNT_PANEL;
    private keeptoo.KGradientPanel CART_3;
    private javax.swing.JComboBox<String> Cart_Category;
    public static javax.swing.JTable Cart_Table;
    private keeptoo.KGradientPanel FULLOUT_4;
    public static javax.swing.JTable FullOut_Table;
    private javax.swing.JComboBox<String> Fullout_Category;
    public static javax.swing.JPanel Generator_Graph;
    private javax.swing.JPanel HEADER;
    private keeptoo.KGradientPanel HISTORY;
    private javax.swing.JLabel HOME;
    private javax.swing.JLabel HOME1;
    private keeptoo.KGradientPanel HOME_0;
    private javax.swing.JPanel HOME_PANEL;
    private javax.swing.JPanel HOME_PANEL1;
    public static javax.swing.JTable History_Table;
    public static javax.swing.JTabbedPane JTab;
    private keeptoo.KGradientPanel PROJECT;
    private javax.swing.JComboBox<String> Purchase_Category;
    private javax.swing.JLabel REPORT;
    private javax.swing.JPanel REPORT_PANEL;
    private keeptoo.KGradientPanel REQUEST;
    private javax.swing.JLabel SALE;
    private keeptoo.KGradientPanel SALES_2;
    private javax.swing.JPanel SALE_PANEL;
    private keeptoo.KGradientPanel STATUS;
    private javax.swing.JLabel STOCK;
    private keeptoo.KGradientPanel STOCKS_1;
    private javax.swing.JPanel STOCK_PANEL;
    private javax.swing.JComboBox<String> Sale_Category;
    public static javax.swing.JTable Sales_Table;
    private javax.swing.JTextField Search_Cart;
    private javax.swing.JTextField Search_Fullout;
    private javax.swing.JTextField Search_History;
    private javax.swing.JTextField Search_Project;
    private javax.swing.JTextField Search_Request;
    private javax.swing.JTextField Search_Sale;
    private javax.swing.JTextField Search_Stock;
    public static javax.swing.JLabel Shop_Add12;
    public static javax.swing.JLabel Shop_Add2;
    public static javax.swing.JLabel Shop_Add3;
    public static javax.swing.JLabel Shop_Add4;
    public static javax.swing.JLabel Shop_Add5;
    public static javax.swing.JLabel Shop_Add6;
    public static javax.swing.JLabel Shop_Add7;
    public static javax.swing.JLabel Shop_Add8;
    public static javax.swing.JLabel Shop_Add9;
    private javax.swing.JComboBox<String> Stock_Category;
    public static javax.swing.JLabel Stock_Genset_Add;
    public static javax.swing.JLabel Stock_Genset_AllPrint;
    public static javax.swing.JPanel Stock_Genset_Panel_Add;
    public static javax.swing.JPanel Stock_Genset_Panel_Add10;
    public static javax.swing.JPanel Stock_Genset_Panel_Add11;
    public static javax.swing.JPanel Stock_Genset_Panel_Add14;
    public static javax.swing.JPanel Stock_Genset_Panel_Add4;
    public static javax.swing.JPanel Stock_Genset_Panel_Add5;
    public static javax.swing.JPanel Stock_Genset_Panel_Add6;
    public static javax.swing.JPanel Stock_Genset_Panel_Add7;
    public static javax.swing.JPanel Stock_Genset_Panel_Add8;
    public static javax.swing.JPanel Stock_Genset_Panel_Add9;
    public static javax.swing.JPanel Stock_Genset_Panel_Supplier1;
    public static javax.swing.JPanel Stock_Genset_Panel_Supplier3;
    public static javax.swing.JPanel Stock_Genset_Panel_Supplier5;
    public static javax.swing.JLabel Stock_Genset_Supplier1;
    public static javax.swing.JLabel Stock_Genset_Supplier3;
    public static javax.swing.JTable Stock_Table;
    private javax.swing.JLabel fpe_home;
    public static javax.swing.JTextField fullout_amount;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField30;
    public static javax.swing.JLabel log;
    private javax.swing.JLabel pat_back_filter;
    private javax.swing.JLabel pat_back_genset;
    public static javax.swing.JLabel process;
    private javax.swing.JLabel process1;
    private javax.swing.JLabel process2;
    public static javax.swing.JTable project_table;
    public static javax.swing.JTable request_table;
    public static javax.swing.JLabel stock_supplier_id;
    public static javax.swing.JTextField total_amount;
    // End of variables declaration//GEN-END:variables
}
