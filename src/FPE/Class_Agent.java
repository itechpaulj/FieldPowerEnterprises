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
 * @author Robles
 */
public class Class_Agent {
        public static boolean AddAgent(String name,String address,String contact, String com){
        PreparedStatement ps = null;
        try{
            ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `agent_table`(`NAME`, `ADDRESS`,`CONTACT`,`COMPANY`) VALUES (?,?,?,?)");
            ps.setString(1, name);
            ps.setString(2, address);  
            ps.setString(3, contact);
            ps.setString(4, com);
            ps.execute();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
        return false;
        }
        
        public static boolean UpdateAgent(String name,String address,String contact, String com,String id){
        PreparedStatement ps = null;
        try{
            ps = FPE_DB.getConnection().prepareStatement("UPDATE `agent_table` SET `NAME`=?,`ADDRESS`=?,`CONTACT`=?,`COMPANY`=? WHERE `ID`=?");
            ps.setString(1, name);
            ps.setString(2, address);  
            ps.setString(3, contact);
            ps.setString(4, com);
            ps.setString(5, id);
            ps.execute();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
        return false;
        }

        public static boolean DeleteAgent(String id){
        PreparedStatement ps = null;
        try{
            ps = FPE_DB.getConnection().prepareStatement("DELETE FROM `agent_table` WHERE `ID`=?");
           
            ps.setString(1, id);
            ps.execute();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
        return false;
        }
}
