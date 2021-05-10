/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author ROBLES
 */
public class Class_Filter {
    public static boolean AddFilter(String date,String brand,String des,String type,String supplier_price,String seller_price,String quantity, byte[] image,String supplier){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `filter_table`(`DATE`, `BRAND`, `DESCRIPTION`, `TYPE`, `SUPPLIER PRICE`, `SELLER PRICE`, `QUANTITY`, `IMAGE`, `SUPPLIER`) VALUES (?,?,?,?,?,?,?,?,?)");
        ps.setString(1,date);
        ps.setString(2,brand);
        ps.setString(3,des);
        ps.setString(4,type);
        ps.setString(5,supplier_price);
        ps.setString(6,seller_price);
        ps.setString(7,quantity);
        ps.setBytes(8,image);
        ps.setString(9,supplier);
        ps.execute();

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
    
    public static boolean UpdateFilter(String date,String brand,String des,String type,String supplier_price,String seller_price,String quantity, byte[] image,String supplier,String id){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("UPDATE `filter_table` SET `DATE`=?,`BRAND`=?,`DESCRIPTION`=?,`TYPE`=?,`SUPPLIER PRICE`=?,`SELLER PRICE`=?,`QUANTITY`=?,`IMAGE`=?,`SUPPLIER`=? WHERE `ID`=?");
        ps.setString(1,date);
        ps.setString(2,brand);
        ps.setString(3,des);
        ps.setString(4,type);
        ps.setString(5,supplier_price);
        ps.setString(6,seller_price);
        ps.setString(7,quantity);
        ps.setBytes(8,image);
        ps.setString(9,supplier);
        ps.setString(10,id);
        ps.execute();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
        
    public static boolean DeleteFilter(String id){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("DELETE FROM filter_table WHERE `ID` = ?");
        ps.setString(1,id);
        ps.execute();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        
     return false;
    }


}
