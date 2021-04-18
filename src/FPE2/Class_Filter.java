/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE2;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author ROBLES
 */
public class Class_Filter {
    public static boolean AddFilter(String date,String names,String des,String brand,String type,String price,String quantity){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `filter_table`(`BRAND`, `NAME`, `DESCRIPTION`, `QUANTIITY`, `PRICE`, `DATE`, `TYPE`) VALUES (?,?,?,?,?,?,?)");
        ps.setString(1,brand);
        ps.setString(2,names);
        ps.setString(3,des);
        ps.setString(4,quantity);
        ps.setString(5,price);
        ps.setString(6,date);
        ps.setString(7,type);
        
        ps.execute();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
}
