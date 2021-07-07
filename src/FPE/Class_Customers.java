
package FPE;

import FPE.FPE_DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Class_Customers {
 
    public static boolean AddCustomer(String name,String address,String contact ){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `customer_table`(`NAME`, `ADDRESS`,  `CONTACT`) VALUES (?,?,?)");
        ps.setString(1, name);
        ps.setString(2, address);
        ps.setString(3, contact);

        ps.execute();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        
     return false;
    }
    
    public static boolean EditCustomer(String name,String address,String contact, String id ){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("UPDATE `customer_table` SET `NAME`=?,`ADDRESS`=?,CONTACT`=? WHERE `ID`=?");
        ps.setString(1, name);
        ps.setString(2, address);
        ps.setString(3, contact);
        ps.setString(4, id);
      
        ps.execute();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
     return false;
    }        
   
    public static boolean DeleteCustomer(String id){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("DELETE FROM `customer_table` WHERE `ID`=?");
        ps.setString(1,id);
        ps.execute();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
     return false;
    }
    
    public static boolean ExistCustomer(String name){
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean Sup_email = false;
        try{
        ps = FPE_DB.getConnection().prepareStatement("SELECT `NAME` FROM `customer_table` WHERE `NAME`=?");
        ps.setString(1,name);
        rs = ps.executeQuery();
            if(!rs.next()){
                Sup_email = true;
            } 
 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
     return Sup_email;
    }
}
