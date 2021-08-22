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
public class Class_Balance {

    public static int balance;

    public static boolean Balance() {

        return false;
    }

    public static boolean BalancePayment(String project_no, String customer_id, String customer_p_os, String po_dates, String qoutation_no, String qoutation_date, String loc, String agent_id, String total_amounts, String downpayment_amounts, String downpayment_cash_or_check, String downpayment_bank, String downpayment_date, String downpayment_or_no, String downpayment_remark, String balance_amounts, String balance_remark, String pro, String status) {
        PreparedStatement ps = null;
        try {
            ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `payment_menthod`(`PROJECT NO`, `CUSTOMER ID`, `CUSTOMER P O NO`, `P O DATE`, `QUOTATION NO`, `QUOTATION DATE`, `LOCATION`,`AGENT ID`, `TOTAL AMOUNT`, `DOWNPAYMENT`, `CASH / CHECK`, `BANK`, `DOWNPAYMENT DATE`, `O R NO`, `DOWNPAYMENT REMARKS`, `BALANCE`, `BALANCE REMARKS`,`PROCESS`,`STATUS`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, project_no);
            ps.setString(2, customer_id);
            ps.setString(3, customer_p_os);
            ps.setString(4, po_dates);
            ps.setString(5, qoutation_no);
            ps.setString(6, qoutation_date);
            ps.setString(7, loc);
            ps.setString(8, agent_id);
            ps.setString(9, total_amounts);
            ps.setString(10, downpayment_amounts);
            ps.setString(11, downpayment_cash_or_check);
            ps.setString(12, downpayment_bank);
            ps.setString(13, downpayment_date);
            ps.setString(14, downpayment_or_no);
            ps.setString(15, downpayment_remark);
            ps.setString(16, balance_amounts);
            ps.setString(17, balance_remark);
            ps.setString(18, pro);
            ps.setString(19, status);

            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
    public static boolean UpdateBalancePayment(String balance,String project_no,int process_no1) {
        PreparedStatement ps = null;
        try {
            ps = FPE_DB.getConnection().prepareStatement("UPDATE `payment_menthod` SET `BALANCE`=? WHERE `PROJECT NO` AND `PROCESS`");
            ps.setString(1, project_no);
            ps.setString(2, balance);
            

            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
