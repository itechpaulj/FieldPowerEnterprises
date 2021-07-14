/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Class_Graph {

    public static int yandong = 0;
    public static int isuzu = 0;
    public static int perkins = 0;
    public static int cummins = 0;
    public static int weifang = 0;
    public static int yamada = 0;
    
    
   public static boolean isuzu( ){
        PreparedStatement ps = null;
         boolean status = false;
        int total_sale = 0;
        try{
        ps = FPE_DB.getConnection().prepareStatement("SELECT SUM(`QUANTITY`) AS `QUANTITY` FROM `history_table` WHERE `BRAND`='YANDONG'");
     

        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
       
         
        isuzu = rs.getInt("QUANTITY");
            
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
        int total_sale = 0;
        try{
        ps = FPE_DB.getConnection().prepareStatement("SELECT SUM(`QUANTITY`) AS `QUANTITY` FROM `history_table` WHERE `BRAND`='YANDONG'");
        

        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
       
         
        yandong = rs.getInt("QUANTITY");
            
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
        int total_sale = 0;
        try{
        ps = FPE_DB.getConnection().prepareStatement("SELECT SUM(`QUANTITY`) AS `QUANTITY` FROM `history_table` WHERE `BRAND`='PERKINS'");
     

        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
       
         
        perkins = rs.getInt("QUANTITY");
            
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
        int total_sale = 0;
        try{
        ps = FPE_DB.getConnection().prepareStatement("SELECT SUM(`QUANTITY`) AS `QUANTITY` FROM `history_table` WHERE `BRAND`='CUMMINS'");
       

        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
       
         
        cummins = rs.getInt("QUANTITY");
            
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
        int total_sale = 0;
        try{
        ps = FPE_DB.getConnection().prepareStatement("SELECT SUM(`QUANTITY`) AS `QUANTITY` FROM `history_table` WHERE `BRAND`='WEIFANG'");
       

        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
       
         
        weifang = rs.getInt("QUANTITY");
            
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
        int total_sale = 0;
        try{
        ps = FPE_DB.getConnection().prepareStatement("SELECT SUM(`QUANTITY`) AS `QUANTITY` FROM `history_table` WHERE `BRAND`='YAMADA'");
        

        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
       
         
        yamada = rs.getInt("QUANTITY");
            
         }
        status = rs.next();
        }catch(Exception e){
           e.printStackTrace();
        }    
     return false;
    }
}
