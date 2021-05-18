/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.sql.PreparedStatement;

/**
 *
 * @author ROBLES
 */
public class Class_Bin {
    public static boolean Historygenset(String id,String brand,String model, String kva,String phasing,String unit_type,String dimen,  String price, String seller_price,String engines_sn, String alter_sn,String date, byte[] images,String supplier,String energized,String tank_cap,String oil_usage,String tech, String esystem,String weight, String frame,String update_at,String qoatation,String c_name,String c_add,String c_email,String c_contact,String c_deal,String agent,String agent_contact){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `history_genset_table`( `ID`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `UNIT_TYPE`, `DIMENSION`, `PRICE`, `SELLER PRICE`, `ENGINE_SERIAL_NO`, `ALTERNATOR_SERIAL_NO`, `DATE`, `IMAGE`, `SUPPLIER`, `ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `STARTING SYSTEM`, `WEIGHT`, `FRAME`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `DEALING INFO`, `AGENT_NAME`, `AGENT_CONTACT`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,id);
        ps.setString(2,brand);
        ps.setString(3,model);
        ps.setString(4,kva);
        ps.setString(5,phasing);
        ps.setString(6,unit_type);
        ps.setString(7,dimen);
        ps.setString(8,price);
        ps.setString(9,seller_price);
        ps.setString(10,engines_sn);
        ps.setString(11,alter_sn);
        ps.setString(12,date);
        ps.setBytes(13, images); 
        ps.setString(14, supplier); 
        ps.setString(15,energized);
        ps.setString(16,tank_cap);
        ps.setString(17,oil_usage);
        ps.setString(18,tech);
        ps.setString(19,esystem);
        ps.setString(20,weight);
        ps.setString(21,frame);
        ps.setString(22,update_at);
        ps.setString(23,qoatation);
        ps.setString(24,c_name);
        ps.setString(25,c_add);
        ps.setString(26,c_email);
        ps.setString(27,c_contact);
        ps.setString(28,c_deal);
        ps.setString(29, agent); 
        ps.setString(30, agent_contact); 
        
        ps.execute();
       
                                                                                                                                                                    //`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`
        }catch(Exception e){
           e.printStackTrace();
        }  
     return false;
    }
    
    public static boolean BinGenset(String id,String brand,String model, String kva,String phasing,String unit_type,String dimen,  String price, String seller_price,String engines_sn, String alter_sn,String date, byte[] images,String supplier,String energized,String tank_cap,String oil_usage,String tech,String esystem,String weight,String frame,String update_at){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `bin_genset`( `ID`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `UNIT_TYPE`, `DIMENSION`, `PRICE`, `SELLER PRICE`, `ENGINE_SERIAL_NO`, `ALTERNATOR_SERIAL_NO`, `DATE`, `IMAGE`, `SUPPLIER`, `ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `STARTING SYSTEM`, `WEIGHT`, `FRAME`,`UPDATED AT`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,id);
        ps.setString(2,brand);
        ps.setString(3,model);
        ps.setString(4,kva);
        ps.setString(5,phasing);
        ps.setString(6,unit_type);
        ps.setString(7,dimen);
        ps.setString(8,price);
        ps.setString(9,seller_price);
        ps.setString(10,engines_sn);
        ps.setString(11,alter_sn);
        ps.setString(12,date);
        ps.setBytes(13, images); 
        ps.setString(14, supplier); 
        ps.setString(15,energized);
        ps.setString(16,tank_cap);
        ps.setString(17,oil_usage);
        ps.setString(18,tech);
        ps.setString(19,esystem);
        ps.setString(20,weight);
        ps.setString(21,frame);
        ps.setString(22,update_at);
        ps.execute();
       
                                                                                                                                                                    //`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`
        }catch(Exception e){
           e.printStackTrace();
        }
     return false;
    }
    
   public static boolean gensetTable(String id){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("DELETE FROM `genset_table` WHERE `ID`=?");
        ps.setString(1,id);
        ps.execute();                                                                                                                                                     //`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`
        }catch(Exception e){
           e.printStackTrace();
        }
     return false;
    }


