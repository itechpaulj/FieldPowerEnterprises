/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.sql.PreparedStatement;

/**
 *
 * @author Robles
 */
public class Class_Request {
    
        public static boolean Request(String srs_no,String name,String date,String store_keeper,String purpose,String approve,String encode,String account_charge ){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `request_table`(`SRS NO`, `NAME`, `DATE`, `STORE KEEPER`, `PURPOSE`, `APPROVE BY`, `ENCODE BY`, `ACCOUNT CHARGE`) VALUES (?,?,?,?,?,?,?,?)");
        ps.setString(1,srs_no);
        ps.setString(2,name);
        ps.setString(3,date);
        ps.setString(4,store_keeper);
        ps.setString(5,purpose);
        ps.setString(6,approve);
        ps.setString(7,encode);
        ps.setString(8,account_charge);
        ps.execute();
        
        }catch(Exception e){
           e.printStackTrace();
        }
        return false;
        }
        
        public static boolean Request_Update_History(String date_rel,String proj_no,String process_no){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("UPDATE `history_table` SET `DATE OUTBOUND`=?,`VERIFY`=?, `PROJECT NO`=? WHERE `ACTION`='FULLOUT' AND `PROCESS`=?");
        
        ps.setString(1,date_rel);
        ps.setString(2,"DONE");
        ps.setString(3,proj_no);
        ps.setString(4,process_no);

        ps.execute();
        
        }catch(Exception e){
           e.printStackTrace();
        }
        return false;
    } 
}
