/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import static FPE.Webpage.Order_Number_Table;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Javinez
 */
public class Class_Process {
    public boolean process_genset_summaryStock(String customer_id, String amount,String balanced,String cash_checked,String bank,String or_no,String remark,String status,String process){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("UPDATE `sale_summary_stock` SET `CUSTOMER ID`=?, `AMOUNT`=?,`BALANCED`=?,`CASH_OR_CHECKED`=?,`BANKED`=?,`OR NO`=?,`REMARKS`=?,`STATUS`=? WHERE `PROCESS`=?");
     
        ps.setString(1,customer_id);
        ps.setString(2,amount);
        ps.setString(3,balanced);
        ps.setString(4,cash_checked);
        ps.setString(5,bank);
        ps.setString(6,or_no);
        ps.setString(7,remark);
        ps.setString(8,status);
        ps.setString(9,process);
        ps.execute();
        
        }catch(Exception e){
           e.printStackTrace();
        }
        return false;
    }
  
    public boolean process_genset_addCart(String status,String process){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("UPDATE `add_cart` SET `STATUS`=? WHERE `PROCESS`=?");
        ps.setString(1,status);
        ps.setString(2,process);
        ps.execute();
        
        }catch(Exception e){
           e.printStackTrace();
        }
        return false;
    }    
    
    public boolean process_cart_delete(){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("DELETE FROM `add_cart`");
        ps.execute();
        
        }catch(Exception e){
           e.printStackTrace();
        }
        return false;
    }
    

}