//update
    public static boolean HistorygensetUpdate(String id,String brand,String model, String kva,String phasing,String unit_type,String dimen,  String price, String seller_price,String engines_sn, String alter_sn,String date, byte[] images,String supplier,String energized,String tank_cap,String oil_usage,String tech, String esystem,String weight, String frame,String update_at,String qoatation,String c_name,String c_add,String c_email,String c_contact,String c_deal,String agent,String agent_contact){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("UPDATE `history_genset_table` SET `BRAND`=?,`MODEL`=?,`KVA`=?,`PHASING`=?,`UNIT_TYPE`=?,`DIMENSION`=?,`PRICE`=?,`SELLER PRICE`=?,`ENGINE_SERIAL_NO`=?,`ALTERNATOR_SERIAL_NO`=?,`DATE`=?,`IMAGE`=?,`SUPPLIER`=?,`ENERGIZED DATE`=?,`TANK CAPACITY`=?,`OIL USAGE`=?,`TECHNICIAN`=?,`STARTING SYSTEM`=?,`WEIGHT`=?,`FRAME`=?,`UPDATED AT`=?,`QUOTATION`=?,`CUSTOMER_NAME`=?,`CUSTOMER_ADDRESS`=?,`CUSTOMER_EMAIL`=?,`CUSTOMER_CONTACT`=?,`DEALING INFO`=?,`AGENT_NAME`=?,`AGENT_CONTACT`=? WHERE `ID` = ?");
        ps.setString(1,brand);
        ps.setString(2,model);
        ps.setString(3,kva);
        ps.setString(4,phasing);
        ps.setString(5,unit_type);
        ps.setString(6,dimen);
        ps.setString(7,price);
        ps.setString(8,seller_price);
        ps.setString(9,engines_sn);
        ps.setString(10,alter_sn);
        ps.setString(11,date);
        ps.setBytes(12, images); 
        ps.setString(13, supplier); 
        ps.setString(14,energized);
        ps.setString(15,tank_cap);
        ps.setString(16,oil_usage);
        ps.setString(17,tech);
        ps.setString(18,esystem);
        ps.setString(19,weight);
        ps.setString(20,frame);
        ps.setString(21,update_at);
        ps.setString(22,qoatation);
        ps.setString(23,c_name);
        ps.setString(24,c_add);
        ps.setString(25,c_email);
        ps.setString(26,c_contact);
        ps.setString(27,c_deal);
        ps.setString(28, agent); 
        ps.setString(29, agent_contact); 
        ps.setString(30, id); 
        ps.execute();
                                                                                                                                                        //`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`
        }catch(Exception e){
           e.printStackTrace();
        }  
     return false;
    }
 
    public static boolean BinGensetUpdate(String id,String brand,String model, String kva,String phasing,String unit_type,String dimen,  String price, String seller_price,String engines_sn, String alter_sn,String date, byte[] images,String supplier,String energized,String tank_cap,String oil_usage,String tech,String esystem,String weight,String frame,String update_at){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("UPDATE `bin_genset` SET `BRAND`=?,`MODEL`=?,`KVA`=?,`PHASING`=?,`UNIT_TYPE`=?,`DIMENSION`=?,`PRICE`=?,`SELLER PRICE`=?,`ENGINE_SERIAL_NO`=?,`ALTERNATOR_SERIAL_NO`=?,`DATE`=?,`IMAGE`=?,`SUPPLIER`=?,`ENERGIZED DATE`=?,`TANK CAPACITY`=?,`OIL USAGE`=?,`TECHNICIAN`=?,`STARTING SYSTEM`=?,`WEIGHT`=?,`FRAME`=?,`UPDATED AT`=? WHERE `ID` = ?");
        ps.setString(1,brand);
        ps.setString(2,model);
        ps.setString(3,kva);
        ps.setString(4,phasing);
        ps.setString(5,unit_type);
        ps.setString(6,dimen);
        ps.setString(7,price);
        ps.setString(8,seller_price);
        ps.setString(9,engines_sn);
        ps.setString(10,alter_sn);
        ps.setString(11,date);
        ps.setBytes(12, images); 
        ps.setString(13, supplier); 
        ps.setString(14,energized);
        ps.setString(15,tank_cap);
        ps.setString(16,oil_usage);
        ps.setString(17,tech);
        ps.setString(18,esystem);
        ps.setString(19,weight);
        ps.setString(20,frame);
        ps.setString(21,update_at);
        ps.setString(22,id);
        ps.execute();
       
                                                                                                                                                                    //`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`
        }catch(Exception e){
           e.printStackTrace();
        }
     return false;
    }    
}
