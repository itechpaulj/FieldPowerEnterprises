/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;



public class Mainpage extends javax.swing.JFrame {

    public static SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
    public static SimpleDateFormat date = new SimpleDateFormat("MM dd yyyy");
    public static String admin_id = Login.admin_id;  

    
    public static byte[] images = null;
    Connection con;
    public Mainpage() {
       initComponents();
       con = FPE_DB.getConnection();
       Class_tables ct = new Class_tables();
       ct.Genset();
       ct.Filter();
       ct.ShopGenset();
       ct.ShopFilter();
       ct.History_Genset();
       ct.History_Fitler();
       ct.Bin_Genset();
       ct.Bin_Filter();
       cartIfEmpty.setVisible(false);
       Home_Dates.setText(""+date);
       Home_Time.setText(""+time);   
       showDate();
       cartifEmpty();
       showPieChart();
       Graph();
       Genset_id.setVisible(false);
       filter_id.setVisible(false);
       Shop_genset_id.setVisible(false);
       Shop_filter_id.setVisible(false);
       jLabel4.setVisible(false);
       history_id_filter.setVisible(false);
       bin_genset_ids.setVisible(false);
       bin_filter_id.setVisible(false);
               
    }
         
public void Graph(){
        
       Class_Graph cg =new Class_Graph();
       cg.yandong();
       cg.isuzu();
       cg.cummins();
       cg.perkins();
       cg.GensetOther();
       cg.Filter(); 
       cg.Parts();
       showPieChart();
       }

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
 
