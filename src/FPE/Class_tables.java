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
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `BRAND`, `DESCRIPTION`, `TYPE`, `SELLER PRICE`, `QUANTITY` FROM `filter_table` ORDER BY `ID` DESC");
        ResultSet rs = ps.executeQuery();
        Shop_Filter_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Shop_Filter_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              System.out.println(e);
            }
        return false;
    }
}