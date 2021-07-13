/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.sql.PreparedStatement;




/**
 *
 * @author Javinez
 */
public class Class_Payment {
    
    // Insert payment
    /*
        proj_no
        total_amount
        cus_quotation
        d_amount
        d_remarks
        d_bank
        d_date
        cus_po
        cus_poDate
        cus_quotationDate
        cus_remarks
        b_amount
        total_amount
        getCashCheckedDownpayment
        cus_id
        agent_id
        status    
    */
    public boolean payment(String proj_no, String cus_quotation, String d_amount, String d_remarks, String d_bank, String d_date, String cus_po, String cus_poDate, String cus_quotationDate, String cus_remarks, String b_amount, String total_amount, String getCashCheckedDownpayment, String cus_id, String agent_id, String status){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `payment`(`PROJECT NO`, `QUOTATION NO`, `DOWNPAYMENT AMOUNT`, `DOWNPAYMENT REMARKS`, `BANK`, `DATE DOWNPAYMENT`, `CUSTOMER P.O`, `DATE CUSTOMER P.O`, `DATE QUOTATION`, `ADDITIONAL ITEMS`, `BALANCE AMOUNT`, `TOTAL AMOUNT`, `CASH CHECKED`, `CUSTOMER ID`, `AGENT ID`, `STATUS`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,proj_no);
        ps.setString(2,cus_quotation);
        ps.setString(3,d_amount);
        ps.setString(4,d_remarks);
        ps.setString(5,d_bank);
        ps.setString(6,d_date);
        ps.setString(7,cus_po);
        ps.setString(8,cus_poDate);
        ps.setString(9,cus_quotationDate);
        ps.setString(10,cus_remarks);
        ps.setString(11, b_amount);
        ps.setString(12, total_amount);
        ps.setString(13, getCashCheckedDownpayment);
        ps.setString(14, cus_id);
        ps.setString(15, agent_id);
        ps.setString(16, status);

        ps.execute();
        
        }catch(Exception e){
           e.printStackTrace();
        }        
        return false;
    }
    
    public boolean payment_update_historyTable(String cus_id,String proj_no,String process){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("UPDATE `history_table` SET `CUSTOMER ID`=?,`VERIFY`=?, `PROJECT NO`=? WHERE `PROCESS`=?");
        ps.setString(1,cus_id);
        ps.setString(2,"DONE");
        ps.setString(3,proj_no);
        ps.setString(4,process);

        ps.execute();
        
        }catch(Exception e){
           e.printStackTrace();
        }
        return false;
    } 

    public boolean payment_cartDelete(){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("DELETE FROM `cart_table`");
        ps.execute();
        }catch(Exception e){
           e.printStackTrace();
        }
        return false;
    }     
    
    
