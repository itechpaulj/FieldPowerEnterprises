
package FPE;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;


import static FPE.Webpage.Stock_Table;
import static FPE.Webpage.Sales_Table;
import static FPE.Webpage.Cart_Table;
import static FPE.Webpage.FullOut_Table;
import static FPE.Webpage.project_table;
import static FPE.Webpage.History_Table; 

import static FPE.Setting.admin_table;
        
import static FPE.Table_Supplier.Supplier_table;
import static FPE.Table_Customer.Customer_Table;
import static FPE.Table_Agent.Agent_table;

import static FPE.Table_Balance.Balance_Table;

public class Class_tables {

//--------------------------------------------------------- FOR STOCK TABLE ONLY -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- 
    
    public boolean Stock(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, FORMAT(`SELLER PRICE`, '#,##0.00') AS `SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`, `ENGINE S.N`, `ALTERNATOR S.N` ,(SELECT `NAME` FROM `supplier_table` WHERE `stock_table`.`SUPPLIER ID`= `supplier_table`.`ID`) AS `SUPPLIER`,`DATE INBOUND`, `REMARKS` FROM `stock_table` ");
        ResultSet rs = ps.executeQuery();
        Stock_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Stock_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean Stock_Generator(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`,`SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`,(SELECT `NAME` FROM `supplier_table` WHERE `ID`= `SUPPLIER ID`) AS `SUPPLIER`,`REMARKS` FROM `stock_table` WHERE `CATEGORY` = 'GENERATOR'  ");
        ResultSet rs = ps.executeQuery();
        Stock_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Stock_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean Stock_Parts(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`,`SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`,(SELECT `NAME` FROM `supplier_table` WHERE `ID`= `SUPPLIER ID`) AS `SUPPLIER`,`REMARKS` FROM `stock_table` WHERE `CATEGORY` = 'PARTS' ");
        ResultSet rs = ps.executeQuery();
        Stock_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Stock_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean Stock_Office(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`,`SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`,(SELECT `NAME` FROM `supplier_table` WHERE `ID`= `SUPPLIER ID`) AS `SUPPLIER`,`REMARKS` FROM `stock_table` WHERE `CATEGORY` = 'OFFICE' ");
        ResultSet rs = ps.executeQuery();
        Stock_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Stock_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean Stock_Warehouse(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`,`SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`,(SELECT `NAME` FROM `supplier_table` WHERE `ID`= `SUPPLIER ID`) AS `SUPPLIER`,`REMARKS` FROM `stock_table` WHERE `CATEGORY` = 'WAREHOUSE' ");
        ResultSet rs = ps.executeQuery();
        Stock_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Stock_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
//--------------------------------------------------------- FOR SALES TABLE ONLY -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- 

    public boolean Sale(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`,`SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`,(SELECT `NAME` FROM `supplier_table` WHERE `ID`= `SUPPLIER ID`) AS `SUPPLIER`,`REMARKS` FROM `stock_table` WHERE `CATEGORY`='GENERATOR' OR `CATEGORY`='PARTS' OR `CATEGORY`='OFFICE'");   
        ResultSet rs = ps.executeQuery();
        Sales_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Sales_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
 
    public boolean Sale_Generator(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`,`SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`,(SELECT `NAME` FROM `supplier_table` WHERE `ID`= `SUPPLIER ID`) AS `SUPPLIER`,`REMARKS` FROM `stock_table` WHERE `CATEGORY`='GENERATOR' ");   
        ResultSet rs = ps.executeQuery();
        Sales_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Sales_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean Sale_Parts(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`,`SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`,(SELECT `NAME` FROM `supplier_table` WHERE `ID`= `SUPPLIER ID`) AS `SUPPLIER`,`REMARKS` FROM `stock_table` WHERE `CATEGORY`='PARTS' ");   
        ResultSet rs = ps.executeQuery();
        Sales_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Sales_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean Sale_Office(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`,`SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`,(SELECT `NAME` FROM `supplier_table` WHERE `ID`= `SUPPLIER ID`) AS `SUPPLIER`,`REMARKS` FROM `stock_table` WHERE`CATEGORY`='OFFICE'");   
        ResultSet rs = ps.executeQuery();
        Sales_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Sales_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    
    
//--------------------------------------------------------- FOR CART TABLE ONLY --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------  
    
    public boolean Cart(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`,`SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`,(SELECT `NAME` FROM `supplier_table` WHERE `ID`= `SUPPLIER ID`) AS `SUPPLIER`,`REMARKS` FROM `cart_table` WHERE `CATEGORY` = 'GENERATOR' or `CATEGORY` = 'PARTS' or `CATEGORY` = 'OFFICE'");
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
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`,`SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`,(SELECT `NAME` FROM `supplier_table` WHERE `ID`= `SUPPLIER ID`) AS `SUPPLIER`,`REMARKS` FROM `cart_table` WHERE `CATEGORY` = 'GENERATOR'");
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
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`,`SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`,(SELECT `NAME` FROM `supplier_table` WHERE `ID`= `SUPPLIER ID`) AS `SUPPLIER`,`REMARKS` FROM `cart_table` WHERE `CATEGORY` = 'PARTS' ");
        ResultSet rs = ps.executeQuery();
        Cart_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Cart_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean Cart_Office(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`,`SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`,(SELECT `NAME` FROM `supplier_table` WHERE `ID`= `SUPPLIER ID`) AS `SUPPLIER`,`REMARKS` FROM `cart_table` WHERE `CATEGORY` = 'OFFICE'");
        ResultSet rs = ps.executeQuery();
        Cart_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Cart_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    
//--------------------------------------------------------- FOR FULLOUT TABLE ONLY -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- 

        public boolean Fullout(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`, `CATEGORY`, `BRAND`,`TYPE`,`SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`, `SUPPLIER ID`, `DATE INBOUND`, `REMARKS` FROM `fullout`");
        ResultSet rs = ps.executeQuery();
        FullOut_Table.setModel(DbUtils.resultSetToTableModel(rs));
        FullOut_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
        
        public boolean Fullout_Parts(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`, `CATEGORY`, `BRAND`,`TYPE`,`SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`, `SUPPLIER ID`, `DATE INBOUND`, `REMARKS` FROM `fullout` WHERE `STOCK ID`= 'PARTS' ");
        ResultSet rs = ps.executeQuery();
        FullOut_Table.setModel(DbUtils.resultSetToTableModel(rs));
        FullOut_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
        
        public boolean Fullout_Office(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`, `CATEGORY`, `BRAND`,`TYPE`,`SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`, `SUPPLIER ID`, `DATE INBOUND`, `REMARKS` FROM `fullout`WHERE `STOCK ID`= 'OFFICE'");
        ResultSet rs = ps.executeQuery();
        FullOut_Table.setModel(DbUtils.resultSetToTableModel(rs));
        FullOut_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
        
        public boolean FulloutWarehouse(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`, `CATEGORY`, `BRAND`,`TYPE`,`SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`, `SUPPLIER ID`, `DATE INBOUND`, `REMARKS` FROM `fullout`WHERE `STOCK ID`= 'WAREHOUSE'");
        ResultSet rs = ps.executeQuery();
        FullOut_Table.setModel(DbUtils.resultSetToTableModel(rs));
        FullOut_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    
    
//--------------------------------------------------------- FOR HISTORY TABLE ONLY -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- 
    
    public boolean History(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`,`SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`,(SELECT `NAME` FROM `supplier_table` WHERE `ID`= `SUPPLIER ID`) AS `SUPPLIER`,`REMARKS` FROM `history_table` ");
        ResultSet rs = ps.executeQuery();
        History_Table.setModel(DbUtils.resultSetToTableModel(rs));
        History_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean History_Generator(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`,`SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`,(SELECT `NAME` FROM `supplier_table` WHERE `ID`= `SUPPLIER ID`) AS `SUPPLIER`,`REMARKS` FROM `history_table` WHERE `CATEGORY`='GENERATOR' ");
        ResultSet rs = ps.executeQuery();
        History_Table.setModel(DbUtils.resultSetToTableModel(rs));
        History_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean History_Parts(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`,`SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`,(SELECT `NAME` FROM `supplier_table` WHERE `ID`= `SUPPLIER ID`) AS `SUPPLIER`,`REMARKS` FROM `history_table` WHERE `CATEGORY`='PARTS' ");
        ResultSet rs = ps.executeQuery();
        History_Table.setModel(DbUtils.resultSetToTableModel(rs));
        History_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean History_Office(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`,`SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`,(SELECT `NAME` FROM `supplier_table` WHERE `ID`= `SUPPLIER ID`) AS `SUPPLIER`,`REMARKS` FROM `history_table` WHERE `CATEGORY`='OFFICE' ");
        ResultSet rs = ps.executeQuery();
        History_Table.setModel(DbUtils.resultSetToTableModel(rs));
        History_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean History_Warehouse(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `STOCK ID`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`,`SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`,(SELECT `NAME` FROM `supplier_table` WHERE `ID`= `SUPPLIER ID`) AS `SUPPLIER`,`REMARKS` FROM `history_table` WHERE `CATEGORY`='WAREHOUSE' ");
        ResultSet rs = ps.executeQuery();
        History_Table.setModel(DbUtils.resultSetToTableModel(rs));
        History_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    

//--------------------------------------------------------- FOR PROJECT TABLE ONLY -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- 
    


    public boolean project(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT  `PROJECT NO`,(SELECT `NAME` FROM `customer_table` WHERE `customer_table`.`ID`= `payment_menthod`.`CUSTOMER ID`) AS `CUSTOMER`,(SELECT `ADDRESS` FROM `customer_table` WHERE `customer_table`.`ID`=`payment_menthod`.`CUSTOMER ID`) AS `ADDRESS`,`CUSTOMER P O NO` AS `P.O NO`, `P O DATE` AS `P.O DATE`, `QUOTATION NO` AS `QOUT. NO`,`QUOTATION DATE` AS `QOUT. DATE`,`TOTAL AMOUNT`, `BALANCE`,`STATUS` FROM `payment_menthod` GROUP BY `PROJECT NO`");
        ResultSet rs = ps.executeQuery();
        project_table.setModel(DbUtils.resultSetToTableModel(rs));
        //project_table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    
//--------------------------------------------------------- FOR PROJECT TABLE ONLY -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- 
    


    public boolean Balance(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT  `PROJECT NO`,(SELECT `NAME` FROM `customer_table` WHERE `customer_table`.`ID`= `payment_menthod`.`CUSTOMER ID`) AS `CUSTOMER NAME`,(SELECT `ADDRESS` FROM `customer_table` WHERE `customer_table`.`ID`=`payment_menthod`.`CUSTOMER ID`) AS `ADDRESS`,`CUSTOMER P O NO`, `P O DATE`, `QUOTATION NO`, `QUOTATION DATE`,`TOTAL AMOUNT`,`DOWNPAYMENT AMOUNT`, `BALANCE`, `BALANCE REMARKS`, `STATUS` FROM `payment_menthod` WHERE `PROCESS` = `"+Webpage.project_no+"` ORDER BY `P O DATE` DESC");
        ResultSet rs = ps.executeQuery();
        Balance_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Balance_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
//       
//    
////   ------- SUPPLIER  /  COSTOMER  /  STAFF  -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- 
//        
    public boolean Supplier(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `NAME`, `ADDRESS`,`CONTACT` FROM `supplier_table` ORDER BY `ID` DESC");
        ResultSet rs = ps.executeQuery();
        Supplier_table.setModel(DbUtils.resultSetToTableModel(rs));
        Supplier_table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean Agent(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `NAME`, `ADDRESS`,`CONTACT` FROM `agent_table` ORDER BY `ID` DESC");
        ResultSet rs = ps.executeQuery();
        Agent_table.setModel(DbUtils.resultSetToTableModel(rs));
        Agent_table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    
       public boolean Customer(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `NAME`, `ADDRESS`,`CONTACT` FROM `customer_table` ORDER BY `ID` DESC");
        ResultSet rs = ps.executeQuery();
        Customer_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Customer_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
             // System.out.println(e);
            }
        return false;
    }
       public boolean Admin(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `NAME`, `USER LEVEL`, `USERNAME`, `PASSWORD`FROM `login` ORDER BY `ID` DESC ");
        ResultSet rs = ps.executeQuery();
        admin_table.setModel(DbUtils.resultSetToTableModel(rs));
        admin_table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
             // System.out.println(e);
            }
        return false;
       }
  }