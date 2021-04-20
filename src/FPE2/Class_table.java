/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE2;

import static FPE2.Mainpage.ViewGenset_Table;
import static FPE2.Mainpage.ViewFitler_table;
import static FPE2.Mainpage.Shop_genset_table;
import static FPE2.Mainpage.Shop_filter_table;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Javinez
 */
public class Class_table {
    public boolean showGenset(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `BRAND`, `MODEL`, `KVA`, `PHASING`,`BODY TYPE` FROM `genset_table`");
        ResultSet rs = ps.executeQuery();
        ViewGenset_Table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
              System.out.println(e);
            }
        return false;
    }
    
    public boolean showFilter(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `BRAND`, `NAME`, `DESCRIPTION`, `PRICE` FROM `filter_table`");
        ResultSet rs = ps.executeQuery();
        ViewFitler_table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
              System.out.println(e);
            }
        return false;
    }
    
    public boolean shopGenset(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `UNIT_TYPE`, `ENGINE_SERIAL_NO`, `ALTERNATOR_SERIAL_NO`, `DATE` FROM `genset_table`");
        ResultSet rs = ps.executeQuery();
        Shop_genset_table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
              System.out.println(e);
            }
        return false;
    }
    
        public boolean shopFilter(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`, `BRAND`, `NAME`, `QUANTITY`, `PRICE`,(`QUANTITY`*`PRICE`) AS `TOTAL PRICE`, `TYPE` FROM `filter_table` ORDER BY `ID` DESC");
        ResultSet rs = ps.executeQuery();
        Shop_filter_table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
              System.out.println(e);
            }
        return false;
    }
}


