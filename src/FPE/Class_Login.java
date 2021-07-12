/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


 
public class Class_Login {
   public static String admin_name = "";
   public static String admin_id = "";
   public static String password = "";
   public static String register_user = "";
   
     public static boolean InsertAdmin(String em_id,String fn,String email,String user,String pass){
        PreparedStatement ps = null;
        try{
       
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `login`(`EMPLOYER ID`, `NAME`, `EMAIL`, `USERNAME`, `PASSWORD`) VALUES (?,?,?,?,?)");
        ps.setString(1,em_id);
        ps.setString(2,fn);
        ps.setString(3,email);
        ps.setString(4,user);
        ps.setString(5,pass);

        ps.execute();
        
        }catch(Exception e){
           e.printStackTrace();
        }
        
     return false;
    }
     
     public static boolean LoginAdmin(String user,String pass){
        PreparedStatement ps = null;
        boolean status = false;
        try{
       
        ps = FPE_DB.getConnection().prepareStatement("SELECT `ID`,`USERNAME`,`PASSWORD` FROM `login` WHERE `USERNAME` = ? and `PASSWORD` =?");
        ps.setString(1,user);
        ps.setString(2,pass);
        
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
       
        admin_id = rs.getString("ID");  
        admin_name = rs.getString("USERNAME");
         password = rs.getString("PASSWORD");       
         }
        status = rs.next();
        }catch(Exception e){
           e.printStackTrace();
        }   
     return false;
    }
     
          public static boolean RegisterLook(String user){
        PreparedStatement ps = null;
        boolean status = false;
        try{
       
        ps = FPE_DB.getConnection().prepareStatement("SELECT `USERNAME` FROM `login`  ");
        ps.setString(1,user);
        ps.setString(2,user);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
       
         
       register_user = rs.getString("USERNAME");
             
         }
        status = rs.next();
        }catch(Exception e){
           e.printStackTrace();
        }    
     return false;
    }
     
     public static boolean Register(String fn,String level,String user,String pass,String c_pass){
        PreparedStatement ps = null;
        try{
       
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `login`(`NAME`, `USER LEVEL`, `USERNAME`, `PASSWORD`, `CONFIRM PASSWORD`) VALUES (?,?,?,?,?)");
        ps.setString(1,fn);
        ps.setString(2,level);
        ps.setString(3,user);
        ps.setString(4,pass);
        ps.setString(5,c_pass);

        ps.execute();
        
        }catch(Exception e){
           e.printStackTrace();
        }
        
     return false;
    }
}
