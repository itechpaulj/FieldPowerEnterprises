
package fieldpowerenterprises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class CustomerClass {
      
              
    public static boolean AddCustomer(String costumer_fname,String costumer_email,String costumer_address,String costumer_contact){
        PreparedStatement ps = null;
        try{
        ps = database.getConnection().prepareStatement("INSERT INTO `customer_tbl`(`NAME`, `EMAIL`, `ADDRESS`, `CONTACT`) VALUES (?,?,?,?)");
        //ps.setString(1, costumer_id);
        ps.setString(1, costumer_fname);
        ps.setString(2, costumer_email);
        ps.setString(3, costumer_address);
        ps.setString(4, costumer_contact);
       
        ps.execute();
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
     return false;
    }
    
    public static boolean DeleteCustomer(String costumer_id){
        PreparedStatement ps = null;
        try{
        ps = database.getConnection().prepareStatement("DELETE FROM customer_tbl WHERE CUSTOMER_ID=?");
        ps.setString(1, costumer_id);
        
        ps.execute();
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
     return false;
    }
    
    public static boolean UpdateCustomer(String costumer_id,String costumer_fname,String costumer_email,String costumer_address,String costumer_contact){
        PreparedStatement ps = null;
        try{
        ps = database.getConnection().prepareStatement("UPDATE `customer_tbl` SET CUSTOMER_ID=?,NAME=?,EMAIL=?,ADDRESS=?,CONTACT=? WHERE CUSTOMER_ID=?");
        ps.setString(1, costumer_id);
        ps.setString(2, costumer_fname);
        ps.setString(3, costumer_email);
        ps.setString(4, costumer_address);
        ps.setString(5, costumer_contact);
        ps.setString(6, costumer_id);
     
        ps.execute();
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
     return false;
    }
    
}
