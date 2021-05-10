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
    public static boolean BinGenset(String brand,String model, String kva,String phasing,String unit_type,String dimen,  String price, String seller_price,String engines_sn, String alter_sn,String date, byte[] images,String supplier,String energized,String tank_cap,String oil_usage,String tech,String update_at,String qoatation,String c_name,String c_add,String c_email,String c_contact,String c_deal,String agent,String agent_contact){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `bin_genset`( `BRAND`, `MODEL`, `KVA`, `PHASING`, `UNIT_TYPE`, `DIMENSION`, `PRICE`, `SELLER PRICE`, `ENGINE_SERIAL_NO`, `ALTERNATOR_SERIAL_NO`, `DATE`, `IMAGE`, `SUPPLIER`, `ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
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
        ps.setString(18,update_at);
        ps.setString(19,qoatation);
        ps.setString(20,c_name);
        ps.setString(21,c_add);
        ps.setString(22,c_email);
        ps.setString(23,c_contact);
        ps.setString(24,c_deal);
        ps.setString(25, agent); 
        ps.setString(26, agent_contact); 
        
        ps.execute();
       
                                                                                                                                                                    //`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`
        }catch(Exception e){
           e.printStackTrace();
        }

        
     return false;
    }
}
