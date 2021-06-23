/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;


import java.awt.Color;
import java.awt.image.BufferedImage;
import java.sql.Connection;
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



public class Webpage extends javax.swing.JFrame {
    
    public static String located = "Javinez"; // report or print default location path
    public static SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
    public static SimpleDateFormat date = new SimpleDateFormat("MM dd yyyy");
    public static String admin_id ;

    public static Add_Selection as = new Add_Selection(); 
    public static Add_Drawer_Sale ads = new Add_Drawer_Sale();
    public static Add_Drawer_Reports adr = new Add_Drawer_Reports();
    public static Add_Drawer_Account ada = new Add_Drawer_Account();
    
    
    
    public static String sales_id = null;
    public static String s_category = null;
    public static byte[] images = null;
    Connection con;
    
    Class_tables Show_Stock = new Class_tables();
    Class_tables Show_Sale = new Class_tables();
    Class_tables Show_Cart = new Class_tables();
    
    Class_tables ct = new Class_tables();
    Class_tables Show_OW = new Class_tables();
    Class_tables Show_OW_Cart = new Class_tables();
    
    public  static String Stock_cat = null;
    public static String Sales_cat = null;
    
    Class_Refresh crf = new Class_Refresh();

    public Webpage() {
       initComponents();
        Class_Cart.addCart();
        Cart_Category.setSelectedIndex(0);
        Sale_Category.setSelectedIndex(0);
        Warehouse_Office_Category.setSelectedIndex(0);
        Cart_Warehouse_Office_Category.setSelectedIndex(0);
        AllTable();
        //crf.Refresh();

    }