//    public boolean process_genset_summaryStock(String customer_id, String quotation,String orno,String remarks,String status,String process){
//        PreparedStatement ps = null;
//        /*
//        customer id
//        quotation
//        or no
//        remarks
//        status = "DONE"
//        */
//        try{
//        ps = FPE_DB.getConnection().prepareStatement("UPDATE `sale_summary_stock` SET `CUSTOMER ID`=?,`QUOTATION`=?,`OR NO`=?,`REMARKS`,`STATUS`=? WHERE `PROCESS`=?");
//     
//        ps.setString(1,customer_id);
//        ps.setString(2,quotation);
//        ps.setString(3,orno);
//        ps.setString(4,remarks);
//        ps.setString(5,status);
//        ps.setString(6,process);
//        ps.execute();
//        
//        }catch(Exception e){
//           e.printStackTrace();
//        }
//        return false;
//    }
//  
//    public boolean process_genset_addCart(String customer_id,String quotation,String orno,String status,String process){
//        PreparedStatement ps = null;
//        try{
//        ps = FPE_DB.getConnection().prepareStatement("UPDATE `add_cart` SET `CUSTOMER ID`=?,`QUOTATION`=?,`OR NO`=?, `STATUS`=? WHERE `PROCESS`=?");
//        ps.setString(1,customer_id);
//        ps.setString(2,quotation);
//        ps.setString(3,orno);
//        ps.setString(4,status);
//        ps.setString(5,process);
//
//        ps.execute();
//        
//        }catch(Exception e){
//           e.printStackTrace();
//        }
//        return false;
//    }    
//    
//    public boolean process_customer_info(String cus_name, String cus_add, String cus_contact, String cus_po, String cus_poDate, String cus_quotation,String cus_quotationDate, String orno,String agent_name,String agent_contact,String cus_remarks){
//        PreparedStatement ps = null;
//        try{
//        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `customer_info`(`CUSTOMER NAME`, `CUSTOMER ADDRESS`,`CUSTOMER CONTACT`, `CUSTOMER P O`, `CUSTOMER PO DATE`, `CUSTOMER QUOTATION`, `CUSTOMER QUOTATION DATE`, `CUSTOMER OR N O`, `AGENT NAME`, `AGENT CONTACT`,`REMARKS`) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
//        ps.setString(1,cus_name);
//        ps.setString(2,cus_add);
//        ps.setString(3,cus_contact);
//        ps.setString(4,cus_po);
//        ps.setString(5,cus_poDate);
//        ps.setString(6,cus_quotation);
//        ps.setString(7,cus_quotationDate);
//        ps.setString(8,orno);
//        ps.setString(9,agent_name);
//        ps.setString(10,agent_contact);
//        ps.setString(11,cus_remarks);
//
//        ps.execute();
//        
//        }catch(Exception e){
//           e.printStackTrace();
//        }
//        return false;
//    }
//    
//    
//    public boolean process_downpayment(String d_amount, String d_cashChecked, String d_bank, String d_date, String d_orno, String c_quot){
//        PreparedStatement ps = null;
//        try{
//        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `downpayment`(`AMOUNT`, `CASH CHECKED`, `BANK`, `DATE`, `OR NO`, `QUOTATION`) VALUES (?,?,?,?,?,?)");
//        ps.setString(1,d_amount);
//        ps.setString(2,d_cashChecked);
//        ps.setString(3,d_bank);
//        ps.setString(4,d_date);
//        ps.setString(5,d_orno);
//        ps.setString(6,c_quot);
//
//        ps.execute();
//        
//        }catch(Exception e){
//           e.printStackTrace();
//        }
//        return false;
//    }
//
//    public boolean process_balanced(String b_amount, String b_cashChecked, String b_bank, String b_date, String b_orno, String c_quot){
//        PreparedStatement ps = null;
//        try{
//        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `balanced`(`AMOUNT`, `CASH CHECKED`, `BANK`, `DATE`, `OR NO`, `QUOTATION`) VALUES (?,?,?,?,?,?)");
//        ps.setString(1,b_amount);
//        ps.setString(2,b_cashChecked);
//        ps.setString(3,b_bank);
//        ps.setString(4,b_date);
//        ps.setString(5,b_orno);
//        ps.setString(6,c_quot);
//
//        ps.execute();
//        
//        }catch(Exception e){
//           e.printStackTrace();
//        }
//        return false;
//    }    
//    
//    
//    //delete all cart
//    public boolean process_cart_delete(){
//        PreparedStatement ps = null;
//        try{
//        ps = FPE_DB.getConnection().prepareStatement("DELETE FROM `add_cart`");
//        ps.execute();
//        
//        }catch(Exception e){
//           e.printStackTrace();
//        }
//        return false;
//    }
//    
//    public boolean updateProcess(String cus_id,String quotation,String orno,String completed,String process){
//        
//        PreparedStatement ps = null;
//        try{
//        ps = FPE_DB.getConnection().prepareStatement("UPDATE `sale_summary_stock` SET `CUSTOMER ID`=?, `QUOTATION`=?, `OR NO`=?, `COMPLETED`=?, `STATUS`=? WHERE `PROCESS`=?");
//        ps.setString(1,cus_id);
//        ps.setString(2,quotation);
//        ps.setString(3,orno);
//        ps.setString(4,completed);
//        ps.setString(5,"DONE");
//        ps.setString(6,process);
//
//        ps.execute();
//        
//        }catch(Exception e){
//           e.printStackTrace();
//        }        
//        return false;
//    }
//    

}
