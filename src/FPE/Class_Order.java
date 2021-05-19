/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.sql.PreparedStatement;


public class Class_Order {
    public static boolean InsertHistoryFilter(String brand,String date,String desc,String type,String price,String quantity,String total,String qoutation,String c_name,String c_address,String c_email,String c_contact,String agent_name,String agent_contact,String filter_id, String count_process){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `history_filter`(`DATE`, `BRAND`, `DESCRIPTION`, `TYPE`, `PRICE`, `QUANTITY`, `TOTAL PRICE`, `QOUTATION`, `NAME`, `ADDRESS`, `EMAIL`, `CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`, `ID FILTER`,`COUNT_PROCESS`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,date);
        ps.setString(2,brand);
        ps.setString(3,desc);
        ps.setString(4,type);
        ps.setString(5,price);
        ps.setString(6,quantity);
        ps.setString(7,total);
        
        ps.setString(8,qoutation);
        ps.setString(9,c_name);
        ps.setString(10,c_address);
        ps.setString(11,c_email);
        ps.setString(12,c_contact);
        ps.setString(13,agent_name);
        ps.setString(14,agent_contact); 
        ps.setString(15,filter_id);
        ps.setString(16,count_process);
        
        ps.execute();
        
        }catch(Exception e){
           e.printStackTrace();
        }
        
     return false;
    }
    
        public static boolean InsertBinFilter(String brand,String date,String desc,String type,String price,String quantity,String total){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `bin_filter`( `DATE`, `BRAND`, `DESCRIPTION`, `TYPE`, `PRICE`, `QUANTITY`, `TOTAL PRICE`) VALUES (?,?,?,?,?,?,?)");
        ps.setString(1,date);
        ps.setString(2,brand);
        ps.setString(3,desc);
        ps.setString(4,type);
        ps.setString(5,price);
        ps.setString(6,quantity);
        ps.setString(7,total);
        
        ps.execute();
        
        }catch(Exception e){
           e.printStackTrace();
        }
        
     return false;
    }
        
       public static boolean UpdateHistoryFilter(String qoutation,String unique,String c_name,String c_address,String c_email,String c_contact,String agent_name,String agent_contact){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("UPDATE `history_filter` SET `QOUTATION`=?, `NAME` = ?,`ADDRESS` = ? , `EMAIL` = ?, `CONTACT`=?, `AGENT_NAME`=?, `AGENT_CONTACT`=?  WHERE  `COUNT_PROCESS` = ?");  
        ps.setString(1,qoutation);
        ps.setString(2,c_name);
        ps.setString(3,c_address);
        ps.setString(4,c_email);
        ps.setString(5,c_contact);
        ps.setString(6,agent_name);
        ps.setString(7,agent_contact);
        ps.setString(8,unique);
      
        
        ps.execute();
        
        }catch(Exception e){
           e.printStackTrace();
        }
        
     return false;
    }
    
        public static boolean UpdateBinFilter(String brand,String date,String desc,String type,String price,String quantity,String total){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("UPDATE `bin_filter` SET `ID`=?,`DATE`=?,`BRAND`=?,`DESCRIPTION`=?,?=?,`SUPPLIER PRICE`=?,`SELLER PRICE`=?,`QUANTITY`=?,`SUPPLIER`=? WHERE ");
        ps.setString(1,quantity);
        
        ps.execute();
        }catch(Exception e){
           e.printStackTrace();
        }
        
     return false;
    } 

        
        
}
