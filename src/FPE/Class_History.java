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
public class Class_History {



public static boolean InsertHistory(String stock_id,String category,String brand,String model,String kva,String phasing,String type,String supplier_price,String seller_price,String quantity,int total_price,String engine,String alternator,String supplier_id,String customer_id,String date_inbound,String date_outbound,byte [] image,String incharge,String remarks,String process,String verify,String project,String action){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `history_table`(`STOCK ID`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, `SUPPLIER PRICE`, `SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`, `ENGINE S.N`, `ALTERNATOR S.N`, `SUPPLIER ID`, `CUSTOMER ID`, `DATE INBOUND`, `DATE OUTBOUND`, `IMAGE`, `INCHARGE`, `REMARKS`, `PROCESS`, `VERIFY`, `PROJECT NO`,`ACTION`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        
       
        ps.setString(1,stock_id); // 1
        ps.setString(2,category);
        ps.setString(3,brand);
        ps.setString(4,model);
        ps.setString(5,kva);
        ps.setString(6,phasing);
        ps.setString(7,type);
        ps.setString(8,supplier_price);
        ps.setString(9,seller_price);
        ps.setString(10,quantity);
        ps.setInt(11,total_price);
        ps.setString(12,engine);
        ps.setString(13,alternator);
        ps.setString(14, supplier_id);
        ps.setString(15, customer_id); // 2
        ps.setString(16, date_inbound);
        ps.setString(17, date_outbound);  // 3
        ps.setBytes(18, image);
        ps.setString(19, incharge);
        ps.setString(20, remarks);
        ps.setString(21,process); // 4
        ps.setString(22,verify);  // 5
        ps.setString(23, project); // 6
        ps.setString(24,action);
        ps.execute();
                                                                                                                                                                   //`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`
        }catch(Exception e){
           e.printStackTrace();
        }
    
    return false;
    }

}
