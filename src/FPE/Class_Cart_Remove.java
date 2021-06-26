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
 * @author Javinez
 */
public class Class_Cart_Remove {
PreparedStatement ps = null;
ResultSet rs = null;


public boolean Sales_Parts(String quantity,int id){
    try{ 

        ps = FPE_DB.getConnection().prepareStatement("UPDATE `summary_stock` SET `QUANTITY`=? WHERE `ID`=?");
        ps.setString(1, quantity);
        ps.setInt(2, id);
        ps.execute();
    }catch(Exception e){
        e.printStackTrace();
    }
    return false;
}

public boolean Updatecart(String quantity, String id){
    try{ 
        ps = FPE_DB.getConnection().prepareStatement("SELECT `SELLER PRICE` FROM `add_cart` WHERE `STOCK ID`='"+id+"'");
        rs = ps.executeQuery();
        if(rs.next()){
            String validQuantity = rs.getString("SELLER PRICE");
            int resultToUpdate = Integer.parseInt(quantity) * Integer.parseInt(validQuantity) ;
                ps = FPE_DB.getConnection().prepareStatement("UPDATE `add_cart` SET `QUANTITY`=?,`TOTAL PRICE`=? WHERE `STOCK ID`=?");
                ps.setString(1, quantity);
                ps.setInt(2, resultToUpdate);
                ps.setString(3, id);
                ps.execute();            
        }
    }catch(Exception e){
        e.printStackTrace();
    }
    return false;
}

public boolean UpdateSummary(String quantity, String id){
    
    try{ 
        ps = FPE_DB.getConnection().prepareStatement("SELECT `SELLER PRICE` FROM `sale_summary_stock` WHERE `STOCK ID`='"+id+"'");
        rs = ps.executeQuery();
        if(rs.next()){
            String validQuantity = rs.getString("SELLER PRICE");
            
            int resultToUpdate = Integer.parseInt(quantity) * Integer.parseInt(validQuantity) ;
                ps = FPE_DB.getConnection().prepareStatement("UPDATE `sale_summary_stock` SET `QUANTITY`=?,`TOTAL PRICE`=? WHERE `STOCK ID`=?");
                ps.setString(1, quantity);
                ps.setInt(2, resultToUpdate);
                ps.setString(3, id);
                ps.execute();
        }
    }catch(Exception e){
        e.printStackTrace();
    }
    return false;
}

public boolean quantityCartIsZero(String id){
    try{ 
        ps = FPE_DB.getConnection().prepareStatement("DELETE FROM `add_cart` WHERE `STOCK ID`=?");
        ps.setString(1, id);
        ps.execute();
    }catch(Exception e){
        e.printStackTrace();
    }
    return false;
}

public boolean quantitySaleSummaryIsZero(String id){
    try{ 
        ps = FPE_DB.getConnection().prepareStatement("DELETE FROM `sale_summary_stock` WHERE `STOCK ID`=?");
        ps.setString(1, id);
        ps.execute();
    }catch(Exception e){
        e.printStackTrace();
    }
    return false;
}

}