    private void cartifEmpty (){
        PreparedStatement ps;
        ResultSet rs;
        try{
        ps=FPE_DB.getConnection().prepareStatement("SELECT `ID`, `BRAND`, `DATE`, `DESCRIPTION`, `TYPE`, `QUANTITY`, `PRICE`, `TOTAL PRICE` FROM `add_cart`");
        rs = ps.executeQuery();
            if(rs.next() == true){
                // Database is not empty
               cartIfEmpty.setText("2");
            }
            else{
                //empty database
               cartIfEmpty.setText("1");
            }
        }
        catch(Exception e){
            
        }
    }
    
public void showPieChart(){
       //Class_Graph cg =new Class_Graph();
       
        
        
        
        // Genset Graph
        DefaultPieDataset barDataset = new DefaultPieDataset();
        barDataset.setValue( "YANDONG" , new Integer(Class_Graph.yandong) );  
        barDataset.setValue( "ISUZU" , new Integer(Class_Graph.isuzu) );   
        barDataset.setValue( "CUMMINS" , new Integer(Class_Graph.cummins));    
        barDataset.setValue( "PERKINS" , new Integer(Class_Graph.perkins) );
        barDataset.setValue( "OTHER" , new Integer(Class_Graph.other) );  

        JFreeChart piechart = ChartFactory.createPieChart(" GENSET SALES STATUS ",barDataset, false,true,false);//explain
      
        
        ChartPanel barChartPanel = new ChartPanel(piechart);
        Genset_Graph.removeAll();
        Genset_Graph.add(barChartPanel, BorderLayout.CENTER);
        Genset_Graph.validate();  
        
        // Filter Graph
        DefaultPieDataset barDataset1 = new DefaultPieDataset( );
        barDataset1.setValue( "FLTER" , new Integer(Class_Graph.filter) );  
        barDataset1.setValue( "PARTS" , new Integer(Class_Graph.parts) );   
       

      //create chart
       JFreeChart piechart1 = ChartFactory.createPieChart(" FILTER / PARTS SALES STATUS ",barDataset1, false,true,false);//explain
      
        ChartPanel barChartPanel2 = new ChartPanel(piechart1);
        Filter_Graph.removeAll();
        Filter_Graph.add(barChartPanel2, BorderLayout.CENTER);
        Filter_Graph.validate();
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stock_supplier_id = new javax.swing.JLabel();
        pat_back_filter = new javax.swing.JLabel();
        pat_back_genset = new javax.swing.JLabel();
        DRAWER = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        STOCK_1 = new keeptoo.KGradientPanel();
        Stock_Filter_4 = new javax.swing.JPanel();
        Stock_Filter_3 = new javax.swing.JLabel();
        Stock_Genset_4 = new javax.swing.JPanel();
        Stock_Genset_3 = new javax.swing.JLabel();
        Stock_Genset_1 = new javax.swing.JPanel();
        Stock_Genset_2 = new javax.swing.JLabel();
        Stock_Filter_1 = new javax.swing.JPanel();
        Stock_Filter_2 = new javax.swing.JLabel();
        STOCK_GENSET_2 = new keeptoo.KGradientPanel();
        Stock_Genset_Panel_Add = new javax.swing.JPanel();
        Stock_Genset_Add = new javax.swing.JLabel();
        Stock_Genset_Panel_Supplier = new javax.swing.JPanel();
        Stock_Genset_Supplier = new javax.swing.JLabel();
        Stock_Genset_Panel_Back = new javax.swing.JPanel();
        Stock_Genset_Back = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Stock_Genset_Table = new javax.swing.JTable();
        Genset_id = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        Stock_Genset_Panel_View = new javax.swing.JPanel();
        Stock_Genset_View = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        STOCK_FILTER_3 = new keeptoo.KGradientPanel();
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
        jLabel32 = new javax.swing.JLabel();
        SHOP_4 = new keeptoo.KGradientPanel();
        Shop_Genset_3 = new javax.swing.JPanel();
        Shop_Genset_2 = new javax.swing.JLabel();
        ShopFilter_Genset_1 = new javax.swing.JPanel();
        Shop_Genset = new javax.swing.JLabel();
        ShopFilter_Parts_3 = new javax.swing.JPanel();
        ShopFilter_Parts_2 = new javax.swing.JLabel();
        ShopFilter_Parts_1 = new javax.swing.JPanel();
        Shop_Filter = new javax.swing.JLabel();
        SHOP_GENSET_5 = new keeptoo.KGradientPanel();
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
        jLabel31 = new javax.swing.JLabel();
        SHOP_FILTER_6 = new keeptoo.KGradientPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        Shop_Filter_Table = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        Shop_Filter_Panel_Back = new javax.swing.JPanel();
        Shop_Filter_back = new javax.swing.JLabel();
        Shop_Filter_Panel_view = new javax.swing.JPanel();
        Shop_Filter_view = new javax.swing.JLabel();
        Shop_Filter_Panel_Customer_list = new javax.swing.JPanel();
        Shop_Filter_customer = new javax.swing.JLabel();
        update_panel_supplier = new javax.swing.JPanel();
        process = new javax.swing.JLabel();
        cartIfEmpty = new javax.swing.JLabel();
        Shop_filter_id = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        REPORT_7 = new keeptoo.KGradientPanel();
        Purchase_1 = new javax.swing.JPanel();
        Purcahase_2 = new javax.swing.JLabel();
        Purchase_4 = new javax.swing.JPanel();
        Purchase_3 = new javax.swing.JLabel();
        bin_4 = new javax.swing.JPanel();
        bin_3 = new javax.swing.JLabel();
        bin_1 = new javax.swing.JPanel();
        bin_2 = new javax.swing.JLabel();
        SALES_8 = new keeptoo.KGradientPanel();
        Sale_Genset_1 = new javax.swing.JPanel();
        Sale_Genset_2 = new javax.swing.JLabel();
        Sale_Filter_1 = new javax.swing.JPanel();
        Sale_Filter_2 = new javax.swing.JLabel();
        Sale_Filter_4 = new javax.swing.JPanel();
        Sale_Filter_3 = new javax.swing.JLabel();
        Sale_Genset_4 = new javax.swing.JPanel();
        Sale_Genset_3 = new javax.swing.JLabel();
        SALES_GENSET_9 = new keeptoo.KGradientPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        history_genset_table = new javax.swing.JTable();
        Shop_Genset_Panel_Customer5 = new javax.swing.JPanel();
        Shop_Genset_Customer_list5 = new javax.swing.JLabel();
        Shop_Genset_Panel_Customer6 = new javax.swing.JPanel();
        Shop_Genset_Customer_list6 = new javax.swing.JLabel();
        Shop_Genset_Panel_Customer12 = new javax.swing.JPanel();
        Shop_Genset_Print_Genset = new javax.swing.JLabel();
        history_searched_genset = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SALES_FILTER_10 = new keeptoo.KGradientPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        history_filter_table = new javax.swing.JTable();
        Shop_Genset_Panel_Customer3 = new javax.swing.JPanel();
        Shop_Genset_Customer_list3 = new javax.swing.JLabel();
        Shop_Genset_Panel_Customer4 = new javax.swing.JPanel();
        Shop_Genset_Customer_list4 = new javax.swing.JLabel();
        history_id_filter = new javax.swing.JLabel();
        Shop_Genset_Panel_Customer11 = new javax.swing.JPanel();
        Shop_Genset_Print_Filter = new javax.swing.JLabel();
        history_searched_filter = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        BIN_11 = new keeptoo.KGradientPanel();
        Bin_Genset_4 = new javax.swing.JPanel();
        Bin_Genset_3 = new javax.swing.JLabel();
        Bin_Frilter_4 = new javax.swing.JPanel();
        Bin_Frilter_3 = new javax.swing.JLabel();
        Bin_Genset_1 = new javax.swing.JPanel();
        Bin_Genset_2 = new javax.swing.JLabel();
        Bin_Frilter_1 = new javax.swing.JPanel();
        Bin_Frilter_2 = new javax.swing.JLabel();
        BIN_GENSET_12 = new keeptoo.KGradientPanel();
        Shop_Genset_Panel_Customer7 = new javax.swing.JPanel();
        Shop_Genset_Customer_list7 = new javax.swing.JLabel();
        Shop_Genset_Panel_Customer8 = new javax.swing.JPanel();
        Shop_Genset_Customer_list8 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        Bin_Genset_Table = new javax.swing.JTable();
        bin_genset_ids = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        BIN_FILTER_13 = new keeptoo.KGradientPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        Bin_Filter_Table = new javax.swing.JTable();
        Shop_Genset_Panel_Customer13 = new javax.swing.JPanel();
        Shop_Genset_Customer_list11 = new javax.swing.JLabel();
        Shop_Genset_Panel_Customer14 = new javax.swing.JPanel();
        Shop_Genset_Customer_list12 = new javax.swing.JLabel();
        bin_filter_id = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        STATUS_14 = new keeptoo.KGradientPanel();
        Status_Genset_4 = new javax.swing.JPanel();
        Status_Genset_3 = new javax.swing.JLabel();
        Status_Genset_1 = new javax.swing.JPanel();
        Status_Genset_2 = new javax.swing.JLabel();
        Status_Filter_1 = new javax.swing.JPanel();
        Status_Filter_2 = new javax.swing.JLabel();
        Status_Filter_4 = new javax.swing.JPanel();
        Status_Filter_3 = new javax.swing.JLabel();
        STATUS_GENSET_15 = new keeptoo.KGradientPanel();
        Genset_Graph = new javax.swing.JPanel();
        Stock_Genset_Panel_Back1 = new javax.swing.JPanel();
        Stock_Genset_Back1 = new javax.swing.JLabel();
        Shop_Genset_Panel_Customer9 = new javax.swing.JPanel();
        Shop_Genset_Customer_list9 = new javax.swing.JLabel();
        STATUS_FILTER_16 = new keeptoo.KGradientPanel();
        Filter_Graph = new javax.swing.JPanel();
        Stock_Genset_Panel_Back2 = new javax.swing.JPanel();
        Stock_Genset_Back2 = new javax.swing.JLabel();
        Shop_Genset_Panel_Customer10 = new javax.swing.JPanel();
        Shop_Genset_Customer_list10 = new javax.swing.JLabel();

        stock_supplier_id.setText("jLabel2");

        pat_back_filter.setText("jLabel5");

        pat_back_genset.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DRAWER.setBackground(new java.awt.Color(2, 51, 74));
        DRAWER.setPreferredSize(new java.awt.Dimension(230, 775));
        DRAWER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Logo/Logo.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        DRAWER.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 150));

        HOME_PANEL.setBackground(new java.awt.Color(0, 117, 128));
        HOME_PANEL.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(243, 246, 26)));

        HOME.setBackground(new java.awt.Color(253, 254, 255));
        HOME.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        HOME.setForeground(new java.awt.Color(255, 255, 255));
        HOME.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HOME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Drawer_Home.png"))); // NOI18N
        HOME.setText(" HOME     ");
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
            .addComponent(HOME, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );
        HOME_PANELLayout.setVerticalGroup(
            HOME_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HOME, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        DRAWER.add(HOME_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 190, 70));

        STOCK_PANEL.setBackground(new java.awt.Color(0, 117, 128));
        STOCK_PANEL.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(243, 246, 26)));

        STOCK.setBackground(new java.awt.Color(253, 254, 255));
        STOCK.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        STOCK.setForeground(new java.awt.Color(255, 255, 255));
        STOCK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        STOCK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Drawer_Stock.png"))); // NOI18N
        STOCK.setText(" STOCK    ");
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
            .addComponent(STOCK, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );
        STOCK_PANELLayout.setVerticalGroup(
            STOCK_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(STOCK, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        DRAWER.add(STOCK_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 190, 70));

        SHOP_PANEL.setBackground(new java.awt.Color(0, 117, 128));
        SHOP_PANEL.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(243, 246, 26)));

        SHOP.setBackground(new java.awt.Color(253, 254, 255));
        SHOP.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        SHOP.setForeground(new java.awt.Color(255, 255, 255));
        SHOP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SHOP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Drawer_Shop.png"))); // NOI18N
        SHOP.setText(" SHOP      ");
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
            .addComponent(SHOP, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );
        SHOP_PANELLayout.setVerticalGroup(
            SHOP_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SHOP, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        DRAWER.add(SHOP_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 190, 70));

        SALES_PANEL.setBackground(new java.awt.Color(0, 117, 128));
        SALES_PANEL.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(243, 246, 26)));

        SALES.setBackground(new java.awt.Color(253, 254, 255));
        SALES.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        SALES.setForeground(new java.awt.Color(255, 255, 255));
        SALES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SALES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Drawer_System.png"))); // NOI18N
        SALES.setText(" SALES    ");
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
            .addComponent(SALES, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );
        SALES_PANELLayout.setVerticalGroup(
            SALES_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SALES, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        DRAWER.add(SALES_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 190, 70));

        STATUS_PANEL.setBackground(new java.awt.Color(0, 117, 128));
        STATUS_PANEL.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(243, 246, 26)));

        STATUS.setBackground(new java.awt.Color(253, 254, 255));
        STATUS.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        STATUS.setForeground(new java.awt.Color(255, 255, 255));
        STATUS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        STATUS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Drawer_Chart.png"))); // NOI18N
        STATUS.setText(" STATUS  ");
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
            .addComponent(STATUS, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );
        STATUS_PANELLayout.setVerticalGroup(
            STATUS_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(STATUS, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        DRAWER.add(STATUS_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 190, 70));

        LOGOUT_PANEL.setBackground(new java.awt.Color(0, 117, 128));
        LOGOUT_PANEL.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(243, 246, 26)));

        LOGOUT_LABEL1.setBackground(new java.awt.Color(253, 254, 255));
        LOGOUT_LABEL1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LOGOUT_LABEL1.setForeground(new java.awt.Color(255, 255, 255));
        LOGOUT_LABEL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGOUT_LABEL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Drawer_Logout.png"))); // NOI18N
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

        DRAWER.add(LOGOUT_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 190, 70));

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

        STOCK_1.setkEndColor(new java.awt.Color(42, 142, 142));
        STOCK_1.setkGradientFocus(700);
        STOCK_1.setkStartColor(new java.awt.Color(42, 142, 142));
        STOCK_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Stock_Filter_4.setBackground(new java.awt.Color(0, 117, 128));
        Stock_Filter_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Stock_Filter_3.setBackground(new java.awt.Color(253, 254, 255));
        Stock_Filter_3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Stock_Filter_3.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Filter_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Filter_3.setText("FILTER / PARTS");
        Stock_Filter_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Filter_3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Filter_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Filter_3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Filter_4Layout = new javax.swing.GroupLayout(Stock_Filter_4);
        Stock_Filter_4.setLayout(Stock_Filter_4Layout);
        Stock_Filter_4Layout.setHorizontalGroup(
            Stock_Filter_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Stock_Filter_4Layout.createSequentialGroup()
                .addComponent(Stock_Filter_3, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Stock_Filter_4Layout.setVerticalGroup(
            Stock_Filter_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Filter_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        STOCK_1.add(Stock_Filter_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 400, 45));

        Stock_Genset_4.setBackground(new java.awt.Color(0, 117, 128));
        Stock_Genset_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Stock_Genset_3.setBackground(new java.awt.Color(253, 254, 255));
        Stock_Genset_3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Stock_Genset_3.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_3.setText("GENSET");
        Stock_Genset_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Genset_3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Genset_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Genset_3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_4Layout = new javax.swing.GroupLayout(Stock_Genset_4);
        Stock_Genset_4.setLayout(Stock_Genset_4Layout);
        Stock_Genset_4Layout.setHorizontalGroup(
            Stock_Genset_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_3, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );
        Stock_Genset_4Layout.setVerticalGroup(
            Stock_Genset_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        STOCK_1.add(Stock_Genset_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 400, 45));

        Stock_Genset_1.setBackground(new java.awt.Color(0, 117, 128));
        Stock_Genset_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));
        Stock_Genset_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Stock_Genset_2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Stock_Genset_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Path_Btn/Stock_Genset.PNG"))); // NOI18N
        Stock_Genset_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Genset_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Genset_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Genset_2MouseExited(evt);
            }
        });
        Stock_Genset_1.add(Stock_Genset_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 350));

        STOCK_1.add(Stock_Genset_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 400, 350));

        Stock_Filter_1.setBackground(new java.awt.Color(0, 117, 128));
        Stock_Filter_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));
        Stock_Filter_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Stock_Filter_2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Stock_Filter_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Filter_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Path_Btn/Stock_Filter.png"))); // NOI18N
        Stock_Filter_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Filter_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Filter_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Filter_2MouseExited(evt);
            }
        });
        Stock_Filter_1.add(Stock_Filter_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        STOCK_1.add(Stock_Filter_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 400, 350));

        JTab.addTab("1", STOCK_1);

        STOCK_GENSET_2.setkEndColor(new java.awt.Color(42, 142, 142));
        STOCK_GENSET_2.setkGradientFocus(700);
        STOCK_GENSET_2.setkStartColor(new java.awt.Color(42, 142, 142));
        STOCK_GENSET_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Stock_Genset_Panel_Add.setBackground(new java.awt.Color(0, 102, 102));
        Stock_Genset_Panel_Add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Stock_Genset_Add.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Add.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Add.png"))); // NOI18N
        Stock_Genset_Add.setText("  ADD ITEM");
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
            .addComponent(Stock_Genset_Add, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_AddLayout.setVerticalGroup(
            Stock_Genset_Panel_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Add, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        STOCK_GENSET_2.add(Stock_Genset_Panel_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 210, 50));

        Stock_Genset_Panel_Supplier.setBackground(new java.awt.Color(153, 153, 102));
        Stock_Genset_Panel_Supplier.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Stock_Genset_Supplier.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Supplier.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Supplier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Supplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Supplier.png"))); // NOI18N
        Stock_Genset_Supplier.setText(" SUPPLIER LIST");
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
            .addComponent(Stock_Genset_Supplier, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_SupplierLayout.setVerticalGroup(
            Stock_Genset_Panel_SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Supplier, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        STOCK_GENSET_2.add(Stock_Genset_Panel_Supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 210, 50));

        Stock_Genset_Panel_Back.setBackground(new java.awt.Color(255, 173, 51));
        Stock_Genset_Panel_Back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

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
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_BackLayout.setVerticalGroup(
            Stock_Genset_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        STOCK_GENSET_2.add(Stock_Genset_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 530, 210, 50));

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

        STOCK_GENSET_2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 1070, 420));
        STOCK_GENSET_2.add(Genset_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 150, 30));

        jTextField3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });
        STOCK_GENSET_2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, 31));

        Stock_Genset_Panel_View.setBackground(new java.awt.Color(0, 107, 179));
        Stock_Genset_Panel_View.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Stock_Genset_View.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_View.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_View.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_View.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_View.png"))); // NOI18N
        Stock_Genset_View.setText("  VIEW ITEM");
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
            .addComponent(Stock_Genset_View, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_ViewLayout.setVerticalGroup(
            Stock_Genset_Panel_ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_View, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        STOCK_GENSET_2.add(Stock_Genset_Panel_View, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 210, 50));

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Search.png"))); // NOI18N
        STOCK_GENSET_2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 35, 31));

        JTab.addTab("2", STOCK_GENSET_2);

        STOCK_FILTER_3.setkEndColor(new java.awt.Color(42, 142, 142));
        STOCK_FILTER_3.setkGradientFocus(700);
        STOCK_FILTER_3.setkStartColor(new java.awt.Color(42, 142, 142));
        STOCK_FILTER_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        STOCK_FILTER_3.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 1050, 420));
        STOCK_FILTER_3.add(filter_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 70, 20));

        jTextField4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });
        STOCK_FILTER_3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, 31));

        Stock_Filter_Panel_Supplier.setBackground(new java.awt.Color(153, 153, 102));
        Stock_Filter_Panel_Supplier.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Stock_Filter_supplier_list.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Filter_supplier_list.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Filter_supplier_list.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Filter_supplier_list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_View.png"))); // NOI18N
        Stock_Filter_supplier_list.setText(" SUPPLIER LIST");
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
            .addComponent(Stock_Filter_supplier_list, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Stock_Filter_Panel_SupplierLayout.setVerticalGroup(
            Stock_Filter_Panel_SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Filter_supplier_list, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        STOCK_FILTER_3.add(Stock_Filter_Panel_Supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 210, 50));

        Stock_Filter_Panel_Add.setBackground(new java.awt.Color(0, 102, 102));
        Stock_Filter_Panel_Add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Stock_Filter_Add.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Filter_Add.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Filter_Add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Filter_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Add.png"))); // NOI18N
        Stock_Filter_Add.setText("  ADD ITEM");
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
            .addComponent(Stock_Filter_Add, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Stock_Filter_Panel_AddLayout.setVerticalGroup(
            Stock_Filter_Panel_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Filter_Add, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        STOCK_FILTER_3.add(Stock_Filter_Panel_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 210, 50));

        Stock_Filter_Panel_view.setBackground(new java.awt.Color(0, 107, 179));
        Stock_Filter_Panel_view.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Stock_Filter_view.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Filter_view.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Filter_view.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Filter_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_View.png"))); // NOI18N
        Stock_Filter_view.setText("  VIEW ITEM");
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
            .addComponent(Stock_Filter_view, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Stock_Filter_Panel_viewLayout.setVerticalGroup(
            Stock_Filter_Panel_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Filter_view, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        STOCK_FILTER_3.add(Stock_Filter_Panel_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 210, 50));

        Stock_Filter_Panel_back.setBackground(new java.awt.Color(255, 173, 51));
        Stock_Filter_Panel_back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Stock_Filter_back.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Filter_back.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Filter_back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Filter_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Back.png"))); // NOI18N
        Stock_Filter_back.setText("   BACK");
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
            .addComponent(Stock_Filter_back, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Stock_Filter_Panel_backLayout.setVerticalGroup(
            Stock_Filter_Panel_backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Filter_back, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        STOCK_FILTER_3.add(Stock_Filter_Panel_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 530, 210, 50));

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Search.png"))); // NOI18N
        STOCK_FILTER_3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 35, 31));

        JTab.addTab("3", STOCK_FILTER_3);

        SHOP_4.setkEndColor(new java.awt.Color(42, 142, 142));
        SHOP_4.setkGradientFocus(700);
        SHOP_4.setkStartColor(new java.awt.Color(42, 142, 142));
        SHOP_4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Shop_Genset_3.setBackground(new java.awt.Color(0, 117, 128));
        Shop_Genset_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Genset_2.setBackground(new java.awt.Color(253, 254, 255));
        Shop_Genset_2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Shop_Genset_2.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Genset_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset_2.setText("GENSET");
        Shop_Genset_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Genset_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Genset_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Genset_2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Shop_Genset_3Layout = new javax.swing.GroupLayout(Shop_Genset_3);
        Shop_Genset_3.setLayout(Shop_Genset_3Layout);
        Shop_Genset_3Layout.setHorizontalGroup(
            Shop_Genset_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_2, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );
        Shop_Genset_3Layout.setVerticalGroup(
            Shop_Genset_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        SHOP_4.add(Shop_Genset_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 400, 45));

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
            .addComponent(Shop_Genset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ShopFilter_Genset_1Layout.setVerticalGroup(
            ShopFilter_Genset_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        SHOP_4.add(ShopFilter_Genset_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 400, 350));

        ShopFilter_Parts_3.setBackground(new java.awt.Color(0, 117, 128));
        ShopFilter_Parts_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        ShopFilter_Parts_2.setBackground(new java.awt.Color(253, 254, 255));
        ShopFilter_Parts_2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ShopFilter_Parts_2.setForeground(new java.awt.Color(255, 255, 255));
        ShopFilter_Parts_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShopFilter_Parts_2.setText("FILTER / PARTS");
        ShopFilter_Parts_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShopFilter_Parts_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ShopFilter_Parts_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ShopFilter_Parts_2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout ShopFilter_Parts_3Layout = new javax.swing.GroupLayout(ShopFilter_Parts_3);
        ShopFilter_Parts_3.setLayout(ShopFilter_Parts_3Layout);
        ShopFilter_Parts_3Layout.setHorizontalGroup(
            ShopFilter_Parts_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShopFilter_Parts_3Layout.createSequentialGroup()
                .addComponent(ShopFilter_Parts_2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ShopFilter_Parts_3Layout.setVerticalGroup(
            ShopFilter_Parts_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ShopFilter_Parts_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        SHOP_4.add(ShopFilter_Parts_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 400, 45));

        ShopFilter_Parts_1.setBackground(new java.awt.Color(0, 117, 128));
        ShopFilter_Parts_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));
        ShopFilter_Parts_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Shop_Filter.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Shop_Filter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Path_Btn/Shop_Filters.png"))); // NOI18N
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
        ShopFilter_Parts_1.add(Shop_Filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 350));

        SHOP_4.add(ShopFilter_Parts_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 400, 350));

        JTab.addTab("4", SHOP_4);

        SHOP_GENSET_5.setkEndColor(new java.awt.Color(42, 142, 142));
        SHOP_GENSET_5.setkGradientFocus(700);
        SHOP_GENSET_5.setkStartColor(new java.awt.Color(42, 142, 142));
        SHOP_GENSET_5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        SHOP_GENSET_5.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 1050, 420));
        SHOP_GENSET_5.add(Shop_genset_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 80, 20));

        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        SHOP_GENSET_5.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, 31));

        Shop_Genset_Panel_back.setBackground(new java.awt.Color(255, 173, 51));
        Shop_Genset_Panel_back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Genset_Panel_Back.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Genset_Panel_Back.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Genset_Panel_Back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset_Panel_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Back.png"))); // NOI18N
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
            .addComponent(Shop_Genset_Panel_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Shop_Genset_Panel_backLayout.setVerticalGroup(
            Shop_Genset_Panel_backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Panel_Back, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        SHOP_GENSET_5.add(Shop_Genset_Panel_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 210, 50));

        Shop_Genset_Panel_view.setBackground(new java.awt.Color(0, 107, 179));
        Shop_Genset_Panel_view.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Gensetr_view.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Gensetr_view.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Gensetr_view.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Gensetr_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_View.png"))); // NOI18N
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
            .addComponent(Shop_Gensetr_view, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Shop_Genset_Panel_viewLayout.setVerticalGroup(
            Shop_Genset_Panel_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Gensetr_view, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        SHOP_GENSET_5.add(Shop_Genset_Panel_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 210, 50));

        Shop_Genset_Panel_Customer.setBackground(new java.awt.Color(51, 153, 102));
        Shop_Genset_Panel_Customer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Genset_Customer_list.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Genset_Customer_list.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Genset_Customer_list.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset_Customer_list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Customer.png"))); // NOI18N
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
            .addComponent(Shop_Genset_Customer_list, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Shop_Genset_Panel_CustomerLayout.setVerticalGroup(
            Shop_Genset_Panel_CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Customer_list, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        SHOP_GENSET_5.add(Shop_Genset_Panel_Customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 210, 50));

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Search.png"))); // NOI18N
        SHOP_GENSET_5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 35, 31));

        JTab.addTab("5", SHOP_GENSET_5);

        SHOP_FILTER_6.setkEndColor(new java.awt.Color(42, 142, 142));
        SHOP_FILTER_6.setkGradientFocus(700);
        SHOP_FILTER_6.setkStartColor(new java.awt.Color(42, 142, 142));
        SHOP_FILTER_6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        SHOP_FILTER_6.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 1040, 420));

        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        SHOP_FILTER_6.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, 31));

        Shop_Filter_Panel_Back.setBackground(new java.awt.Color(255, 173, 51));
        Shop_Filter_Panel_Back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Filter_back.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Filter_back.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Filter_back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Filter_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Back.png"))); // NOI18N
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
            .addComponent(Shop_Filter_back, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Shop_Filter_Panel_BackLayout.setVerticalGroup(
            Shop_Filter_Panel_BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Filter_back, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        SHOP_FILTER_6.add(Shop_Filter_Panel_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 530, 210, 50));

        Shop_Filter_Panel_view.setBackground(new java.awt.Color(0, 107, 179));
        Shop_Filter_Panel_view.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Filter_view.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Filter_view.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Filter_view.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Filter_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_View.png"))); // NOI18N
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
            .addComponent(Shop_Filter_view, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Shop_Filter_Panel_viewLayout.setVerticalGroup(
            Shop_Filter_Panel_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Filter_view, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        SHOP_FILTER_6.add(Shop_Filter_Panel_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 210, 50));

        Shop_Filter_Panel_Customer_list.setBackground(new java.awt.Color(51, 153, 102));
        Shop_Filter_Panel_Customer_list.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Filter_customer.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Filter_customer.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Filter_customer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Filter_customer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Customer.png"))); // NOI18N
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
            .addComponent(Shop_Filter_customer, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Shop_Filter_Panel_Customer_listLayout.setVerticalGroup(
            Shop_Filter_Panel_Customer_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Filter_customer, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        SHOP_FILTER_6.add(Shop_Filter_Panel_Customer_list, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 210, 50));

        update_panel_supplier.setBackground(new java.awt.Color(255, 153, 102));
        update_panel_supplier.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        process.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        process.setForeground(new java.awt.Color(255, 255, 255));
        process.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        process.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Carts.png"))); // NOI18N
        process.setText(" GO TO CART");
        process.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                processMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                processMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                processMouseExited(evt);
            }
        });

        javax.swing.GroupLayout update_panel_supplierLayout = new javax.swing.GroupLayout(update_panel_supplier);
        update_panel_supplier.setLayout(update_panel_supplierLayout);
        update_panel_supplierLayout.setHorizontalGroup(
            update_panel_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(process, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        update_panel_supplierLayout.setVerticalGroup(
            update_panel_supplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(process, javax.swing.GroupLayout.PREFERRED_SIZE, 48, Short.MAX_VALUE)
        );

        SHOP_FILTER_6.add(update_panel_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 210, 50));

        cartIfEmpty.setText("1");
        SHOP_FILTER_6.add(cartIfEmpty, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 54, 150, 20));
        SHOP_FILTER_6.add(Shop_filter_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 80, 40));

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Search.png"))); // NOI18N
        SHOP_FILTER_6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 35, 31));

        JTab.addTab("6", SHOP_FILTER_6);

        REPORT_7.setkEndColor(new java.awt.Color(42, 142, 142));
        REPORT_7.setkStartColor(new java.awt.Color(42, 142, 142));
        REPORT_7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Purchase_1.setBackground(new java.awt.Color(0, 117, 128));
        Purchase_1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(243, 246, 26)));

        Purcahase_2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Purcahase_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Purcahase_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Path_Btn/Path_Purchase.png"))); // NOI18N
        Purcahase_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Purcahase_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Purcahase_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Purcahase_2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Purchase_1Layout = new javax.swing.GroupLayout(Purchase_1);
        Purchase_1.setLayout(Purchase_1Layout);
        Purchase_1Layout.setHorizontalGroup(
            Purchase_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Purcahase_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Purchase_1Layout.setVerticalGroup(
            Purchase_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Purchase_1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Purcahase_2))
        );

        REPORT_7.add(Purchase_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 400, 350));

        Purchase_4.setBackground(new java.awt.Color(0, 117, 128));
        Purchase_4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(243, 246, 26)));

        Purchase_3.setBackground(new java.awt.Color(253, 254, 255));
        Purchase_3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Purchase_3.setForeground(new java.awt.Color(255, 255, 255));
        Purchase_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Purchase_3.setText("PURCHASED HISTORY");
        Purchase_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Purchase_3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Purchase_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Purchase_3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Purchase_4Layout = new javax.swing.GroupLayout(Purchase_4);
        Purchase_4.setLayout(Purchase_4Layout);
        Purchase_4Layout.setHorizontalGroup(
            Purchase_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Purchase_3, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );
        Purchase_4Layout.setVerticalGroup(
            Purchase_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Purchase_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        REPORT_7.add(Purchase_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 400, 45));

        bin_4.setBackground(new java.awt.Color(0, 117, 128));
        bin_4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(243, 246, 26)));

        bin_3.setBackground(new java.awt.Color(253, 254, 255));
        bin_3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bin_3.setForeground(new java.awt.Color(255, 255, 255));
        bin_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bin_3.setText("BIN CARD");
        bin_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bin_3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bin_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bin_3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout bin_4Layout = new javax.swing.GroupLayout(bin_4);
        bin_4.setLayout(bin_4Layout);
        bin_4Layout.setHorizontalGroup(
            bin_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bin_3, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );
        bin_4Layout.setVerticalGroup(
            bin_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bin_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        REPORT_7.add(bin_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 400, 45));

        bin_1.setBackground(new java.awt.Color(0, 117, 128));
        bin_1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(243, 246, 26)));

        bin_2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        bin_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bin_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Path_Btn/Path_Bin.png"))); // NOI18N
        bin_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bin_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bin_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bin_2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout bin_1Layout = new javax.swing.GroupLayout(bin_1);
        bin_1.setLayout(bin_1Layout);
        bin_1Layout.setHorizontalGroup(
            bin_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bin_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bin_1Layout.setVerticalGroup(
            bin_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bin_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        REPORT_7.add(bin_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 400, 350));

        JTab.addTab("7", REPORT_7);

        SALES_8.setkEndColor(new java.awt.Color(42, 142, 142));
        SALES_8.setkStartColor(new java.awt.Color(42, 142, 142));
        SALES_8.setkTransparentControls(false);
        SALES_8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sale_Genset_1.setBackground(new java.awt.Color(0, 117, 128));
        Sale_Genset_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Sale_Genset_2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Sale_Genset_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sale_Genset_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Path_Btn/Purchase_Genset.PNG"))); // NOI18N
        Sale_Genset_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sale_Genset_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Sale_Genset_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Sale_Genset_2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Sale_Genset_1Layout = new javax.swing.GroupLayout(Sale_Genset_1);
        Sale_Genset_1.setLayout(Sale_Genset_1Layout);
        Sale_Genset_1Layout.setHorizontalGroup(
            Sale_Genset_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sale_Genset_1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Sale_Genset_2))
        );
        Sale_Genset_1Layout.setVerticalGroup(
            Sale_Genset_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sale_Genset_1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Sale_Genset_2))
        );

        SALES_8.add(Sale_Genset_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 400, 350));

        Sale_Filter_1.setBackground(new java.awt.Color(0, 117, 128));
        Sale_Filter_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Sale_Filter_2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Sale_Filter_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sale_Filter_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Path_Btn/Purchase_Filter.png"))); // NOI18N
        Sale_Filter_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sale_Filter_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Sale_Filter_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Sale_Filter_2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Sale_Filter_1Layout = new javax.swing.GroupLayout(Sale_Filter_1);
        Sale_Filter_1.setLayout(Sale_Filter_1Layout);
        Sale_Filter_1Layout.setHorizontalGroup(
            Sale_Filter_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sale_Filter_1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Sale_Filter_2))
        );
        Sale_Filter_1Layout.setVerticalGroup(
            Sale_Filter_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Sale_Filter_1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Sale_Filter_2))
        );

        SALES_8.add(Sale_Filter_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 400, 350));

        Sale_Filter_4.setBackground(new java.awt.Color(0, 117, 128));
        Sale_Filter_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Sale_Filter_3.setBackground(new java.awt.Color(253, 254, 255));
        Sale_Filter_3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Sale_Filter_3.setForeground(new java.awt.Color(255, 255, 255));
        Sale_Filter_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sale_Filter_3.setText("FILTER HISTORY");
        Sale_Filter_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sale_Filter_3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Sale_Filter_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Sale_Filter_3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Sale_Filter_4Layout = new javax.swing.GroupLayout(Sale_Filter_4);
        Sale_Filter_4.setLayout(Sale_Filter_4Layout);
        Sale_Filter_4Layout.setHorizontalGroup(
            Sale_Filter_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sale_Filter_4Layout.createSequentialGroup()
                .addComponent(Sale_Filter_3, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Sale_Filter_4Layout.setVerticalGroup(
            Sale_Filter_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sale_Filter_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        SALES_8.add(Sale_Filter_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 400, 45));

        Sale_Genset_4.setBackground(new java.awt.Color(0, 117, 128));
        Sale_Genset_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Sale_Genset_3.setBackground(new java.awt.Color(253, 254, 255));
        Sale_Genset_3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Sale_Genset_3.setForeground(new java.awt.Color(255, 255, 255));
        Sale_Genset_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sale_Genset_3.setText("GENSET HISTORY");
        Sale_Genset_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sale_Genset_3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Sale_Genset_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Sale_Genset_3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Sale_Genset_4Layout = new javax.swing.GroupLayout(Sale_Genset_4);
        Sale_Genset_4.setLayout(Sale_Genset_4Layout);
        Sale_Genset_4Layout.setHorizontalGroup(
            Sale_Genset_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sale_Genset_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );
        Sale_Genset_4Layout.setVerticalGroup(
            Sale_Genset_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sale_Genset_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        SALES_8.add(Sale_Genset_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 400, 45));

        JTab.addTab("8", SALES_8);

        SALES_GENSET_9.setkEndColor(new java.awt.Color(42, 142, 142));
        SALES_GENSET_9.setkStartColor(new java.awt.Color(42, 142, 142));
        SALES_GENSET_9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        history_genset_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        history_genset_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                history_genset_tableMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(history_genset_table);

        SALES_GENSET_9.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 1060, 420));

        Shop_Genset_Panel_Customer5.setBackground(new java.awt.Color(255, 173, 51));
        Shop_Genset_Panel_Customer5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Genset_Customer_list5.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Genset_Customer_list5.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Genset_Customer_list5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset_Customer_list5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Back.png"))); // NOI18N
        Shop_Genset_Customer_list5.setText(" BACK");
        Shop_Genset_Customer_list5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Shop_Genset_Panel_Customer5Layout = new javax.swing.GroupLayout(Shop_Genset_Panel_Customer5);
        Shop_Genset_Panel_Customer5.setLayout(Shop_Genset_Panel_Customer5Layout);
        Shop_Genset_Panel_Customer5Layout.setHorizontalGroup(
            Shop_Genset_Panel_Customer5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Customer_list5, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Shop_Genset_Panel_Customer5Layout.setVerticalGroup(
            Shop_Genset_Panel_Customer5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Customer_list5, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        SALES_GENSET_9.add(Shop_Genset_Panel_Customer5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 210, 50));

        Shop_Genset_Panel_Customer6.setBackground(new java.awt.Color(0, 102, 102));
        Shop_Genset_Panel_Customer6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Genset_Customer_list6.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Genset_Customer_list6.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Genset_Customer_list6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset_Customer_list6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Customer.png"))); // NOI18N
        Shop_Genset_Customer_list6.setText("VIEW ITEM");
        Shop_Genset_Customer_list6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Shop_Genset_Panel_Customer6Layout = new javax.swing.GroupLayout(Shop_Genset_Panel_Customer6);
        Shop_Genset_Panel_Customer6.setLayout(Shop_Genset_Panel_Customer6Layout);
        Shop_Genset_Panel_Customer6Layout.setHorizontalGroup(
            Shop_Genset_Panel_Customer6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Customer_list6, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Shop_Genset_Panel_Customer6Layout.setVerticalGroup(
            Shop_Genset_Panel_Customer6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Customer_list6, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        SALES_GENSET_9.add(Shop_Genset_Panel_Customer6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 210, 50));

        Shop_Genset_Panel_Customer12.setBackground(new java.awt.Color(102, 153, 153));
        Shop_Genset_Panel_Customer12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Genset_Print_Genset.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Genset_Print_Genset.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Genset_Print_Genset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset_Print_Genset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Print.png"))); // NOI18N
        Shop_Genset_Print_Genset.setText(" PRINT");
        Shop_Genset_Print_Genset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Genset_Print_GensetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Genset_Print_GensetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Genset_Print_GensetMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Shop_Genset_Panel_Customer12Layout = new javax.swing.GroupLayout(Shop_Genset_Panel_Customer12);
        Shop_Genset_Panel_Customer12.setLayout(Shop_Genset_Panel_Customer12Layout);
        Shop_Genset_Panel_Customer12Layout.setHorizontalGroup(
            Shop_Genset_Panel_Customer12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Print_Genset, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Shop_Genset_Panel_Customer12Layout.setVerticalGroup(
            Shop_Genset_Panel_Customer12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Print_Genset, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        SALES_GENSET_9.add(Shop_Genset_Panel_Customer12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 210, 50));

        history_searched_genset.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                history_searched_gensetKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                history_searched_gensetKeyReleased(evt);
            }
        });
        SALES_GENSET_9.add(history_searched_genset, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, 30));

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Search.png"))); // NOI18N
        SALES_GENSET_9.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 35, 31));

        jLabel4.setText("jLabel4");
        SALES_GENSET_9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        JTab.addTab("9", SALES_GENSET_9);

        SALES_FILTER_10.setkEndColor(new java.awt.Color(42, 142, 142));
        SALES_FILTER_10.setkStartColor(new java.awt.Color(42, 142, 142));
        SALES_FILTER_10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        history_filter_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        history_filter_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                history_filter_tableMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(history_filter_table);

        SALES_FILTER_10.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 1060, 420));

        Shop_Genset_Panel_Customer3.setBackground(new java.awt.Color(255, 173, 51));
        Shop_Genset_Panel_Customer3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Genset_Customer_list3.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Genset_Customer_list3.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Genset_Customer_list3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset_Customer_list3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Back.png"))); // NOI18N
        Shop_Genset_Customer_list3.setText(" BACK");
        Shop_Genset_Customer_list3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Shop_Genset_Panel_Customer3Layout = new javax.swing.GroupLayout(Shop_Genset_Panel_Customer3);
        Shop_Genset_Panel_Customer3.setLayout(Shop_Genset_Panel_Customer3Layout);
        Shop_Genset_Panel_Customer3Layout.setHorizontalGroup(
            Shop_Genset_Panel_Customer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Customer_list3, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Shop_Genset_Panel_Customer3Layout.setVerticalGroup(
            Shop_Genset_Panel_Customer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Customer_list3, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        SALES_FILTER_10.add(Shop_Genset_Panel_Customer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 210, 50));

        Shop_Genset_Panel_Customer4.setBackground(new java.awt.Color(0, 102, 102));
        Shop_Genset_Panel_Customer4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Genset_Customer_list4.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Genset_Customer_list4.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Genset_Customer_list4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset_Customer_list4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Customer.png"))); // NOI18N
        Shop_Genset_Customer_list4.setText("VIEW ITEM");
        Shop_Genset_Customer_list4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Shop_Genset_Panel_Customer4Layout = new javax.swing.GroupLayout(Shop_Genset_Panel_Customer4);
        Shop_Genset_Panel_Customer4.setLayout(Shop_Genset_Panel_Customer4Layout);
        Shop_Genset_Panel_Customer4Layout.setHorizontalGroup(
            Shop_Genset_Panel_Customer4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Customer_list4, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Shop_Genset_Panel_Customer4Layout.setVerticalGroup(
            Shop_Genset_Panel_Customer4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Customer_list4, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        SALES_FILTER_10.add(Shop_Genset_Panel_Customer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 210, 50));
        SALES_FILTER_10.add(history_id_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 54, 50, 20));

        Shop_Genset_Panel_Customer11.setBackground(new java.awt.Color(102, 153, 153));
        Shop_Genset_Panel_Customer11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Genset_Print_Filter.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Genset_Print_Filter.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Genset_Print_Filter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset_Print_Filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Print.png"))); // NOI18N
        Shop_Genset_Print_Filter.setText(" PRINT");
        Shop_Genset_Print_Filter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Genset_Print_FilterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Genset_Print_FilterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Genset_Print_FilterMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Shop_Genset_Panel_Customer11Layout = new javax.swing.GroupLayout(Shop_Genset_Panel_Customer11);
        Shop_Genset_Panel_Customer11.setLayout(Shop_Genset_Panel_Customer11Layout);
        Shop_Genset_Panel_Customer11Layout.setHorizontalGroup(
            Shop_Genset_Panel_Customer11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Print_Filter, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Shop_Genset_Panel_Customer11Layout.setVerticalGroup(
            Shop_Genset_Panel_Customer11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Print_Filter, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        SALES_FILTER_10.add(Shop_Genset_Panel_Customer11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 210, 50));

        history_searched_filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                history_searched_filterActionPerformed(evt);
            }
        });
        history_searched_filter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                history_searched_filterKeyReleased(evt);
            }
        });
        SALES_FILTER_10.add(history_searched_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, 30));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Search.png"))); // NOI18N
        SALES_FILTER_10.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 35, 31));

        JTab.addTab("10", SALES_FILTER_10);

        BIN_11.setkEndColor(new java.awt.Color(42, 142, 142));
        BIN_11.setkStartColor(new java.awt.Color(42, 142, 142));
        BIN_11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bin_Genset_4.setBackground(new java.awt.Color(0, 117, 128));
        Bin_Genset_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Bin_Genset_3.setBackground(new java.awt.Color(253, 254, 255));
        Bin_Genset_3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Bin_Genset_3.setForeground(new java.awt.Color(255, 255, 255));
        Bin_Genset_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bin_Genset_3.setText("BIN GENSET");
        Bin_Genset_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bin_Genset_3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Bin_Genset_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Bin_Genset_3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Bin_Genset_4Layout = new javax.swing.GroupLayout(Bin_Genset_4);
        Bin_Genset_4.setLayout(Bin_Genset_4Layout);
        Bin_Genset_4Layout.setHorizontalGroup(
            Bin_Genset_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bin_Genset_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );
        Bin_Genset_4Layout.setVerticalGroup(
            Bin_Genset_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bin_Genset_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BIN_11.add(Bin_Genset_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 400, 45));

        Bin_Frilter_4.setBackground(new java.awt.Color(0, 117, 128));
        Bin_Frilter_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Bin_Frilter_3.setBackground(new java.awt.Color(253, 254, 255));
        Bin_Frilter_3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Bin_Frilter_3.setForeground(new java.awt.Color(255, 255, 255));
        Bin_Frilter_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bin_Frilter_3.setText("BIN FILTER / PARTS");
        Bin_Frilter_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bin_Frilter_3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Bin_Frilter_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Bin_Frilter_3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Bin_Frilter_4Layout = new javax.swing.GroupLayout(Bin_Frilter_4);
        Bin_Frilter_4.setLayout(Bin_Frilter_4Layout);
        Bin_Frilter_4Layout.setHorizontalGroup(
            Bin_Frilter_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bin_Frilter_4Layout.createSequentialGroup()
                .addComponent(Bin_Frilter_3, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Bin_Frilter_4Layout.setVerticalGroup(
            Bin_Frilter_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bin_Frilter_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BIN_11.add(Bin_Frilter_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 400, 45));

        Bin_Genset_1.setBackground(new java.awt.Color(0, 117, 128));
        Bin_Genset_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Bin_Genset_2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Bin_Genset_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bin_Genset_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Path_Btn/Bin_Filter.PNG"))); // NOI18N
        Bin_Genset_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bin_Genset_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Bin_Genset_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Bin_Genset_2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Bin_Genset_1Layout = new javax.swing.GroupLayout(Bin_Genset_1);
        Bin_Genset_1.setLayout(Bin_Genset_1Layout);
        Bin_Genset_1Layout.setHorizontalGroup(
            Bin_Genset_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Bin_Genset_1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Bin_Genset_2)
                .addGap(514, 514, 514))
        );
        Bin_Genset_1Layout.setVerticalGroup(
            Bin_Genset_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bin_Genset_1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Bin_Genset_2))
        );

        BIN_11.add(Bin_Genset_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 400, 350));

        Bin_Frilter_1.setBackground(new java.awt.Color(0, 117, 128));
        Bin_Frilter_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Bin_Frilter_2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Bin_Frilter_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bin_Frilter_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Path_Btn/Bin_Genset.png"))); // NOI18N
        Bin_Frilter_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bin_Frilter_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Bin_Frilter_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Bin_Frilter_2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Bin_Frilter_1Layout = new javax.swing.GroupLayout(Bin_Frilter_1);
        Bin_Frilter_1.setLayout(Bin_Frilter_1Layout);
        Bin_Frilter_1Layout.setHorizontalGroup(
            Bin_Frilter_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bin_Frilter_1Layout.createSequentialGroup()
                .addComponent(Bin_Frilter_2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Bin_Frilter_1Layout.setVerticalGroup(
            Bin_Frilter_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Bin_Frilter_1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Bin_Frilter_2))
        );

        BIN_11.add(Bin_Frilter_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 400, 350));

        JTab.addTab("11", BIN_11);

        BIN_GENSET_12.setkEndColor(new java.awt.Color(42, 142, 142));
        BIN_GENSET_12.setkStartColor(new java.awt.Color(42, 142, 142));
        BIN_GENSET_12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Shop_Genset_Panel_Customer7.setBackground(new java.awt.Color(0, 102, 102));
        Shop_Genset_Panel_Customer7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Genset_Customer_list7.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Genset_Customer_list7.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Genset_Customer_list7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset_Customer_list7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_View.png"))); // NOI18N
        Shop_Genset_Customer_list7.setText("VIEW ITEM");
        Shop_Genset_Customer_list7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Shop_Genset_Panel_Customer7Layout = new javax.swing.GroupLayout(Shop_Genset_Panel_Customer7);
        Shop_Genset_Panel_Customer7.setLayout(Shop_Genset_Panel_Customer7Layout);
        Shop_Genset_Panel_Customer7Layout.setHorizontalGroup(
            Shop_Genset_Panel_Customer7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Customer_list7, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Shop_Genset_Panel_Customer7Layout.setVerticalGroup(
            Shop_Genset_Panel_Customer7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Customer_list7, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        BIN_GENSET_12.add(Shop_Genset_Panel_Customer7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 210, 50));

        Shop_Genset_Panel_Customer8.setBackground(new java.awt.Color(255, 173, 51));
        Shop_Genset_Panel_Customer8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Genset_Customer_list8.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Genset_Customer_list8.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Genset_Customer_list8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset_Customer_list8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Back.png"))); // NOI18N
        Shop_Genset_Customer_list8.setText(" BACK");
        Shop_Genset_Customer_list8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list8MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Shop_Genset_Panel_Customer8Layout = new javax.swing.GroupLayout(Shop_Genset_Panel_Customer8);
        Shop_Genset_Panel_Customer8.setLayout(Shop_Genset_Panel_Customer8Layout);
        Shop_Genset_Panel_Customer8Layout.setHorizontalGroup(
            Shop_Genset_Panel_Customer8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Customer_list8, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Shop_Genset_Panel_Customer8Layout.setVerticalGroup(
            Shop_Genset_Panel_Customer8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Customer_list8, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        BIN_GENSET_12.add(Shop_Genset_Panel_Customer8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 210, 50));

        Bin_Genset_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Bin_Genset_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bin_Genset_TableMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(Bin_Genset_Table);

        BIN_GENSET_12.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 1060, 420));
        BIN_GENSET_12.add(bin_genset_ids, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 140, 30));

        jTextField5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });
        BIN_GENSET_12.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 230, 31));

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Search.png"))); // NOI18N
        BIN_GENSET_12.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 35, 31));

        JTab.addTab("12", BIN_GENSET_12);

        BIN_FILTER_13.setkEndColor(new java.awt.Color(42, 142, 142));
        BIN_FILTER_13.setkStartColor(new java.awt.Color(42, 142, 142));
        BIN_FILTER_13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bin_Filter_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Bin_Filter_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bin_Filter_TableMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(Bin_Filter_Table);

        BIN_FILTER_13.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 1070, 420));

        Shop_Genset_Panel_Customer13.setBackground(new java.awt.Color(0, 102, 102));
        Shop_Genset_Panel_Customer13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Genset_Customer_list11.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Genset_Customer_list11.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Genset_Customer_list11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset_Customer_list11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_View.png"))); // NOI18N
        Shop_Genset_Customer_list11.setText("VIEW ITEM");
        Shop_Genset_Customer_list11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list11MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Shop_Genset_Panel_Customer13Layout = new javax.swing.GroupLayout(Shop_Genset_Panel_Customer13);
        Shop_Genset_Panel_Customer13.setLayout(Shop_Genset_Panel_Customer13Layout);
        Shop_Genset_Panel_Customer13Layout.setHorizontalGroup(
            Shop_Genset_Panel_Customer13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Customer_list11, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Shop_Genset_Panel_Customer13Layout.setVerticalGroup(
            Shop_Genset_Panel_Customer13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Customer_list11, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        BIN_FILTER_13.add(Shop_Genset_Panel_Customer13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 210, 50));

        Shop_Genset_Panel_Customer14.setBackground(new java.awt.Color(255, 173, 51));
        Shop_Genset_Panel_Customer14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Genset_Customer_list12.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Genset_Customer_list12.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Genset_Customer_list12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset_Customer_list12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Back.png"))); // NOI18N
        Shop_Genset_Customer_list12.setText(" BACK");
        Shop_Genset_Customer_list12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list12MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Shop_Genset_Panel_Customer14Layout = new javax.swing.GroupLayout(Shop_Genset_Panel_Customer14);
        Shop_Genset_Panel_Customer14.setLayout(Shop_Genset_Panel_Customer14Layout);
        Shop_Genset_Panel_Customer14Layout.setHorizontalGroup(
            Shop_Genset_Panel_Customer14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Customer_list12, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Shop_Genset_Panel_Customer14Layout.setVerticalGroup(
            Shop_Genset_Panel_Customer14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Customer_list12, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        BIN_FILTER_13.add(Shop_Genset_Panel_Customer14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 210, 50));
        BIN_FILTER_13.add(bin_filter_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 140, 30));

        jTextField6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });
        BIN_FILTER_13.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 230, 31));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Search.png"))); // NOI18N
        BIN_FILTER_13.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 35, 31));

        JTab.addTab("13", BIN_FILTER_13);

        STATUS_14.setkEndColor(new java.awt.Color(42, 142, 142));
        STATUS_14.setkStartColor(new java.awt.Color(42, 142, 142));
        STATUS_14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Status_Genset_4.setBackground(new java.awt.Color(0, 117, 128));
        Status_Genset_4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(243, 246, 26)));

        Status_Genset_3.setBackground(new java.awt.Color(253, 254, 255));
        Status_Genset_3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Status_Genset_3.setForeground(new java.awt.Color(255, 255, 255));
        Status_Genset_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Status_Genset_3.setText("GENSET");
        Status_Genset_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Status_Genset_3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Status_Genset_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Status_Genset_3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Status_Genset_4Layout = new javax.swing.GroupLayout(Status_Genset_4);
        Status_Genset_4.setLayout(Status_Genset_4Layout);
        Status_Genset_4Layout.setHorizontalGroup(
            Status_Genset_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Status_Genset_3, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );
        Status_Genset_4Layout.setVerticalGroup(
            Status_Genset_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Status_Genset_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        STATUS_14.add(Status_Genset_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 400, 45));

        Status_Genset_1.setBackground(new java.awt.Color(0, 117, 128));
        Status_Genset_1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(243, 246, 26)));
        Status_Genset_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Status_Genset_2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Status_Genset_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Status_Genset_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Path_Btn/Chart_Genset.PNG"))); // NOI18N
        Status_Genset_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Status_Genset_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Status_Genset_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Status_Genset_2MouseExited(evt);
            }
        });
        Status_Genset_1.add(Status_Genset_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 350));

        STATUS_14.add(Status_Genset_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 400, 350));

        Status_Filter_1.setBackground(new java.awt.Color(0, 117, 128));
        Status_Filter_1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(243, 246, 26)));
        Status_Filter_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Status_Filter_2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Status_Filter_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Status_Filter_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Path_Btn/Chart_Filter.png"))); // NOI18N
        Status_Filter_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Status_Filter_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Status_Filter_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Status_Filter_2MouseExited(evt);
            }
        });
        Status_Filter_1.add(Status_Filter_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        STATUS_14.add(Status_Filter_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 400, 350));

        Status_Filter_4.setBackground(new java.awt.Color(0, 117, 128));
        Status_Filter_4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(243, 246, 26)));

        Status_Filter_3.setBackground(new java.awt.Color(253, 254, 255));
        Status_Filter_3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Status_Filter_3.setForeground(new java.awt.Color(255, 255, 255));
        Status_Filter_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Status_Filter_3.setText("FILTER / PARTS");
        Status_Filter_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Status_Filter_3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Status_Filter_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Status_Filter_3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Status_Filter_4Layout = new javax.swing.GroupLayout(Status_Filter_4);
        Status_Filter_4.setLayout(Status_Filter_4Layout);
        Status_Filter_4Layout.setHorizontalGroup(
            Status_Filter_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Status_Filter_4Layout.createSequentialGroup()
                .addComponent(Status_Filter_3, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Status_Filter_4Layout.setVerticalGroup(
            Status_Filter_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Status_Filter_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        STATUS_14.add(Status_Filter_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 400, 45));

        JTab.addTab("14", STATUS_14);

        STATUS_GENSET_15.setkEndColor(new java.awt.Color(42, 142, 142));
        STATUS_GENSET_15.setkStartColor(new java.awt.Color(42, 142, 142));
        STATUS_GENSET_15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Genset_Graph.setLayout(new java.awt.BorderLayout());
        STATUS_GENSET_15.add(Genset_Graph, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 870, 450));

        Stock_Genset_Panel_Back1.setBackground(new java.awt.Color(255, 173, 51));
        Stock_Genset_Panel_Back1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Stock_Genset_Back1.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Back1.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Back1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Back.png"))); // NOI18N
        Stock_Genset_Back1.setText(" BACK");
        Stock_Genset_Back1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Genset_Back1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Genset_Back1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Genset_Back1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_Back1Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_Back1);
        Stock_Genset_Panel_Back1.setLayout(Stock_Genset_Panel_Back1Layout);
        Stock_Genset_Panel_Back1Layout.setHorizontalGroup(
            Stock_Genset_Panel_Back1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Back1Layout.setVerticalGroup(
            Stock_Genset_Panel_Back1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        STATUS_GENSET_15.add(Stock_Genset_Panel_Back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, 210, 50));

        Shop_Genset_Panel_Customer9.setBackground(new java.awt.Color(0, 102, 102));
        Shop_Genset_Panel_Customer9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Genset_Customer_list9.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Genset_Customer_list9.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Genset_Customer_list9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset_Customer_list9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Customer.png"))); // NOI18N
        Shop_Genset_Customer_list9.setText(" VIEW SALES");
        Shop_Genset_Customer_list9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list9MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Shop_Genset_Panel_Customer9Layout = new javax.swing.GroupLayout(Shop_Genset_Panel_Customer9);
        Shop_Genset_Panel_Customer9.setLayout(Shop_Genset_Panel_Customer9Layout);
        Shop_Genset_Panel_Customer9Layout.setHorizontalGroup(
            Shop_Genset_Panel_Customer9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Customer_list9, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Shop_Genset_Panel_Customer9Layout.setVerticalGroup(
            Shop_Genset_Panel_Customer9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Customer_list9, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        STATUS_GENSET_15.add(Shop_Genset_Panel_Customer9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 210, 50));

        JTab.addTab("15", STATUS_GENSET_15);

        STATUS_FILTER_16.setkEndColor(new java.awt.Color(42, 142, 142));
        STATUS_FILTER_16.setkStartColor(new java.awt.Color(42, 142, 142));
        STATUS_FILTER_16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Filter_Graph.setLayout(new java.awt.BorderLayout());
        STATUS_FILTER_16.add(Filter_Graph, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 870, 450));

        Stock_Genset_Panel_Back2.setBackground(new java.awt.Color(255, 173, 51));
        Stock_Genset_Panel_Back2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

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
            .addComponent(Stock_Genset_Back2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Back2Layout.setVerticalGroup(
            Stock_Genset_Panel_Back2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Back2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        STATUS_FILTER_16.add(Stock_Genset_Panel_Back2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, 210, 50));

        Shop_Genset_Panel_Customer10.setBackground(new java.awt.Color(0, 102, 102));
        Shop_Genset_Panel_Customer10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Genset_Customer_list10.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Genset_Customer_list10.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Genset_Customer_list10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset_Customer_list10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Customer.png"))); // NOI18N
        Shop_Genset_Customer_list10.setText(" VIEW SALES");
        Shop_Genset_Customer_list10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Genset_Customer_list10MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Shop_Genset_Panel_Customer10Layout = new javax.swing.GroupLayout(Shop_Genset_Panel_Customer10);
        Shop_Genset_Panel_Customer10.setLayout(Shop_Genset_Panel_Customer10Layout);
        Shop_Genset_Panel_Customer10Layout.setHorizontalGroup(
            Shop_Genset_Panel_Customer10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Customer_list10, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Shop_Genset_Panel_Customer10Layout.setVerticalGroup(
            Shop_Genset_Panel_Customer10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Customer_list10, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        STATUS_FILTER_16.add(Shop_Genset_Panel_Customer10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 210, 50));

        JTab.addTab("16", STATUS_FILTER_16);

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

    private void LOGOUT_LABEL1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUT_LABEL1MouseEntered
//        LOGOUT_LABEL1.setForeground(new Color(41, 61, 61));
        LOGOUT_PANEL.setBackground(new Color(0,137,148));
    }//GEN-LAST:event_LOGOUT_LABEL1MouseEntered

    private void LOGOUT_LABEL1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUT_LABEL1MouseExited
        LOGOUT_LABEL1.setForeground(new Color(255,255,255));
        LOGOUT_PANEL.setBackground(new Color(0, 117, 128));
    }//GEN-LAST:event_LOGOUT_LABEL1MouseExited

    private void STOCKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STOCKMouseClicked
        Dashboard_Display_1.setForeground(new Color(243,246,26));
        Dashboard_Display_1.setText("STOCK");
        Dashboard_Display_2.setText(null);
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(1);
    }//GEN-LAST:event_STOCKMouseClicked

    private void STOCKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STOCKMouseEntered
