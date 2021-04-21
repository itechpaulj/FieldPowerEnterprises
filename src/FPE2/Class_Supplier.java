
package FPE2;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class Class_Supplier {
     
        public static boolean AddSupplier(String name,String address,String contact,String email ){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `supplier_table`(`NAME`, `ADDRESS`, `EMAIL`, `CONTACT`) VALUES (?,?,?,?)");
        ps.setString(1, name);
        ps.setString(2, address);
        ps.setString(3, email);
        ps.setString(4, contact);
        ps.execute();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        
     return false;
    }
        
        
    public static boolean EditSupplier(String name,String address,String contact,String email, String id ){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("UPDATE `supplier_table` SET `NAME`=?,`ADDRESS`=?,`EMAIL`=?,`CONTACT`=? WHERE `ID`=?");
        ps.setString(1, name);
        ps.setString(2, address);
        ps.setString(3, email);
        ps.setString(4, contact);
        ps.setString(5, id);
        ps.execute();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
     return false;
    }        
   
    public static boolean DeleteSupplier(String id){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("DELETE FROM `supplier_table` WHERE `ID`=?");
        ps.setString(1,id);
        ps.execute();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
     return false;
    }   
    
}
