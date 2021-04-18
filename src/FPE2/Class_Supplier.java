
package FPE2;

import static FPE2.Mainpage.supplier_table;
import fieldpowerenterprises.database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Class_Supplier {
    PreparedStatement ps;
    ResultSet rs;
     public boolean AddSupplier(String name, String address, String email, String contact ) {
         
        boolean status = false;
        try{
          
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `supplier_table`(`NAME`, `ADDRESS`, `EMAIL`, `CONTACT`) VALUES (?,?,?,?)");
        ps.setString(1, name);
        ps.setString(2, address);
        ps.setString(3, email);
        ps.setString(4, contact);
            if(ps.execute()== status){
                JOptionPane.showMessageDialog(null,"Success","",JOptionPane.INFORMATION_MESSAGE);
                DefaultTableModel model = (DefaultTableModel)supplier_table.getModel();
                model.setRowCount(0);
                Class_table cs = new Class_table();
                cs.supplier();
                return true;
            }
        
        }catch(Exception e){
           e.printStackTrace();
        }
        
        return status;
    }
     
     
    public boolean EditSupplier(String name, String address, String email, String contact,String id){
       boolean status = false;
        try{
          
        ps = FPE_DB.getConnection().prepareStatement(" UPDATE `supplier_table` SET `NAME`=?,`ADDRESS`=?,`EMAIL`=?,`CONTACT`=? WHERE `ID`=?");
        ps.setString(1, name);
        ps.setString(2, address);
        ps.setString(3, email);
        ps.setString(4, contact);
        ps.setString(5, id);
            if(ps.execute()== status){
                JOptionPane.showMessageDialog(null,"EDIT SUCCESSFULLY","",JOptionPane.INFORMATION_MESSAGE);
                DefaultTableModel model = (DefaultTableModel)supplier_table.getModel();
                model.setRowCount(0);
                Class_table cs = new Class_table();
                cs.supplier();
                
                return true;
            }
        
        }catch(Exception e){
           e.printStackTrace();
        }
        
        return status;
       
    }
    
    
    public boolean DeleteSupplier(String id){
              boolean status = false;
        try{
         
        ps = FPE_DB.getConnection().prepareStatement(" DELETE FROM `supplier_table` WHERE `ID`=?");
        ps.setString(1, id);
            
            if(ps.execute()== status){
                JOptionPane.showMessageDialog(null,"DELETE SUCCESSFULLY","",JOptionPane.INFORMATION_MESSAGE);
                DefaultTableModel model = (DefaultTableModel)supplier_table.getModel();
                model.setRowCount(0);
                Class_table cs = new Class_table();
                cs.supplier();
                return true;
            }
        
        }catch(Exception e){
           e.printStackTrace();
        }
        
        return status; 
    }
    
    public boolean SearchSupplier (String search){
                boolean status = false;
        try{
          
        ps = FPE_DB.getConnection().prepareStatement("SELECT * FROM `supplier_table` WHERE `NAME`=?");
        ps.setString(1, search);
        ps.executeQuery();

        
        }catch(Exception e){
           e.printStackTrace();
        }
        
        return status;
        
    }


}
