/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE.folder;

import FPE.FPE_DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Javinez
 */
public class Class_Cart {
    public static int last_insert_id = 0;
    public static boolean AddCart(String id,String brand,String date,String desc,String type,String price,String quantity,String total){
        PreparedStatement ps = null;
        try{
       
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `add_cart`(`BRAND`, `DATE`, `DESCRIPTION`, `TYPE`, `PRICE`,`QUANTITY`,`TOTAL PRICE`) VALUES (?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
        ps.setString(1,brand);
        ps.setString(2,date);
        ps.setString(3,desc);
        ps.setString(4,type);
        ps.setString(5,price);
        ps.setString(6,quantity);
        ps.setString(7,total);
        
        
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
            if(rs.next())
            {
                last_insert_id = rs.getInt(1);
            }
        }catch(Exception e){
           e.printStackTrace();
        }
        
     return false;
    }
    
    public static boolean AddOther(String desc,String price,String quantity,String total){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `add_cart`(`DESCRIPTION`, `QUANTITY`, `PRICE`, `TOTAL PRICE`) VALUES (?,?,?,?)");
        ps.setString(1,desc);
        ps.setString(2,price);
        ps.setString(3,quantity);
        ps.setString(4,total);
        ps.execute();
        
        }catch(Exception e){
           e.printStackTrace();
        }
        
     return false;
    }
    
    public static boolean Cart_Item_Delete(String id){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("DELETE FROM `add_cart` WHERE `ID` = ?");
        ps.setString(1,id);
        ps.execute();
        
        ps = FPE_DB.getConnection().prepareStatement("DELETE FROM `history_filter` WHERE `ID CART` = ?");
        ps.setString(1,id);
        ps.execute();
        
        }catch(Exception e){
           e.printStackTrace();
        }
        
     return false;
    }
    
          
    public static boolean DeleteCart(){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("DELETE FROM `add_cart`");

        ps.execute();
        
        }catch(Exception e){
           e.printStackTrace();
        }
        
     return false;
    } 
    
        
    
    public static boolean ExistCart(String brand){
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean brand_name = false;
        try{
        ps = FPE_DB.getConnection().prepareStatement("SELECT `BRAND` FROM `add_cart` WHERE `BRAND`=?");
        ps.setString(1,brand);
        rs = ps.executeQuery();
            if(!rs.next()){
                brand_name = true;
            } 
 
        }
        catch(Exception e){
            //JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }   
     return brand_name;
    }
}
