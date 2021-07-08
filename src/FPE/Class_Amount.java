/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Robles
 */
public class Class_Amount {

    
       public static boolean Amount(){
           
        PreparedStatement ps = null;
        boolean status = false;
        int total = 0;
        try{
        ps = FPE_DB.getConnection().prepareStatement("SELECT SUM(`TOTAL PRICE`) AS `TOTAL PRICE` FROM `cart_table`");


        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
        total = rs.getInt("TOTAL PRICE");
        Webpage.total_amount.setText(""+total);
        }
        
        status = rs.next();
        }catch(Exception e){
           e.printStackTrace();
        }    
     return false;
    }
}
