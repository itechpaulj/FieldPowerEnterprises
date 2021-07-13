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
public class Class_fullout {
   public static boolean Amount(){        
        PreparedStatement ps = null;

        int total = 0;
        try{
        ps = FPE_DB.getConnection().prepareStatement("SELECT SUM(`TOTAL PRICE`) AS `TOTAL PRICE` FROM `fullout`");

        ResultSet rs = ps.executeQuery();

        while(rs.next()){
        total = rs.getInt("TOTAL PRICE");
        Webpage.fullout_amount.setText(""+total);
        }


        }catch(Exception e){
           e.printStackTrace();
        }    
     return false;
    } 
   
   public static boolean InsertFullout(String stock_id,String category,String brand,String type,String supplier_price,String seller_price,String quantity,int total_price,String supplier_id,String date_inbound,String date_outbound,byte [] image,String incharge,String remarks,String process,String verify){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `cart_table`(`STOCK ID`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, `SUPPLIER PRICE`, `SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`, `ENGINE S.N`, `ALTERNATOR S.N`, `SUPPLIER ID`, `DATE INBOUND`, `DATE OUTBOUND`, `IMAGE`, `INCHARGE`, `REMARKS`, `PROCESS`, `VERIFY`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        
        ps.setString(1,stock_id); // 1
        ps.setString(2,category);
        ps.setString(3,brand);      
        ps.setString(4,type);
        ps.setString(5,supplier_price);
        ps.setString(6,seller_price);
        ps.setString(7,quantity);
        ps.setInt(8,total_price);        
        ps.setString(9, supplier_id);
        ps.setString(10, date_inbound);
        ps.setString(11, date_outbound);  // 2
        ps.setBytes(12, image);
        ps.setString(13, incharge);
        ps.setString(14, remarks);
        ps.setString(15,process); // 3
        ps.setString(16,verify);  // 4
        ps.execute();
                                                                                                                                                                   //`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`
        }catch(Exception e){
           e.printStackTrace();
        }
    
    return false;
    }
}
