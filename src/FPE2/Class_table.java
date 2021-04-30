/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE2;

import static FPE2.Mainpage.Stock_Genset_Table;
import static FPE2.Mainpage.Stock_Filter_Table;
import static FPE2.Mainpage.Shop_Genset_Table;
import static FPE2.Mainpage.Shop_Filter_Table;
import static FPE2.Table_Customer.Customer_table;
import static FPE2.Table_Supplier.Supplier_table;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;


/**
 * 
 * @author Javinez
 */
public class Class_table {
    public boolean Show_Stock_Genset_Table(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `BRAND`, `MODEL`, `KVA`, `PHASING`,`BODY TYPE` FROM `genset_table`");
        ResultSet rs = ps.executeQuery();
        Stock_Genset_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Stock_Genset_Table.getColumnModel().getColumn(0).setMaxWidth(100);
      

                }catch(Exception e){
              System.out.println(e);
            }
        return false;
    }
    
    public boolean Show_Stock_Filter_Table(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `BRAND`, `NAME`, `DESCRIPTION`, `PRICE` FROM `filter_table`");
        ResultSet rs = ps.executeQuery();
        Stock_Filter_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Stock_Filter_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              System.out.println(e);
            }
        return false;
    }
    
    public boolean shopGenset(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `UNIT_TYPE`, `ENGINE_SERIAL_NO`, `ALTERNATOR_SERIAL_NO`, `DATE` FROM `genset_table`");
        ResultSet rs = ps.executeQuery();
        Shop_Genset_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Shop_Genset_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              System.out.println(e);
            }
        return false;
    }
    
    public boolean shopFilter(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `BRAND`, `NAME`, `QUANTITY`, `PRICE`,(`QUANTITY`*`PRICE`) AS `TOTAL PRICE`, `TYPE` FROM `filter_table` ORDER BY `ID` DESC");
        ResultSet rs = ps.executeQuery();
        Shop_Filter_Table.setModel(DbUtils.resultSetToTableModel(rs));
        Shop_Filter_Table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              System.out.println(e);
            }
        return false;
    }    
    
    public boolean Supplier(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT * FROM `supplier_table`");
        ResultSet rs = ps.executeQuery();
        Supplier_table.setModel(DbUtils.resultSetToTableModel(rs));
        Supplier_table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              System.out.println(e);
            }
        return false;
    }
        public boolean Customer(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT * FROM `customer_table`");
        ResultSet rs = ps.executeQuery();
        Customer_table.setModel(DbUtils.resultSetToTableModel(rs));
        Customer_table.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              System.out.println(e);
            }
        return false;
    }
}


