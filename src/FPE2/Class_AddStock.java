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
public class Class_AddStock {
        public static boolean AddCustomer(String name,String address,String contact,String email ){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `Customer_table`(`NAME`, `ADDRESS`, `EMAIL`, `CONTACT`) VALUES (?,?,?,?)");
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
}
