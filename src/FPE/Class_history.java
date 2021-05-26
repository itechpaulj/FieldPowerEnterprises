/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.sql.PreparedStatement;

/**
 *
 * @author Javinez
 */
public class Class_history {
 
    
        public static boolean ReturnGenset(String brand, String model, String kva, String phasing, String type, String dimen, String price, String s_price, String engines,String alters,String date,byte[] images, String name, String energized_date,String tank_cap,String oil_usage, String tech, String esystem, String weight, String frame,String updated_at ){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `genset_table`( `BRAND`, `MODEL`, `KVA`, `PHASING`, `UNIT_TYPE`, `DIMENSION`, `PRICE`, `SELLER_PRICE`, `ENGINE_SERIAL_NO`, `ALTERNATOR_SERIAL_NO`, `DATE`, `IMAGE`, `SUPPLIER`,`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `STARTING SYSTEM`, `WEIGHT`, `FRAME`, `UPDATED AT`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,brand);
        ps.setString(2,model);
        ps.setString(3,kva);
        ps.setString(4,phasing);
        ps.setString(5,type);
        ps.setString(6,dimen);
        ps.setString(7,price);
        ps.setString(8,s_price);
        ps.setString(9,engines);
        ps.setString(10,alters);
        ps.setString(11,date);
        ps.setBytes(12, images); 
        ps.setString(13, name);
        ps.setString(14,energized_date);
        ps.setString(15,tank_cap);
        ps.setString(16,oil_usage);
        ps.setString(17,tech);
        ps.setString(18,esystem);
        ps.setString(19,weight);
        ps.setString(20,frame);
        ps.setString(21,updated_at);
        ps.execute();
        
        }catch(Exception e){
           e.printStackTrace();
        }

        
     return false;
    }
    public static boolean ReturnFilter(String date, String brand,String description,String type,String seller_price,String quantity,byte[] images,String id){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("UPDATE `filter_table` SET `DATE`=?,`BRAND`=?,`DESCRIPTION`=?,`TYPE`=?,`SELLER PRICE`=?,`QUANTITY`=?,`IMAGE`=? WHERE `ID`=?");
        ps.setString(1,date);
        ps.setString(2,brand);
        ps.setString(3,description);
        ps.setString(4,type);
        ps.setString(5,seller_price);
        ps.setString(6,quantity);
        ps.setBytes(7,images);
        ps.setString(8,id);
        ps.execute();
        
        }catch(Exception e){
           e.printStackTrace();
        }
        return false;
    }
}
