/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Class_Cart {
        public static int process = 0;
        public static boolean InsertCart(String dateOut , String category, String brand, String model, String kva, String phasing, String type, String supplier_price,String seller_price, String engine_sn, String alternator_sn, String quantity,String supplier_id,String customer_id,String stock_id, byte[] pic, String amount,String balanced,String cash_checked,String bank,String or_no, String remarks,String status,String process_id){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `sale_summary_stock`(`DATE RELEASE`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, `SUPPLIER PRICE`, `SELLER PRICE`, `ENGINE S N`, `ALTERNATOR S N`, `QUANTITY`, `SUPPLIER ID`, `CUSTOMER ID`, `STOCK ID`, `IMAGE`,`AMOUNT`,`BALANCED`,`CASH_OR_CHECKED`,`BANKED`,`OR NO`,`REMARKS`, `STATUS`, `PROCESS`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,dateOut);
        ps.setString(2,category);
        ps.setString(3,brand);
        ps.setString(4,model);
        ps.setString(5,kva);
        ps.setString(6,phasing);
        ps.setString(7,type);
        ps.setString(8,supplier_price);
        ps.setString(9,seller_price);
        ps.setString(10,engine_sn);
        ps.setString(11,alternator_sn);
        ps.setString(12,quantity);
        ps.setString(13, supplier_id); 
        ps.setString(14, customer_id);
        ps.setString(15, stock_id);
        ps.setBytes(16,pic);
        ps.setString(17,amount);
        ps.setString(18,balanced);
        ps.setString(19,cash_checked);
        ps.setString(20,bank);
        ps.setString(21,or_no);
        ps.setString(22,remarks);
        ps.setString(23,status);
        ps.setString(24, process_id);
      
        
        ps.execute();
                                                                                                                                                                   //`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`
        }catch(Exception e){
           e.printStackTrace();
        }
    
    return false;
    }
    
   // ( UPDATE `summary_stock` SET `QUANTITY`="+update_quantity+" WHERE `ID` "+stock_id+")     
        
    public static boolean AddCart(String dateOut , String category, String brand, String model, String kva, String phasing, String type, String supplier_price,String seller_price, String engine_sn, String alternator_sn, String quantity,String supplier_id,String customer_id,String stock_id, byte[] pic,String status,String process_id){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `add_cart`(`DATE RELEASE`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, `SUPPLIER PRICE`, `SELLER PRICE`, `ENGINE S N`, `ALTERNATOR S N`, `QUANTITY`, `SUPPLIER ID`, `CUSTOMER ID`, `STOCK ID`, `IMAGE`, `STATUS`, `PROCESS`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,dateOut);
        ps.setString(2,category);
        ps.setString(3,brand);
        ps.setString(4,model);
        ps.setString(5,kva);
        ps.setString(6,phasing);
        ps.setString(7,type);
        ps.setString(8,supplier_price);
        ps.setString(9,seller_price);
        ps.setString(10,engine_sn);
        ps.setString(11,alternator_sn);
        ps.setString(12,quantity);
        ps.setString(13, supplier_id); 
        ps.setString(14, customer_id);
        ps.setString(15, stock_id);
        ps.setBytes(16,pic);
        ps.setString(17,status);
        ps.setString(18, process_id);
        
        ps.execute();
                                                                                                                                                                   //`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`
        }catch(Exception e){
           e.printStackTrace();
        }
    
    return false;
    }        
    public static boolean addCart(){
        PreparedStatement ps;
        ResultSet rs;
        try{
        ps=FPE_DB.getConnection().prepareStatement("SELECT `STATUS`,`PROCESS` FROM `sale_summary_stock` ORDER BY `ID` DESC LIMIT 1");
        rs = ps.executeQuery();
            if(rs.next()){
                // Database is not empty
                String process_count = rs.getString("PROCESS");
                String convert = Integer.toString(process);
                convert = process_count;
                int counted = Integer.parseInt(convert) + Integer.parseInt(process_count) - 1; // database
                
                if(rs.getString("STATUS").equals("")){
                    process = Integer.parseInt(convert);
                }
                else{
                    //process.setText(""+counted);
                    if(rs.getString("STATUS").equals("DONE")){ //its only update tapos na yung cart
                        int statusCart = Integer.parseInt(convert) + 1; // database
                        process = statusCart;
                    }
                    else{
                        process = counted; //eto hindi pa tapos yung cart process
                    }
                }
            }
            else{
                //empty database
                process = 1;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        } 
        return false;
    }

//       public static boolean updateQuantity_summaryStock (String dateOut , String category, String brand, String model, String kva, String phasing, String type, String supplier_price,String seller_price, String engine_sn, String alternator_sn, String quantity,String supplier_id,String customer_id,String stock_id, byte[] pic,String status,String process_id){
//        PreparedStatement ps = null;
//        try{
//        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `add_cart`(`DATE RELEASE`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, `SUPPLIER PRICE`, `SELLER PRICE`, `ENGINE S N`, `ALTERNATOR S N`, `QUANTITY`, `SUPPLIER ID`, `CUSTOMER ID`, `STOCK ID`, `IMAGE`, `STATUS`, `PROCESS`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
//        ps.setString(1,dateOut);
//        ps.setString(2,category);
//        ps.setString(3,brand);
//        ps.setString(4,model);
//        ps.setString(5,kva);
//        ps.setString(6,phasing);
//        ps.setString(7,type);
//        ps.setString(8,supplier_price);
//        ps.setString(9,seller_price);
//        ps.setString(10,engine_sn);
//        ps.setString(11,alternator_sn);
//        ps.setString(12,quantity);
//        ps.setString(13, supplier_id); 
//        ps.setString(14, customer_id);
//        ps.setString(15, stock_id);
//        ps.setBytes(16,pic);
//        ps.setString(17,status);
//        ps.setString(18, process_id);
//        
//        ps.execute();
//                                                                                                                                                                   //`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`
//        }catch(Exception e){
//           e.printStackTrace();
//        }
//    
//    return false;
//    } 

}
