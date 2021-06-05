/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import static FPE.Mainpage.Stock_Filter_Table;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class Class_Graph {
   public static int yandong;
   public static int isuzu;
   public static int cummins;
   public static int perkins;
   public static int other;
   
   public static int filter;
   public static int parts;
   
    public static boolean yandong(){

     try{PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT COUNT(`BRAND`) as `COUNT` FROM `history_genset_table` WHERE `BRAND`= 'YANDONG' ");
     ResultSet rs = ps.executeQuery();
         while(rs.next()){
         yandong = rs.getInt("COUNT");         
         }
         }catch(Exception e){
         e.printStackTrace();
         }
     return true;
    }
    
    public static boolean isuzu(){

     try{PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT COUNT(`BRAND`) as `COUNT` FROM `history_genset_table` WHERE `BRAND`= 'ISUZU' ");
     ResultSet rs = ps.executeQuery();
         while(rs.next()){
         isuzu = rs.getInt("COUNT");         
         }
         }catch(Exception e){
         e.printStackTrace();
         }
     return true;
    }
    public static boolean cummins(){

     try{PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT COUNT(`BRAND`) as `COUNT` FROM `history_genset_table` WHERE `BRAND`= 'CUMMINS' ");
     ResultSet rs = ps.executeQuery();
         while(rs.next()){
         cummins = rs.getInt("COUNT");         
         }
         }catch(Exception e){
         e.printStackTrace();
         }
     return true;
    }
    public static boolean perkins(){

     try{PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT COUNT(`BRAND`) as `COUNT` FROM `history_genset_table` WHERE `BRAND`= 'PERKINS' ");
     ResultSet rs = ps.executeQuery();
         while(rs.next()){
         perkins = rs.getInt("COUNT");         
         }
         }catch(Exception e){
         e.printStackTrace();
         }
     return true;
    }
    
     public static boolean GensetOther(){

     try{PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT COUNT(`BRAND`) as `COUNT` FROM `history_genset_table` WHERE `BRAND` LIKE '%OTHER BRAND%' ");
     ResultSet rs = ps.executeQuery();
         while(rs.next()){
         other = rs.getInt("COUNT");         
         }
         }catch(Exception e){
         e.printStackTrace();
         }
     return true;
    }
     
    public static boolean Filter(){

     try{PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT COUNT(`TYPE`) as COUNT FROM `history_filter` WHERE `TYPE`= 'FILTER'");
     ResultSet rs = ps.executeQuery();
         while(rs.next()){
         filter = rs.getInt("COUNT");         
         }
         }catch(Exception e){
         e.printStackTrace();
         }
     return true;
    }
        
     public static boolean Parts(){

     try{PreparedStatement ps=FPE_DB.getConnection().prepareStatement("SELECT COUNT(`TYPE`) as COUNT FROM `history_filter` WHERE `TYPE`= 'PARTS' ");
     ResultSet rs = ps.executeQuery();
         while(rs.next()){
         parts = rs.getInt("COUNT");         
         }
         }catch(Exception e){
         e.printStackTrace();
         }
     return true;
    }
     
     
 
}
