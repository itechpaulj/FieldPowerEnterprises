package FPE;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

import static FPE.Table_Supplier.Supplier_table;
import static FPE.Table_Customer.Customer_Table;

import static FPE.Mainpage.Stock_Genset_Table;
import static FPE.Mainpage.Stock_Filter_Table;

import static FPE.Mainpage.Shop_Genset_Table;
import static FPE.Mainpage.Shop_Filter_Table;

import static FPE.Mainpage.Bin_Genset_Table;
import static FPE.Mainpage.Bin_Filter_Table;

import static FPE.Mainpage.history_genset_table;
import static FPE.Mainpage.history_filter_table;

import static FPE.AddCart.Cart_table;
import static FPE.Process_Filter.Order_Table;

public class Class_tables {
  
    public boolean Genset(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `BRAND`, `MODEL`, `KVA`, `PHASING` FROM `genset_table` ORDER BY `ID` DESC");
        ResultSet rs = ps.executeQuery();
        Stock_Genset_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Stock_Genset_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
    
    public boolean Filter(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `BRAND`, `DESCRIPTION`, `TYPE`, `SELLER PRICE`, `QUANTITY` FROM `filter_table` ORDER BY `ID` DESC");
        ResultSet rs = ps.executeQuery();
        Stock_Filter_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Stock_Filter_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
             // System.out.println(e);
            }
        return false;
    }
    
    
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
    
        public boolean ShopGenset(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `BRAND`, `MODEL`, `KVA`, `PHASING` FROM `genset_table` ORDER BY `ID` DESC");
        ResultSet rs = ps.executeQuery();
        Shop_Genset_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Shop_Genset_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
             // System.out.println(e);
            }
        return false;
    }

        public boolean ShopFilter(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `BRAND`, `DESCRIPTION`, `TYPE`, `SELLER PRICE`, `QUANTITY` FROM `filter_table` ORDER BY `ID` DESC ");
        ResultSet rs = ps.executeQuery();
        Shop_Filter_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Shop_Filter_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              System.out.println(e);
            }
        return false;
    }
        
        
        public boolean ShowCart(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`,  `DESCRIPTION`, `PRICE`, `QUANTITY`,  `TOTAL PRICE` FROM `add_cart`");
        ResultSet rs = ps.executeQuery();
        Cart_table.setModel(DbUtils.resultSetToTableModel(rs));
        Cart_table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              System.out.println(e);
            }
        return false;
    }
        
         public boolean ShowOrder(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`,  `DESCRIPTION`, `PRICE`, `QUANTITY`,  `TOTAL PRICE` FROM `add_cart`");
        ResultSet rs = ps.executeQuery();
        Order_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Order_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              System.out.println(e);
        }
        return false;
    }
         
          public boolean History_Genset(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `UNIT_TYPE`, FORMAT(`SELLER PRICE`, '#,##0.00') AS `PRICE`, `ENGINE_SERIAL_NO`, `ALTERNATOR_SERIAL_NO`, `QUOTATION` FROM `history_genset_table`");
        ResultSet rs = ps.executeQuery();
        history_genset_table.setModel(DbUtils.resultSetToTableModel(rs));
        history_genset_table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              System.out.println(e);
        }
        return false;
    }
                  
    public boolean History_Fitler(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `DATE`, `BRAND`, `DESCRIPTION`, `TYPE`, `PRICE`, `QUANTITY`, `TOTAL PRICE`, `QUOTATION` FROM `history_filter`");
        ResultSet rs = ps.executeQuery();
        history_filter_table.setModel(DbUtils.resultSetToTableModel(rs));
        history_filter_table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              System.out.println(e);
        }
        return false;
    }
           
          public boolean Bin_Genset(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `BRAND`, `MODEL`, `KVA`, `PHASING`, `UNIT_TYPE`, `SELLER PRICE`FROM `bin_genset`");
        ResultSet rs = ps.executeQuery();
        Bin_Genset_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Bin_Genset_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              System.out.println(e);
        }
        return false;
    }
                 
                 
          public boolean Bin_Filter(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `BRAND`, `DESCRIPTION`, `TYPE`, `PRICE`, `QUANTITY`, `TOTAL PRICE` FROM `bin_filter`");
        ResultSet rs = ps.executeQuery();
        Bin_Filter_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Bin_Filter_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              System.out.println(e);
        }
        return false;
    }
  }