//        STOCK.setForeground(new Color(41, 61, 61));
        STOCK_PANEL.setBackground(new Color(0,137,148));
    }//GEN-LAST:event_STOCKMouseEntered

    private void STOCKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STOCKMouseExited
        STOCK.setForeground(new Color(255,255,255));
        STOCK_PANEL.setBackground(new Color(0, 117, 128));
    }//GEN-LAST:event_STOCKMouseExited

    private void SHOPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHOPMouseClicked
        Dashboard_Display_1.setForeground(new Color(243,246,26));
        Dashboard_Display_1.setText("SHOP");
        Dashboard_Display_2.setText(null);
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(4);
    }//GEN-LAST:event_SHOPMouseClicked

    private void SHOPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHOPMouseEntered
//        SHOP.setForeground(new Color(41, 61, 61));
        SHOP_PANEL.setBackground(new Color(0,137,148));

    }//GEN-LAST:event_SHOPMouseEntered

    private void SHOPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHOPMouseExited
        SHOP.setForeground(new Color(255,255,255));
        SHOP_PANEL.setBackground(new Color(0, 117, 128));
    }//GEN-LAST:event_SHOPMouseExited

    private void STATUSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STATUSMouseClicked
        Dashboard_Display_1.setForeground(new Color(243,246,26));
        Dashboard_Display_1.setText("STATUS");
        Dashboard_Display_2.setText(null);
        Dashboard_Display_3.setText(null);
        Graph();
        JTab.setSelectedIndex(14);
    }//GEN-LAST:event_STATUSMouseClicked

    private void STATUSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STATUSMouseEntered
