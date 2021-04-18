/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE2;

import static FPE2.Mainpage.supplier_table;
import static FPE2.Mainpage.customer_table;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Javinez
 */
public class Class_table {
    PreparedStatement ps;
    ResultSet rs;
    public boolean supplier(){
        boolean status = false;
         try{
         ps = FPE_DB.getConnection().prepareStatement("SELECT * FROM `supplier_table` ORDER BY `ID` DESC");
         rs = ps.executeQuery();
        supplier_table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
              System.out.println(e);
        }
        return status;
    }
    
    public boolean customer(){
        boolean status = false;
         try{
         ps = FPE_DB.getConnection().prepareStatement("SELECT * FROM `customer_table` ORDER BY `ID` DESC");
         rs = ps.executeQuery();
        customer_table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
              System.out.println(e);
        }
        return status;
    }
    
}
