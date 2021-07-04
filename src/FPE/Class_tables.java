package FPE;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

import static FPE.Table_Supplier.Supplier_table;
import static FPE.Table_Customer.Customer_Table;

import static FPE.Webpage.All_Stock_Table;

import static FPE.Webpage.Cart_Table;
import static FPE.Webpage.Sales_Table_Generator;

import static FPE.Webpage.History_Table;

import static FPE.Webpage.Request_Stock_Table;
import static FPE.Webpage.Req_Cart_Table;

public class Class_tables {
  
    public boolean Stocks(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `DATE RECEIVED`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, FORMAT(`SUPPLIER PRICE`, '#,##0.00') AS `SUPPLIER PRICE`, FORMAT(`SELLER PRICE`, '#,##0.00') AS `SELLER PRICE`, `ENGINE S N`, `ALTERNATOR S N`, `QUANTITY`, `REMARKS`, `SUPPLIER` FROM `summary_stock`");
        ResultSet rs = ps.executeQuery();
        All_Stock_Table.setModel(DbUtils.resultSetToTableModel(rs));
        All_Stock_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean StockedGenerator(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`,`DATE RECEIVED`,`CATEGORY`,`BRAND`,`MODEL`,`KVA`,`PHASING`,`TYPE`,FORMAT(`SUPPLIER PRICE`, '#,##0.00') AS `SUPPLIER PRICE`,`ENGINE S N`,`ALTERNATOR S N`, `QUANTITY`,`SUPPLIER` FROM `summary_stock` WHERE `CATEGORY`='GENERATOR'");
        ResultSet rs = ps.executeQuery();
        All_Stock_Table.setModel(DbUtils.resultSetToTableModel(rs));
        All_Stock_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }

    public boolean StockedParts(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`,`DATE RECEIVED`,`CATEGORY`,`BRAND`,`MODEL`,`KVA`,`PHASING`,`TYPE`,FORMAT(`SUPPLIER PRICE`, '#,##0.00') AS `SUPPLIER PRICE`,`ENGINE S N`,`ALTERNATOR S N`, `QUANTITY`,`SUPPLIER` FROM `summary_stock` WHERE `CATEGORY` = 'PARTS'");
        ResultSet rs = ps.executeQuery();
        All_Stock_Table.setModel(DbUtils.resultSetToTableModel(rs));
        All_Stock_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    public boolean StockedOffice(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `DATE RECEIVED`, `CATEGORY`, `BRAND`,`TYPE`, `SELLER PRICE`, `QUANTITY`, `REMARKS` FROM `summary_stock` WHERE `CATEGORY` = 'OFFICE'");
        ResultSet rs = ps.executeQuery();
        All_Stock_Table.setModel(DbUtils.resultSetToTableModel(rs));
        All_Stock_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }

    public boolean StockedWareHouse(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `DATE RECEIVED`, `CATEGORY`, `BRAND`,`TYPE`, `SELLER PRICE`, `QUANTITY`, `REMARKS` FROM `summary_stock` WHERE `CATEGORY` = 'WAREHOUSE'");
        ResultSet rs = ps.executeQuery();
        All_Stock_Table.setModel(DbUtils.resultSetToTableModel(rs));
        All_Stock_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean SalesStock(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `DATE RECEIVED`, `CATEGORY`, CONCAT(`BRAND`,' ',`MODEL`, ' ',`KVA`,' ' ,`PHASING`) AS `DESCRIPTION`, `TYPE` `SELLER PRICE`, `ENGINE S N`, `ALTERNATOR S N`, `QUANTITY` FROM `summary_stock` WHERE `CATEGORY`='GENERATOR' OR `CATEGORY`='PARTS'");
        ResultSet rs = ps.executeQuery();
        Sales_Table_Generator.setModel(DbUtils.resultSetToTableModel(rs));
        Sales_Table_Generator.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
        }        
        return false;
    }
    //================
    
    public boolean Generator(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`,`DATE RECEIVED`,`CATEGORY`,`BRAND`,`MODEL`,`KVA`,`PHASING`,`TYPE`,FORMAT(`SUPPLIER PRICE`, '#,##0.00') AS `SUPPLIER PRICE`,`ENGINE S N`,`ALTERNATOR S N`, `QUANTITY`,`SUPPLIER` FROM `summary_stock` WHERE `CATEGORY`='GENERATOR'");
        ResultSet rs = ps.executeQuery();
        Sales_Table_Generator.setModel(DbUtils.resultSetToTableModel(rs));
        Sales_Table_Generator.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean Parts(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`,`DATE RECEIVED`,`CATEGORY`,`BRAND`,`MODEL`,`KVA`,`PHASING`,`TYPE`,FORMAT(`SUPPLIER PRICE`, '#,##0.00') AS `SUPPLIER PRICE`,`ENGINE S N`,`ALTERNATOR S N`, `QUANTITY`,`SUPPLIER` FROM `summary_stock` WHERE `CATEGORY` = 'PARTS'");
        ResultSet rs = ps.executeQuery();
        Sales_Table_Generator.setModel(DbUtils.resultSetToTableModel(rs));
        Sales_Table_Generator.getColumnModel().getColumn(0).setMaxWidth(100);
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
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`,`DATE RECEIVED`,`CATEGORY`,`BRAND`,`MODEL`,`KVA`,`PHASING`,`TYPE`,FORMAT(`SELLER PRICE`, '#,##0.00') AS `SELLER PRICE`,`ENGINE S N`,`ALTERNATOR S N`,`SUPPLIER` FROM `summary_stock`");
        ResultSet rs = ps.executeQuery();
        Sales_Table_Generator.setModel(DbUtils.resultSetToTableModel(rs));
        Sales_Table_Generator.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
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
    
   
    
    // WAREHOPUSE AMD STOCK  -----------------------------------------------------------------------------------------------------------------
    
    
    
    public boolean Sales_OW(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `DATE RECEIVED`, `CATEGORY`, CONCAT(`BRAND`,' ',`MODEL`, ' ' ,`KVA`,' ' ,`PHASING`) AS `DESCRIPTION`, `TYPE`, `QUANTITY`, `REMARKS`, `SUPPLIER` FROM `summary_stock` WHERE `CATEGORY`='WAREHOUSE' OR `CATEGORY`='OFFICE' OR `CATEGORY`='PARTS'  ");
        ResultSet rs = ps.executeQuery();
        Request_Stock_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Request_Stock_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    
    public boolean Sales_PW(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `DATE RECEIVED`, `CATEGORY`, CONCAT(`BRAND`,' ',`MODEL`, ' ' ,`KVA`,' ' ,`PHASING`) AS `DESCRIPTION`, `TYPE`, `QUANTITY`, `REMARKS`, `SUPPLIER` FROM `summary_stock` WHERE `CATEGORY`='PARTS'  ");
        ResultSet rs = ps.executeQuery();
        Request_Stock_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Request_Stock_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean Sales_Office(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `DATE RECEIVED`, `CATEGORY`, CONCAT(`BRAND`,' ',`MODEL`, ' ' ,`KVA`,' ' ,`PHASING`) AS `DESCRIPTION`, `TYPE`, `QUANTITY`, `REMARKS`, `SUPPLIER` FROM `summary_stock` WHERE `CATEGORY` = 'OFFICE'");
        ResultSet rs = ps.executeQuery();
        Request_Stock_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Request_Stock_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean Sales_WareHouse(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `DATE RECEIVED`, `CATEGORY`, CONCAT(`BRAND`,' ',`MODEL`, ' ' ,`KVA`,' ' ,`PHASING`) AS `DESCRIPTION`, `TYPE`, `QUANTITY`, `REMARKS`, `SUPPLIER` FROM `summary_stock` WHERE `CATEGORY` = 'WAREHOUSE'");
        ResultSet rs = ps.executeQuery();
        Request_Stock_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Request_Stock_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }  
    
//   --- REQUEST SELECTION ---------------------------------------------------------------------------------------------------------------------------------
     
    public boolean Request_Cart(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT (`STOCK ID`) AS`ID`, `CATEGORY`, CONCAT(`BRAND`,' ',`MODEL`, ' ' ,`KVA`,' ' ,`PHASING`) AS `DESCRIPTION`, `TYPE`, `QUANTITY` FROM `request_cart` WHERE `CATEGORY`='WAREHOUSE' OR `CATEGORY`='OFFICE' OR `CATEGORY`='PARTS'  ");
        ResultSet rs = ps.executeQuery();
        Req_Cart_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Req_Cart_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    
    public boolean Request_Cart_Parts(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `DATE RECEIVED`, `CATEGORY`, CONCAT(`BRAND`,' ',`MODEL`, ' ' ,`KVA`,' ' ,`PHASING`) AS `DESCRIPTION`, `TYPE`, `QUANTITY`, `REMARKS`, `SUPPLIER` FROM `summary_stock` WHERE `CATEGORY`='PARTS'  ");
        ResultSet rs = ps.executeQuery();
        Req_Cart_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Req_Cart_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean Request_Cart_Office(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `DATE RECEIVED`, `CATEGORY`, CONCAT(`BRAND`,' ',`MODEL`, ' ' ,`KVA`,' ' ,`PHASING`) AS `DESCRIPTION`, `TYPE`, `QUANTITY`, `REMARKS`, `SUPPLIER` FROM `summary_stock` WHERE `CATEGORY` = 'OFFICE'");
        ResultSet rs = ps.executeQuery();
        Req_Cart_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Req_Cart_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean Request_Cart_WareHouse(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `DATE RECEIVED`, `CATEGORY`, CONCAT(`BRAND`,' ',`MODEL`, ' ' ,`KVA`,' ' ,`PHASING`) AS `DESCRIPTION`, `TYPE`, `QUANTITY`, `REMARKS`, `SUPPLIER` FROM `summary_stock` WHERE `CATEGORY` = 'WAREHOUSE'");
        ResultSet rs = ps.executeQuery();
        Req_Cart_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Req_Cart_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }  
    
    
    
    
    
    
   // CART  -----------------------------------------------------------------------------------------------------------------
    
    
       public boolean Cart(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT (`STOCK ID`) AS `ID`,`CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, `SELLER PRICE`, `ENGINE S N`, `ALTERNATOR S N`,`QUANTITY` FROM `add_cart`");
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
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT (`STOCK ID`) AS `ID`,`CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, `SELLER PRICE`, `ENGINE S N`, `ALTERNATOR S N` FROM `add_cart` WHERE `CATEGORY`= 'GENERATOR'");
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
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT (`STOCK ID`) AS `ID`,`CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, `SELLER PRICE`, `ENGINE S N`, `ALTERNATOR S N` FROM `add_cart` WHERE `CATEGORY`= 'PARTS'");
        ResultSet rs = ps.executeQuery();
        Cart_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Cart_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    

    
//  ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
   
    
    public boolean request(){
         try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `DATE RECEIVED`, `CATEGORY`, CONCAT(`BRAND`,' ',`MODEL`, ' ' ,`KVA`,' ' ,`PHASING`) AS `DESCRIPTION`, `TYPE`, `QUANTITY`, `PERSON IN CHARGE`, `REMARKS`, `SUPPLIER` FROM `summary_stock` WHERE `CATEGORY`='PARTS' OR `CATEGORY`='OFFICE' OR `CATEGORY`='WAREHOUSE'");
        ResultSet rs = ps.executeQuery();
        Request_Stock_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Request_Stock_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
        } 
        return false;
    }
    
    
    
  
    
     

       
           
    public boolean History(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `DATE RELEASE`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, `SELLER PRICE`, `ENGINE S N`, `ALTERNATOR S N`, `QUANTITY`, `TOTAL PRICE`, `PERSON IN CHARGE`, `QUOTATION`, `OR NO` FROM `sale_summary_stock`");
        ResultSet rs = ps.executeQuery();
        History_Table.setModel(DbUtils.resultSetToTableModel(rs));
        History_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              System.out.println(e);
            }
        return false;
    }
       
       
    
//   ------- SUPPLIER  /  COSTOMER  /  STAFF  -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- 
        
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
  }