//        STATUS.setForeground(new Color(41, 61, 61));
        STATUS_PANEL.setBackground(new Color(0,137,148));
    }//GEN-LAST:event_STATUSMouseEntered

    private void STATUSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STATUSMouseExited
        STATUS.setForeground(new Color(255,255,255));
        STATUS_PANEL.setBackground(new Color(0, 117, 128));
    }//GEN-LAST:event_STATUSMouseExited

    private void LOGOUT_LABEL1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUT_LABEL1MouseClicked
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LOGOUT_LABEL1MouseClicked

    private void processMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_processMouseExited
        update_panel_supplier.setBackground(new Color(255, 153, 102));
    }//GEN-LAST:event_processMouseExited

    private void processMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_processMouseEntered
        update_panel_supplier.setBackground(new Color(255,173,122));
    }//GEN-LAST:event_processMouseEntered

    private void processMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_processMouseClicked

        if(cartIfEmpty.getText().equals("1")){
            // empty cart
            JOptionPane.showMessageDialog(null, "PLEASE ADD CART ITEM BEFORE PROCESSED!","",JOptionPane.WARNING_MESSAGE);
        }
        else{
            if(cartIfEmpty.getText().equals("2")){
                AddCart pf = new AddCart();
                pf.setVisible(true);
            }
        }
    }//GEN-LAST:event_processMouseClicked

    private void Shop_Filter_customerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Filter_customerMouseExited
         Shop_Filter_Panel_Customer_list.setBackground(new Color(51,153,102));
    }//GEN-LAST:event_Shop_Filter_customerMouseExited

    private void Shop_Filter_customerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Filter_customerMouseEntered
        Shop_Filter_Panel_Customer_list.setBackground(new Color(51,173,122));
    }//GEN-LAST:event_Shop_Filter_customerMouseEntered

    private void Shop_Filter_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Filter_customerMouseClicked
        Table_Customer cus = new Table_Customer();
        Table_Customer.Add.setText("ADD CUSTOMER");
        Table_Customer.Path.setText("1");
        cus.setVisible(true);
    }//GEN-LAST:event_Shop_Filter_customerMouseClicked

    private void Shop_Filter_viewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Filter_viewMouseExited
        Shop_Filter_Panel_view.setBackground(new Color(0, 107,179));
    }//GEN-LAST:event_Shop_Filter_viewMouseExited

    private void Shop_Filter_viewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Filter_viewMouseEntered
        Shop_Filter_Panel_view.setBackground(new Color(0,127,199));
    }//GEN-LAST:event_Shop_Filter_viewMouseEntered

    private void Shop_Filter_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Filter_viewMouseClicked
        String id = Shop_filter_id.getText();
        if(id.equals(""))
        {
            JOptionPane.showMessageDialog(null, " SELECT ITEM !!","",JOptionPane.ERROR_MESSAGE);
        }else{
            View_Shop_Filter vsf = new View_Shop_Filter();
            vsf.setVisible(true);
        }
    }//GEN-LAST:event_Shop_Filter_viewMouseClicked

    private void Shop_Filter_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Filter_backMouseExited
        Shop_Gensetr_view.setForeground(new Color(255,255,255));
        Shop_Filter_Panel_Back.setBackground(new Color(255,173,51));
        
    }//GEN-LAST:event_Shop_Filter_backMouseExited

    private void Shop_Filter_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Filter_backMouseEntered
        Shop_Filter_Panel_Back.setBackground(new Color(255,193,71));
    }//GEN-LAST:event_Shop_Filter_backMouseEntered

    private void Shop_Filter_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Filter_backMouseClicked
        Dashboard_Display_1.setForeground(new Color(243,246,26));
        Dashboard_Display_2.setText(null);
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(4);
        JTab.setSelectedIndex(4);
    }//GEN-LAST:event_Shop_Filter_backMouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        DefaultTableModel tm = (DefaultTableModel)Shop_Filter_Table.getModel();
        String find = jTextField1.getText().toUpperCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
        Shop_Filter_Table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(find));
    }//GEN-LAST:event_jTextField1KeyPressed

    private void Shop_Filter_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Filter_TableMouseClicked
        int i=Shop_Filter_Table.getSelectedRow();
        TableModel model = Shop_Filter_Table.getModel();
        Shop_filter_id.setText(model.getValueAt(i,0).toString());
    }//GEN-LAST:event_Shop_Filter_TableMouseClicked

    private void Shop_Genset_Customer_listMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_listMouseExited
        Shop_Genset_Panel_Customer.setBackground(new Color(51,153,102));
    }//GEN-LAST:event_Shop_Genset_Customer_listMouseExited

    private void Shop_Genset_Customer_listMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_listMouseEntered
        Shop_Genset_Panel_Customer.setBackground(new Color(51,173,122));
    }//GEN-LAST:event_Shop_Genset_Customer_listMouseEntered

    private void Shop_Genset_Customer_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_listMouseClicked
        Table_Customer cus = new Table_Customer();
        Table_Customer.Add.setText("ADD CUSTOMER");
        Table_Customer.Path.setText("1");
        cus.setVisible(true);
    }//GEN-LAST:event_Shop_Genset_Customer_listMouseClicked

    private void Shop_Gensetr_viewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Gensetr_viewMouseExited
        Shop_Genset_Panel_view.setBackground(new Color(0, 107, 179));
    }//GEN-LAST:event_Shop_Gensetr_viewMouseExited

    private void Shop_Gensetr_viewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Gensetr_viewMouseEntered
        Shop_Genset_Panel_view.setBackground(new Color(0,127,199));
    }//GEN-LAST:event_Shop_Gensetr_viewMouseEntered

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

    private void Shop_Genset_Panel_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Panel_BackMouseExited
        Shop_Genset_Panel_back.setBackground(new Color(255,173,51));
    }//GEN-LAST:event_Shop_Genset_Panel_BackMouseExited

    private void Shop_Genset_Panel_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Panel_BackMouseEntered
        Shop_Genset_Panel_back.setBackground(new Color(255,193,71));
    }//GEN-LAST:event_Shop_Genset_Panel_BackMouseEntered

    private void Shop_Genset_Panel_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Panel_BackMouseClicked
        Dashboard_Display_1.setForeground(new Color(243,246,26));
        Dashboard_Display_2.setText(null);
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(4);
        
    }//GEN-LAST:event_Shop_Genset_Panel_BackMouseClicked

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        DefaultTableModel tm = (DefaultTableModel)Shop_Genset_Table.getModel();
        String find = jTextField2.getText().toUpperCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
        Shop_Genset_Table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(find));
    }//GEN-LAST:event_jTextField2KeyPressed

    private void Shop_Genset_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_TableMouseClicked
        int i=Shop_Genset_Table.getSelectedRow();
        TableModel model = Shop_Genset_Table.getModel();
        Shop_genset_id.setText(model.getValueAt(i,0).toString());
    }//GEN-LAST:event_Shop_Genset_TableMouseClicked

    private void Shop_Genset_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_2MouseExited
        Shop_Genset_2.setForeground(new Color(255,255,255));  
        ShopFilter_Genset_1.setBackground(new Color(0,117,128));
        Shop_Genset_3.setBackground(new Color(0,117,128));
    }//GEN-LAST:event_Shop_Genset_2MouseExited

    private void Shop_Genset_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_2MouseEntered
        ShopFilter_Genset_1.setBackground(new Color(0,137,148));
        Shop_Genset_3.setBackground(new Color(0,137,148));
    }//GEN-LAST:event_Shop_Genset_2MouseEntered

    private void Shop_Genset_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset_2MouseClicked

    private void ShopFilter_Parts_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShopFilter_Parts_2MouseExited
        ShopFilter_Parts_2.setForeground(new Color(255,255,255));  
        ShopFilter_Parts_1.setBackground(new Color(0,117,128));
        ShopFilter_Parts_3.setBackground(new Color(0,117,128));
    }//GEN-LAST:event_ShopFilter_Parts_2MouseExited

    private void ShopFilter_Parts_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShopFilter_Parts_2MouseEntered
