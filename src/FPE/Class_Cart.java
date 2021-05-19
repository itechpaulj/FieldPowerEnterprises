/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.sql.PreparedStatement;

/**
 *
 * @author Javinez
 */
public class Class_Cart {
    public static boolean AddCart(String id,String brand,String date,String desc,String type,String price,String quantity,String total){
        PreparedStatement ps = null;
        try{
       
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `add_cart`(`BRAND`, `DATE`, `DESCRIPTION`, `TYPE`, `PRICE`,`QUANTITY`,`TOTAL PRICE`) VALUES (?,?,?,?,?,?,?)");
        ps.setString(1,brand);
        ps.setString(2,date);
        ps.setString(3,desc);
        ps.setString(4,type);
        ps.setString(5,price);
        ps.setString(6,quantity);
        ps.setString(7,total);
 
        
        ps.execute();
        
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
        ps = FPE_DB.getConnection().prepareStatement("DELETE FROM `add_cart` WHERE ID = ?");
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
    
    
}
