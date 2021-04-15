
package FPE2;

import fieldpowerenterprises.database;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class Class_Supplier {
     public static boolean AddSupplier_AddGenset(String name, String address, String email, String contact , String brand , String model, String kva, String phasing, String price, String engine_sn, String alternator_sn, String fuel_tank_cap, String body_type, String date ){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `supplier_table`(`NAME`, `ADDRESS`, `EMAIL`, `CONTACT`) VALUES (?,?,?,?)");
        ps.setString(1, name);
        ps.setString(2, address);
        ps.setString(3, email);
        ps.setString(4, contact);
        ps.execute();
        
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `genset_table`(`BRAND`, `MODEL`, `KVA`, `PHASING`, `PRICE`, `ENGINE_SN`, `ALTERNATOR_SN`, `FUEL_TANK_CAP`, `BODY_TYPE`, `DATE`) VALUES (?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1, brand);
        ps.setString(2, model);
        ps.setString(3, kva);
        ps.setString(4, phasing);
        ps.setString(5, price);
        ps.setString(6, engine_sn);
        ps.setString(7, alternator_sn);
        ps.setString(8, fuel_tank_cap);
        ps.setString(9, body_type);
        ps.setString(10, date);
        ps.execute();
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
     return false;
    }
}