//        ShopFilter_Parts_2.setForeground(new Color(41, 61, 61));
        ShopFilter_Parts_1.setBackground(new Color(0,137,148));
        ShopFilter_Parts_3.setBackground(new Color(0,117,128));
    }//GEN-LAST:event_ShopFilter_Parts_2MouseEntered

    private void ShopFilter_Parts_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShopFilter_Parts_2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ShopFilter_Parts_2MouseClicked

    private void Shop_FilterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_FilterMouseExited
        ShopFilter_Parts_1.setBackground(new Color(0,117,128));
        ShopFilter_Parts_3.setBackground(new Color(0,117,128));
    }//GEN-LAST:event_Shop_FilterMouseExited

    private void Shop_FilterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_FilterMouseEntered
//        ShopFilter_Parts_2.setForeground(new Color(41, 61, 61));
        ShopFilter_Parts_1.setBackground(new Color(0,137,148));
        ShopFilter_Parts_3.setBackground(new Color(0,117,128));
    }//GEN-LAST:event_Shop_FilterMouseEntered

    private void Shop_FilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_FilterMouseClicked
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(243,246,26));
        Dashboard_Display_2.setText("SHOP FILTER");
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(6);
        
    }//GEN-LAST:event_Shop_FilterMouseClicked

    private void Shop_GensetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_GensetMouseExited
        Shop_Genset_2.setForeground(new Color(255,255,255));  
        ShopFilter_Genset_1.setBackground(new Color(0,117,128));
        Shop_Genset_3.setBackground(new Color(0,117,128));

    }//GEN-LAST:event_Shop_GensetMouseExited

    private void Shop_GensetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_GensetMouseEntered
