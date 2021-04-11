
package fieldpowerenterprises;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class Parts_Filter {

        public static boolean AddPartsFilter(String item_ids ,String item_names,String item_brands,String prices,String quantitys,String totals,String desc,String dates){
        PreparedStatement ps = null;
        try{
        ps = database.getConnection().prepareStatement("INSERT INTO `parts_tbl`(`ITEM_NAME`, `BRAND`, `PRICE`, `QUANTITY`, `TOTAL_PRICE`, `DESCRIPTION`, `DATE`) VALUES (?,?,?,?,?,?,?)");
        //ps.setString(1, costumer_id);
        ps.setString(1, item_names);
        ps.setString(2, item_brands);
        ps.setString(3, prices);
        ps.setString(4, quantitys);
        ps.setString(5, totals);
        ps.setString(6, desc);
        ps.setString(7, dates);
        ps.execute();
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
     return false;
    }
        
        public static boolean UpdatePartsFilter(String item_ids ,String item_names,String item_brands,String prices,String quantitys,String totals,String desc,String dates){
        PreparedStatement ps = null;
        try{
        ps = database.getConnection().prepareStatement("UPDATE parts_tbl SET ITEM_NAME=?,BRAND=?,PRICE=?,QUANTITY=?,TOTAL_PRICE=?,DESCRIPTION=?,DATE=? WHERE ITEM_ID=?");
        ps.setString(1, item_names);
        ps.setString(2, item_brands);
        ps.setString(3, prices);
        ps.setString(4, quantitys);
        ps.setString(5, totals);
        ps.setString(6, desc);
        ps.setString(7, dates);
        ps.setString(8, item_ids);
        ps.execute();
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
     return false;
    }
        
         public static boolean DeletePartsFilter(String item_ids ){
        PreparedStatement ps = null;
        try{
        ps = database.getConnection().prepareStatement("DELETE FROM `parts_tbl` WHERE item_id = ?");
        ps.setString(1, item_ids);
       
        ps.execute();
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
     return false;
    }
}
