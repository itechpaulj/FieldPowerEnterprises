/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.sql.PreparedStatement;

/**
 *
 * @author Robles
 */
public class Class_SummaryStock {
    
    public static boolean InsertStock(String category,String brand,String model,String kva,String phasing,String type,String supplier_price,String seller_price,String quantity,int total_price,String engine,String alternator,String supplier_id,String date_inbound,byte [] image,String incharge,String remarks){
    PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `stock_table`(`CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, `SUPPLIER PRICE`, `SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`, `ENGINE S.N`, `ALTERNATOR S.N`, `SUPPLIER ID`, `DATE INBOUND`, `IMAGE`, `INCHARGE`, `REMARKS`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        
        ps.setString(1,category);
        ps.setString(2,brand);
        ps.setString(3,model);
        ps.setString(4,kva);
        ps.setString(5,phasing);
        ps.setString(6,type);
        ps.setString(7,supplier_price);
        ps.setString(8,seller_price);
        ps.setString(9,quantity);
        ps.setInt(10,total_price);
        ps.setString(11,engine);
        ps.setString(12,alternator);
        ps.setString(13, supplier_id);
        ps.setString(14, date_inbound); 
        ps.setBytes(15, image);
        ps.setString(16, incharge);
        ps.setString(17, remarks);
        
        ps.execute();
                                                                                                                                                                   //`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`
        }catch(Exception e){
           e.printStackTrace();
        }
    
    return false;
    } 
    
        public static boolean UpdateStock(String category,String brand,String model,String kva,String phasing,String type,String supplier_price,String seller_price,String quantity,int total_price,String engine,String alternator,String supplier_id,String date_inbound,byte [] image,String incharge,String remarks,String id){
    PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("UPDATE `stock_table` SET `CATEGORY`=?,`BRAND`=?,`MODEL`=?,`KVA`=?,`PHASING`=?,`TYPE`=?,`SUPPLIER PRICE`=?,`SELLER PRICE`=?,`QUANTITY`=?,`TOTAL PRICE`=?,`ENGINE S.N`=?,`ALTERNATOR S.N`=?,`SUPPLIER ID`=?,`DATE INBOUND`=?,`IMAGE`=?,`INCHARGE`=?,`REMARKS`=? WHERE `STOCK ID`=?");
        ps.setString(1,category);     
        ps.setString(2,brand);
        ps.setString(3,model);
        ps.setString(4,kva);
        ps.setString(5,phasing);
        ps.setString(6,type);
        ps.setString(7,supplier_price);
        ps.setString(8,seller_price);
        ps.setString(9,quantity);
        ps.setInt(10,total_price);
        ps.setString(11,engine);
        ps.setString(12,alternator);
        ps.setString(13, supplier_id);
        ps.setString(14, date_inbound); 
        ps.setBytes(15, image);
        ps.setString(16, incharge);
        ps.setString(17, remarks);
        ps.setString(18, id);
        
        ps.execute();
                                                                                                                                                                   //`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`
        }catch(Exception e){
           e.printStackTrace();
        }
    
    return false;
    } 
    
    public static boolean UpdateQuantity(String Update_quantity,String Stock_id){
    PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("UPDATE `summary_stock` SET `QUANTITY`= ? WHERE `ID` = ?");
     
        ps.setString(1,Update_quantity);
        ps.setString(2,Stock_id);
        
        ps.execute();
        
        }catch(Exception e){
           e.printStackTrace();
        }
    
    return false;
    }
    public static boolean DeleteGenset(String sid){
    PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("DELETE FROM `stock_table` WHERE `STOCK ID`=?");
        ps.setString(1,sid);
        ps.execute();
        
        }catch(Exception e){
           e.printStackTrace();
        }
    
    return false;
    }    
}
//( ")