//        Shop_Genset_2.setForeground(new Color(41, 61, 61));
        ShopFilter_Genset_1.setBackground(new Color(0,137,148));
        Shop_Genset_3.setBackground(new Color(0,137,148));
    }//GEN-LAST:event_Shop_GensetMouseEntered

    private void Shop_GensetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_GensetMouseClicked

        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(243,246,26));
        Dashboard_Display_2.setText("SHOP GENSET");
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(5);
    }//GEN-LAST:event_Shop_GensetMouseClicked

    private void Stock_Filter_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_backMouseExited
        Stock_Filter_Panel_back.setBackground(new Color(255,173,51));
    }//GEN-LAST:event_Stock_Filter_backMouseExited

    private void Stock_Filter_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_backMouseEntered
        Stock_Filter_Panel_back.setBackground(new Color(255,193,71));
    }//GEN-LAST:event_Stock_Filter_backMouseEntered

    private void Stock_Filter_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_backMouseClicked
        Dashboard_Display_1.setForeground(new Color(243,246,26));
        Dashboard_Display_2.setText(null);
        Dashboard_Display_3.setText(null); 
        JTab.setSelectedIndex(1);
    }//GEN-LAST:event_Stock_Filter_backMouseClicked

    private void Stock_Filter_viewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_viewMouseExited
        Stock_Filter_Panel_view.setBackground(new Color(0, 107, 179));
    }//GEN-LAST:event_Stock_Filter_viewMouseExited

    private void Stock_Filter_viewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_viewMouseEntered
        Stock_Filter_Panel_view.setBackground(new Color(0, 127, 199));
    }//GEN-LAST:event_Stock_Filter_viewMouseEntered

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

    private void Stock_Filter_AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_AddMouseExited
        Stock_Filter_Panel_Add.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_Stock_Filter_AddMouseExited

    private void Stock_Filter_AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_AddMouseEntered

        Stock_Filter_Panel_Add.setBackground(new Color(0,122,122));
    }//GEN-LAST:event_Stock_Filter_AddMouseEntered

    private void Stock_Filter_AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_AddMouseClicked
        Insert_Inventory_Filter iig = new Insert_Inventory_Filter();
        iig.setVisible(true);
        Insert_Inventory_Filter.Inventory_Display.setText("ADD FILTER PRODUCT");
        Insert_Inventory_Filter.Insert_Invetory_Filter_id.setEditable(false);
        Insert_Inventory_Filter.Insert_Filter_Supplier_id.setEditable(false);
    }//GEN-LAST:event_Stock_Filter_AddMouseClicked

    private void Stock_Filter_supplier_listMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_supplier_listMouseExited
        Stock_Filter_Panel_Supplier.setBackground(new Color(153,153,102));
    }//GEN-LAST:event_Stock_Filter_supplier_listMouseExited

    private void Stock_Filter_supplier_listMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_supplier_listMouseEntered
        Stock_Filter_Panel_Supplier.setBackground(new Color(153,173,122));
    }//GEN-LAST:event_Stock_Filter_supplier_listMouseEntered

    private void Stock_Filter_supplier_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_supplier_listMouseClicked
        Table_Supplier tbs = new Table_Supplier();
        Table_Supplier.Add.setText("ADD SUPPLIER");
        Table_Supplier.Path.setText("1");
        Table_Supplier.supplier_id.setText("");
        tbs.setVisible(true);
    }//GEN-LAST:event_Stock_Filter_supplier_listMouseClicked

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        DefaultTableModel tm = (DefaultTableModel)Stock_Filter_Table.getModel();
        String find = jTextField4.getText().toUpperCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
        Stock_Filter_Table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(find));
    }//GEN-LAST:event_jTextField4KeyPressed

    private void Stock_Filter_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_TableMouseClicked
        int i=Stock_Filter_Table.getSelectedRow();
        TableModel model = Stock_Filter_Table.getModel();
        filter_id.setText(model.getValueAt(i,0).toString());
    }//GEN-LAST:event_Stock_Filter_TableMouseClicked

    private void Stock_Genset_ViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_ViewMouseExited
    
        Stock_Genset_Panel_View.setBackground(new Color(0, 107, 179));
       
    }//GEN-LAST:event_Stock_Genset_ViewMouseExited

    private void Stock_Genset_ViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_ViewMouseEntered
      
        Stock_Genset_Panel_View.setBackground(new Color(0,127,199));
    }//GEN-LAST:event_Stock_Genset_ViewMouseEntered

    private void Stock_Genset_ViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_ViewMouseClicked
        String id = Genset_id.getText();
        if(id.equals("")){
            JOptionPane.showMessageDialog(null, " SELECT GENSET !! ","",JOptionPane.ERROR_MESSAGE);
        }
        else{
            View_Stock_Genset vsg = new View_Stock_Genset();
            vsg.setVisible(true);
        }

    }//GEN-LAST:event_Stock_Genset_ViewMouseClicked

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        DefaultTableModel tm = (DefaultTableModel)Stock_Genset_Table.getModel();
        String find = jTextField3.getText().toUpperCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
        Stock_Genset_Table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(find));
    }//GEN-LAST:event_jTextField3KeyPressed

    private void Stock_Genset_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_TableMouseClicked
        int i=Stock_Genset_Table.getSelectedRow();
        TableModel model = Stock_Genset_Table.getModel();
        Genset_id.setText(model.getValueAt(i,0).toString());

    }//GEN-LAST:event_Stock_Genset_TableMouseClicked

    private void Stock_Genset_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseExited
        Stock_Genset_Panel_Back.setBackground(new Color(255,173,51));
    }//GEN-LAST:event_Stock_Genset_BackMouseExited

    private void Stock_Genset_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseEntered
        Stock_Genset_Panel_Back.setBackground(new Color(255, 193, 71));
    }//GEN-LAST:event_Stock_Genset_BackMouseEntered

    private void Stock_Genset_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseClicked
        Dashboard_Display_1.setForeground(new Color(243,246,26));
        Dashboard_Display_2.setText(null);
        Dashboard_Display_3.setText(null); 
        JTab.setSelectedIndex(1);
    }//GEN-LAST:event_Stock_Genset_BackMouseClicked

    private void Stock_Genset_SupplierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_SupplierMouseExited
        Stock_Genset_Panel_Supplier.setBackground(new Color(153,153,102));
    }//GEN-LAST:event_Stock_Genset_SupplierMouseExited

    private void Stock_Genset_SupplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_SupplierMouseEntered
        Stock_Genset_Panel_Supplier.setBackground(new Color(153,173,122));
    }//GEN-LAST:event_Stock_Genset_SupplierMouseEntered

    private void Stock_Genset_SupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_SupplierMouseClicked
        Table_Supplier tbs = new Table_Supplier();
        Table_Supplier.Add.setText("ADD SUPPLIER");
        Table_Supplier.Path.setText("1");
        Table_Supplier.supplier_id.setText("");
        tbs.setVisible(true);
    }//GEN-LAST:event_Stock_Genset_SupplierMouseClicked

    private void Stock_Genset_AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_AddMouseExited
       Stock_Genset_Panel_Add.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_Stock_Genset_AddMouseExited

    private void Stock_Genset_AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_AddMouseEntered
       Stock_Genset_Panel_Add.setBackground(new Color(0,122,122));
    }//GEN-LAST:event_Stock_Genset_AddMouseEntered

    private void Stock_Genset_AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_AddMouseClicked
        Insert_Inventory_Genset iig = new Insert_Inventory_Genset();
        iig.setVisible(true);
        Insert_Inventory_Genset.Inventory_Display.setText("ADD GENSET PRODUCT");
        Insert_Inventory_Genset.Insert_Invetory_Genset_id.setEditable(false);
        Insert_Inventory_Genset.Insert_Invetory_Supplier_id.setEditable(false);
        Insert_Inventory_Genset.Energized.setVisible(false);
        Insert_Inventory_Genset.Panel_Energized.setVisible(false);

    }//GEN-LAST:event_Stock_Genset_AddMouseClicked

    private void Stock_Genset_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_3MouseExited
      //  Stock_Genset_3.setForeground(new Color(255,255,255));
        Stock_Genset_4.setBackground(new Color(0,117,128));
        Stock_Genset_1.setBackground(new Color(0,117,128));
    }//GEN-LAST:event_Stock_Genset_3MouseExited

    private void Stock_Genset_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_3MouseEntered
//        Stock_Genset_3.setForeground(new Color(41, 61, 61));
        Stock_Genset_4.setBackground(new Color(0,137,148));
        Stock_Genset_1.setBackground(new Color(0,137,148));
    }//GEN-LAST:event_Stock_Genset_3MouseEntered

    private void Stock_Genset_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_3MouseClicked

    }//GEN-LAST:event_Stock_Genset_3MouseClicked

    private void Stock_Filter_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_3MouseExited
    //    Stock_Filter_3.setForeground(new Color(255,255,255));
        Stock_Filter_1.setBackground(new Color(0,117,128));
        Stock_Filter_4.setBackground(new Color(0,117,128));
    }//GEN-LAST:event_Stock_Filter_3MouseExited

    private void Stock_Filter_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_3MouseEntered
//        Stock_Filter_3.setForeground(new Color(41, 61, 61));
        Stock_Filter_4.setBackground(new Color(0,137,148));
        Stock_Filter_1.setBackground(new Color(0,137,148));
    }//GEN-LAST:event_Stock_Filter_3MouseEntered

    private void Stock_Filter_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Filter_3MouseClicked

    private void Stock_Genset_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_2MouseExited
       // Stock_Genset_3.setForeground(new Color(255,255,255));
        Stock_Genset_4.setBackground(new Color(0,117,128));
        Stock_Genset_1.setBackground(new Color(0,117,128));
    }//GEN-LAST:event_Stock_Genset_2MouseExited

    private void Stock_Genset_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_2MouseEntered
//        Stock_Genset_3.setForeground(new Color(41, 61, 61));
        Stock_Genset_4.setBackground(new Color(0,137,148));
        Stock_Genset_1.setBackground(new Color(0,137,148));
    }//GEN-LAST:event_Stock_Genset_2MouseEntered

    private void Stock_Genset_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_2MouseClicked
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(243,246,26));
        Dashboard_Display_2.setText("GENSET");
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(2);
    }//GEN-LAST:event_Stock_Genset_2MouseClicked

    private void Stock_Filter_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_2MouseExited
      //  Stock_Filter_3.setForeground(new Color(255,255,255));
        Stock_Filter_1.setBackground(new Color(0,117,128));
        Stock_Filter_4.setBackground(new Color(0,117,128));
        
    }//GEN-LAST:event_Stock_Filter_2MouseExited

    private void Stock_Filter_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_2MouseEntered
//        Stock_Filter_3.setForeground(new Color(41, 61, 61));
        Stock_Filter_4.setBackground(new Color(0,137,148));
        Stock_Filter_1.setBackground(new Color(0,137,148));
    }//GEN-LAST:event_Stock_Filter_2MouseEntered

    private void Stock_Filter_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_2MouseClicked
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(243,246,26));
        Dashboard_Display_2.setText("FILTER / PARTS");
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(3);
    }//GEN-LAST:event_Stock_Filter_2MouseClicked

    private void history_genset_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_history_genset_tableMouseClicked
        int i=history_genset_table.getSelectedRow();
        TableModel model = history_genset_table.getModel();
        jLabel4.setText(model.getValueAt(i,0).toString());
    }//GEN-LAST:event_history_genset_tableMouseClicked

    private void history_filter_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_history_filter_tableMouseClicked
        int i=history_filter_table.getSelectedRow();
        TableModel model = history_filter_table.getModel();
        history_id_filter.setText(model.getValueAt(i,0).toString());
    }//GEN-LAST:event_history_filter_tableMouseClicked

    private void Shop_Genset_Customer_list3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list3MouseClicked
        String path = pat_back_filter.getText();
       if(path.equals("1"))
       {
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(243,246,26));
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(9);  
       }else if(path.equals("2"))
       {
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(243,246,26));
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(16);  
       }
       pat_back_filter.setText(null);
    }//GEN-LAST:event_Shop_Genset_Customer_list3MouseClicked

    private void Shop_Genset_Customer_list3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list3MouseEntered
         Shop_Genset_Panel_Customer3.setBackground(new Color(255,193,71));
    }//GEN-LAST:event_Shop_Genset_Customer_list3MouseEntered

    private void Shop_Genset_Customer_list3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list3MouseExited
        // TODO add your handling code here:[255,173,51]
        Shop_Genset_Panel_Customer3.setBackground(new Color(255,173,51));
    }//GEN-LAST:event_Shop_Genset_Customer_list3MouseExited

    private void Shop_Genset_Customer_list4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list4MouseClicked
        History_Fitler hf = new History_Fitler();
        if(history_id_filter.getText().equals("")){
            JOptionPane.showMessageDialog(null, "PLEASE SELECT!","",JOptionPane.INFORMATION_MESSAGE);
        }else{
        History_Fitler.History_Shop_Filter_id.setText(history_id_filter.getText());
        hf.setVisible(true);
        }
    }//GEN-LAST:event_Shop_Genset_Customer_list4MouseClicked

    private void Shop_Genset_Customer_list4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list4MouseEntered
        // TODO add your handling code here:[0,102,102]
        Shop_Genset_Panel_Customer4.setBackground(new Color(0,122,122));
    }//GEN-LAST:event_Shop_Genset_Customer_list4MouseEntered

    private void Shop_Genset_Customer_list4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list4MouseExited
        // TODO add your handling code here:
        Shop_Genset_Panel_Customer4.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_Shop_Genset_Customer_list4MouseExited

    private void Shop_Genset_Customer_list5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list5MouseClicked
       String path = pat_back_genset.getText();
       if(path.equals("1"))
       {
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(243,246,26));
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(8);  
       }else if(path.equals("2"))
       {
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(243,246,26));
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(15);  
       }
       pat_back_genset.setText(null);
    }//GEN-LAST:event_Shop_Genset_Customer_list5MouseClicked

    private void Shop_Genset_Customer_list5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list5MouseEntered
         Shop_Genset_Panel_Customer5.setBackground(new Color(255,193,71));
    }//GEN-LAST:event_Shop_Genset_Customer_list5MouseEntered

    private void Shop_Genset_Customer_list5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list5MouseExited
         Shop_Genset_Panel_Customer5.setBackground(new Color(255,173,51));
    }//GEN-LAST:event_Shop_Genset_Customer_list5MouseExited

    private void Shop_Genset_Customer_list6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list6MouseClicked
        History_Genset hg = new History_Genset();
        
        if(jLabel4.getText().equals("")){
            JOptionPane.showMessageDialog(null, "PLEASE SELECT !!","",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            History_Genset.history_genset_id.setText(jLabel4.getText());
            hg.setVisible(true);            
        }

       
    }//GEN-LAST:event_Shop_Genset_Customer_list6MouseClicked

    private void Shop_Genset_Customer_list6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list6MouseEntered
       Shop_Genset_Panel_Customer6.setBackground(new Color(0,122,122));
    }//GEN-LAST:event_Shop_Genset_Customer_list6MouseEntered

    private void Shop_Genset_Customer_list6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list6MouseExited
        Shop_Genset_Panel_Customer6.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_Shop_Genset_Customer_list6MouseExited

    private void Shop_Genset_Customer_list7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list7MouseClicked
        Bin_Genset bg = new Bin_Genset();
        bg.setVisible(true);
        
    }//GEN-LAST:event_Shop_Genset_Customer_list7MouseClicked

    private void Shop_Genset_Customer_list7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list7MouseEntered
        Shop_Genset_Panel_Customer7.setBackground(new Color(0,122,122));
    }//GEN-LAST:event_Shop_Genset_Customer_list7MouseEntered

    private void Shop_Genset_Customer_list7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list7MouseExited
  
        Shop_Genset_Panel_Customer7.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_Shop_Genset_Customer_list7MouseExited

    private void Shop_Genset_Customer_list8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list8MouseClicked
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(243,246,26));
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(11);
    }//GEN-LAST:event_Shop_Genset_Customer_list8MouseClicked

    private void Shop_Genset_Customer_list8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list8MouseEntered
       Shop_Genset_Panel_Customer8.setBackground(new Color(255,193,71));
    }//GEN-LAST:event_Shop_Genset_Customer_list8MouseEntered

    private void Shop_Genset_Customer_list8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list8MouseExited
       Shop_Genset_Panel_Customer8.setBackground(new Color(255,173,51));
    }//GEN-LAST:event_Shop_Genset_Customer_list8MouseExited

    private void Bin_Genset_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bin_Genset_TableMouseClicked
       int i=Bin_Genset_Table.getSelectedRow();
        TableModel model = Bin_Genset_Table.getModel();
        bin_genset_ids.setText(model.getValueAt(i,0).toString());
    }//GEN-LAST:event_Bin_Genset_TableMouseClicked

    private void Bin_Filter_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bin_Filter_TableMouseClicked
        int i=Bin_Filter_Table.getSelectedRow();
        TableModel model = Bin_Filter_Table.getModel();
        bin_filter_id.setText(model.getValueAt(i,0).toString());
    }//GEN-LAST:event_Bin_Filter_TableMouseClicked

    private void Shop_Genset_Print_FilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Print_FilterMouseClicked
        try{
          DefaultTableModel tablemodel =(DefaultTableModel) history_filter_table.getModel();
          HashMap<String, Object> params = new HashMap<String, Object>();
          BufferedImage image = ImageIO.read(getClass().getResource("logo.png"));
          params.put("logo", image );
          JasperPrint jasperPrint = null;
          JasperCompileManager.compileReportToFile("src/FPE/history_filter.jrxml");
          jasperPrint = JasperFillManager.fillReport("src/FPE/history_filter.jasper", params, new JRTableModelDataSource(tablemodel));
          JasperViewer.viewReport(jasperPrint, false);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_Shop_Genset_Print_FilterMouseClicked

    private void Shop_Genset_Print_FilterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Print_FilterMouseEntered
       Shop_Genset_Panel_Customer11.setBackground(new Color(102,173,173));
    }//GEN-LAST:event_Shop_Genset_Print_FilterMouseEntered

    private void Shop_Genset_Print_FilterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Print_FilterMouseExited
           Shop_Genset_Panel_Customer11.setBackground(new Color(102, 153, 153));
           
    }//GEN-LAST:event_Shop_Genset_Print_FilterMouseExited

    private void Shop_Genset_Print_GensetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Print_GensetMouseClicked
        try{
            DefaultTableModel tablemodel =(DefaultTableModel) history_genset_table.getModel();
          HashMap<String, Object> params = new HashMap<String, Object>();
          BufferedImage image = ImageIO.read(getClass().getResource("logo.png"));
          params.put("logo", image );
          JasperPrint jasperPrint = null;
          JasperCompileManager.compileReportToFile("src/FPE/history_genset.jrxml");
          jasperPrint = JasperFillManager.fillReport("src/FPE/history_genset.jasper", params, new JRTableModelDataSource(tablemodel));
          JasperViewer.viewReport(jasperPrint, false);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_Shop_Genset_Print_GensetMouseClicked

    private void Shop_Genset_Print_GensetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Print_GensetMouseEntered
       Shop_Genset_Panel_Customer12.setBackground(new Color(102,173,173));
    }//GEN-LAST:event_Shop_Genset_Print_GensetMouseEntered

    private void Shop_Genset_Print_GensetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Print_GensetMouseExited
        Shop_Genset_Panel_Customer12.setBackground(new Color(102,153,153));
    }//GEN-LAST:event_Shop_Genset_Print_GensetMouseExited

    private void history_searched_gensetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_history_searched_gensetKeyPressed

    }//GEN-LAST:event_history_searched_gensetKeyPressed

    private void history_searched_gensetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_history_searched_gensetKeyReleased
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
        String sql = "SELECT `ID`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `UNIT_TYPE`, FORMAT(`SELLER PRICE`, '#,##0.00') AS `PRICE`, `ENGINE_SERIAL_NO`, `ALTERNATOR_SERIAL_NO`, `QUOTATION` FROM `history_genset_table` WHERE `QUOTATION` lIKE '%"+history_searched_genset.getText()+"%'";
        ps = FPE_DB.getConnection().prepareStatement(sql);
        rs = ps.executeQuery();
        history_genset_table.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_history_searched_gensetKeyReleased

    private void history_searched_filterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_history_searched_filterKeyReleased
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
        String sql = "SELECT `ID`, `DATE`, `BRAND`, `DESCRIPTION`, `TYPE`, FORMAT(`PRICE`, '#,##0.00') AS `PRICE`, `QUANTITY`, `TOTAL PRICE`, `QUOTATION` FROM `history_filter` WHERE `QUOTATION` lIKE '%"+history_searched_filter.getText()+"%'";
        ps = FPE_DB.getConnection().prepareStatement(sql);
        rs = ps.executeQuery();
        history_filter_table.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_history_searched_filterKeyReleased

    private void SALESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALESMouseClicked
        Dashboard_Display_1.setForeground(new Color(243,246,26));
        Dashboard_Display_1.setText("SALES");
        Dashboard_Display_2.setText(null);
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(7);
    }//GEN-LAST:event_SALESMouseClicked

    private void SALESMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALESMouseEntered
