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

        public static boolean Payment(String project_no, String customer_id,String customer_p_os,String po_dates,String qoutation_no,String qoutation_date,String loc,String agent_id,String total_amounts,String downpayment_amounts,String downpayment_cash_or_check, String downpayment_bank,String downpayment_date,String downpayment_or_no,String downpayment_remark,String balance_amounts, String balance_remark,String pro,String status){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `payment_menthod`(`PROJECT NO`, `CUSTOMER ID`, `CUSTOMER P O NO`, `P O DATE`, `QUOTATION NO`, `QUOTATION DATE`, `LOCATION`,`AGENT ID`, `TOTAL AMOUNT`, `DOWNPAYMENT`, `CASH / CHECK`, `BANK`, `DOWNPAYMENT DATE`, `O R NO`, `DOWNPAYMENT REMARKS`, `BALANCE`, `BALANCE REMARKS`,`PROCESS`,`STATUS`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,project_no);
        ps.setString(2,customer_id);
        ps.setString(3,customer_p_os);
        ps.setString(4,po_dates);
        ps.setString(5,qoutation_no);
        ps.setString(6,qoutation_date);
        ps.setString(7,loc);
        ps.setString(8,agent_id);
        ps.setString(9,total_amounts);
        ps.setString(10,downpayment_amounts);
        ps.setString(11,downpayment_cash_or_check);
        ps.setString(12,downpayment_bank);
        ps.setString(13,downpayment_date);
        ps.setString(14,downpayment_or_no);
        ps.setString(15,downpayment_remark);
        ps.setString(16,balance_amounts);
        ps.setString(17,balance_remark);
        ps.setString(18,pro);
        ps.setString(19,status);

        ps.execute();
        
        }catch(Exception e){
           e.printStackTrace();
        }        
        return false;
    }
    
    
 
    
    public static boolean Payment_Update_History(String cus_id,String date_rel,String proj_no,String process_no){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("UPDATE `history_table` SET `CUSTOMER ID`=?,`DATE OUTBOUND`=?,`VERIFY`=?, `PROJECT NO`=? WHERE `ACTION`='SALE' AND `PROCESS`=?");
        ps.setString(1,cus_id);
        ps.setString(2,date_rel);
        ps.setString(3,"DONE");
        ps.setString(4,proj_no);
        ps.setString(5,process_no);

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
    public static boolean Cart_Delete(){
        PreparedStatement ps = null;
        try{
        ps = FPE_DB.getConnection().prepareStatement("DELETE FROM `cart_table`");
        ps.execute();
        
        }catch(Exception e){
           e.printStackTrace();
        }
        return false;
    }
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
