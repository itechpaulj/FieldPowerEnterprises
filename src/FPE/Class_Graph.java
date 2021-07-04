/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import static FPE.Webpage.All_Stock_Table;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Class_Graph {

    public static String qweqweqwe =null;
    
   public static boolean AddSupplier(String quantity ){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("SELECT SUM(`QUANTITY`) FROM `summary_stock` WHERE `BRAND` = 'YANDONG'");
        ps.setString(1, qweqweqwe);
        
        ps.execute();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
     return false;
    }
}
