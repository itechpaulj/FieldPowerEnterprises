/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Javinez
 */
public class Class_Stock {
        public static boolean AddStock(String date, String brand, String phasing,String unit_type,String dimen, String kva, String price, String model, String fuel_tank, String body_type, String engines_sn, String alter_sn){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `genset_table`(`BRAND`, `MODEL`, `KVA`, `PHASING`, `UNIT_TYPE`, `DIMENSION`, `TANK_CAP`, `BODY TYPE`, `PRICE`, `ENGINE_SERIAL_NO`, `ALTERNATOR_SERIAL_NO`, `DATE`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,brand);
        ps.setString(2,model);
        ps.setString(3,phasing);
        ps.setString(4,unit_type);
        ps.setString(5,dimen);
        ps.setString(6,kva);
        ps.setString(7,price);
        ps.setString(8,fuel_tank);
        ps.setString(9,body_type);
        ps.setString(10,engines_sn);
        ps.setString(11,alter_sn);
        ps.setString(12,date);
        
        
        
        
        ps.execute();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        
     return false;
    }
}