
package FPE;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Class_Customers {
 
    public static boolean AddCustomer(String name,String address,String contact,String email ){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `customer_table`(`NAME`, `ADDRESS`, `EMAIL`, `CONTACT`) VALUES (?,?,?,?)");
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
    
    public static boolean EditCustomer(String name,String address,String contact,String email, String id ){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("UPDATE `customer_table` SET `NAME`=?,`ADDRESS`=?,`EMAIL`=?,`CONTACT`=? WHERE `ID`=?");
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
    
    public static boolean ExistCustomer(String email){
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean Sup_name = false;
        try{
        ps = FPE_DB.getConnection().prepareStatement("SELECT * FROM `customer_table` WHERE `EMAIL`=?");
        ps.setString(1,email);
        rs = ps.executeQuery();
            if(!rs.next()){
                Sup_name = true;
            } 
 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
     return Sup_name;
    }
}