    private void all_stock(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `DATE RECEIVED`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, FORMAT(`SUPPLIER PRICE`, '#,##0.00') AS `SUPPLIER PRICE`, FORMAT(`SELLER PRICE`, '#,##0.00') AS `SELLER PRICE`, `ENGINE S N`, `ALTERNATOR S N`, `QUANTITY`, `PERSON IN CHARGE`, `REMARKS`, `SUPPLIER` FROM `summary_stock`");
        ResultSet rs = ps.executeQuery();
        All_Stock_Table.setModel(DbUtils.resultSetToTableModel(rs));
        All_Stock_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
        }
    }
 
    private void stock_generator(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`,`DATE RECEIVED`,`CATEGORY`,`BRAND`,`MODEL`,`KVA`,`PHASING`,`TYPE`,FORMAT(`SELLER PRICE`, '#,##0.00') AS `PRICE`,`ENGINE S N`,`ALTERNATOR S N`,`SUPPLIER` FROM `summary_stock` WHERE `CATEGORY`='GENERATOR'");
        ResultSet rs = ps.executeQuery();
        Sales_Table_Generator.setModel(DbUtils.resultSetToTableModel(rs));
        Sales_Table_Generator.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
        }
    }

    private void cart_table(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, `SELLER PRICE`, `ENGINE S N`, `ALTERNATOR S N` FROM `add_cart` WHERE `CATEGORY`= 'GENERATOR'");
        ResultSet rs = ps.executeQuery();
        Cart_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Cart_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
        }        
    }
//    private void order_numPrint(){
//        try{
//        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `DATE RELEASE`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, `SUPPLIER PRICE`, `SELLER PRICE`, `ENGINE S N`, `ALTERNATOR S N`, `QUANTITY`, `SUPPLIER ID`, `CUSTOMER ID`, `STOCK ID`, `IMAGE`, `AMOUNT`, `BALANCED`, `CASH_OR_CHECKED`, `BANKED`, `OR NO`, `REMARKS` FROM `sale_summary_stock`");
//        ResultSet rs = ps.executeQuery();
//        Order_Number_Table.setModel(DbUtils.resultSetToTableModel(rs));
//        Order_Number_Table.getColumnModel().getColumn(0).setMaxWidth(100);
//        }catch(Exception e){
//              //System.out.println(e);
//            }
//    }
    
    private void AllTable(){
        all_stock();
        stock_generator();
        cart_table();
//        order_numPrint();
    }
public void Dispose(){
        ads.dispose();
        adr.dispose();
        ada.dispose();
        as.dispose();
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
//    void showDate(){
//
//               new Timer(0, new ActionListener() {
//               @Override
//               public void actionPerformed(ActionEvent e) {
//
//                   Date today = new Date();
//
//                   SimpleDateFormat date = new SimpleDateFormat("MM dd yyyy");
//                   Home_Dates.setText(date.format(today));
//
//                   SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
//                   Home_Time.setText(s.format(today));
//               }
//
//           }).start();
//    }
 
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

// NEW CODE
// ADD TO CART PROCESS 
//    private void addCart(){
//        PreparedStatement ps;
//        ResultSet rs;
//        try{
//        ps=FPE_DB.getConnection().prepareStatement("SELECT `STATUS`,`PROCESS` FROM `sale_summary_stock` ORDER BY `ID` DESC LIMIT 1");
//        rs = ps.executeQuery();
//            if(rs.next()){
//                // Database is not empty
//                String process_count = rs.getString("PROCESS");
//                process.setText(process_count);
//                int counted = Integer.parseInt(process.getText()) + Integer.parseInt(process_count) - 1; // database
//                
//                if(rs.getString("STATUS").equals("")){
//                    process.setText(process_count);
//                }
//                else{
//                    //process.setText(""+counted);
//                    if(rs.getString("STATUS").equals("DONE")){ //its only update tapos na yung cart
//                        int statusCart = Integer.parseInt(process_count) + 1; // database
//                        process.setText(""+statusCart);
//                    }
//                    else{
//                        process.setText(""+counted); //eto hindi pa tapos yung cart process
//                    }
//                }
//            }
//            else{
//                //empty database
//               process.setText("1");
//            }
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }        
//    }

// ADD TO CART PROCESS
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
        jLabel2 = new javax.swing.JLabel();
        JTab = new javax.swing.JTabbedPane();
        HOME_0 = new keeptoo.KGradientPanel();
        fpe_home = new javax.swing.JLabel();
        STOCKS_1 = new keeptoo.KGradientPanel();
        Stock_Genset_Panel_Add = new javax.swing.JPanel();
        Stock_Genset_Add = new javax.swing.JLabel();
        Stock_Genset_Panel_Supplier = new javax.swing.JPanel();
        Stock_Genset_Supplier = new javax.swing.JLabel();
        Stock_Genset_Panel_View = new javax.swing.JPanel();
        Stock_Genset_View = new javax.swing.JLabel();
        Stock_Genset_Panel_Supplier1 = new javax.swing.JPanel();
        Stock_Genset_AllPrint = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        All_Stock_Table = new javax.swing.JTable();
        Stock_Category_Id = new javax.swing.JLabel();
        searched_all_stock = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        Stock_Category = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Stock_Genset_Panel_View1 = new javax.swing.JPanel();
        Stock_Genset_Delete = new javax.swing.JLabel();
        Stock_Genset_Panel_Supplier3 = new javax.swing.JPanel();
        Stock_Genset_AllPrint1 = new javax.swing.JLabel();
        SALES_3 = new keeptoo.KGradientPanel();
        Stock_Genset_Panel_Add3 = new javax.swing.JPanel();
        Shop_Add1 = new javax.swing.JLabel();
        Sale_Category_Id = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        Sale_Category = new javax.swing.JComboBox<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        Sales_Table_Generator = new javax.swing.JTable();
        process = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        Stock_Genset_Panel_Add5 = new javax.swing.JPanel();
        Shop_Add3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Stock_Genset_Panel_Supplier2 = new javax.swing.JPanel();
        Stock_Genset_Customer = new javax.swing.JLabel();
        CART_4 = new keeptoo.KGradientPanel();
        Stock_Genset_Panel_Add4 = new javax.swing.JPanel();
        Shop_Add2 = new javax.swing.JLabel();
        Cart_Category_Id = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        Cart_Table = new javax.swing.JTable();
        process1 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        Stock_Genset_Panel_Add6 = new javax.swing.JPanel();
        Shop_Add4 = new javax.swing.JLabel();
        Stock_Genset_Panel_Add7 = new javax.swing.JPanel();
        Shop_Add5 = new javax.swing.JLabel();
        Cart_Category = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        OW_STOCK_5 = new keeptoo.KGradientPanel();
        Stock_Genset_Panel_Add8 = new javax.swing.JPanel();
        Shop_Add6 = new javax.swing.JLabel();
        Warehouse_Office_Category_Id = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        Warehouse_Office_Category = new javax.swing.JComboBox<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        office_warehouse_Table = new javax.swing.JTable();
        process2 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        Stock_Genset_Panel_Add9 = new javax.swing.JPanel();
        Shop_Add7 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        OW_CART_6 = new keeptoo.KGradientPanel();
        Stock_Genset_Panel_Add10 = new javax.swing.JPanel();
        Shop_Add8 = new javax.swing.JLabel();
        Cart_Warehouse_Office_Category_Id = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        Cart_Table1 = new javax.swing.JTable();
        process3 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        Stock_Genset_Panel_Add11 = new javax.swing.JPanel();
        Shop_Add9 = new javax.swing.JLabel();
        Stock_Genset_Panel_Add12 = new javax.swing.JPanel();
        Shop_Add10 = new javax.swing.JLabel();
        Cart_Warehouse_Office_Category = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        stock_supplier_id.setText("jLabel2");

        pat_back_filter.setText("jLabel5");

        pat_back_genset.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HEADER.setBackground(new java.awt.Color(42, 142, 142));
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
            .addComponent(HOME, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        HOME_PANELLayout.setVerticalGroup(
            HOME_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HOME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        HEADER.add(HOME_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 200, 60));

        STOCK_PANEL.setBackground(new java.awt.Color(0, 117, 128));

        STOCK.setBackground(new java.awt.Color(253, 254, 255));
        STOCK.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        STOCK.setForeground(new java.awt.Color(255, 255, 255));
        STOCK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        STOCK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Drawer_Stock.png"))); // NOI18N
        STOCK.setText(" STOCK");
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
            .addComponent(STOCK, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        STOCK_PANELLayout.setVerticalGroup(
            STOCK_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(STOCK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        HEADER.add(STOCK_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 200, 60));

        REPORT_PANEL.setBackground(new java.awt.Color(0, 117, 128));

        REPORT.setBackground(new java.awt.Color(253, 254, 255));
        REPORT.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        REPORT.setForeground(new java.awt.Color(255, 255, 255));
        REPORT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        REPORT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Drawer_Reports.png"))); // NOI18N
        REPORT.setText(" REPORT ›");
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
            .addComponent(REPORT, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        REPORT_PANELLayout.setVerticalGroup(
            REPORT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(REPORT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        HEADER.add(REPORT_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 50, 200, 60));

        SALE_PANEL.setBackground(new java.awt.Color(0, 117, 128));

        SALE.setBackground(new java.awt.Color(253, 254, 255));
        SALE.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        SALE.setForeground(new java.awt.Color(255, 255, 255));
        SALE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SALE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Drawer_Shop.png"))); // NOI18N
        SALE.setText("  SALE ›");
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
            .addComponent(SALE, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        SALE_PANELLayout.setVerticalGroup(
            SALE_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SALE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        HEADER.add(SALE_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 200, 60));

        ACCOUNT_PANEL.setBackground(new java.awt.Color(0, 117, 128));

        ACCOUNT.setBackground(new java.awt.Color(253, 254, 255));
        ACCOUNT.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        ACCOUNT.setForeground(new java.awt.Color(255, 255, 255));
        ACCOUNT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ACCOUNT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Drawer_Btn/Drawer_Account.png"))); // NOI18N
        ACCOUNT.setText(" ACCOUNT ›");
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
            .addComponent(ACCOUNT, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        ACCOUNT_PANELLayout.setVerticalGroup(
            ACCOUNT_PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ACCOUNT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        HEADER.add(ACCOUNT_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 50, 200, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Logo/Header copy.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });
        HEADER.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1365, 130));

        getContentPane().add(HEADER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1364, 130));

        JTab.setBackground(new java.awt.Color(255, 255, 255));
        JTab.setEnabled(false);
        JTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JTabMouseEntered(evt);
            }
        });

        HOME_0.setBackground(new java.awt.Color(0, 79, 153));
        HOME_0.setkEndColor(new java.awt.Color(42, 142, 142));
        HOME_0.setkGradientFocus(700);
        HOME_0.setkStartColor(new java.awt.Color(42, 142, 142));
        HOME_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HOME_0MouseEntered(evt);
            }
        });
        HOME_0.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fpe_home.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        fpe_home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fpe_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Logo/Home_logo2.png"))); // NOI18N
        HOME_0.add(fpe_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 600));

        JTab.addTab("", HOME_0);

        STOCKS_1.setkEndColor(new java.awt.Color(42, 142, 142));
        STOCKS_1.setkGradientFocus(700);
        STOCKS_1.setkStartColor(new java.awt.Color(42, 142, 142));
        STOCKS_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                STOCKS_1MouseEntered(evt);
            }
        });
        STOCKS_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Stock_Genset_Panel_Add.setBackground(new java.awt.Color(24, 165, 88));

        Stock_Genset_Add.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Add.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Add.png"))); // NOI18N
        Stock_Genset_Add.setText("  ADD  ›");
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
            .addComponent(Stock_Genset_Add, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        STOCKS_1.add(Stock_Genset_Panel_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 170, 45));

        Stock_Genset_Panel_Supplier.setBackground(new java.awt.Color(153, 153, 102));

        Stock_Genset_Supplier.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
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
            .addComponent(Stock_Genset_Supplier, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        STOCKS_1.add(Stock_Genset_Panel_Supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, 170, 45));

        Stock_Genset_Panel_View.setBackground(new java.awt.Color(66, 139, 202));

        Stock_Genset_View.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_View.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_View.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_View.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_View.png"))); // NOI18N
        Stock_Genset_View.setText("  EDIT ");
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
            .addComponent(Stock_Genset_View, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        STOCKS_1.add(Stock_Genset_Panel_View, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 170, 45));

        Stock_Genset_Panel_Supplier1.setBackground(new java.awt.Color(102, 153, 153));

        Stock_Genset_AllPrint.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_AllPrint.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_AllPrint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_AllPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Print.png"))); // NOI18N
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
            .addComponent(Stock_Genset_AllPrint, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Supplier1Layout.setVerticalGroup(
            Stock_Genset_Panel_Supplier1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_AllPrint, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        STOCKS_1.add(Stock_Genset_Panel_Supplier1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 520, 170, 45));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                All_Stock_TableMouseEntered(evt);
            }
        });
        jScrollPane5.setViewportView(All_Stock_Table);

        STOCKS_1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 1280, 370));
        STOCKS_1.add(Stock_Category_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 150, 30));

        searched_all_stock.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        searched_all_stock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searched_all_stock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searched_all_stockKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searched_all_stockKeyReleased(evt);
            }
        });
        STOCKS_1.add(searched_all_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 240, 31));

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Search.png"))); // NOI18N
        STOCKS_1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 35, 31));

        jTextField16.setBackground(new java.awt.Color(102, 255, 255));
        jTextField16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setText("CATEGORY");
        STOCKS_1.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 130, 31));

        Stock_Category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Stock_Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL STOCK", "GENERATOR", "PARTS", "OFFICE", "WAREHOUSE" }));
        Stock_Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stock_CategoryActionPerformed(evt);
            }
        });
        STOCKS_1.add(Stock_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 200, 31));

        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)), "SUMMARY OF STOCK", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 0, 26), new java.awt.Color(51, 51, 51))); // NOI18N
        STOCKS_1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1320, 480));

        Stock_Genset_Panel_View1.setBackground(new java.awt.Color(255, 77, 77));

        Stock_Genset_Delete.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_Delete.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_View.png"))); // NOI18N
        Stock_Genset_Delete.setText("  DELETE ");
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

        javax.swing.GroupLayout Stock_Genset_Panel_View1Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_View1);
        Stock_Genset_Panel_View1.setLayout(Stock_Genset_Panel_View1Layout);
        Stock_Genset_Panel_View1Layout.setHorizontalGroup(
            Stock_Genset_Panel_View1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_View1Layout.setVerticalGroup(
            Stock_Genset_Panel_View1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        STOCKS_1.add(Stock_Genset_Panel_View1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, 190, 45));

        Stock_Genset_Panel_Supplier3.setBackground(new java.awt.Color(102, 143, 143));

        Stock_Genset_AllPrint1.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Stock_Genset_AllPrint1.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_AllPrint1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_AllPrint1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Print.png"))); // NOI18N
        Stock_Genset_AllPrint1.setText("ORDER # PRINT");
        Stock_Genset_AllPrint1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Genset_AllPrint1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Genset_AllPrint1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Genset_AllPrint1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_Supplier3Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_Supplier3);
        Stock_Genset_Panel_Supplier3.setLayout(Stock_Genset_Panel_Supplier3Layout);
        Stock_Genset_Panel_Supplier3Layout.setHorizontalGroup(
            Stock_Genset_Panel_Supplier3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_AllPrint1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Supplier3Layout.setVerticalGroup(
            Stock_Genset_Panel_Supplier3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_AllPrint1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        STOCKS_1.add(Stock_Genset_Panel_Supplier3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 520, 200, 45));

        JTab.addTab("", STOCKS_1);

        SALES_3.setkEndColor(new java.awt.Color(42, 142, 142));
        SALES_3.setkGradientFocus(700);
        SALES_3.setkStartColor(new java.awt.Color(42, 142, 142));
        SALES_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SALES_3MouseEntered(evt);
            }
        });
        SALES_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Stock_Genset_Panel_Add3.setBackground(new java.awt.Color(24, 165, 88));

        Shop_Add1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Shop_Add1.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Add1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Add1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/New/cursor_30px.png"))); // NOI18N
        Shop_Add1.setText("SELECT ");
        Shop_Add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Add1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Add1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Add1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_Add3Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_Add3);
        Stock_Genset_Panel_Add3.setLayout(Stock_Genset_Panel_Add3Layout);
        Stock_Genset_Panel_Add3Layout.setHorizontalGroup(
            Stock_Genset_Panel_Add3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Add3Layout.setVerticalGroup(
            Stock_Genset_Panel_Add3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        SALES_3.add(Stock_Genset_Panel_Add3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 170, 45));
        SALES_3.add(Sale_Category_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 150, 30));

        jTextField5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });
        SALES_3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 240, 31));

        Sale_Category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Sale_Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL STOCK", "GENERATOR", "PARTS" }));
        Sale_Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sale_CategoryActionPerformed(evt);
            }
        });
        SALES_3.add(Sale_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 200, 31));

        Sales_Table_Generator.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Sales_Table_Generator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sales_Table_GeneratorMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(Sales_Table_Generator);

        SALES_3.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 1280, 370));
        SALES_3.add(process, new org.netbeans.lib.awtextra.AbsoluteConstraints(1274, 30, 70, 30));

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Search.png"))); // NOI18N
        SALES_3.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 35, 31));

        jTextField10.setBackground(new java.awt.Color(102, 255, 255));
        jTextField10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("CATEGORY");
        SALES_3.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 130, 31));

        Stock_Genset_Panel_Add5.setBackground(new java.awt.Color(245, 225, 200));

        Shop_Add3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Shop_Add3.setForeground(new java.awt.Color(51, 102, 255));
        Shop_Add3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Add3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Next.png"))); // NOI18N
        Shop_Add3.setText("  NEXT");
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
            .addComponent(Shop_Add3, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Add5Layout.setVerticalGroup(
            Stock_Genset_Panel_Add5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        SALES_3.add(Stock_Genset_Panel_Add5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 170, 45));

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)), "SUMMARY OF SALE", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 0, 26), new java.awt.Color(51, 51, 51))); // NOI18N
        SALES_3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1320, 480));

        Stock_Genset_Panel_Supplier2.setBackground(new java.awt.Color(153, 153, 102));

        Stock_Genset_Customer.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Stock_Genset_Customer.setForeground(new java.awt.Color(255, 255, 255));
        Stock_Genset_Customer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock_Genset_Customer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Supplier.png"))); // NOI18N
        Stock_Genset_Customer.setText("CUSTOMER");
        Stock_Genset_Customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Stock_Genset_CustomerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Stock_Genset_CustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Stock_Genset_CustomerMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_Supplier2Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_Supplier2);
        Stock_Genset_Panel_Supplier2.setLayout(Stock_Genset_Panel_Supplier2Layout);
        Stock_Genset_Panel_Supplier2Layout.setHorizontalGroup(
            Stock_Genset_Panel_Supplier2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Customer, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Supplier2Layout.setVerticalGroup(
            Stock_Genset_Panel_Supplier2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stock_Genset_Customer, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        SALES_3.add(Stock_Genset_Panel_Supplier2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 170, 45));

        JTab.addTab("", SALES_3);

        CART_4.setkEndColor(new java.awt.Color(42, 142, 142));
        CART_4.setkGradientFocus(700);
        CART_4.setkStartColor(new java.awt.Color(42, 142, 142));
        CART_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CART_4MouseEntered(evt);
            }
        });
        CART_4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Stock_Genset_Panel_Add4.setBackground(new java.awt.Color(24, 165, 88));

        Shop_Add2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Shop_Add2.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Add2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Add2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/New/cursor_30px.png"))); // NOI18N
        Shop_Add2.setText("CART NOW");
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
            .addComponent(Shop_Add2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Add4Layout.setVerticalGroup(
            Stock_Genset_Panel_Add4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        CART_4.add(Stock_Genset_Panel_Add4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 170, 45));
        CART_4.add(Cart_Category_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 150, 30));

        jTextField6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });
        CART_4.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 240, 31));

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
        });
        jScrollPane9.setViewportView(Cart_Table);

        CART_4.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 1280, 370));
        CART_4.add(process1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1274, 30, 70, 30));

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Search.png"))); // NOI18N
        CART_4.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 35, 31));

        jTextField11.setBackground(new java.awt.Color(255, 255, 0));
        jTextField11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("CATEGORY");
        CART_4.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 130, 31));

        Stock_Genset_Panel_Add6.setBackground(new java.awt.Color(204, 204, 255));

        Shop_Add4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Shop_Add4.setForeground(new java.awt.Color(98, 71, 73));
        Shop_Add4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Add4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/arrow_35px.png"))); // NOI18N
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
            .addGroup(Stock_Genset_Panel_Add6Layout.createSequentialGroup()
                .addComponent(Shop_Add4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );
        Stock_Genset_Panel_Add6Layout.setVerticalGroup(
            Stock_Genset_Panel_Add6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add4, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        CART_4.add(Stock_Genset_Panel_Add6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, -1, -1));

        Stock_Genset_Panel_Add7.setBackground(new java.awt.Color(255, 77, 77));

        Shop_Add5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Shop_Add5.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Add5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Add5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Cancel.png"))); // NOI18N
        Shop_Add5.setText(" REMOVE");
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
            .addGroup(Stock_Genset_Panel_Add7Layout.createSequentialGroup()
                .addComponent(Shop_Add5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );
        Stock_Genset_Panel_Add7Layout.setVerticalGroup(
            Stock_Genset_Panel_Add7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add5, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        CART_4.add(Stock_Genset_Panel_Add7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, -1, -1));

        Cart_Category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Cart_Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL STOCK", "GENERATOR", "PARTS" }));
        Cart_Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cart_CategoryActionPerformed(evt);
            }
        });
        CART_4.add(Cart_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 200, 30));

        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)), "CART", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 0, 26), new java.awt.Color(51, 51, 51))); // NOI18N
        CART_4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1320, 480));

        JTab.addTab("", CART_4);

        OW_STOCK_5.setkEndColor(new java.awt.Color(42, 142, 142));
        OW_STOCK_5.setkGradientFocus(700);
        OW_STOCK_5.setkStartColor(new java.awt.Color(42, 142, 142));
        OW_STOCK_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OW_STOCK_5MouseEntered(evt);
            }
        });
        OW_STOCK_5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Stock_Genset_Panel_Add8.setBackground(new java.awt.Color(24, 165, 88));

        Shop_Add6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Shop_Add6.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Add6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Add6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/New/cursor_30px.png"))); // NOI18N
        Shop_Add6.setText("SELECT ");
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
            .addComponent(Shop_Add6, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Add8Layout.setVerticalGroup(
            Stock_Genset_Panel_Add8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add6, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        OW_STOCK_5.add(Stock_Genset_Panel_Add8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 170, 45));
        OW_STOCK_5.add(Warehouse_Office_Category_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 150, 30));

        jTextField9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField9KeyPressed(evt);
            }
        });
        OW_STOCK_5.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 240, 31));

        Warehouse_Office_Category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Warehouse_Office_Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL STOCK", "WAREHOUSE", "OFFICE" }));
        Warehouse_Office_Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Warehouse_Office_CategoryActionPerformed(evt);
            }
        });
        OW_STOCK_5.add(Warehouse_Office_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 200, 31));

        office_warehouse_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        office_warehouse_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                office_warehouse_TableMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(office_warehouse_Table);

        OW_STOCK_5.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 1280, 370));
        OW_STOCK_5.add(process2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1274, 30, 70, 30));

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Search.png"))); // NOI18N
        OW_STOCK_5.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 35, 31));

        jTextField12.setBackground(new java.awt.Color(102, 255, 255));
        jTextField12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("CATEGORY");
        OW_STOCK_5.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 130, 31));

        Stock_Genset_Panel_Add9.setBackground(new java.awt.Color(245, 225, 200));

        Shop_Add7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Shop_Add7.setForeground(new java.awt.Color(51, 102, 255));
        Shop_Add7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Add7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Next.png"))); // NOI18N
        Shop_Add7.setText("  NEXT");
        Shop_Add7.setToolTipText("");
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
            .addComponent(Shop_Add7, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Add9Layout.setVerticalGroup(
            Stock_Genset_Panel_Add9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add7, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        OW_STOCK_5.add(Stock_Genset_Panel_Add9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 170, 45));

        jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)), "SUMMARY OF REQUEST", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 0, 26), new java.awt.Color(51, 51, 51))); // NOI18N
        OW_STOCK_5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1320, 480));

        JTab.addTab("", OW_STOCK_5);

        OW_CART_6.setkEndColor(new java.awt.Color(42, 142, 142));
        OW_CART_6.setkGradientFocus(700);
        OW_CART_6.setkStartColor(new java.awt.Color(42, 142, 142));
        OW_CART_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OW_CART_6MouseEntered(evt);
            }
        });
        OW_CART_6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Stock_Genset_Panel_Add10.setBackground(new java.awt.Color(24, 165, 88));

        Shop_Add8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Shop_Add8.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Add8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Add8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/New/cursor_30px.png"))); // NOI18N
        Shop_Add8.setText("SELECT ");
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
            .addComponent(Shop_Add8, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Add10Layout.setVerticalGroup(
            Stock_Genset_Panel_Add10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add8, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        OW_CART_6.add(Stock_Genset_Panel_Add10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 170, 45));
        OW_CART_6.add(Cart_Warehouse_Office_Category_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 150, 30));

        jTextField13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField13KeyPressed(evt);
            }
        });
        OW_CART_6.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 240, 31));

        Cart_Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Cart_Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cart_Table1MouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(Cart_Table1);

        OW_CART_6.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 1280, 370));
        OW_CART_6.add(process3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1274, 30, 70, 30));

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Search.png"))); // NOI18N
        OW_CART_6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 35, 31));

        jTextField14.setBackground(new java.awt.Color(255, 255, 0));
        jTextField14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("CATEGORY");
        OW_CART_6.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 130, 31));

        Stock_Genset_Panel_Add11.setBackground(new java.awt.Color(204, 204, 255));

        Shop_Add9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Shop_Add9.setForeground(new java.awt.Color(98, 71, 73));
        Shop_Add9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Add9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/arrow_35px.png"))); // NOI18N
        Shop_Add9.setText(" BACK");
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
            .addComponent(Shop_Add9, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Add11Layout.setVerticalGroup(
            Stock_Genset_Panel_Add11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add9, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        OW_CART_6.add(Stock_Genset_Panel_Add11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, -1, -1));

        Stock_Genset_Panel_Add12.setBackground(new java.awt.Color(255, 77, 77));

        Shop_Add10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Shop_Add10.setForeground(new java.awt.Color(255, 255, 255));
        Shop_Add10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Shop_Add10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Btn/Btn_Cancel.png"))); // NOI18N
        Shop_Add10.setText(" REMOVE");
        Shop_Add10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Shop_Add10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Shop_Add10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Shop_Add10MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Stock_Genset_Panel_Add12Layout = new javax.swing.GroupLayout(Stock_Genset_Panel_Add12);
        Stock_Genset_Panel_Add12.setLayout(Stock_Genset_Panel_Add12Layout);
        Stock_Genset_Panel_Add12Layout.setHorizontalGroup(
            Stock_Genset_Panel_Add12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add10, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        Stock_Genset_Panel_Add12Layout.setVerticalGroup(
            Stock_Genset_Panel_Add12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Shop_Add10, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        OW_CART_6.add(Stock_Genset_Panel_Add12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, -1, -1));

        Cart_Warehouse_Office_Category.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Cart_Warehouse_Office_Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL STOCK", "WAREHOUSE", "CATEGORY" }));
        Cart_Warehouse_Office_Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cart_Warehouse_Office_CategoryActionPerformed(evt);
            }
        });
        OW_CART_6.add(Cart_Warehouse_Office_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 200, 30));

        jLabel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)), "SUMMARY OF STOCK", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 0, 26), new java.awt.Color(51, 51, 51))); // NOI18N
        OW_CART_6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1320, 480));

        JTab.addTab("", OW_CART_6);

        getContentPane().add(JTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 94, 1370, 630));

        setSize(new java.awt.Dimension(1361, 724));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Stock_Genset_ViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_ViewMouseExited
    
        Stock_Genset_Panel_View.setBackground(new Color(66,139,202));
        Stock_Genset_View.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Stock_Genset_ViewMouseExited

    private void Stock_Genset_ViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_ViewMouseEntered
      Stock_Genset_Panel_View.setBackground(new Color(163, 235, 177));
      Stock_Genset_View.setForeground(new Color(33, 21, 34));
     

    }//GEN-LAST:event_Stock_Genset_ViewMouseEntered

    private void Stock_Genset_ViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_ViewMouseClicked

        //JOptionPane.showMessageDialog(null, "SELECT ITEM !");
        if(Stock_cat == null){
            JOptionPane.showMessageDialog(null, "SELECT ITEM !");
        }
        else{
            if(Stock_cat.equals("GENERATOR")){
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
        }
//        if(Stock_cat.equals("")){
//            JOptionPane.showMessageDialog(null, "SELECT ITEM ! ","",JOptionPane.ERROR_MESSAGE);
//        }else if(Stock_cat.equals("GENERATOR")){
//           View_Generator ig = new View_Generator();
//           ig.setVisible(true);
//        }else if(Stock_cat.equals("PARTS")){
//           View_Parts ig = new View_Parts();
//           ig.setVisible(true);
//        }else if(Stock_cat.equals("WAREHOUSE")){
//           View_Warehouse ig = new View_Warehouse();
//           ig.setVisible(true);
//        }else if(Stock_cat.equals("OFFICE")){
//           View_Office ig = new View_Office();
//           ig.setVisible(true);
//        }

    }//GEN-LAST:event_Stock_Genset_ViewMouseClicked

    private void searched_all_stockKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searched_all_stockKeyPressed

    }//GEN-LAST:event_searched_all_stockKeyPressed

    private void All_Stock_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_All_Stock_TableMouseClicked
        int i=All_Stock_Table.getSelectedRow();
        TableModel model = All_Stock_Table.getModel();
        Stock_Category_Id.setText(model.getValueAt(i,0).toString());
        Stock_cat = model.getValueAt(i,2).toString();
        as.dispose();
    }//GEN-LAST:event_All_Stock_TableMouseClicked

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

    private void Stock_Genset_AllPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_AllPrintMouseClicked
          try{
          DefaultTableModel tablemodel =(DefaultTableModel) All_Stock_Table.getModel();
          HashMap<String, Object> params = new HashMap<String, Object>();
          BufferedImage image = ImageIO.read(getClass().getResource("logo.png"));
          params.put("logo", image );
          //JasperPrint jasperPrint = null;
          JasperCompileManager.compileReportToFile("C:\\Users\\"+located+"\\Documents\\NetBeansProjects\\FieldPowerEnterprises\\src\\FPE\\summary_stock.jrxml");
          JasperPrint jasperPrint = JasperFillManager.fillReport("C:\\Users\\"+located+"\\Documents\\NetBeansProjects\\FieldPowerEnterprises\\src\\FPE\\summary_stock.jasper", params, new JRTableModelDataSource(tablemodel));
          JasperViewer.viewReport(jasperPrint, false);
        }
        catch(Exception e){
            e.printStackTrace();
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

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5KeyPressed

    private void Sale_CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sale_CategoryActionPerformed
       String Stock_Table = Sale_Category.getSelectedItem().toString();
        if(Stock_Table.equals("ALL STOCK")){
             Show_Sale.Sales_Stocks();
        }else if(Stock_Table.equals("GENERATOR")){
             Show_Sale.Sales_Generator();
        }else if(Stock_Table.equals("PARTS")){
             Show_Sale.Sales_Parts();
        }
    }//GEN-LAST:event_Sale_CategoryActionPerformed

    private void SALES_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALES_3MouseEntered
        Dispose();
    }//GEN-LAST:event_SALES_3MouseEntered

    private void STOCKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STOCKMouseClicked
        JTab.setSelectedIndex(1);
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
        // TODO add your handling code here:
    }//GEN-LAST:event_REPORTMouseClicked

    private void REPORTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPORTMouseEntered
        REPORT_PANEL.setBackground(new Color(163, 235, 177));
        REPORT.setForeground(new Color(51,51,51));
        
        adr.setVisible(true);
    }//GEN-LAST:event_REPORTMouseEntered

    private void REPORTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPORTMouseExited
        REPORT_PANEL.setBackground(new Color(0,117,128));
        REPORT.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_REPORTMouseExited

    private void SALEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALEMouseClicked
        JTab.setSelectedIndex(2);
    }//GEN-LAST:event_SALEMouseClicked

    private void SALEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALEMouseEntered
        SALE_PANEL.setBackground(new Color(163, 235, 177));
        SALE.setForeground(new Color(51,51,51));
        
        ads.setVisible(true);
    }//GEN-LAST:event_SALEMouseEntered

    private void SALEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SALEMouseExited
        SALE_PANEL.setBackground(new Color(0,117,128));
        SALE.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_SALEMouseExited

    private void ACCOUNTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACCOUNTMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ACCOUNTMouseClicked

    private void ACCOUNTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACCOUNTMouseEntered
        ACCOUNT_PANEL.setBackground(new Color(163, 235, 177));
        ACCOUNT.setForeground(new Color(51,51,51));
        
        ada.setVisible(true);
        
    }//GEN-LAST:event_ACCOUNTMouseEntered

    private void ACCOUNTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ACCOUNTMouseExited
        ACCOUNT_PANEL.setBackground(new Color(0,117,128));
        ACCOUNT.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_ACCOUNTMouseExited

    private void Sales_Table_GeneratorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sales_Table_GeneratorMouseClicked
       int i=Sales_Table_Generator.getSelectedRow();
        TableModel model = Sales_Table_Generator.getModel();
        sales_id = model.getValueAt(i,0).toString();
        s_category = model.getValueAt(i,2).toString();
        as.dispose();
    }//GEN-LAST:event_Sales_Table_GeneratorMouseClicked

    private void Shop_Add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add1MouseClicked
        if(s_category.equals("GENERATOR")){
          Sale_Stock ss = new Sale_Stock();
          ss.setVisible(true);
        }
        else if(s_category.equals("PARTS")){
          Sales_Parts sp = new Sales_Parts();
          sp.setVisible(true);
         
        }else
        {
            
        }
                
    }//GEN-LAST:event_Shop_Add1MouseClicked

    private void Shop_Add1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Add1MouseEntered

    private void Shop_Add1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Add1MouseExited

    private void All_Stock_TableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_All_Stock_TableMouseEntered
        as.dispose();
    }//GEN-LAST:event_All_Stock_TableMouseEntered

    private void Shop_Add2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add2MouseClicked
       AddCart ac = new AddCart();
       ac.setVisible(true);
    }//GEN-LAST:event_Shop_Add2MouseClicked

    private void Shop_Add2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Add2MouseEntered

    private void Shop_Add2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Add2MouseExited

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6KeyPressed

    private void Cart_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cart_TableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Cart_TableMouseClicked

    private void CART_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CART_4MouseEntered
        Dispose();
    }//GEN-LAST:event_CART_4MouseEntered

    private void Shop_Add3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add3MouseClicked
        JTab.setSelectedIndex(4);
    }//GEN-LAST:event_Shop_Add3MouseClicked

    private void Shop_Add3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Add3MouseEntered

    private void Shop_Add3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Add3MouseExited

    private void Shop_Add4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add4MouseClicked
        JTab.setSelectedIndex(3);
    }//GEN-LAST:event_Shop_Add4MouseClicked

    private void Shop_Add4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Add4MouseEntered

    private void Shop_Add4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Add4MouseExited

    private void Shop_Add5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Add5MouseClicked

    private void Shop_Add5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Add5MouseEntered

    private void Shop_Add5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Add5MouseExited

    private void Cart_CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cart_CategoryActionPerformed
       String cart_car = Cart_Category.getSelectedItem().toString();
       if(cart_car.equals("ALL STOCK")){
          Show_Cart.Cart();
       }else if(cart_car.equals("GENERATOR")){
          Show_Cart.Cart_Generator();
       }else if(cart_car.equals("PARTS")){
          Show_Cart.Cart_Parts();  
       }
    }//GEN-LAST:event_Cart_CategoryActionPerformed

    private void Shop_Add6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add6MouseClicked
 
    }//GEN-LAST:event_Shop_Add6MouseClicked

    private void Shop_Add6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Add6MouseEntered

    private void Shop_Add6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Add6MouseExited

    private void jTextField9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9KeyPressed

    private void Warehouse_Office_CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Warehouse_Office_CategoryActionPerformed
        String cart_car = Warehouse_Office_Category.getSelectedItem().toString();
       if(cart_car.equals("ALL STOCK")){
          Show_OW.Sales_OW();
       }else if(cart_car.equals("WAREHOUSE")){
          Show_OW.Sales_WareHouse();
       }else if(cart_car.equals("OFFICE")){
          Show_OW.Sales_Office();  
       }
    }//GEN-LAST:event_Warehouse_Office_CategoryActionPerformed

    private void office_warehouse_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_office_warehouse_TableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_office_warehouse_TableMouseClicked

    private void Shop_Add7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add7MouseClicked
        JTab.setSelectedIndex(6);
    }//GEN-LAST:event_Shop_Add7MouseClicked

    private void Shop_Add7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Add7MouseEntered

    private void Shop_Add7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Add7MouseExited

    private void OW_STOCK_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OW_STOCK_5MouseEntered
        Dispose();
    }//GEN-LAST:event_OW_STOCK_5MouseEntered

    private void Shop_Add8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Add8MouseClicked

    private void Shop_Add8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Add8MouseEntered

    private void Shop_Add8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Add8MouseExited

    private void jTextField13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13KeyPressed

    private void Cart_Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cart_Table1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Cart_Table1MouseClicked

    private void Shop_Add9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add9MouseClicked
        JTab.setSelectedIndex(5);
    }//GEN-LAST:event_Shop_Add9MouseClicked

    private void Shop_Add9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Add9MouseEntered

    private void Shop_Add9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add9MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Add9MouseExited

    private void Shop_Add10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Add10MouseClicked

    private void Shop_Add10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Add10MouseEntered

    private void Shop_Add10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Shop_Add10MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Shop_Add10MouseExited

    private void Cart_Warehouse_Office_CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cart_Warehouse_Office_CategoryActionPerformed
   String cart_car = Warehouse_Office_Category.getSelectedItem().toString();
       if(cart_car.equals("ALL STOCK")){
          Show_OW_Cart.addcartOW();
       }else if(cart_car.equals("WAREHOUSE")){
          Show_OW_Cart.addcartWareHouse();
       }else if(cart_car.equals("OFFICE")){
          Show_OW_Cart.addcartOffice();  
       }
    }//GEN-LAST:event_Cart_Warehouse_Office_CategoryActionPerformed

    private void OW_CART_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OW_CART_6MouseEntered
        Dispose();
    }//GEN-LAST:event_OW_CART_6MouseEntered

    private void searched_all_stockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searched_all_stockKeyReleased
        Stock_Category.setSelectedIndex(0);
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
        String sql = "SELECT `ID`, `DATE RECEIVED`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, FORMAT(`SUPPLIER PRICE`, '#,##0.00') AS `SUPPLIER PRICE`, FORMAT(`SELLER PRICE`, '#,##0.00') AS `SELLER PRICE`, `ENGINE S N`, `ALTERNATOR S N`, `QUANTITY`, `PERSON IN CHARGE`, `REMARKS`, `SUPPLIER` FROM `summary_stock` WHERE  `ID` LIKE '%"+searched_all_stock.getText()+"%' OR `DATE RECEIVED` LIKE '%"+searched_all_stock.getText()+"%' OR `CATEGORY` LIKE '%"+searched_all_stock.getText()+"%' OR `BRAND` LIKE '%"+searched_all_stock.getText()+"%' OR `MODEL` LIKE '%"+searched_all_stock.getText()+"%' OR `KVA` LIKE '%"+searched_all_stock.getText()+"%' OR `PHASING` LIKE '%"+searched_all_stock.getText()+"%' OR `TYPE` LIKE '%"+searched_all_stock.getText()+"%' OR `SUPPLIER PRICE` LIKE '%"+searched_all_stock.getText()+"%' OR `SELLER PRICE` LIKE '%"+searched_all_stock.getText()+"%' OR `ENGINE S N` LIKE '%"+searched_all_stock.getText()+"%' OR `ALTERNATOR S N` LIKE '%"+searched_all_stock.getText()+"%' OR `QUANTITY` LIKE '%"+searched_all_stock.getText()+"%' OR `PERSON IN CHARGE` LIKE '%"+searched_all_stock+"%' OR `REMARKS` LIKE '%"+searched_all_stock.getText()+"%' OR `SUPPLIER` LIKE '%"+searched_all_stock.getText()+"%'";
        ps = FPE_DB.getConnection().prepareStatement(sql);
        rs = ps.executeQuery();
        All_Stock_Table.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
        All_Stock_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_searched_all_stockKeyReleased

    private void Stock_Genset_DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_DeleteMouseClicked
            String sid = Stock_Category_Id.getText();

            
            if(sid.equals("")){
                JOptionPane.showMessageDialog(null, " PLEASE SELECT! ","",JOptionPane.ERROR_MESSAGE);
                all_stock();
            }
            else{
                            int opt = JOptionPane.showConfirmDialog(null, "YOU WANT TO DELETE THIS STOCK ? ","",JOptionPane.YES_NO_OPTION);
                if(opt==0){
                    if(JOptionPane.YES_NO_OPTION == JOptionPane.YES_OPTION && !Class_SummaryStock.DeleteGenset(sid) ){
                         JOptionPane.showMessageDialog(null, " DELETE STOCK! ","",JOptionPane.ERROR_MESSAGE);
                         all_stock();
                     }
                }                
            }

    }//GEN-LAST:event_Stock_Genset_DeleteMouseClicked

    private void Stock_Genset_DeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_DeleteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_DeleteMouseEntered

    private void Stock_Genset_DeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_DeleteMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_DeleteMouseExited

    private void Stock_Genset_CustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_CustomerMouseClicked
        Table_Customer tcs = new Table_Customer();
        tcs.setVisible(true);
    }//GEN-LAST:event_Stock_Genset_CustomerMouseClicked

    private void Stock_Genset_CustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_CustomerMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_CustomerMouseEntered

    private void Stock_Genset_CustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_CustomerMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_CustomerMouseExited

    private void Stock_Genset_AllPrint1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_AllPrint1MouseClicked
        JTab.setSelectedIndex(7);
    }//GEN-LAST:event_Stock_Genset_AllPrint1MouseClicked

    private void Stock_Genset_AllPrint1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_AllPrint1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_AllPrint1MouseEntered

    private void Stock_Genset_AllPrint1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stock_Genset_AllPrint1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Stock_Genset_AllPrint1MouseExited

    private void Stock_CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stock_CategoryActionPerformed
        String path = Stock_Category.getSelectedItem().toString();
        
        if(path.equals("ALL STOCK")){
            ct.Stocks();
        }
        else if(path.equals("GENERATOR")){
            ct.Generator();
        }
        else if(path.equals("OFFICE")){
            ct.Office();
        }
        else if(path.equals("WAREHOUSE")){
            ct.WareHouse();
        }
    }//GEN-LAST:event_Stock_CategoryActionPerformed

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        Dispose();
    }//GEN-LAST:event_jLabel2MouseEntered

    private void JTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTabMouseEntered
        Dispose();
    }//GEN-LAST:event_JTabMouseEntered

    private void HOME_0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOME_0MouseEntered
        Dispose();
    }//GEN-LAST:event_HOME_0MouseEntered
      
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
    public static javax.swing.JTable All_Stock_Table;
    private keeptoo.KGradientPanel CART_4;
    private javax.swing.JComboBox<String> Cart_Category;
    public static javax.swing.JLabel Cart_Category_Id;
    public static javax.swing.JTable Cart_Table;
    public static javax.swing.JTable Cart_Table1;
    private javax.swing.JComboBox<String> Cart_Warehouse_Office_Category;
    public static javax.swing.JLabel Cart_Warehouse_Office_Category_Id;
    private javax.swing.JPanel HEADER;
    private javax.swing.JLabel HOME;
    private keeptoo.KGradientPanel HOME_0;
    private javax.swing.JPanel HOME_PANEL;
    public static javax.swing.JTabbedPane JTab;
    private keeptoo.KGradientPanel OW_CART_6;
    private keeptoo.KGradientPanel OW_STOCK_5;
    private javax.swing.JLabel REPORT;
    private javax.swing.JPanel REPORT_PANEL;
    private javax.swing.JLabel SALE;
    private keeptoo.KGradientPanel SALES_3;
    private javax.swing.JPanel SALE_PANEL;
    private javax.swing.JLabel STOCK;
    private keeptoo.KGradientPanel STOCKS_1;
    private javax.swing.JPanel STOCK_PANEL;
    private javax.swing.JComboBox<String> Sale_Category;
    public static javax.swing.JLabel Sale_Category_Id;
    public static javax.swing.JTable Sales_Table_Generator;
    public static javax.swing.JLabel Shop_Add1;
    public static javax.swing.JLabel Shop_Add10;
    public static javax.swing.JLabel Shop_Add2;
    public static javax.swing.JLabel Shop_Add3;
    public static javax.swing.JLabel Shop_Add4;
    public static javax.swing.JLabel Shop_Add5;
    public static javax.swing.JLabel Shop_Add6;
    public static javax.swing.JLabel Shop_Add7;
    public static javax.swing.JLabel Shop_Add8;
    public static javax.swing.JLabel Shop_Add9;
    private javax.swing.JComboBox<String> Stock_Category;
    public static javax.swing.JLabel Stock_Category_Id;
    public static javax.swing.JLabel Stock_Genset_Add;
    public static javax.swing.JLabel Stock_Genset_AllPrint;
    public static javax.swing.JLabel Stock_Genset_AllPrint1;
    public static javax.swing.JLabel Stock_Genset_Customer;
    public static javax.swing.JLabel Stock_Genset_Delete;
    public static javax.swing.JPanel Stock_Genset_Panel_Add;
    public static javax.swing.JPanel Stock_Genset_Panel_Add10;
    public static javax.swing.JPanel Stock_Genset_Panel_Add11;
    public static javax.swing.JPanel Stock_Genset_Panel_Add12;
    public static javax.swing.JPanel Stock_Genset_Panel_Add3;
    public static javax.swing.JPanel Stock_Genset_Panel_Add4;
    public static javax.swing.JPanel Stock_Genset_Panel_Add5;
    public static javax.swing.JPanel Stock_Genset_Panel_Add6;
    public static javax.swing.JPanel Stock_Genset_Panel_Add7;
    public static javax.swing.JPanel Stock_Genset_Panel_Add8;
    public static javax.swing.JPanel Stock_Genset_Panel_Add9;
    public static javax.swing.JPanel Stock_Genset_Panel_Supplier;
    public static javax.swing.JPanel Stock_Genset_Panel_Supplier1;
    public static javax.swing.JPanel Stock_Genset_Panel_Supplier2;
    public static javax.swing.JPanel Stock_Genset_Panel_Supplier3;
    public static javax.swing.JPanel Stock_Genset_Panel_View;
    public static javax.swing.JPanel Stock_Genset_Panel_View1;
    public static javax.swing.JLabel Stock_Genset_Supplier;
    public static javax.swing.JLabel Stock_Genset_View;
    private javax.swing.JComboBox<String> Warehouse_Office_Category;
    public static javax.swing.JLabel Warehouse_Office_Category_Id;
    private javax.swing.JLabel fpe_home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField9;
    public static javax.swing.JTable office_warehouse_Table;
    private javax.swing.JLabel pat_back_filter;
    private javax.swing.JLabel pat_back_genset;
    public static javax.swing.JLabel process;
    private javax.swing.JLabel process1;
    public static javax.swing.JLabel process2;
    private javax.swing.JLabel process3;
    private javax.swing.JTextField searched_all_stock;
    public static javax.swing.JLabel stock_supplier_id;
    // End of variables declaration//GEN-END:variables
}