//       SALES.setForeground(new Color(41, 61, 61));
       SALES_PANEL.setBackground(new Color(0,137,148));
    }//GEN-LAST:event_SALESMouseEntered

    private void SALESMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALESMouseExited
        SALES.setForeground(new Color(255,255,255));
        SALES_PANEL.setBackground(new Color(0, 117, 128));
    }//GEN-LAST:event_SALESMouseExited

    private void Purchase_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Purchase_3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Purchase_3MouseClicked

    private void Purchase_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Purchase_3MouseEntered
        Purchase_1.setBackground(new Color(0,147,158));
        Purchase_4.setBackground(new Color(0,147,158));
    }//GEN-LAST:event_Purchase_3MouseEntered

    private void Purchase_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Purchase_3MouseExited
        Purchase_1.setBackground(new Color(0,117,128));
         Purchase_4.setBackground(new Color(0,117,128));
    }//GEN-LAST:event_Purchase_3MouseExited

    private void Purcahase_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Purcahase_2MouseClicked
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(243,246,26));
        Dashboard_Display_2.setText("PURCHASE HISTORY");
        Dashboard_Display_3.setText(null);
       
        JTab.setSelectedIndex(8);
    }//GEN-LAST:event_Purcahase_2MouseClicked

    private void Purcahase_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Purcahase_2MouseEntered
        Purchase_1.setBackground(new Color(0,147,158));
        Purchase_4.setBackground(new Color(0,147,158));
    }//GEN-LAST:event_Purcahase_2MouseEntered

    private void Purcahase_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Purcahase_2MouseExited
         Purchase_1.setBackground(new Color(0,117,128));
         Purchase_4.setBackground(new Color(0,117,128));
    }//GEN-LAST:event_Purcahase_2MouseExited

    private void bin_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bin_2MouseClicked
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(243,246,26));
        Dashboard_Display_2.setText("BIN CARD");
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(11);
    }//GEN-LAST:event_bin_2MouseClicked

    private void bin_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bin_2MouseEntered

        bin_1.setBackground(new Color(0,147,158));
        bin_4.setBackground(new Color(0,147,158));
    }//GEN-LAST:event_bin_2MouseEntered

    private void bin_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bin_2MouseExited
        bin_1.setBackground(new Color(0,117,128));
        bin_4.setBackground(new Color(0,117,128));
    }//GEN-LAST:event_bin_2MouseExited

    private void bin_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bin_3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bin_3MouseClicked

    private void bin_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bin_3MouseEntered
        bin_1.setBackground(new Color(0,137,148));
        bin_4.setBackground(new Color(0,137,148));
    }//GEN-LAST:event_bin_3MouseEntered

    private void bin_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bin_3MouseExited
        bin_1.setBackground(new Color(0,117,128));
        bin_4.setBackground(new Color(0,117,128));
    }//GEN-LAST:event_bin_3MouseExited

    private void Bin_Genset_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bin_Genset_3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Bin_Genset_3MouseClicked

    private void Bin_Genset_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bin_Genset_3MouseEntered
        bin_1.setBackground(new Color(0,137,148));
        bin_4.setBackground(new Color(0,137,148));
    }//GEN-LAST:event_Bin_Genset_3MouseEntered

    private void Bin_Genset_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bin_Genset_3MouseExited
        bin_1.setBackground(new Color(0,117,128));
        bin_4.setBackground(new Color(0,117,128));
    }//GEN-LAST:event_Bin_Genset_3MouseExited

    private void Bin_Genset_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bin_Genset_2MouseClicked
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(255,255,255));
        Dashboard_Display_3.setForeground(new Color(243,246,26));
        Dashboard_Display_3.setText("GENSET");
        JTab.setSelectedIndex(12);
    }//GEN-LAST:event_Bin_Genset_2MouseClicked

    private void Bin_Genset_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bin_Genset_2MouseEntered
        Bin_Genset_1.setBackground(new Color(0,137,148));
        Bin_Genset_4.setBackground(new Color(0,137,148));
    }//GEN-LAST:event_Bin_Genset_2MouseEntered

    private void Bin_Genset_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bin_Genset_2MouseExited
        Bin_Genset_1.setBackground(new Color(0,117,128));
        Bin_Genset_4.setBackground(new Color(0,117,128));
    }//GEN-LAST:event_Bin_Genset_2MouseExited

    private void Bin_Frilter_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bin_Frilter_2MouseClicked
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(255,255,255));
        Dashboard_Display_3.setForeground(new Color(243,246,26));
        Dashboard_Display_3.setText("FILTER");
        JTab.setSelectedIndex(13);
    }//GEN-LAST:event_Bin_Frilter_2MouseClicked

    private void Bin_Frilter_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bin_Frilter_2MouseEntered
        Bin_Frilter_1.setBackground(new Color(0,137,148));
        Bin_Frilter_4.setBackground(new Color(0,137,148));
    }//GEN-LAST:event_Bin_Frilter_2MouseEntered

    private void Bin_Frilter_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bin_Frilter_2MouseExited
        Bin_Frilter_1.setBackground(new Color(0,117,128));
        Bin_Frilter_4.setBackground(new Color(0,117,128));
    }//GEN-LAST:event_Bin_Frilter_2MouseExited

    private void Bin_Frilter_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bin_Frilter_3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Bin_Frilter_3MouseClicked

    private void Bin_Frilter_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bin_Frilter_3MouseEntered
       Bin_Frilter_1.setBackground(new Color(0,137,148));
        Bin_Frilter_4.setBackground(new Color(0,137,138));
    }//GEN-LAST:event_Bin_Frilter_3MouseEntered

    private void Bin_Frilter_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bin_Frilter_3MouseExited
       Bin_Frilter_1.setBackground(new Color(0,117,128));
        Bin_Frilter_4.setBackground(new Color(0,117,128));
    }//GEN-LAST:event_Bin_Frilter_3MouseExited

    private void Sale_Genset_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sale_Genset_2MouseClicked
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(255,255,255));
        Dashboard_Display_3.setForeground(new Color(243,246,26));
        Dashboard_Display_3.setText("GENSET");
        pat_back_genset.setText("1");
        JTab.setSelectedIndex(9);
    }//GEN-LAST:event_Sale_Genset_2MouseClicked

    private void Sale_Genset_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sale_Genset_2MouseEntered
        Sale_Genset_1.setBackground(new Color(0,147,158));
        Sale_Genset_4.setBackground(new Color(0,147,158));
    }//GEN-LAST:event_Sale_Genset_2MouseEntered

    private void Sale_Genset_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sale_Genset_2MouseExited
        Sale_Genset_1.setBackground(new Color(0,117,128));
        Sale_Genset_4.setBackground(new Color(0,117,128));
    }//GEN-LAST:event_Sale_Genset_2MouseExited

    private void Sale_Filter_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sale_Filter_2MouseClicked
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(255,255,255));
        Dashboard_Display_3.setForeground(new Color(243,246,26));
        Dashboard_Display_3.setText("FILTER");
        pat_back_filter.setText("1");
        JTab.setSelectedIndex(10);
    }//GEN-LAST:event_Sale_Filter_2MouseClicked

    private void Sale_Filter_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sale_Filter_2MouseEntered
        Sale_Filter_1.setBackground(new Color(0,147,158));
        Sale_Filter_4.setBackground(new Color(0,147,158));
    }//GEN-LAST:event_Sale_Filter_2MouseEntered

    private void Sale_Filter_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sale_Filter_2MouseExited
        Sale_Filter_1.setBackground(new Color(0,117,128));
        Sale_Filter_4.setBackground(new Color(0,117,128));
    }//GEN-LAST:event_Sale_Filter_2MouseExited

    private void Sale_Filter_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sale_Filter_3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Sale_Filter_3MouseClicked

    private void Sale_Filter_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sale_Filter_3MouseEntered
        Sale_Filter_1.setBackground(new Color(0,147,158));
        Sale_Filter_4.setBackground(new Color(0,147,158));
    }//GEN-LAST:event_Sale_Filter_3MouseEntered

    private void Sale_Filter_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sale_Filter_3MouseExited
        Sale_Filter_1.setBackground(new Color(0,117,128));
        Sale_Filter_4.setBackground(new Color(0,117,128));
    }//GEN-LAST:event_Sale_Filter_3MouseExited

    private void Sale_Genset_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sale_Genset_3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Sale_Genset_3MouseClicked

    private void Sale_Genset_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sale_Genset_3MouseEntered
        Sale_Genset_1.setBackground(new Color(0,147,158));
        Sale_Genset_4.setBackground(new Color(0,147,158));
    }//GEN-LAST:event_Sale_Genset_3MouseEntered

    private void Sale_Genset_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sale_Genset_3MouseExited
        Sale_Genset_1.setBackground(new Color(0,117,128));
        Sale_Genset_4.setBackground(new Color(0,117,128));
    }//GEN-LAST:event_Sale_Genset_3MouseExited

    private void Shop_Genset_Customer_list11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list11MouseClicked
      Bin_Filter bf = new Bin_Filter();
      bf.setVisible(true);
              
    }//GEN-LAST:event_Shop_Genset_Customer_list11MouseClicked

    private void Shop_Genset_Customer_list11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list11MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset_Customer_list11MouseEntered

    private void Shop_Genset_Customer_list11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list11MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset_Customer_list11MouseExited

    private void Shop_Genset_Customer_list12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list12MouseClicked
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(243,246,26));
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(11);
    }//GEN-LAST:event_Shop_Genset_Customer_list12MouseClicked

    private void Shop_Genset_Customer_list12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list12MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset_Customer_list12MouseEntered

    private void Shop_Genset_Customer_list12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list12MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset_Customer_list12MouseExited

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6KeyPressed

    private void history_searched_filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_history_searched_filterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_history_searched_filterActionPerformed

    private void Status_Genset_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Status_Genset_3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Status_Genset_3MouseClicked

    private void Status_Genset_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Status_Genset_3MouseEntered
//        Status_Genset_3.setForeground(new Color(41, 61, 61));
        Status_Genset_1.setBackground(new Color(0,147,158));
        Status_Genset_4.setBackground(new Color(0,147,158));
    }//GEN-LAST:event_Status_Genset_3MouseEntered

    private void Status_Genset_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Status_Genset_3MouseExited
        Status_Genset_1.setBackground(new Color(0,117,128));
        Status_Genset_4.setBackground(new Color(0,117,128));
    }//GEN-LAST:event_Status_Genset_3MouseExited

    private void Status_Genset_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Status_Genset_2MouseClicked
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(243,246,26));
        Dashboard_Display_2.setText("GENSET");
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(15);
    }//GEN-LAST:event_Status_Genset_2MouseClicked

    private void Status_Genset_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Status_Genset_2MouseEntered
