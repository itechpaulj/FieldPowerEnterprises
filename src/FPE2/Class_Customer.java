/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE2;

import static FPE2.Mainpage.customer_table;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Javinez
 */
public class Class_Customer {
    PreparedStatement ps;
    public boolean AddCustomer(String name, String address, String email, String contact){
         boolean status = false;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `customer_table`(`NAME`, `ADDRESS`, `EMAIL`, `CONTACT`) VALUES (?,?,?,?)");
        ps.setString(1, name);
        ps.setString(2, address);
        ps.setString(3, email);
        ps.setString(4, contact);
            if(ps.execute()== status){
                JOptionPane.showMessageDialog(null,"Success","",JOptionPane.INFORMATION_MESSAGE);
                DefaultTableModel model = (DefaultTableModel)customer_table.getModel();
                model.setRowCount(0);
                Class_table cs = new Class_table();
                cs.customer();
                return true;
            }
        
        }catch(Exception e){
           e.printStackTrace();
        }
        
        return status;
    }
    
    public boolean EditCustomer(String name, String address, String email, String contact, String id){
         boolean status = false;
        try{
        ps = FPE_DB.getConnection().prepareStatement("UPDATE `customer_table` SET `NAME`=?,`ADDRESS`=?,`EMAIL`=?,`CONTACT`=? WHERE `ID`=?");
        ps.setString(1, name);
        ps.setString(2, address);
        ps.setString(3, email);
        ps.setString(4, contact);
        ps.setString(5, id);
            if(ps.execute()== status){
                JOptionPane.showMessageDialog(null,"Update Successfully","",JOptionPane.INFORMATION_MESSAGE);
                DefaultTableModel model = (DefaultTableModel)customer_table.getModel();
                model.setRowCount(0);
                Class_table cs = new Class_table();
                cs.customer();
                return true;
            }
        
        }catch(Exception e){
           e.printStackTrace();
        }
        
        return status;
    }
    
        public boolean DeleteCustomer(String id){
         boolean status = false;
        try{
        ps = FPE_DB.getConnection().prepareStatement("DELETE FROM `customer_table` WHERE `ID`=?");
        ps.setString(1, id);
            if(ps.execute()== status){
                JOptionPane.showMessageDialog(null,"Delete Successfully","",JOptionPane.INFORMATION_MESSAGE);
                DefaultTableModel model = (DefaultTableModel)customer_table.getModel();
                model.setRowCount(0);
                Class_table cs = new Class_table();
                cs.customer();
                return true;
            }
        
        }catch(Exception e){
           e.printStackTrace();
        }
        
        return status;
    }    
}
