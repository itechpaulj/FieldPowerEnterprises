/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;



import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


/**
 *
 * @author Javinez
 */
public class Class_Stock {
    

        public static boolean AddGenset(String date, String brand,String model, String kva,String phasing,String unit_type,String dimen,  String price, String seller_price,String engines_sn, String alter_sn, byte[] images,String supplier){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `genset_table`( `BRAND`, `MODEL`, `KVA`, `PHASING`, `UNIT_TYPE`, `DIMENSION`, `PRICE`, `SELLER_PRICE`, `ENGINE_SERIAL_NO`, `ALTERNATOR_SERIAL_NO`, `DATE`, `IMAGE`, `SUPPLIER`,`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `STARTING SYSTEM`, `WEIGHT`, `FRAME`, `UPDATED AT`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
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
        // no value
        ps.setString(14,"");
        ps.setString(15,"");
        ps.setString(16,"");
        ps.setString(17,"");
        ps.setString(18,"");
        ps.setString(19,"");
        ps.setString(20,"");
        ps.setString(21,"");
        ps.execute();
        
        }catch(Exception e){
           e.printStackTrace();
        }

        
     return false;
    }
        
        public static boolean UpdateGenset(String id,String date, String brand,String model, String kva,String phasing,String unit_type,String dimen,  String price, String seller_price,String engines_sn, String alter_sn, byte[] images,String supplier,String updated_at){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("UPDATE`genset_table`SET`BRAND`=?,`MODEL`=?,`KVA`=?,`PHASING`=?,`UNIT_TYPE`=?,`DIMENSION`=?,`PRICE`=?,`SELLER_PRICE`=?,`ENGINE_SERIAL_NO`=?,`ALTERNATOR_SERIAL_NO`=?,`DATE`=?,`IMAGE`=?,`SUPPLIER`=? ,`UPDATED AT` = ? WHERE `ID`=?");
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
        ps.setString(14, updated_at);
        ps.setString(15, id); 
        
        ps.execute();
        
        }catch(Exception e){
           e.printStackTrace();
        }

        
     return false;
    }   
        
        public static boolean DeleteGenset(String id){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("DELETE  FROM genset_table WHERE ID = ?");
        ps.setString(1,id);
        ps.execute();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        
     return false;
    }

   public static boolean UpdateEnergized(String date_energized,String tank_cap,String oil,String tech,String esystem, String weight , String frame, String updated_at,String id){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("UPDATE `genset_table` SET `ENERGIZED DATE`=?, `TANK CAPACITY`=?, `OIL USAGE`=?,`TECHNICIAN`=?, `STARTING SYSTEM`=?, `WEIGHT` = ?, `FRAME` = ? , `UPDATED AT`=? WHERE `ID` = ? ");
        ps.setString(1,date_energized);
        ps.setString(2,tank_cap);
        ps.setString(3,oil);
        ps.setString(4,tech);
        ps.setString(5,esystem);
        ps.setString(6,weight);
        ps.setString(7,frame);
        ps.setString(8,updated_at);
        ps.setString(9,id);

        ps.executeUpdate();
        
        }catch(Exception e){
           e.printStackTrace();
        }

        
     return false;
    }

  
}
