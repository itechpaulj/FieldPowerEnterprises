/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE2;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Javinez
 */
public class Class_Stock {
    

        public static boolean AddStock(String date, String brand, String phasing,String unit_type,String dimen, String kva, String price, String model, String engines_sn, String alter_sn,byte[] images,String supplier){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `genset_table`( `BRAND`, `MODEL`, `KVA`, `PHASING`, `UNIT_TYPE`, `DIMENSION`, `PRICE`, `ENGINE_SERIAL_NO`, `ALTERNATOR_SERIAL_NO`, `DATE`, `IMAGE`, `SUPPLIER`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,brand);
        ps.setString(2,model);
        ps.setString(3,kva);
        ps.setString(4,phasing);
        ps.setString(5,unit_type);
        ps.setString(6,dimen);
        ps.setString(7,price);
        ps.setString(8,engines_sn);
        ps.setString(9,alter_sn);
        ps.setString(10,date);
        ps.setBytes(11, images); 
        ps.setString(12, supplier); 
        ps.execute();


        }
        catch(Exception e){
           e.printStackTrace();
        }

        
     return false;
    }
        
        public static boolean UpdateStock(String date, String brand, String phasing,String unit_type,String dimen, String kva, String price, String model, String engines_sn, String alter_sn,byte[] images,String supplier,String ids){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("UPDATE `genset_table` SET `BRAND`=?,`MODEL`=?,`KVA`=?,`PHASING`=?,`UNIT_TYPE`=?,`DIMENSION`=?, `PRICE`=?,`ENGINE_SERIAL_NO`=?,`ALTERNATOR_SERIAL_NO`=?,`DATE`=?,`IMAGE`=?,`SUPPLIER`=? WHERE `ID`= ?");       
        ps.setString(1,brand);
        ps.setString(2,model);
        ps.setString(3,kva);
        ps.setString(4,phasing);
        ps.setString(5,unit_type);
        ps.setString(6,dimen);
        ps.setString(7,price);
        ps.setString(8,engines_sn);
        ps.setString(9,alter_sn);
        ps.setString(10,date);
        ps.setBytes(11, images); 
        ps.setString(12, supplier);
        ps.setString(13, ids);
        ps.execute();
        
            }
        catch(Exception e){
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

   

  
}
