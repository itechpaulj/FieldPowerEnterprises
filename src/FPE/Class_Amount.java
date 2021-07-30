/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Robles
 */
public class Class_Amount {
    public static int q;
    public static int look;
   // --GET THE AMOUNT OF CART ---------------------------------------------------------------------------------------------------------------------------------------------------------------
        
    public static boolean Amount(){        
        PreparedStatement ps = null;

        int total = 0;
        try{
        ps = FPE_DB.getConnection().prepareStatement("SELECT SUM(`TOTAL PRICE`) AS `TOTAL PRICE` FROM `cart_table`");

        ResultSet rs = ps.executeQuery();

        while(rs.next()){
        total = rs.getInt("TOTAL PRICE");
        Webpage.total_amount.setText(""+total);
        }


        }catch(Exception e){
           e.printStackTrace();
        }    
     return false;
    }
       
 
   // --UPDATE THE QUANTITY AND TOTAL PRICE OF THE STOCK ----------------------------------------------------------------------------------------------------------------------------------------------------------------
        
     public static boolean StockUpdateQuantityAndTotal(String quantity,int total_price,String stock_id){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("UPDATE `stock_table` SET `QUANTITY`=?,`TOTAL PRICE`=? WHERE `STOCK ID`=?");
        ps.setString(1,quantity);
        ps.setInt(2,total_price);
        ps.setString(3,stock_id);
        
        ps.execute();
                                                                                                                                                                   //`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`
        }catch(Exception e){
           e.printStackTrace();
        }
    
    return false;
    }
     
     // --UPDATE THE QUANTITY AND TOTAL PRICE OF THE STOCK ----------------------------------------------------------------------------------------------------------------------------------------------------------------
        
     public static boolean FulloutUpdateQuantityAndTotal(String quantity,int total_price,String stock_id){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("UPDATE `fullout` SET `QUANTITY`=?,`TOTAL PRICE`=? WHERE `STOCK ID`=?");
        ps.setString(1,quantity);
        ps.setInt(2,total_price);
        ps.setString(3,stock_id);
        
        ps.execute();
                                                                                                                                                                   //`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`
        }catch(Exception e){
           e.printStackTrace();
        }
    
    return false;
    }
     
     
// -- UPDATE THE QUANTITY AND TOTAL PRICE OF THE CART ----------------------------------------------------------------------------------------------------------------------------------------------------------------
     
     public static boolean CartUpdateQuantityAndTotal(int quantity,int total_price,String stock_id){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("UPDATE `cart_table` SET `QUANTITY`=?,`TOTAL PRICE`=? WHERE `STOCK ID`=?");
        ps.setInt(1,quantity);
        ps.setInt(2,total_price);
        ps.setString(3,stock_id);
        
        ps.execute();
                                                                                                                                                                   //`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`
        }catch(Exception e){
           e.printStackTrace();
        }
    
    return false;
    }
 
    
// -- UPDATE THE QUANTITY AND TOTAL PRICE OF THE HISTORY ----------------------------------------------------------------------------------------------------------------------------------------------------------------
     
     public static boolean HistoryUpdateQuantityAndTotal(String quantity,int total_price,String stock_id){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("UPDATE `history_table` SET `QUANTITY`=?,`TOTAL PRICE`=? WHERE `STOCK ID`=?");
        ps.setString(1,quantity);
        ps.setInt(2,total_price);
        ps.setString(3,stock_id);
        
        ps.execute();
                                                                                                                                                                   //`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`
        }catch(Exception e){
           e.printStackTrace();
        }
    
    return false;
    }
     
    public static boolean CartDelete(String stock_id){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("DELETE FROM `cart_table` WHERE `STOCK ID`= ?");
        ps.setString(1,stock_id);
        
        
        ps.execute();
                                                                                                                                                                   //`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`
        }catch(Exception e){
           e.printStackTrace();
        }
    
    return false;
    }
    
    public static boolean HistoryDelete(String stock_id){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("DELETE FROM `history_table` WHERE `STOCK ID`= ?");
        ps.setString(1,stock_id);
        
        
        ps.execute();
                                                                                                                                                                   //`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`
        }catch(Exception e){
           e.printStackTrace();
        }
    
    return false;
    }
    
    public static boolean FulloutDelete(String stock_id){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("DELETE FROM `fullout` WHERE `STOCK ID` = ?");
        ps.setString(1,stock_id);
        
        
        ps.execute();
                                                                                                                                                                   //`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`
        }catch(Exception e){
           e.printStackTrace();
        }
    
    return false;
    }
}
