package FPE;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

import static FPE.Table_Supplier.Supplier_table;
import static FPE.Table_Customer.Customer_Table;

import static FPE.Webpage.All_Stock_Table;
import static FPE.Webpage.office_warehouse_Table;

import static FPE.Webpage.Cart_Table;
import static FPE.Webpage.Sales_Table_Generator;
        
public class Class_tables {
  
    public boolean Stocks(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `DATE RECEIVED`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, FORMAT(`SUPPLIER PRICE`, '#,##0.00') AS `SUPPLIER PRICE`, FORMAT(`SELLER PRICE`, '#,##0.00') AS `SELLER PRICE`, `ENGINE S N`, `ALTERNATOR S N`, `QUANTITY`, `PERSON IN CHARGE`, `REMARKS`, `SUPPLIER` FROM `summary_stock`");
        ResultSet rs = ps.executeQuery();
        All_Stock_Table.setModel(DbUtils.resultSetToTableModel(rs));
        All_Stock_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean Generator(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`,`DATE RECEIVED`,`CATEGORY`,`BRAND`,`MODEL`,`KVA`,`PHASING`,`TYPE`,`SELLER PRICE`,`ENGINE S N`,`ALTERNATOR S N`,`SUPPLIER` FROM `summary_stock` WHERE `CATEGORY`='GENERATOR'");
        ResultSet rs = ps.executeQuery();
        All_Stock_Table.setModel(DbUtils.resultSetToTableModel(rs));
        All_Stock_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean Parts(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `DATE RECEIVED`, `CATEGORY`, `BRAND`,`TYPE`, `SELLER PRICE`, `QUANTITY`, `REMARKS`,`SUPPLIER` FROM `summary_stock` WHERE `CATEGORY` = 'PARTS'");
        ResultSet rs = ps.executeQuery();
        All_Stock_Table.setModel(DbUtils.resultSetToTableModel(rs));
        All_Stock_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean Office(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `DATE RECEIVED`, `CATEGORY`, `BRAND`,`TYPE`, `SELLER PRICE`, `QUANTITY`, `PERSON IN CHARGE`, `REMARKS` FROM `summary_stock` WHERE `CATEGORY` = 'OFFICE'");
        ResultSet rs = ps.executeQuery();
        All_Stock_Table.setModel(DbUtils.resultSetToTableModel(rs));
        All_Stock_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean WareHouse(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `DATE RECEIVED`, `CATEGORY`, `BRAND`,`TYPE`, `SELLER PRICE`, `QUANTITY`, `PERSON IN CHARGE`, `REMARKS` FROM `summary_stock` WHERE `CATEGORY` = 'WAREHOUSE'");
        ResultSet rs = ps.executeQuery();
        All_Stock_Table.setModel(DbUtils.resultSetToTableModel(rs));
        All_Stock_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    
    // SALE -----------------------------------------------------------------------------------------------------------------
       
    
    public boolean Sales_Stocks(){
//        try{
//        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`,`CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`,FORMAT(`SELLER PRICE`, '#,##0.00') AS `PRICE`, `ENGINE S N`, `ALTERNATOR S N`, `QUANTITY`, `SUPPLIER` FROM `summary_stock` WHERE `CATEGORY`='GENERATOR' OR `CATEGORY`='PARTS'  ");
//        ResultSet rs = ps.executeQuery();
//        Sales_Table_Generator.setModel(DbUtils.resultSetToTableModel(rs));
//        Sales_Table_Generator.getColumnModel().getColumn(0).setMaxWidth(100);
//        }catch(Exception e){
//              //System.out.println(e);
//            }
        return false;
    }
    
      public boolean Sales_Generator(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`,`DATE RECEIVED`,`CATEGORY`,`BRAND`,`MODEL`,`KVA`,`PHASING`,`TYPE`,FORMAT(`SELLER PRICE`, '#,##0.00') AS `SELLER PRICE`,`ENGINE S N`,`ALTERNATOR S N`,`SUPPLIER` FROM `summary_stock` WHERE `CATEGORY`='GENERATOR'");
        ResultSet rs = ps.executeQuery();
        Sales_Table_Generator.setModel(DbUtils.resultSetToTableModel(rs));
        Sales_Table_Generator.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean Sales_Parts(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `DATE RECEIVED`, `CATEGORY`, `BRAND`,`TYPE`, `SELLER PRICE`, `QUANTITY`, `REMARKS`,`SUPPLIER` FROM `summary_stock` WHERE `CATEGORY` = 'PARTS'");
        ResultSet rs = ps.executeQuery();
        Sales_Table_Generator.setModel(DbUtils.resultSetToTableModel(rs));
        Sales_Table_Generator.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    
   // CART  -----------------------------------------------------------------------------------------------------------------
    
    
       public boolean Cart(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, `SELLER PRICE`, `ENGINE S N`, `ALTERNATOR S N` FROM `add_cart`");
        ResultSet rs = ps.executeQuery();
        Cart_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Cart_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean Cart_Generator(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, `SELLER PRICE`, `ENGINE S N`, `ALTERNATOR S N` FROM `add_cart` WHERE `CATEGORY`= 'GENERATOR'");
        ResultSet rs = ps.executeQuery();
        Cart_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Cart_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean Cart_Parts(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT`CATEGORY`, `BRAND`,`TYPE`,`SELLER PRICE`, `QUANTITY` FROM `add_cart` WHERE `CATEGORY`='PARTS'");
        ResultSet rs = ps.executeQuery();
        Cart_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Cart_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    
    // WAREHOPUSE AMD STOCK  -----------------------------------------------------------------------------------------------------------------
    
    
    
    public boolean Sales_OW(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`,`CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`,(`SELLER PRICE`) AS  PRICE, `ENGINE S N`, `ALTERNATOR S N`, `QUANTITY`, `SUPPLIER` FROM `summary_stock` WHERE `CATEGORY`='WAREHOUSE' OR `CATEGORY`='OFFICE'  ");
        ResultSet rs = ps.executeQuery();
        office_warehouse_Table.setModel(DbUtils.resultSetToTableModel(rs));
        office_warehouse_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean Sales_Office(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `DATE RECEIVED`, `CATEGORY`, `BRAND`,`TYPE`, `SELLER PRICE`, `QUANTITY`, `PERSON IN CHARGE`, `REMARKS` FROM `summary_stock` WHERE `CATEGORY` = 'OFFICE'");
        ResultSet rs = ps.executeQuery();
        office_warehouse_Table.setModel(DbUtils.resultSetToTableModel(rs));
        office_warehouse_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean Sales_WareHouse(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `DATE RECEIVED`, `CATEGORY`, `BRAND`,`TYPE`, `SELLER PRICE`, `QUANTITY`, `PERSON IN CHARGE`, `REMARKS` FROM `summary_stock` WHERE `CATEGORY` = 'WAREHOUSE'");
        ResultSet rs = ps.executeQuery();
        office_warehouse_Table.setModel(DbUtils.resultSetToTableModel(rs));
        office_warehouse_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }  
    
    // ADD CART OW  -----------------------------------------------------------------------------------------------------------------
    
    
    
    public boolean addcartOW(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`,`CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`,(`SELLER PRICE`) AS  PRICE, `ENGINE S N`, `ALTERNATOR S N`, `QUANTITY`, `SUPPLIER` FROM `summary_stock` WHERE `CATEGORY`='WAREHOUSE' OR `CATEGORY`='OFFICE'  ");
        ResultSet rs = ps.executeQuery();
        office_warehouse_Table.setModel(DbUtils.resultSetToTableModel(rs));
        office_warehouse_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean addcartOffice(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `DATE RECEIVED`, `CATEGORY`, `BRAND`,`TYPE`, `SELLER PRICE`, `QUANTITY`, `PERSON IN CHARGE`, `REMARKS` FROM `summary_stock` WHERE `CATEGORY` = 'OFFICE'");
        ResultSet rs = ps.executeQuery();
        office_warehouse_Table.setModel(DbUtils.resultSetToTableModel(rs));
        office_warehouse_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean addcartWareHouse(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `DATE RECEIVED`, `CATEGORY`, `BRAND`,`TYPE`, `SELLER PRICE`, `QUANTITY`, `PERSON IN CHARGE`, `REMARKS` FROM `summary_stock` WHERE `CATEGORY` = 'WAREHOUSE'");
        ResultSet rs = ps.executeQuery();
        office_warehouse_Table.setModel(DbUtils.resultSetToTableModel(rs));
        office_warehouse_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }  
    
    
    
    // SUPPLIER AND CUSTOMER  -----------------------------------------------------------------------------------------------------------------
    
     
    
    public boolean Supplier(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `NAME`, `ADDRESS`, `EMAIL`, `CONTACT` FROM `supplier_table` ORDER BY `ID` DESC");
        ResultSet rs = ps.executeQuery();
        Supplier_table.setModel(DbUtils.resultSetToTableModel(rs));
        Supplier_table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
       public boolean Customer(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `NAME`, `ADDRESS`, `EMAIL`, `CONTACT` FROM `customer_table` ORDER BY `ID` DESC");
        ResultSet rs = ps.executeQuery();
        Customer_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Customer_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
             // System.out.println(e);
            }
        return false;
    }
//    
//        public boolean ShopGenset(){
//        try{
//        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `BRAND`, `MODEL`, `KVA`, `PHASING` FROM `genset_table` ORDER BY `ID` DESC");
//        ResultSet rs = ps.executeQuery();
//        Shop_Genset_Table.setModel(DbUtils.resultSetToTableModel(rs));
//        Shop_Genset_Table.getColumnModel().getColumn(0).setMaxWidth(100);
//        }catch(Exception e){
//             // System.out.println(e);
//            }
//        return false;
//    }
//
//        public boolean ShopFilter(){
//        try{
//        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `BRAND`, `DESCRIPTION`, `TYPE`, FORMAT(`SELLER PRICE`, '#,##0.00') AS `PRICE`, `QUANTITY` FROM `filter_table` ORDER BY `ID` DESC ");
//        ResultSet rs = ps.executeQuery();
//        Shop_Filter_Table.setModel(DbUtils.resultSetToTableModel(rs));
//        Shop_Filter_Table.getColumnModel().getColumn(0).setMaxWidth(100);
//        }catch(Exception e){
//              System.out.println(e);
//            }
//        return false;
//    }
//        
//        
//    public boolean ShowCart(){
//        try{
//        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `BRAND`, `DESCRIPTION`, `PRICE`, `QUANTITY`,  `TOTAL PRICE` FROM `add_cart`");
//        ResultSet rs = ps.executeQuery();
//        Cart_table.setModel(DbUtils.resultSetToTableModel(rs));
//        Cart_table.getColumnModel().getColumn(0).setMaxWidth(100);
//        }catch(Exception e){
//              System.out.println(e);
//            }
//        return false;
//    }
//        
//         public boolean ShowOrder(){
//        try{
//        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`,  `DESCRIPTION`, `PRICE`, `QUANTITY`,  `TOTAL PRICE` FROM `add_cart`");
//        ResultSet rs = ps.executeQuery();
//        Order_Table.setModel(DbUtils.resultSetToTableModel(rs));
//        Order_Table.getColumnModel().getColumn(0).setMaxWidth(100);
//        }catch(Exception e){
//              System.out.println(e);
//        }
//        return false;
//    }
//         
//          public boolean History_Genset(){
//        try{
//        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `UNIT_TYPE`, FORMAT(`SELLER PRICE`, '#,##0.00') AS `PRICE`, `ENGINE_SERIAL_NO`, `ALTERNATOR_SERIAL_NO`, `QUOTATION` FROM `history_genset_table`");
//        ResultSet rs = ps.executeQuery();
//        history_genset_table.setModel(DbUtils.resultSetToTableModel(rs));
//        history_genset_table.getColumnModel().getColumn(0).setMaxWidth(100);
//        }catch(Exception e){
//              System.out.println(e);
//        }
//        return false;
//    }
//                  
//    public boolean History_Fitler(){
//        try{
//        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `DATE`, `BRAND`, `DESCRIPTION`, `TYPE`, FORMAT(`PRICE`, '#,##0.00') AS `PRICE`, `QUANTITY`, `TOTAL PRICE`, `QUOTATION` FROM `history_filter`");
//        ResultSet rs = ps.executeQuery();
//        history_filter_table.setModel(DbUtils.resultSetToTableModel(rs));
//        history_filter_table.getColumnModel().getColumn(0).setMaxWidth(100);
//        }catch(Exception e){
//              System.out.println(e);
//        }
//        return false;
//    }
//           
//    public boolean Bin_Genset(){
//        try{
//        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`,`BRAND`, `MODEL`, `KVA`, `PHASING`, `UNIT_TYPE`, FORMAT(`SELLER PRICE`, '#,##0.00') AS `PRICE` FROM `history_genset_table`");
//        ResultSet rs = ps.executeQuery();
//        Bin_Genset_Table.setModel(DbUtils.resultSetToTableModel(rs));
//        Bin_Genset_Table.getColumnModel().getColumn(0).setMaxWidth(100);
//        }catch(Exception e){
//              System.out.println(e);
//        }
//        return false;
//    }
//                 
//                 
//          public boolean Bin_Filter(){
//        try{
//        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`,`BRAND`, `DESCRIPTION`, `TYPE`, `PRICE`, `QUANTITY`, `TOTAL PRICE` FROM `history_filter`");
//        ResultSet rs = ps.executeQuery();
//        Bin_Filter_Table.setModel(DbUtils.resultSetToTableModel(rs));
//        Bin_Filter_Table.getColumnModel().getColumn(0).setMaxWidth(100);
//        }catch(Exception e){
//              System.out.println(e);
//        }
//        return false;
//    }
  }