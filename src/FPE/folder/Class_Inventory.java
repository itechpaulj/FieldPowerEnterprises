
package FPE.folder;

import FPE.FPE_DB;
import java.sql.PreparedStatement;


public class Class_Inventory {
    public static boolean AddGenset(String date, String brand,String model, String kva,String phasing,String unit_type,String dimen,  String price, String seller_price,String engines_sn, String alter_sn, byte[] images,String supplier){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `genset_table`(`BRAND`, `MODEL`, `KVA`, `PHASING`, `UNIT_TYPE`, `DIMENSION`, `PRICE`, `ENGINE_SERIAL_NO`, `ALTERNATOR_SERIAL_NO`, `DATE`, `IMAGE`, `SUPPLIER`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?);");
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
        ps.execute();
        
        }catch(Exception e){
           e.printStackTrace();
        }

        
     return false;
    }
}
