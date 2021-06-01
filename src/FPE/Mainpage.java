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
        

    
    public static byte[] images = null;
    Connection con;
    public Mainpage() {
       initComponents();
       con = FPE_DB.getConnection();
       Class_tables ct = new Class_tables();
       Class_Graph cg =new Class_Graph();
       cg.yandong();
       cg.isuzu();
       cg.cummins();
       cg.perkins();
       cg.other();
       
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
 
    }
         
public void yan(){
        
            try{PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT COUNT(`BRAND`) as `COUNT` FROM `genset_table` WHERE `BRAND`= 'YANDONG' ");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            int q = rs.getInt("COUNT");      
//            qwe.setText(""+q);
            System.out.print(""+q);    
         }
 
        }catch(Exception e){
            e.printStackTrace();
        
        
       }}

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
      DefaultPieDataset barDataset = new DefaultPieDataset( );
      barDataset.setValue( "YANDONG" , new Integer(Class_Graph.yandong) );  
      barDataset.setValue( "ISUZU" , new Integer(Class_Graph.isuzu) );   
      barDataset.setValue( "CUMMINS" , new Integer(Class_Graph.cummins));    
      barDataset.setValue( "PERKINS" , new Integer(Class_Graph.perkins) );
      barDataset.setValue( "OTHER" , new Integer(Class_Graph.other) );  

      //create chart
       JFreeChart piechart = ChartFactory.createPieChart("GENSET SALES",barDataset, true,true,false);//explain
      
        ChartPanel barChartPanel = new ChartPanel(piechart);
        Graph_Genset.removeAll();
        Graph_Genset.add(barChartPanel, BorderLayout.CENTER);
        Graph_Genset.validate();  
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stock_supplier_id = new javax.swing.JLabel();
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
        Stock_Filter = new javax.swing.JLabel();
        Stock_Genset = new javax.swing.JLabel();
        HOME_PANEL1 = new javax.swing.JPanel();
        Stock_Filter_Parts_Btn = new javax.swing.JLabel();
        HOME_PANEL2 = new javax.swing.JPanel();
        Stock_Genset_Btn = new javax.swing.JLabel();
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
        jLabel15 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        Stock_Genset_Panel_View = new javax.swing.JPanel();
        Stock_Genset_View = new javax.swing.JLabel();
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
        jLabel19 = new javax.swing.JLabel();
        SHOP_4 = new keeptoo.KGradientPanel();
        Shop_Genset = new javax.swing.JLabel();
        Shop_Filter = new javax.swing.JLabel();
        HOME_PANEL3 = new javax.swing.JPanel();
        ShopFilter_Parts_Btn = new javax.swing.JLabel();
        HOME_PANEL4 = new javax.swing.JPanel();
        Shop_Genset_Btn = new javax.swing.JLabel();
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
        jLabel18 = new javax.swing.JLabel();
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
        jLabel16 = new javax.swing.JLabel();
        update_panel_supplier = new javax.swing.JPanel();
        process = new javax.swing.JLabel();
        cartIfEmpty = new javax.swing.JLabel();
        Shop_filter_id = new javax.swing.JLabel();
        REPORT_7 = new keeptoo.KGradientPanel();
        HOME_PANEL5 = new javax.swing.JPanel();
        Stock_Genset_Btn1 = new javax.swing.JLabel();
        Stock_Genset1 = new javax.swing.JLabel();
        Stock_Filter1 = new javax.swing.JLabel();
        HOME_PANEL6 = new javax.swing.JPanel();
        Stock_Filter_Parts_Btn1 = new javax.swing.JLabel();
        SALES_8 = new keeptoo.KGradientPanel();
        Stock_Genset2 = new javax.swing.JLabel();
        Stock_Filter2 = new javax.swing.JLabel();
        HOME_PANEL11 = new javax.swing.JPanel();
        Stock_Filter_Parts_Btn2 = new javax.swing.JLabel();
        HOME_PANEL12 = new javax.swing.JPanel();
        Stock_Genset_Btn2 = new javax.swing.JLabel();
        SALES_GENSET_9 = new keeptoo.KGradientPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        history_genset_table = new javax.swing.JTable();
        Shop_Genset_Panel_Customer5 = new javax.swing.JPanel();
        Shop_Genset_Customer_list5 = new javax.swing.JLabel();
        Shop_Genset_Panel_Customer6 = new javax.swing.JPanel();
        Shop_Genset_Customer_list6 = new javax.swing.JLabel();
        history_id_genset = new javax.swing.JLabel();
        Shop_Genset_Panel_Customer12 = new javax.swing.JPanel();
        Shop_Genset_Print_Genset = new javax.swing.JLabel();
        history_searched_genset = new javax.swing.JTextField();
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
        BIN_11 = new keeptoo.KGradientPanel();
        HOME_PANEL7 = new javax.swing.JPanel();
        Bin_Genset_Btn = new javax.swing.JLabel();
        Bin_Genset = new javax.swing.JLabel();
        Bin_Frilter = new javax.swing.JLabel();
        HOME_PANEL8 = new javax.swing.JPanel();
        Bin_Frilter_Btn = new javax.swing.JLabel();
        BIN_GENSET_12 = new keeptoo.KGradientPanel();
        Shop_Genset_Panel_Customer7 = new javax.swing.JPanel();
        Shop_Genset_Customer_list7 = new javax.swing.JLabel();
        Shop_Genset_Panel_Customer8 = new javax.swing.JPanel();
        Shop_Genset_Customer_list8 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        Bin_Genset_Table = new javax.swing.JTable();
        bin_genset_ids = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
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
        HOME_PANEL10 = new javax.swing.JPanel();
        Sale_Filter_Btn = new javax.swing.JLabel();
        Graph_Genset = new javax.swing.JPanel();
        Graph_Agent = new javax.swing.JPanel();
        HOME_PANEL13 = new javax.swing.JPanel();
        Sale_Filter_Btn1 = new javax.swing.JLabel();

        stock_supplier_id.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DRAWER.setBackground(new java.awt.Color(2, 71, 94));
        DRAWER.setPreferredSize(new java.awt.Dimension(230, 775));
        DRAWER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_logos.png"))); // NOI18N
        DRAWER.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 160));

        HOME_PANEL.setBackground(new java.awt.Color(0, 117, 128));
        HOME_PANEL.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(243, 246, 26)));

        HOME.setBackground(new java.awt.Color(253, 254, 255));
        HOME.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        HOME.setForeground(new java.awt.Color(255, 255, 255));
        HOME.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HOME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Hom_Btn.png"))); // NOI18N
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
        STOCK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Stock_Btn.png"))); // NOI18N
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
        SHOP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Shop_Btn.png"))); // NOI18N
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
        SALES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/System.png"))); // NOI18N
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
        STATUS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/data.png"))); // NOI18N
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

        DRAWER.add(LOGOUT_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 190, 70));

        getContentPane().add(DRAWER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 725));

        HEADER.setBackground(new java.awt.Color(2, 71, 94));
        HEADER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Dashboard_Display_2.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        Dashboard_Display_2.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard_Display_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HEADER.add(Dashboard_Display_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 280, 70));

        Home_Dates.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Home_Dates.setForeground(new java.awt.Color(243, 246, 26));
        HEADER.add(Home_Dates, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 30, 110, 30));

        Home_Time.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Home_Time.setForeground(new java.awt.Color(243, 246, 26));
        HEADER.add(Home_Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 60, 110, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(243, 246, 26));
        jLabel2.setText("TIME   :");
        HEADER.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 60, 70, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(243, 246, 26));
        jLabel3.setText("DATE   :");
        HEADER.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 30, 70, 30));

        Dashboard_Display_3.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        Dashboard_Display_3.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard_Display_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HEADER.add(Dashboard_Display_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 200, 70));

        Dashboard_Display_1.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        Dashboard_Display_1.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard_Display_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HEADER.add(Dashboard_Display_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 140, 70));

        getContentPane().add(HEADER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1364, 120));

        HOME_0.setBackground(new java.awt.Color(0, 79, 153));
        HOME_0.setkEndColor(new java.awt.Color(42, 162, 162));
        HOME_0.setkGradientFocus(700);
        HOME_0.setkStartColor(new java.awt.Color(42, 162, 162));
        HOME_0.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fpe_home.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        fpe_home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fpe_home.setText("FIELD POWER ENTERPRISES");
        HOME_0.add(fpe_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 890, 120));

        JTab.addTab("1", HOME_0);

        STOCK_1.setkEndColor(new java.awt.Color(42, 162, 162));
        STOCK_1.setkGradientFocus(700);
        STOCK_1.setkStartColor(new java.awt.Color(42, 162, 162));
        STOCK_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        STOCK_1.add(Stock_Filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 400, 350));

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
        STOCK_1.add(Stock_Genset, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 400, 350));

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
                .addGap(45, 45, 45)
                .addComponent(Stock_Filter_Parts_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HOME_PANEL1Layout.setVerticalGroup(
            HOME_PANEL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Filter_Parts_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        STOCK_1.add(HOME_PANEL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 400, 45));

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

        STOCK_1.add(HOME_PANEL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 400, 45));

        JTab.addTab("1", STOCK_1);

        STOCK_GENSET_2.setkEndColor(new java.awt.Color(42, 162, 162));
        STOCK_GENSET_2.setkGradientFocus(700);
        STOCK_GENSET_2.setkStartColor(new java.awt.Color(42, 162, 162));
        STOCK_GENSET_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Stock_Genset_Panel_Add.setBackground(new java.awt.Color(0, 153, 51));
        Stock_Genset_Panel_Add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Stock_Genset_Add.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Add.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Add_Btn.png"))); // NOI18N
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
        Stock_Genset_Supplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Supplier_Btn.png"))); // NOI18N
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
        Stock_Genset_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Images_Back_Btn.png"))); // NOI18N
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

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Search_Btn.png"))); // NOI18N
        STOCK_GENSET_2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 35, 31));

        jTextField3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });
        STOCK_GENSET_2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, 31));

        Stock_Genset_Panel_View.setBackground(new java.awt.Color(0, 102, 102));
        Stock_Genset_Panel_View.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Stock_Genset_View.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_View.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_View.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_View.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_view_icon.png"))); // NOI18N
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
            .addComponent(Stock_Genset_View, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_ViewLayout.setVerticalGroup(
            Stock_Genset_Panel_ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_View, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        STOCK_GENSET_2.add(Stock_Genset_Panel_View, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 210, 50));

        JTab.addTab("2", STOCK_GENSET_2);

        STOCK_FILTER_3.setkEndColor(new java.awt.Color(42, 162, 162));
        STOCK_FILTER_3.setkGradientFocus(700);
        STOCK_FILTER_3.setkStartColor(new java.awt.Color(42, 162, 162));
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
        Stock_Filter_supplier_list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Supplier_Btn.png"))); // NOI18N
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

        Stock_Filter_Panel_Add.setBackground(new java.awt.Color(0, 153, 51));
        Stock_Filter_Panel_Add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Stock_Filter_Add.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Filter_Add.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Filter_Add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Filter_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Add_Btn.png"))); // NOI18N
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

        Stock_Filter_Panel_view.setBackground(new java.awt.Color(0, 102, 102));
        Stock_Filter_Panel_view.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Stock_Filter_view.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Filter_view.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Filter_view.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Filter_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_view_icon.png"))); // NOI18N
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
        Stock_Filter_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Images_Back_Btn.png"))); // NOI18N
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

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Search_Btn.png"))); // NOI18N
        STOCK_FILTER_3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 35, 31));

        JTab.addTab("3", STOCK_FILTER_3);

        SHOP_4.setkEndColor(new java.awt.Color(42, 162, 162));
        SHOP_4.setkGradientFocus(700);
        SHOP_4.setkStartColor(new java.awt.Color(42, 162, 162));
        SHOP_4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        SHOP_4.add(Shop_Genset, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 400, 350));

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
        SHOP_4.add(Shop_Filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 400, 350));

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

        SHOP_4.add(HOME_PANEL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 400, 45));

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

        SHOP_4.add(HOME_PANEL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 400, 45));

        JTab.addTab("4", SHOP_4);

        SHOP_GENSET_5.setkEndColor(new java.awt.Color(42, 162, 162));
        SHOP_GENSET_5.setkGradientFocus(700);
        SHOP_GENSET_5.setkStartColor(new java.awt.Color(42, 162, 162));
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
        Shop_Genset_Panel_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Images_Back_Btn.png"))); // NOI18N
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

        Shop_Genset_Panel_view.setBackground(new java.awt.Color(0, 102, 102));
        Shop_Genset_Panel_view.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

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
            .addComponent(Shop_Genset_Customer_list, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Shop_Genset_Panel_CustomerLayout.setVerticalGroup(
            Shop_Genset_Panel_CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Genset_Customer_list, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        SHOP_GENSET_5.add(Shop_Genset_Panel_Customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 210, 50));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Search_Btn.png"))); // NOI18N
        SHOP_GENSET_5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 35, 31));

        JTab.addTab("5", SHOP_GENSET_5);

        SHOP_FILTER_6.setkEndColor(new java.awt.Color(42, 162, 162));
        SHOP_FILTER_6.setkGradientFocus(700);
        SHOP_FILTER_6.setkStartColor(new java.awt.Color(42, 162, 162));
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
        Shop_Filter_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Images_Back_Btn.png"))); // NOI18N
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

        Shop_Filter_Panel_view.setBackground(new java.awt.Color(0, 102, 102));
        Shop_Filter_Panel_view.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

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
            .addComponent(Shop_Filter_customer, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        Shop_Filter_Panel_Customer_listLayout.setVerticalGroup(
            Shop_Filter_Panel_Customer_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Filter_customer, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        SHOP_FILTER_6.add(Shop_Filter_Panel_Customer_list, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 210, 50));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Search_Btn.png"))); // NOI18N
        SHOP_FILTER_6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 35, 31));

        update_panel_supplier.setBackground(new java.awt.Color(0, 102, 255));
        update_panel_supplier.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        process.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        process.setForeground(new java.awt.Color(255, 255, 255));
        process.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        process.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Images_Back_Btn.png"))); // NOI18N
        process.setText(" PROCESS");
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
            .addComponent(process, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        SHOP_FILTER_6.add(update_panel_supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 210, 50));

        cartIfEmpty.setText("1");
        SHOP_FILTER_6.add(cartIfEmpty, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 54, 150, 20));
        SHOP_FILTER_6.add(Shop_filter_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 80, 40));

        JTab.addTab("6", SHOP_FILTER_6);

        REPORT_7.setkEndColor(new java.awt.Color(42, 162, 162));
        REPORT_7.setkStartColor(new java.awt.Color(42, 162, 162));
        REPORT_7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HOME_PANEL5.setBackground(new java.awt.Color(0, 117, 128));

        Stock_Genset_Btn1.setBackground(new java.awt.Color(253, 254, 255));
        Stock_Genset_Btn1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Stock_Genset_Btn1.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Btn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Btn1.setText("PURCHASED HISTORY");
        Stock_Genset_Btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Genset_Btn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Genset_Btn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Genset_Btn1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout HOME_PANEL5Layout = new javax.swing.GroupLayout(HOME_PANEL5);
        HOME_PANEL5.setLayout(HOME_PANEL5Layout);
        HOME_PANEL5Layout.setHorizontalGroup(
            HOME_PANEL5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );
        HOME_PANEL5Layout.setVerticalGroup(
            HOME_PANEL5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        REPORT_7.add(HOME_PANEL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 340, 45));

        Stock_Genset1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Stock_Genset1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/1 (1).png"))); // NOI18N
        Stock_Genset1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Genset1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Genset1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Genset1MouseExited(evt);
            }
        });
        REPORT_7.add(Stock_Genset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 400, 350));

        Stock_Filter1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Stock_Filter1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Filter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/1 (3).png"))); // NOI18N
        Stock_Filter1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Filter1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Filter1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Filter1MouseExited(evt);
            }
        });
        REPORT_7.add(Stock_Filter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 400, 350));

        HOME_PANEL6.setBackground(new java.awt.Color(0, 117, 128));

        Stock_Filter_Parts_Btn1.setBackground(new java.awt.Color(253, 254, 255));
        Stock_Filter_Parts_Btn1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Stock_Filter_Parts_Btn1.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Filter_Parts_Btn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Filter_Parts_Btn1.setText("BIN CARD");
        Stock_Filter_Parts_Btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Filter_Parts_Btn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Filter_Parts_Btn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Filter_Parts_Btn1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout HOME_PANEL6Layout = new javax.swing.GroupLayout(HOME_PANEL6);
        HOME_PANEL6.setLayout(HOME_PANEL6Layout);
        HOME_PANEL6Layout.setHorizontalGroup(
            HOME_PANEL6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HOME_PANEL6Layout.createSequentialGroup()
                .addComponent(Stock_Filter_Parts_Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        HOME_PANEL6Layout.setVerticalGroup(
            HOME_PANEL6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Filter_Parts_Btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        REPORT_7.add(HOME_PANEL6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, -1, 45));

        JTab.addTab("7", REPORT_7);

        SALES_8.setkEndColor(new java.awt.Color(42, 162, 162));
        SALES_8.setkStartColor(new java.awt.Color(42, 162, 162));
        SALES_8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Stock_Genset2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Stock_Genset2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Gensets.png"))); // NOI18N
        Stock_Genset2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Genset2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Genset2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Genset2MouseExited(evt);
            }
        });
        SALES_8.add(Stock_Genset2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 400, 350));

        Stock_Filter2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Stock_Filter2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Filter2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Filters.png"))); // NOI18N
        Stock_Filter2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Filter2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Filter2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Filter2MouseExited(evt);
            }
        });
        SALES_8.add(Stock_Filter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 400, 350));

        HOME_PANEL11.setBackground(new java.awt.Color(0, 117, 128));

        Stock_Filter_Parts_Btn2.setBackground(new java.awt.Color(253, 254, 255));
        Stock_Filter_Parts_Btn2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Stock_Filter_Parts_Btn2.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Filter_Parts_Btn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Filter_Parts_Btn2.setText("FILTER HISTORY");
        Stock_Filter_Parts_Btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Filter_Parts_Btn2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Filter_Parts_Btn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Filter_Parts_Btn2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout HOME_PANEL11Layout = new javax.swing.GroupLayout(HOME_PANEL11);
        HOME_PANEL11.setLayout(HOME_PANEL11Layout);
        HOME_PANEL11Layout.setHorizontalGroup(
            HOME_PANEL11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HOME_PANEL11Layout.createSequentialGroup()
                .addComponent(Stock_Filter_Parts_Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        HOME_PANEL11Layout.setVerticalGroup(
            HOME_PANEL11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Filter_Parts_Btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        SALES_8.add(HOME_PANEL11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 400, 45));

        HOME_PANEL12.setBackground(new java.awt.Color(0, 117, 128));

        Stock_Genset_Btn2.setBackground(new java.awt.Color(253, 254, 255));
        Stock_Genset_Btn2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Stock_Genset_Btn2.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Btn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Btn2.setText("GENSET HISTORY");
        Stock_Genset_Btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Genset_Btn2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Genset_Btn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Genset_Btn2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout HOME_PANEL12Layout = new javax.swing.GroupLayout(HOME_PANEL12);
        HOME_PANEL12.setLayout(HOME_PANEL12Layout);
        HOME_PANEL12Layout.setHorizontalGroup(
            HOME_PANEL12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Btn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        HOME_PANEL12Layout.setVerticalGroup(
            HOME_PANEL12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        SALES_8.add(HOME_PANEL12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 400, 45));

        JTab.addTab("8", SALES_8);

        SALES_GENSET_9.setkEndColor(new java.awt.Color(42, 162, 162));
        SALES_GENSET_9.setkStartColor(new java.awt.Color(42, 162, 162));
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

        SALES_GENSET_9.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 1070, 420));

        Shop_Genset_Panel_Customer5.setBackground(new java.awt.Color(255, 173, 51));
        Shop_Genset_Panel_Customer5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Genset_Customer_list5.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Genset_Customer_list5.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Genset_Customer_list5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset_Customer_list5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Customer_Btn.png"))); // NOI18N
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

        SALES_GENSET_9.add(Shop_Genset_Panel_Customer5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, 210, 50));

        Shop_Genset_Panel_Customer6.setBackground(new java.awt.Color(0, 102, 102));
        Shop_Genset_Panel_Customer6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Genset_Customer_list6.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Genset_Customer_list6.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Genset_Customer_list6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset_Customer_list6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Customer_Btn.png"))); // NOI18N
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

        SALES_GENSET_9.add(Shop_Genset_Panel_Customer6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 210, 50));
        SALES_GENSET_9.add(history_id_genset, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 50, 30));

        Shop_Genset_Panel_Customer12.setBackground(new java.awt.Color(255, 159, 128));
        Shop_Genset_Panel_Customer12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Genset_Print_Genset.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Genset_Print_Genset.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Genset_Print_Genset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset_Print_Genset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Customer_Btn.png"))); // NOI18N
        Shop_Genset_Print_Genset.setText("PRINT");
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

        SALES_GENSET_9.add(Shop_Genset_Panel_Customer12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 210, 50));

        history_searched_genset.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                history_searched_gensetKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                history_searched_gensetKeyReleased(evt);
            }
        });
        SALES_GENSET_9.add(history_searched_genset, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 180, 30));

        JTab.addTab("9", SALES_GENSET_9);

        SALES_FILTER_10.setkEndColor(new java.awt.Color(42, 162, 162));
        SALES_FILTER_10.setkStartColor(new java.awt.Color(42, 162, 162));
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

        SALES_FILTER_10.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 1070, 420));

        Shop_Genset_Panel_Customer3.setBackground(new java.awt.Color(255, 173, 51));
        Shop_Genset_Panel_Customer3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Genset_Customer_list3.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Genset_Customer_list3.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Genset_Customer_list3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset_Customer_list3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Customer_Btn.png"))); // NOI18N
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

        SALES_FILTER_10.add(Shop_Genset_Panel_Customer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, 210, 50));

        Shop_Genset_Panel_Customer4.setBackground(new java.awt.Color(0, 102, 102));
        Shop_Genset_Panel_Customer4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Genset_Customer_list4.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Genset_Customer_list4.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Genset_Customer_list4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset_Customer_list4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Customer_Btn.png"))); // NOI18N
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

        SALES_FILTER_10.add(Shop_Genset_Panel_Customer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 210, 50));
        SALES_FILTER_10.add(history_id_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 54, 50, 20));

        Shop_Genset_Panel_Customer11.setBackground(new java.awt.Color(255, 159, 128));
        Shop_Genset_Panel_Customer11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Genset_Print_Filter.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Genset_Print_Filter.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Genset_Print_Filter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset_Print_Filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Customer_Btn.png"))); // NOI18N
        Shop_Genset_Print_Filter.setText("PRINT");
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

        SALES_FILTER_10.add(Shop_Genset_Panel_Customer11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 210, 50));

        history_searched_filter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                history_searched_filterKeyReleased(evt);
            }
        });
        SALES_FILTER_10.add(history_searched_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 120, 30));

        JTab.addTab("10", SALES_FILTER_10);

        BIN_11.setkEndColor(new java.awt.Color(42, 162, 162));
        BIN_11.setkStartColor(new java.awt.Color(42, 162, 162));
        BIN_11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HOME_PANEL7.setBackground(new java.awt.Color(0, 117, 128));

        Bin_Genset_Btn.setBackground(new java.awt.Color(253, 254, 255));
        Bin_Genset_Btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Bin_Genset_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Bin_Genset_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bin_Genset_Btn.setText("BIN GENSET");
        Bin_Genset_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bin_Genset_BtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Bin_Genset_BtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Bin_Genset_BtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout HOME_PANEL7Layout = new javax.swing.GroupLayout(HOME_PANEL7);
        HOME_PANEL7.setLayout(HOME_PANEL7Layout);
        HOME_PANEL7Layout.setHorizontalGroup(
            HOME_PANEL7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bin_Genset_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        HOME_PANEL7Layout.setVerticalGroup(
            HOME_PANEL7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bin_Genset_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BIN_11.add(HOME_PANEL7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 400, 45));

        Bin_Genset.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Bin_Genset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bin_Genset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Gensets.png"))); // NOI18N
        Bin_Genset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bin_GensetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Bin_GensetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Bin_GensetMouseExited(evt);
            }
        });
        BIN_11.add(Bin_Genset, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 400, 350));

        Bin_Frilter.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Bin_Frilter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bin_Frilter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Filters.png"))); // NOI18N
        Bin_Frilter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bin_FrilterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Bin_FrilterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Bin_FrilterMouseExited(evt);
            }
        });
        BIN_11.add(Bin_Frilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 400, 350));

        HOME_PANEL8.setBackground(new java.awt.Color(0, 117, 128));

        Bin_Frilter_Btn.setBackground(new java.awt.Color(253, 254, 255));
        Bin_Frilter_Btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Bin_Frilter_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Bin_Frilter_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bin_Frilter_Btn.setText("BIN FILTER / PARTS");
        Bin_Frilter_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Bin_Frilter_BtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Bin_Frilter_BtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Bin_Frilter_BtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout HOME_PANEL8Layout = new javax.swing.GroupLayout(HOME_PANEL8);
        HOME_PANEL8.setLayout(HOME_PANEL8Layout);
        HOME_PANEL8Layout.setHorizontalGroup(
            HOME_PANEL8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HOME_PANEL8Layout.createSequentialGroup()
                .addComponent(Bin_Frilter_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        HOME_PANEL8Layout.setVerticalGroup(
            HOME_PANEL8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bin_Frilter_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BIN_11.add(HOME_PANEL8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 400, 45));

        JTab.addTab("11", BIN_11);

        BIN_GENSET_12.setkEndColor(new java.awt.Color(42, 162, 162));
        BIN_GENSET_12.setkStartColor(new java.awt.Color(42, 162, 162));
        BIN_GENSET_12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Shop_Genset_Panel_Customer7.setBackground(new java.awt.Color(0, 102, 102));
        Shop_Genset_Panel_Customer7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));

        Shop_Genset_Customer_list7.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Shop_Genset_Customer_list7.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Genset_Customer_list7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Genset_Customer_list7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Customer_Btn.png"))); // NOI18N
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
        Shop_Genset_Customer_list8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Customer_Btn.png"))); // NOI18N
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

        bin_genset_ids.setText("jLabel4");
        BIN_GENSET_12.add(bin_genset_ids, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 140, 30));

        jTextField5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });
        BIN_GENSET_12.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, 31));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Search_Btn.png"))); // NOI18N
        BIN_GENSET_12.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 35, 31));

        JTab.addTab("12", BIN_GENSET_12);

        BIN_FILTER_13.setkEndColor(new java.awt.Color(42, 162, 162));
        BIN_FILTER_13.setkStartColor(new java.awt.Color(42, 162, 162));
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
        Shop_Genset_Customer_list11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Customer_Btn.png"))); // NOI18N
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
        Shop_Genset_Customer_list12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Images_Customer_Btn.png"))); // NOI18N
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

        bin_filter_id.setText("jLabel4");
        BIN_FILTER_13.add(bin_filter_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 140, 30));

        jTextField6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });
        BIN_FILTER_13.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, 31));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Search_Btn.png"))); // NOI18N
        BIN_FILTER_13.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 35, 31));

        JTab.addTab("13", BIN_FILTER_13);

        STATUS_14.setkEndColor(new java.awt.Color(42, 162, 162));
        STATUS_14.setkStartColor(new java.awt.Color(42, 162, 162));
        STATUS_14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HOME_PANEL10.setBackground(new java.awt.Color(0, 117, 128));

        Sale_Filter_Btn.setBackground(new java.awt.Color(253, 254, 255));
        Sale_Filter_Btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Sale_Filter_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Sale_Filter_Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sale_Filter_Btn.setText("FILTER / PARTS / OTHER");
        Sale_Filter_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sale_Filter_BtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Sale_Filter_BtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Sale_Filter_BtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout HOME_PANEL10Layout = new javax.swing.GroupLayout(HOME_PANEL10);
        HOME_PANEL10.setLayout(HOME_PANEL10Layout);
        HOME_PANEL10Layout.setHorizontalGroup(
            HOME_PANEL10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sale_Filter_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );
        HOME_PANEL10Layout.setVerticalGroup(
            HOME_PANEL10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sale_Filter_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        STATUS_14.add(HOME_PANEL10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 500, 460, 45));

        Graph_Genset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));
        Graph_Genset.setLayout(new java.awt.BorderLayout());
        STATUS_14.add(Graph_Genset, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 450, 420));

        Graph_Agent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 246, 26)));
        Graph_Agent.setLayout(new java.awt.BorderLayout());
        STATUS_14.add(Graph_Agent, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 460, 420));

        HOME_PANEL13.setBackground(new java.awt.Color(0, 117, 128));

        Sale_Filter_Btn1.setBackground(new java.awt.Color(253, 254, 255));
        Sale_Filter_Btn1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Sale_Filter_Btn1.setForeground(new java.awt.Color(255, 255, 255));
        Sale_Filter_Btn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sale_Filter_Btn1.setText("GENSET");
        Sale_Filter_Btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sale_Filter_Btn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Sale_Filter_Btn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Sale_Filter_Btn1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout HOME_PANEL13Layout = new javax.swing.GroupLayout(HOME_PANEL13);
        HOME_PANEL13.setLayout(HOME_PANEL13Layout);
        HOME_PANEL13Layout.setHorizontalGroup(
            HOME_PANEL13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sale_Filter_Btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        HOME_PANEL13Layout.setVerticalGroup(
            HOME_PANEL13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sale_Filter_Btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        STATUS_14.add(HOME_PANEL13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 450, 45));

        JTab.addTab("14", STATUS_14);

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
        HOME.setForeground(new Color(41, 61, 61));
        HOME_PANEL.setBackground(new Color(128, 229, 255));
    }//GEN-LAST:event_HOMEMouseEntered

    private void HOMEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOMEMouseExited
        // TODO add your handling code here:
        HOME.setForeground(new Color(255,255,255));
        HOME_PANEL.setBackground(new Color(0, 117, 128));
    }//GEN-LAST:event_HOMEMouseExited

    private void LOGOUT_LABEL1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUT_LABEL1MouseEntered
        LOGOUT_LABEL1.setForeground(new Color(41, 61, 61));
        LOGOUT_PANEL.setBackground(new Color(128, 229, 255));
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
        STOCK.setForeground(new Color(41, 61, 61));
        STOCK_PANEL.setBackground(new Color(128, 229, 255));
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
        SHOP.setForeground(new Color(41, 61, 61));
        SHOP_PANEL.setBackground(new Color(128, 229, 255));

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
        Class_Graph cg =new Class_Graph();
        showPieChart();
       
        JTab.setSelectedIndex(14);
    }//GEN-LAST:event_STATUSMouseClicked

    private void STATUSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STATUSMouseEntered
        STATUS.setForeground(new Color(41, 61, 61));
        STATUS_PANEL.setBackground(new Color(128, 229, 255));
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
        
        process.setForeground(new Color(255,255,255));
        update_panel_supplier.setBackground(new Color(0,102,255));
    }//GEN-LAST:event_processMouseExited

    private void processMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_processMouseEntered
        process.setForeground(new Color(41, 61, 61));
        update_panel_supplier.setBackground(new Color(128, 229, 255));
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
        Shop_Gensetr_view.setForeground(new Color(255,255,255));
        Shop_Filter_Panel_Customer_list.setBackground(new Color(51,153,102));
    }//GEN-LAST:event_Shop_Filter_customerMouseExited

    private void Shop_Filter_customerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Filter_customerMouseEntered
        Shop_Gensetr_view.setForeground(new Color(41, 61, 61));
        Shop_Filter_Panel_Customer_list.setBackground(new Color(128, 229, 255));
    }//GEN-LAST:event_Shop_Filter_customerMouseEntered

    private void Shop_Filter_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Filter_customerMouseClicked
        Table_Customer cus = new Table_Customer();
        Table_Customer.Add.setText("ADD CUSTOMER");
        Table_Customer.Path.setText("1");
        cus.setVisible(true);
    }//GEN-LAST:event_Shop_Filter_customerMouseClicked

    private void Shop_Filter_viewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Filter_viewMouseExited
        Shop_Gensetr_view.setForeground(new Color(255,255,255));
        Shop_Filter_Panel_view.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_Shop_Filter_viewMouseExited

    private void Shop_Filter_viewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Filter_viewMouseEntered
        Shop_Filter_view.setForeground(new Color(41, 61, 61));
        Shop_Filter_Panel_view.setBackground(new Color(128, 229, 255));
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
        Shop_Filter_back.setForeground(new Color(41, 61, 61));
        Shop_Filter_Panel_Back.setBackground(new Color(128, 229, 255));
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
        Shop_Genset_Customer_list.setForeground(new Color(255,255,255));
        Shop_Genset_Panel_Customer.setBackground(new Color(51,153,102));
    }//GEN-LAST:event_Shop_Genset_Customer_listMouseExited

    private void Shop_Genset_Customer_listMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_listMouseEntered
        // TODO add your handling code here:[51,153,102]
        Shop_Genset_Customer_list.setForeground(new Color(41, 61, 61));
        Shop_Genset_Panel_Customer.setBackground(new Color(128, 229, 255));
    }//GEN-LAST:event_Shop_Genset_Customer_listMouseEntered

    private void Shop_Genset_Customer_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_listMouseClicked
        Table_Customer cus = new Table_Customer();
        Table_Customer.Add.setText("ADD CUSTOMER");
        Table_Customer.Path.setText("1");
        cus.setVisible(true);
    }//GEN-LAST:event_Shop_Genset_Customer_listMouseClicked

    private void Shop_Gensetr_viewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Gensetr_viewMouseExited
        Shop_Gensetr_view.setForeground(new Color(41, 61, 61));
        Shop_Genset_Panel_view.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_Shop_Gensetr_viewMouseExited

    private void Shop_Gensetr_viewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Gensetr_viewMouseEntered
        Shop_Gensetr_view.setForeground(new Color(255,255,255));
        Shop_Genset_Panel_view.setBackground(new Color(128, 229, 255));
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
        Shop_Genset_Panel_Back.setForeground(new Color(255,255,255));
        Shop_Genset_Panel_back.setBackground(new Color(255,173,51));
    }//GEN-LAST:event_Shop_Genset_Panel_BackMouseExited

    private void Shop_Genset_Panel_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Panel_BackMouseEntered
        Shop_Genset_Panel_Back.setForeground(new Color(41, 61, 61));
        Shop_Genset_Panel_back.setBackground(new Color(128, 229, 255));
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

    private void Shop_Genset_BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_BtnMouseExited
        Shop_Genset_Btn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Shop_Genset_BtnMouseExited

    private void Shop_Genset_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_BtnMouseEntered
        Shop_Genset_Btn.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_Shop_Genset_BtnMouseEntered

    private void Shop_Genset_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_BtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset_BtnMouseClicked

    private void ShopFilter_Parts_BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShopFilter_Parts_BtnMouseExited
        ShopFilter_Parts_Btn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_ShopFilter_Parts_BtnMouseExited

    private void ShopFilter_Parts_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShopFilter_Parts_BtnMouseEntered
        ShopFilter_Parts_Btn.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_ShopFilter_Parts_BtnMouseEntered

    private void ShopFilter_Parts_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShopFilter_Parts_BtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ShopFilter_Parts_BtnMouseClicked

    private void Shop_FilterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_FilterMouseExited
        ShopFilter_Parts_Btn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Shop_FilterMouseExited

    private void Shop_FilterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_FilterMouseEntered
        ShopFilter_Parts_Btn.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_Shop_FilterMouseEntered

    private void Shop_FilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_FilterMouseClicked
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(243,246,26));
        Dashboard_Display_2.setText("SHOP FILTER");
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(6);
        
    }//GEN-LAST:event_Shop_FilterMouseClicked

    private void Shop_GensetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_GensetMouseExited
        Shop_Genset_Btn.setForeground(new Color(255,255,255));

    }//GEN-LAST:event_Shop_GensetMouseExited

    private void Shop_GensetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_GensetMouseEntered
        Shop_Genset_Btn.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_Shop_GensetMouseEntered

    private void Shop_GensetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_GensetMouseClicked

        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(243,246,26));
        Dashboard_Display_2.setText("SHOP GENSET");
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(5);
    }//GEN-LAST:event_Shop_GensetMouseClicked

    private void Stock_Filter_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_backMouseExited
        // TODO add your handling code here:
        Stock_Filter_back.setForeground(new Color(255,255,255));
        Stock_Filter_Panel_back.setBackground(new Color(255,173,51));
    }//GEN-LAST:event_Stock_Filter_backMouseExited

    private void Stock_Filter_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_backMouseEntered
        // TODO add your handling code here:
        Stock_Filter_back.setForeground(new Color(41, 61, 61));
        Stock_Filter_Panel_back.setBackground(new Color(128, 229, 255));
    }//GEN-LAST:event_Stock_Filter_backMouseEntered

    private void Stock_Filter_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_backMouseClicked
        Dashboard_Display_1.setForeground(new Color(243,246,26));
        Dashboard_Display_2.setText(null);
        Dashboard_Display_3.setText(null); 
        JTab.setSelectedIndex(1);
    }//GEN-LAST:event_Stock_Filter_backMouseClicked

    private void Stock_Filter_viewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_viewMouseExited
        // TODO add your handling code here:
        Stock_Filter_view.setForeground(new Color(255,255,255));
        Stock_Filter_Panel_view.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_Stock_Filter_viewMouseExited

    private void Stock_Filter_viewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_viewMouseEntered
        // TODO add your handling code here:
        Stock_Filter_view.setForeground(new Color(41, 61, 61));
        Stock_Filter_Panel_view.setBackground(new Color(128, 229, 255));
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
        // TODO add your handling code here:
        Stock_Filter_Add.setForeground(new Color(255,255,255));
        Stock_Filter_Panel_Add.setBackground(new Color(0,153,51));
    }//GEN-LAST:event_Stock_Filter_AddMouseExited

    private void Stock_Filter_AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_AddMouseEntered
        // TODO add your handling code here:
        Stock_Filter_Add.setForeground(new Color(41, 61, 61));
        Stock_Filter_Panel_Add.setBackground(new Color(128, 229, 255));
    }//GEN-LAST:event_Stock_Filter_AddMouseEntered

    private void Stock_Filter_AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_AddMouseClicked
        Insert_Inventory_Filter iig = new Insert_Inventory_Filter();
        iig.setVisible(true);
        Insert_Inventory_Filter.Inventory_Display.setText("ADD FILTER PRODUCT");
        Insert_Inventory_Filter.Insert_Invetory_Filter_id.setEditable(false);
        Insert_Inventory_Filter.Insert_Filter_Supplier_id.setEditable(false);
    }//GEN-LAST:event_Stock_Filter_AddMouseClicked

    private void Stock_Filter_supplier_listMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_supplier_listMouseExited
        // TODO add your handling code here:
        Stock_Filter_supplier_list.setForeground(new Color(255,255,255));
        Stock_Filter_Panel_Supplier.setBackground(new Color(153,153,102));
    }//GEN-LAST:event_Stock_Filter_supplier_listMouseExited

    private void Stock_Filter_supplier_listMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_supplier_listMouseEntered
        // TODO add your handling code here:
        Stock_Filter_supplier_list.setForeground(new Color(41, 61, 61));
        Stock_Filter_Panel_Supplier.setBackground(new Color(128, 229, 255));
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
        Stock_Genset_View.setForeground(new Color(255,255,255));
        Stock_Genset_Panel_View.setBackground(new Color(0,102,102));
       
    }//GEN-LAST:event_Stock_Genset_ViewMouseExited

    private void Stock_Genset_ViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_ViewMouseEntered
        Stock_Genset_View.setForeground(new Color(41, 61, 61));
        Stock_Genset_Panel_View.setBackground(new Color(128, 229, 255));
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
        Stock_Genset_Back.setForeground(new Color(255,255,255));
        Stock_Genset_Panel_Back.setBackground(new Color(255,173,51));
    }//GEN-LAST:event_Stock_Genset_BackMouseExited

    private void Stock_Genset_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseEntered
        Stock_Genset_Back.setForeground(new Color(41, 61, 61));
        Stock_Genset_Panel_Back.setBackground(new Color(128, 229, 255));
    }//GEN-LAST:event_Stock_Genset_BackMouseEntered

    private void Stock_Genset_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BackMouseClicked
        Dashboard_Display_1.setForeground(new Color(243,246,26));
        Dashboard_Display_2.setText(null);
        Dashboard_Display_3.setText(null); 
        JTab.setSelectedIndex(1);
    }//GEN-LAST:event_Stock_Genset_BackMouseClicked

    private void Stock_Genset_SupplierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_SupplierMouseExited
        Stock_Genset_Supplier.setForeground(new Color(255,255,255));
        Stock_Genset_Panel_Supplier.setBackground(new Color(153,153,102));
    }//GEN-LAST:event_Stock_Genset_SupplierMouseExited

    private void Stock_Genset_SupplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_SupplierMouseEntered
        Stock_Genset_Supplier.setForeground(new Color(41, 61, 61));
        Stock_Genset_Panel_Supplier.setBackground(new Color(128, 229, 255));
    }//GEN-LAST:event_Stock_Genset_SupplierMouseEntered

    private void Stock_Genset_SupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_SupplierMouseClicked
        Table_Supplier tbs = new Table_Supplier();
        Table_Supplier.Add.setText("ADD SUPPLIER");
        Table_Supplier.Path.setText("1");
        Table_Supplier.supplier_id.setText("");
        tbs.setVisible(true);
    }//GEN-LAST:event_Stock_Genset_SupplierMouseClicked

    private void Stock_Genset_AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_AddMouseExited
        Stock_Genset_Add.setForeground(new Color(255,255,255));
        Stock_Genset_Panel_Add.setBackground(new Color(0,153,51));
    }//GEN-LAST:event_Stock_Genset_AddMouseExited

    private void Stock_Genset_AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_AddMouseEntered
        Stock_Genset_Add.setForeground(new Color(41, 61, 61));
        Stock_Genset_Panel_Add.setBackground(new Color(128, 229, 255));
       
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

    private void Stock_Genset_BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BtnMouseExited
        Stock_Genset_Btn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Stock_Genset_BtnMouseExited

    private void Stock_Genset_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BtnMouseEntered
        Stock_Genset_Btn.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_Stock_Genset_BtnMouseEntered

    private void Stock_Genset_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_BtnMouseClicked

    }//GEN-LAST:event_Stock_Genset_BtnMouseClicked

    private void Stock_Filter_Parts_BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_Parts_BtnMouseExited
        Stock_Filter_Parts_Btn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Stock_Filter_Parts_BtnMouseExited

    private void Stock_Filter_Parts_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_Parts_BtnMouseEntered
        // TODO add your handling code here:
        Stock_Filter_Parts_Btn.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_Stock_Filter_Parts_BtnMouseEntered

    private void Stock_Filter_Parts_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_Parts_BtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Filter_Parts_BtnMouseClicked

    private void Stock_GensetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_GensetMouseExited
        Stock_Genset_Btn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Stock_GensetMouseExited

    private void Stock_GensetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_GensetMouseEntered
        Stock_Genset_Btn.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_Stock_GensetMouseEntered

    private void Stock_GensetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_GensetMouseClicked
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(243,246,26));
        Dashboard_Display_2.setText("GENSET");
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(2);
    }//GEN-LAST:event_Stock_GensetMouseClicked

    private void Stock_FilterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_FilterMouseExited
        Stock_Filter_Parts_Btn.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Stock_FilterMouseExited

    private void Stock_FilterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_FilterMouseEntered
        Stock_Filter_Parts_Btn.setForeground(new Color(41, 61, 61));
    }//GEN-LAST:event_Stock_FilterMouseEntered

    private void Stock_FilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_FilterMouseClicked
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(243,246,26));
        Dashboard_Display_2.setText("FILTER / PARTS");
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(3);
    }//GEN-LAST:event_Stock_FilterMouseClicked

    private void history_genset_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_history_genset_tableMouseClicked
        int i=history_genset_table.getSelectedRow();
        TableModel model = history_genset_table.getModel();
        history_id_genset.setText(model.getValueAt(i,0).toString());
    }//GEN-LAST:event_history_genset_tableMouseClicked

    private void history_filter_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_history_filter_tableMouseClicked
        int i=history_filter_table.getSelectedRow();
        TableModel model = history_filter_table.getModel();
        history_id_filter.setText(model.getValueAt(i,0).toString());
    }//GEN-LAST:event_history_filter_tableMouseClicked

    private void Shop_Genset_Customer_list3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list3MouseClicked
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(243,246,26));
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(8);
    }//GEN-LAST:event_Shop_Genset_Customer_list3MouseClicked

    private void Shop_Genset_Customer_list3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset_Customer_list3MouseEntered

    private void Shop_Genset_Customer_list3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list3MouseExited
        // TODO add your handling code here:
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
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset_Customer_list4MouseEntered

    private void Shop_Genset_Customer_list4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset_Customer_list4MouseExited

    private void Shop_Genset_Customer_list5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list5MouseClicked
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(243,246,26));
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(8);
    }//GEN-LAST:event_Shop_Genset_Customer_list5MouseClicked

    private void Shop_Genset_Customer_list5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset_Customer_list5MouseEntered

    private void Shop_Genset_Customer_list5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset_Customer_list5MouseExited

    private void Shop_Genset_Customer_list6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list6MouseClicked
        History_Genset hg = new History_Genset();
        
        if(history_id_genset.getText().equals("")){
            JOptionPane.showMessageDialog(null, "PLEASE SELECT !!","",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            History_Genset.history_genset_id.setText(history_id_genset.getText());
            hg.setVisible(true);            
        }

       
    }//GEN-LAST:event_Shop_Genset_Customer_list6MouseClicked

    private void Shop_Genset_Customer_list6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset_Customer_list6MouseEntered

    private void Shop_Genset_Customer_list6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset_Customer_list6MouseExited

    private void Shop_Genset_Customer_list7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list7MouseClicked
        Bin_Genset bg = new Bin_Genset();
        bg.setVisible(true);
        
    }//GEN-LAST:event_Shop_Genset_Customer_list7MouseClicked

    private void Shop_Genset_Customer_list7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset_Customer_list7MouseEntered

    private void Shop_Genset_Customer_list7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset_Customer_list7MouseExited

    private void Shop_Genset_Customer_list8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list8MouseClicked
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(243,246,26));
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(11);
    }//GEN-LAST:event_Shop_Genset_Customer_list8MouseClicked

    private void Shop_Genset_Customer_list8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset_Customer_list8MouseEntered

    private void Shop_Genset_Customer_list8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Customer_list8MouseExited
        // TODO add your handling code here:
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
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset_Print_FilterMouseEntered

    private void Shop_Genset_Print_FilterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Print_FilterMouseExited
        // TODO add your handling code here:
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
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Genset_Print_GensetMouseEntered

    private void Shop_Genset_Print_GensetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Genset_Print_GensetMouseExited
        // TODO add your handling code here:
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
       SALES.setForeground(new Color(41, 61, 61));
       SALES_PANEL.setBackground(new Color(128, 229, 255));
    }//GEN-LAST:event_SALESMouseEntered

    private void SALESMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALESMouseExited
       SALES.setForeground(new Color(255,255,255));
        SALES_PANEL.setBackground(new Color(0, 117, 128));
    }//GEN-LAST:event_SALESMouseExited

    private void Stock_Genset_Btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Btn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_Btn1MouseClicked

    private void Stock_Genset_Btn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Btn1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_Btn1MouseEntered

    private void Stock_Genset_Btn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Btn1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_Btn1MouseExited

    private void Stock_Genset1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset1MouseClicked
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(243,246,26));
        Dashboard_Display_2.setText("PURCHASE HISTORY");
        Dashboard_Display_3.setText(null);
       
        JTab.setSelectedIndex(8);
    }//GEN-LAST:event_Stock_Genset1MouseClicked

    private void Stock_Genset1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset1MouseEntered

    private void Stock_Genset1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset1MouseExited

    private void Stock_Filter1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter1MouseClicked
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(243,246,26));
        Dashboard_Display_2.setText("BIN CARD");
        Dashboard_Display_3.setText(null);
        JTab.setSelectedIndex(11);
    }//GEN-LAST:event_Stock_Filter1MouseClicked

    private void Stock_Filter1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Filter1MouseEntered

    private void Stock_Filter1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Filter1MouseExited

    private void Stock_Filter_Parts_Btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_Parts_Btn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Filter_Parts_Btn1MouseClicked

    private void Stock_Filter_Parts_Btn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_Parts_Btn1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Filter_Parts_Btn1MouseEntered

    private void Stock_Filter_Parts_Btn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_Parts_Btn1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Filter_Parts_Btn1MouseExited

    private void Bin_Genset_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bin_Genset_BtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Bin_Genset_BtnMouseClicked

    private void Bin_Genset_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bin_Genset_BtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Bin_Genset_BtnMouseEntered

    private void Bin_Genset_BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bin_Genset_BtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Bin_Genset_BtnMouseExited

    private void Bin_GensetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bin_GensetMouseClicked
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(255,255,255));
        Dashboard_Display_3.setForeground(new Color(243,246,26));
        Dashboard_Display_3.setText("GENSET");
        JTab.setSelectedIndex(12);
    }//GEN-LAST:event_Bin_GensetMouseClicked

    private void Bin_GensetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bin_GensetMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Bin_GensetMouseEntered

    private void Bin_GensetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bin_GensetMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Bin_GensetMouseExited

    private void Bin_FrilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bin_FrilterMouseClicked
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(255,255,255));
        Dashboard_Display_3.setForeground(new Color(243,246,26));
        Dashboard_Display_3.setText("FILTER");
        JTab.setSelectedIndex(13);
    }//GEN-LAST:event_Bin_FrilterMouseClicked

    private void Bin_FrilterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bin_FrilterMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Bin_FrilterMouseEntered

    private void Bin_FrilterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bin_FrilterMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Bin_FrilterMouseExited

    private void Bin_Frilter_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bin_Frilter_BtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Bin_Frilter_BtnMouseClicked

    private void Bin_Frilter_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bin_Frilter_BtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Bin_Frilter_BtnMouseEntered

    private void Bin_Frilter_BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Bin_Frilter_BtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Bin_Frilter_BtnMouseExited

    private void Sale_Filter_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sale_Filter_BtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Sale_Filter_BtnMouseClicked

    private void Sale_Filter_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sale_Filter_BtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Sale_Filter_BtnMouseEntered

    private void Sale_Filter_BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sale_Filter_BtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Sale_Filter_BtnMouseExited

    private void Stock_Genset2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset2MouseClicked
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(255,255,255));
        Dashboard_Display_3.setForeground(new Color(243,246,26));
        Dashboard_Display_3.setText("GENSET");
        
        JTab.setSelectedIndex(9);
    }//GEN-LAST:event_Stock_Genset2MouseClicked

    private void Stock_Genset2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset2MouseEntered

    private void Stock_Genset2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset2MouseExited

    private void Stock_Filter2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter2MouseClicked
        Dashboard_Display_1.setForeground(new Color(255,255,255));
        Dashboard_Display_2.setForeground(new Color(255,255,255));
        Dashboard_Display_3.setForeground(new Color(243,246,26));
        Dashboard_Display_3.setText("FILTER");
        JTab.setSelectedIndex(10);
    }//GEN-LAST:event_Stock_Filter2MouseClicked

    private void Stock_Filter2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Filter2MouseEntered

    private void Stock_Filter2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Filter2MouseExited

    private void Stock_Filter_Parts_Btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_Parts_Btn2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Filter_Parts_Btn2MouseClicked

    private void Stock_Filter_Parts_Btn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_Parts_Btn2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Filter_Parts_Btn2MouseEntered

    private void Stock_Filter_Parts_Btn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Filter_Parts_Btn2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Filter_Parts_Btn2MouseExited

    private void Stock_Genset_Btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Btn2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_Btn2MouseClicked

    private void Stock_Genset_Btn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Btn2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_Btn2MouseEntered

    private void Stock_Genset_Btn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_Btn2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_Btn2MouseExited

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

    private void Sale_Filter_Btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sale_Filter_Btn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Sale_Filter_Btn1MouseClicked

    private void Sale_Filter_Btn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sale_Filter_Btn1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Sale_Filter_Btn1MouseEntered

    private void Sale_Filter_Btn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sale_Filter_Btn1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Sale_Filter_Btn1MouseExited
      
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
    private javax.swing.JLabel Bin_Frilter;
    private javax.swing.JLabel Bin_Frilter_Btn;
    private javax.swing.JLabel Bin_Genset;
    private javax.swing.JLabel Bin_Genset_Btn;
    public static javax.swing.JTable Bin_Genset_Table;
    private javax.swing.JPanel DRAWER;
    public static javax.swing.JLabel Dashboard_Display_1;
    public static javax.swing.JLabel Dashboard_Display_2;
    public static javax.swing.JLabel Dashboard_Display_3;
    public static javax.swing.JLabel Genset_id;
    public static javax.swing.JPanel Graph_Agent;
    public static javax.swing.JPanel Graph_Genset;
    private javax.swing.JPanel HEADER;
    private javax.swing.JLabel HOME;
    private keeptoo.KGradientPanel HOME_0;
    private javax.swing.JPanel HOME_PANEL;
    private javax.swing.JPanel HOME_PANEL1;
    private javax.swing.JPanel HOME_PANEL10;
    private javax.swing.JPanel HOME_PANEL11;
    private javax.swing.JPanel HOME_PANEL12;
    private javax.swing.JPanel HOME_PANEL13;
    private javax.swing.JPanel HOME_PANEL2;
    private javax.swing.JPanel HOME_PANEL3;
    private javax.swing.JPanel HOME_PANEL4;
    private javax.swing.JPanel HOME_PANEL5;
    private javax.swing.JPanel HOME_PANEL6;
    private javax.swing.JPanel HOME_PANEL7;
    private javax.swing.JPanel HOME_PANEL8;
    public static javax.swing.JLabel Home_Dates;
    private javax.swing.JLabel Home_Time;
    public static javax.swing.JTabbedPane JTab;
    private javax.swing.JLabel LOGOUT_LABEL1;
    private javax.swing.JPanel LOGOUT_PANEL;
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
    private javax.swing.JPanel STATUS_PANEL;
    private javax.swing.JLabel STOCK;
    private keeptoo.KGradientPanel STOCK_1;
    private keeptoo.KGradientPanel STOCK_FILTER_3;
    private keeptoo.KGradientPanel STOCK_GENSET_2;
    private javax.swing.JPanel STOCK_PANEL;
    private javax.swing.JLabel Sale_Filter_Btn;
    private javax.swing.JLabel Sale_Filter_Btn1;
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
    private javax.swing.JLabel Shop_Genset_Customer_list11;
    private javax.swing.JLabel Shop_Genset_Customer_list12;
    private javax.swing.JLabel Shop_Genset_Customer_list3;
    private javax.swing.JLabel Shop_Genset_Customer_list4;
    private javax.swing.JLabel Shop_Genset_Customer_list5;
    private javax.swing.JLabel Shop_Genset_Customer_list6;
    private javax.swing.JLabel Shop_Genset_Customer_list7;
    private javax.swing.JLabel Shop_Genset_Customer_list8;
    private javax.swing.JLabel Shop_Genset_Panel_Back;
    public static javax.swing.JPanel Shop_Genset_Panel_Customer;
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
    public static javax.swing.JPanel Shop_Genset_Panel_back;
    public static javax.swing.JPanel Shop_Genset_Panel_view;
    private javax.swing.JLabel Shop_Genset_Print_Filter;
    private javax.swing.JLabel Shop_Genset_Print_Genset;
    public static javax.swing.JTable Shop_Genset_Table;
    private javax.swing.JLabel Shop_Gensetr_view;
    public static javax.swing.JLabel Shop_filter_id;
    public static javax.swing.JLabel Shop_genset_id;
    private javax.swing.JLabel Stock_Filter;
    private javax.swing.JLabel Stock_Filter1;
    private javax.swing.JLabel Stock_Filter2;
    private javax.swing.JLabel Stock_Filter_Add;
    public static javax.swing.JPanel Stock_Filter_Panel_Add;
    public static javax.swing.JPanel Stock_Filter_Panel_Supplier;
    public static javax.swing.JPanel Stock_Filter_Panel_back;
    public static javax.swing.JPanel Stock_Filter_Panel_view;
    private javax.swing.JLabel Stock_Filter_Parts_Btn;
    private javax.swing.JLabel Stock_Filter_Parts_Btn1;
    private javax.swing.JLabel Stock_Filter_Parts_Btn2;
    public static javax.swing.JTable Stock_Filter_Table;
    private javax.swing.JLabel Stock_Filter_back;
    private javax.swing.JLabel Stock_Filter_supplier_list;
    private javax.swing.JLabel Stock_Filter_view;
    private javax.swing.JLabel Stock_Genset;
    private javax.swing.JLabel Stock_Genset1;
    private javax.swing.JLabel Stock_Genset2;
    private javax.swing.JLabel Stock_Genset_Add;
    private javax.swing.JLabel Stock_Genset_Back;
    private javax.swing.JLabel Stock_Genset_Btn;
    private javax.swing.JLabel Stock_Genset_Btn1;
    private javax.swing.JLabel Stock_Genset_Btn2;
    public static javax.swing.JPanel Stock_Genset_Panel_Add;
    public static javax.swing.JPanel Stock_Genset_Panel_Back;
    public static javax.swing.JPanel Stock_Genset_Panel_Supplier;
    public static javax.swing.JPanel Stock_Genset_Panel_View;
    private javax.swing.JLabel Stock_Genset_Supplier;
    public static javax.swing.JTable Stock_Genset_Table;
    private javax.swing.JLabel Stock_Genset_View;
    public static javax.swing.JLabel bin_filter_id;
    public static javax.swing.JLabel bin_genset_ids;
    public static javax.swing.JLabel cartIfEmpty;
    public static javax.swing.JLabel filter_id;
    private javax.swing.JLabel fpe_home;
    public static javax.swing.JTable history_filter_table;
    public static javax.swing.JTable history_genset_table;
    private javax.swing.JLabel history_id_filter;
    private javax.swing.JLabel history_id_genset;
    private javax.swing.JTextField history_searched_filter;
    private javax.swing.JTextField history_searched_genset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
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
    public static javax.swing.JLabel process;
    public static javax.swing.JLabel stock_supplier_id;
    public static javax.swing.JPanel update_panel_supplier;
    // End of variables declaration//GEN-END:variables
}
