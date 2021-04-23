/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE2;


import static FPE2.Mainpage.ViewGenset_Table;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Javinez
 */

   
public class Class_Stock {
        public static boolean AddStock( String dates1 ,String brand1 ,String phasing1 ,String unit_type,String dimen1,String kva ,String price1,String model,String fuel_tank ,String body_type ,String engines_sn ,String alter_sn,byte[] images,String supplier){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `genset_table`(`BRAND`, `MODEL`, `KVA`, `PHASING`, `UNIT_TYPE`, `DIMENSION`, `TANK_CAP`, `BODY TYPE`, `PRICE`, `ENGINE_SERIAL_NO`, `ALTERNATOR_SERIAL_NO`, `DATE`, `IMAGE`, `SUPPLIER`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,brand1);
        ps.setString(2,model);
        ps.setString(3,phasing1);
        ps.setString(4,unit_type);
        ps.setString(5,dimen1);
        ps.setString(6,kva);
        ps.setString(7,price1);
        ps.setString(8,fuel_tank);
        ps.setString(9,body_type);
        ps.setString(10,engines_sn);
        ps.setString(11,alter_sn);
        ps.setString(12,dates1);
        ps.setBytes(13, images); 
        ps.setString(14, supplier); 
        ps.execute();
        }
        catch(Exception e){
           e.printStackTrace();
        }
  
     return false;
    }
        
        public static boolean EditStock(String date, String brand, String phasing,String unit_type,String dimen, String kva, String price, String model, String fuel_tank, String body_type, String engines_sn, String alter_sn, String id){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("UPDATE `genset_table` SET `BRAND`=?,`MODEL`=?,`KVA`=?,`PHASING`=?,`UNIT_TYPE`=?,`DIMENSION`=?,`TANK_CAP`=?,`BODY TYPE`=?,`PRICE`=?,`ENGINE_SERIAL_NO`=?,`ALTERNATOR_SERIAL_NO`=?,`DATE`=? WHERE `ID`=?");
        ps.setString(1,brand);
        ps.setString(2,model);
        ps.setString(3,kva);
        ps.setString(4,phasing);
        ps.setString(5,unit_type);
        ps.setString(6,dimen);
        ps.setString(7,fuel_tank);
        ps.setString(8,body_type);
        ps.setString(9,price);
        ps.setString(10,engines_sn);
        ps.setString(11,alter_sn);
        ps.setString(12,date);
        ps.setString(13,id);
        
            if(ps.execute()==false){
                return true;
            }

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