//        Status_Genset_3.setForeground(new Color(41, 61, 61));
        Status_Genset_1.setBackground(new Color(0,147,158));
        Status_Genset_4.setBackground(new Color(0,147,158));
    }//GEN-LAST:event_Status_Genset_2MouseEntered

    private void Status_Genset_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Status_Genset_2MouseExited
        Status_Genset_1.setBackground(new Color(0,117,128));
        Status_Genset_4.setBackground(new Color(0,117,128));
    }//GEN-LAST:event_Status_Genset_2MouseExited

    private void Status_Filter_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Status_Filter_2MouseClicked
       Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(243,246,26));
        Dashboard_Display_2.setText("FILTER");
        Dashboard_Display_3.setText(null);
        showPieChart();
        JTab.setSelectedIndex(16);
    }//GEN-LAST:event_Status_Filter_2MouseClicked

    private void Status_Filter_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Status_Filter_2MouseEntered
//        Status_Filter_3.setForeground(new Color(41, 61, 61));
        Status_Filter_1.setBackground(new Color(0,147,158));
        Status_Filter_4.setBackground(new Color(0,147,158));
    }//GEN-LAST:event_Status_Filter_2MouseEntered

    private void Status_Filter_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Status_Filter_2MouseExited
        Status_Filter_3.setForeground(new Color(255,255,255));
        Status_Filter_1.setBackground(new Color(0,117,128));
        Status_Filter_4.setBackground(new Color(0,117,128));
    }//GEN-LAST:event_Status_Filter_2MouseExited

    private void Status_Filter_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Status_Filter_3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Status_Filter_3MouseClicked

    private void Status_Filter_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Status_Filter_3MouseEntered
//        Status_Filter_3.setForeground(new Color(41, 61, 61));
        Status_Filter_1.setBackground(new Color(0,147,158));
        Status_Filter_4.setBackground(new Color(0,147,158));
    }//GEN-LAST:event_Status_Filter_3MouseEntered

    private void Status_Filter_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Status_Filter_3MouseExited
        Status_Filter_3.setForeground(new Color(255,255,255));
        Status_Genset_1.setBackground(new Color(0,117,128));
        Status_Genset_4.setBackground(new Color(0,117,128));
    }//GEN-LAST:event_Status_Filter_3MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Admin_Register ar = new Admin_Register();
        ar.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void Stock_Genset_Back1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Back1MouseClicked
        Dashboard_Display_1.setForeground(new Color(243,246,26));
        Dashboard_Display_2.setText(null);
        
        JTab.setSelectedIndex(14);
    }//GEN-LAST:event_Stock_Genset_Back1MouseClicked

    private void Stock_Genset_Back1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Back1MouseEntered
        // TODO add your handling code here: [255,173,51]
        Stock_Genset_Panel_Back1.setBackground(new Color(255,193,71));
    }//GEN-LAST:event_Stock_Genset_Back1MouseEntered

    private void Stock_Genset_Back1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Back1MouseExited
        // TODO add your handling code here:
        Stock_Genset_Panel_Back1.setBackground(new Color(255,173,51));
    }//GEN-LAST:event_Stock_Genset_Back1MouseExited

    private void Stock_Genset_Back2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Back2MouseClicked
        Dashboard_Display_1.setForeground(new Color(243,246,26));
        Dashboard_Display_2.setText(null);
        JTab.setSelectedIndex(14);
    }//GEN-LAST:event_Stock_Genset_Back2MouseClicked

    private void Stock_Genset_Back2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Back2MouseEntered
       Stock_Genset_Panel_Back2.setBackground(new Color(255,193,71));
    }//GEN-LAST:event_Stock_Genset_Back2MouseEntered

    private void Stock_Genset_Back2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Back2MouseExited
        Stock_Genset_Panel_Back2.setBackground(new Color(255,173,51));
    }//GEN-LAST:event_Stock_Genset_Back2MouseExited

    private void Shop_Genset_Customer_list9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list9MouseClicked
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(255,255,255));
        Dashboard_Display_3.setForeground(new Color(243,246,26));
        Dashboard_Display_3.setText("SALES");
        pat_back_genset.setText("2");
        JTab.setSelectedIndex(9);
    }//GEN-LAST:event_Shop_Genset_Customer_list9MouseClicked

    private void Shop_Genset_Customer_list9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list9MouseEntered
       Shop_Genset_Panel_Customer9.setBackground(new Color(0,122,122));
    }//GEN-LAST:event_Shop_Genset_Customer_list9MouseEntered

    private void Shop_Genset_Customer_list9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list9MouseExited
       Shop_Genset_Panel_Customer9.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_Shop_Genset_Customer_list9MouseExited

    private void Shop_Genset_Customer_list10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list10MouseClicked
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(255,255,255));
        Dashboard_Display_3.setForeground(new Color(243,246,26));
        Dashboard_Display_3.setText("SALES");
        pat_back_filter.setText("2");
        JTab.setSelectedIndex(9);
    }//GEN-LAST:event_Shop_Genset_Customer_list10MouseClicked

    private void Shop_Genset_Customer_list10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list10MouseEntered
        Shop_Genset_Panel_Customer10.setBackground(new Color(0,122,122));
    }//GEN-LAST:event_Shop_Genset_Customer_list10MouseEntered

    private void Shop_Genset_Customer_list10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list10MouseExited
         Shop_Genset_Panel_Customer10.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_Shop_Genset_Customer_list10MouseExited
      
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
    private keeptoo.KGradientPanel BIN_11;
    private keeptoo.KGradientPanel BIN_FILTER_13;
    private keeptoo.KGradientPanel BIN_GENSET_12;
    public static javax.swing.JTable Bin_Filter_Table;
    private javax.swing.JPanel Bin_Frilter_1;
    private javax.swing.JLabel Bin_Frilter_2;
    private javax.swing.JLabel Bin_Frilter_3;
    private javax.swing.JPanel Bin_Frilter_4;
    private javax.swing.JPanel Bin_Genset_1;
    private javax.swing.JLabel Bin_Genset_2;
    private javax.swing.JLabel Bin_Genset_3;
    private javax.swing.JPanel Bin_Genset_4;
    public static javax.swing.JTable Bin_Genset_Table;
    private javax.swing.JPanel DRAWER;
    public static javax.swing.JLabel Dashboard_Display_1;
    public static javax.swing.JLabel Dashboard_Display_2;
    public static javax.swing.JLabel Dashboard_Display_3;
    private javax.swing.JPanel Filter_Graph;
    private javax.swing.JPanel Genset_Graph;
    public static javax.swing.JLabel Genset_id;
    private javax.swing.JPanel HEADER;
    private javax.swing.JLabel HOME;
    private keeptoo.KGradientPanel HOME_0;
    private javax.swing.JPanel HOME_PANEL;
    public static javax.swing.JLabel Home_Dates;
    private javax.swing.JLabel Home_Time;
    public static javax.swing.JTabbedPane JTab;
    private javax.swing.JLabel LOGOUT_LABEL1;
    private javax.swing.JPanel LOGOUT_PANEL;
    private javax.swing.JLabel Purcahase_2;
    private javax.swing.JPanel Purchase_1;
    private javax.swing.JLabel Purchase_3;
    private javax.swing.JPanel Purchase_4;
    private keeptoo.KGradientPanel REPORT_7;
    private javax.swing.JLabel SALES;
    private keeptoo.KGradientPanel SALES_8;
    private keeptoo.KGradientPanel SALES_FILTER_10;
    private keeptoo.KGradientPanel SALES_GENSET_9;
    private javax.swing.JPanel SALES_PANEL;
    private javax.swing.JLabel SHOP;
    private keeptoo.KGradientPanel SHOP_4;
    private keeptoo.KGradientPanel SHOP_FILTER_6;
    private keeptoo.KGradientPanel SHOP_GENSET_5;
    private javax.swing.JPanel SHOP_PANEL;
    private javax.swing.JLabel STATUS;
    private keeptoo.KGradientPanel STATUS_14;
    private keeptoo.KGradientPanel STATUS_FILTER_16;
    private keeptoo.KGradientPanel STATUS_GENSET_15;
    private javax.swing.JPanel STATUS_PANEL;
    private javax.swing.JLabel STOCK;
    private keeptoo.KGradientPanel STOCK_1;
    private keeptoo.KGradientPanel STOCK_FILTER_3;
    private keeptoo.KGradientPanel STOCK_GENSET_2;
    private javax.swing.JPanel STOCK_PANEL;
    private javax.swing.JPanel Sale_Filter_1;
    private javax.swing.JLabel Sale_Filter_2;
    private javax.swing.JLabel Sale_Filter_3;
    private javax.swing.JPanel Sale_Filter_4;
    private javax.swing.JPanel Sale_Genset_1;
    private javax.swing.JLabel Sale_Genset_2;
    private javax.swing.JLabel Sale_Genset_3;
    private javax.swing.JPanel Sale_Genset_4;
    private javax.swing.JPanel ShopFilter_Genset_1;
    private javax.swing.JPanel ShopFilter_Parts_1;
    private javax.swing.JLabel ShopFilter_Parts_2;
    private javax.swing.JPanel ShopFilter_Parts_3;
    private javax.swing.JLabel Shop_Filter;
    public static javax.swing.JPanel Shop_Filter_Panel_Back;
    public static javax.swing.JPanel Shop_Filter_Panel_Customer_list;
    public static javax.swing.JPanel Shop_Filter_Panel_view;
    public static javax.swing.JTable Shop_Filter_Table;
    private javax.swing.JLabel Shop_Filter_back;
    private javax.swing.JLabel Shop_Filter_customer;
    private javax.swing.JLabel Shop_Filter_view;
    private javax.swing.JLabel Shop_Genset;
    private javax.swing.JLabel Shop_Genset_2;
    private javax.swing.JPanel Shop_Genset_3;
    private javax.swing.JLabel Shop_Genset_Customer_list;
    private javax.swing.JLabel Shop_Genset_Customer_list10;
    private javax.swing.JLabel Shop_Genset_Customer_list11;
    private javax.swing.JLabel Shop_Genset_Customer_list12;
    private javax.swing.JLabel Shop_Genset_Customer_list3;
    private javax.swing.JLabel Shop_Genset_Customer_list4;
    private javax.swing.JLabel Shop_Genset_Customer_list5;
    private javax.swing.JLabel Shop_Genset_Customer_list6;
    private javax.swing.JLabel Shop_Genset_Customer_list7;
    private javax.swing.JLabel Shop_Genset_Customer_list8;
    private javax.swing.JLabel Shop_Genset_Customer_list9;
    private javax.swing.JLabel Shop_Genset_Panel_Back;
    public static javax.swing.JPanel Shop_Genset_Panel_Customer;
    public static javax.swing.JPanel Shop_Genset_Panel_Customer10;
    public static javax.swing.JPanel Shop_Genset_Panel_Customer11;
    public static javax.swing.JPanel Shop_Genset_Panel_Customer12;
    public static javax.swing.JPanel Shop_Genset_Panel_Customer13;
    public static javax.swing.JPanel Shop_Genset_Panel_Customer14;
    public static javax.swing.JPanel Shop_Genset_Panel_Customer3;
    public static javax.swing.JPanel Shop_Genset_Panel_Customer4;
    public static javax.swing.JPanel Shop_Genset_Panel_Customer5;
    public static javax.swing.JPanel Shop_Genset_Panel_Customer6;
    public static javax.swing.JPanel Shop_Genset_Panel_Customer7;
    public static javax.swing.JPanel Shop_Genset_Panel_Customer8;
    public static javax.swing.JPanel Shop_Genset_Panel_Customer9;
    public static javax.swing.JPanel Shop_Genset_Panel_back;
    public static javax.swing.JPanel Shop_Genset_Panel_view;
    private javax.swing.JLabel Shop_Genset_Print_Filter;
    private javax.swing.JLabel Shop_Genset_Print_Genset;
    public static javax.swing.JTable Shop_Genset_Table;
    private javax.swing.JLabel Shop_Gensetr_view;
    public static javax.swing.JLabel Shop_filter_id;
    public static javax.swing.JLabel Shop_genset_id;
    private javax.swing.JPanel Status_Filter_1;
    private javax.swing.JLabel Status_Filter_2;
    private javax.swing.JLabel Status_Filter_3;
    private javax.swing.JPanel Status_Filter_4;
    private javax.swing.JPanel Status_Genset_1;
    private javax.swing.JLabel Status_Genset_2;
    private javax.swing.JLabel Status_Genset_3;
    private javax.swing.JPanel Status_Genset_4;
    private javax.swing.JPanel Stock_Filter_1;
    private javax.swing.JLabel Stock_Filter_2;
    private javax.swing.JLabel Stock_Filter_3;
    private javax.swing.JPanel Stock_Filter_4;
    private javax.swing.JLabel Stock_Filter_Add;
    public static javax.swing.JPanel Stock_Filter_Panel_Add;
    public static javax.swing.JPanel Stock_Filter_Panel_Supplier;
    public static javax.swing.JPanel Stock_Filter_Panel_back;
    public static javax.swing.JPanel Stock_Filter_Panel_view;
    public static javax.swing.JTable Stock_Filter_Table;
    private javax.swing.JLabel Stock_Filter_back;
    private javax.swing.JLabel Stock_Filter_supplier_list;
    private javax.swing.JLabel Stock_Filter_view;
    private javax.swing.JPanel Stock_Genset_1;
    private javax.swing.JLabel Stock_Genset_2;
    private javax.swing.JLabel Stock_Genset_3;
    private javax.swing.JPanel Stock_Genset_4;
    private javax.swing.JLabel Stock_Genset_Add;
    private javax.swing.JLabel Stock_Genset_Back;
    private javax.swing.JLabel Stock_Genset_Back1;
    private javax.swing.JLabel Stock_Genset_Back2;
    public static javax.swing.JPanel Stock_Genset_Panel_Add;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Back1;
    public static javax.swing.JPanel Stock_Genset_Panel_Back2;
    public static javax.swing.JPanel Stock_Genset_Panel_Supplier;
    public static javax.swing.JPanel Stock_Genset_Panel_View;
    private javax.swing.JLabel Stock_Genset_Supplier;
    public static javax.swing.JTable Stock_Genset_Table;
    private javax.swing.JLabel Stock_Genset_View;
    private javax.swing.JPanel bin_1;
    private javax.swing.JLabel bin_2;
    private javax.swing.JLabel bin_3;
    private javax.swing.JPanel bin_4;
    public static javax.swing.JLabel bin_filter_id;
    public static javax.swing.JLabel bin_genset_ids;
    public static javax.swing.JLabel cartIfEmpty;
    public static javax.swing.JLabel filter_id;
    private javax.swing.JLabel fpe_home;
    public static javax.swing.JTable history_filter_table;
    public static javax.swing.JTable history_genset_table;
    private javax.swing.JLabel history_id_filter;
    private javax.swing.JTextField history_searched_filter;
    private javax.swing.JTextField history_searched_genset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel pat_back_filter;
    private javax.swing.JLabel pat_back_genset;
    public static javax.swing.JLabel process;
    public static javax.swing.JLabel stock_supplier_id;
    public static javax.swing.JPanel update_panel_supplier;
    // End of variables declaration//GEN-END:variables
}
