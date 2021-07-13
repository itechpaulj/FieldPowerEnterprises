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

        public static boolean InsertCart(String stock_id,String category,String brand,String model,String kva,String phasing,String type,String supplier_price,String seller_price,String quantity,int total_price,String engine,String alternator,String supplier_id,String date_inbound,String date_outbound,byte [] image,String incharge,String remarks,String process,String verify){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `cart_table`(`STOCK ID`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, `SUPPLIER PRICE`, `SELLER PRICE`, `QUANTITY`, `TOTAL PRICE`, `ENGINE S.N`, `ALTERNATOR S.N`, `SUPPLIER ID`, `DATE INBOUND`, `DATE OUTBOUND`, `IMAGE`, `INCHARGE`, `REMARKS`, `PROCESS`, `VERIFY`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        
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
        ps.setString(15, date_inbound);
        ps.setString(16, date_outbound);  // 2
        ps.setBytes(17, image);
        ps.setString(18, incharge);
        ps.setString(19, remarks);
        ps.setString(20,process); // 3
        ps.setString(21,verify);  // 4
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
        ps=FPE_DB.getConnection().prepareStatement("SELECT `PROCESS`, `VERIFY` FROM `history_table` ORDER BY `ID` DESC LIMIT 1");
        rs = ps.executeQuery();
            if(rs.next()){
                // Database is not empty
                String process_count = rs.getString("PROCESS");
                String convert = Integer.toString(process);
                convert = process_count;
                int counted = Integer.parseInt(convert) + Integer.parseInt(process_count) - 1; // database
                
                if(rs.getString("VERIFY").equals("")){
                    process = Integer.parseInt(convert);
                }
                else{
                    //process.setText(""+counted);
                    if(rs.getString("VERIFY").equals("DONE")){ //its only update tapos na yung cart
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
        
        
        
// basura code======
// ( UPDATE `summary_stock` SET `QUANTITY`="+update_quantity+" WHERE `ID` "+stock_id+")     
        
//     public static boolean AddCart(String dateOut , String category, String brand, String model, String kva, String phasing, String type, String supplier_price,String seller_price, String engine_sn, String alternator_sn, String quantity, int total_price,String person_in_charge, String supplier_id,String customer_id,String stock_id, byte[] pic, String quotation,String orno,String status,String process_id){
//        PreparedStatement ps = null;
//        try{
//        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `add_cart`(`DATE RELEASE`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, `SUPPLIER PRICE`, `SELLER PRICE`, `ENGINE S N`, `ALTERNATOR S N`, `QUANTITY`, `TOTAL PRICE`, `PERSON IN CHARGE`,`SUPPLIER ID`, `CUSTOMER ID`, `STOCK ID`, `IMAGE`,`QUOTATION`,`OR NO`,`STATUS`, `PROCESS`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
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
//        ps.setInt(13,total_price);
//        ps.setString(14, person_in_charge); 
//        ps.setString(15, supplier_id); 
//        ps.setString(16, customer_id);
//        ps.setString(17, stock_id);
//        ps.setBytes(18,pic);
//        ps.setString(19,quotation);
//        ps.setString(20,orno);
//        ps.setString(21,status);
//        ps.setString(22, process_id);
//        
//        ps.execute();
//                                                                                                                                                                   //`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`
//        }catch(Exception e){
//           e.printStackTrace();
//        }
//    
//    return false;
//    }
//    
//    public static boolean addCart(){
//        PreparedStatement ps;
//        ResultSet rs;
//        try{
//        ps=FPE_DB.getConnection().prepareStatement("SELECT `STATUS`,`PROCESS` FROM `sale_summary_stock` ORDER BY `ID` DESC LIMIT 1");
//        rs = ps.executeQuery();
//            if(rs.next()){
//                // Database is not empty
//                String process_count = rs.getString("PROCESS");
//                String convert = Integer.toString(process);
//                convert = process_count;
//                int counted = Integer.parseInt(convert) + Integer.parseInt(process_count) - 1; // database
//                
//                if(rs.getString("STATUS").equals("")){
//                    process = Integer.parseInt(convert);
//                }
//                else{
//                    //process.setText(""+counted);
//                    if(rs.getString("STATUS").equals("DONE")){ //its only update tapos na yung cart
//                        int statusCart = Integer.parseInt(convert) + 1; // database
//                        process = statusCart;
//                    }
//                    else{
//                        process = counted; //eto hindi pa tapos yung cart process
//                    }
//                }
//            }
//            else{
//                //empty database
//                process = 1;
//            }
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        } 
//        return false;
//    }
//    
//    public static boolean summary_StockUpdateQuantity(String quantity ,String id){
//        PreparedStatement ps = null;
//        try{
//        ps = FPE_DB.getConnection().prepareStatement("UPDATE `summary_stock` SET `QUANTITY`=? WHERE `ID`=?");
//        ps.setString(1,quantity);
//        ps.setString(2,id);
//
//        ps.execute();
//                                                                                                                                                                   //`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`
//        }catch(Exception e){
//           e.printStackTrace();
//        }
//    
//    return false;
//    }
//
//    public static boolean existCartToUpdateQuantity(String quantity , int total_price,String id){
//        PreparedStatement ps = null;
//        try{
//        ps = FPE_DB.getConnection().prepareStatement("UPDATE `add_cart` SET `QUANTITY`=?,`TOTAL PRICE`=? WHERE `STOCK ID`=?");
//        ps.setString(1,quantity);
//        ps.setInt(2,total_price);
//        ps.setString(3,id);
//
//        ps.execute();
//                                                                                                                                                                   //`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`
//        }catch(Exception e){
//           e.printStackTrace();
//        }
//    
//    return false;
//    }
//    
//    public static boolean existRequestToUpdateQuantity(String quantity , int total_price,String id){
//        PreparedStatement ps = null;
//        try{
//        ps = FPE_DB.getConnection().prepareStatement("UPDATE `request_cart` SET `QUANTITY`=?,`TOTAL PRICE`=? WHERE `STOCK ID`=?");
//        ps.setString(1,quantity);
//        ps.setInt(2,total_price);
//        ps.setString(3,id);
//
//        ps.execute();
//                                                                                                                                                                   //`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`
//        }catch(Exception e){
//           e.printStackTrace();
//        }
//    
//    return false;
//    }    
//    
//    public static boolean existSale_Summary_stockToUpdateQuantity(String quantity ,int total_price, String id){
//        PreparedStatement ps = null;
//        try{
//        ps = FPE_DB.getConnection().prepareStatement("UPDATE `sale_summary_stock` SET `QUANTITY`=?,`TOTAL PRICE`=? WHERE `STOCK ID`=?");
//        ps.setString(1,quantity);
//        ps.setInt(2,total_price);
//        ps.setString(3,id);
//
//        ps.execute();
//                                                                                                                                                                   //`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`
//        }catch(Exception e){
//           e.printStackTrace();
//        }
//    
//        return false;
//    }
//
//     public static boolean AddCartRequest(String dateOut , String category, String brand, String model, String kva, String phasing, String type, String supplier_price,String seller_price, String engine_sn, String alternator_sn, String quantity, int total_price,String person_in_charge, String supplier_id,String customer_id,String stock_id, byte[] pic, String quotation,String orno,String status,String process_id){
//        PreparedStatement ps = null;
//        try{
//        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `request_cart`(`DATE RELEASE`, `CATEGORY`, `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`, `SUPPLIER PRICE`, `SELLER PRICE`, `ENGINE S N`, `ALTERNATOR S N`, `QUANTITY`, `TOTAL PRICE`, `PERSON IN CHARGE`,`SUPPLIER ID`, `CUSTOMER ID`, `STOCK ID`, `IMAGE`,`QUOTATION`,`OR NO`,`STATUS`, `PROCESS`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
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
//        ps.setInt(13,total_price);
//        ps.setString(14, person_in_charge); 
//        ps.setString(15, supplier_id); 
//        ps.setString(16, customer_id);
//        ps.setString(17, stock_id);
//        ps.setBytes(18,pic);
//        ps.setString(19,quotation);
//        ps.setString(20,orno);
//        ps.setString(21,status);
//        ps.setString(22, process_id);
//        
//        ps.execute();
//                                                                                                                                                                   //`ENERGIZED DATE`, `TANK CAPACITY`, `OIL USAGE`, `TECHNICIAN`, `UPDATED AT`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`
//        }catch(Exception e){
//           e.printStackTrace();
//        }
//    
//    return false;
//    }
//    


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
