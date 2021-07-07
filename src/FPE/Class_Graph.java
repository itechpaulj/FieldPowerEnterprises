/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import static FPE.Webpage.Stock_Table;


public class Class_Graph {

    public static String yandong = null;
    public static String isuzu = null;
    public static String perkins = null;
    public static String cummins = null;
    public static String weifang = null;
    public static String yamada = null;
    
    
   public static boolean isuzu( ){
        PreparedStatement ps = null;
         boolean status = false;
        String total_sale = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("SELECT SUM(QUANTITY) as `TOTAL` FROM `sale_summary_stock` WHERE `BRAND` = 'ISUZU'");
        ps.setString(1, total_sale);

        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
       
         
        isuzu = rs.getString("QUANTITY");
            
         }
        status = rs.next();
        }catch(Exception e){
           e.printStackTrace();
        }    
     return false;
    }
   
   public static boolean yandong(){
        PreparedStatement ps = null;
         boolean status = false;
        String total_sale = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("SELECT SUM(QUANTITY) as `TOTAL` FROM `sale_summary_stock` WHERE `BRAND` = 'YANDONG'");
        ps.setString(1, total_sale);

        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
       
         
        isuzu = rs.getString("QUANTITY");
            
         }
        status = rs.next();
        }catch(Exception e){
           e.printStackTrace();
        }    
     return false;
    }
   
   public static boolean perkins(){
        PreparedStatement ps = null;
         boolean status = false;
        String total_sale = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("SELECT SUM(QUANTITY) as `TOTAL` FROM `sale_summary_stock` WHERE `BRAND` = 'PERKINS'");
        ps.setString(1, total_sale);

        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
       
         
        isuzu = rs.getString("QUANTITY");
            
         }
        status = rs.next();
        }catch(Exception e){
           e.printStackTrace();
        }    
     return false;
    }
   
   public static boolean cummins(){
        PreparedStatement ps = null;
         boolean status = false;
        String total_sale = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("SELECT SUM(QUANTITY) as `TOTAL` FROM `sale_summary_stock` WHERE `BRAND` = 'CUMMINS'");
        ps.setString(1, total_sale);

        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
       
         
        isuzu = rs.getString("QUANTITY");
            
         }
        status = rs.next();
        }catch(Exception e){
           e.printStackTrace();
        }    
     return false;
    }
   
   public static boolean weifang(){
        PreparedStatement ps = null;
         boolean status = false;
        String total_sale = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("SELECT SUM(QUANTITY) as `TOTAL` FROM `sale_summary_stock` WHERE `BRAND` = 'WEIFANG'");
        ps.setString(1, total_sale);

        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
       
         
        isuzu = rs.getString("QUANTITY");
            
         }
        status = rs.next();
        }catch(Exception e){
           e.printStackTrace();
        }    
     return false;
    }
   
   public static boolean yamada(){
        PreparedStatement ps = null;
         boolean status = false;
        String total_sale = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("SELECT SUM(QUANTITY) as `TOTAL` FROM `sale_summary_stock` WHERE `BRAND` = 'YAMADA'");
        ps.setString(1, total_sale);

        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
       
         
        isuzu = rs.getString("QUANTITY");
            
         }
        status = rs.next();
        }catch(Exception e){
           e.printStackTrace();
        }    
     return false;
    }
}
