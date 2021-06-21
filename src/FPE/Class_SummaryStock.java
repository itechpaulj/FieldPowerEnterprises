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
    
    public static boolean InsertStock(String date, String category, String brand, String model, String kva, String phasing, String type, String supplier_price,String seller_price, String engine_sn, String alternator_sn, String quantity, String person_in_charge, String remarks,String supplier_name,String supplier_id, byte[] pic){
    PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `summary_stock`(`DATE RECEIVED`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, `SUPPLIER PRICE`, `SELLER PRICE`, `ENGINE S N`, `ALTERNATOR S N`, `QUANTITY`, `PERSON IN CHARGE`, `REMARKS`, `SUPPLIER`,`SUPPLIER ID`, `IMAGE`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,date);
        ps.setString(2,category);
        ps.setString(3,brand);
        ps.setString(4,model);
        ps.setString(5,kva);
        ps.setString(6,phasing);
        ps.setString(7,type);
        ps.setString(8,supplier_price);
        ps.setString(9,seller_price);
        ps.setString(10,engine_sn);
        ps.setString(11,alternator_sn);
        ps.setString(12,quantity);
        ps.setString(13, person_in_charge); 
        ps.setString(14, remarks);
        ps.setString(15, supplier_name);
        ps.setString(16, supplier_id);
        ps.setBytes(17,pic);
         
        
        ps.execute();
                                                                                                                                                                   //`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`
        }catch(Exception e){
           e.printStackTrace();
        }
    
    return false;
    } 
    
    public static boolean UpdateStock(String date, String category, String brand, String model, String kva, String phasing, String type, String supplier_price,String seller_price, String engine_sn, String alternator_sn, String quantity, String person_in_charge, String remarks ,String supplier_name,String supplier_id, byte[] pic, String id){
    PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("UPDATE `summary_stock` SET `DATE RECEIVED`=?,`CATEGORY`=?,`BRAND`=?,`MODEL`=?,`KVA`=?,`PHASING`=?,`TYPE`=?,`SUPPLIER PRICE`=?,`SELLER PRICE`=?,`ENGINE S N`=?,`ALTERNATOR S N`=?,`QUANTITY`=?,`PERSON IN CHARGE`=?,`REMARKS`=?,`SUPPLIER`=? ,`SUPPLIER ID`=?,`IMAGE`=? WHERE `ID`=?");
     
        ps.setString(1,date);
        ps.setString(2,category);
        ps.setString(3,brand);
        ps.setString(4,model);
        ps.setString(5,kva);
        ps.setString(6,phasing);
        ps.setString(7,type);
        ps.setString(8,supplier_price);
        ps.setString(9,seller_price);
        ps.setString(10,engine_sn);
        ps.setString(11,alternator_sn);
        ps.setString(12,quantity);
        ps.setString(13, person_in_charge); 
        ps.setString(14, remarks);
        ps.setString(15, supplier_name);
        ps.setString(16, supplier_id);
        ps.setBytes(17,pic);
        ps.setString(18,id);
        ps.execute();
        
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
        ps = FPE_DB.getConnection().prepareStatement("DELETE FROM `summary_stock` WHERE `ID`=?");
        ps.setString(1,sid);
        ps.execute();
        
        }catch(Exception e){
           e.printStackTrace();
        }
    
    return false;
    }    
}
//( ")